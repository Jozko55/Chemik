package com.example.jozko.chemik;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jozko.chemik.chemia.Pomocky;

import java.util.HashMap;


public class Kyseliny extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kyseliny);

        final HashMap <Integer, String> pripona = new HashMap<Integer, String>();

        pripona.put(1, "na");
        pripona.put(2, "nata");
        pripona.put(3, "ita");
        pripona.put(4, "icita");
        pripona.put(5, "icna");
        pripona.put(6, "ova");
        pripona.put(7, "ista");
        pripona.put(8, "icela");

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
                ((TextView) findViewById(R.id.texticek)).setText("Kyselina " + Pomocky.prvky.get(z).getPredpona1() + pripona.get(x));


            }

        });
    };
}
