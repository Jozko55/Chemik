package com.example.jozko.chemik;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;


public class Kyseliny extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyseliny);


       final  HashMap <String, String> predpona = new HashMap<String, String>();
        final HashMap <Integer, String> pripona = new HashMap<Integer, String>();

        pripona.put(1, "na");
        pripona.put(2, "nata");
        pripona.put(3, "ita");
        pripona.put(4, "icita");
        pripona.put(5, "icna");
        pripona.put(6, "ova");
        pripona.put(7, "ista");
        pripona.put(8, "icela");

        predpona.put("S", "sir");
        predpona.put("N", "dus");
        predpona.put("K", "dras");
        predpona.put("Cl", "chlor");
        predpona.put("Na", "sod");
        predpona.put("Fe", "zelez");
        predpona.put("Li", "lit");
        predpona.put("C", "uhol");

        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String index1 = String.valueOf(((EditText) findViewById(R.id.i1)).getText());
                if (index1.equals("")) {
                    index1 = "1";
                }
                int a = Integer.parseInt(index1);
                String index2 = String.valueOf(((EditText) findViewById(R.id.i2)).getText());

                if (index2.equals("")) {
                    index2 = "1";
                }
                int b = Integer.parseInt(index2);
                int x = 2 * b - a;
                String z = String.valueOf(((EditText) findViewById(R.id.t2)).getText());
                ((TextView) findViewById(R.id.texticek)).setText("Kyselina " + predpona.get(z) + pripona.get(x));


            }

        });
    };
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
