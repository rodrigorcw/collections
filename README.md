# 📚 Java Collections Examples

This project demonstrates the usage of several **Java Collections**, including `List`, `Set`, `Queue`, `Map`, and `LinkedList`, using **Generics**. Each example shows how these data structures work and their key characteristics.

---

## ✅ List - `ArrayList`

Stores elements in insertion order and **allows duplicates**.

```java
List<String> names = new ArrayList<>();
names.add("Adriano");
names.add("Juliano");
names.add("Ricardo");

int i = 1;
for (String name : names) {
    System.out.println(i++ + "º name: " + name);
}

## ✅ Set - HashSet
Stores elements without duplicates and no guaranteed order.

HashSet<String> names = new HashSet<>();
names.add("Adriano");
names.add("Beto");
names.add("Adriana");

int i = 1;
for (String name : names) {
    System.out.println(i++ + "º name: " + name);
}

✅ Set - TreeSet
Stores elements without duplicates and in natural order (alphabetical).

TreeSet<String> names = new TreeSet<>();
names.add("Adriano");
names.add("Beto");
names.add("Adriana");

int i = 1;
for (String name : names) {
    System.out.println(i++ + "º name: " + name);
}

✅ LinkedList
Allows adding/removing elements from the beginning, middle, or end. It can be used as a list, stack, or queue.

LinkedList<String> names = new LinkedList<>();
names.add("Ana");
names.add("Carlos");
names.addFirst("Beatriz");
names.add("Ana");

names.addFirst("start");
names.addLast("end");

for (String name : names) {
    System.out.println(name);
}

✅ Queue - Using LinkedList as a queue
Simulates a service line (FIFO - First In, First Out).

Queue<String> queue = new LinkedList<>();
queue.add("Customer 1");
queue.add("Customer 2");
queue.add("Customer 3");

while (!queue.isEmpty()) {
    String customer = queue.poll();
    System.out.println("Serving: " + customer);
}

✅ Map - HashMap
Stores key/value pairs, does not allow duplicate keys.

Map<String, Integer> ageByName = new HashMap<>();
ageByName.put("Ana", 20);
ageByName.put("Maria", 30);

for (Map.Entry<String, Integer> entry : ageByName.entrySet()) {
    System.out.println(entry.getKey() + " is " + entry.getValue() + " years old");
}

🚀 How to Run
1 - Clone the repository:git clone https://github.com/rodrigorcw/java-collections-examples.git
2 - Compile and run with any IDE or directly from the terminal:
javac Example.java
java Example

📌 Requirements
Java 8 or higher
IDE like IntelliJ, Eclipse, or VS Code (optional)




