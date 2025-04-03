import java.util.Set;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Gerar de maps e sets de diferentes tamanhos para usar nos testes
        Map<Integer, String> mapGrande = GeradorDicionarioConjunto.criarDicionario(100000);
        Map<Integer, String> mapMedio = GeradorDicionarioConjunto.criarDicionario(10000);
        Set<Integer> setPequeno = GeradorDicionarioConjunto.criarConjunto(100);

        //Gerar search keys para simular busca, remoção, etc. Mesma idéia
        Integer[] poucasKeys = GeradorDicionarioConjunto.gerarSearchKey(1000, 1000);
        Integer[] muitasKeys = GeradorDicionarioConjunto.gerarSearchKey(500000, 1000000);

        //Iniciar testes

        System.out.println("Teste com conjunto pequeno:");
        Testes.testarSearch(mapMedio, setPequeno, poucasKeys);

        System.out.println("Teste com conjunto grande:");
        Testes.testarSearch(mapGrande, setPequeno, muitasKeys);


    }

}