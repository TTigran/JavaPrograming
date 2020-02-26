package am.javaprogram.classes.studentlist;

public class StudentService {
  private static Student[] studentData = new Student[10];
  private static Student[] filtredData = new Student[studentData.length];
  private static int countFindedData = 0;

  public StudentService() {
    studentData[0] = new Student(0, "Tigran", "1994-02-13", "IT", 1, 807);
    studentData[1] = new Student(1, "Vardan", "1994-02-13", "IT", 2, 807);
    studentData[2] = new Student(2, "Ashot", "1994-02-13", "ECONOMIC", 2, 807);
    studentData[3] = new Student(3, "Vahram", "1994-02-13", "IT", 2, 807);
    studentData[4] = new Student(4, "Gagik", "1994-02-13", "IT", 2, 807);
    studentData[5] = new Student(5, "Gurgen", "1994-02-13", "IT", 2, 807);
    studentData[6] = new Student(6, "Vram", "1994-02-13", "IT", 2, 807);
    studentData[7] = new Student(7, "Varazdat", "1996-02-13", "ECONOMIC", 3, 807);
    studentData[8] = new Student(8, "Tatos", "1995-02-13", "IT", 2, 807);
    studentData[9] = new Student(9, "Matos", "1993-02-13", "IT", 2, 807);
  }

  public static void printFiltredData(Student[] array) {
    for (int i = 0; i < countFindedData; i++) {
      System.out.println(array[i].toString());
    }
  }

  public Student[] getByFaculty(String faculty) {
    countFindedData = 0;
    for (Student student : studentData) {
      creatFilter(student, student.getFaculty().equals(faculty));
    }
    return filtredData;
  }

  public Student[] getByFacultyAndCourse(String faculty, int course) {
    countFindedData = 0;
    for (Student student : studentData) {
      creatFilter(student, student.getFaculty().equals(faculty) && student.getCourse() == course);
    }
    return filtredData;
  }

  public Student[] getByGroup(int group) {
    countFindedData = 0;
    for (Student student : studentData) {
      creatFilter(student, student.getGroup() == group);
    }
    return filtredData;
  }

  public Student[] getByOldFromTargetYear(int year) {
    countFindedData = 0;
    for (Student student : studentData) {
      creatFilter(student, student.getBirth().getYear() < year);
    }
    return filtredData;
  }

  private static void creatFilter(Student addedStudent, boolean condition) {
    if (condition) {
      filtredData[countFindedData++] = addedStudent;
    }
  }
}
