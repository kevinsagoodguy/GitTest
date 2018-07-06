package com.kevin.myblog.mapper;

import com.kevin.myblog.entity.SortInfo;
import com.kevin.myblog.entity.SortInfoExample;
import java.util.List;

public interface SortInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SortInfo record);

    int insertSelective(SortInfo record);

    List<SortInfo> selectByExample(SortInfoExample example);

    SortInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SortInfo record);

    int updateByPrimaryKey(SortInfo record);
}