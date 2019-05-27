package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;
import android.content.*;

import android.widget.Button;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

public class MainActivity7 extends Activity {
	Button button;
	Button button1;
	EditText ed3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity7_main);
		addListenerOnButton();
		Button button1=(Button)findViewById(R.id.button2);
		button1.setOnClickListener(new OnClickListener(){
			public void onClick(View view)
			{
				int score=getIntent().getIntExtra("bill", 0);
				EditText ed3=(EditText)findViewById(R.id.editText4);
				ed3.setText(String.valueOf(score));
				
			}
		});
		
	}
	
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.button1);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent7 = new Intent(context, MainActivity8.class);
                            startActivity(intent7);   
                            Toast toast=Toast.makeText(context,"ORDER STATUS........", Toast.LENGTH_LONG);
                            toast.show();


			}

		});
	}
	

}
