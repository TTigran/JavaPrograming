package am.javaprogram.classes.studentlist.services;

import am.javaprogram.classes.studentlist.models.Student;
import am.javaprogram.classes.studentlist.interfaces.StudentGenerator;

import java.util.Random;

public class StudentService implements StudentGenerator {
  private Student[] studentData = new Student[10];

  public StudentService() {
    StudentGenerator generator;
    String[] names = {
      "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
    };
    String[] faculties = {"IT", "ECONOMIC", "ELECTRONIC"};
    generator =
        () -> {
          Student generate =
              new Student(
                  names[getRangeByMinMax(0, names.length - 1)],
                  getRangeByMinMax(1994, 2000) + "-02-13",
                  faculties[getRangeByMinMax(0, faculties.length - 1)],
                  getRangeByMinMax(1, 4),
                  getRangeByMinMax(800, 810));
          return generate;
        };
    for (int i = 0; i < studentData.length; i++) {
      studentData[i] = generator.genarateStudent();
    }
  }

  @Override
  public Student genarateStudent() {
    return null;
  }

  private int getRangeByMinMax(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }

  public static void printFilteredData(Student[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] != null) {
        System.out.println(array[i].toString());
      }
    }
  }

  public Student[] getByFaculty(String faculty) {
    int countFoundData = 0;
    Student[] foundData = new Student[studentData.length];
    for (Student student : studentData) {
      if (student.getFaculty().equals(faculty)) {
        foundData[countFoundData++] = student;
      }
    }
    return foundData;
  }

  public Student[] getByFacultyAndCourse(String faculty, int course) {
    int countFoundData = 0;
    Student[] foundData = new Student[studentData.length];
    for (Student student : studentData) {
      if (student.getFaculty().equals(faculty) && student.getCourse() == course) {
        foundData[countFoundData++] = student;
      }
    }
    return foundData;
  }

  public Student[] getByGroup(int group) {
    int countFoundData = 0;
    Student[] foundData = new Student[studentData.length];
    for (Student student : studentData) {
      if (student.getGroup() == group) {
        foundData[countFoundData++] = student;
      }
    }
    return foundData;
  }

  public Student[] getByOldFromTargetYear(int year) {
    int countFoundData = 0;
    Student[] foundData= new Student[studentData.length];
    for (Student student : studentData) {
      if (student.getBirth().getYear() < year) {
        foundData[countFoundData++] = student;
      }
    }
    return foundData;
  }
}
