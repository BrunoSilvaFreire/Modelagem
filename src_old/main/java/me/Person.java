package me;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 15},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"},
        d2 = {"Lme/ddevil/uml2/Person;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "uml2"}
)
public abstract class Person {
    @NotNull
    private final String name;

    @NotNull
    public final String getName() {
        return this.name;
    }

    public Person(@NotNull String name) {
        super();
        this.name = name;
    }
}
