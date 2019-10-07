package me;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.Date;

@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\u0003HÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"},
        d2 = {"Lme/ddevil/uml2/Activity;", "", "number", "", "(I)V", "getNumber", "()I", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "uml2"}
)
public final class Activity {
    private final int number;
    private final Date limit;

    public final int getNumber() {
        return this.number;
    }

    public final Date getLimit() {
        return limit;
    }

    public Activity(int number, Date limit) {
        this.number = number;
        this.limit = limit;
    }

    public final int component1() {
        return this.number;
    }

    @NotNull
    public String toString() {
        return "Activity(number=" + this.number + ")";
    }

    public int hashCode() {
        return this.number;
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Activity) {
                Activity var2 = (Activity) var1;
                if (this.number == var2.number) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
