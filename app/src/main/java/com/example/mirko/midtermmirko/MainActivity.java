package com.example.mirko.midtermmirko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Fragment1.Activity{

    private Button Comment;
    private Button Contact;
    private TextView textView;

    @Override
    public void addComment(String name, String comment) {
        ListView listView = (ListView) findViewById(R.id.lstComments);
        TextView textView = (TextView) findViewById(R.id.txtTest);
        //listView.setText(name.toString());
        textView.setText(name);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Contact = (Button)findViewById(R.id.btnContact);
        Comment = (Button)findViewById(R.id.btnComment);

        Comment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(getApplicationContext(), "Mirko Edelinski", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent (MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}
