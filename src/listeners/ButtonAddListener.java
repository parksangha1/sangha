package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.VehicleOwnerAdder;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {
	
	WindowFrame frame;

	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getVehicleowneradder());
		frame.revalidate();
		frame.repaint();
		
		//JButton b = (JButton) e.getSource();
		//VehicleOwnerAdder adder =frame.getVehicleowneradder();
		//frame.setupPanel(adder);
	}

}
