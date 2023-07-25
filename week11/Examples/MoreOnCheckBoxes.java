/**
	An example of using JCheckBox with 
	more complicated event listener and uses
	isSelected and doClick methods
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class MoreOnCheckBoxes extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 350;	// Window width
	private final int WINDOW_HEIGHT = 170;	// Window height

	private JCheckBox javaBox;				// To reference a checkbox
	private JCheckBox pythonBox;			// To reference a checkbox
	private JCheckBox cppBox;				// To reference a checkbox
	private JCheckBox swiftBox;				// To reference a checkbox
	private JCheckBox noneBox;				// To reference a checkbox
	
	/**
		Constructor
	*/
	public MoreOnCheckBoxes() {
		// Set the window title.
		setTitle("Checkbox event Example");

		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel.
		buildPanel();

		// Set the layout to FlowLayout
		setLayout(new FlowLayout());

		// Add the panel to the frame's content pane.
		add(panel);

		// Display the window.
		setVisible(true);
	}
	
	/**
		The buildPanel method adds a label, a text field,
		and a button to a panel.
	*/
	private void buildPanel() {
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// Set the layout to GridLayout with 5 rows and 1 column
		panel.setLayout(new GridLayout(5,1));
		
		// Create the five checkboxes
		javaBox = new JCheckBox("Java");
		pythonBox = new JCheckBox("Python");
		cppBox = new JCheckBox("C++", true);
		swiftBox = new JCheckBox("Swift");
		noneBox = new JCheckBox("None of the above");
		
		// Create an item listener and add it to the five checkboxes
		MyItemListener myItemListener = new MyItemListener();
		javaBox.addItemListener(myItemListener);
		pythonBox.addItemListener(myItemListener);
		cppBox.addItemListener(myItemListener);
		swiftBox.addItemListener(myItemListener);
		noneBox.addItemListener(myItemListener);

		// Add the five checkboxes into panel
		panel.add(javaBox);
		panel.add(pythonBox);
		panel.add(cppBox);
		panel.add(swiftBox);
		panel.add(noneBox);
	}
	
	private class MyItemListener implements ItemListener {
		public void itemStateChanged(ItemEvent e) {
			int state = e.getStateChange();
			JCheckBox source = (JCheckBox) e.getSource();
			
			if (source == noneBox) { // Comparing the "reference address"
			
				// if noneBox is checked, clear all other checkboxes
				if (state == ItemEvent.SELECTED) {
					System.out.println("None of the above checkbox is selected. Clearing all other checkbox.");
					if (javaBox.isSelected())
						javaBox.doClick();
					if (pythonBox.isSelected())
						pythonBox.doClick();
					if (cppBox.isSelected())
						cppBox.doClick();
					if (swiftBox.isSelected())
						swiftBox.doClick();
				} else if (state == ItemEvent.DESELECTED) {
					System.out.println("None of the above checkbox is deselected.");
				}
			} else {
				
				// if other checkboxes is checked, clear the noneBox
				if (state == ItemEvent.SELECTED) {
					System.out.println( ((JCheckBox) e.getSource()).getText() + " is selected");
					if (noneBox.isSelected()) {
						noneBox.doClick();
					}
				} else if (state == ItemEvent.DESELECTED) {
					System.out.println( ((JCheckBox) e.getSource()).getText() + " is deselected");
				}
			}
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new MoreOnCheckBoxes();
	}
}
