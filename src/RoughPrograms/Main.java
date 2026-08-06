package RoughPrograms;

class Address {

    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    void printAddress() {
        System.out.println("City  : " + city);
        System.out.println("State : " + state);
    }
}

class Student {

    int rollNo;
    String name;
    Address address;

    Student(int rollNo, String name, Address address) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
    }

    void printDetails() {
        System.out.println("Name    : " + name);
        System.out.println("Roll No : " + rollNo);
        address.printAddress();
    }
}

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Pune", "Maharashtra");
        Address address2 = new Address("Mumbai", "Maharashtra");

        Student s1 = new Student(55, "Hariom", address1);
        Student s2 = new Student(56, "Rahul", address2);

        s1.printDetails();

        System.out.println("----------------");

        s2.printDetails();
    }
}