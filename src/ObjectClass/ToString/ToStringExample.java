package ObjectClass.ToString;
//if your class dosen't contain toString() Method It Will Executes Object Classes toString() Method.

import java.util.ArrayList;

public class ToStringExample {
    String name;
    int rollno;
    ToStringExample(String name,int rollno){
        this.name=name;
        this.rollno=rollno;

    }
    public String toString(){
        return name+" "+rollno;
    }

    public static void main(String[] args) {
        ToStringExample E= new ToStringExample("Aksah",101);
        System.out.println(E);// it internally calls toString Method

        ToStringExample E2=new ToStringExample("Mahesh",102);
        System.out.println(E2.toString());

        String s=new String("Laxman");
        System.out.println(s);

        ArrayList A=new ArrayList();
        A.add(1);A.add(2);
        System.out.println(A);
    }

}
