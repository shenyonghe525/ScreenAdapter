package com.syh.yongheshen.screenadapter;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getRealWH();
    }

    private void getRealWH(){
        int screenWidth = getWindowManager().getDefaultDisplay().getWidth();//真实分辨率 宽
        int screenHeight = getWindowManager().getDefaultDisplay().getHeight();//真实分辨率
        DisplayMetrics dm = getResources().getDisplayMetrics();
        int densityDPI = dm.densityDpi;
        System.out.println("真实分辨率：" + screenWidth + "*" + screenHeight + "  每英寸:" + densityDPI);
        Toast.makeText(MainActivity.this, "真实分辨率：" + screenWidth + "*" + screenHeight + "  每英寸:" + densityDPI, Toast.LENGTH_LONG).show();
    }
}
