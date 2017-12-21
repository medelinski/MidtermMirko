package com.example.mirko.midtermmirko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private Button Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Submit = (Button)findViewById(R.id.btnSubmit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Mirko Edelinski", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent (SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
