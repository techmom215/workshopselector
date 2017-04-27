/*
 * Angela Andrews
 * 4/24/17
 * CSCI 111
 * extra credit - Workshop Selector
 */
package workshopselector;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;


 
public class WorkshopSelector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create the frame and the layout
        JFrame myJFrame = new JFrame();
        FlowLayout myLayout = new FlowLayout();
        myLayout.setHgap(10);    
        myLayout.setVgap(20);

        //add the layout to the frame
        myJFrame.setLayout(myLayout);

        //create components
        JLabel wksLabel = new JLabel("Select a workshop");
        String[] workshops = new String[]{"Time Management", "Supervision Skills",
            "Negotiation"};
        JList listWorkshops = new JList(workshops);
        listWorkshops.setFixedCellHeight(20);
    listWorkshops.setFixedCellWidth(130);
        
        JLabel locLabel = new JLabel("Select a location");
        String[] locations = new String[]{"Chicago, IL", "Dallas, TX", "Orlando, FL"};
        JList listLocation = new JList(locations);
        listLocation.setFixedCellHeight(20);
        listLocation.setFixedCellWidth(130);
        
        
        //JLabel calcLabel = new JLabel();
        JButton  calcButton = new JButton("Calculate");
        calcButton.setForeground(Color.DARK_GRAY);
        
        //add the components to the layout 
        myJFrame.add(wksLabel);
        myJFrame.add(listWorkshops);
       
        myJFrame.add(locLabel);
        myJFrame.add(listLocation);
        
        myJFrame.add(calcButton);
        
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

    } //end main()

 

} // end workshopSelector Class


