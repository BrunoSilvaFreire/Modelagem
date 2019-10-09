// Answer.java
package me;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;



@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001a"},
        d2 = {"Lme/ddevil/uml2/Classroom;", "", "professor", "Lme/ddevil/uml2/Professor;", "students", "", "Lme/ddevil/uml2/Student;", "activities", "Lme/ddevil/uml2/Activity;", "(Lme/ddevil/uml2/Professor;Ljava/util/List;Ljava/util/List;)V", "getActivities", "()Ljava/util/List;", "getProfessor", "()Lme/ddevil/uml2/Professor;", "getStudents", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "uml2"}
)
public final class Classroom {
    @NotNull
    private final Professor professor;
    @NotNull
    private final List<Student> students;
    @NotNull
    private final List<Activity> activities;

    @NotNull
    public final Professor getProfessor() {
        return this.professor;
    }

    @NotNull
    public final List<Student> getStudents() {
        return this.students;
    }

    @NotNull
    public final List<Activity> getActivities() {
        return this.activities;
    }

    public Classroom(@NotNull Professor professor, @NotNull List<Student> students, @NotNull List<Activity> activities) {
        super();
        this.professor = professor;
        this.students = students;
        this.activities = activities;
    }

    @NotNull
    public final Professor component1() {
        return this.professor;
    }

    @NotNull
    public final List<Student> component2() {
        return this.students;
    }

    @NotNull
    public final List<Activity> component3() {
        return this.activities;
    }

    @NotNull
    public final Classroom copy(@NotNull Professor professor, @NotNull List<Student> students, @NotNull List<Activity> activities) {
        Intrinsics.checkParameterIsNotNull(professor, "professor");
        Intrinsics.checkParameterIsNotNull(students, "students");
        Intrinsics.checkParameterIsNotNull(activities, "activities");
        return new Classroom(professor, students, activities);
    }

    // $FF: synthetic method
    public static Classroom copy$default(Classroom var0, Professor var1, List<Student> var2, List<Activity> var3, int var4, Object var5) {
        if ((var4 & 1) != 0) {
            var1 = var0.professor;
        }

        if ((var4 & 2) != 0) {
            var2 = var0.students;
        }

        if ((var4 & 4) != 0) {
            var3 = var0.activities;
        }

        return var0.copy(var1, var2, var3);
    }

    @NotNull
    public String toString() {
        return "Classroom(professor=" + this.professor + ", students=" + this.students + ", activities=" + this.activities + ")";
    }

    public int hashCode() {
        Professor var10000 = this.professor;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        List var10001 = this.students;
        var1 = (var1 + (var10001 != null ? var10001.hashCode() : 0)) * 31;
        var10001 = this.activities;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Classroom) {
                Classroom var2 = (Classroom) var1;
                if (Intrinsics.areEqual(this.professor, var2.professor) && Intrinsics.areEqual(this.students, var2.students) && Intrinsics.areEqual(this.activities, var2.activities)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}

