package com.example.android.tenniscounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        // find single button
        Button single =(Button)findViewById( R.id.Single );
        single.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Single = new Intent(MainActivity.this, PlayersActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("VAL", 0);

                Single.putExtras(bundle);

                // Start the new activity
                startActivity(Single);
            }
        } );
        // find double button
        Button Double =(Button)findViewById( R.id.Double );
        Double.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Double = new Intent(MainActivity.this, PlayersActivity.class);
                Bundle bundle = new Bundle();
                bundle.putInt("VAL", 1);

                Double.putExtras(bundle);
                //Start the new activity
                startActivity(Double);

            }
        } );
    }


}
