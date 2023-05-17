package sg.edu.rp.c346.id22023689.ps;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ModuleInfo extends AppCompatActivity {
    TextView textViewC203;
    TextView textViewC346;
    TextView textViewC206;
    TextView textViewC218;
    TextView textViewC235;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_info);

        textViewC203 = findViewById(R.id.textViewC203);
        Intent intentReceived = getIntent(); // get the box
        String code = intentReceived.getStringExtra("Value"); // get value out of the box, module code

        if (code.equals("C203")) {
            textViewC203.setText("Module Code: C203\n Module Name: Web Application in php\n Academic Year: 2023\n Semester: 1\n Module Credit:4\n Venue:W65C");
        }
        else if (code.equals("C346")) {
            textViewC346.setText("Module Code: C346\n Module Name: Mobile App Development\n Academic Year: 2023\n Semester: 1\n Module Credit:4\n Venue:E63A");
        }
        else if (code.equals("C206")) {
            textViewC206.setText("Module Code: C206\n Module Name: Software Development Process\n Academic Year: 2023\n Semester: 1\n Module Credit:4\n Venue:W65C");
        }
        else if (code.equals("C218")) {
            textViewC218.setText("Module Code: C218\n Module Name: UI/UX Design for Apps\n Academic Year: 2023\n Semester: 1\n Module Credit:4\n Venue:W65C");
        } else if (code.equals("C235")) {
            textViewC235.setText("Module Code: C235\n Module Name: IT Security and Management\n Academic Year: 2023\n Semester: 1\n Module Credit:4\n Venue:W65C");

        }
    }
}