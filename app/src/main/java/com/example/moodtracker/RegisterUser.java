package com.example.moodtracker;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.moodtracker.ui.login.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;


public class RegisterUser extends AppCompatActivity implements View.OnClickListener {

    private TextView banner;


    // ***** Variables for registering ******
    // User Information used to create a new account
    private EditText editTextEmail, editTextFirstname, editTextLastname, editTextPassword, editTextPasswordCheck;
//    private Button registerButton;
    private ProgressBar progressBar;
    //  For connecting with Fire base
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //button for going back to th e sign in screen
        Button signInButton = findViewById(R.id.signin_from_register);
        signInButton.setOnClickListener(this);


        //***** FireBase authentication *****
        mAuth = FirebaseAuth.getInstance();

        Button registerButton = findViewById(R.id.register_register_button);
        registerButton.setOnClickListener(this);

        banner = (TextView) findViewById(R.id.register_logo);
        banner.setOnClickListener(this);

        //***** Banners *****
        // Button to submit register


        //***** Banners *****
        //Variables getting the user information
        editTextEmail = (EditText) findViewById(R.id.register_Email);
        editTextFirstname = (EditText) findViewById(R.id.register_first_name);
        editTextLastname = (EditText) findViewById(R.id.register_last_name);
        editTextPassword = (EditText) findViewById(R.id.register_password);
        editTextPasswordCheck = (EditText) findViewById(R.id.register_verify_password);

        //****** Progress Bar ******
        //Need to look into this as nothing was made for progress bar
        progressBar = (ProgressBar) findViewById(androidx.transition.R.id.progress_circular);
        //  The listener to change activities t the register page.
//        signInButton.setOnClickListener(new View.OnClickListener() {});
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            // May need to make a different button for banner?
            case R.id.register_logo:
                startActivity(new Intent(this,MainActivity.class));
            case R.id.signin_from_register:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.register_register_button:
                registerUser();
                break;
        }
    }

    private void registerUser() {
        // Getting the values from the entry fields and turning them into String
        String firstName = editTextFirstname.getText().toString().trim();
        String lastName = editTextLastname.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String passwordVerify = editTextPasswordCheck.getText().toString().trim();

        // ****** Verifying the fields are not empty ******

        // ** Checking for firstname
        if(firstName.isEmpty()){
            editTextFirstname.setError("Please provide firstname");
            editTextFirstname.requestFocus();
            return;
//                    editTextFirstname.setTextColor(@ColorInt int FF0000)
        }
        // ** Checking for lastname
        if(lastName.isEmpty()){
            editTextLastname.setError("Please provide lastname");
            editTextLastname.requestFocus();
            return;
        }
        // ** checking for email existing and validation
        if(email.isEmpty()){
            editTextEmail.setError("Must provide an email");
            editTextEmail.requestFocus();
            return;
        }
        if(Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("The e-mail provided is invalid");
            editTextEmail.requestFocus();
            return;
        }
        // ** Checking the password is exist, is long enough
        // ** and of the password and verification match
        if(email.isEmpty()){
            editTextPassword.setError("Password field is empty");
            editTextPassword.requestFocus();
            return;
        }
        //
        if(email.length() < 6){
            editTextPassword.setError("Password must longer than 6 characters");
            editTextPassword.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPasswordCheck.setError("You must verify your password");
            editTextPasswordCheck.requestFocus();
            return;
        }
        // Checking if the password and the verify password match
        if(password != passwordVerify ){
            editTextPasswordCheck.setError("Passwords do not match");
            editTextPasswordCheck.requestFocus();
            editTextPassword.requestFocus();
            return;
        }
    }

//    private void changeActivityToSignIN(){
//        Intent intent = new Intent(this, LoginActivity.class);
//        startActivity(intent);
//    }
//
//    @Override
//    public void onPointerCaptureChanged(boolean hasCapture) {
//        super.onPointerCaptureChanged(hasCapture);
//    }
}
