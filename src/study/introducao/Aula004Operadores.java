package study.introducao;

public class Aula004Operadores {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 6;

        // Operadores aritméticos
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        double multiplicacao = num1 * num2;
        float divisao = num1 / (float) num2;
        int modulo = num1 % num2;

        System.out.println(soma);

        //Operadores relacionais < > <= >= == !=
        boolean isDezMaiorQueQuinze = 10 > 15;
        boolean isDezMenorQueQuinze = 10 < 15;
        boolean isDezIgualQueQuinze = 10 == 15;
        boolean isDezDiferenteQueQuinze = 10 != 15;

        System.out.println(isDezMaiorQueQuinze);
        System.out.println(isDezMenorQueQuinze);
        System.out.println(isDezIgualQueQuinze);
        System.out.println(isDezDiferenteQueQuinze);

        //Operadores lógicos && (AND) || (OR) !
        int idade = 25;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4000;
        boolean isDentroDaLeiMenorQueTrinta = idade <= 30 && salario >= 3000;
        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double contaCorrente = 200;
        double contaPoupanca = 8000;
        float valorPlay5 = 5000F;

        boolean isPlay5Compravel = contaCorrente > valorPlay5 || contaPoupanca > valorPlay5;
        System.out.println("isPlay5Compravel " + isPlay5Compravel);

        //Operadores de atribuição = += -= *= /= %=
        double bonus = 1500;
        bonus += 1000; //2500
        bonus -= 1000; //1500
        bonus *= 2; //3000
        bonus /= 2; //1500
        bonus %= 2; //0
        System.out.println("bonus " + bonus);

        int contador = 0;
        contador++; //soma 1

        int contador2 = 100;
        contador2--; //subtrai 1
    }
}
