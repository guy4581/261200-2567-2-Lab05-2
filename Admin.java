import java.time.LocalDate;

public class Admin extends User {

    public Admin(String name, int year, int month, int day) {

        super(name, year, month, day);
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("User type: admin.");

    }

    public void displayInfo(boolean full) {

        if (full) {
            super.displayInfo();
            System.out.println("User type: admin.");
            System.out.println("Today Date : " + LocalDate.now());
        } else {

            System.out.println("Username : " + this.name);

        }

    }

    public void displayHappyBirthday() {
        int age = today.getYear() - dob.getYear();
        if (isBirthday()) {
            System.out.println("Happy birthday " + this.name + "! You are " + age + "!");
        }
    }

}
