package biodata;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;



public class MyTableModel extends AbstractTableModel{
	private String[] columnNames = {" Nama ", " Jenis Kelamin ", " Nomor Hp ", " Alamat "};
	private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
	
	public int getColumnCount() {
		return columnNames.length;
	}
	
	public int getRowCount() {
		return data.size();
	}
	
	public String getColumnName(int col) {
		return columnNames[col];
	}
	
	public Object getValueAt(int row, int col) {
		List<String> rowItem = data.get(row);
		return rowItem.get(col);
	}
	
	public boolean isCellEditable(int row, int col) {
		return false;
	}
	
	public void add(ArrayList<String> value) {
		data.add(value);
		fireTableRowsInserted(data.size()-1, data.size()-1);
	}

	public void setValueAt(String value, int row, int col) {
		List<String> rowItem = data.get(row);
		rowItem.set(col, value);
		fireTableRowsInserted(data.size()-1, data.size()-1);
	}

	public void removeRow(int row) {
		List<String> rowItem = data.get(row);
		fireTableRowsInserted(data.size()-1, data.size()-1);
		
	}

	
}
