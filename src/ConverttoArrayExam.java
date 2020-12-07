import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConverttoArrayExam
{
    public static void main(String[] args) {
        int s[]={33,66,332,67};

List<Integer> list=new ArrayList<>(s.length);
for(int i:s)
        {
          list.add(i);
        }

System.out.println(list);

int a[]=list.stream().mapToInt(k->k).toArray();
for(int d:a)
System.out.println(d);
    }
}
