package com.example.anila.testview;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout cl=findViewById(R.id.con);
        TextView text=new TextView(this);
        text.setText("HELLO WORLD");
        cl.addView(text);
        ToggleButton toggle=findViewById(R.id.toggleButton);

        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                    Toast.makeText(MainActivity.this, "Button ON", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this, "Button OFF", Toast.LENGTH_SHORT).show();
            }
        });
        Switch s=findViewById(R.id.switch1);
        s.setText("Sound");
        ImageButton img=findViewById(R.id.imageButton);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Image clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
