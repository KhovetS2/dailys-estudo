package teste;

import java.util.Date;
import java.util.Calendar;

import javax.swing.JOptionPane;

public class Daily {
    private int id;
    private String conteudo;
    private Date data;
    private int usuarios_id;

    public void getConteudo(String conteudo){
        this.conteudo=conteudo;
    }
    public void getId(int id){
        this.id=id;
    }
    public void getData(Date data){
        this.data=data;
    }
    public void getUsuarios_id(int usuarios_id){
        this.usuarios_id=usuarios_id;
    }
    public void getDados() {
        Calendar c = Calendar.getInstance();
        int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o Id: "));
        String conteudo = JOptionPane.showInputDialog("Digite o conteúdo da Daily: ");
        int usuarios_id = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu id de Usuário: "));
        this.id=id;
        this.conteudo=conteudo;
        this.data=c.getTime();
        this.usuarios_id=usuarios_id;
    }
    public void mostrarConteudo() {
        JOptionPane.showMessageDialog(null, "Id: "+id+"\nConteudo: "+conteudo+"\nData:"+data+" \nUsuarios_id:"+usuarios_id+" \n","Sua daily", JOptionPane.INFORMATION_MESSAGE);
    }
}