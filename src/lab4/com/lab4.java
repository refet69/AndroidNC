package lab4.com;

import com.example.androidnc.R;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class lab4 extends Activity{
	Button btndialog,btnExit;
	@Override
	protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab4);
		btndialog = (Button) findViewById(R.id.btndialog);
		btnExit= (Button) findViewById(R.id.btnExit);
		
		SuKien();
	}
	
	private void SuKien() {
		btndialog.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Login();
			}
		});
		
	}

	Dialog dialoglogin;
	public void Login(){
		dialoglogin = new Dialog(this);
		dialoglogin.setContentView(R.layout.activity_lab4_dialog);
		dialoglogin.setTitle("?????");
		
		Button Exit = (Button)dialoglogin.findViewById(R.id.btnExit);
		
		Exit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialoglogin.dismiss();
			}
		});
		
		dialoglogin.show();
	}
}
