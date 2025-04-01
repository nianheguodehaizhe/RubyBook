package com.nianheguodehaizhe.rubybook.auth.domain.dataobject;

import lombok.Data;

import java.util.Date;

@Data
public class UserDO {
    private Long id;

    private String username;

    private Date createTime;

    private Date updateTime;
}