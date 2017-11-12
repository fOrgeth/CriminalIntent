package com.mcs.th.forge.criminalintent;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class PhotoViewFragment extends DialogFragment {

    private static final String ARG_PHOTO = "camera_photo";
    private ImageView mCameraPhoto;

    public static PhotoViewFragment newInstance(String imagePath) {
        Bundle args = new Bundle();
        args.putSerializable(ARG_PHOTO, imagePath);

        PhotoViewFragment fragment = new PhotoViewFragment();
        fragment.setArguments(args);
        return fragment;
    }

    /*@Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        String imagePath = (String) getArguments()
                .getSerializable(ARG_PHOTO);
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_photo_view, null);

        mCameraPhoto = v.findViewById(R.id.dialog_crime_photo);
        mCameraPhoto.setImageBitmap(PictureUtils.getScaledBitmap(imagePath, getActivity()));
        return v;
    }*/

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        String imagePath = (String) getArguments()
                .getSerializable(ARG_PHOTO);
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.dialog_photo_view, null);

        mCameraPhoto = v.findViewById(R.id.dialog_crime_photo);
        Bitmap image = PictureUtils.getScaledBitmap(imagePath, getActivity());
        mCameraPhoto.setImageBitmap(image);
        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .create();
    }

}
