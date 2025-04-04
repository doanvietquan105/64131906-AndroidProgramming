package thigk2.doanvietquan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button cn2, cn3, cn4, about;
    void TimeDieuKhien(){
        cn2 = findViewById(R.id.btnCN2);
        cn3 = findViewById(R.id.btnCN3);
        cn4 = findViewById(R.id.btnCN4);
        about = findViewById(R.id.btnAbout);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        TimeDieuKhien();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent About = new Intent(MainActivity.this, AcitivyAboutMe.class);
                startActivity(About);
            }
        });
        cn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity2 = new Intent(MainActivity.this, ActivityCN2.class);
                startActivity(Activity2);
            }
        });
        cn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Activity3 = new Intent(MainActivity.this, ActivityCN3.class);
                startActivity(Activity3);
            }
        });
    }
}