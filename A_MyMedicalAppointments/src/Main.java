import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor ("Camilo Valdes", "Cardiology");

        Patient myPatient = new Patient ("Angie Venegas","gikavenegas@gmail.com");
        myPatient.setWeight(60.3);
        System.out.println (myPatient.getWeight ());

        myPatient.setPhoneNumber ("12345678");
        System.out.println (myPatient.getPhoneNumber ());
    }
}
