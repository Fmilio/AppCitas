package com.devst.appcitas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dashboard);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.dashboard), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        findViewById(R.id.btnRegisterAppointment).setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, ActivityNewAppointment.class);
            startActivity(intent);
        });

        findViewById(R.id.btnViewAppointments).setOnClickListener(v -> {
            Intent intent = new Intent(DashboardActivity.this, AppointmentsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.btnViewAllAppointments).setOnClickListener(v -> {
            // Puedes hacer que también abra la lista completa
            Intent intent = new Intent(DashboardActivity.this, AppointmentsActivity.class);
            startActivity(intent);
        });
    }
}
