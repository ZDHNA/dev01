package com.fc.controller;
import com.fc.entity.VolunteerRecruitment;
import com.fc.service.VolunteerRecruitmentService;
import com.fc.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("volunteer")
public class VolunteerController {

    @Autowired
    private VolunteerRecruitmentService volunteerRecruitmentService;

    //查询信息
    @GetMapping("getlist")
    public ResultVO getList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                            @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize,
                            Long id) {
        return volunteerRecruitmentService.getList(pageNum, pageSize, id);
    }

    //添加信息
    @PostMapping("add")
    public ResultVO add(@RequestBody VolunteerRecruitment volunteerRecruitment) {
        return volunteerRecruitmentService.add(volunteerRecruitment);
    }

    //修改信息
    @PostMapping("update")
    public ResultVO update(@RequestBody VolunteerRecruitment volunteerRecruitment) {
        return volunteerRecruitmentService.update(volunteerRecruitment);
    }

    //删除信息
    @GetMapping("delete")
    public ResultVO delete(Long id) {
        return volunteerRecruitmentService.delete(id);
    }

    @PostMapping("click")
    public ResultVO click(VolunteerRecruitment volunteerRecruitment){
        return volunteerRecruitmentService.click(volunteerRecruitment.getId(),volunteerRecruitment.getLastClickTime());
    }
}
