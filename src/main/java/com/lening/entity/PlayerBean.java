package com.lening.entity;

import lombok.Data;

@Data
public class PlayerBean {
    private Long id;
    private String name;
    private Integer age;
    private String birthday;
    private Integer sid;
    private Integer tid;
    private SchoolBean schoolBean = new SchoolBean();
    private TeamBean teamBean = new TeamBean();
}
