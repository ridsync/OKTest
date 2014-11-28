/*******************************************************************************
 * Android Image Loader Library - GitHub Site URLs
 * AUIL ( https://github.com/nostra13/Android-Universal-Image-Loader )
 * Volley ( https://github.com/ogrebgr/android_volley_examples + https://github.com/mcxiaoke/android-volley )
 * Glide ( https://github.com/bumptech/glide )
 * Picaso ( http://square.github.io/picasso/ )
 *
 * Refernce . http://helloworld.naver.com/helloworld/429368
 *******************************************************************************/
package com.example.test.oktest.ImageLoaderLib;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.test.oktest.R;

public class ImageLoaderLibsFragment extends AbsListViewBaseFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.fr_android_img_loader_list, container, false);
        Button btn = (Button)rootView.findViewById(R.id.onAUILClick);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, new AUILTestFragment()).commit();
            }
        });
		return rootView;
	}

    @Override
    protected void setActionBarOnResume(Activity activity, ActionBar actionBar) {

    }

}