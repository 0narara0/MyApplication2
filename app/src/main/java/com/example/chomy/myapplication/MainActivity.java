package com.example.chomy.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName() ;
    private Button mMinusButton;
    private Button mPlusButton;
    private TextView mQuantityTextView;
    private TextView mResultTextView;

    //수량
    private int mQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //초기화
        init();

        //레이아웃 표시
        setContentView(R.layout.activity_coffee);

        //레이아웃에서 특정 id를 인스터스 변수와 연결
        mMinusButton = findViewById(R.id.minus_button);
        mPlusButton = findViewById(R.id.plus_button);
        mQuantityTextView = findViewById(R.id.quantity_text);

        //무명클래스
        mMinusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //debug
                Log.d(TAG,"마이너스 버튼 클릭");
                Log.v(TAG,"일반로그"); //verbose
                Log.e(TAG,"에러로그"); //error
                Log.i(TAG,"정보로그"); //information
                Log.w(TAG,"경고로그"); //warning

                //토스트 메세지
                Toast.makeText(MainActivity.this, "메세지",Toast.LENGTH_SHORT).show();
        }
        });
    }

    private void init() {
        mQuantity = 0; //원래는 생성자에서 초기화
    }
}
