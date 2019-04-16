package com.ssm.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户
 * @author qp
 * @date 2019/4/12 9:59
 */
@Data
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
}
