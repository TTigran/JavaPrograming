package am.javaprogram.classes.studentlist;

import am.javaprogram.classes.studentlist.interfaces.Commands;
import am.javaprogram.classes.studentlist.models.Student;
import am.javaprogram.classes.studentlist.services.StudentService;

import java.util.Scanner;

public class Commander implements Commands {
  public static final Scanner SCANNER = new Scanner(System.in);
  StudentService studentService = new StudentService();

  public void run() {
    printCommands();
    int command = SCANNER.nextInt();
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
        SCANNER.close();
        break;
      default:
        break;
    }
  }

  private void processFilterByYear() {
    System.out.println("Running process by pear, please enter your arguments year ------>");
    int year = SCANNER.nextInt();
    if (year < 2002) {
      Student[] studentList = studentService.getByOldFromTargetYear(year);
      StudentService.printFilteredData(studentList);
    } else {
      throw new IllegalArgumentException("Student cannot be for the year");
    }
  }

  private void processFilterByFaculty() {
    System.out.println("Running process by pear, please enter your arguments faculty ------>");
    String faculty = SCANNER.nextLine();
    Student[] studentList = studentService.getByFaculty(faculty);
    StudentService.printFilteredData(studentList);

  }

  private void processFilterByGroup() {
    System.out.println("Running process by pear, please enter your arguments group ------>");
    int group = SCANNER.nextInt();
    Student[] studentList = studentService.getByGroup(group);
    StudentService.printFilteredData(studentList);

  }

  private void processFilterByFacultyAndCourse() {
    System.out.println(
        "Running process by pear, please enter your arguments faculty and course ------>");
    String facuty = SCANNER.nextLine();
    int course = SCANNER.nextInt();
    Student[] studentList = studentService.getByFacultyAndCourse(facuty, course);
    StudentService.printFilteredData(studentList);

  }

  private void printCommands(){
    System.out.println("EXIT -------------------------> 0");
    System.out.println("FILTER_BY_FACULTY ------------> 1");
    System.out.println("FILTER_BY_FACULTY_AND_COURSE -> 2");
    System.out.println("FILTER_BY_GROUP --------------> 3");
    System.out.println("FILTER_BY_YEAR ---------------> 4");
  }
}
