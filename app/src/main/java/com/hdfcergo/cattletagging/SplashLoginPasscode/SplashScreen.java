package com.hdfcergo.cattletagging.SplashLoginPasscode;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.hdfcergo.cattletagging.R;

public class SplashScreen extends AppCompatActivity {


    private Context context;
    private SharedPreferences pref;
    private ImageView imgHDFC;

    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        initializeViews();
    }

    private void initializeViews() {

        context = this;
        pref = context.getSharedPreferences("Session Data", MODE_PRIVATE);

        imgHDFC = (ImageView) findViewById(R.id.imgHDFC);

        Animation myFadeInAnimation = AnimationUtils.loadAnimation(context, R.anim.fade_in_image);
        imgHDFC.startAnimation(myFadeInAnimation); //Set animation to your ImageView

    }


    @Override
    protected void onResume() {
        super.onResume();


        // TODO Auto-generated method stub
        super.onResume();



		/*
			This method runs in the background thread and has a 3 seconds pause to show the splash image.

		*/

        new AsyncTask<Void, Void, Void>() {
            @Override
            protected Void doInBackground(Void... params) {
                try {

                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    Log.e("", e.toString());
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {



					/*
					 * The Code below starts another activity which is a screen with PIN in our case .
					*/


                //startActivity(new Intent(SplashScreenActivity.this, CanDetails.class).putExtra("isCheck","Admin" ));

                //startActivity(new Intent(SplashScreenActivity.this, MainActivity.class).putExtra("fora", farmerOrAdmin));
                startActivity(new Intent(SplashScreen.this, LoginScreen.class));


                finish();
            }
        }.execute();




    }
}
