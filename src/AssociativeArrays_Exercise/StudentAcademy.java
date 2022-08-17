package AssociativeArrays_Exercise;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<Double>> students = new LinkedHashMap<>();
        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            String studentName = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            if (!students.containsKey(studentName)) {
                students.put(studentName, new ArrayList<>());
                students.get(studentName).add(grade);
            } else {
                students.get(studentName).add(grade);
            }
        }

        Map<String, Double> averageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> kvp : students.entrySet()) {
            double average = kvp.getValue().stream().mapToDouble(x -> x).average().getAsDouble();
            if (average >= 4.50) {
                averageGrade.put(kvp.getKey(), average);
            }
        }

        averageGrade.entrySet().stream()
                .sorted((g1, g2) -> g2.getValue().compareTo(g1.getValue()))
                .forEach(grade -> {
                    System.out.println(String.format("%s -> %.2f", grade.getKey(), grade.getValue()));
                });
    }
}
