package com.example.richard.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mMovieBt, mStockBt, mBuildBt, mMaterialBt, mUbiquitousBt, mCapstoneBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mMovieBt = (Button) findViewById(R.id.movie_bt);
        mMovieBt.setOnClickListener(this);
        mStockBt = (Button) findViewById(R.id.stock_bt);
        mStockBt.setOnClickListener(this);
        mBuildBt = (Button) findViewById(R.id.build_bt);
        mBuildBt.setOnClickListener(this);
        mMaterialBt = (Button) findViewById(R.id.material_bt);
        mMaterialBt.setOnClickListener(this);
        mUbiquitousBt = (Button) findViewById(R.id.ubiquitous_bt);
        mUbiquitousBt.setOnClickListener(this);
        mCapstoneBt = (Button) findViewById(R.id.capstone_bt);
        mCapstoneBt.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.movie_bt:
                showToast(R.string.movie_toast);
                break;
            case R.id.stock_bt:
                showToast(R.string.stock_toast);
                break;
            case R.id.build_bt:
                showToast(R.string.build_toast);
                break;
            case R.id.material_bt:
                showToast(R.string.material_toast);
                break;
            case R.id.ubiquitous_bt:
                showToast(R.string.ubiquitous_toast);
                break;
            case R.id.capstone_bt:
                showToast(R.string.capstone_toast);
                break;
            default:
                break;
        }

    }

    private void showToast(int resId) {
        Toast.makeText(this, getResources().getString(resId), Toast.LENGTH_SHORT).show();
    }
}
