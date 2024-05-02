// CycleEntry.java
package com.stir.cscu9t4practical1;

import java.util.Calendar;

public class CycleEntry extends Entry {
    String terrain;
    String tempo;

    public CycleEntry(String n, int d, int m, int y, int h, int min, int s, float dist, String terrain, String tempo) {
        super(n, d, m, y, h, min, s, dist);
        this.terrain = terrain;
        this.tempo = tempo;
    }

    public String getTempo() {
        return tempo;
    }

    public String getTerrain() {
        return terrain;
    }
    
    @Override
    public String getEntry() {
        return getName() + " cycled " + getDistance() + " km in "
                + getHour() + ":" + getMin() + ":" + getSec() + " on "
                + getDay() + "/" + getMonth() + "/" + getYear() + " on "+ getTerrain() +" at "+getTempo()+ " tempo"+"\n";
    }
}
