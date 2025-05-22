package JavaProgram5D;
import javax.swing.*;
import java.awt.*;



	public class ColorTabbedPane extends JFrame {

	    public ColorTabbedPane() {
	        setTitle("Color Tabbed Pane");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the window

	        // Create TabbedPane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create colored panels
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);
	        tabbedPane.addTab("Cyan", cyanPanel);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);
	        tabbedPane.addTab("Magenta", magentaPanel);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbedPane to frame
	        add(tabbedPane);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new ColorTabbedPane().setVisible(true);
	        });
	    }
	}


