package am.javaprogram.classes.studentlist;

public class AppRunner {
  public static void main(String[] args) {
    StudentService studentService = new StudentService();
    Student[] studentListOfEconomicsFaculty = studentService.getByOldFromTargetYear(1995);
    StudentService.printFiltredData(studentListOfEconomicsFaculty);
  }
}
