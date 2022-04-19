package com.fc.controller;

import com.fc.entity.MessageBoardWithBLOBs;
import com.fc.service.MessageBoardService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("msgboard")
public class MessageBoardController {
    @Autowired
    private MessageBoardService messageBoardService;

    //查询信息
    @GetMapping("getlist")
    public ResultVO getList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                            Long id) {
        return messageBoardService.getList(pageNum, pageSize, id);
    }

    //添加信息
    @PostMapping("add")
    public ResultVO add(@RequestBody MessageBoardWithBLOBs messageBoard) {
        return messageBoardService.add(messageBoard);
    }

    //修改信息
    @PostMapping("update")
    public ResultVO update(@RequestBody MessageBoardWithBLOBs messageBoard) {
        return messageBoardService.update(messageBoard);
    }

    //删除信息
    @GetMapping("delete")
    public ResultVO delete(Long id) {
        return messageBoardService.delete(id);
    }
}
