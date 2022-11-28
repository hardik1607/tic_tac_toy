package com.example.tic_tac_toy;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    TextView t1,t2,t3;
    int t=0,cnt=0,cnt1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
    }

    void win()
    {
        if(b1.getText().toString().equals("O") && b2.getText().toString().equals("O") && b3.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b4.getText().toString().equals("O") && b5.getText().toString().equals("O") && b6.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b7.getText().toString().equals("O") && b8.getText().toString().equals("O") && b9.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b1.getText().toString().equals("O") && b4.getText().toString().equals("O") && b7.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b2.getText().toString().equals("O") && b5.getText().toString().equals("O") && b8.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b3.getText().toString().equals("O") && b6.getText().toString().equals("O") && b9.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b1.getText().toString().equals("O") && b5.getText().toString().equals("O") && b9.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }
        else if(b7.getText().toString().equals("O") && b5.getText().toString().equals("O") && b3.getText().toString().equals("O"))
        {
            t1.setText("O is win");
        }

        else if(b1.getText().toString().equals("X") && b2.getText().toString().equals("X") && b3.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b4.getText().toString().equals("X") && b5.getText().toString().equals("X") && b6.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b7.getText().toString().equals("X") && b8.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b1.getText().toString().equals("X") && b4.getText().toString().equals("X") && b7.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b2.getText().toString().equals("X") && b5.getText().toString().equals("X") && b8.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b3.getText().toString().equals("X") && b6.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b1.getText().toString().equals("X") && b5.getText().toString().equals("X") && b9.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }
        else if(b7.getText().toString().equals("X") && b5.getText().toString().equals("X") && b3.getText().toString().equals("X"))
        {
            t1.setText("X is win");
        }

    }
    @Override
    public void onClick(View v) {
    if(v.getId()==R.id.b1)
    {
        if(b1.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b1.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b1.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }

            t++;
            win();
        }

    }

    if(v.getId()==R.id.b2)
    {
        if(b2.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b2.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b2.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b3)
    {
        if(b3.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b3.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b3.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b4)
    {
        if(b4.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b4.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b4.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b5)
    {
        if(b5.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b5.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b5.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b6)
    {
        if(b6.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b6.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b6.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b7)
    {
        if(b7.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b7.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b7.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b8)
    {
        if(b8.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b8.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b8.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }

    if(v.getId()==R.id.b9)
    {
        if(b9.getText().toString().isEmpty())
        {
            if (t % 2 == 0)
            {
                b9.setText("O");
                cnt++;
                t2.setText(""+cnt);
            }
            else
            {
                b9.setText("X");
                cnt1++;
                t3.setText(""+cnt1);
            }
            t++;
            win();
        }
    }
    }
}