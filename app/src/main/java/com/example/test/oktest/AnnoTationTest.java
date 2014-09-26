package com.example.test.oktest;

import android.app.Activity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;

/**
 * Created by ojungwon on 2014-09-22.
 */
@EActivity
public class AnnoTationTest extends Activity{

    @AfterViews
    public void init(){}

}
