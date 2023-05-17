package sg.edu.rp.c346.id22023689.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textViewC203;
    TextView textViewC346;
    TextView textViewC206;
    TextView textViewC218;
    TextView textViewC235;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewC203 = findViewById(R.id.textViewC203);
        textViewC346 = findViewById(R.id.textViewC346);
        textViewC206 = findViewById(R.id.textViewC206);
        textViewC218 = findViewById(R.id.textViewC218);
        textViewC235 = findViewById(R.id.textViewC235);


        textViewC203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleInfo.class);
                intent.putExtra("Value", "C203");
                startActivity(intent);

            }
        });

        textViewC346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleInfo.class);
                intent.putExtra("Value", "C346");
                startActivity(intent);
            }
        });

        textViewC206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleInfo.class);
                intent.putExtra("Value", "C206");
                startActivity(intent);
            }
        });
        {

            textViewC218.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainActivity.this, ModuleInfo.class);
                    intent.putExtra("Value", "C218");
                    startActivity(intent);
                }
            });
            {

                textViewC235.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, ModuleInfo.class);
                        intent.putExtra("Value", "C235");
                        startActivity(intent);
                    }
                });
            }
        }
    }
}