package com.ambrhino.server;

import android.app.Activity;
import android.os.Bundle;

public class AmbroidActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        FileServer.startServer();
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	FileServer.stopServer();
    }
}