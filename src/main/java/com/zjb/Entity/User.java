package com.zjb.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;

/**
 * Created by Administrator on 2018\8\11 0011.
 */
public class User {
    private String name;
    @JsonIgnore
    private String passWord;
    private Integer age;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss a", locale = "zh", timezone = "GMT+8")
    private Date birthDay;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String desc;

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
