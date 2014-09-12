package aula4.parte8;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CDAdpter extends AbstractTableModel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5921927309542934999L;
	private List<CD> Cds;
	private String[] columns = { "Artista", "Album", "Titulo", "Ano" };

	public CDAdpter() {
		Cds = new ArrayList<CD>();
	}

	public void add(CD cd) {
		Cds.add(cd);
	}

	public void remove(CD cd) {
		Cds.remove(cd);
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}

	@Override
	public int getRowCount() {

		return Cds.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int colunmIndex) {
		CD cd = Cds.get(rowIndex);
		Object value = null;

		switch (colunmIndex) {
		case 0:
			value = cd.getNome();
			break;
		case 1:
			value = cd.getAlbum();
			break;
		case 2:
			value = cd.getGravadora();
			break;

		case 3:
			value = cd.getAno();
			break;
		}
		return value;

	}

}
