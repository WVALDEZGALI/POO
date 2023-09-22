public class Doctor {
    int id;
    String name;
    String speciality;

    Doctor( String name){
        System.out.println ("The doctor's name is: " + name);
    }
    //behaviors
    public void showName(){
        System.out.println (name);
    }
}
