package dio.sintaxejava;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("pao");
        String primeiroNome = "Isaque";
        String segundoNome = "Elis da Silva";
        String nome = nomeCompleto(primeiroNome,segundoNome);
        System.out.println(nome);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }


}
