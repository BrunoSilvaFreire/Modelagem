package me;


import java.util.List;

public interface BlackBoard {
    void postActivity(Professor professor, Activity activity, Classroom classroom);


    boolean postAnswerToActivity(Student student, Activity activity, Answer answer);

    List<Answer> getAnswersToActivity(Classroom classroom, Activity activity);

    List<Answer> getAnswersToActivity(Classroom classroom, Activity activity, Student student);


}
