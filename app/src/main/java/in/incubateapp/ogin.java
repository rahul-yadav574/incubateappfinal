package in.incubateapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ogin);


        int type = Integer.parseInt(getIntent().getStringExtra("type"));

        if (type==1){
            //student login
        }else if (type==2){
            //admin
        }else if (type==3){
            //parent
        }else if (type==4){
            //teacher
        }


        findViewById(R.id.loginButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ogin.this,StudentMain.class);
                startActivity(intent);
            }
        });


    }



}
