/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Course;

import Business.Student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JANFAN
 */

public class Course {
    
    private String professorName;
    private String cName;
    private String cCode;
    private String cCatalog;
    private String cTopic;
    private String cDescription;
    private String semesters;
    private List<Student>waitList;
    private List<Student>studentList;
    private Map<Student,Character>grade;
    private String weekdays;
    private String hours;
    private String years;

    public String getcCatalog() {
        return cCatalog;
    }

    public void setcCatalog(String cCatalog) {
        this.cCatalog = cCatalog;
    }

    public Course() {
        waitList=new ArrayList<>();
        studentList=new ArrayList<>();    
        grade=new HashMap<>();
        //hours=new ArrayList<>();
        //years=new ArrayList<>();
    }

    public Map<Student, Character> getGrade() {
        return grade;
    }

    public void setGrade(Map<Student, Character> grade) {
        this.grade = grade;
    }

    public String getProfessorName() {
        return professorName;
    }

    public void setProfessorName(String professorName) {
        this.professorName = professorName;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getcCode() {
        return cCode;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public String getcTopic() {
        return cTopic;
    }

    public void setcTopic(String cTopic) {
        this.cTopic = cTopic;
    }

    public String getcDescription() {
        return cDescription;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    public String getSemesters() {
        return semesters;
    }

    public void setSemester(String semesters) {
        this.semesters = semesters;
    }

    public List<Student> getWaitList() {
        return waitList;
    }

    public void setWaitList(List<Student> waitList) {
        this.waitList = waitList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
    
    
    public String getSemester(){       
            return semesters+" "+years;     
    }

    public String getWeekdays() {
        return weekdays;
    }

    public void setWeekdays(String weekdays) {
        this.weekdays = weekdays;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }
    /**
    * Combines the years, semesters, weekdays, and hours to represent the time of a course.
    *
    * @return A concatenated string containing the time information for the course.
    */
    public String getTime(){
    return years+semesters+weekdays+hours;
    }
    /**
    * Returns a string representation of the course's unique code (cCode).
    *
    * @return The unique course code as a string.
    */
    @Override
    public String toString(){
    return cCode;}
    
    
}
