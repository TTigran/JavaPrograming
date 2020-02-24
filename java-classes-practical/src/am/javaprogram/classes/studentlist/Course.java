package am.javaprogram.classes.studentlist;

public enum Course {
  FIRST(1),
  SECOND(2),
  THIRD(3),
  FOURTH(4);

  private final int courseNumber;

  Course(int courseNumber) {
    this.courseNumber = courseNumber;
  }

  public static Course getCourseByNumber(int courseNumber) {
    final var values = Course.values();
    for (Course month : values) {
      if (month.courseNumber == courseNumber) {
        return month;
      }
    }
    throw new IllegalArgumentException("There is no month with number: " + courseNumber);
  }
}
