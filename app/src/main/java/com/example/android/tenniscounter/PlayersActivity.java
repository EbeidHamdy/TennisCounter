package com.example.android.tenniscounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;


public class PlayersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_players );
        Bundle bun = getIntent().getExtras();
        int val = bun.getInt( "VAL" );
        if (val == 1) {
            EditText Player3 = (EditText) findViewById( R.id.player_3 );
            Player3.setVisibility( View.VISIBLE );
            EditText Player4 = (EditText) findViewById( R.id.player_4 );
            Player4.setVisibility( View.VISIBLE );
        }
       EditText player_1= findViewById( R.id.player_1 );
        EditText player_2 = findViewById( R.id.player_2 );
        EditText player_3= findViewById( R.id.player_3);
        EditText player_4 = findViewById( R.id.player_4 );


    }
        public void Start(View view){
            Intent Score = new Intent(PlayersActivity.this, ScoreActivity.class);
            EditText player_1= findViewById( R.id.player_1 );
            EditText player_2 = findViewById( R.id.player_2 );
            EditText player_3= findViewById( R.id.player_3);
            EditText player_4 = findViewById( R.id.player_4 );
            Score.putExtra( "Player1",player_1.getText().toString() );
            Score.putExtra( "Player2",player_2.getText().toString() );
            Score.putExtra( "Player3",player_3.getText().toString() );
            Score.putExtra( "Player4",player_4.getText().toString() );
            startActivity( Score );
        }
}
