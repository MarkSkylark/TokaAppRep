package com.marksky.tokaapp;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.BufferedHttpEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.net.http.AndroidHttpClient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends ActionBarActivity {
	
	private static final String SERVICE_URL = "http://services.hanselandpetal.com/photos/";
	private static final String url = "http://services.hanselandpetal.com/photos/";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button next = (Button) findViewById(R.id.button3);
		next.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
                Intent myIntent = new Intent(v.getContext(), Activity2.class);
                startActivityForResult(myIntent, 0);
			}
		});

		Button wsButton = (Button) findViewById(R.id.button2);
		wsButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {

			
			}
		});
	}

}
