package it.unibo.composition;

public class Testing {

    public static void main(final String[] args) {

        // 1)Creare 3 studenti a piacere
        Student alessandroRambaldi = new Student(1, "Alessandro", "Rambaldi", "#abc1234", 2023);
        Student mattiaPozzati = new Student(2, "Mattia", "Pozzati", "pippo123", 2023);
        Student filippoNam = new Student(3, "Filippo", "Nam", "bologna", 2024);

        // 2)Creare 2 docenti a piacere
        Professor pippoBaudo = new Professor(10, "Pippo", "Baudo", "mathgood", new String[] {"Ingegneria", "Laurea-Professionalizzante"});
        Professor giadaSelleri = new Professor(20, "Giada", "Selleri", "discodance", new String[] {"Psicologia", "Architettura"});

        // 3) Creare due aulee di esame, una con 100 posti una con 80 posti
        ExamRoom room1 = new ExamRoom(100, "First room", true, true);
        ExamRoom room2 = new ExamRoom(80, "Second room", false, true);

        // 4) Creare due esami, uno con nMaxStudents=10, l'altro con
        // nMaxStudents=2
        Exam mathExam = new Exam(10, 10, 0, "math-1", pippoBaudo, room2);
        Exam literatureExam = new Exam(2, 2, 0, "literature-1", giadaSelleri, room1);

        // 5) Iscrivere tutti e 3 gli studenti agli esami
        mathExam.registerStudent(alessandroRambaldi);
        mathExam.registerStudent(mattiaPozzati);
        mathExam.registerStudent(filippoNam);

        literatureExam.registerStudent(alessandroRambaldi);
        literatureExam.registerStudent(mattiaPozzati);
        literatureExam.registerStudent(filippoNam);

        // 6) Stampare in stdout la rapresentazione in stringa dei due esami
        System.out.println(mathExam.toString());
        System.out.println(literatureExam.toString());
    }
}
