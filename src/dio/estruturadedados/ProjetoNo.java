package dio.estruturadedados;

public class ProjetoNo {

    public static void main(String[] args) {

        No<String> no1 = new No<String>("conteudo no1");
        No<String> no2 = new No<String>("conteudo no2");
        no1.setProximNo(no2);
        
        No<String> no3 = new No<String>("conteudo no3");
        
        no2.setProximNo(no3);
        
        No<String> no4 = new No<String>("conteudo no4");
        
        no4.setProximNo(no4);
        
        System.out.println(no1);
        System.out.println(no1.getProximNo());

    }


}
