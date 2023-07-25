/**
	A public event listener class.
	This is in bad programming style.
	Use private inner class instead unless you have special needs.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ExternalButtonClickListener implements MouseListener {
	public void mouseClicked(MouseEvent e) {
		System.out.println(((JButton) e.getSource()).getText() + " clicked (external)");
	}
	
	public void mouseEntered(MouseEvent e) {
	}

	public void mouseExited(MouseEvent e) {
	}

	public void mousePressed(MouseEvent e) {
	}

	public void mouseReleased(MouseEvent e) {
	}
}