package com.example.unitseven;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SendData extends AppCompatActivity {
    EditText editId, editName, editAddress;
    Button btnSubmit;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);

        setContentView(R.layout.user_details);

        editId = findViewById(R.id.userId);
        editName = findViewById(R.id.userName);
        editAddress = findViewById(R.id.userAddress);
        btnSubmit = findViewById(R.id.btnInsert);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
