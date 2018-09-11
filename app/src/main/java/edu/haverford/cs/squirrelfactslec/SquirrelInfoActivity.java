package edu.haverford.cs.squirrelfactslec;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class SquirrelInfoActivity extends AppCompatActivity {
    private String mSquirrelName;
    private Squirrel mSquirrel;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squirrel_info);
        mText = (TextView) findViewById(R.id.squirrel_info);
        Intent i = getIntent();
        mSquirrelName = i.getStringExtra("name");
        mSquirrel = new Squirrel(mSquirrelName, "", "");
        showSquirrelDetails();
        Button b = (Button) findViewById(R.id.change_squirrel);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mSquirrel.setName(mSquirrel.getName() + "a");
            }
        });
    }

    protected void showSquirrelDetails() {
        mText.setText("Squirel name: " + mSquirrel.getName());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "new activity!" + mSquirrelName, Toast.LENGTH_LONG).show();
    }
}
