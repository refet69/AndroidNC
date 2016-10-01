package lab6.com;

import com.example.androidnc.R;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class lab6 extends TabActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		TabHost tab1= getTabHost();
		TabSpec tabspec = tab1.newTabSpec("first");
		TabSpec tabspec2 = tab1.newTabSpec("second");
		TabSpec tabspec3 = tab1.newTabSpec("third");
		tabspec.setIndicator("ghi chu");
		tabspec.setContent(new Intent(this, tab1_lab6.class));
		tabspec2.setIndicator("ghi chu");
		tabspec2.setContent(new Intent(this, tab2_lab6.class));
		tabspec3.setIndicator("ghi chu");
		tabspec3.setContent(new Intent(this, tab3_lab6.class));
		
		tab1.addTab(tabspec);
		tab1.addTab(tabspec2);
		tab1.addTab(tabspec3);
	}
	
	
}
