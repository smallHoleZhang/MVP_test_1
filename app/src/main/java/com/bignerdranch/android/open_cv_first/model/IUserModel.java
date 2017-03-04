package com.bignerdranch.android.open_cv_first.model;

import com.bignerdranch.android.open_cv_first.bean.UserBean;

/**
 * Created by hasee on 2017/3/4.
 */

public interface IUserModel {
    void setID(int id);
    void setFirstName(String fristName);
    void setLastName(String lastName);
 /*   int getID();*/
    UserBean load(int id);//通过读取Id获取一个UserBean

}
