package com.xglong.mybatis.generator.mapper;

import com.xglong.mybatis.generator.model.Role;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RoleMapper {
    int deleteByPrimaryKey(Long roleId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long roleId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}