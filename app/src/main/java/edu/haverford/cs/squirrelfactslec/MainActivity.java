package edu.haverford.cs.squirrelfactslec;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.squirrel_info);
        Button b = (Button) findViewById(R.id.squirrel_info_button);
        Squirrel s = new Squirrel("a", "b", "c");
        SquirrelList sl = new SquirrelList();
        for (int i = 0; i < 100; i++) {
            sl.add(s);
        }

        // Add list of squirrels soon...
        ArrayList<Squirrel> squirrels = sl.asArrayList();

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), SquirrelInfoActivity.class);
                i.putExtra("name", "Haverford Black Squirrel");
                startActivity(i);
            }
        });
    }

}
