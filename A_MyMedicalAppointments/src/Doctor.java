public class Doctor {
    private static int id = 0;
    private String name;
    private String speciality;
    private String email;


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
