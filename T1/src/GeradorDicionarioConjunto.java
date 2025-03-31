import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GeradorDicionarioConjunto {

    private static final Random random = new Random(42); // Seed fixo

    public static Map<Integer, String> criarDicionario(int tamanho) {
        Map<Integer, String> dicionario = new HashMap<>();

        for (int i = 0; i < tamanho; i++) {
            dicionario.put(i, "Valor" + i);
        }

        return dicionario;
    }

    public static Set<Integer> criarConjunto(int tamanho) {
        Set<Integer> conjunto = new HashSet<>();

        for (int i = 0; i < tamanho; i++) {
            conjunto.add(i);
        }

        return conjunto;
    }

    // Para que a busca seja O(n), são geradas chaves inexistentes

    public static Integer[] gerarSearchKey(int qtd, int limite) {
        Integer[] search_keys = new Integer[qtd];

        for (int i = 0; i < qtd; i++) {
            // 50% de chance de buscar uma chave existente, 50% de chance de buscar uma não existente
            if (random.nextBoolean()) {
                search_keys[i] = random.nextInt(limite);
            } else {
                search_keys[i] = limite + random.nextInt(limite);
            }
        }

        return search_keys;
    }
}