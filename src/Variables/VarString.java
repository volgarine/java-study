package Variables;
// Exampe > JAVA 8

public class VarString {
    public static void main(String[] args) {
        java.lang.String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.println(mensagem);

        java.lang.String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.println(java.lang.String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));

    }
}
