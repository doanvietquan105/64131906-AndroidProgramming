package com.dvq.vidu1explicitintents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

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
        //Hàm đáp ứng sự kiện nhấn lên nút "Sang màn hình khác"
        //Xử lý chuyển màn hình
        public void ChuyenManHinh(View v) {
            //Tạo đối tượng Intent
            //Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyển sang
            Intent iManHinhKhac = new Intent(this, SubActivityOne.class);
            //Thực hiện chuyển
            startActivity(iManHinhKhac);
        }
    }