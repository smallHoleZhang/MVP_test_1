package com.bignerdranch.android.open_cv_first.model;

import android.util.SparseArray;

import com.bignerdranch.android.open_cv_first.bean.UserBean;

import java.util.Map;

/**
 * Created by hasee on 2017/3/4.
 */

public class UserModel implements IUserModel {
    private  int mId;
    private  String mFristname;
    private  String mLsatmain;
    private SparseArray<UserBean> mUsererArray = new SparseArray();
    @Override
    public void setID(int id) {
        this.mId = id;
    }

    @Override
    public void setFirstName(String fristName) {
        this.mFristname = fristName;
    }

    @Override
    public void setLastName(String lastName) {
        this.mLsatmain = lastName;
        UserBean UserBean = new UserBean(this.mFristname, this.mLsatmain);
        this.mUsererArray.append(this.mId, UserBean);
    }

 /*   @Override
    public int getID() {
        return mId;
    }*/

    @Override
    public UserBean load(int id) {
        this.mId = id;
        UserBean userBean = this.mUsererArray.get(this.mId,new UserBean("not found","not found"));
        return userBean;
    }
}
