/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.time.LocalDate;
import javax.swing.ImageIcon;

/**
 *
 * @author JANFAN
 */

/**
 * The abstract base class representing a person.
 * This class defines common attributes and accessors for a person, such as name, gender, age, email, region,
 * language, image, and birthday.
 */
public abstract class Person {
    protected String name;
    protected String gender;
    protected int age;
    protected String email;
    protected String region;
    protected String Language;
    protected ImageIcon image;
    protected LocalDate birthday;
    
    public abstract String getName();
    public abstract void setName(String name);

    public abstract String getGender();

    public abstract void setGender(String gender);

    public abstract int getAge();

    public abstract void setAge(int age);

    public abstract String getEmail();

    public abstract void setEmail(String email);

    public abstract String getRegion();

    public abstract void setRegion(String region);

    public abstract String getLanguage();

    public abstract void setLanguage(String Language);

    public abstract ImageIcon getImage();

    public abstract void setImage(ImageIcon image);

    public abstract LocalDate getBirthday();

    public abstract void setBirthday(LocalDate birthday);
    
}
