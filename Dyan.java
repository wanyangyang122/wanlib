package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Dyan {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

            Student a1=new Student("01",17,"男");
            Student a2=new Student("02",15,"男");
            Student a3=new Student("03",18,"女");
            Student a4=new Student("04",119,"男");
        ArrayList<Student> a=new ArrayList<>();
            a.add(a1);
            a.add(a2);
            a.add(a3);
            a.add(a4);
            System.out.println(a.remove(2));
            System.out.println(a);
            System.out.println(a.get(2));
           // System.out.println(a);
            a.add(new Student("05",20,"男"));
           System.out.println(a);



    }
}
