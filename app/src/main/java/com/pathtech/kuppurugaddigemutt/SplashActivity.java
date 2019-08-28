package com.pathtech.kuppurugaddigemutt;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;
import android.widget.ImageView;

import java.util.Random;

public class SplashActivity extends Activity {
    private static int[] splashImages = { R.mipmap.main_swamiji, R.mipmap.second_swamiji, R.mipmap.main_god };
    ImageView imgSplash;
    int selected;
    private SharedPreferences sharedPreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
      //  playSong();
        imgSplash = (ImageView) findViewById(R.id.splash);

        selected = randomBox();
        if (selected == sharedPreferences.getInt("SELECTED", 0)) {
            selected = randomBox();
        }

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("SELECTED", selected);
        editor.commit();



        Thread timerThread = new Thread() {
            public void run() {
                try {

                    for (int i = 0; i < splashImages.length; i++) {
                        if (selected == i) {
                            imgSplash.setImageResource(splashImages[i]);
                        }
                    }
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    public static int randomBox() {

        Random rand = new Random();
        int pickedNumber = rand.nextInt(splashImages.length);
        return pickedNumber;

    }

    private void playSong(){
        MediaPlayer mp;
        mp = MediaPlayer.create(SplashActivity.this, R.raw.bg_splash);
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
              //  mp.release();
            }
        });
        mp.start();
    }
}
