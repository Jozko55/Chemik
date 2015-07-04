package com.example.jozko.chemik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import java.util.HashMap;

public class Oxidy extends Activity {
    /**
     * Whether or not the system UI should be auto-hidden after
     * {@link #AUTO_HIDE_DELAY_MILLIS} milliseconds.
     */
    private static final boolean AUTO_HIDE = true;

    /**
     * If {@link #AUTO_HIDE} is set, the number of milliseconds to wait after
     * user interaction before hiding the system UI.
     */
    private static final int AUTO_HIDE_DELAY_MILLIS = 3000;

    /**
     * If set, will toggle the system UI visibility upon interaction. Otherwise,
     * will show the system UI visibility upon interaction.
     */
    private static final boolean TOGGLE_ON_CLICK = true;



    String[][] prvky = {
            {"C", "Uhlik", "uhol"},
            {"Na", "Sodik", "sod"},
            {"H", "Vodik", "vod"},
            {"N", "Dusi", "dus"},
            {"Li", "Litium", "lit"},
            {"Fe", "Zelezo", "zelez"},
            {"Os", "Osmium", "osm"},
            {"Al", "Hlinnik", "hlin"},


    };

    HashMap<String, String[]> znacky_prvky;
    HashMap<String, HashMap <String, String>> koncovky;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        znacky_prvky = new HashMap<String, String[]>();
        for (String[] prvok : prvky) {
            String[] pole = {prvok[1], prvok[2]};
            znacky_prvky.put(prvok[0], pole);
        };

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

        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        //findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);

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

                ((TextView)findViewById(R.id.vysledok)).setText("Oxid " + znacky_prvky.get(znacka)[1] + koncovka);
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
