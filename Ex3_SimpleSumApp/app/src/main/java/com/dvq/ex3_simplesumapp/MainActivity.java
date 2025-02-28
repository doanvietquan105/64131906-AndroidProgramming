package com.dvq.ex3_simplesumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Đây là bộ lắng nghe và xử lý sự kiện click lên nút tính tổng
    public void XuLyCong(View view){
        //Tìm, tham chiếu đến điều khiển trên tập XML, mapping sang java file
           EditText editTextSoA = findViewById(R.id.edtA);
           EditText editTextSoB = findViewById(R.id.edtB);
           EditText editTextKetQua = findViewById(R.id.edtKQ);
        //Lấy dữ liệu về điều khiển số a
        String strA = editTextSoA.getText().toString();     //strA ="2"
        //Lấy dữ liệu về điều khiển số b
        String strB = editTextSoB.getText().toString();     //strB ="4"

        //Chuyển dữ liệu sang dạng số
        int so_A= Integer.parseInt(strA); //2
        int so_B= Integer.parseInt(strB); //4
        //Tính toán theo yêu cầu
        int tong = so_A + so_B;           //6
        String strTong = String.valueOf(tong); //chuyển sang dạng chuỗi;  "6"
        //Hiện ra màn hình
        editTextKetQua.setText(strTong);
    }
}