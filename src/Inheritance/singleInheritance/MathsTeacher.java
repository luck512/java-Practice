package Inheritance.singleInheritance;

class Teach{
    void MathProblem(){
        System.out.println("Teacher Teaching a Math Problem");
    }


}
class SolveProblem extends Teach{
    void Solve(){
        System.out.println("Student Solving The Problem");
    }

}

public class MathsTeacher {
    public static void main(String[] args){
        SolveProblem obj1=new SolveProblem();
        obj1.MathProblem();
        obj1.Solve();

    }
}
