package review.java.fundamentals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class Module1_5Lessons {
    public static void main(String[] arg){
       // hasSet();
        //arrayListMethod();
       // marbleComicBookMethod();
      //  methodsOnHasSet();
        //anotherMethod();
        queueMethod();

    }

    public static void hasSet(){
        HashSet<String >list = new HashSet<String>();
        list.add("volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Toyota");
       // for(String i:list){
           // System.out.println(i);
            Iterator<String>it = list.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        public static void arrayListMethod(){
            ArrayList<String>listarray =new ArrayList<>();
            listarray.add("fundamentals");
            listarray.add("Java");
            listarray.add("Module");
            System.out.println(listarray.size());
            try {
                for (int i =0;i<listarray.size();i++){
                    System.out.println(listarray.get(i));
                }


                System.out.println(listarray.get(3));
            }catch (IndexOutOfBoundsException ax){

                System.out.println(ax.getMessage());
            }finally {
                System.out.println("final block");

            }
            }
            public static void marbleComicBookMethod(){
        ArrayList<MarbleComic>marbles = new ArrayList<MarbleComic>();
        marbles.add(new MarbleComic("mulu","java","2013","hero"));
        marbles.add(new MarbleComic("selam","python","2020","badguy"));
        marbles.add(new MarbleComic("hagos","C++","2021","silent"));
        for (MarbleComic i:marbles){
            System.out.println(i);

            }
                for (int i =0;i<marbles.size();i++){
                    //System.out.println(marbles.isEmpty());
                  // System.out.println(marbles.remove(0));
                   //System.out.println(marbles.iterator());
                    //System.out.println(marbles.addAll(marbles));
                   // System.out.println(marbles.hashCode());
                  //  System.out.println(marbles.indexOf(marbles));
                    System.out.println(marbles.get(i).character);
                    System.out.println(marbles.get(i).title);
                    System.out.println(marbles.get(i).author);
        }


        }
        public static void methodsOnHasSet(){
        HashSet<DcComic>dcComics = new HashSet<>();
        dcComics.add(new DcComic("mulu","java","2013","hero"));
        dcComics.add(new DcComic("kebede","python","2014","funny"));
        dcComics.add(new DcComic("wasihune","javaScript","2011","sleepy"));
            Iterator<DcComic>it = dcComics.iterator();
            //System.out.println(it.next());
            while (it.hasNext()){
               //System.out.println(it.next().title);
                System.out.println(it.next().character);
            }

            }
            public static void anotherMethod(){
        ArrayList<Integer>myInteger = new ArrayList<>();
        myInteger.add(48);
        myInteger.add(22);
        myInteger.add(18);
        myInteger.add(13);
        myInteger.add(46);
        for (int i=0;i<myInteger.size();i++){
           // System.out.println(myInteger.get(i).toString());
           // System.out.println(myInteger.indexOf(myInteger));
           // System.out.println(myInteger.clone());
            System.out.println(myInteger.contains(2));
        }


            }
            public static void queueMethod(){
                PriorityQueue<Long>myPriority = new PriorityQueue<Long>();
                myPriority.add(123456789L);
                myPriority.add(11234578L);
                myPriority.add(111234578L);
                myPriority.offer(1111234567L);
                myPriority.poll();
                System.out.println(myPriority.peek());
                //System.out.println(myPriority.toString());
              //  System.out.println(myPriority.poll());
                //System.out.println(myPriority.offer(11111234567L));


            }

        }





