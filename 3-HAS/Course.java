import javax.swing.text.html.HTMLDocument.Iterator;

public class Course {
    private String course;
    private Instructor[] instructor;
    private Textbook[] textbook;

    public Course(String course, Instructor[] instructor, Textbook[] textbook){
        this.course = course;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void print() {
        System.out.println("\nCourse name: " + course);
        for(Instructor i : instructor){
            i.print();
        }
        for( Textbook b: textbook){
        b.print();
        }
    }


}
