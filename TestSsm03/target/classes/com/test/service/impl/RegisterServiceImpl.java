package com.test.service.impl;

import com.test.dao.RegisterMapper;
import com.test.pojo.Register;
import com.test.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @Auther: lijinhe
 * @Date: 2020/10/31 23:19
 * @Description:
 */

@Service
public class RegisterServiceImpl implements RegisterService {


    @Autowired
    private RegisterMapper registerMapper;


    public Register register(String username, String password) {
        Register register = registerMapper.register(username,password);
        return register;
    }
}
