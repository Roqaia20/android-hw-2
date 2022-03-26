package com.example.newhw2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText name = findViewById(R.id.name);
        EditText age = findViewById(R.id.age);
        EditText job = findViewById(R.id.job);
        EditText phone = findViewById(R.id.phone);
        EditText email = findViewById(R.id.email);
        Button next = findViewById(R.id.next);





       next.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(name.getText().toString().isEmpty()) {
                   name.setError("Enter your name");
               }
               else if(age.getText().toString().isEmpty()){
                   age.setError("Enter your age");
               }
               else if(job.getText().toString().isEmpty()){
                   job.setError("Enter your job");
               }
               else if(phone.getText().toString().isEmpty()){
                   phone.setError("Enter your phone");
               }
               else if(email.getText().toString().isEmpty()){
                   email.setError("Enter you email");
               }
               else {
                   Intent intent = new Intent(MainActivity.this, cv.class);
                   String name2 = name.getText().toString();
                   String age2 = age.getText().toString();
                   String job2 = job.getText().toString();
                   String phone2 = phone.getText().toString();
                   String email2 = email.getText().toString();
                   intent.putExtra("name",name2);
                   intent.putExtra("age",age2);
                   intent.putExtra("job",job2);
                   intent.putExtra("phone",phone2);
                   intent.putExtra("email",email2);
                   startActivity(intent);






               }
           }
       });

    }
}