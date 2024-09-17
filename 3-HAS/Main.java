import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args){

        //Create all instructors and textbook needed

        Instructor instructor1 = new Instructor("Nima","Davarpanah","3-2636");
        Instructor instructor2 = new Instructor("Luke","Smith","3-2638");
        Textbook textbook1 = new Textbook("Clean Code","Robert C. Martin", "Prentice Hall");
        Textbook textbook2 = new Textbook("Finding Patterns","John D. Lee", "Cal Poly");

        //Course with one instructor and one textbook
        Instructor[] ins1 = {instructor1};
        Textbook[] tex1 = {textbook1};
        Course course1 = new Course("CS-5800",ins1, tex1);
        course1.print();

        Instructor[] ins2 = {instructor1,instructor2};
        Textbook[] tex2 = {textbook1,textbook2};
        Course course = new Course("SE", ins2,tex2);
        course.print();
    }
}
