import javax.swing.JPanel;
import javax.swing.JFrame;

class Panel_Demo extends JFrame
{
	JPanel op;
	
	public Panel_Demo()
	{
		op=new JPanel();
		setTitle("panel");
		setVisible(true);
		setSize(300,100);
		add(op);
	}
	
	public static void main(String args[])
	{
		Panel_Demo pb=new Panel_Demo();
	}
}