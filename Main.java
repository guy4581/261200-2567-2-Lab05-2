import java.io.*;

public class Main {
    public static void main(String[] args) {

        User john = new User("John", 1954, 12, 18);
        john.displayInfo();

        Admin nicolas = new Admin("Nicolas" , 1964 , 12 , 18);
        nicolas.displayInfo();
        nicolas.displayInfo(true);
        nicolas.displayInfo(false);

        john.displayHappyBirthday();
        nicolas.displayHappyBirthday();


    }
}