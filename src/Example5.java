import java.util.*;

public class Example5 {
    int arr[] = {1, 2, 3, 4, 5, 11, 12, 15};
   // int arr[] = {-11, 12, 0, 11, 5};
   // int arr[]= {-11, 12, 0, 11, 15};

    Map<Integer,Integer> map=new HashMap<>();
    int sum=16;
    public void dispalyPair() {
        for (int i = 0; i < arr.length; i++)
        {
            if(map.containsKey(sum-arr[i]))
            {
                System.out.println(map.get(sum-arr[i]));
                

            }
            map.put(sum-arr[i],arr[i]);
        }

    /*     for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                if ((arr[i] + arr[j]) == sum) {
                    arr1.put(arr[i], arr[j]);


                }

            }

        }


       if(arr1.size()==0) {
            System.out.println("False");
        }
        else
        {
            System.out.println("True"+arr1);
        }*/
        System.out.println(map);
    }
    public static void main(String[] args) {
        Example5 exp=new Example5();
exp.dispalyPair();

    }
}
