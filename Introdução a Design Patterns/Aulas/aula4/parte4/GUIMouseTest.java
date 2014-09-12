package aula4.parte4;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

public class GUIMouseTest {
	private JFrame janela;
	
public GUIMouseTest(){
	janela = new JFrame();
	janela.setSize(500, 400);
	janela.setVisible(true);
	janela.addMouseListener( new MyMouseListener());

}
	
	
	public static void main(String[] args) {
			GUIMouseTest mouseTest = new GUIMouseTest();
	}
	
}

class MyMouseListener extends MouseAdapter{

	@Override
	public void mouseEntered(MouseEvent arg0) {
		System.out.println("Mouse Entrou na Janela !!!");
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		System.out.println("Mouse saiu da janela!!!");
		
	}
	
}


