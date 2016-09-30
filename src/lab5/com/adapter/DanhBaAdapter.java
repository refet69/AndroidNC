package lab5.com.adapter;

import java.util.List;

import com.example.androidnc.R;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import lab5.com.model.DanhBa;

public class DanhBaAdapter extends ArrayAdapter<DanhBa> {
	Activity context;
	int resource;
	List<DanhBa> objects;
	
	public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects){
		super(context,resource,objects);
		this.context=context;
		this.resource=resource;
		this.objects=objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = this.context.getLayoutInflater();
		View row=inflater.inflate(this.resource, null);
		
		TextView txtTen = (TextView) row.findViewById(R.id.txtTenDB);
		TextView txtSdt = (TextView) row.findViewById(R.id.txtSdt);
		ImageButton btnCall= (ImageButton) row.findViewById(R.id.btnCall);
		ImageButton btnMS =(ImageButton) row.findViewById(R.id.btnMS);
		ImageButton btnFix=(ImageButton) row.findViewById(R.id.btnFix);
		
		DanhBa danhba=this.objects.get(position);
		txtTen.setText(danhba.getTen());
		txtSdt.setText(danhba.getPhone());
		return row;
		//return super.getView(position, convertView, parent);
	}
}
