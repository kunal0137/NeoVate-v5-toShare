package com.example.administrator.neovate_v5;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Administrator on 12/26/2015.
 */
public class InfantHistory extends Activity{
    private TextView textPosition;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infant_history);
        Intent iin= getIntent();
        Bundle b = iin.getExtras();
        textPosition = (TextView) findViewById(R.id.infantPosition);

        if(b!=null)
        {
            int pos = (int) b.get("position");
            textPosition.setText(String.valueOf(pos));

        }


    }
}
