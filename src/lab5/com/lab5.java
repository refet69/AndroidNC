package lab5.com;

import java.util.ArrayList;

import com.example.androidnc.MainActivity;
import com.example.androidnc.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import lab5.com.adapter.DanhBaAdapter;
import lab5.com.model.DanhBa;

public class lab5 extends Activity {
	ListView lvDanhBa;
	ArrayList<DanhBa> danhsachDanhBa;
	DanhBaAdapter danhbaadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab5);
		
		lvDanhBa = (ListView) findViewById(R.id.listDanhBa);
		danhsachDanhBa = new ArrayList<DanhBa>();
		danhsachDanhBa.add(new DanhBa(1, "A","1111"));
		danhsachDanhBa.add(new DanhBa(2, "B","1111"));
		danhsachDanhBa.add(new DanhBa(3, "C","1111"));
		danhsachDanhBa.add(new DanhBa(4, "D","1111"));
		danhsachDanhBa.add(new DanhBa(5, "E","1111"));
		danhsachDanhBa.add(new DanhBa(6, "E","1111"));
		danhsachDanhBa.add(new DanhBa(7, "E","1111"));
		danhsachDanhBa.add(new DanhBa(8, "E","1111"));
		danhsachDanhBa.add(new DanhBa(9, "E","1111"));
		danhsachDanhBa.add(new DanhBa(10, "E","1111"));
		danhsachDanhBa.add(new DanhBa(11, "E","1111"));
		danhsachDanhBa.add(new DanhBa(12, "E","1111"));
		danhsachDanhBa.add(new DanhBa(13, "E","1111"));
		danhsachDanhBa.add(new DanhBa(14, "E","1111"));
		danhsachDanhBa.add(new DanhBa(15, "E","1111"));
		danhsachDanhBa.add(new DanhBa(16, "E","1111"));
		danhsachDanhBa.add(new DanhBa(17, "E","1111"));
		danhsachDanhBa.add(new DanhBa(18, "E","1111"));
		danhsachDanhBa.add(new DanhBa(19, "E","1111"));
		danhsachDanhBa.add(new DanhBa(20, "E","1111"));
		
		
		danhbaadapter=new DanhBaAdapter(lab5.this, R.layout.item_view, danhsachDanhBa);
		lvDanhBa.setAdapter(danhbaadapter);
	}
}
