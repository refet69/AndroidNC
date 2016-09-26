package lab1.com;

import com.example.androidnc.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;

public class  lab1 extends Activity {
	Button btnabm;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab1);
		String doc="https://docs.google.com/document/d/19toWbl2aiu7VS6YmMSo0N-vwr0DDbQeOgaOyj8c6fn4/edit";
		WebView wv=(WebView)findViewById(R.id.fileWebView);
		
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setAllowFileAccess(true);
		wv.getSettings().setLoadsImagesAutomatically(true);
		
		wv.loadUrl(doc);
		
		
		
		
	}
		
}
