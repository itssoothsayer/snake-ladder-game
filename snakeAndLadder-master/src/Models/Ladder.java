package Models;

public class Ladder {
    private int start;
    private int end;


    public Ladder(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }


    public int getEnd() {
        return end;
    }


    public void setEnd(int end) {
        this.end = end;
    }


    public void setStart(int start) {
        this.start = start;
    }

}
