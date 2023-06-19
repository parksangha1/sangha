package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import gui.WindowFrame;

public class VehicleOwnerAdderCancelListener implements ActionListener{
	
	WindowFrame frame;

	public VehicleOwnerAdderCancelListener(WindowFrame frame) {
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection());
		frame.revalidate();
		frame.repaint();
		
		//JButton b = (JButton) e.getSource();
		//VehicleOwnerAdder adder =frame.getVehicleowneradder();
		//frame.setupPanel(adder);
	}

}
