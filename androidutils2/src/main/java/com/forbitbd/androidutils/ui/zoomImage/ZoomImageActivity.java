package com.forbitbd.androidutils.ui.zoomImage;


import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.forbitbd.androidutils.R;
import com.forbitbd.androidutils.customView.ZoomableImageView;
import com.forbitbd.androidutils.utils.Constant;
import com.forbitbd.androidutils.utils.PrebaseActivity;


public class ZoomImageActivity extends PrebaseActivity implements ZoomImageContract.View {

    private String path;

    private ZoomableImageView mZoomImage;
    private ZoomImagePresenter mPresenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_zoom_image);
        mPresenter = new ZoomImagePresenter(this);

        this.path = getIntent().getStringExtra(Constant.PATH);

        mZoomImage = findViewById(R.id.zoomImage);

        mPresenter.getImage(path);
    }

    @Override
    public void updateImage(Bitmap bitmap) {
        mZoomImage.setImageBitmap(bitmap);
    }
}
