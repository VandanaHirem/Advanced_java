package JavaProgram5c;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;

	

	public class CountryCapitalList extends JFrame {

	    private JList<String> countryList;
	    private Map<String, String> countryCapitalMap;

	    public CountryCapitalList() {
	        // Set window title and size
	        super("Country Capital Viewer");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null); // Center the window

	        // Create the map of countries and capitals
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "No single capital (Africa is a continent)");
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // Create the JList from the map keys
	        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Scroll pane for the list
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add ListSelectionListener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    String selectedCountry = countryList.getSelectedValue();
	                    if (selectedCountry != null) {
	                        String capital = countryCapitalMap.get(selectedCountry);
	                        System.out.println("Selected Country: " + selectedCountry);
	                        System.out.println("Capital: " + capital);
	                    }
	                }
	            }
	        });

	        // Use BorderLayout and add scrollPane to center
	        setLayout(new BorderLayout());
	        add(scrollPane, BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new CountryCapitalList().setVisible(true);
	        });
	    }
	}


