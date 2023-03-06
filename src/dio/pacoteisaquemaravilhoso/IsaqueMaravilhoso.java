/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dio.pacoteisaquemaravilhoso;

import java.sql.Date;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;

import teste.Daily;

/**
 *
 * @author Fatec
 * <h1>Gisele pao de batata</h1>
 */
public class IsaqueMaravilhoso {

    /**
     * @param args the command line arguments
     * <h1>A função principal que mostra o quão lindo o Isaque é</h1>
     */
    public static void main(String[] args){
        // componente JFrame
        int i;
        JFrame janela = new JFrame("Título da janela");
        janela.setBounds(300, 200, 700, 500); // Seta posicao e tamanho
        janela.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout(); // Define o layout do container
        Container caixa = janela.getContentPane(); // Define o tamanho
        caixa.setLayout(flow); // Seta layout do container
        JLabel label = new JLabel("Exemplo de texto:");
        caixa.add(label);
        JTextField campo = new JTextField(15);
        caixa.add(campo);
        caixa.add(new JButton("Aperte para criar daily"));
        caixa.add(new JButton("Aperte para visualizar daily"));
        janela.pack(); // Redimensiona a janela
        janela.setVisible(true);
        //Daily daily = new Daily();

    }
    
}
