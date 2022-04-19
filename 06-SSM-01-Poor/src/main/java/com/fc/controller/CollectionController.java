package com.fc.controller;

import com.fc.entity.Collection;
import com.fc.entity.User;
import com.fc.service.CollectionService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//收藏管理
@RestController
@RequestMapping("collection")
public class CollectionController {
    @Autowired
    private CollectionService collectionService;

    @RequestMapping("getlist")
    public ResultVO getList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                            Long id) {
        return collectionService.getList(pageNum, pageSize, id);
    }

    @RequestMapping("add")
    public ResultVO add(@RequestBody Collection collection) {
        return collectionService.add(collection);
    }

    @RequestMapping("update")
    public ResultVO update(@RequestBody Collection collection) {
        return collectionService.update(collection);
    }

    @RequestMapping("delete")
    public ResultVO delete(Long id) {
        return collectionService.delete(id);
    }
}
