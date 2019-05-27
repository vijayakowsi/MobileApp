package com.example.karigai;

import android.os.Bundle;
import android.app.Activity;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.content.*;
import android.widget.Toast;
import android.widget.EditText;

public class MainActivity5 extends Activity {
	Button button;
	EditText ed1,ed2;
	 

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity5);
		button=(Button)findViewById(R.id.button);
		ed1=(EditText)findViewById(R.id.editText1);
		ed2=(EditText)findViewById(R.id.EditText01);
		addListenerOnButton();
	}
	
	public void calc(View vw)
	{
		String value1=ed1.getText().toString();
		String value2=ed2.getText().toString();
		int a=Integer.parseInt(value1);
		int b=Integer.parseInt(value2);
		int sum=(a+b)*1000;
		Intent i=new Intent(getApplicationContext(),MainActivity7.class);
		i.putExtra("bill", sum);
		startActivity(i);
	}
	public void addListenerOnButton() {

		final Context context = this;

		button = (Button)findViewById(R.id.button);
	

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {

			    Intent intent6 = new Intent(context, MainActivity7.class);
                            startActivity(intent6);   
                            Toast toast=Toast.makeText(context, "Directing to Payment Section....", Toast.LENGTH_LONG);
                            toast.show();

                            

			}

		});
	}

	
}
