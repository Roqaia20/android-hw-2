package com.example.newhw2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class cv extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView infoname = findViewById(R.id.infoname);
        TextView infoage = findViewById(R.id.infoage);
        TextView infojob = findViewById(R.id.infojob);
        TextView infophone = findViewById(R.id.infophone);
        TextView infoemail = findViewById(R.id.infoemail);
        Button email = findViewById(R.id.button);

        Bundle bundle = getIntent().getExtras();
        String name3 = bundle.getString("name");
        String age3 = bundle.getString("age");
        String job3 = bundle.getString("job");
        String phone3 = bundle.getString("phone");
        String email3 = bundle.getString("email");

        infoname.setText(name3);
        infoage.setText(age3);
        infojob.setText(job3);
        infophone.setText(phone3);
        infoemail.setText(email3);

        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("")));
            }
        });
    }











}
