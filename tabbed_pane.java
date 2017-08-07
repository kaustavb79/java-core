import javax.swing.JFrame;
import javax.swing.JTabbedPane;

class tabbed_pane extends JFrame
{
	JTabbedPane t;
	
	public tabbed_pane()
	{
		t=new JTabbedPane();
		t.addTab("Tab 1",null);
		t.addTab("Tab 2",null);
		t.setSize(200,200);
		
		this.setTitle("tabbed");
		this.setVisible(true);
		this.add(t);
	}
	
	public static void main(String args[])
	{
		tabbed_pane k=new tabbed_pane();
	}
	
}