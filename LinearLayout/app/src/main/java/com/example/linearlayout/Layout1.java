package com.example.linearlayout;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Layout1 extends Activity{
    @Override
    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.layout1);
    }

    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("myStateLog", "onRestart");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("myStateLog", "onPause");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("myStateLog", "onStop");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("myStateLog", "onDestroy");
    }
}
