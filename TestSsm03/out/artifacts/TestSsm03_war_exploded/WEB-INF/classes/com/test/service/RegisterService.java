package com.test.service;


import com.test.pojo.Register;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author LXZ
 * @since 2020-10-31
 */
public interface RegisterService {
    public abstract Register register(String username,  String password) ;
}
