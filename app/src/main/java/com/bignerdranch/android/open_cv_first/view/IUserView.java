package com.bignerdranch.android.open_cv_first.view;

/**
 * Created by hasee on 2017/3/4.
 */

public interface IUserView {
    int getID();

    String getFristName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
