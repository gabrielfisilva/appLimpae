package com.example.gfili.limpae;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final TextView bemVindo = (TextView) findViewById(R.id.tvBemVindo);
    }
}
