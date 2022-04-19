package com.fc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("music")
public class TbMusicController {
    @RequestMapping("findAll")
    public List<String>  findAll() {
        ArrayList<String> list = new ArrayList<>();
        list.add("烤土豆");
        list.add("烤土豆");
        list.add("烤土豆");
    return  list;
    }
}
