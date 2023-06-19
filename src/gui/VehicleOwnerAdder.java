package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listeners.VehicleOwnerAdderCancelListener;
import listeners.VehicleOwnerAdderListener;
import sangha.VehicleOwnerManager;

public class VehicleOwnerAdder extends JPanel {
	
WindowFrame frame;
	
	VehicleOwnerManager vehicleownerManager;

	public VehicleOwnerAdder(WindowFrame frame,	VehicleOwnerManager vehicleownerManager) {
		this.frame = frame;
		this.vehicleownerManager = vehicleownerManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelNumber = new JLabel("Vehicle's Number: ", JLabel.TRAILING);
		JTextField fieldNumber = new JTextField(10);
		labelNumber.setLabelFor(fieldNumber);
		panel.add(labelNumber);
		panel.add(fieldNumber);
		
		JLabel labelName = new JLabel("Owner's Name: ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);
		
		JLabel labelType = new JLabel("Vehicle's Type: ", JLabel.TRAILING);
		JTextField fieldType = new JTextField(10);
		labelType.setLabelFor(fieldType);
		panel.add(labelType);
		panel.add(fieldType);
		
		JLabel labelDepartment = new JLabel("Owner's Department: ", JLabel.TRAILING);
		JTextField fieldDepartment = new JTextField(10);
		labelDepartment.setLabelFor(fieldDepartment);
		
		
		JButton saveButton = new JButton("save");
		saveButton.addActionListener(new VehicleOwnerAdderListener(fieldNumber,fieldName,fieldType,fieldDepartment,vehicleownerManager));
		
		JButton cancelButton = new JButton("cancel");
		cancelButton.addActionListener(new VehicleOwnerAdderCancelListener(frame));
		
		panel.add(labelDepartment);
		panel.add(fieldDepartment);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		
		
		this.add(panel);
		this.setVisible(true);
		
		
	}
}
