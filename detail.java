package com.example.mam;

import android.content.Intent;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detail extends AppCompatActivity {

    Protected void oncrete(Bundle SavedInstancesState);
        super oncreate(SavedInstantstate);
        setcontectview (R.layout.activity-detail);

        TextView ctname =findViewById(R.id.cname);
        TextView stname = findViewById(R.id.lastname);
        TextView mail = findViewById(R.id.email);
        TextView ph2 = findViewById(R.id.phmno);

        Bundle b = new bundle( );
        b =

    @Override
    public Intent getIntent() {
        b = getIntent().getExtras();
        String nm3 = b.getstring (key "name");
        String nm4 = b.getstring (key "name");
        String em3 = b.getstring ("email");
        int ph3 = b.getint ("phone");

        ctname.setText(nm3);
        stname.setText(nm4);
        mail.setText(em3);
        ph2.setText(phn3);
    }
}
