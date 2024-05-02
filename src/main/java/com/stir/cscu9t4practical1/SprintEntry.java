// SprintEntry.java
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class SprintEntry extends Entry {
    private int repetitions;
    private int recovery;

    public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int repetitions, int recovery) throws RuntimeException {
        super(n, d, m, y, h, min, s, dist);

        Calendar inst = Calendar.getInstance();
        inst.set(y, m - 1, d, h, min, s);
        this.recovery = recovery;
        this.repetitions = repetitions;
    }

    public int getRecovery() {
        return this.recovery;
    }

    public int getRepetitions() {
        return this.repetitions;
    }

    public String getEntry() {
        return getName() + " sprinted " + getRepetitions() + "x" + (int)getDistance() + "m" + " in " +
                getHour() + ":" + getMin() + ":" + getSec() +
                " with " + getRecovery() + " minutes recovery on " +
                getDay() + "/" + getMonth() + "/" + getYear() + "\n";
    }
}
