package com.test.dao;

import com.test.pojo.Register;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;


public interface RegisterMapper {

    public  Register register(@Param("username") String username, @Param("password") String password) ;
}
