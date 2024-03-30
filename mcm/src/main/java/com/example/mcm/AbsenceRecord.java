package com.example.mcm;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class AbsenceRecord {
    private final SimpleStringProperty fullName;
    private final SimpleStringProperty courseName;
    private final SimpleIntegerProperty numberOfAbsences;

    public AbsenceRecord(String fullName, String courseName, int numberOfAbsences) {
        this.fullName = new SimpleStringProperty(fullName);
        this.courseName = new SimpleStringProperty(courseName);
        this.numberOfAbsences = new SimpleIntegerProperty(numberOfAbsences);
    }

    public String getFullName() {
        return fullName.get();
    }

    public String getCourseName() {
        return courseName.get();
    }

    public int getNumberOfAbsences() {
        return numberOfAbsences.get();
    }
}

