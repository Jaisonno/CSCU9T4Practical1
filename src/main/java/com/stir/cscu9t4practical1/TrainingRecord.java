// TrainingRecord.java
package com.stir.cscu9t4practical1;

import java.util.ArrayList;
import java.util.Iterator;

public class TrainingRecord {
    private ArrayList<Entry> entries;

    public TrainingRecord() {
        entries = new ArrayList<>();
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    public boolean duplicate(Entry entry) {
        for (Entry e : entries) {
            if (e.getName().equals(entry.getName()) && e.getDay() == entry.getDay() && e.getMonth() == entry.getMonth() && e.getYear() == entry.getYear()) {
                return true;
            }
        }
        return false;
    }

    public String lookupEntry(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        for (Entry e : entries) {
            if (e.getDay() == d && e.getMonth() == m && e.getYear() == y) {
                result.append(e.getEntry());
            }
        }
        return result.toString();
    }

    public String findAllByDate(int d, int m, int y) {
        StringBuilder result = new StringBuilder();
        for (Entry e : entries) {
            if (e.getDay() == d && e.getMonth() == m && e.getYear() == y) {
                result.append(e.getEntry());
            }
        }
        return result.toString();
    }

    public String findAllByName(String name) {
        StringBuilder result = new StringBuilder();
        for (Entry e : entries) {
            if (e.getName().equalsIgnoreCase(name)) {
                result.append(e.getEntry());
            }
        }
        return result.toString();
    }

    public String remove(String name, int d, int m, int y) {
        Iterator<Entry> iter = entries.iterator();
        while (iter.hasNext()) {
            Entry e = iter.next();
            if (e.getName().equals(name) && e.getDay() == d && e.getMonth() == m && e.getYear() == y) {
                iter.remove();
                return "Entry removed successfully";
            }
        }
        return "Entry not found";
    }
}
