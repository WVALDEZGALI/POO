public class Patient {

    private static int id = 0;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    private String bloodType;

    public Patient (String name,String email){
        this.name = name;
        this.email = email;
        id ++;
    }
    public String getWeight() {
        return weight + " Kg.";
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getHeight() {
        return height + " Mts.";
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8 ) {
            System.out.println ("The phone number must be 8 digits long");
        }else if (phoneNumber.length () < 8) {
            System.out.println ("The phone number must be 8 digits long");
        }else {
        this.phoneNumber = phoneNumber;
        }
    }
}
