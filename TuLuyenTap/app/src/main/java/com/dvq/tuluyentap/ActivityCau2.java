package com.dvq.tuluyentap;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;


public class ActivityCau2 extends AppCompatActivity {
    ListView listViewDSNhac;
    ArrayList<String> listDSNhac;
    ArrayAdapter<String> adapterDSNhac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewDSNhac = findViewById(R.id.lvNhac);
        listDSNhac = new ArrayList<String>();
        listDSNhac.add("Em của ngày hôm qua - Sơn Tùng MTP");
        listDSNhac.add("Anh sai rồi - Sơn Tùng MTP");
        listDSNhac.add("Đừng về trễ - MTP");
        listDSNhac.add("Cơn mưa ngang qua - Sơn Tùng MTP");
        listDSNhac.add("Buông đôi tay nhau ra - Sơn Tùng MTP");
        listDSNhac.add("Nắng ấm xa dần - Sơn Tùng MTP");
        listDSNhac.add("Chắc ai đó sẽ về - Sơn Tùng MTP");
        listDSNhac.add("Lạc trôi - Sơn Tùng MTP");
        listDSNhac.add("Đừng làm trái tim anh đau - Sơn Tùng MTP");
        adapterDSNhac = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listDSNhac);
        listViewDSNhac.setAdapter(adapterDSNhac);

        listViewDSNhac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatriDuocChon = listDSNhac.get(position);

                Toast.makeText(ActivityCau2.this, giatriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}