package com.example.gfili.limpae;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bEntrar = (Button) findViewById(R.id.bEntrar);
        final TextView registro = (TextView) findViewById(R.id.tvRegistro);

        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent registroIntent = new Intent(MainActivity.this, RegistroActivity.class);
                MainActivity.this.startActivity(registroIntent);
            }
        });
    }

}
