package com.fc.service;

import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.vo.ResultVO;
import org.springframework.stereotype.Service;

@Service
public interface MessageBoardService {
    ResultVO getList(Integer pageNum, Integer pageSize, Long id);

    ResultVO add(MessageBoardWithBLOBs messageBoard);

    ResultVO update(MessageBoardWithBLOBs messageBoard);

    ResultVO delete(Long id);

}
