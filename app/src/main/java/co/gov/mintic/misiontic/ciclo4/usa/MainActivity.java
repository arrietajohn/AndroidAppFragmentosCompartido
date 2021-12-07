package co.gov.mintic.misiontic.ciclo4.usa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void abrirActividad(View view) {
        Intent i = new Intent(this, MainActivity2.class);
        startActivity(i);
    }
}