package com.mcs.th.forge.criminalintent;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.ImageView;

public class PhotoViewFragment extends DialogFragment {

    private static final String ARG_PHOTO = "camera_photo";

    public static PhotoViewFragment newInstance(String imagePath) {
        Bundle args = new Bundle();
        args.putString(ARG_PHOTO, imagePath);

        PhotoViewFragment fragment = new PhotoViewFragment();
        fragment.setArguments(args);
        return fragment;
    }
}
