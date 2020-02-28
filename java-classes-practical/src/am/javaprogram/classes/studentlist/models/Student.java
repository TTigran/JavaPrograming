package am.javaprogram.classes.studentlist.models;

import java.time.LocalDate;

public class Student {
  private int id;
  private String name;
  private LocalDate birth;
  private String faculty;
  private int course;
  private int group;
  static int noOfObjects = 0;

  {
    noOfObjects += 1;
  }

  public Student() {}

  public Student(String name, String birth, String faculty, int course, int group) {
    this.id = noOfObjects;
    this.name = name;
    this.birth = LocalDate.parse(birth);
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

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    this.course = course;
  }

  public int getGroup() {
    return group;
  }

  public void setGroup(int group) {
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getBirth() {
    return birth;
  }

  public void setBirth(String birth) {
    this.birth = LocalDate.parse(birth);
  }

  public String getFaculty() {
    return faculty;
  }

  public void setFaculty(String faculty) {
    this.faculty = faculty;
  }

  @Override
  public String toString() {
    return "Student{"
        + "id="
        + id
        + ", name='"
        + name
        + '\''
        + ", birth="
        + birth
        + ", faculty='"
        + faculty
        + '\''
        + ", course="
        + course
        + ", group="
        + group
        + '}';
  }
}
