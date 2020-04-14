/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segment;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class UI extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4621924450652779205L;
	private Segment[] segment = new Segment[8];
	private  int value;
	public UI()
	{
		setSize(880, 300);
		FlowLayout layout = new FlowLayout();
		layout.setHgap(8);
		layout.setVgap(0);
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout);
		Dimension dim = new Dimension();
		
		for (int i = 0; i < 3; i++)
		{
			dim.setSize(getSize().width/6, 300);
			segment[i] = new Segment(dim);
			segment[i].setName("Segment #"+i);
			segment[i].setPreferredSize(dim);
			segment[i].setLayout(null);
			
			for (int j = 0; j < 8; j++)
			{
				segment[i].getPanelSeg(j).setBackground((i < 1) ? Color.RED : (i < 2) ? Color.RED : (i < 3) ? Color.RED : Color.WHITE);
				segment[i].getPanelSeg(j).setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
				segment[i].add(segment[i].getPanelSeg(j));
			}
			add(segment[i]);
		}
                
	}
        
        
        public void setValue (int value){
            try{
                
                if (value >= 0 && value < 1000)
            {
                for (int i = 0; i < 8; i++){
                segment[0].getPanelSeg(i).setVisible((Binary.CLOCKBIN[Binary.getNthDigit(value, 10, 3)][i] == true) ? true : false);
                segment[1].getPanelSeg(i).setVisible((Binary.CLOCKBIN[Binary.getNthDigit(value, 10, 2)][i] == true) ? true : false);
                segment[2].getPanelSeg(i).setVisible((Binary.CLOCKBIN[Binary.getNthDigit(value, 10, 1)][i] == true) ? true : false);
            }}
            else if( value < 0 && value >= -99){
                for (int i = 0; i < 8; i++){
                segment[0].getPanelSeg(i).setVisible((Binary.LETTERBIN[Binary.getMDigit()][i] == true) ? true : false);
                int val = value > 0 ? value : -value;
                segment[1].getPanelSeg(i).setVisible((Binary.CLOCKBIN[Binary.getNthDigit(val, 10, 2)][i] == true) ? true : false);
                segment[2].getPanelSeg(i).setVisible((Binary.CLOCKBIN[Binary.getNthDigit(val, 10, 1)][i] == true) ? true : false);
            }}
            else {
                setError();
            }
            
            }
            catch(NumberFormatException e)
            {
                System.out.println("error");
                
            } 
        }
        
        public void setError()
        {
            for (int i = 0; i < 8; i++){
                segment[0].getPanelSeg(i).setVisible((Binary.LETTERBIN[Binary.getEDigit()][i] == true) ? true : false);
                segment[1].getPanelSeg(i).setVisible((Binary.LETTERBIN[Binary.getRDigit()][i] == true) ? true : false);
                segment[2].getPanelSeg(i).setVisible((Binary.LETTERBIN[Binary.getRDigit()][i] == true) ? true : false);
                }
        }
        public int getValue()
        {
            
            
            
            return value;
        }
         
}