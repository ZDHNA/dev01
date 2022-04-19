package com.fc.service;

import com.fc.entity.VolunteerRecruitment;
import com.fc.vo.ResultVO;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface VolunteerRecruitmentService {
    ResultVO getList(Integer pageNum, Integer pageSize, Long id);

    ResultVO add(VolunteerRecruitment volunteerRecruitment);

    ResultVO update(VolunteerRecruitment volunteerRecruitment);

    ResultVO delete(Long id);

    ResultVO click(Long id, Date lastClickTime);

}
