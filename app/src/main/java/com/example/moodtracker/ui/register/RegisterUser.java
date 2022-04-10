/** ************************************************************************
 * For questions about code and other stuff regarding this file ask Jhonatan
 * *************************************************************************
 *  */


package com.example.moodtracker.ui.register;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moodtracker.R;
import com.example.moodtracker.ui.home.MainActivity;
import com.example.moodtracker.ui.login.LoginActivity;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;


public class RegisterUser extends AppCompatActivity implements View.OnClickListener {

    private TextView banner;


    // ***** Variables for registering ******
    // User Information used to create a new account
    private EditText editTextEmail, editTextFirstname, editTextLastname, editTextPassword, editTextPasswordCheck;
//    private Button registerButton;
    private ProgressBar progressBar;
    //  For connecting with Fire base
    private FirebaseAuth mAuth;

    private boolean userAdded;


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
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.signin_from_register:
                startActivity(new Intent(this,LoginActivity.class));
                break;
            case R.id.register_register_button:
                registerUser();
                if(userAdded){
                    startActivity(new Intent(this,MainActivity.class));

                }

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
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("The e-mail provided is invalid");
            editTextEmail.requestFocus();
            return ;
        }
        // ** Checking the password is exist, is long enough
        // ** and of the password and verification match
        if(password.isEmpty()){
            editTextPassword.setError("Password field is empty");
            editTextPassword.requestFocus();
            return;
        }
        //
        if(password.length() < 6){
            editTextPassword.setError("Password must longer than 6 characters");
            editTextPassword.requestFocus();
            return;
        }
//        progressBar.setVisibility(View.VISIBLE);

        // ** Creating new user FireBAse **
        mAuth.createUserWithEmailAndPassword(email,password)
                .addOnCompleteListener(task -> {
                    if(task.isSuccessful()){
                        // Creating new user object
                        registerUserObj user = new registerUserObj(firstName,lastName,email);
                        FirebaseDatabase.getInstance().getReference("Users")
                                .child(Objects.requireNonNull(FirebaseAuth.getInstance().getCurrentUser()).getUid())
                                .setValue(user).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful()){
//                                    Log.e(TAG, "onComplete: Failed=" + task.getException().getMessage());
                                    //Making the Toast and displaying if
                                    // registered successfully
                                    userAdded = true;
                                    Toast.makeText(
                                            RegisterUser.this,
                                            "New user has been registered",
                                            Toast.LENGTH_LONG).show();

                                }
                                else{
                                    // Showing error message as toast in the case
                                    // the registration fails
                                    Toast.makeText(
                                            RegisterUser.this,
                                            "Could not register at this time, try again later",
                                            Toast.LENGTH_LONG).show();
                                    return;
                                    // Get rig od the progress bar
                                }
                                // I tried to add a progress bar but i had trouble so i just gave up

//                                progressBar.setVisibility(View.GONE);

                            }
                        });
                    }else{
                        // Showing error message as toast in the case
                        // the registration fails
                        Toast.makeText(
                                RegisterUser.this,
                                "Could not register at this time, try again later",
                                Toast.LENGTH_LONG).show();
                        // Get rig od the progress bar
//                        progressBar.setVisibility(View.GONE);
                    }
                });

    }
}
