package com.bignerdranch.android.open_cv_first.bean;

/**
 * Created by hasee on 2017/3/4.
 */

public class UserBean {
    private  String mFristName;
    private  String mLastName;
    public UserBean(String fristName,String lastName)
    {
        this.mFristName = fristName;
        this.mLastName = lastName ;
    }

    public String getFristName() {
        return mFristName;
    }

    public String getLastName() {
        return mLastName;
    }
}
