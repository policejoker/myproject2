package frank;

public class Scoring {
    public static void main (String[] args ) {
        Student jack = new Student("Jack", 78, 90);
        Student frank = new Student("frank",68,80);
        GraduateStudent jane = new GraduateStudent("Jane",65,74,68);




        jack.print();
        frank.print();
        jane.print();
    }
}
