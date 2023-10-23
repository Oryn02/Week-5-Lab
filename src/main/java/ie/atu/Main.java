package ie.atu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Oryn","Quinlan",35);
        person1.displayInfo();

        Person person2 = new Person();
        person2.getUserInput();
        person2.displayInfo();
    }
}