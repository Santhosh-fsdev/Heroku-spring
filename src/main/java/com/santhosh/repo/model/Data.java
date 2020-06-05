package com.santhosh.repo.model;

import org.springframework.data.annotation.Id;

public class Data {

    public String data;

    public Data(String data, String email, int mobile) {
        this.data = data;
        this.email = email;
        this.mobile = mobile;
    }

    public String email;

    public int mobile;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }


    

}
