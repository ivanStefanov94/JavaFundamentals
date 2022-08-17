package AssociativeArrays_Exercise;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, List<String> > courses = new LinkedHashMap<>();

        while(!input.equals("end")){

            String [] separated = input.split(" : ");

            String courseName = separated[0];
            String studentName = separated[1];

            if(!courses.containsKey(courseName)){
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(studentName);

            input = scan.nextLine();
        }

        courses.entrySet().stream()
                .sorted((left, right) -> Integer.compare(right.getValue().size(), left.getValue().size()))

                .forEach(e -> {
                    System.out.printf("%s: %s%n", e.getKey(), e.getValue().size()); //--> сортира по брой на студенти в курса и принтира курса и броя
                    e.getValue().stream()
                            .sorted(String::compareTo)
                            .forEach(student -> System.out.println("-- "+ student)); //--> сортира студентите(List) по азбучен ред и ги принтира под всеки курс
                });

        }

    }

/*
Algorithms : Jay Moore
Programming Basics : Martin Taylor
Python Fundamentals : John Anderson
Python Fundamentals : Andrew Robinson
Algorithms : Bob Jackson
Python Fundamentals : Clark Lewis
end
Python Fundamentals: 3
-- Andrew Robinson
-- Clark Lewis
-- John Anderson
Algorithms: 2
-- Bob Jackson
-- Jay Moore
Programming Basics: 1
-- Martin Taylor
*/