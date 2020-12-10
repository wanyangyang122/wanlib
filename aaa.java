package Day3;

import java.util.ArrayList;
import java.util.Collections;

public class aaa {
    public static void main(String[] args) {


        Students a1=new Students("01",20);
        Students a2=new Students("02",15);
        Students a3=new Students("03",16);
        Students a4=new Students("04",19);
        ArrayList<Students> a=new ArrayList<>();
        a.add(a1);
        a.add(a2);
        a.add(a3);
        a.add(a4);


        Collections.sort(a);

        System.out.println(a);

    }
}
