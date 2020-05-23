package com.example.instrumentationtestdemo;

import android.content.Context;

public class BClass {

    private Context mContext;

    public BClass(Context context){
        mContext = context;
    }

    public String getAppName(){
        return mContext.getApplicationContext().getText(R.string.app_name).toString();
    }
}
