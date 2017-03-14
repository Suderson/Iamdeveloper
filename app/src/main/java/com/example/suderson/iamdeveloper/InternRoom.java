package com.example.suderson.iamdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class InternRoom extends AppCompatActivity {
    Button Button5;
    Button Button6;
    Button Button16;
    Button Button17;
    Button Button19;
    Button Button20;
    Button Button21;
    Button Button22;
    Button Button23;
    Button Button24;
    Button Button25;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intern_room);
        Button5 =(Button) findViewById(R.id.button5);
        Button6 =(Button) findViewById(R.id.button6);
        Button16 =(Button) findViewById(R.id.button16);
        Button17 =(Button) findViewById(R.id.button17);
        Button19 =(Button) findViewById(R.id.button19);
        Button20 =(Button) findViewById(R.id.button20);
        Button21 =(Button) findViewById(R.id.button21);
        Button22 =(Button) findViewById(R.id.button22);
        Button23 =(Button) findViewById(R.id.button23);
        Button24 =(Button) findViewById(R.id.button24);
        Button25=(Button) findViewById(R.id.button25);


        Button5.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb1 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb1);
            }
        });

        Button6.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb2 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb2);
            }
        });

        Button16.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb3 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb3);
            }
        });

        Button17.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb4 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb4);
            }
        });

        Button19.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb5 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb5);
            }
        });

        Button20.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb6 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb6);
            }
        });

        Button21.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb7 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb7);
            }
        });

        Button22.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb8 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb8);
            }
        });

        Button23.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb9 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb9);
            }
        });

        Button24.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb10 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb10);
            }
        });

        Button25.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
                // TODO Auto-generated method stub1
                Intent Forb11 = new Intent(InternRoom.this,Form.class);
                startActivity(Forb11);
            }
        });
    }

}
