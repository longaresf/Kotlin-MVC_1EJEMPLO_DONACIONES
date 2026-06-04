package com.example.mvc_1ejemplo_donaciones;

public class Controller {


    //1  HACER REFERENCIA AL MÓDELO PARA COMUNICARSE CON ÉL Y  QUE LA VISTA PUEDE COMUNICAR A ESTE CONTROLLER
    private  DonationModel model;

    //  2 CONECTAMOS EL MÓDELO CON EL CONTROLER , POR MEDIO DE ESTE CONSTRUCTOR EL CONTROLER ESTA CONSTRUIDO POR EL MODEL
    public Controller() {
        this.model = new DonationModel();
    }

    // 3 COMUNICA CON EL METODO QUE GUARDA DONACIONES DEL MODEL
    public boolean saveDonation(String amount) {

        return model.saveDonation(amount);
    }

    // 4-COMUNICA CON EL METODO QUE MUESTRA EL TOTAL DEL MODEL
    public int totalDonation() {
        return model.getDonationAmount();
    }


}
