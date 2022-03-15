package com.example.moodtracker.ui.login;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moodtracker.MainActivity;
import com.example.moodtracker.R;
import com.example.moodtracker.RegisterUser;
import com.example.moodtracker.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView register;
    private EditText editTextEmail, editTextPasswords;

    private Button signInButton;
    private FirebaseAuth mAuth;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        register = (Button) findViewById(R.id.register_from_login1);
        register.setOnClickListener(this);

        // Sign ib button
        signInButton = (Button) findViewById(R.id.login_login_button);
        signInButton.setOnClickListener(this);

        editTextEmail =(EditText) findViewById(R.id.login_username_field);
        editTextPasswords = (EditText) findViewById(R.id.login_password_field);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.register_from_login1:
                startActivity(new Intent(this, RegisterUser.class));
                break;
            case R.id.login_login_button:
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
//                userLogin();
                break;
        }

    }

    private void userLogin() {
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPasswords.getText().toString().trim();

        mAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    // redirect user
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }
                else{
                    Toast.makeText(LoginActivity.this, "Failed to login",Toast.LENGTH_LONG).show();


                }            }
        });

    }
}