import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.*;

public class Example3 {
    public static void main(String[] args) {

/*

String name="malyama";
String s[]=name.split("");

//System.out.println(Arrays.toString(s));

        Map<String,Integer> ma=new  HashMap<>();
        for (int i=0;i<s.length;i++)
        {

            if(ma.containsKey(s[i])) {
                ma.put(s[i], ma.get(s[i])+1);

}
else
{
    ma.put(s[i], 1);
}

        }
System.out.println(ma);

 */

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("RED");
        l1.add("Blue");
        l1.add("Green");


        LinkedList<String> l2 = new LinkedList<>();
        l2.add("ABC");
        l2.add("DEG");
        l2.add("PQR");
        l2.add("STU");
        l2.add("XYZ");
        l2.add("sherin");
        l2.add("neena");
        l2.add("rtet");
        l2.add("rtet");
        l2.add("rtet");
        l2.add("rtet");
        l2.add("hannah");
        int k = 0;
        for (int i = 0; i < l2.size(); i++) {
            if (l1.size() <= (i)) {

                System.out.println(l1.get(k) + " -? " + l2.get(i));
                k++;
                if (l1.size() == k) {
                    k = 0;


                }

            } else {
                System.out.println(l1.get(i) + " -+ " + l2.get(i));

            }

        }
    }
}
