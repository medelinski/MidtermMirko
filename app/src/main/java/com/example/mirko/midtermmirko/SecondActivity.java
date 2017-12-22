package com.example.mirko.midtermmirko;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements Fragment1.Activity {

    private Button Submit;
    private EditText Name;
    private EditText Comment;
    public TextView textView;

    @Override
    public void addComment(String name, String comment) {
        Fragment1 fragOne = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.fragment9);
        ListView listView = (ListView) findViewById(R.id.lstComments);
        TextView textView = (TextView)findViewById(R.id.txtTest);
        //listView.setText(name.toString());
        textView.setText(name);

        //fragOne.setListText(name,comment);
        setListText(name, comment);
    }
    public void setListText(String name, String comment){
        TextView textView = (TextView)findViewById(R.id.txtTest);
        textView.setText(name + comment);
    }
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
