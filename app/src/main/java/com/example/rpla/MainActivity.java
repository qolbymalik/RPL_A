package com.example.rpla;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText etPanjang, etLebar, etTinggi;
private Button btnHitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Lz", MainActivity.class.getSimpleName() + " onCreate");

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer panjang = Integer.parseInt(etPanjang.getText().toString());
                Integer lebar = Integer.parseInt(etLebar.getText().toString());
                Integer Tinggi = Integer.parseInt(etTinggi.getText().toString());

                tvHasil.setText(String.valueOf(panjang*lebar*Tinggi));

                MyBiodata biodataQolby = new MyBiodata( "Qolby",15);

                Intent keActivityDua = new Intent(MainActivity.this,ActivityDua.class);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lz", MainActivity.class.getSimpleName()+" onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lz", MainActivity.class.getSimpleName()+" onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lz", MainActivity.class.getSimpleName()+" onPause");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lz", MainActivity.class.getSimpleName()+" onStop");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.d("Lz", MainActivity.class.getSimpleName()+" onDestroy");
    }
}
