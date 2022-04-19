package com.fc.dao;

import com.fc.entity.TAccount;
import com.fc.entity.TAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAccountMapper {
    long countByExample(TAccountExample example);

    int deleteByExample(TAccountExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(TAccount record);

    int insertSelective(TAccount record);

    List<TAccount> selectByExample(TAccountExample example);

    TAccount selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") TAccount record, @Param("example") TAccountExample example);

    int updateByExample(@Param("record") TAccount record, @Param("example") TAccountExample example);

    int updateByPrimaryKeySelective(TAccount record);

    int updateByPrimaryKey(TAccount record);
}