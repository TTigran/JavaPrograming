package am.javaprogram.classes.studentlist;

import am.javaprogram.classes.studentlist.interfaces.Commands;
import am.javaprogram.classes.studentlist.models.Student;
import am.javaprogram.classes.studentlist.services.StudentService;

import java.util.Scanner;

public class Commander implements Commands {
  StudentService studentService = new StudentService();

  public void run() {
    Scanner scanner = new Scanner(System.in);
    printCommands();
    int command = scanner.nextInt();
    switch (command) {
      case FILTER_BY_FACULTY:
        processFilterByFaculty();
        break;
      case FILTER_BY_FACULTY_AND_COURSE:
        processFilterByFacultyAndCourse();
        break;
      case FILTER_BY_GROUP:
        processFilterByGroup();
        break;
      case FILTER_BY_YEAR:
        processFilterByYear();
        break;
      case EXIT:
        scanner.close();
        break;
      default:
        run();
        break;
    }
  }

  private void processFilterByYear() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Running process by pear, please enter your arguments year ------>");
    int year = scanner.nextInt();
    if (year < 2002) {
      Student[] studentList = studentService.getByOldFromTargetYear(year);
      StudentService.printFilteredData(studentList);
    } else {
      System.out.println(year+" is not allowed: Please try again");
      processFilterByYear();
    }
    scanner.close();
  }

  private void processFilterByFaculty() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Running process by pear, please enter your arguments faculty ------>");
    String faculty = scanner.nextLine();
    Student[] studentList = studentService.getByFaculty(faculty);
    StudentService.printFilteredData(studentList);
    scanner.close();
  }

  private void processFilterByGroup() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Running process by pear, please enter your arguments group ------>");
    int group = scanner.nextInt();
    Student[] studentList = studentService.getByGroup(group);
    StudentService.printFilteredData(studentList);
    scanner.close();
  }

  private void processFilterByFacultyAndCourse() {
    Scanner scanner = new Scanner(System.in);
    System.out.println(
        "Running process by pear, please enter your arguments faculty and course ------>");
    String faculty = scanner.nextLine();
    int course = scanner.nextInt();
    Student[] studentList = studentService.getByFacultyAndCourse(faculty, course);
    StudentService.printFilteredData(studentList);
    scanner.close();
  }

  private void printCommands() {
    System.out.println("EXIT -------------------------> 0");
    System.out.println("FILTER_BY_FACULTY ------------> 1");
    System.out.println("FILTER_BY_FACULTY_AND_COURSE -> 2");
    System.out.println("FILTER_BY_GROUP --------------> 3");
    System.out.println("FILTER_BY_YEAR ---------------> 4");
  }
}
