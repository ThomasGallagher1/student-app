package ie.atu;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        Person student1 = new Person();
        Person student2 = new Person();
        Person student3 = new Person();

        //first student
        System.out.println("Please Enter Your Name:     ");
        student1.setName(scanner.nextLine());
        System.out.println("Please Enter Your Email:  ");
        student1.setEmail(scanner.nextLine());
        System.out.println("Please Enter The Course You Are Studying:   ");
        student1.setCourse(scanner.nextLine());


        //Second student
        System.out.println("Please Enter Your Name:     ");
        student2.setName(scanner.nextLine());
        System.out.println("Please Enter Your Email:  ");
        student2.setEmail(scanner.nextLine());
        System.out.println("Please Enter The Course You Are Studying:   ");
        student2.setCourse(scanner.nextLine());

        //Third student
        System.out.println("Please Enter Your Name:     ");
        student3.setName(scanner.nextLine());
        System.out.println("Please Enter Your Email:  ");
        student3.setEmail(scanner.nextLine());
        System.out.println("Please Enter The Course You Are Studying:   ");
        student3.setCourse(scanner.nextLine());

        System.out.println("Details of all three students:  ");
        student1.printDetails();
        student2.printDetails();
        student3.printDetails();
    }


}
