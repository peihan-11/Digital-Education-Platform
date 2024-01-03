/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Professor;

import Business.Course.Course;
import Business.Person.Person;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author JANFAN
 */
public class Professor extends Person {
    private int ProfessorID;
    private List<Integer>rank;
    private List<String>comment;
    private Double rate;
    private String pUsername;
    private String pPassword;
    private List<Course>courseList;
    private List<Course>courseHistory;
    private String topic;

    /**
    * Default constructor for the Professor class.
    * Initializes the professor's attributes with default values and creates empty lists for rank,
    * comments, courseList, and courseHistory.
    */
    public Professor() {
        rank=new ArrayList<>();
        courseList=new ArrayList<>();
        courseHistory=new ArrayList<>();
    }
    /**
    * Parameterized constructor for the Professor class.
    * Initializes the professor's attributes with provided values, and creates empty lists for rank,
    * comments, courseList, and courseHistory.
    *
    * @param pUsername The username of the professor.
    * @param pPassword The password of the professor.
    */
    public Professor(String pUsername, String pPassword) {
        this.pUsername = pUsername;
        this.ProfessorID=ProfessorID;
        this.pPassword = pPassword;
        rank=new ArrayList<>();
        comment = new ArrayList<>();
        courseList=new ArrayList<>();
        courseHistory=new ArrayList<>();
        this.name="Not defined";
        this.gender="Not defined";
        this.age=0;
        this.email="Not defined";
        this.region="Not defined";
        this.Language="Not defined";
        this.topic="Not defined";
        this.image=null;
        this.birthday=LocalDate.of(2023,1,1);
    }

    public List<String> getComment() {
        return comment;
    }

    public void setComment(List<String> comment) {
        this.comment = comment;
    }
    
    
    public Double getRate () {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
    
    public void calRate(){
        int total=0;
        for(int i:rank){
            total+=i;
        }
        rate=Double.valueOf(total)/Double.valueOf(rank.size());
    }
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public List<Course> getCourseHistory() {
        return courseHistory;
    }

    public void setCourseHistory(List<Course> courseHistory) {
        this.courseHistory = courseHistory;
    }

    public int getProfessorID() {
        return ProfessorID;
    }

    public void setProfessorID(int ProfessorID) {
        this.ProfessorID = ProfessorID;
    }

    public List<Integer> getRank() {
        return rank;
    }

    public void setRank(List<Integer> rank) {
        this.rank = rank;
    }

    public String getpUsername() {
        return pUsername;
    }

    public void setpUsername(String pUsername) {
        this.pUsername = pUsername;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }
    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLanguage() {
        return Language;
    }

    public void setLanguage(String Language) {
        this.Language = Language;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
   /**
    * Returns a string representation of the professor, which is the professor's name.
    *
    * @return The name of the professor as a string.
    */
   @Override
   public String toString(){
       return name;
   }
    
}
