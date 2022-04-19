package com.fc.service.impl;

import com.fc.dao.MessageBoardMapper;
import com.fc.entity.MessageBoard;
import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.service.MessageBoardService;
import com.fc.vo.DataVO;
import com.fc.vo.ResultVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MessageBoardServiceImpl implements MessageBoardService {

    @Autowired
    private MessageBoardMapper messageBoardMapper;

    @Override
    public ResultVO getList(Integer pageNum, Integer pageSize, Long id) {
        List<MessageBoard> messageBoards;

        ResultVO resultVO;

        try {
            if (id==null){
                PageHelper.startPage(pageNum,pageSize);
                messageBoards=messageBoardMapper.selectByExample(null);
            }else {
                MessageBoard messageBoard=messageBoardMapper.selectByPrimaryKey(id);
                messageBoards=new ArrayList<>();
                messageBoards.add(messageBoard);
            }
            PageInfo<MessageBoard> pageInfo = new PageInfo<>(messageBoards);
            DataVO<MessageBoard> dataVO = new DataVO<>(pageInfo.getTotal(), messageBoards, pageNum, pageSize);
            resultVO=new ResultVO(200,"OK",true,dataVO);
        }catch (Exception e){
            resultVO=new ResultVO(-1,"fail",false,null);
        }
        return resultVO;
    }

    @Override
    public ResultVO add(MessageBoardWithBLOBs messageBoard) {
        if (messageBoard.getCreateTime()==null){
            messageBoard.setCreateTime(new Date());
        }
        int affectedRows=messageBoardMapper.insertSelective(messageBoard);
        ResultVO resultVO;
        if (affectedRows>0){
            resultVO=new ResultVO(200,"ok",true,messageBoard);
        }else{
            resultVO=new ResultVO(-100,"fail",false,null);
        }
        return resultVO;
    }

    @Override
    public ResultVO update(MessageBoardWithBLOBs messageBoard) {
        int affectedRows = messageBoardMapper.updateByPrimaryKeySelective(messageBoard);

        ResultVO resultVO;
        if (affectedRows>0){
            MessageBoard result = messageBoardMapper.selectByPrimaryKey(messageBoard.getId());

            resultVO=new ResultVO(200,"ok",true,result);
        }else{
            resultVO=new ResultVO(-100,"fail",false,null);

        }
        return resultVO;
    }

    @Override
    public ResultVO delete(Long id) {
        int affectedRows = messageBoardMapper.deleteByPrimaryKey(id);
        ResultVO resultVO;
        if (affectedRows>0){
            resultVO=new ResultVO(200,"ok",true,null);
        }else{
            resultVO=new ResultVO(-100,"fail",false,null);
        }
        return resultVO;
    }
}
