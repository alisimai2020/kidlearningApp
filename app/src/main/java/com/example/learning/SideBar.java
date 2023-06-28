package com.example.learning;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class SideBar extends AppCompatActivity {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    ActionBarDrawerToggle drawerToggle;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(drawerToggle.onOptionsItemSelected(item)){
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side_bar);


        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        drawerToggle = new ActionBarDrawerToggle(this,drawerLayout,R.string.open,R.string.close);

        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override

            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.Pineapple:
                    {
                        Toast.makeText(SideBar.this," Hello, You have chosen Pineapple Juice!",Toast.LENGTH_LONG).show();


                        break;
                    }


                    case R.id.Mango:
                    {
                        Toast.makeText(SideBar.this,"Hello, You have chosen Mango Juice!",Toast.LENGTH_LONG).show();
                        break;
                    }



                    case R.id.Orange:
                    {
                        Toast.makeText(SideBar.this,"Hello, You have chosen Orange Juice!",Toast.LENGTH_LONG).show();
                        break;
                    }


                    case R.id.Apple:
                    {
                        Toast.makeText(SideBar.this,"Hello, You have chosen Apple Juice!",Toast.LENGTH_LONG).show();
                        break;
                    }


                    case R.id.Banana:
                    {
                        Toast.makeText(SideBar.this,"Hello, You have chosen Banana Juice!",Toast.LENGTH_LONG).show();
                        break;
                    }





                    case R.id.Avocado:
                    {
                        Toast.makeText(SideBar.this,"Hello, You have chosen Avocado Juice!",Toast.LENGTH_LONG).show();
                        break;
                    }
                }
                return false;
            }
        });





    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }

    }
}