package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.*;
import android.widget.Toast;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends Activity {

	Button button;
	Button btn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnButton();
	}
	
	
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.button);
		btn =(Button)findViewById(R.id.button2);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent = new Intent(context, MainActivity2.class);
                            startActivity(intent);  
                            Toast toast1=Toast.makeText(context, "Directing to Dashboard......",Toast.LENGTH_LONG);
                            toast1.show();


			}

		});
		
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent = new Intent(context, MainActivity3.class);
                            startActivity(intent);  
                            Toast toast=Toast.makeText(context, "Directing to Register Form.......", Toast.LENGTH_LONG);
                            toast.show();

			}

		});


	}

}
