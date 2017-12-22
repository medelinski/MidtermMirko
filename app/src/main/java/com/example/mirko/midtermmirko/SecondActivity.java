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
    private EditText Name;
    private EditText Comment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Name = (EditText)findViewById(R.id.txtName);
        Comment = (EditText)findViewById(R.id.txtComment);
        Submit = (Button)findViewById(R.id.btnSubmit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), Name.getText().toString()+ " " +Comment.getText().toString() , Toast.LENGTH_SHORT).show();

                Intent intent = new Intent (SecondActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
