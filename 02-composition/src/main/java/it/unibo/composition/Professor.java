package it.unibo.composition;

public class Professor implements User {
    int id;
    String name;
    String surname;
    String password;
    String[] courses;
    
    public Professor(
        final int id,
        final String name,
        final String surname,
        final String password,
        final String[] courses
    ){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.courses = courses;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getId() {
        return this.id;
    }

    public String[] getCourses() {
        return this.courses;
    }

    public String getUsername() {
        return this.name + "." + this.surname;
    }

    public String getPassword() {
        return this.password;
    }

    public String getDescription() {
        return this.toString();
    }

    public void replaceCourse(String courseName, int index){
        if(index <= 0 || index > this.courses.length){
            System.out.println("Invalid index: " + index);
        }
        else{
            this.courses[index] = courseName;
        }
    }

    public void replaceAllCourses(String[] newCourses){
        this.courses = newCourses;
    }
}
