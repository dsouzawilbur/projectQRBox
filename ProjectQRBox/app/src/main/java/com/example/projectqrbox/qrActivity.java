package com.example.projectqrbox;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class qrActivity extends AppCompatActivity {
    private TextView qrTextView;
    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_qr_data);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
        qrTextView = findViewById(R.id.qrText);
        backButton = findViewById(R.id.goBackButton);
        qrTextView.setText(message);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}