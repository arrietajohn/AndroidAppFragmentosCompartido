package co.gov.mintic.misiontic.ciclo4.usa.fragmentos;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import co.gov.mintic.misiontic.ciclo4.usa.R;


public class FragmentoContadorClick extends Fragment {

    private int cuenta;
    TextView etiCuenta;
    Button botonReincio, botonContar;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.layout_fragmento_contador_click, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        etiCuenta = (TextView) view.findViewById(R.id.txtCuenta);
        botonContar = (Button) view.findViewById(R.id.btnContar);
        botonReincio = (Button) view.findViewById(R.id.btnReiniciar);
        botonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuenta++;
                actualizarContador(view);
            }
        });
        botonReincio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cuenta=0;
                actualizarContador(view);
            }
        });
    }

    public void actualizarContador(View v){
               etiCuenta.setText(cuenta+"");
    }
}