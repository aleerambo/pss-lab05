package it.unibo.composition;

import java.util.Arrays;

public class Exam {
    private int currentStudentCount = 0;
    private final int id;
    private final int maxStudents;
    private int registeredStudents;
    private final String courseName;
    private final Professor professor;
    private final ExamRoom room;  //(fornita nei sorgenti)
    private final Student[] students;

    public Exam(
        final int id,
        final int maxStudents,
        final int registeredStudents,
        final String courseName,
        final Professor professor,
        final ExamRoom room
    ) {
        this.id = id;
        this.maxStudents = maxStudents;
        this.registeredStudents = 0;
        this.courseName = courseName;
        this.professor = professor;
        this.room = room;
        this.students = new Student[maxStudents];
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
        return "Exam [ "
            + "id = " + this.id
            + ", max students = " + this.maxStudents
            + ", registered students = " + this.registeredStudents
            + ", course name = " + this.courseName
            + ", pofessor = " + this.professor
            + ", room = " + this.room.toString()
            + ", students = " + Arrays.toString(this.students)
            + " ]";
    }

    public void registerStudent(Student student){
        if(this.currentStudentCount == this.maxStudents){
            System.out.println("Iscrizioni chiuse: limite studenti massimi raggiunto");
        }
        else{
            this.students[this.currentStudentCount] = student;
            this.currentStudentCount++;
            this.registeredStudents++;
        }
    }
}