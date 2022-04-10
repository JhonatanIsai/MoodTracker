package com.example.moodtracker.ui.login;

import androidx.annotation.NonNull;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.moodtracker.ui.home.MainActivity;
import com.example.moodtracker.R;
import com.example.moodtracker.ui.register.RegisterUser;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    /** ****** variables used for the interface ******
     * Button for to move to register
     * Entry fields
    */
    private TextView register;
    private EditText editTextEmail, editTextPasswords;

    // Button used to send the sign in request
    private Button signInButton;

    // For use with firebase
    private FirebaseAuth mAuth;

    /*** initializes variables */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // ****** Calling the UI that first displays on start up ******
        super.onCreate(savedInstanceState);
            // We will use call the login UI
        setContentView(R.layout.activity_login);

        // Initialize button to link with ID
        register = findViewById(R.id.register_from_login1);
        register.setOnClickListener(this);

        // Sign ib button
        signInButton = findViewById(R.id.login_login_button);
        signInButton.setOnClickListener(this);

        //  fields to enter email and password
        editTextEmail = findViewById(R.id.login_username_field);
        editTextPasswords = findViewById(R.id.login_password_field);

        // initialize firebase instance
        mAuth = FirebaseAuth.getInstance();
    }

//    ****** switch to respond to different buttons ******
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

    /** ****** Login Function  ******
          This function will take care if the sign-in activities.
          Will contact firebase and request to log-in.
          Will pass email and password.
      */
    private void userLogin() {
        // variables get and trim the text from the input fields
        // We trim to get rid of any extra white space at the beginning or end
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPasswords.getText().toString().trim();

        // Checking the entry fields for compliance.
        if(email.isEmpty()){
            editTextEmail.setError("Please enter valid email");
            editTextEmail.requestFocus();
            return;
        }
        if(!Patterns.EMAIL_ADDRESS.matcher(email).matches()){
            editTextEmail.setError("Please enter valid email");
            editTextEmail.requestFocus();
            return;
        }
        if(password.isEmpty()){
            editTextPasswords.setError("Enter a valid password");
            editTextPasswords.requestFocus();
            return;
        }
        if(password.length() < 6){
            editTextPasswords.setError("Enter a valid password");
            editTextPasswords.requestFocus();
            return;
        }
        /** Actually calls the to firebase to make the request
         *  If the user signs-in correctly they will be redirected to the main page
         *  If the sign in is not successful an error will be provided
         *  */
        this.mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                } else {
                    // Toast lets user know their information is not orrect
                    Toast.makeText(LoginActivity.this, "Failed to sign-in. Email or password are incorrect.", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}