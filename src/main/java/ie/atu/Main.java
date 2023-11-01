package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //first student
        System.out.println("Please Enter Your Name:     ");
        String name1 = scanner.nextLine();
        System.out.println("Please Enter Your Email:  ");
        String email1 = scanner.nextLine();
        System.out.println("Please Enter The Course You Are Studying:   ");
        String course1 = scanner.nextLine();

        Person student1 = new Person(name1);
        student1.setEmail(email1);
        student1.setCourse(course1);

        //Second student
        System.out.println("Please Enter Your Name:     ");
        String name2 = scanner.nextLine();
        System.out.println("Please Enter Your Email:  ");
        String email2 = scanner.nextLine();
        System.out.println("Please Enter The Course You Are Studying:   ");
        String course2 = scanner.nextLine();

        Person student2 = new Person(name2);
        student2.setEmail(email2);
        student2.setCourse(course2);

        //Third student
        System.out.println("Please Enter Your Name:     ");
        String name3 = scanner.nextLine();
        System.out.println("Please Enter Your Email:  ");
        String email3 = scanner.nextLine();
        System.out.println("Please Enter The Course You Are Studying:   ");
        String course3 = scanner.nextLine();

        Person student3 = new Person(name3);
        student3.setEmail(email3);
        student3.setCourse(course3);

        System.out.println("Details of all three students:  ");
        displayStudentDetails(student1);
        displayStudentDetails(student2);
        displayStudentDetails(student3);
    }
    public static void displayStudentDetails(Person student)
    {
        System.out.println("\nName: " + student.getName());
        System.out.println("\nEmail: " + student.getEmail());
        System.out.println("\nCourse: " + student.getCourse());
    }

}
