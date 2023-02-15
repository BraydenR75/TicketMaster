package com.example.ticketmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    //declare variables
    double costPerTicket= 79.99;
    int numberOfTickets; // get th number selected for the UI / User
    double totalCost; // holds the cost (numOfTickets * costPerTicket)
    String groupChoice; //holds the group selected from the spinner

    //get all the views



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //get all the views
        EditText tickets = (EditText) findViewById(R.id.txtTickets);
        Spinner group = (Spinner) findViewById(R.id.txtGroup);
        Button cost = (Button) findViewById(R.id.btnCost);
        TextView result= (TextView) findViewById(R.id.txtResult);

        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "I clicked the button", Toast.LENGTH_LONG).show();
                numberOfTickets = Integer.parseInt(tickets.getText().toString());
                totalCost = numberOfTickets * costPerTicket;
                DecimalFormat df = new DecimalFormat("$###,###.##");
                groupChoice = group.getSelectedItem().toString();
                result.setText("Cost for " + groupChoice + df.format(totalCost));
            }
        });



    }
}