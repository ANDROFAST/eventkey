package com.androfast.server.appeventokey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView handsFree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handsFree=(TextView)findViewById(R.id.txtHandsFree);

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_HEADSETHOOK){
            handsFree.setText("Manos Libres");
            return true;
        }if(keyCode == KeyEvent.KEYCODE_VOLUME_UP){
           iniciarToast();
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void iniciarToast(){
        Toast.makeText(MainActivity.this, "Tecla Volumen",Toast.LENGTH_LONG).show();
    }


}
