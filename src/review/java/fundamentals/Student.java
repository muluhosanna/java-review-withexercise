package review.java.fundamentals;

public class Student implements Comparable<Student> {
    private String name;
    private String gender;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void enrollment() {
        System.out.println("Name of student:" + getName() + "\n the age of the student" + getAge());

    }

    public void status() {

        System.out.println("Promoted");
    }

    @Override
    public int compareTo(Student stu) {
        if (this.age == stu.getAge()) {
            return 0;
        } else if (this.age > stu.age) {
            return 1;
        } else {
            return -1;
        }

    }
}
