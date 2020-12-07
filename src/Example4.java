import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

class EmployeeDetails {
    private int id;


    LocalDate dateOfBirth;
    private String name;

    public EmployeeDetails(String dob, String name) {

        this.name = name;
         this.dateOfBirth = LocalDate.parse(dob, DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateofBirth() {
        return dateOfBirth;
    }

    public void setDob(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return dateOfBirth + name;
    }

 /*  @Override
    public int compareTo(EmployeeDetails o) {

        return dob.compareTo(o.dob) > -1 ? 1 : (dob.compareTo(o.dob) < 1 ? -1 : 0);
    }*/


    static class SortExample implements Comparator<Integer> {
        Map<Integer, EmployeeDetails> m;

        public SortExample(Map m) {
            this.m = m;
        }

        @Override
        public int compare(Integer o1, Integer o2) {
            return m.get(o1).dateOfBirth.compareTo(m.get(o2).dateOfBirth);
        }
    }
}

public class Example4 {


    public static void main(String[] args) {
        //Sort list of employee field name ,id, dob; sort based on dob using treemap
        SortedMap<Integer, EmployeeDetails> emp = new TreeMap<>();
        emp.put(3, new EmployeeDetails("11/12/1986", "neena"));
        emp.put(2, new EmployeeDetails("08/08/1983", "sherin"));
        emp.put(1, new EmployeeDetails("16/06/2016", "hannah"));
        SortedMap<Integer, EmployeeDetails> emp1 = new TreeMap<>(new EmployeeDetails.SortExample(emp));
        emp1.putAll(emp);
        System.out.println(emp1);


    }
}

