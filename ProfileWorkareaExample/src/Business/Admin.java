/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;
import Business.Course.Course;
import Business.Professor.Professor;
import Business.Student.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author JANFAN
 */
public class Admin {
    private List<Student>allStudent;
    private List<Professor>allProfessor;
    private List<Course>allCourse;
    private List<Course>allHistoryCourse;

    public Admin() {
        allStudent=new ArrayList<>();
        allProfessor=new ArrayList<>();
        allCourse=new ArrayList<>();
        allHistoryCourse=new ArrayList<>();
    }
    
    
    public void addStudent(Student s){
        allStudent.add(s);
    }
    /**
    * Retrieves a student by their username and password.
    *
    * @param username The username of the student.
    * @param password The password of the student.
    * @return The student with the given username and password, or null if not found.
    */
    public Student getStudent(String username,String password){
        for(Student s:allStudent){
            if(s.getsUsername().equals(username)&&s.getsPassword().equals(password))
                return s;
        }
        return null;
    }
    /**
    * Adds a professor to the list of all professors.
    *
    * @param p The professor to be added.
    */
    public void addProfessor(Professor p){
        allProfessor.add(p);
    }
    /**
    * Retrieves a professor by their username and password.
    *
    * @param username The username of the professor.
    * @param password The password of the professor.
    * @return The professor with the given username and password, or null if not found.
    */
    public Professor getProfessor(String username,String password){
        for(Professor p:allProfessor){
            if(p.getpUsername().equals(username)&&p.getpPassword().equals(password))
                return p;
        }
        return null;
    }
    /**
    * Adds a course to the list of all courses.
    *
    * @param c The course to be added.
    */
    public void addCourse(Course c){
        allCourse.add(c);
    }
    /**
    * Retrieves a course by its code.
    *
    * @param code The unique code of the course.
    * @return The course with the given code, or null if not found.
    */
    public Course getCourse(String code){
        for(Course c:allCourse){
            if(c.getcCode().equals(code))
                return c;
        }
        return null;
    }

    public List<Student> getAllStudent() {
        return allStudent;
    }

    public void setAllStudent(List<Student> allStudent) {
        this.allStudent = allStudent;
    }

    public List<Professor> getAllProfessor() {
        return allProfessor;
    }

    public void setAllProfessor(List<Professor> allProfessor) {
        this.allProfessor = allProfessor;
    }

    public List<Course> getAllCourse() {
        return allCourse;
    }

    public void setAllCourse(List<Course> allCourse) {
        this.allCourse = allCourse;
    }

    public List<Course> getAllHistoryCourse() {
        return allHistoryCourse;
    }

    public void setAllHistoryCourse(List<Course> allHistoryCourse) {
        this.allHistoryCourse = allHistoryCourse;
    }
    
}
