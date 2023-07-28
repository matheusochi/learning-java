package exceptions;

import streams.Student;

public class Basic {
    public static void main(String[] args) {
        Student s1 = null;

        try {
            printStudentName(s1);
        } catch(Exception e) {
            System.out.println("Ocorreu um erro ao tentar imprimir o nome do " +
                    "usuário");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ocorreu o erro \"" + e.getMessage() + "\"");
        }
    }

    public static void printStudentName(Student student) {
        System.out.println(student.name);
    }
}
