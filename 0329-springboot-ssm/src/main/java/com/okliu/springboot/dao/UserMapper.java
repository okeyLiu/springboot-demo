package com.okliu.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.okliu.springboot.entity.User;

//声明是一个Mapper,与springbootApplication中的@MapperScan二选一写上即可
@Mapper     
@Repository
public interface UserMapper {
    User selectUserByName(String name);
}