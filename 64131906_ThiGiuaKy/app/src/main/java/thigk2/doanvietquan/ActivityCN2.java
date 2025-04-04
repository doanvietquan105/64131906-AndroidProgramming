package thigk2.doanvietquan;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityCN2 extends AppCompatActivity {

    EditText editTextGK;
    EditText editTextCK;
    Button tinhTB;
    EditText editTextKQ;

    void TimDieuKhien(){
        editTextGK = findViewById(R.id.edtDGK);
        editTextCK = findViewById(R.id.edtDCK);
        editTextKQ = findViewById(R.id.edtKQ);
        tinhTB = findViewById(R.id.btnTinhTB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cn2);
        TimDieuKhien(); // Gọi hàm tìm điều khiển

        tinhTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strGK = editTextGK.getText().toString();
                String strCK = editTextCK.getText().toString();

                if (strGK.isEmpty() || strCK.isEmpty()) {
                    editTextKQ.setText("Vui lòng nhập đủ điểm GK và CK");
                    return;
                }

                try {
                    double diemGK = Double.parseDouble(strGK);
                    double diemCK = Double.parseDouble(strCK);

                    if (diemGK < 0 || diemGK > 10 || diemCK < 0 || diemCK > 10) {
                        editTextKQ.setText("Điểm phải từ 0 đến 10");
                        return;
                    }

                    double diemTB = (diemGK * 0.5) + (diemCK * 0.5);

                    String ketQua = String.format("%.1f", diemTB);
                    editTextKQ.setText(ketQua);

                } catch (NumberFormatException e) {
                    editTextKQ.setText("Vui lòng nhập số hợp lệ");
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}