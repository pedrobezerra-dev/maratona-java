package study.introducao;

public class Aula002TiposPrimitivos {
    public static void main(String[] args) {
        //char, byte, long, short, int, float, double, boolean

        byte numPequeno = 127; // Armazena de -128 a 127 (1 byte)
        short numCurto = 32000; // Armazena de -32.768 a 32.767 (2 bytes)
        int numero = 100000; // Armazena números inteiros (4 bytes)
        long numeroGrande = 1000000000L; // Armazena números grandes (8 bytes)

        float numeroDecimal = 3.14f; // Armazena números decimais menores (4 bytes)
        double numeroGrandeDecimal = 3.1415926535; // Armazena números decimais grandes (8 bytes)

        char letra = 'A'; // Armazena um único caractere (2 bytes)
        boolean ligado = true; // Armazena verdadeiro ou falso (1 bit)

        String nome = "Yuri Alberto"; //Armazena uma sequência de caracteres

        System.out.println("numPequeno: " + numPequeno);
        System.out.println("numCurto: " + numCurto);
        System.out.println("numero: " + numero);
        System.out.println("numeroGrande: " + numeroGrande);
        System.out.println("numeroDecimal: " + numeroDecimal);
        System.out.println("numeroGrandeDecimal: " + numeroGrandeDecimal);
        System.out.println("letra: " + letra);
        System.out.println("ligado: " + ligado);
        System.out.println("nome: " + nome);
    }
}
