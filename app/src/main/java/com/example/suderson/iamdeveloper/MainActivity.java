package com.example.suderson.iamdeveloper;
import android.database.DatabaseUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button InternRoom;
    Button ServerRoom;
    Button SetmoreRoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InternRoom = (Button) findViewById(R.id.intern);
        ServerRoom = (Button) findViewById(R.id.server);
        SetmoreRoom = (Button) findViewById(R.id.setmore);

        InternRoom.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Int = new Intent(MainActivity.this, InternRoom.class);
                startActivity(Int);

            }
        });

        ServerRoom.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Ser = new Intent(MainActivity.this, ServerRoom.class);
                startActivity(Ser);
            }
        });
        SetmoreRoom.setOnClickListener(new OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent Set = new Intent(MainActivity.this, SetmoreRoom.class);
                startActivity(Set);
            }

        });

    }

    }







