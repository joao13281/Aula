
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class WordTypeCount {
    public static void main(String[] args) {
        //cria HashMap para armazenar chaves de Strings e valores Integer
        Map<String, Integer> myMap=new HashMap<>();

        createMap(myMap);//cria mapa com base na entrada do usuário
        displayMap(myMap);// exibe o conteudo do mapa
    }
    //cria mapa de entarda do usuario
    private static void createMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String:");
        String input = scanner.nextLine();

        //tokeniza a entrada
        String [] tokens = input.split(" ");
        for (String token : tokens){
            String word = token.toLowerCase();//obtem a palavra em letras minusculas

            //se o mapa contiver a palavra
            if (map.containsKey(word)){ //a palavra está no mapa
                int count = map.get(word);// obtem a contagem atual
                map.put(word, count+1); //incrementa a contagem
            } else {
                map.put(word,1); //adiciona nova palavra com uma contagem de 1 para mapa
            }
        }
    }
    // exie conteudo do mapa
    private static void displayMap(Map<String, Integer> map){
        Set <String> keys = map.keySet(); //obtem chaves

        //classifica as chaves
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%n Map contains:%nKey\t\tValue%n");

        //gera saida de cada chave no mapa
        for (String key: sortedKeys){
            System.out.printf("%-10s%10s%n",key,map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(),map.isEmpty());
    }
}// fim da classe WordTypeCount

