package am.javaprogram.classes.studentlist;

import am.javaprogram.classes.studentlist.models.Student;

import java.util.Random;

public class StudentGenerator {
  private final String[] NAMES = {
    "Tigran", "Vardan", "Ashot", "Vahram", "Valod", "Gurgen", "Ishxan", "Varazdat", "Gevorg"
  };
  private final String[] FACULTY = {"IT", "ECONOMIC", "ELECTRONIC"};

  public StudentGenerator() {}

  public Student genarateStudent() {
    Student generate =
        new Student(
            NAMES[getRangeByMinMax(0, NAMES.length - 1)],
            getRangeByMinMax(1994, 2000) + "-02-13",
            FACULTY[getRangeByMinMax(0, FACULTY.length - 1)],
            getRangeByMinMax(1, 4),
            getRangeByMinMax(800, 810));
    return generate;
  }

  private int getRangeByMinMax(int min, int max) {
    Random r = new Random();
    return r.nextInt((max - min) + 1) + min;
  }
}
