package com.kayanapp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.*;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MediaUploadActivity extends AppCompatActivity {

    private static final int PICK_IMAGE = 1;
    private static final int PICK_VIDEO = 2;
    private ImageView imageView;
    private VideoView videoView;
    private Button chooseImageBtn, chooseVideoBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_upload);

        imageView = findViewById(R.id.imageView);
        videoView = findViewById(R.id.videoView);
        chooseImageBtn = findViewById(R.id.chooseImageBtn);
        chooseVideoBtn = findViewById(R.id.chooseVideoBtn);

        chooseImageBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_IMAGE);
        });

        chooseVideoBtn.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Video.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK_VIDEO);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == Activity.RESULT_OK && data != null) {
            Uri selectedUri = data.getData();

            if (requestCode == PICK_IMAGE) {
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(this.getContentResolver(), selectedUri);
                    imageView.setImageBitmap(bitmap);
                    imageView.setVisibility(ImageView.VISIBLE);
                    videoView.setVisibility(VideoView.GONE);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else if (requestCode == PICK_VIDEO) {
                videoView.setVideoURI(selectedUri);
                videoView.start();
                videoView.setVisibility(VideoView.VISIBLE);
                imageView.setVisibility(ImageView.GONE);
            }
        }
    }
}
