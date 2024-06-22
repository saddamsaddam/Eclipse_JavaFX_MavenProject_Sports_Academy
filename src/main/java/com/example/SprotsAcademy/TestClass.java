package com.example.SprotsAcademy;

import java.time.LocalDate;

public class TestClass {
    public static void main(String[] args) {
        // Create an instance of Sport
        Sport soccer = new Sport("Soccer");

        // Create an instance of User with LocalDate
        User user1 = new User("Alice", "Brown", "U1", LocalDate.of(1990, 5, 15), "123-456-7890");

        // Create an instance of Athlete with LocalDate
        Athlete athlete1 = new Athlete("Bob", "Smith", "A1", LocalDate.of(1995, 8, 20), "234-567-8901", true, 5);

        // Create an instance of Coach with LocalDate
        Coach coach1 = new Coach("Charlie", "Johnson", "C1", LocalDate.of(1980, 12, 10), "345-678-9012", soccer, "PhD Sports Management");

        // Print details of user1
        System.out.println("User1 Serial Number: " + user1.getSerialNumber() + ", Name: " + user1.getName() + ", Surname: " + user1.getSurname() + ", Date of Birth: " + user1.getDateOfBirth());

        // Print details of athlete1
        System.out.println("Athlete1 Serial Number: " + athlete1.getSerialNumber() + ", Name: " + athlete1.getName() + ", Surname: " + athlete1.getSurname() + ", Professional: " + athlete1.getProfessional() + ", Experience Level: " + athlete1.getExperienceLevel() + ", Date of Birth: " + athlete1.getDateOfBirth());

        // Print details of coach1
        System.out.println("Coach1 Serial Number: " + coach1.getSerialNumber() + ", Name: " + coach1.getName() + ", Surname: " + coach1.getSurname() + ", Sport: " + coach1.getSport().getSportName() + ", Degrees: " + coach1.getDegrees() + ", Date of Birth: " + coach1.getDateOfBirth());
    }
}
