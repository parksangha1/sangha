package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import sangha.VehicleOwnerManager;

public class WindowFrame extends JFrame {
	
	VehicleOwnerManager vehicleownerManager;
	
	MenuSelection menuSelection;
	VehicleOwnerAdder vehicleowneradder;
	VehicleOwnerViewer vehicleownerviewer;
	
	public WindowFrame(VehicleOwnerManager vehicleownerManager) {
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.vehicleownerManager = vehicleownerManager;
		menuSelection = new MenuSelection(this);
		vehicleowneradder = new VehicleOwnerAdder(this);
		vehicleownerviewer = new VehicleOwnerViewer(this,this.vehicleownerManager);
		
		
		this.add(menuSelection);
		
		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public VehicleOwnerAdder getVehicleowneradder() {
		return vehicleowneradder;
	}

	public void setVehicleowneradder(VehicleOwnerAdder vehicleowneradder) {
		this.vehicleowneradder = vehicleowneradder;
	}

	public VehicleOwnerViewer getVehicleownerviewer() {
		return vehicleownerviewer;
	}

	public void setVehicleownerviewer(VehicleOwnerViewer vehicleownerviewer) {
		this.vehicleownerviewer = vehicleownerviewer;
	}

}
