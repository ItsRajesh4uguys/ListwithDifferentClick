package com.example.listwithclick;
import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	
	ListView listView1;
	Activity activity;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		activity=this;
		
		listView1=(ListView)findViewById(R.id.listView1);
		listView1.setAdapter(new MyAddapter(MainActivity.this));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	 class MyAddapter extends BaseAdapter {
			Context rContext;
			private LayoutInflater rInflater;

			public MyAddapter(Context c) {

				rInflater = LayoutInflater.from(c);

				rContext = c;

			}      
	               
			public MyAddapter(Activity imagebinding) {
				// TODO Auto-generated constructor stub

				activity = imagebinding;		
				
				rContext = imagebinding;
				rInflater = LayoutInflater.from(imagebinding);
				rContext = imagebinding;
				rInflater = (LayoutInflater) activity
						.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			

				
			}
			
			@Override
			public int getCount() {
				// TODO Auto-generated method stub	
				
							
				return 10;
			}

			@Override
			public Object getItem(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public long getItemId(int position) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public View getView(final int position, View convertView,
					ViewGroup parent) {
				// TODO Auto-generated method stub
				convertView = rInflater.inflate(R.layout.child, null);
				final MyDat mydat = new MyDat();				
				
				mydat.textview = (TextView) convertView.findViewById(R.id.textView1);
				mydat.textview.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						
						Toast.makeText(rContext, "text", 1000).show();
						Intent image= new Intent(rContext,TextActivity.class);
						startActivity(image);
					}
				});
				
				mydat.imageView1=(ImageView)convertView.findViewById(R.id.imageView1);
				mydat.imageView1.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Toast.makeText(rContext, "image ", 1000).show();
						
						Intent image= new Intent(rContext,ImageActivity.class);
						startActivity(image);
					}
				});
				
				return convertView;
			}
	                              
			class MyDat {
				 
						
				TextView  textview;
				ImageView imageView1;
				
				
			}

		}

}
