package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.*;
import android.content.Context;
import android.widget.Toast;

public class MainActivity3 extends Activity {
	Button button;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity3_main);
		addListenerOnButton();
	}
	
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.button1);
	

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent3 = new Intent(context, MainActivity4.class);
                            startActivity(intent3);  
                            Toast toast=Toast.makeText(context,"Measurement Section........", Toast.LENGTH_LONG);
                            toast.show();

                            
			}

		});

	}

}
