package review.java.fundamentals;

import java.util.*;


public class Module1_5Exercise {
    private String legs;
    protected int numberOfLegs;

    public static void main(String[] args) {
        //examplesOnStuden1();
        //treesetMethod();
        vector();
        //  priorityQueue();

        //System.out.println("treeset");

    }

    public static void examplesOnStuden1() {
        Student student = new Student("Solomon", 21);
        student.getAge();
        System.out.println(student.getAge());
    }

    public static void treesetMethod() {
        Set<Student> set = new TreeSet<Student>();//Tree set extends Sotrted set
        Student st1 = new Student("mulu", 34);
        Student st2 = new Student("kebede", 22);
        Student st3 = new Student("mamo", 56);
        Student st4 = new Student("kelemu", 23);
        Student st5 = new Student("minale", 46);
        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
        System.out.println();
        //set.add(new Student("mom",21));
        System.out.println(set.size());//application of the set interface method size()
        System.out.println(set.contains(st1));//application of the set interface method contains
        System.out.println(set.remove(st2));//the application of the set interface method remove()
        System.out.println(set.size());//the tree set can be used to list object in asending or desending order
        //System.out.println(set);
        for (Student stu1 : set) {
            stu1.enrollment();//application of iterator

        }
        //TreeSet<Student>treeSet = new TreeSet<>(set);
        //System.out.println(treeSet);

    }

    public static void vector() {
        Vector<Student> studentVector = new Stack<Student>();
        Student st1 = new Student("mulu", 34);
        Student st2 = new Student("kebede", 22);
        Student st3 = new Student("mamo", 56);
        Student st4 = new Student("kelemu", 23);
        Student st5 = new Student("minale", 46);
        studentVector.add(st1);
        studentVector.add(st2);
        studentVector.add(st3);
        studentVector.add(st4);
        studentVector.add(st5);
        //System.out.println(studentVector);
        studentVector.contains(st1);
        studentVector.capacity();
        System.out.println(studentVector.capacity());
        System.out.println(studentVector.contains(st1));//checking whether student 1 is in the vector or not
        System.out.println(studentVector.elementAt(1).getAge());//apply the list interface methods
        System.out.println(studentVector.hashCode());//apply to check the next element
        //System.out.println();
        // System.out.println(studentVector.size());//apply the list interface method size()
        for (Student student : studentVector) {
            student.enrollment();//call the methods from the vector collection
            student.status();
            student.getClass();
            System.out.println(student.getClass());


        }


    }

    public static void priorityQueue() {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.offer("paris");
        queue.offer("london");
        queue.offer("olathe");
        queue.offer("overlandPark");
        queue.offer("washington dc");
        System.out.println(queue.peek());
        //System.out.println(queue.poll());
        for (String queue1 : queue) {
            System.out.println(queue1.toUpperCase());
            // System.out.println(queue1.toString());
            //  System.out.println(queue1.indexOf("paris"));
        }

    }

}
