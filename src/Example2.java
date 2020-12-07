import sun.jvm.hotspot.types.CIntegerType;

import java.util.*;

class Employee implements Comparable<Employee>
{
    int age;
    String name;
    public Employee(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public String toString() {
        return  age +
                 name ;
    }

    @Override
    public int compareTo(Employee o) {
   // return name.compareTo(o.name) > 1?-1:(name.compareTo(o.name)<-1?1:0);
       // return name.compareTo(o.name) > -1?1:(name.compareTo(o.name)<1?-1:0);
       // return age.compareTo(o.age) > 1?-1:(age.compareTo(o.age)<-1?1:0);
      // return age>o.age?1:(age<o.age?-1:0);
        return age>o.age?-1:(age<o.age?1:0);
    }
   static class EmployeeComparator implements Comparator<Employee>
    {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name)>-1?1:(o1.name.compareTo(o2.name)<1?-1:0);
        }
    }
}
public class Example2 {
    public static void main(String[] args) {
        List<Employee> list=new ArrayList<>();
       // Employee e=new Employee();
        list.add(new Employee(33,"neena"));
        list.add(new Employee(32,"abc"));
        list.add(new Employee(21,"def"));
        list.add(new Employee(37,"ghi"));


        Collections.sort(list);
        System.out.println("Base on age "+list);
        Collections.sort(list,new Employee.EmployeeComparator());
        System.out.println("Based on name "+list);
        //Collections.so;
        List<Integer> arr=new ArrayList<>();
        arr.add(445);
        arr.add(231);
        arr.add(1232);
        arr.add(445);
        arr.add(231);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        arr.set(2,7777);
        System.out.println(arr);
/*Iterator it=arr.iterator();
while(it.hasNext())
{
    Integer a= (Integer) it.next();



}
*/

     /*  for(int i=0;i<arr.size();i++)
       {
           for(int k=i+1;k<arr.size();k++) {
               if (arr.get(i).equals(arr.get(k))) {
                   arr.remove(k);

               }
           }
       }
       */
      //  System.out.println(arr);

      //  HashSet<Integer> set1=new HashSet<>(arr);
       // System.out.println(set1);



    }
}
