package com.example.mirko.midtermmirko;

/**
 * Created by Mirko on 2017-12-20.
 */
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import java.util.zip.Inflater;

public class Fragment1 extends Fragment {

    private Button Submit;
    private EditText Name;
    private EditText Comment;

    FragmentListener activityCommander;

    public interface  FragmentListener{
        public void addComment(String name, String comment);
    }

   @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (FragmentListener) activity;
        }catch(ClassCastException e){
                throw new  ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        Submit = (Button)view.findViewById(R.id.btnSubmit);
        Name = (EditText)view.findViewById(R.id.txtName);
        Comment = (EditText)view.findViewById(R.id.txtComment);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clicked(view);
            }
        });

        return view;
    }

    public void clicked (View view){
        activityCommander.addComment(Name.getText().toString(), Comment.getText().toString());
    }
}
