package com.example.suderson.iamdeveloper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class ServerRoom extends AppCompatActivity {
    Button Button;
    Button Button2;
    Button Button10;
    Button Button11;
    Button Button12;
    Button Button7;
    Button Button8;
    Button Button15;
    Button Button4;
    Button Button3;
    Button Button13;
    Button Button9;
    Button Button14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_room);
        Button =(Button) findViewById(R.id.button);
        Button2 =(Button) findViewById(R.id.button2);
        Button10 =(Button) findViewById(R.id.button10);
        Button11 =(Button) findViewById(R.id.button11);
        Button12 =(Button) findViewById(R.id.button12);
        Button7 =(Button) findViewById(R.id.button7);
        Button8 =(Button) findViewById(R.id.button8);
        Button15 =(Button) findViewById(R.id.button15);
        Button4 =(Button) findViewById(R.id.button4);
        Button3 =(Button) findViewById(R.id.button3);
        Button13 =(Button) findViewById(R.id.button13);
        Button9 =(Button) findViewById(R.id.button9);
        Button14 =(Button) findViewById(R.id.button14);

        Button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb12 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb12);

            }
        });


        Button2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb13 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb13);
            }
        });
        Button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb14 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb14);
            }
        });
        Button11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb15 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb15);
            }
        });
        Button12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb16 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb16);
            }
        });

        Button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb17 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb17);
            }
        });

        Button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb18 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb18);
            }
        });

        Button15.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb19 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb19);
            }
        });

        Button4.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb20 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb20);
            }
        });

        Button3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb21 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb21);
            }
        });

        Button13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb22 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb22);
            }
        });

        Button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub1
                Intent Forb23 = new Intent(ServerRoom.this,Form.class);
                startActivity(Forb23);
            }
        });

    Button14.setOnClickListener(new View.OnClickListener() {

        public void onClick(View v) {
// TODO Auto-generated method stub1
            Intent Forb24 = new Intent(ServerRoom.this,Form.class);
            startActivity(Forb24);
        }
    });

    }


}
