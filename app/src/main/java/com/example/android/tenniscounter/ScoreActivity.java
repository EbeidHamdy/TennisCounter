package com.example.android.tenniscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ScoreActivity extends AppCompatActivity {
    public int Set_one_Team_A = 0;
    public int Set_one_Team_B = 0;
    public int Set_Two_Team_A = 0;
    public int Set_Two_Team_B = 0;
    public int Set_Three_Team_A = 0;
    public int Set_Three_Team_B = 0;
    public int Team_A_Winning_Sets = 0;
    public int Team_B_Winning_Sets = 0;
    public int tiebreakPoints_Team_A = 0;
    public int tiebreakPoints_Team_B = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_score );
        TextView TeamA = findViewById( R.id.Team_A );
        TextView TeamB = findViewById( R.id.Team_B );
        if (getIntent().getExtras().getString( "Player3" ).isEmpty()) {
            TeamA.setText( getIntent().getExtras().getString( "Player1" ) );
            TeamB.setText( getIntent().getExtras().getString( "Player2" ) );
            StartFirstSet();
        } else {
            TeamA.setText( getIntent().getExtras().getString( "Player1" ) + "\n" + getIntent().getExtras().getString( "Player3" ) );
            TeamB.setText( getIntent().getExtras().getString( "Player2" ) + "\n" + getIntent().getExtras().getString( "Player4" ) );
            StartFirstSet();
        }
        TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
        Game_Points_Team_A.setText( "0" );
        TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
        Game_Points_Team_B.setText( "0" );
        TextView Set_1_TeamA = findViewById( R.id.Set_1_Team_A );
        Set_1_TeamA.setText( "0" );
        TextView Set_1_TeamB = findViewById( R.id.Set_1_Team_B );
        Set_1_TeamB.setText( "0" );
        Button reset = findViewById( R.id.reset );
        reset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Set_one_Team_A = 0;
                Set_one_Team_B = 0;
                Set_Two_Team_A = 0;
                Set_Two_Team_B = 0;
                Set_Three_Team_A = 0;
                Set_Three_Team_B = 0;
                Team_A_Winning_Sets = 0;
                Team_B_Winning_Sets = 0;
                TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                Game_Points_Team_A.setText( "0" );
                TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                Game_Points_Team_B.setText( "0" );
                TextView Set_1_TeamA = findViewById( R.id.Set_1_Team_A );
                Set_1_TeamA.setText( "0" );
                TextView Set_1_TeamB = findViewById( R.id.Set_1_Team_B );
                Set_1_TeamB.setText( "0" );
                TextView Set_2_TeamA = findViewById( R.id.Set_2_Team_A );
                Set_2_TeamA.setText( " " );
                TextView Set_2_TeamB = findViewById( R.id.Set_2_Team_B );
                Set_2_TeamB.setText( " " );
                TextView Set_3_TeamA = findViewById( R.id.Set_3_Team_A );
                Set_3_TeamA.setText( " " );
                TextView Set_3_TeamB = findViewById( R.id.Set_3_Team_B );
                Set_3_TeamB.setText( " " );
                StartFirstSet();
            }
        } );
        Button Team_A15 = findViewById( R.id.Team_A15 );
        Team_A15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                Game_Points_Team_A.setText( "15" );
            }
        } );
        Button Team_A30 = findViewById( R.id.Team_A30 );
        Team_A30.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                Game_Points_Team_A.setText( "30" );
            }
        } );
        Button Team_A40 = findViewById( R.id.Team_A40 );
        Team_A40.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                Game_Points_Team_A.setText( "40" );
            }
        } );
        Button Team_AAD = findViewById( R.id.Team_AAD );
        Team_AAD.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                Game_Points_Team_A.setText( "AD" );
            }
        } );
        Button Team_B15 = findViewById( R.id.Team_B15 );
        Team_B15.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                Game_Points_Team_B.setText( "15" );
            }
        } );
        Button Team_B30 = findViewById( R.id.Team_B30 );
        Team_B30.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                Game_Points_Team_B.setText( "30" );
            }
        } );
        Button Team_B40 = findViewById( R.id.Team_B40 );
        Team_B40.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                Game_Points_Team_B.setText( "40" );
            }
        } );
        Button Team_BAD = findViewById( R.id.Team_BAD );
        Team_BAD.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                Game_Points_Team_B.setText( "AD" );
            }
        } );
    }

    public void StartFirstSet() {
        Button Team_A1 = findViewById( R.id.Team_A1 );
        Team_A1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_1_TeamA = findViewById( R.id.Set_1_Team_A );
                TextView Set_1_TeamB = findViewById( R.id.Set_1_Team_B );
                String SetA = Set_1_TeamA.getText().toString();
                String SetB = Set_1_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( String.valueOf( ++tiebreakPoints_Team_A ) );
                    if (tiebreakPoints_Team_A >= 6 && tiebreakPoints_Team_A - tiebreakPoints_Team_B >= 2) {
                        Set_one_Team_A++;
                        Set_1_TeamA.setText( String.valueOf( Set_one_Team_A ) );
                        Team_A_Winning_Sets++;
                        StartSetTwo();
                    }
                } else if (Set_one_Team_A >= 6 && Set_one_Team_A - Set_one_Team_B >= 2) {
                    Team_A_Winning_Sets++;
                    StartSetTwo();
                } else {
                    Set_one_Team_A++;
                    Set_1_TeamA.setText( String.valueOf( Set_one_Team_A ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }
        } );
        Button Team_B1 = findViewById( R.id.Team_B1 );
        Team_B1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_1_TeamA = findViewById( R.id.Set_1_Team_A );
                TextView Set_1_TeamB = findViewById( R.id.Set_1_Team_B );
                String SetA = Set_1_TeamA.getText().toString();
                String SetB = Set_1_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( String.valueOf( ++tiebreakPoints_Team_B ) );
                    if (tiebreakPoints_Team_B >= 6 && tiebreakPoints_Team_B - tiebreakPoints_Team_A >= 2) {
                        Set_one_Team_B++;
                        Set_1_TeamB.setText( String.valueOf( Set_one_Team_B ) );
                        Team_B_Winning_Sets++;
                        StartSetTwo();
                    }
                } else if (Set_one_Team_B >= 6 && Set_one_Team_B - Set_one_Team_A >= 2) {
                    Team_B_Winning_Sets++;
                    StartSetTwo();
                } else {
                    Set_one_Team_B++;
                    Set_1_TeamB.setText( String.valueOf( Set_one_Team_B ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }

        } );
    }

    public void StartSetTwo() {
        tiebreakPoints_Team_A = 0;
        tiebreakPoints_Team_B = 0;
        TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
        Game_Points_Team_A.setText( "0" );
        TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
        Game_Points_Team_B.setText( "0" );
        TextView Set_2_TeamA = findViewById( R.id.Set_2_Team_A );
        Set_2_TeamA.setText( "0" );
        TextView Set_2_TeamB = findViewById( R.id.Set_2_Team_B );
        Set_2_TeamB.setText( "0" );

        Button Team_A1 = findViewById( R.id.Team_A1 );
        Team_A1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_2_TeamA = findViewById( R.id.Set_2_Team_A );
                TextView Set_2_TeamB = findViewById( R.id.Set_2_Team_B );
                String SetA = Set_2_TeamA.getText().toString();
                String SetB = Set_2_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( String.valueOf( ++tiebreakPoints_Team_A ) );
                    if (tiebreakPoints_Team_A >= 6 && tiebreakPoints_Team_A - tiebreakPoints_Team_B >= 2) {
                        Set_Two_Team_A++;
                        Set_2_TeamA.setText( String.valueOf( Set_Two_Team_A ) );
                        Team_A_Winning_Sets++;
                        if (Team_A_Winning_Sets - Team_B_Winning_Sets == 2) {
                            Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                        } else {
                            StartSetThree();
                        }
                    }
                } else if (Set_Two_Team_A >= 6 && Set_Two_Team_A - Set_Two_Team_B >= 2) {
                    Team_A_Winning_Sets++;
                    if (Team_A_Winning_Sets - Team_B_Winning_Sets == 2) {
                        Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                    } else {
                        StartSetThree();
                    }
                } else {
                    Set_Two_Team_A++;
                    Set_2_TeamA.setText( String.valueOf( Set_Two_Team_A ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }
        } );
        Button Team_B1 = findViewById( R.id.Team_B1 );
        Team_B1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_2_TeamA = findViewById( R.id.Set_2_Team_A );
                TextView Set_2_TeamB = findViewById( R.id.Set_2_Team_B );
                String SetA = Set_2_TeamA.getText().toString();
                String SetB = Set_2_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( String.valueOf( ++tiebreakPoints_Team_B ) );
                    if (tiebreakPoints_Team_B >= 6 && tiebreakPoints_Team_B - tiebreakPoints_Team_A >= 2)
                        Set_Two_Team_B++;
                    Set_2_TeamB.setText( String.valueOf( Set_Two_Team_B ) );
                    Team_B_Winning_Sets++;
                    if (Team_B_Winning_Sets - Team_A_Winning_Sets == 2) {
                        Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                    } else {
                        StartSetThree();
                    }
                } else if (Set_Two_Team_B >= 6 && Set_Two_Team_B - Set_Two_Team_A >= 2) {
                    Team_B_Winning_Sets++;
                    if (Team_B_Winning_Sets - Team_A_Winning_Sets == 2) {
                        Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                    } else {
                        StartSetThree();
                    }
                } else {
                    Set_Two_Team_B++;
                    Set_2_TeamB.setText( String.valueOf( Set_Two_Team_B ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }

        } );


    }

    public void StartSetThree() {
        tiebreakPoints_Team_A = 0;
        tiebreakPoints_Team_B = 0;
        TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
        Game_Points_Team_A.setText( "0" );
        TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
        Game_Points_Team_B.setText( "0" );
        TextView Set_3_TeamA = findViewById( R.id.Set_3_Team_A );
        Set_3_TeamA.setText( "0" );
        TextView Set_3_TeamB = findViewById( R.id.Set_3_Team_B );
        Set_3_TeamB.setText( "0" );
        Button Team_A1 = findViewById( R.id.Team_A1 );
        Team_A1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_3_TeamA = findViewById( R.id.Set_3_Team_A );
                TextView Set_3_TeamB = findViewById( R.id.Set_3_Team_B );
                String SetA = Set_3_TeamA.getText().toString();
                String SetB = Set_3_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( String.valueOf( ++tiebreakPoints_Team_A ) );
                    if (tiebreakPoints_Team_A >= 6 && tiebreakPoints_Team_A - tiebreakPoints_Team_B >= 2) {
                        Set_Three_Team_A++;
                        Set_3_TeamA.setText( String.valueOf( Set_Three_Team_A ) );
                        Team_A_Winning_Sets++;
                        if (Team_A_Winning_Sets - Team_B_Winning_Sets >= 1) {
                            Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                        } else {
                            Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                        }
                    }
                } else if (Set_Three_Team_A >= 6 && Set_Three_Team_A - Set_Three_Team_B >= 2) {
                    Team_A_Winning_Sets++;
                    if (Team_A_Winning_Sets - Team_B_Winning_Sets >= 1) {
                        Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                    } else {
                        Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                    }
                } else {
                    Set_Three_Team_A++;
                    Set_3_TeamA.setText( String.valueOf( Set_Three_Team_A ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }
        } );
        Button Team_B1 = findViewById( R.id.Team_B1 );
        Team_B1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView Set_3_TeamA = findViewById( R.id.Set_3_Team_A );
                TextView Set_3_TeamB = findViewById( R.id.Set_3_Team_B );
                String SetA = Set_3_TeamA.getText().toString();
                String SetB = Set_3_TeamB.getText().toString();
                if (SetA.equalsIgnoreCase( "6" ) && SetB.equalsIgnoreCase( "6" )) {
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( String.valueOf( ++tiebreakPoints_Team_B ) );
                    if (tiebreakPoints_Team_B >= 6 && tiebreakPoints_Team_B - tiebreakPoints_Team_A >= 2) {
                        Set_Three_Team_B++;
                        Set_3_TeamB.setText( String.valueOf( Set_Three_Team_B ) );
                        Team_B_Winning_Sets++;
                        if (Team_B_Winning_Sets - Team_A_Winning_Sets >= 0) {
                            Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                        } else {
                            Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                        }
                    }
                } else if (Set_Three_Team_B >= 6 && Set_Three_Team_B - Set_Three_Team_A >= 2) {
                    Team_B_Winning_Sets++;
                    if (Team_B_Winning_Sets - Team_A_Winning_Sets >= 0) {
                        Toast.makeText( ScoreActivity.this, "Team B Wins the match ", Toast.LENGTH_LONG ).show();
                    } else {
                        Toast.makeText( ScoreActivity.this, "Team A Wins the match ", Toast.LENGTH_LONG ).show();
                    }
                } else {
                    Set_Three_Team_B++;
                    Set_3_TeamB.setText( String.valueOf( Set_Three_Team_B ) );
                    TextView Game_Points_Team_A = findViewById( R.id.Game_Points_Team_A );
                    Game_Points_Team_A.setText( "0" );
                    TextView Game_Points_Team_B = findViewById( R.id.Game_Points_Team_B );
                    Game_Points_Team_B.setText( "0" );

                }
            }

        } );


    }

}
