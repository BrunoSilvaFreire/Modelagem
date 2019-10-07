package me;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

import java.util.List;

@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"},
        d2 = {"Lme/ddevil/uml2/Student;", "Lme/ddevil/uml2/Person;", "name", "", "postedAnswers", "", "Lme/ddevil/uml2/Answer;", "(Ljava/lang/String;Ljava/util/List;)V", "getPostedAnswers", "()Ljava/util/List;", "uml2"}
)
public final class Student extends Person {
    @NotNull
    private final List<Answer> postedAnswers;

    @NotNull
    public final List<Answer> getPostedAnswers() {
        return this.postedAnswers;
    }

    public Student(@NotNull String name, @NotNull List<Answer> postedAnswers) {
        super(name);
        this.postedAnswers = postedAnswers;
    }
}
