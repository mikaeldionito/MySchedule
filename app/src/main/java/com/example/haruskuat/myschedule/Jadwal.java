package com.example.haruskuat.myschedule;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Jadwal extends AppCompatActivity {
TextView vJam1, vJam2, vJam3, vJam4, vJam5, vMk1, vMk2, vMk3, vMk4, vMk5, vHari;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jadwal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        vJam1 = (TextView) findViewById(R.id.viewJam1);
        vJam2 = (TextView) findViewById(R.id.viewJam2);
        vJam3 = (TextView) findViewById(R.id.viewJam3);
        vJam4 = (TextView) findViewById(R.id.viewJam4);
        vJam5 = (TextView) findViewById(R.id.viewJam5);

        vMk1 = (TextView) findViewById(R.id.viewMK1);
        vMk2 = (TextView) findViewById(R.id.viewMK2);
        vMk3 = (TextView) findViewById(R.id.viewMK3);
        vMk4 = (TextView) findViewById(R.id.viewMK4);
        vMk5 = (TextView) findViewById(R.id.viewMK5);

        vHari = (TextView) findViewById(R.id.viewHari);

        tampilData();

    }
    public void tampilData(){
        Intent jadwal = getIntent();
        vHari.setText(jadwal.getExtras().getString("hari"));

        if (vHari.getText().toString().equals("SENIN")){
            vHari.setText(jadwal.getExtras().getString("hari"));
            vJam1.setText("08:00 - 09:40");vMk1.setText("Keamanan Jaringan");
            vJam2.setText("10:00 - 12:00");vMk2.setText("Praktik Keamanan Jaringan");
            vJam3.setText("13:00 - 14:40");vMk3.setText("Metode Kuantitatif Untuk Bisnis");
            vJam4.setText("15:00 - 17:30");vMk4.setText("Teknologi Mobile");

        }else if (vHari.getText().toString().equals("SELASA")){
            vHari.setText(jadwal.getExtras().getString("hari"));
            vJam1.setText("08:00 - 12:00");vMk1.setText("Bahasa Inggris 4");
            vJam2.setText("13:00 - 14:40");vMk2.setText("Perancangan Antarmuka Mobile");

        }else if (vHari.getText().toString().equals("RABU")){
            vHari.setText(jadwal.getExtras().getString("hari"));
            vJam1.setText("15:00 - 17:30");vMk1.setText("Otomata dan Bahasa Formal");

        }else if (vHari.getText().toString().equals("KAMIS")){
            vHari.setText(jadwal.getExtras().getString("hari"));
            vJam1.setText("10:00 - 15:00");vMk1.setText("Proyek Pengembangan Aplikasi WEB");
            vJam2.setText("15:00 - 17:30");vMk2.setText("Uji Kualitas Perangkat Lunak");

        }else if (vHari.getText().toString().equals("JUMAT")){
            vHari.setText(jadwal.getExtras().getString("hari"));
            vJam1.setText("10:00 - 11:40");vMk1.setText("Interaksi Manusia dan Komputer");
            vJam2.setText("15:00 - 17:00");vMk2.setText("Praktikum Pemrograman Berorientasi Objek");

        }
    }

}
