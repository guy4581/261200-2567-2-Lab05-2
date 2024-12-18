import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob ;
    protected LocalDate today = LocalDate.now();

    public User(String name ,int year,int month ,int day){
        this.name = name;
        this.dob = LocalDate.of(year,month ,day);
    }

    public void displayInfo(){
        System.out.println("Username : " + this.name);
        System.out.println("Date of Birth : " + this.dob);

    }

    public boolean isBirthday(){
        if(this.dob.getMonth() == today.getMonth() && this.dob.getDayOfMonth() == today.getDayOfMonth()){

            return true;
        }else{

            return false;
        }

    }
    public void displayHappyBirthday() {
        if(isBirthday())
            System.out.println("Happy birthday " + this.name + "!");
    }
}
