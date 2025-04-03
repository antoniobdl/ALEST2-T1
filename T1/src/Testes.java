import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Testes {

    // Métodos para testes e comparação

    public static void testarSearch(Map<Integer, String> map, Set<Integer> set, Integer[] keys) {
        System.out.println("\n--- TESTE DE BUSCA ---");
        System.out.println("Tamanho do dicionário: " + map.size());
        System.out.println("Tamanho do conjunto: " + set.size());
        System.out.println("Quantidade de chaves de busca: " + keys.length);

        // HashMap
        long inicioHashMap = System.currentTimeMillis();
        int achadosHashMap = 0;
        for (Integer key : keys) {
            if (map.containsKey(key)) {
                achadosHashMap++;
            }
        }
        long fimHashMap = System.currentTimeMillis();
        System.out.println("\nHashMap: " + (fimHashMap - inicioHashMap) + "ms (" + achadosHashMap + " achados)");

        // HashSet
        long inicioHashSet = System.currentTimeMillis();
        int achadosHashSet = 0;
        for (Integer key : keys) {
            if (set.contains(key)) {
                achadosHashSet++;
            }
        }
        long fimHashSet = System.currentTimeMillis();
        System.out.println("HashSet: " + (fimHashSet - inicioHashSet) + "ms (" + achadosHashSet + " achados)");

        // ArrayList - busca linear
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num : set) {
            arrayList.add(num);
        }

        long inicioArrayList = System.currentTimeMillis();
        int achadosArrayList = 0;
        for (Integer key : keys) {
            if (arrayList.contains(key)) {
                achadosArrayList++;
            }
        }
        long fimArrayList = System.currentTimeMillis();
        System.out.println("ArrayList: " + (fimArrayList - inicioArrayList) + "ms (" + achadosArrayList + " achados)");

        // LinkedList - busca linear
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer num : set) {
            linkedList.add(num);
        }

        long inicioLinkedList = System.currentTimeMillis();
        int achadosLinkedList = 0;
        for (Integer key : keys) {
            if (linkedList.contains(key)) {
                achadosLinkedList++;
            }
        }
        long fimLinkedList = System.currentTimeMillis();
        System.out.println("LinkedList: " + (fimLinkedList - inicioLinkedList) + "ms (" + achadosLinkedList + " achados)");

        // TreeSet - busca log(n)
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer num : set) {
            treeSet.add(num);
        }

        long inicioTreeSet = System.currentTimeMillis();
        int achadosTreeSet = 0;
        for (Integer key : keys) {
            if (treeSet.contains(key)) {
                achadosTreeSet++;
            }
        }
        long fimTreeSet = System.currentTimeMillis();
        System.out.println("TreeSet: " + (fimTreeSet - inicioTreeSet) + "ms (" + achadosTreeSet + " achados)");

        // TreeMap - busca log(n)
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            treeMap.put(entry.getKey(), entry.getValue());
        }

        long inicioTreeMap = System.currentTimeMillis();
        int achadosTreeMap = 0;
        for (Integer key : keys) {
            if (treeMap.containsKey(key)) {
                achadosTreeMap++;
            }
        }
        long fimTreeMap = System.currentTimeMillis();
        System.out.println("TreeMap: " + (fimTreeMap - inicioTreeMap) + "ms (" + achadosTreeMap + " achados)");

        // Resumo
        System.out.println("\nResumo busca:");
        System.out.println("HashMap: \t" + (fimHashMap - inicioHashMap) + "ms");
        System.out.println("HashSet: \t" + (fimHashSet - inicioHashSet) + "ms");
        System.out.println("TreeMap: \t" + (fimTreeMap - inicioTreeMap) + "ms");
        System.out.println("TreeSet: \t" + (fimTreeSet - inicioTreeSet) + "ms");
        System.out.println("ArrayList: \t" + (fimArrayList - inicioArrayList) + "ms");
        System.out.println("LinkedList: \t" + (fimLinkedList - inicioLinkedList) + "ms");
    }

    public static void testarInsert(int tamanho) {
        System.out.println("\n--- TESTE DE INSERÇÃO ---");
        System.out.println("Quantidade de elementos: " + tamanho);

        // Insert

    }

    public static void testarDelete(Map<Integer, String> map, Set<Integer> set, Integer[] keys) {
        System.out.println("\n--- TESTE DE REMOÇÃO ---");
        System.out.println("Tamanho do dicionário: " + map.size());
        System.out.println("Tamanho do conjunto: " + set.size());
        System.out.println("Quantidade de chaves de remoção: " + keys.length);

        // Delete

    }
}