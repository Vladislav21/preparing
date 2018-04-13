package common.OOP;

public enum Course {
    FIRST,
    SECOND;

    public String sayWord() {
        return (this == FIRST) ? "Hello" : "Bye";
    }
}
