package me;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"},
        d2 = {"Lme/ddevil/uml2/Answer;", "", "activity", "", "content", "", "(ILjava/lang/String;)V", "getActivity", "()I", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "uml2"}
)
public final class Answer {
    private final int activity;
    @NotNull
    private final String content;

    public final int getActivity() {
        return this.activity;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    public Answer(int activity, @NotNull String content) {
        super();
        this.activity = activity;
        this.content = content;
    }

    public final int component1() {
        return this.activity;
    }

    @NotNull
    public final String component2() {
        return this.content;
    }

    @NotNull
    public final Answer copy(int activity, @NotNull String content) {
        Intrinsics.checkParameterIsNotNull(content, "content");
        return new Answer(activity, content);
    }

    // $FF: synthetic method
    public static Answer copy$default(Answer var0, int var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.activity;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.content;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "Answer(activity=" + this.activity + ", content=" + this.content + ")";
    }

    public int hashCode() {
        int var10000 = this.activity * 31;
        String var10001 = this.content;
        return var10000 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Answer) {
                Answer var2 = (Answer) var1;
                if (this.activity == var2.activity && Intrinsics.areEqual(this.content, var2.content)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
