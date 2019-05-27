package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

import android.content.*;

import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;



public class MainActivity4 extends Activity {
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity4_main);
		addListenerOnButton();
		
	}
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.save);
	

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent5 = new Intent(context, MainActivity5.class);
                            startActivity(intent5); 
                            Toast toast=Toast.makeText(context,"Bill Generation .........", Toast.LENGTH_LONG);
                            toast.show();
                            

			}

		});
	}


}
