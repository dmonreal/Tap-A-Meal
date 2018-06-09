package com.designstudios.crazywithkids.tapameal;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.View;

public class dairyPop extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.dairypopwindow);

        DisplayMetrics DM = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(DM);

        int width = DM.widthPixels;
        int height = DM.heightPixels;

        getWindow().setLayout((int)(width*.75),(int)(height*.75));



    }

    public void source(View view) {

        Intent sourceIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://members.tripod" +
                ".com/sue_in_nj/exchanges.htm"));
        startActivity(sourceIntent);
    }

    public void close(View view) {
        finish();
    }
}
