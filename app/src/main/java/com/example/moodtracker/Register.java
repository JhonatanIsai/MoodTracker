package com.example.moodtracker;

import android.app.Activity;

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

import com.example.moodtracker.R;

import com.example.moodtracker.ui.login.LoginViewModel;
import com.example.moodtracker.ui.login.LoginViewModelFactory;
import com.example.moodtracker.databinding.ActivityLoginBinding;

public class Register extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button signInButton = findViewById(R.id.signin_from_register);

        //  The listener to change activities t the register page.
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeActivity();
            }
        });

    }

    private void changeActivity(){
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
