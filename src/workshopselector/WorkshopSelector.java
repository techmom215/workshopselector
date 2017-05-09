/*
 * Angela Andrews
 * 4/24/17
 * CSCI 111
 * extra credit - Workshop Selector
 */
package workshopselector;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WorkshopSelector implements ActionListener {

    private JList listWorkshops;
    private JList listLocation;
    private JLabel totalCostLabel;
    private int[] allLocationFees;
    private int[] allWorkshopFees;
    private int[] allWorkshopDurations;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new WorkshopSelector().build();
    } //end main()

    private void build() {
        //Setup costs/durations
        allWorkshopFees = new int[]{800,1500, 1300};
        allWorkshopDurations = new int[]{2, 3, 5};
        allLocationFees = new int[]{225, 175, 300};

        //create the frame and the layout
        JFrame myJFrame = new JFrame();
        FlowLayout myLayout = new FlowLayout();
        myLayout.setHgap(10);
        myLayout.setVgap(20);

        //add the layout to the frame
        myJFrame.setLayout(myLayout);

        //create components
        JLabel wksLabel = new JLabel("Select a workshop");
        String[] workshops = new String[]{"Time Management", "Supervision Skills", "Negotiation"};
        listWorkshops = new JList(workshops);
        listWorkshops.setFixedCellHeight(20);
        listWorkshops.setFixedCellWidth(130);

        JLabel locLabel = new JLabel("Select a location");
        String[] locations = new String[]{"Chicago, IL", "Dallas, TX", "Orlando, FL"};
        listLocation = new JList(locations);
        listLocation.setFixedCellHeight(20);
        listLocation.setFixedCellWidth(130);


        //JLabel calcLabel = new JLabel();
        JButton  calcButton = new JButton("Calculate");
        calcButton.setForeground(Color.DARK_GRAY);
        calcButton.addActionListener(this);

        totalCostLabel = new JLabel("Total Cost");

        //add the components to the layout
        myJFrame.add(wksLabel);
        myJFrame.add(listWorkshops);

        myJFrame.add(locLabel);
        myJFrame.add(listLocation);

        myJFrame.add(calcButton);
        myJFrame.add(new JLabel(""));
        myJFrame.add(totalCostLabel);

        //add(new JScrollPane(listLocation));
        listLocation.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        // add(new JScrollPane(listWorkshops));
        listWorkshops.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        // set the title, size, location and exit behavior for the frame
        myJFrame.setTitle("Management Training");
        myJFrame.setSize(300, 300);
        myJFrame.setLocation(200, 100);
        myJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // make the frame visible (activate the frame)
        myJFrame.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Find the workshop fee
        int selectedWorkShop = listWorkshops.getSelectedIndex();
        int workshopFee = allWorkshopFees[selectedWorkShop];

        //Find the total duration of the selected workshop
        int totalWorkshopDays = allWorkshopDurations[selectedWorkShop];

        //Find the location fee
        int selectedLocation = listLocation.getSelectedIndex();
        int registrationFee = allLocationFees[selectedLocation];

        int totalCost = (workshopFee*totalWorkshopDays) + registrationFee;
        totalCostLabel.setText("Total cost $" + totalCost);

    }
} // end workshopSelector Class


