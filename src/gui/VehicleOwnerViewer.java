package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import sangha.VehicleOwnerManager;
import vehicleowner.VehicleOwnerInput;

public class VehicleOwnerViewer extends JPanel {
	
WindowFrame frame;
	
	VehicleOwnerManager vehicleownerManager;
	
	public VehicleOwnerManager getVehicleownerManager() {
		return vehicleownerManager;
	}

	public void setVehicleownerManager(VehicleOwnerManager vehicleownerManager) {
		this.vehicleownerManager = vehicleownerManager;
		this.removeAll();
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Department");
		
		for(int i=0; i<vehicleownerManager.size(); i++) {
			Vector row = new Vector();
			VehicleOwnerInput vi = vehicleownerManager.get(i);
			row.add(vi.getNumber());
			row.add(vi.getName());
			row.add(vi.getType());
			row.add(vi.getDepartment());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

	public VehicleOwnerViewer(WindowFrame frame,VehicleOwnerManager vehicleownerManager) {
		this.frame = frame;
		this.vehicleownerManager = vehicleownerManager;
		
		System.out.println("***"+vehicleownerManager.size()+"***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Number");
		model.addColumn("Name");
		model.addColumn("Type");
		model.addColumn("Department");
		
		for(int i=0; i<vehicleownerManager.size(); i++) {
			Vector row = new Vector();
			VehicleOwnerInput vi = vehicleownerManager.get(i);
			row.add(vi.getNumber());
			row.add(vi.getName());
			row.add(vi.getType());
			row.add(vi.getDepartment());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}
