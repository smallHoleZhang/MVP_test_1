package com.bignerdranch.android.open_cv_first.presenter;

import com.bignerdranch.android.open_cv_first.bean.UserBean;
import com.bignerdranch.android.open_cv_first.model.IUserModel;
import com.bignerdranch.android.open_cv_first.model.UserModel;
import com.bignerdranch.android.open_cv_first.view.IUserView;

/**
 * Created by hasee on 2017/3/4.
 */

public class UserPresenter {
    private IUserView mUserView;
    private IUserModel mUserModel;


    public UserPresenter (IUserView view)
    {
        mUserView = view;
        mUserModel = new UserModel();
    }
    public void saveUser( int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }
    /*
    通过调用IUserview的方法来更新显示
     */
    public  void loadUser( int id)
    {
        UserBean userBean = mUserModel.load(id);
        mUserView.setFirstName(userBean.getFristName());
        mUserView.setLastName(userBean.getLastName());
    }
}
