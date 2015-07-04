package com.example.jozko.chemik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jozko.chemik.chemia.Pomocky;

import java.util.HashMap;

public class Oxidy extends Activity {

    HashMap<String, HashMap <String, String>> koncovky;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        koncovky = new HashMap<>();
        HashMap<String, String> koncovky1 = new HashMap<String, String>();
        koncovky1.put("1", "naty");
        koncovky1.put("2", "icity");
        koncovky1.put("3", "ovy");
        koncovky1.put("4", "icely");

        HashMap<String, String> koncovky2 = new HashMap<String, String>();
        koncovky2.put("1", "ny");
        koncovky2.put("3", "ity");
        koncovky2.put("5", "icny");
        koncovky2.put("7", "isty");

        koncovky.put("1", koncovky1);
        koncovky.put("2", koncovky2);

        setContentView(R.layout.activity_oxidy);

        findViewById(R.id.prelozButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String znacka = ((EditText)findViewById(R.id.prvok1)).getText().toString();

                String kon1 = ((EditText)findViewById(R.id.index1)).getText().toString();
                String kon2 = ((EditText)findViewById(R.id.index2)).getText().toString();
                if (kon1.equals("")) {
                    kon1 = "1";
                }

                if (kon2.equals("")) {
                    kon2 = "1";
                }
                if (znacka.equals("")) {
                    ((TextView)findViewById(R.id.vysledok)).setText("CHYBA!!!");
                }

                String koncovka = koncovky.get(kon1).get(kon2);

                ((TextView)findViewById(R.id.vysledok)).setText("Oxid " + Pomocky.prvky.get(znacka).getPredpona1() + koncovka);
            }
        });
        findViewById(R.id.vymazButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.vysledok)).setText("");
                ((EditText)findViewById(R.id.prvok1)).setText("");
                ((TextView)findViewById(R.id.index1)).setText("");
                ((TextView)findViewById(R.id.index2)).setText("");
            }
        });

    }

}
