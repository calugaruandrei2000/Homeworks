import java.util.*;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) {


        //1. Write a Java program to iterate through all elements in a array list.
        List<Integer> listIntiger = new ArrayList<>();
        listIntiger.add(1);
        listIntiger.add(3);
        listIntiger.add(5);
        listIntiger.add(7);

        for (Integer element : listIntiger) {
            System.out.println(element);
        }

        System.out.println("==============");


        //2. Write a Java program to insert an element into the array list at the first position.
        List<Integer> list_Intiger = new ArrayList<>();
        list_Intiger.add(1);
        list_Intiger.add(3);
        list_Intiger.add(5);
        list_Intiger.add(7);

        System.out.println(list_Intiger);

        list_Intiger.add(0, 5);
        list_Intiger.remove(3);

        System.out.println(list_Intiger);

        System.out.println("==============");


        //3.  Write a Java program to sort a given array list.
        List<String> countryList = new ArrayList<>();
        countryList.add("Japan");
        countryList.add("Romania");
        countryList.add("Germany");
        countryList.add("Spain");
        countryList.add("France");

        System.out.println("List before sort: " + countryList);

        Collections.sort(countryList);

        System.out.println("List after sort: " + countryList);

        System.out.println("==============");


        //4. Write a Java program to copy one array list into another.
        List<String> cityList = new ArrayList<>();
        cityList.add("Timisoara");
        cityList.add("Cluj");
        cityList.add("Iasi");
        cityList.add("Bucuresti");
        cityList.add("Brasov");


        Collections.copy(cityList ,countryList);
        System.out.println(cityList);

        System.out.println("==============");


        //5. Write a Java program of swap two elements in an array list.

        System.out.println("Array list before Swap:");
        for(String a: countryList){
            System.out.println(a);
        }

        Collections.swap(countryList, 2, 4);

        System.out.println("Array list after swap:");
        for(String b: countryList){
            System.out.println(b);
        }

        System.out.println("==============");


        //6. Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<Integer> int1= new ArrayList<>();
        int1.add(1);
        int1.add(5);
        int1.add(8);
        int1.add(10);
        System.out.println("Original array list: " + int1);
        System.out.println("Trim the capacity of the array below: ");
        int1.trimToSize();
        System.out.println(int1);

        System.out.println("==============");


        //7. Write a Java program to empty an array list.
        ArrayList<Integer> int2= new ArrayList<>();
        int2.add(5);
        int2.add(10);
        int2.add(15);
        int2.add(25);
        System.out.println("Array list before remove all elements: " + int2);

        int2.removeAll(int2);
        System.out.println("Array list after remove all elements: " + int2);

        System.out.println("==============");


        //8. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        LinkedList<String> IteratorList = new LinkedList<>();
        IteratorList.add("benzinarie");
        IteratorList.add("bicicleta");
        IteratorList.add("tricicleta");
        IteratorList.add("motocicleta");
        IteratorList.add("masina");

        Iterator a = IteratorList.listIterator(2);

        while (a.hasNext()) {
            System.out.println(a.next());
        }

        System.out.println("==============");


        //9. Write a Java program to iterate a linked list in reverse order.
        System.out.println("Original linked list:" + IteratorList);

        Iterator it = IteratorList.descendingIterator();

        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("==============");


        //10. Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList <String> fructe = new LinkedList <>();
        fructe.add("mere");
        fructe.add("pere");
        fructe.add("banane");
        System.out.println("Lista originala :" + fructe);
        LinkedList <String> fructeNoi = new LinkedList <>();
        fructeNoi.add("cirese");
        fructeNoi.add("visine");
        fructeNoi.addAll(2, fructeNoi);
        System.out.println("Lista cu adaugari :" + fructe);

        System.out.println("==============");


        //11. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(25);
        numbers.add(5);
        numbers.add(18);
        numbers.add(30);
        numbers.add(50);

        System.out.println("First Element is : " + numbers.getFirst());

        System.out.println("Last Element is : " + numbers.getLast());

        System.out.println("==============");


        //12. Write a Java program to join two linked lists.
        System.out.println("List of first linked list: " + list_Intiger);
        System.out.println("List of second linked list: " + numbers);

        LinkedList <Integer> combine = new LinkedList <>();
        combine.addAll(list_Intiger);
        combine.addAll(numbers);

        System.out.println("New linked list: " + combine);



        System.out.println("==============");


        //13. Write a Java program to clone an linked list to another linked list.
        System.out.println("Original linked  list: " + numbers);
        LinkedList <Integer> newNumbers = new LinkedList <>();
        newNumbers = (LinkedList) numbers.clone();
        System.out.println("Cloned linked list: " + newNumbers);

        System.out.println("==============");



        //14. Write a Java program to remove and return the first element of a linked list.
        System.out.println("Original linked  list: " + numbers);

        System.out.println("Removed element: " + numbers.pop());

        System.out.println("Linked list after pop operation: " + numbers);


        System.out.println("==============");



        //15. Write a Java program to retrieve but does not remove, the first element of a linked list.  ||?


        //16. Write a Java program to iterate through all elements in a hash list.
        HashSet<String> culori = new HashSet<>();

        culori.add("ALb");
        culori.add("Violet");
        culori.add("Galben");
        culori.add("Rosu");

        Iterator<String> p = culori.iterator();

        while (p.hasNext()) {
            System.out.println(p.next());
        }

        System.out.println("==============");



        //17. Write a Java program to test a hash set is empty or not.
        System.out.println("Original Hash Set: " + culori);
        System.out.println("Checking the above array list is empty or not. " + culori.isEmpty());
        System.out.println("Remove all the elements from a hash set: ");
        culori.removeAll(culori);
        System.out.println("Hash set after removing all the elements: " + culori);

        System.out.println("==============");


        //18. Write a Java program to convert a hash set to an array.
        HashSet<Integer> integerHashSet = new HashSet<>();

        integerHashSet.add(5);
        integerHashSet.add(19);
        integerHashSet.add(18);
        integerHashSet.add(20);
        System.out.println("Hash Set elements: " + integerHashSet);

        Integer[] newIntegerHashSet = new Integer[integerHashSet.size()];
        integerHashSet.toArray(newIntegerHashSet);

        System.out.println("Array elements: ");
        for(Integer element : newIntegerHashSet){
            System.out.println(element);
        }

        System.out.println("==============");



        //19. Write a Java program to convert a hash set to a List/ArrayList.
        System.out.println("Hash Set: " + integerHashSet);

        List<Integer> ArrayList = new ArrayList<>(integerHashSet);

        System.out.println("ArrayList: "+ ArrayList);


        System.out.println("==============");



        //20. Write a Java program to compare two sets and retain elements which are same on both sets.
        HashSet<Integer> firstHashSet = new HashSet<>();

        firstHashSet.add(5);
        firstHashSet.add(19);
        firstHashSet.add(18);
        firstHashSet.add(20);
        System.out.println("First Hash Set Set elements: " + firstHashSet);

        HashSet<Integer> secondHashSet = new HashSet<>();

        secondHashSet.add(100);
        secondHashSet.add(5);
        secondHashSet.add(27);
        secondHashSet.add(18);
        System.out.println("First Hash Set Set elements: " + secondHashSet);

        firstHashSet.retainAll(secondHashSet);
        System.out.println("The same elements:");
        System.out.println(firstHashSet);


        System.out.println("==============");



        //21. Write a Java program to remove all of the elements from a hash set.
        System.out.println("Hash Set elements: " + integerHashSet);
        integerHashSet.clear();

        System.out.println("HashSet content: "+integerHashSet);


        System.out.println("==============");


        //22. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> fisrtTree = new TreeSet<>();
        fisrtTree.add("one");
        fisrtTree.add("two");
        fisrtTree.add("three");
        System.out.println("Tree set1: "+fisrtTree);

        TreeSet<String> secondTree = new TreeSet<>();
        secondTree.add("four");
        secondTree.add("five");
        secondTree.add("six");

        System.out.println("Tree set2: "+secondTree);
        fisrtTree.addAll(secondTree);
        System.out.println("Tree set1: "+secondTree);

        System.out.println("==============");



        //23. Write a Java program to create a reverse order view of the elements contained in a given tree set.
        System.out.println("Tree set1: "+fisrtTree);

        System.out.println("Original tree set:" + fisrtTree);
        Iterator b = fisrtTree.descendingIterator();
        // Print list elements in reverse order
        System.out.println("Elements in Reverse Order:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("==============");



        //24. Write a Java program to find the numbers less than 7 in a tree set.
        TreeSet <Integer>treeNumbers = new TreeSet<>();
        TreeSet <Integer>treeheadset = new TreeSet<>();

        treeNumbers.add(1);
        treeNumbers.add(2);
        treeNumbers.add(3);
        treeNumbers.add(5);
        treeNumbers.add(6);
        treeNumbers.add(7);
        treeNumbers.add(8);
        treeNumbers.add(9);
        treeNumbers.add(10);

        treeheadset = (TreeSet)treeNumbers.headSet(7);

        Iterator iterator;
        iterator = treeheadset.iterator();

        System.out.println("Tree set data: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " ");
        }

        System.out.println("==============");


        //25. Write a Java program to get the element in a tree set which is less than or equal to the given element.

        System.out.println("Less than or equal to 5: " + treeNumbers.floor(5));
        System.out.println("Less than or equal to 10: " + treeNumbers.floor(10));


        System.out.println("==============");


        //26. Write a Java program to retrieve and remove the first element of a tree set.

        System.out.println("Tree set: "+treeNumbers);
        System.out.println("The lowest element: "+treeNumbers.pollFirst());
        System.out.println("Tree set after removing the first element: "+treeNumbers);


        System.out.println("==============");


        //27. Write a Java program to retrieve and remove the last element of a tree set.

        System.out.println("Original tree set: "+treeNumbers);
        System.out.println("The highest element: "+treeNumbers.pollLast());
        System.out.println("Tree set after removing the last element: "+treeNumbers);

        System.out.println("==============");


        //28. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap <Integer,String> hashMap1 = new HashMap <>();
        HashMap <Integer,String> hashMap2 = new HashMap <>();

        hashMap1.put(1, "Japonia");
        hashMap1.put(2, "Romania");
        hashMap1.put(3, "Anglia");
        System.out.println("Values in first map: " + hashMap1);

        hashMap2.put(4, "Germania");
        hashMap2.put(5, "Franta");
        hashMap2.put(6, "Spania");
        System.out.println("Values in second map: " + hashMap2);

        hashMap2.putAll(hashMap1);
        System.out.println("Now values in second map: " + hashMap2);


        System.out.println("==============");



        //29. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        boolean result = hashMap1.isEmpty();
        System.out.println("Is hash map empty: " + result);
        hashMap1.clear();

        result = hashMap1.isEmpty();
        System.out.println("Is hash map empty: " + result);


        System.out.println("==============");


        //30. Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("The Original map: " + hashMap2);
        System.out.println("Does key Greece exists?");

        if (hashMap2.containsKey("Greece")) {
            System.out.println("yes :)) " + hashMap2.get("Greece"));
        } else {
            System.out.println("no :((");
        }

        System.out.println("==============");



        //31. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("The Original map: " + hashMap2);
        System.out.println("Does value Romania exists?");

        if (hashMap2.containsValue("Romania")) {
            System.out.println("yes :)) " + hashMap2.get("Romania"));
        } else {
            System.out.println("no :((");
        }

        System.out.println("==============");



        //32. Write a Java program to sort keys in Tree Map by using comparator. ||?


        //33. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        TreeMap <Integer,String> colors = new TreeMap <>();

        colors.put(1, "Alb");
        colors.put(2, "Galben");
        colors.put(3, "Verde");
        colors.put(4, "Gri");
        colors.put(5, "Violet");

        System.out.println("Colors: " + colors);
        System.out.println("Greatest key: " + colors.firstEntry());
        System.out.println("Least key: " + colors.lastEntry());


        System.out.println("==============");


        //34. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.







    }
}
