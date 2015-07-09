package com.example.jozko.chemik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jozko.chemik.chemia.Pomocky;
import com.example.jozko.chemik.chemia.Prvok;

import java.util.HashMap;


public class Soli extends Activity {
    int oxid1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_soli);

        final int[] oxid2 = new int[1];

        final HashMap <String, Integer> oxidator1 = new HashMap<String, Integer>();
        oxidator1.put("Na", 1);
        oxidator1.put("K", 1);
        oxidator1.put("Mg", 2);
        oxidator1.put("Al", 3);
        oxidator1.put("Ag", 1);
        oxidator1.put("Be", 2);
        oxidator1.put("B", 3);



        final HashMap <Integer, String> priponator1 = new HashMap<Integer, String>();
        priponator1.put(1, "nan");
        priponator1.put(2, "natan");
        priponator1.put(3, "itan");
        priponator1.put(4, "icitan");
        priponator1.put(5, "icnan");
        priponator1.put(6, "an");
        priponator1.put(7, "istan");
        priponator1.put(8, "icelan");

        final HashMap <Integer, String> priponator2 = new HashMap<Integer, String>();
        priponator2.put(1, "ny");
        priponator2.put(2, "naty");
        priponator2.put(3, "ity");
        priponator2.put(4, "icity");
        priponator2.put(5, "icny");
        priponator2.put(6, "ovy");
        priponator2.put(7, "isty");
        priponator2.put(8, "icely");



        findViewById(R.id.b1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text1 = ((EditText)findViewById(R.id.t1)).getText().toString();
                String text2 = ((EditText)findViewById(R.id.t2)).getText().toString();
                String i1 = ((EditText)findViewById(R.id.i1)).getText().toString();
                if (i1.equals("")) {
                  i1 = "1";
                }
                int index1 = Integer.parseInt(i1);
                String i2 = ((EditText)findViewById(R.id.i2)).getText().toString();
                if (i2.equals("")) {
                    i2 = "1";
                }
                int index2 = Integer.parseInt(i2);
                String i3 = ((EditText)findViewById(R.id.i3)).getText().toString();
                if (i3.equals("")) {
                    i3 = "1";
                }
                int index3 = Integer.parseInt(i3);

                if (index3 > 1) {
                    oxid1 = index3;
                }
                else {
                    oxid1 = oxidator1.get(text1);
                }

                oxid2[0] = index1 * oxid1/ index3;

                int kys = index2 * 2 - oxid2[0];

                String cast1 = Pomocky.prvky.get(text2).getPredpona1() + priponator1.get(kys);
                String cast2 =Pomocky.prvky.get(text1).getPredpona1() + priponator2.get(oxid1);

                if (index3 < 2) {
                    ((TextView)findViewById(R.id.zat1)).setText("");
                    ((TextView)findViewById(R.id.zat2)).setText("");
                }

                ((TextView)findViewById(R.id.texticek)).setText(cast1 + " " + cast2);

            }
        });
        /*findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText)findViewById(R.id.t1)).setText("");
                ((EditText)findViewById(R.id.t2)).setText("");
                ((EditText)findViewById(R.id.t3)).setText("");
                ((EditText)findViewById(R.id.i1)).setText("");
                ((EditText)findViewById(R.id.i2)).setText("");
                ((EditText)findViewById(R.id.i3)).setText("");
                ((TextView)findViewById(R.id.zat1)).setText(")");
                ((TextView)findViewById(R.id.zat2)).setText("(");
            }
        });*/
    }
}
