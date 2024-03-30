package com.example.mcm;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;



public class baza {
    private Connection connect() {
        // Tu należy zaimplementować logikę połączenia z bazą danych
        String url = "jdbc:"; // Przykład dla SQLite
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public ObservableList<AbsenceRecord> getAbsencesData() {
        String sql = "SELECT u.FullName, c.CourseName, COUNT(a.AttendanceID) AS NumberOfAbsences " +
                "FROM Users u " +
                "JOIN Attendance a ON u.UserID = a.UserID " +
                "JOIN Sessions s ON a.SessionID = s.SessionID " +
                "JOIN Courses c ON s.CourseID = c.CourseID " +
                "WHERE a.IsPresent = FALSE " +
                "GROUP BY u.FullName, c.CourseName " +
                "ORDER BY NumberOfAbsences DESC, u.FullName;";

        ObservableList<AbsenceRecord> data = FXCollections.observableArrayList();

        try (Connection conn = this.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                data.add(new AbsenceRecord(rs.getString("FullName"),
                        rs.getString("CourseName"),
                        rs.getInt("NumberOfAbsences")));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}
