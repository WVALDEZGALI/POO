import java.util.ArrayList;
import java.util.Date;

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
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add (new Doctor.AvailableAppointment (date,time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
