package com.nada.locust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageButton img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getters
        img = (ImageButton) findViewById(R.id.i1);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,second.class);
                intent.putExtra("1","Toasty");
                startActivityForResult(intent, 2);
            }
        });
    }






    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        String printMe;

        switch(requestCode){
            case 2:
                printMe = data.getStringExtra("2");
                Toast.makeText(this, printMe, Toast.LENGTH_LONG);
        }


    }
}
