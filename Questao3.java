import java.util.*;

public class Questao3 {

    private String palavraEscolhida;
    private String substringsDasPalavras;
    private int lengthDaPalavra;
    private int quantDePalavras;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = "";

        System.out.println("Deseja verificar quantos pares de anagramas tem uma palavra?");
        System.out.println("Insira a palavra: \n");
        palavra = sc.next();

        contPalavra(palavra);
        
       

    }




    // ***********MÉTODOS*********//

    static void contPalavra(String string) {

        HashMap<String, Integer> lista = new HashMap<>();

        for (int y = 0; y <= string.length(); y++) {
            for (int x = y; x < string.length(); x++) {

                char[] ArrayPalavra = string.substring(y, x + 1).toCharArray();
                Arrays.sort(ArrayPalavra); 
                String palavra = new String(ArrayPalavra); 
                                                           
                if (lista.containsKey(palavra)) {
                    lista.put(palavra, lista.get(palavra) + 1);
                } else {
                    lista.put(palavra, 1);
                }
            }
        }

        int cotagemPalavras = 0;
        for (String cont : lista.keySet()) {
            int z = lista.get(cont);
            cotagemPalavras += ((z - 1) * z) / 2;
        }
        System.out.print("Total de anagramas é: " + cotagemPalavras);

    }

    public String getPalavraEscolhida() {
        return palavraEscolhida;
    }

    public void setPalavraEscolhida(String palavraEscolhida) {
        this.palavraEscolhida = palavraEscolhida;
    }

    public String getSubstringsDasPalavras() {
        return substringsDasPalavras;
    }

    public void setSubstringsDasPalavras(String substringsDasPalavras) {
        this.substringsDasPalavras = substringsDasPalavras;
    }

    public int getLengthDaPalavra() {
        return lengthDaPalavra;
    }

    public void setLengthDaPalavra(int lengthDaPalavra) {
        this.lengthDaPalavra = lengthDaPalavra;
    }

    public int getQuantDePalavras() {
        return quantDePalavras;
    }

    public void setQuantDePalavras(int quantDePalavras) {
        this.quantDePalavras = quantDePalavras;
    }

}
