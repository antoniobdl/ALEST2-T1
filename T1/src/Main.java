import java.util.Set;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Gerar de maps e sets de diferentes tamanhos para usar nos testes
        Map<Integer, String> mapGrande = GeradorDicionarioConjunto.criarDicionario(100000);
        Set<Integer> setPequeno = GeradorDicionarioConjunto.criarConjunto(100);

        //Gerar search keys para simular busca, remoção, etc. Mesma idéia
        Integer[] poucasKeys = GeradorDicionarioConjunto.gerarSearchKey(10, 100);
        Integer[] muitasKeys = GeradorDicionarioConjunto.gerarSearchKey(10, 100000);

        //Iniciar testes
        Testes.testarSearch(mapGrande, setPequeno, muitasKeys);
        Testes.testarDelete(mapGrande, setPequeno, poucasKeys);


    }

}