package AssociativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class BasicMapExample {
    public static void main(String[] args) {

        Map<String, Integer> students = new LinkedHashMap<>();

        students.put("Gosho", 4);
        students.put("Ivan", 3);
        students.put("Pesho", 6);
        students.put("Ani", 5);

        students.remove("Ivan");

        for (Map.Entry<String, Integer> studentList : students.entrySet()) {
            System.out.print(studentList.getKey() + " ");
            System.out.println(studentList.getValue());
        }


    }
}
