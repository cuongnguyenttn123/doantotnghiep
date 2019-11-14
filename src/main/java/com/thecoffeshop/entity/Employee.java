package com.thecoffeshop.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employee", catalog = "theshopcoffee")
public class Employee implements java.io.Serializable {
    @Id
    private String employeeId;

    @Column(name = "name")
    private String name;

    @Column(name = "sex")
    private boolean sex;

    @Column(name = "phone")
    private Integer phone;

    @Column(name ="address")
    private String addRess;

    @Column(name = "usename")
    private String userName;

    @Column(name = "password")
    private String passWord;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updateat")
    private Date upDateAt;

    @Column(name = "isdelete")
    private Boolean isDelete;

    public Employee(String employeeId, String name, boolean sex, Integer phone, String addRess, String userName, String passWord, Date upDateAt, Boolean isDelete) {
        this.employeeId = employeeId;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.addRess = addRess;
        this.userName = userName;
        this.passWord = passWord;
        this.upDateAt = upDateAt;
        this.isDelete = isDelete;
    }

    public Employee() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddRess() {
        return addRess;
    }

    public void setAddRess(String addRess) {
        this.addRess = addRess;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Date getUpDateAt() {
        return upDateAt;
    }

    public void setUpDateAt(Date upDateAt) {
        this.upDateAt = upDateAt;
    }

    public Boolean getDelete() {
        return isDelete;
    }

    public void setDelete(Boolean delete) {
        isDelete = delete;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee='" + employeeId + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone=" + phone +
                ", addRess='" + addRess + '\'' +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", upDateAt=" + upDateAt +
                ", isDelete=" + isDelete +
                '}';
    }
}
