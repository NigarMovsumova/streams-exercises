package service;

import model.Employee;
import model.Student;
import util.EmployeeUtil;
import util.StudentUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsService {

//   public static Map<String, List<Employee>> groupByTitle(List<Employee> employees) {
//       Map<String, List<Employee>> result = new HashMap<>();
//       for (Employee employee: employees) {
//           List<Employee> subList = result.getOrDefault(employee.getTitle(), new ArrayList<>());
//           subList.add(employee);
//           result.put(employee.getTitle(), subList);
//       }
//       return result;
//   }


    /*
        {
        "Computer Science": [{fullname: "Nigar Movsumova", specialty: "Computer Science", gpa:68 },
                             {fullname: "Алексей Дидык", specialty: "Computer Science", gpa:78 }],

        "Computer Engineering": []
        }
     */
    //HashMap <K, V>
    public static Map<String, List<Student>> groupBySpecialty(List<Student> students) {
        Map<String, List<Student>> map = new HashMap<>();
        for (Student student: students) {
            List<Student> subList = map.getOrDefault(student.getSpecialty(), new ArrayList<>());
            subList.add(student);
            map.put(student.getSpecialty(), subList);
        }

        return map;
    }

    public static Map<String, List<Student>> groupBySpecialtyWithStream(List<Student> students) {
        Map<String, List<Student>> map = students.stream().collect(Collectors.groupingBy(Student::getSpecialty));
        return map;
    }

    public Map<String, List<Employee>> groupByJobTitle(List<Employee> employeeList) {
        return employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getTitle));
    }


    public static void main(String[] args) {
//        Student student = new Student("Nigar Movsumova", "Computer Science", 68 );
//        List<Student> students = new ArrayList<>();
//        students.add(student);
//        students.add(student);
//        groupBySpecialty(students);
        List<Student> students = StudentUtil.generate();
        Map<String, List<Student>> map = groupBySpecialty(students);
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

        System.out.println("**************************************************************");

        map = groupBySpecialtyWithStream(students);
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue().toString());
        }

    }

}
