package RoughPrograms;

import javax.xml.namespace.QName;

class Students{
    String name;
    int rollno;

    Students(String n,int no){
        name=n;
        rollno=no;
        System.out.println(" Name : "+ n + "\n Roll No: "+ no);
    }

}

public class Mainapp2 {
    public static void main(String[] args){
        new Students("Laxman",55);
        new Students("Aryan",56);
    }
}
