package gr.aueb.cf.ch11;

import gr.aueb.cf.testbed.ch7.Str;

/**
 * Definition of a simple Student Class
 */
public class Student {

    private static int studentsCount = 0;

    private int id;
    private String firstname;
    private String lastname;


    public Student() {
        studentsCount++;
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        studentsCount++;
    }

    public static int getStudentsCount() {
        return studentsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }


    //
//    // Default Constructor (αρχικοποίηση στις default τιμές)
//    // Δεν χρειάζεται γίνεται αυτόματα από το JVM
//    public Student()   {
////        id = 0;
////        firstname = null;
////        lastname = null;
//    }
//
//    // Overloaded constructor
//    // Εάν ορίσουμε Overloaded Constructor,
//    // πρέπει να ορίσουμε οπωσδήποτε απλό constructor
//    public Student(int id, String firstname, String lastname) {
//        this.id = id;
//        this.firstname = firstname;
//        this.lastname = lastname;
//    }
//
//
    }

