package util;

import com.github.javafaker.Faker;
import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentUtil {

    public static List<Student> generate() {
        Faker faker = new Faker();
        Random random = new Random();
        List<Student> generatedStudents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setSpecialty(faker.programmingLanguage().name());
            student.setFullName(faker.name().fullName());
            student.setGpaScore(random.nextInt(200));
            generatedStudents.add(student);
            generatedStudents.add(student);
        }
        return generatedStudents;
    }
}
