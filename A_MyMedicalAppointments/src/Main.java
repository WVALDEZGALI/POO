import static ui.UIMenu.*;
public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor ("Camilo valdes", "Cardiology");
        System.out.println ("The assigned doctor's name is: " + myDoctor.name);
        System.out.println ("The specialty is: " + myDoctor.speciality);
    }

}
