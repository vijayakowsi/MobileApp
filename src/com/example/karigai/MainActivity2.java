package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;
import android.content.*;
import android.widget.Button;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
public class MainActivity2 extends Activity {
	Button button;
	Button btn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity2_main);
		addListenerOnButton();
	}
	
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.button1);
		btn =(Button)findViewById(R.id.button2);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent1 = new Intent(context, MainActivity4.class);
                            startActivity(intent1); 
                            Toast toast=Toast.makeText(context,"Measurement Section......", Toast.LENGTH_LONG);
                            toast.show();


			}

		});
		
		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent2 = new Intent(context, MainActivity8.class);
                            startActivity(intent2); 
                            Toast toast1=Toast.makeText(context,"ORDER STATUS......", Toast.LENGTH_LONG);
                            toast1.show();

                            

			}

		});


	}

}
