package com.example.jozko.chemik;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Chemik extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemik);
            Intent intent = getIntent();
            final String value = intent.getStringExtra("key"); //if it's a string you stored.


        findViewById(R.id.kyselina_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(Chemik.this, Kyseliny.class);
                myIntent.putExtra("key", value); //Optional parameters
                Chemik.this.startActivity(myIntent);
            }
        });

        findViewById(R.id.soli_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(Chemik.this, Soli.class);
                myIntent.putExtra("key", value); //Optional parameters
                Chemik.this.startActivity(myIntent);
            }
        });

        findViewById(R.id.oxidy_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent myIntent = new Intent(Chemik.this, Oxidy.class);
                myIntent.putExtra("key", value); //Optional parameters
                Chemik.this.startActivity(myIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_chemik, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
