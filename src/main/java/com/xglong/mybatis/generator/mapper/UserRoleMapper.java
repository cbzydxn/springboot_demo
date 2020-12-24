package com.xglong.mybatis.generator.mapper;

import com.xglong.mybatis.generator.model.UserRoleKey;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserRoleMapper {
    int deleteByPrimaryKey(UserRoleKey key);

    int insert(UserRoleKey record);

    int insertSelective(UserRoleKey record);
}