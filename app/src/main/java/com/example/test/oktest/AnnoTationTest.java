package com.example.test.oktest;

import android.app.Activity;
import android.content.Intent;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by ojungwon on 2014-09-22.
 */
@EActivity
public class AnnoTationTest extends Activity{

    @AfterViews
    public void init(){}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }
}
