package am.javaprogram.classes.studentlist.services;

import am.javaprogram.classes.studentlist.StudentGenerator;
import am.javaprogram.classes.studentlist.models.Student;

public class StudentService {
  private Student[] studentData = new Student[10];

  public StudentService() {
    StudentGenerator generator = new StudentGenerator();
    for (int i = 0; i < studentData.length; i++) {
      studentData[i] = generator.genarateStudent();
    }
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
    Student[] foundData = new Student[studentData.length];
    for (Student student : studentData) {
      if (student.getBirth().getYear() < year) {
        foundData[countFoundData++] = student;
      }
    }
    return foundData;
  }
}
