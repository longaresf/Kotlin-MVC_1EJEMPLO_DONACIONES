package com.example.mvc_1ejemplo_donaciones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.mvc_1ejemplo_donaciones.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
// 1 REFERENCIAMOS A BINDING
    private ActivityMainBinding mBinding;
    // 2 Hacer REFERENCIA AL CONTROLLER QUIEN SE COMUNICA CON EL MODEL
    private  Controller controller;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //inflar la vista
        mBinding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        //INICIALIZAR CONTROLER IMPORTANTE!
        controller = new Controller();
        mBinding.button.setOnClickListener(view -> MakeDonation());
    }



    // ESTE MÉTODO SE COMUNICA CON EL CONTROLLER GUARDA Y MUESTRA LA INFORMACIÓN
    private void MakeDonation() {
        boolean donation = controller.saveDonation(mBinding.tvDonation.getText().toString());
        if (donation) {
            int totalDonation = controller.totalDonation();
            String total = getString(R.string.total_donaciones, String.valueOf(totalDonation));
            mBinding.tvTotal.setText(total);
            mBinding.tvDonation.setText("");
        } else {
        showMessage("Donacion Fallida");
    }}


    // MÉTODO QUE ENVIA MENSAJE
    private void showMessage(String message){
        Toast.makeText(this, message,Toast.LENGTH_LONG).show();
    }
}