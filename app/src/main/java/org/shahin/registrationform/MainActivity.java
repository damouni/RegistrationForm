package org.shahin.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void onClickBtnRegistrationForm(View view){
        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName    = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);

        EditText edtFirstName = findViewById(R.id.edtTxtFirstName);
        EditText edtLastName = findViewById(R.id.edtTxtLastName);
        EditText edtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText("First Name : " + edtFirstName.getText().toString());
        txtLastName.setText("Last Name : " + edtLastName.getText().toString());
        txtEmail.setText("Email : " + edtEmail.getText().toString());
        Toast.makeText(this, "Registration succed", Toast.LENGTH_SHORT).show();
    }
}