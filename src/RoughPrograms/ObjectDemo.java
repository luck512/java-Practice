package RoughPrograms;

import java.util.Objects;

class Student12 {
    String name;
    int age;

    Student12(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student12 s = (Student12) obj;
        return age == s.age && name.equals(s.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Student12 s1 = new Student12("Rahul", 21);
        Student12 s2 = new Student12("Rahul", 21);

        System.out.println(s1);              // toString()
        System.out.println(s1.equals(s2));    // true
        System.out.println(s1.hashCode() == s2.hashCode()); // true
        System.out.println(s1.getClass());    // class Student
    }
}