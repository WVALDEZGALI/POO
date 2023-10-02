import java.util.Date;

import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor Doctor = new Doctor ("Camilo Valdes", "Cardiology");
        Doctor.addAvailableAppointment (new Date (),"14Hrs");
        Doctor.addAvailableAppointment (new Date (),"15Hrs");
        Doctor.addAvailableAppointment (new Date (),"16Hrs");

        for (Doctor.AvailableAppointment availableAppointment: Doctor.getAvailableAppointments ()) {
            System.out.println (availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        System.out.println ("-----------------------------------------");



        Patient Patient = new Patient ("Angie Venegas","gikavenegas@gmail.com");
        Patient.setWeight(60.3);
        System.out.println (Patient.getWeight ());

        Patient.setPhoneNumber ("12345678");
        System.out.println (Patient.getPhoneNumber ());
    }
}
