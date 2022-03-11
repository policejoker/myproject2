package frank;

public class Student {
    String name;
    int english;
    int math;
    int thesis;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int english, int math) {
        this(name);
        this.name = name;

    }
    public Student(String name, int english, int math) {
        this("John Doe", -1, -1  );
//        name = "John Doe";
//        english = -1;
//        math = -1;
    }

    public void print () {
        System.out.println(name + "\t" + english + "\t" + math + "\t" + average);
        if (average < 60) {
            System.out.println("*");
        }
        if (thesis > 0) {
            System.out.println("");
        }
    }



