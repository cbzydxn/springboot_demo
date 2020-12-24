package com.xglong.mybatis.generator.mapper;

import com.xglong.mybatis.generator.model.Role;
import com.xglong.mybatis.generator.model.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface UserMapper {

    List<Role> getUsers(Integer id);

    int deleteByPrimaryKey(Long userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User user);
}