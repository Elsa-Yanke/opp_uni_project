package university.exceptions;

public class LowHIndexException extends RuntimeException {
    private int actualHIndex;

    public LowHIndexException(int actualHIndex) {
        super("H-index too low to be a supervisor: " + actualHIndex + ". Minimum required: 3");
        this.actualHIndex = actualHIndex;
    }

    public int getActualHIndex() {
        return actualHIndex;
    }
}
