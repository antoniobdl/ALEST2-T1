import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeMap;
//Ir adicionando os imports necessários

public class Testes {

    // Métodos para testes e comparação

    public static void testarSearch(Map<Integer, String> map, Set<Integer> set, Integer[] keys) {
        System.out.println("\n--- TESTE DE BUSCA ---");
        System.out.println("Tamanho do dicionário: " + map.size());
        System.out.println("Tamanho do conjunto: " + set.size());
        System.out.println("Quantidade de chaves de busca: " + keys.length);

        /*
         Implementar testes de busca. ex:

         long inicio = System.currentTimeMillis();
         int qtd = 0;
         for (Integer key : keys) {
             if (dicionario.containsKey(key)) {
                 qtd++;
             }
         }
         long fim = System.currentTimeMillis();
         System.out.println("Tempo de busca em dicionário: " + (fim - inicio) + " ms (" + qtd + " encontrados.)");

         - Implementar testes de busca para set, arraylist, linkedlist, treeset, etc

         - Comparar resultados

         - Print resultados
        */
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