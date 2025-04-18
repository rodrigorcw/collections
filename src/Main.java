import collections.TestList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

         var testList = TestList.getList();
         testList.forEach(System.out::println);



        // ArrayList - Ordered by insertion, allows duplicates

        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the list
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        fruits.add("Strawberry");
        // Print the list
        System.out.println(fruits);
        // Access an element
        System.out.println("First Fruit is: " + fruits.getFirst());
        // Remove an element
        fruits.remove("Banana");
        System.out.println("The list after removing Banana:" + fruits);
        // Check if list contains an item
        if (fruits.contains("Grape")) {
            System.out.println("Grape is in the list");
        }
        // Loop through the list
        System.out.println("Looping through fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        // Get size through the list
        System.out.println(fruits.size());

// LinkedList - Also ordered by insertion, good for frequent insertions/removals

        List<String> linkedList = new LinkedList<>();
        linkedList.add("Banana");
        linkedList.add("Apple");
        linkedList.add("Orange");
        linkedList.add("Banana"); // duplicate allowed

        linkedList.addFirst("Tomato");
        System.out.println("Using LinkedList: " + linkedList);

        LinkedList<String> namesLinkedList = new LinkedList<>();

        namesLinkedList.add("Ana");
        namesLinkedList.add("Carlos");
        namesLinkedList.addFirst("Beatriz");
        namesLinkedList.add("Ana");

        namesLinkedList.addFirst("inicio");
        namesLinkedList.addLast("fim");

        for (String name : namesLinkedList) {

            System.out.println(name);
        }


        // HashSet - No specific order, duplicates not allowed
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana"); // duplicate ignored
        System.out.println("Using HashSet: " + hashSet);

        Set<String> namesHashSet = new HashSet<>(); // Não ordena e não aceita duplicado
        namesHashSet.add("Adriano");
        namesHashSet.add("Beto"); // ignora elementos duplicados
        namesHashSet.add("Adriana");
        int i = 1;
        for (String name : namesHashSet) {
            System.out.println(i++ + "º" + "nome: " + name);
        }


// TreeSet - Sorted in natural order alphabetic, duplicates not allowed

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");
        treeSet.add("Banana"); // duplicate ignored
        System.out.println("Using treeSet: " + treeSet);


        Set<String> namesTreeSet = new TreeSet<>(); //Ordena a Lista
        namesTreeSet.add("Adriano");
        namesTreeSet.add("Beto"); // ignora elementos duplicados
        namesTreeSet.add("Adriana");

        for (String name : namesTreeSet) {
            System.out.println(i++ + "º" + "nome: " + name);
        }

        // Queue -

        Queue<String> queue = new LinkedList<>();

        // Adicionando pessoas na fila
        queue.add("Client 1");
        queue.add("Client 2");
        queue.add("Client 3");

        // Atendendo clientes
        while (!queue.isEmpty()) {
            String client = queue.poll(); // remove the first of queue
            System.out.println("Atendendo: " + client);
        }


// HashMap - Stores key-value pairs, no duplicate keys, unordered

        Map<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Ana", 20);
        nameAge.put("Maria", 30);

        for (Map.Entry<String, Integer> entry : nameAge.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos");
        }


        HashMap<String, Integer> fruitsPrice = new HashMap<>();

        fruitsPrice.put("Kiwi", 1);
        fruitsPrice.put("pear", 1);
        fruitsPrice.put("Orange", 1);
        fruitsPrice.put("Watermelon", 1);
        fruitsPrice.put("Kiwi", 2);

        // Accessing values by key
        System.out.println("Price of Apple: " + fruitsPrice.get("Kiwi"));

        // Iterating through the map
        System.out.println("All fruit prices:");
        for (Map.Entry<String, Integer> entry : fruitsPrice.entrySet()) {
            System.out.println(entry.getKey() + " - $ " + entry.getValue());
        }
        // Checking for a key
        if (fruitsPrice.containsKey("Orange")) {
            System.out.println("Orange is available.");
        }

        // Removing an entry
        fruitsPrice.remove("Apple");
        System.out.println("After removing Apple: " + fruitsPrice);
    }
}
