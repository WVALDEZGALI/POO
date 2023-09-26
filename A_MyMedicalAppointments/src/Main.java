import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor Doctor = new Doctor ("Camilo Valdes", "Cardiology");

        Patient Patient = new Patient ("Angie Venegas","gikavenegas@gmail.com");
        Patient.setWeight(60.3);
        System.out.println (Patient.getWeight ());

        Patient.setPhoneNumber ("12345678");
        System.out.println (Patient.getPhoneNumber ());
    }
}
