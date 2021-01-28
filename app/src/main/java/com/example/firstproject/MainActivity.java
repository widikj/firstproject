package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         TextView txtAw = (TextView) findViewById(R.id.tv_aw);

        TextView txtNama = (TextView) findViewById(R.id.tv_nama);

        TextView txtAlamat = (TextView) findViewById(R.id.tv_alamat);
        Button btnMove

        txtAw.setText("SELAMAT DATANG");
        txtNama.setText("UJANG");
        txtAlamat.setText("Bandung");

        txtNama.setOnClickListener(View view){

            public void onClick(View view){
                Toast.makeText(context MainActivity.this)
                        //ini saya update
            }
        }


    }
}