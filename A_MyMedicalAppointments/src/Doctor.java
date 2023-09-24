public class Doctor {
    static int id = 0;
    String name;
    String speciality;


    public Doctor( String name, String speciality){
        //System.out.println ("The assigned doctor's name is: ");
        this.name = name;
        //System.out.println ("The specialty is: ");
        this.speciality = speciality;
        id++;
    }
    //behaviors
    public void showName(){
        System.out.println (name);
    }
    public void showId(){
        System.out.println ("ID Doctor: " + id);

    }
}
