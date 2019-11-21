package com.forbitbd.androidutils.ui.zoomImage;

import android.graphics.Bitmap;

public interface ZoomImageContract {

    interface Presenter{
        void getImage(String url);
    }

    interface View{
       void updateImage(Bitmap bitmap);
       void showProgressDialog();
       void hideProgressDialog();
    }
}
