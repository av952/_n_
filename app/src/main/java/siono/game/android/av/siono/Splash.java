package siono.game.android.av.siono;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private static int SPLASH_TIME_OUT =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,Menu.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

        mediaPlayer = MediaPlayer.create(this,R.raw.avxc);
        mediaPlayer.setLooping(false);
        mediaPlayer.start();
    }
}
