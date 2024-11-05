package it.unibo.composition;

public class Exam {
    int currentStudentCount = 0;
    int id;
    int maxStudents;
    int registeredStudents;
    String courseName;
    Professor professor;
    ExamRoom room;  //(fornita nei sorgenti)
    Student[] students;

    public Exam(
        final int id,
        final int maxStudents,
        final int registeredStudents,
        final String courseName,
        final Professor professor,
        final ExamRoom room,
        final Student[] students
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = students;
    }

    public int getId(){
        return this.id;
    }

    public int getMaxStudents(){
        return this.maxStudents;
    }

    public int getRegisteredStudents(){
        return this.registeredStudents;
    }

    public String getCourseName(){
        return this.courseName;
    }

    public Professor getProfessor(){
        return this.professor;
    }

    public ExamRoom getExamRoom(){
        return this.room;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public String toString(){
        return "Exam ["
            + "id = " + this.id
            + "max students = " + this.maxStudents
            + "registered students = " + this.registeredStudents
            + "course name = " + this.courseName
            + "pofessor = " + this.professor
            + "room = " + this.room
            + "students = " + this.students.toString()
            + "]";
    }

    public void registerStudent(Student student){
        if(this.students.length == this.maxStudents){
            System.out.println("Iscrizioni chiuse: limite studenti massimi raggiunto");
        }
        else{
            this.students[this.currentStudentCount] = student;
            this.currentStudentCount++;
        }
    }
}