package com.example.aksaden.latihan4labti;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_about = (Button)findViewById(R.id.about1);
        Button btn_exit = (Button)findViewById(R.id.exit1);
        btn_about.setOnClickListener(this);
        btn_exit.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
         //button about
            case R.id.about1:
                AlertDialog.Builder info = new AlertDialog.Builder(MainActivity.this);
                info.setMessage("Dibuat di Kosan\n\n2017").setCancelable(false).setPositiveButton
                        ("Lanjut",new AlertDialog.OnClickListener(){
                            public void onClick(DialogInterface dialog, int id){
                                dialog.cancel();
                            }
                        });

                AlertDialog dialog = info.create();
                dialog.setTitle("Tentang kamu");
                dialog.show();
                TextView textView = (TextView)dialog.findViewById(android.R.id.message);
                textView.setTextSize(12);
                break;


            //button exit
            case R.id.exit1:
                AlertDialog.Builder keluar = new AlertDialog.Builder(MainActivity.this);
                keluar.setMessage("Anda yakin ingin keluar aplikasi ini?");
                keluar.setPositiveButton("Of Course", new AlertDialog.OnClickListener(){

                            @Override
                            public void onClick(DialogInterface arg0, int i){
                                Intent exit = new Intent(Intent.ACTION_MAIN);
                                exit.setFlags(Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS);
                                startActivity(exit);
                                finish();

                            }
                        });
                keluar.setNegativeButton("NO", new AlertDialog.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        dialog.cancel();
                    }
                });
                AlertDialog dialog1 = keluar.create();
                dialog1.setTitle("Keluar");
                dialog1.show();
                    }
                }
            }


