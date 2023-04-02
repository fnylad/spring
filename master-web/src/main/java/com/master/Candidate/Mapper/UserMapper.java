package com.master.Candidate.Mapper;


import com.master.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user where phone=#{phone}")
    List<User> queryUserByPhone(String phone);
}
 