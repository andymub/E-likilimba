package com.e_likilimba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.simplepass.loading_button_lib.customViews.CircularProgressButton;

public class LoginActivity  extends AppCompatActivity {

    Button btnLogin;
    EditText edtEmailId,edtPassword;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for changing status bar icon colors
        if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        }
        setContentView(R.layout.activity_login);
        btnLogin= findViewById(R.id.btnLoginButton);
        edtEmailId=findViewById(R.id.editTextEmail);
        edtPassword=findViewById(R.id.editTextLoginPassword);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                //todo de-commenter cette partie 'validateur du login
//                if(edtEmailId.getText().toString().isEmpty()) {
//                    Toast.makeText(getApplicationContext(),"enter email address",Toast.LENGTH_SHORT).show();
//
//                }else if (!(edtEmailId.getText().toString().trim().matches(emailPattern))) {
//                        Toast.makeText(getApplicationContext(),"Invalide email",Toast.LENGTH_SHORT).show();
//
//                }
//                else if (edtPassword.getText().toString().isEmpty()){
//                    Toast.makeText(getApplicationContext(),"entrer un mot de passe",Toast.LENGTH_SHORT).show();
//
//                }
//                else if (edtPassword.getText().length()<6)
//                {
//                    Toast.makeText(getApplicationContext(),"mot de passe 8 digit min",Toast.LENGTH_SHORT).show();
//
//                }
//                else{
//                    startBoardActivity();
//
//                }
                startBoardActivity();
            }
        });
    }

    public void onLoginClick(View View){
        startActivity(new Intent(this,RegisterActivity.class));
        overridePendingTransition(R.anim.slide_in_right,R.anim.stay);

    }

    public void startBoardActivity ()
    { Intent intent = new Intent(this, BoardActivity.class);
    startActivity(intent);}
}