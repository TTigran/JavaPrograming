package am.javaprogram.classes.studentlist;

import java.util.Scanner;

public class Student extends Action {
  private int id;
  private String surname;
  private String name;
  private String fatherName;
  private String birth;
  private String address;
  private String phone;
  private String faculty;
  private Course course;
  private String group;
  private Student[] array = new Student[10];
  private int size = 0;

  public Student() {}

  public Student(
      int id,
      String surname,
      String name,
      String fatherName,
      String birth,
      String address,
      String phone,
      String faculty,
      Course course,
      String group) {
    this.id = id;
    this.surname = surname;
    this.name = name;
    this.fatherName = fatherName;
    this.birth = birth;
    this.address = address;
    this.phone = phone;
    this.faculty = faculty;
    this.course = course;
    this.group = group;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  public String getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = birth;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  public Course getCourse() {
    return course;
  }

  public void setCourse(Course course) {
    this.course = course;
  }

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  @Override
  public String toString() {
    return "Student{"
        + "id="
        + id
        + ", surname='"
        + surname
        + '\''
        + ", name='"
        + name
        + '\''
        + ", fatherName='"
        + fatherName
        + '\''
        + ", birth='"
        + birth
        + '\''
        + ", address='"
        + address
        + '\''
        + ", phone='"
        + phone
        + '\''
        + ", faculty='"
        + faculty
        + '\''
        + ", course='"
        + course
        + '\''
        + ", group='"
        + group
        + '\''
        + '}';
  }

  @Override
  public void search(String faculty) {
    for (int i = 0; i < size; i++) {
      if (array[0].faculty.equals(faculty)) {
        System.out.println(array[0].toString());
      } else {
        throw new IllegalArgumentException(
            "There is no student studying in this " + faculty + " faculty");
      }
    }
  }

  @Override
  public void search(Integer group) {
    String strGroup = group.toString();
    for (int i = 0; i < size; i++) {
      if (array[0].group.equals(strGroup)) {
        System.out.println(array[0].toString());
      } else {
        throw new IllegalArgumentException(
            "There is no student studying in this " + strGroup + " faculty");
      }
    }
  }

  @Override
  public void search(String faculty, Course course) {
    for (Student item : array) {
      if (item != null) {
        if (item.faculty.equals(faculty) && item.course.equals(course)) {
          System.out.println(item.toString());
        } else {
          throw new IllegalArgumentException(
              "There is no student studying in this " + faculty + " faculty");
        }
      }
    }
  }

  public Student createObjectOfStudent() {
    var scanner = new Scanner(System.in);
    System.out.println(
        "Input data by  this  queue surname, name, fatherName, birth, address, phone, faculty, group,id,course ");
    String surname = scanner.nextLine();
    String name = scanner.nextLine();
    String fatherName = scanner.nextLine();
    String birth = scanner.nextLine();
    String address = scanner.nextLine();
    String phone = scanner.nextLine();
    String faculty = scanner.nextLine();
    String group = scanner.nextLine();
    int id = scanner.nextInt();
    int courseNumber = scanner.nextInt();
    Course course = Course.getCourseByNumber(courseNumber);
    Student newStudent =
        new Student(id, surname, name, fatherName, birth, address, phone, faculty, course, group);
    return newStudent;
  };

  private void addStudent() {
    Student objectOfStudent = createObjectOfStudent();
    array[size++] = objectOfStudent;
    for (int i = 0; i < size; i++) {
      System.out.println(array[i].toString());
    }
  }

  private void printActions() {
    System.out.println("Action for add student write command line ----> " + ADD);
    System.out.println("Action for search student write command line ----> " + SEARCH);
    System.out.println(
        "Action for search student write by two arguments command line ----> "
            + SEARCH_BY_TWO_ARGUMENT);
    System.out.println("Action for exit write command line ----> " + EXIT);
  }

  private void addProcess() {
    System.out.println("Current time add process");
    addStudent();
    chooseAction();
  }

  private void searchProcess() {
    var scanner = new Scanner(System.in);
    System.out.println("Current time search process by mode");
    String mode = scanner.nextLine();
    if ("faculty".equals(mode)) {
      String faculty = scanner.nextLine();
      search(faculty);
    } else if ("group".equals(mode)) {
      Integer group = scanner.nextInt();
      search(group);
    } else {
      throw new IllegalArgumentException("There is no mode");
    }
    chooseAction();
  }

  private void searchByTwoParamsProcess() {
    var scanner = new Scanner(System.in);
    String searchArgs = scanner.nextLine();
    Course course = Course.getCourseByNumber(scanner.nextInt());
    search(searchArgs, course);
    chooseAction();
  }

  private void chooseAction() {
    var scanner = new Scanner(System.in);
    printActions();
    String command = scanner.nextLine();
    switch (command) {
      case ADD:
        addProcess();
        break;
      case SEARCH:
        searchProcess();
        break;
      case SEARCH_BY_TWO_ARGUMENT:
        searchByTwoParamsProcess();
        break;
      case EXIT:
        scanner.close();
        break;
      default:
        break;
    }
    scanner.close();
  }

  public void run() {
    chooseAction();
  }
}
