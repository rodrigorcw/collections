import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        List<String> names = new ArrayList<>();
//        names.add("Adriano");
//        names.add("Juliano");
//        names.add("Ricardo");
//        int i = 1;
//        for (String name : names){
//
//            System.out.println(i++ +"º" +"nome: " + name);
//        }

//        HashSet<String> names = new HashSet<>(); // Não ordena e não aceita duplicado
//        names.add("Adriano");
//        names.add("Beto"); // ignora elementos duplicados
//        names.add("Adriana");
//        int i = 1;
//        for (String name : names) {
//
//            System.out.println(i++ + "º" + "nome: " + name);
//        }

//        TreeSet<String> names = new TreeSet<>(); //Ordena a Lista
//        names.add("Adriano");
//        names.add("Beto"); // ignora elementos duplicados
//        names.add("Adriana");
//        int i = 1;
//        for (String name : names) {
//
//            System.out.println(i++ + "º" + "nome: " + name);
//        }


//        LinkedList<String> names = new LinkedList<>();
//
//        names.add("Ana");
//        names.add("Carlos");
//        names.addFirst("Beatriz");
//        names.add("Ana");
//
//        names.addFirst("inicio");
//        names.addLast("fim");
//
//        for(String name : names){
//
//            System.out.println(name);
//        }
//    }

//        Queue<String> fila = new LinkedList<>();
//
//        // Adicionando pessoas na fila
//        fila.add("Cliente 1");
//        fila.add("Cliente 2");
//        fila.add("Cliente 3");
//
//        // Atendendo clientes
//        while (!fila.isEmpty()) {
//            String cliente = fila.poll(); // remove e retorna o primeiro da fila
//            System.out.println("Atendendo: " + cliente);
//        }
//    }

        Map<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Ana", 20);
        idadePorNome.put("Maria", 30);

        for (Map.Entry<String, Integer> entry : idadePorNome.entrySet()) {
            System.out.println(entry.getKey() + " tem " + entry.getValue() + " anos");
        }
    }
}

