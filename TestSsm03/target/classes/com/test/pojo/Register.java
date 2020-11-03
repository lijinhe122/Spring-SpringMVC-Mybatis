package com.test.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: lijinhe
 * @Date: 2020/10/31 23:10
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Register {
    private Integer id;

    private String username;

    private String password;

    private Integer userid;
}
