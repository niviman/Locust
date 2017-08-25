package com.nada.locust;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //getters
        ImageButton imogen = (ImageButton) findViewById(R.id.i2);

        Toast t = new Toast(this);

        Bundle ex = getIntent().getExtras();

        //show received msg
        if (ex != null){
            String msg = ex.getString("1");
            Toast.makeText(this, msg, Toast.LENGTH_LONG);
        }

        imogen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentions = getIntent();
                intentions.putExtra("2", "Ground control to major Tom");
                setResult(RESULT_OK, intentions);
                finish();
            }
        });



    }
}
