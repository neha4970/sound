package com.example.sound;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button b;
	public MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        b=(Button)findViewById(R.id.button1);
        b.setOnClickListener(new a());
        
    }
        	
	class a implements	OnClickListener
	{
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				 mp=MediaPlayer.create(getApplicationContext(), R.raw.songs);
				 mp.start();         
    }

	}
	
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
   }
}
