package in.incubateapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity

{


    ViewFlipper mViewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setTitle("");

        mViewFlipper = (ViewFlipper) findViewById(R.id.flip);
        mViewFlipper.setAutoStart(true);
        mViewFlipper.setFlipInterval(2000);
        mViewFlipper.startFlipping();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            super.onBackPressed();
        }
    }

    public void openLoginScreen(View view){
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.END)) {
            drawer.closeDrawer(GravityCompat.END);
        } else {
            drawer.openDrawer(GravityCompat.END);
        }
    }

    public void onStudentLogin(View v){

        Intent intent = new Intent(MainActivity.this,ogin.class);
        intent.putExtra("type","1");
        startActivity(intent);
    }

    public void onAdminLogin(View v){

        Intent intent = new Intent(MainActivity.this,ogin.class);
        intent.putExtra("type","2");
        startActivity(intent);
    }

    public void onParentLogin(View v){

        Intent intent = new Intent(MainActivity.this,ogin.class);
        intent.putExtra("type","3");
        startActivity(intent);
    }

    public void onTeacherLogin(View v){

        Intent intent = new Intent(MainActivity.this,ogin.class);
        intent.putExtra("type","4");
        startActivity(intent);
    }
}
