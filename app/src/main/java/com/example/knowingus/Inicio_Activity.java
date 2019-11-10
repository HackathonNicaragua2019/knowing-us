package com.example.knowingus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Inicio_Activity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_de_inicio);

    bottomNavigationView = findViewById(R.id.navigationView);
    bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
        @Override
        public void onNavigationItemReselected(@NonNull MenuItem menuItem) {

            if(menuItem.getItemId() == R.id.navigation_home){


            }
            if(menuItem.getItemId() == R.id.navigation_map){

            }
            if(menuItem.getItemId() == R.id.navigation_notifications){

             //   Intent intent = new Intent(Inicio_Activity.this, Clima.class);
               // startActivity(intent);
            }
            if(menuItem.getItemId() == R.id.navigation_perfil){

                 Intent intent = new Intent(Inicio_Activity.this, PerfilActivity.class);
                  startActivity(intent);
            }

        }
    });
    }
}
