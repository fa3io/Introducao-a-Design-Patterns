package aula4.parte8;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class CDScreem {

	private  JFrame screem;
	private JTable table;
	private JScrollPane scrollPane;
	private JLabel screemTitle;
	private CDAdpter cdAdpter;

	
	
	
	public CDScreem() {
		screem = new JFrame("Coleção de CDs");
		screem.setSize(400, 300);
		screem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		screemTitle = new JLabel("            >>>>> Meus CDs favoritos de todos os tempos <<<<<");
		
		// Configurando Adaptador
		CD jEm = new CD("Jorge & Matheus", "Chove Chuva", "Sony", 2014);
		CD luan = new CD("Luan Santana", "Ao vivo em SP", "Sony", 2012);
		CD Ivete = new CD("Ivete Sangalo", "Poeira", "Sony", 2014);
		
		cdAdpter = new CDAdpter();
		
		cdAdpter.add(jEm);
		cdAdpter.add(luan);
		cdAdpter.add(Ivete);

		
		table = new JTable(cdAdpter);
		scrollPane = new JScrollPane(table);
	
	}
	
	public void configureScreem(){
		Container container = screem.getContentPane();
		container.add(screemTitle, BorderLayout.NORTH);
		container.add(scrollPane, BorderLayout.CENTER);
	}
	
	public void render(){
		screem.setVisible(true);
	}
	
	public static void main(String[] args) {
		CDScreem  cdScreem = new CDScreem();
		cdScreem.configureScreem();
		cdScreem.render();
		
		
	}
	
}
