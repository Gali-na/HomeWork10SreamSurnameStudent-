import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student studentOne = new Student("Olga","Kolosova",18,"FGF20");
        Student studentTwo = new Student("Nataly","Zolotreva",19,"FGF19");
        Student studentTree = new Student("Andrey","Pavlov",20,"FKH19");
        Student studentFour = new Student("Sergey","Kotov",20,"LKH19");
        Student studentFive = new Student("Sergey","Zbruev",20,"LKH19");
        List<Student> students = new ArrayList<>();
        students.add(studentOne);
        students.add(studentTwo);
        students.add(studentTree);
        students.add(studentFour);
        students.add(studentFive);
      ArrayList<Student> rezult= ServiseStudent.surnameSearch(students,"Z");
        System.out.println(rezult);
    }
}
