package com.bignerdranch.android.open_cv_first.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.bignerdranch.android.open_cv_first.R;
import com.bignerdranch.android.open_cv_first.presenter.UserPresenter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,IUserView{
    UserPresenter mUserPresenter;
    EditText mID,mFirst,mLast;
    Button mSave, mLoad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }
    private  void  initialize()
    {
        mID = (EditText) findViewById(R.id.id_edt);
        mFirst = (EditText) findViewById(R.id.first_name_edt);
        mLast = (EditText) findViewById(R.id.last_name_edt);
        mSave = (Button) findViewById(R.id.saveButton);
        mLoad = (Button) findViewById(R.id.loadButton);
        mSave.setOnClickListener(this);
        mLoad.setOnClickListener(this);
        mUserPresenter = new UserPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.loadButton:
                mUserPresenter.loadUser(getID());
                break;
            case R.id.saveButton:
                mUserPresenter.saveUser(getID(),getFristName(),getLastName());
                mLast.setText("");
                mFirst.setText("");
                mID.setText("");
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return new Integer(mID.getText().toString());
    }

    @Override
    public String getFristName() {
        return mFirst.getText().toString();
    }

    @Override
    public String getLastName() {
        return mLast.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        mFirst.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        mLast.setText(lastName);
    }
}
