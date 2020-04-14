package segment;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;

import javax.swing.JPanel;


public class Segment extends JPanel {

    private Segment[] segment = new Segment[8];
	/**
	 * 
	 */
	private static final long serialVersionUID = -4980210296562972446L;
	
	private Rectangle[] rect = {
			new Rectangle(10,10,105,10),
			new Rectangle(115,20,10,115),
			new Rectangle(115,145,10,115),
			new Rectangle(10,260,105,10),
			new Rectangle(00,145,10,115),
			new Rectangle(00,20,10,115),
			new Rectangle(10,135,105,10),
                        new Rectangle(130,260,13,13)
		};
	
	private JPanel[] pnlSeg;
	
	public JPanel getPanelSeg(int index)
	{
		return this.pnlSeg[index];
	}
	
	public Segment() {
		super();
		initSegment(new Dimension(90,90));
		
	}

	public Segment(Dimension dim) {
		super();
		initSegment(dim);
	}

	private void initSegment(Dimension dim)
	{
		this.setSize(dim);
		this.pnlSeg = new JPanel[8];
                this.setOpaque(false);
		
		for (int j = 0; j < 8; j++)
		{
			this.pnlSeg[j] = new JPanel();
			this.pnlSeg[j].setBounds(rect[j]);
			this.pnlSeg[j].setLayout(null);
		}
                
		
	}

	public Rectangle getRect(int index)
	{
		return rect[index];
	}
}
