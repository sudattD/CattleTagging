package com.hdfcergo.cattletagging;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
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
