package com.devalgas.topquiz.model;

/**
 * Created by Devalgas - developer Web/Mobile and  DevOps on 19-05-12.
 */
public class User {

    private String mFirstname;

    public String getFirstname() {
        return mFirstname;
    }

    public void setFirstname(String firstname) {
        mFirstname = firstname;
    }

    @Override
    public String toString() {
        return "User{" +
                "mFirstname='" + mFirstname + '\'' +
                '}';
    }
}
