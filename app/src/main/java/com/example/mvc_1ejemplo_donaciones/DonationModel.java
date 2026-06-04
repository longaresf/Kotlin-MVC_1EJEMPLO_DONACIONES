package com.example.mvc_1ejemplo_donaciones;

public class DonationModel {

    // MODELO TIENE LA LÓGICA DEL NEGOCIO / EN ESTE CASO GUARDAR UNA DONACIÓN Y LAS SUMA AL TOTAL
    // 1.DECLARAMOS VARIABLE QUE HACE REFRENCIA AL DATO DE ENTRADA
    private int donationAmount;

    // 2-CONSTRUCTOR CON PARAMETROS DONATIONMODEL SE CONTRUYE POR MEDIO DE UNA DONACIÓN
    public DonationModel(int donationAmount) {
        this.donationAmount = donationAmount;
    }

    // INICIALIZAMOS LA DONACIÓN EN 0
    public DonationModel() {
        this.donationAmount = 0;
    }
    // 3 CREAMOS UN MÉTODO QUE RECIBE UNA DONACIÓN Y SE CONVIERTE EL DATO STRIN EN INT

    public boolean saveDonation(String donation) {
        Integer amount = Integer.valueOf(donation);
        if (amount <= 0) {
            return false;
        } else {
            this.donationAmount += amount;
            return true;
        }
    }

    // 4-MÉTODO QUE DEVUELVE EL MONTO ACUMULADO
    public int getDonationAmount() {
        return donationAmount;
    }


}
