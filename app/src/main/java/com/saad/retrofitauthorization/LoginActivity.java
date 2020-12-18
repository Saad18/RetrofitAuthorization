package com.saad.retrofitauthorization;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.saad.retrofitauthorization.module.Login;
import com.saad.retrofitauthorization.module.Token;
import com.saad.retrofitauthorization.service.ApiClient;
import com.saad.retrofitauthorization.service.ClientMethod;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "Something" ;
    private EditText userName;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         userName = findViewById(R.id.username);
         password = findViewById(R.id.password);

        findViewById(R.id.login).setOnClickListener(v -> {

            doLogin();
//            startActivity(new Intent(LoginActivity.this, InsertActivity.class));

        });

    }

    //public static String token;

    private void doLogin() {
        String user_name = userName.getText().toString();
        String user_password = password.getText().toString();

        if (user_name.isEmpty()){
            userName.setError("Required Field..");

            return;
        }
        if (user_password.isEmpty()){
            password.setError("Required Field..");

            return;
        }

        Login login = new Login(user_name, user_password);
        ClientMethod clientMethod = ApiClient.getClient().create(ClientMethod.class);
        Call<Token> call = clientMethod.login(login);
        call.enqueue(new Callback<Token>() {
            @Override
            public void onResponse(@NonNull Call<Token> call, @NonNull Response<Token> response) {
                if (response.isSuccessful()){
                    Toast.makeText(LoginActivity.this,
                            response.body().getToken(), Toast.LENGTH_LONG).show();

                    ApiClient.token = response.body().getToken();

//                    String token = response.body().getToken();
//                    Intent i = new Intent(LoginActivity.this, InsertActivity.class);
//
//                    // pass token string through Intent
//                    i.putExtra("TOKEN_STRING", token);
//
//                    startActivity(i);
                    startActivity(new Intent(LoginActivity.this, InsertActivity.class));

                }else {

                    Toast.makeText(LoginActivity.this,
                            "Login is not success:(", Toast.LENGTH_LONG).show();
                }

            }

            @Override
            public void onFailure(@NonNull Call<Token> call, @NonNull Throwable t) {
                Log.d(TAG, "onFailure: "+ t.getMessage());

            }
        });
    }
}