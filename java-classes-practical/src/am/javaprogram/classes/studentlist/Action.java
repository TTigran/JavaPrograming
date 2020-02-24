package am.javaprogram.classes.studentlist;

public abstract class Action {
    protected final static String ADD = "add student";
    protected final static String SEARCH = "search student";
    protected final static String SEARCH_BY_TWO_ARGUMENT = "search student two";
    protected final static String EXIT = "exit";

    abstract protected void search(String args);
    abstract protected void search(String args1, Course args2);
    abstract protected void search(Integer args);
}
