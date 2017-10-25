package com.example.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Clase para mostrar layouts dependiendo de radioButtons en RadioGroups
 * @author Elena G (Beelzenef)
 */
public class MainActivity extends AppCompatActivity {

    private View constraintParticular;
    private View constraintCorporacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Identificando constraints
        constraintParticular = findViewById(R.id.consL_DatosParticular);
        constraintCorporacion = findViewById(R.id.consL_DatosCorporacion);
    }

    /**
     * Metodo para gestion de clicks en radiobuttons
     * @param v
     */
    public void onRadioBttonClicked(View v)
    {
        switch (v.getId())
        {
            case R.id.rdB_Corporativo:
                viewParticular(false);
                break;
            case R.id.rdB_Particular:
                viewParticular(true);
                break;
        }
    }

    /**
     * Método para ocultar o mostrar los constraints integrados con include
     * @param b
     */
    private void viewParticular (boolean b)
    {
        constraintParticular.setVisibility(b ? View.VISIBLE : View.GONE);
        constraintCorporacion.setVisibility(b ? View.GONE : View.VISIBLE);
    }
}
