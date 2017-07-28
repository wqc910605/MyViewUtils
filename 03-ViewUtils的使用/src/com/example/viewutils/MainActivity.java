package com.example.viewutils;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myviewutils.OnClick;
import com.example.myviewutils.ViewInject;
import com.example.myviewutils.ViewUtils;

public class MainActivity extends Activity {

	@ViewInject(R.id.tv1)
	private TextView tv1;
	
	@ViewInject(R.id.tv2)
	private TextView tv2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		ViewUtils.inject(this);
	}

	@OnClick({R.id.btn1,R.id.btn2})
	public void 随便(View view){
		switch (view.getId()) {
		case R.id.btn1:
			Toast.makeText(this, "btn1:"+tv1.getText(), Toast.LENGTH_SHORT).show();
			break;

		case R.id.btn2:
			Toast.makeText(this, "btn2:"+tv2.getText(), Toast.LENGTH_SHORT).show();
			break;
			case R.id.btn2:
			Toast.makeText(this, "btn2:"+tv2.getText(), Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
	}
	
}
