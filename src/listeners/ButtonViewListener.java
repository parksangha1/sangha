package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.swing.JButton;

import gui.VehicleOwnerViewer;
import gui.WindowFrame;
import sangha.VehicleOwnerManager;

public class ButtonViewListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonViewListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		VehicleOwnerViewer vehicleOwnerViewer = frame.getVehicleownerviewer();
		VehicleOwnerManager vehicleOwnerManager = getObject("vehicleownermanager.ser");
		vehicleOwnerViewer.setVehicleownerManager(vehicleOwnerManager);
		
		frame.getContentPane().removeAll();
		frame.getContentPane().add(vehicleOwnerViewer);
		frame.revalidate();
		frame.repaint();
		
		//JButton b = (JButton) e.getSource();
		//VehicleOwnerViewer viewer = frame.getVehicleownerviewer();
		//frame.setupPanel(viewer);

	}
	public static VehicleOwnerManager getObject(String filename) {
		VehicleOwnerManager vehicleOwnerManager = null;
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			vehicleOwnerManager = (VehicleOwnerManager)in.readObject();
			
			in.close();
			file.close();
			
		} catch(FileNotFoundException e) {
			return vehicleOwnerManager;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return vehicleOwnerManager;
	}

}
