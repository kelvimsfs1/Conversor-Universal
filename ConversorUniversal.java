package Projeto1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class ConversorUniversal extends JFrame{
	
	public ConversorUniversal() {
        JPanel painel = new JPanel();
        
        
		
		setTitle("Conversor Universal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setSize(500,500);
		add(painel);
		configureMenu();
		show();
		
		
	}
      
	   ////
	   private void configureMenu() {
		   JMenuBar bar = new JMenuBar();
		   setJMenuBar(bar);
		   
		   JMenu menu1 = new JMenu("Arquivo");
		   JMenu menu2 = new JMenu("Editar");
		   JMenu menu3 = new JMenu("Ajuda");
		   JMenuItem teste = new JMenuItem("Arquivo1", KeyEvent.VK_S);
		   JMenuItem teste1 = new JMenuItem("Conteúdo Editado", KeyEvent.VK_S);
		   JMenuItem teste2 = new JMenuItem("Material de Ajuda", KeyEvent.VK_S);
		   menu1.add(teste);
		   menu2.add(teste1);
		   menu3.add(teste2);
		   
		   JPanel moeda = new JPanel();
		   moeda.setLayout(null);
		   moeda.setPreferredSize(new Dimension(300,300));
		   
		   JPanel temperatura = new JPanel();
		   temperatura.setLayout(null);
		   temperatura.setPreferredSize(new Dimension(300,300));
		   
		   JPanel comprimento = new JPanel();
		   comprimento.setLayout(null);
		   comprimento.setPreferredSize(new Dimension(300,300));
		   
		   JTabbedPane tab = new JTabbedPane();
		   
		   tab.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
		   
		   moeda.setBorder(BorderFactory.createCompoundBorder(
					// Margem
					BorderFactory.createEmptyBorder(20, 20, 20, 20)
					// Com titulo
				   ,BorderFactory.createTitledBorder("Moeda")));
		   
		   
		   temperatura.setBorder(BorderFactory.createCompoundBorder(
					// Margem
					BorderFactory.createEmptyBorder(20, 20, 20, 20)
					// Com titulo
				   ,BorderFactory.createTitledBorder("Temperatura")));
		   
		   
		   
		   comprimento.setBorder(BorderFactory.createCompoundBorder(
					// Margem
					BorderFactory.createEmptyBorder(20, 20, 20, 20)
					// Com titulo
				   ,BorderFactory.createTitledBorder("Comprimento")));
		   
		   tab.addTab("Temperatura", temperatura);
		   tab.addTab("Moeda", moeda);
		   tab.addTab("Comprimento", comprimento);
		   
		   String real [] = {"Real", "Dolar"};
		   String temp [] = {"Celsius", "Kelvin"};
		   String med [] = {"Metro","Centimetro"};
		   
		   
		   JComboBox<String> combox = new JComboBox<String>(real); 
		   combox.setBounds(100, 100, 100, 20);
		   combox.setSelectedIndex(-1);
		   
		   JComboBox<String> combox1 = new JComboBox<String>(real);
		   combox1.setBounds(250, 100, 100, 20);
		   combox1.setSelectedIndex(-1);
		   
		   JComboBox<String> comboxTemp = new JComboBox<String>(temp);
		   comboxTemp.setBounds(100, 100, 100, 20);
		   comboxTemp.setSelectedIndex(-1);
		   
		   JComboBox<String> comboxTemp1 = new JComboBox<String>(temp);
		   comboxTemp1.setBounds(250, 100, 100, 20);
		   comboxTemp1.setSelectedIndex(-1);
		   
		   JComboBox<String> comboxMed = new JComboBox<String>(med);
		   comboxMed.setBounds(100, 100, 100, 20);
		   comboxMed.setSelectedIndex(-1);
		   
		   JComboBox<String> comboxMed1 = new JComboBox<String>(med);
		   comboxMed1.setBounds(250, 100, 100, 20);
		   comboxMed1.setSelectedIndex(-1);
		   
		   JTextField moedaParaTextField = new JTextField();
		   moedaParaTextField.setBounds(250, 150, 100, 20);
		   
		   JTextField moedaDeTextField = new JTextField(10);
		   moedaDeTextField.setBounds(100, 150, 100, 20);
		   
		   JTextField tempParaTextField = new JTextField();
		   tempParaTextField.setBounds(250, 150, 100, 20);
		   
		   JTextField tempDeTextField = new JTextField();
		   tempDeTextField.setBounds(100, 150, 100, 20);
		   
		   JTextField medParaTextField = new JTextField();
		   medParaTextField.setBounds(250, 150, 100, 20);
		   
		   JTextField medDeTextField = new JTextField();
		   medDeTextField.setBounds(100, 150, 100, 20);
		    
		    
		   combox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				 
				moedaParaTextField.setText(null);	
			}
			      
		   });
		   
		   combox1.addActionListener(new ActionListener() {
			   
				@Override
				public void actionPerformed(ActionEvent e) {
					
					moedaParaTextField.setText(null);	
					
				}
				   			   
			   });
		   
		   comboxTemp.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					tempParaTextField.setText(null);	
				}
				      
			   });
		   
		   comboxTemp1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					tempParaTextField.setText(null);	
				}
				      
			   });
		   
		   comboxMed.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					medParaTextField.setText(null);	
				}
				      
			   });
		   
		   comboxMed1.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					 
					medParaTextField.setText(null);	
				}
				      
			   });
		   
		   JButton converter = new JButton("Converter");
		   converter.setBounds(250, 200, 100, 20);
		   
		   JButton converterTemp = new JButton("Converter");
		   converterTemp.setBounds(250, 200, 100, 20);
		   
		   JButton converterMed = new JButton("Converter");
		   converterMed.setBounds(250, 200, 100, 20);
		   
		   
		   JLabel labelMoeda = new JLabel("De");
		   labelMoeda.setBounds(75, 100, 20, 20);
		   
		   JLabel labelMoeda1 = new JLabel("Para");
		   labelMoeda1.setBounds(210, 100, 40, 20);
		   
		   JLabel labelTemp = new JLabel("De");
		   labelTemp.setBounds(75, 100, 20, 20);
		   
		   JLabel labelTemp1 = new JLabel("Para");
		   labelTemp1.setBounds(210, 100, 40, 20);
		   
		   JLabel labelMed = new JLabel("De");
		   labelMed.setBounds(75, 100, 20, 20);
		   
		   JLabel labelMed1 = new JLabel("Para");
		   labelMed1.setBounds(210, 100, 40, 20);
		   
		   
		   
		   converter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// Pegar a moeda que foi selecionada 
				String moedaDe = (String) combox.getSelectedItem();
				// Pegar a moeda para qual deve ser convertido
				String moedaPara = (String) combox1.getSelectedItem();
				
				
				
				float valorDe = Float.parseFloat(moedaDeTextField.getText());
				float valorPara = (float) 0.0;
				if(moedaDe.equals("Real") && moedaPara.equals("Real")) {
					
					valorPara = valorDe*1;
				}
				
                if(moedaDe.equals("Real") && moedaPara.equals("Dolar")) {
					
					valorPara = valorDe/4;
				}
                
                if(moedaDe.equals("Dolar") && moedaPara.equals("Real")) {
					
					valorPara = valorDe*4;
				}
				
               if(moedaDe.equals("Dolar") && moedaPara.equals("Dolar")) {
					
					valorPara = valorDe*1;
				}
				
				
				
				
				moedaParaTextField.setText(Float.toString(valorPara));
			}
		});
		   
		   converterTemp.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// Pegar a moeda que foi selecionada 
					String tempDe = (String) comboxTemp.getSelectedItem();
					// Pegar a moeda para qual deve ser convertido
					String tempPara = (String) comboxTemp1.getSelectedItem();
					
					
					
					float valorDe = Float.parseFloat(tempDeTextField.getText());
					float valorPara = (float) 0.0;
					if(tempDe.equals("Celsius") && tempPara.equals("Celsius")) {
						
						valorPara = valorDe*1;
					}
					
	                if(tempDe.equals("Kelvin") && tempPara.equals("Celsius")) {
						
						valorPara = (float) (valorDe - 273.5);
					}
	                
	                if(tempDe.equals("Celsius") && tempPara.equals("Kelvin")) {
						
						valorPara = (float) (valorDe + 273.5);
					}
					
	               if(tempDe.equals("Kelvin") && tempPara.equals("Kelvin")) {
						
						valorPara = valorDe*1;
					}
					
					
					
					
					tempParaTextField.setText(Float.toString(valorPara));
				}
			});
		   
		   converterMed.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// Pegar a moeda que foi selecionada 
					String medDe = (String) comboxMed.getSelectedItem();
					// Pegar a moeda para qual deve ser convertido
					String medPara = (String) comboxMed1.getSelectedItem();
					
					
					
					float valorDe = Float.parseFloat(medDeTextField.getText());
					float valorPara = (float) 0.0;
					if(medDe.equals("Centimetro") && medPara.equals("Centimetro")) {
						
						valorPara = valorDe*1;
					}
					
	                if(medDe.equals("Metro") && medPara.equals("Centimetro")) {
						
						valorPara = valorDe*100;
					}
	                
	                if(medDe.equals("Centimetro") && medPara.equals("Metro")) {
						
						valorPara = valorDe/100;
					}
					
	               if(medDe.equals("Metro") && medPara.equals("Metro")) {
						
						valorPara = valorDe*1;
					}
					
					
					
					
					medParaTextField.setText(Float.toString(valorPara));
				}
			});
		   moeda.add(combox);
		   moeda.add(moedaDeTextField);
		   moeda.add(combox1);
		   moeda.add(moedaParaTextField);
		   moeda.add(converter);
		   moeda.add(labelMoeda);
		   moeda.add(labelMoeda1);
		   
		   temperatura.add(comboxTemp);
		   temperatura.add(tempDeTextField);
		   temperatura.add(comboxTemp1);
		   temperatura.add(tempParaTextField);
		   temperatura.add(converterTemp);
		   temperatura.add(labelTemp);
		   temperatura.add(labelTemp1);
		   
		   comprimento.add(comboxMed);
		   comprimento.add(medDeTextField);
		   comprimento.add(comboxMed1);
		   comprimento.add(medParaTextField);
		   comprimento.add(converterMed);
		   comprimento.add(labelMed);
		   comprimento.add(labelMed1);
		   
		   add(tab);
		   bar.add(menu1);
		   bar.add(menu2);
		   bar.add(menu3);
	   }
		
	

	public static void main(String[] args) {
		new ConversorUniversal();
	}

}
