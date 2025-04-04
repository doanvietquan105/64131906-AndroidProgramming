package thigk2.doanvietquan;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
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

public class ActivityCN3 extends AppCompatActivity {
    ListView listViewDSMonHoc;
    ArrayList<String> listDSMonHoc;
    ArrayAdapter<String> adapterDSMonHoc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn3);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        listViewDSMonHoc = findViewById(R.id.lvMonHoc);
        listDSMonHoc = new ArrayList<String>();
        listDSMonHoc.add("Tin học đại cương");
        listDSMonHoc.add("Lập trình Java");
        listDSMonHoc.add("Phát triển ứng dụng web");
        listDSMonHoc.add("Khai phá dữ liệu lớn");
        listDSMonHoc.add("Kinh tế chính trị Mác-Lê nin");
        listDSMonHoc.add("...");
        adapterDSMonHoc = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listDSMonHoc);
        listViewDSMonHoc.setAdapter(adapterDSMonHoc);

        listViewDSMonHoc.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String giatriDuocChon = listDSMonHoc.get(position);

                Toast.makeText(ActivityCN3.this, giatriDuocChon, Toast.LENGTH_SHORT).show();
            }
        });
    }
}