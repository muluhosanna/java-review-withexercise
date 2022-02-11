package review.java.fundamentals;

import java.util.*;
/*Under this lesson we will cover collection frame work
*Hashset,hashMap,Lists,ArrayLists,LeankedList,Stack,queue,vector,
*

 */

public class Module1_5Lessons {
    public static void main(String[] arg){
       // hasSet();
       // arrayListMethod();
       // marbleComicBookMethod();
      //  methodsOnHasSet();
        //anotherMethod();
        //queueMethod();
       //collectionToArray();



    }

    public static void hasSet(){
        HashSet<String >list = new HashSet<String>();
        list.add("volvo");
        list.add("BMW");
        list.add("Ford");
        list.add("Toyota");
        Object hasSet[] =list.toArray();
        for (int i =0;i<list.size();i++){
           // System.out.println(hasSet[i]);
        }
       list. forEach (e->System.out.println(e));//we can use for ech loop,we can use for loop,we can use iterator.
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
            public static void collectionToArray(){
                Collection<String>collection1 = new ArrayList<>();
                collection1.add("New York");
                collection1.add("Atlanta");
                collection1.add("Dallas");
                collection1.add("Madison");
                collection1.add("Awasa");
                System.out.println(collection1);

        ArrayList<String>string1 = new ArrayList<>();
                string1.add("Seatle");
                string1.add("portlnad");
                string1.add("LossAngeles");
                string1.add("Atlanta");
                string1.add("Awasa");
                System.out.println(string1);
                ArrayList<String>c1 = (ArrayList<String>)(string1.clone());//we can not clone array list from collection
                c1.addAll(collection1);
                System.out.println(c1);// removes collection1 from c1.
                c1.removeAll(collection1);
                System.out.println(c1);//
                c1.retainAll(collection1);
                System.out.println(c1.retainAll(collection1));// it checks whether every element in collection in c1 or not
                string1.addAll(collection1);
                System.out.println(string1.addAll(collection1));//checks whether collection1 is added to string or not.
                c1 = (ArrayList<String>) (string1.clone());//citities in collection String but in collection1.
                c1.removeAll(collection1);
                System.out.println(c1);
                c1 = (ArrayList<String>)(string1.clone());
                c1.removeAll(collection1);
                System.out.println(c1);
                LinkedList<String>str1 = new LinkedList<>();
                str1.add("New York");
                str1.add("Atlanta");
                str1.add("Dallas");
                str1.add("Madison");
                str1.add("Awasa");
                System.out.println(str1);
                str1.remove("Awasa");
                System.out.println("before");
               LinkedList<String>c2 = (LinkedList<String>) (str1.clone());
                c2.addAll(string1);

               HashSet<String>stringHash = new HashSet<>();
                stringHash.add("New York");
                stringHash.add("Atlanta");
                stringHash.add("Dallas");
                stringHash.add("Madison");
                stringHash.add("Madison");
                stringHash.add("Awasa");
                System.out.println("after");
                System.out.println(stringHash);
                System.out.println(stringHash.size());
                stringHash.iterator();
                System.out.println();
                HashSet<Integer>int1 = new HashSet<>();
                int1.add(2);
                int1.add(3);
                int1.add(8);
                int1.add(9);
                System.out.println(int1);
                HashSet<Integer>d3 = (HashSet<Integer>) (int1.clone());
                System.out.println(d3);
                Set<Integer>int2 = new HashSet<>();
                int2.add(9);
                int2.add(10);
                int2.add(2);
                int2.add(7);
                int2.addAll(d3);
                System.out.println(int2);
                Vector<Double>vector = new Vector<>();
                vector.add(2.0);
                vector.add(3.0);
                vector.add(7.0);
                vector.add(9.0);
                vector.remove(7.0);
               // System.out.println(vector.remove(2.0));
                vector.capacity();
                System.out.println(vector);
                Stack<String>stack = new Stack<>();
                stack.add("Olahe");
                stack.add("Lanexsa");
                stack.add("Overland park");
                stack.add("Wichta");
                System.out.println(stack);
                System.out.println("before");

                /*
                 * we can change the given collection toArray method in two ways
                 * one is just as an object x[] = name1.toArray()
                 * and create for loop
                 * second is by the object typ that is Type[]name2 = new Type[name1.size()];
                 * name.toArray(name2);
                 */

                Object x[] =stack.toArray();//using the return object.
                for (int i=0;i<stack.size();i++){
                   System.out.println(x[i]);
                }
                System.out.println("After");
                String[]lemon = new String[stack.size()];//using the return array
                stack.toArray(lemon);
                for (int i= 0;i<stack.size();i++){
                    System.out.println(lemon[i]);

                }
                for (String st:lemon){
                    System.out.println(st);
                }
                TreeSet<String>treeSet = new TreeSet<>();
                treeSet.add("Gondar");
                treeSet.add("Hrar");
                treeSet.add("Ziway");
                treeSet.add("Tepi");
                System.out.println("22222222");
                System.out.println(treeSet);
                for (String til:treeSet){
                    System.out.println(til);
                }

                System.out.println(treeSet.size());
                String[]yadata = new String[treeSet.size()];
                treeSet.toArray(yadata);
                for (int i=0;i<treeSet.size();i++) {
                    System.out.println(yadata[i]);


                }
                HashSet<Student>studentHashSet = new HashSet<>();
                Student studen1 = new Student("Alem",34);
                Student stdent2 = new Student("Ayele",42);
                Student student3= new Student("Kidus",69);
                Student student4 = new Student("Desta",22);
                studentHashSet.add(studen1);
                studentHashSet.add(stdent2);
                studentHashSet.add(student3);
                studentHashSet.add(student4);
                Student[]m = new Student[studentHashSet.size()];//first create object then use for loop.
                studentHashSet.toArray(m);
                for (int i= 0;i<studentHashSet.size();i++){
                    System.out.println(m[i].getName()+" " + m[i].getAge());
                    System.out.println("after");
                    System.out.println(m[0].getName()+m[0].getAge());
                   // System.out.println(m[2].getAge());


                }
                System.out.println("After Hashset");
                ArrayList<Student>listStudent = new ArrayList<>();
                listStudent.add(studen1);
                listStudent.add(stdent2);
                listStudent.add(student3);
                listStudent.add(student4);
                Student[] list45= new Student[listStudent.size()];
                listStudent.toArray(list45);
                for (int i=0;i<listStudent.size();i++){
                   System.out.println(list45[i].getName()+ " " + list45[i].getAge());
                }
                System.out.println("before the array list of integres");
                Student[]array ={studen1,stdent2,student3,student4};
                for (int i =0;i<4;i++){
                    System.out.println(array[i].getName() +" "+ array[i].getAge());
                }
                System.out.println("before the array");
                ArrayList<Integer>arrayList  = new ArrayList<>();
                arrayList.add(1);
                arrayList.add(2);
                arrayList.add(3);
                arrayList.add(1);
                arrayList.add(4);
                arrayList.add(0,10);
                arrayList.add(3,30);
                System.out.println(arrayList);

                LinkedList<Object>linkedList = new LinkedList<Object>(arrayList);
                linkedList.add(1,"red");
                linkedList.removeLast();
                linkedList.addFirst("green");
                System.out.println("Display the linked list forward");
                ListIterator<Object>listIterator = linkedList.listIterator();
                while (listIterator.hasNext()) {
                    System.out.print(listIterator.next() + "");
                    System.out.println();
                }
                    System.out.println("Display the linked lis  backward");
                    listIterator=linkedList.listIterator(linkedList.size());
                    while (listIterator.hasPrevious()){
                        System.out.println(listIterator.previous());
                    }
                    List<Integer>list22= Arrays.asList(10,20,30,40,50);
                    List<String>list33 = Arrays.asList("red","green","blue");
                    System.out.println(list33);
                   list33. forEach(e->System.out.println(e));
                  // System.out.println(" ");



            }



        }





