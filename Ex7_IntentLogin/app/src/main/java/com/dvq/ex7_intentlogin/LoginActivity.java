package com.dvq.ex7_intentlogin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
        EditText edPass = (EditText) findViewById(R.id.edtPass);
        Button btnXacNhan = (Button) findViewById(R.id.btnOK);

        btnXacNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Xử lý dăng nhập
                //Lấy dữ liệu
                //B1. Tìm tham chiếu đến đk
                EditText edTenDN = (EditText) findViewById(R.id.edtUsername);
                EditText edPass = (EditText) findViewById(R.id.edtPass);
                //B2. Lấy dữ liệu
                String tenDangNhap = edTenDN.getText().toString();
                String mk = edPass.getText().toString();
                //Kiểm tra mật khẩu

                if (tenDangNhap.equals("doanvietquan") && mk.equals("123"))
                {
                    //Chuyển sang màn hình home
                    Intent iQuiz = new Intent(LoginActivity.this, HomeActivity.class);
                    //Gói dữ liệu vào iQuiz, dạng key - value
                    iQuiz.putExtra("ten_dang_nhap",tenDangNhap);
                    iQuiz.putExtra("mk_dang_nhap",mk);
                    //
                    startActivity(iQuiz);
                }
                else{
                    Toast.makeText(LoginActivity.this, "BẠN NHẬP SAI THÔNG TIN",Toast.LENGTH_LONG);
                }
            }
        });
    }
}