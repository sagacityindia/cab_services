package com.sagacity.sharecabs.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sagacity.sharecabs.R;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        getSupportActionBar().setTitle(getString(R.string.login));
        getSupportActionBar().hide();
        ((Button) findViewById(R.id.login)).setOnClickListener(this);
        ((TextView) findViewById(R.id.register)).setOnClickListener(this);
        ((TextView) findViewById(R.id.forgetpass)).setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int id=view.getId();
        switch (id)
        {
            case R.id.login:
                Intent intent=new Intent(this,All_CabsActivity.class);
//                intent.putExtra("personName","Guest");
//                intent.putExtra("personPhotoUrl","");
                startActivity(intent);
                break;
            case R.id.register:
                intent = new Intent(LogInActivity.this, RegistrationActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
                break;
            case R.id.forgetpass:
                intent = new Intent(LogInActivity.this, SettingsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_left);
                break;
                //               finish();
            default:
                break;
        }

    }
}
