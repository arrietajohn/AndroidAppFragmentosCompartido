package co.gov.mintic.misiontic.ciclo4.usa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void abrirActividad(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}