package com.example.jozko.chemik;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jozko.chemik.chemia.Prvok;

import java.util.HashMap;


public class Soli extends Activity {
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

    int oxid1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_soli);

        Prvok sodik = new Prvok("Sodik", "Na", "sod", "sod");
        Prvok litium = new Prvok("Litium", "Li", "lit", "lit");
        Prvok zelezo = new Prvok("Zelezo", "Fe", "zelez", "zelez");
        Prvok uhlik = new Prvok("Uhlik", "C", "uhol", "uhl");
        Prvok vodik = new Prvok("Vodik", "H", "vod", "vod");
        Prvok dusik = new Prvok("Dusik", "N", "dus", "dus");
        Prvok kyslik = new Prvok("Kyslik", "O", "kyslic", "kyslic");
        Prvok horcik = new Prvok("Horcik", "Mg", "horec", "horec");
        Prvok hlinnik = new Prvok("Hlinnik", "Al", "hlin", "hlin");
        Prvok zlato = new Prvok("Zlato", "Au", "zlat", "zlat");
        Prvok striebro = new Prvok("Striebro", "Ag", "striebor", "striebr");
        Prvok osmium = new Prvok("Osmium", "Os", "osmi", "osm");
        Prvok olovo = new Prvok("Olovo", "Pb", "olov", "olov");
        Prvok cin = new Prvok("Cin", "Sn", "cin", "cin");
        Prvok antimon = new Prvok("Antimon", "St", "antimon", "antimon");
        Prvok brom = new Prvok("Brom", "Br", "brom", "brom");
        Prvok bor = new Prvok("Bor", "B", "bor", "bor");
        Prvok jod = new Prvok("Jod", "I", "jod", "jod");
        Prvok chlor = new Prvok("Chlor", "Cl", "chlor", "chlor" );
        Prvok sira = new Prvok("Sira", "S", "sir", "sir");
        Prvok fluor = new Prvok("Fluor", "F", "fluor", "fluor");
        Prvok fosfor = new Prvok("Fosfor", "P", "fosfor", "fosfor");
        Prvok kremik = new Prvok("Kremik", "Si", "krem", "krem");
        Prvok telur = new Prvok("Telur", "Te", "telur", "telur");
        Prvok zinok = new Prvok("Zinok", "Zn", "zinoc", "zinoc");
        Prvok ortut = new Prvok("Ortut", "Hg", "ortut", "ortut");



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

        final HashMap<String, String> PREDPONY2 = new HashMap<String, String>();
        PREDPONY2.put("S", "sir");
        PREDPONY2.put("Na", "sod");
        PREDPONY2.put("C", "uhl");
        PREDPONY2.put("Mg", "horec");
        PREDPONY2.put("B", "bor");
        PREDPONY2.put("Fe", "zelez");
        PREDPONY2.put("K", "dras");
        PREDPONY2.put("Li", "lit");
        PREDPONY2.put("P", "fosfor");
        PREDPONY2.put("Cl", "clor");
        PREDPONY2.put("Si", "krem");




        final View controlsView = findViewById(R.id.fullscreen_content_controls);
        //final View contentView = findViewById(R.id.fullscreen_content);

        // Set up an instance of SystemUiHider to control the system UI for
        // this activity.
        // Upon interacting with UI controls, delay any scheduled hide()
        // operations to prevent the jarring behavior of controls going away
        // while interacting with the UI.
        //findViewById(R.id.dummy_button).setOnTouchListener(mDelayHideTouchListener);
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

                String cast1 = PREDPONY2.get(text2) + priponator1.get(kys);
                String cast2 = PREDPONY2.get(text1) + priponator2.get(oxid1);

                if (index3 < 2) {
                    ((TextView)findViewById(R.id.zat1)).setText("");
                    ((TextView)findViewById(R.id.zat2)).setText("");
                }

                ((TextView)findViewById(R.id.texticek)).setText(cast1 + " " + cast2);







            }
        });
        findViewById(R.id.b2).setOnClickListener(new View.OnClickListener() {
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
        });
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        // Trigger the initial hide() shortly after the activity has been
        // created, to briefly hint to the user that UI controls
        // are available.
        //delayedHide(100);
    }


/*    *//**
     * Touch listener to use for in-layout UI controls to delay hiding the
     * system UI. This is to prevent the jarring behavior of controls going away
     * while interacting with activity UI.
     *//*
    View.OnTouchListener mDelayHideTouchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (AUTO_HIDE) {
                delayedHide(AUTO_HIDE_DELAY_MILLIS);
            }
            return false;
        }
    };

    Handler mHideHandler = new Handler();
    Runnable mHideRunnable = new Runnable() {
        @Override
        public void run() {
            mSystemUiHider.hide();
        }
    };

    *//**
     * Schedules a call to hide() in [delay] milliseconds, canceling any
     * previously scheduled calls.
     *//*
    private void delayedHide(int delayMillis) {
        mHideHandler.removeCallbacks(mHideRunnable);
        mHideHandler.postDelayed(mHideRunnable, delayMillis);
    }*/
}
