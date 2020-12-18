package com.saad.retrofitauthorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.saad.retrofitauthorization.module.CvFile;
import com.saad.retrofitauthorization.module.MainObjectClass;
import com.saad.retrofitauthorization.resopnse.MainResponseObjectClass;
import com.saad.retrofitauthorization.service.ApiClient;
import com.saad.retrofitauthorization.service.ClientMethod;

import java.util.UUID;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InsertActivity extends AppCompatActivity {

    private EditText mName;
    private EditText mEmail;
    private EditText mPhone;
    private EditText mFull_address;
    private EditText mName_of_university;
    private EditText mGraduation_year;
    private EditText mCgpa;
    private EditText mExperience_in_months;
    private EditText mCurrent_work_place_name;
    private EditText mApplying_in;
    private EditText mExpected_salary;
    private EditText mField_buzz_reference;
    private EditText mGithub_project_url;

    CvFile cvFile;
    MainObjectClass mainObject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert);

        init();

        findViewById(R.id.sendBtn).setOnClickListener(v ->
                insertData()
        );

    }

    private void init(){
       mName = findViewById(R.id.name_id);
       mEmail = findViewById(R.id.email_id);
       mPhone = findViewById(R.id.phone_id);
       mFull_address = findViewById(R.id.full_address_id);
       mName_of_university = findViewById(R.id.name_of_university_id);
       mGraduation_year = findViewById(R.id.graduation_id);
       mCgpa = findViewById(R.id.cgpa_id);
       mExperience_in_months = findViewById(R.id.experience_id);
       mCurrent_work_place_name = findViewById(R.id.workplace_id);
       mApplying_in = findViewById(R.id.applying_in_id);
       mExpected_salary = findViewById(R.id.expected_salary_id);
       mField_buzz_reference = findViewById(R.id.reference_id);
       mGithub_project_url = findViewById(R.id.github_url_id);

   }

    private void insertData() {

        String name = mName.getText().toString().trim();
        String email = mEmail.getText().toString().trim();
        String phone = mPhone.getText().toString().trim();
        String full_address = mFull_address.getText().toString().trim();
        String name_of_university = mName_of_university.getText().toString().trim();
        long graduation_year = Integer.parseInt(mGraduation_year.getText().toString().trim());
        double cgpa = Double.parseDouble(mCgpa.getText().toString().trim()) ;
        long experience_in_months = Integer.parseInt(mExperience_in_months.getText().toString().trim());
        String current_work_place_name = mCurrent_work_place_name.getText().toString().trim();
        String applying_in = mApplying_in.getText().toString().trim();
        long expected_salary =  Integer.parseInt(mExpected_salary.getText().toString().trim()) ;
        String field_buzz_reference = mField_buzz_reference.getText().toString().trim();
        String github_project_url = mGithub_project_url.getText().toString().trim();

        long creationTime= System.currentTimeMillis();
        long updateTime= System.currentTimeMillis();

        //String token = LoginActivity.token;
        //Intent intent = getIntent();
        // declare token as member variable
//        String token = intent.getStringExtra("TOKEN_STRING");

        String CvUniqueId = UUID.randomUUID().toString();
        String tsync_id = UUID.randomUUID().toString();



        cvFile = new CvFile(CvUniqueId);
        mainObject = new MainObjectClass(tsync_id, name, email, phone, full_address, name_of_university, graduation_year, cgpa, experience_in_months,
                current_work_place_name, applying_in, expected_salary,field_buzz_reference, github_project_url, cvFile, creationTime, updateTime);

        ClientMethod clientMethod = ApiClient.getClient().create(ClientMethod.class);
        Call<MainResponseObjectClass> call = clientMethod.getValue(mainObject);

        call.enqueue(new Callback<MainResponseObjectClass>() {
            @Override
            public void onResponse(@NonNull Call<MainResponseObjectClass> call, @NonNull Response<MainResponseObjectClass> response) {
                if (response.isSuccessful()){
                    Toast.makeText(InsertActivity.this, response.body().getTsyncId(), Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(InsertActivity.this, "access denied:(",Toast.LENGTH_LONG).show();
                    Log.d("ErrorCode", "onResponse: " + response.code());
                }

            }

            @Override
            public void onFailure(@NonNull Call<MainResponseObjectClass> call, @NonNull Throwable t) {
                Log.d("Error", "onFailure: " + t.getMessage());

            }
        });





    }


}