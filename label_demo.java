import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;

class label_demo extends JFrame
{
	JPanel m;
	JLabel p,q;
	
	label_demo()
	{
		m=new JPanel();
		
		p=new JLabel("First Name ");		//this text will be shown by default
		q=new JLabel("Last Name ");
		
		m.add(p);
		m.add(q);
		
		//p.setText("hi");
		setTitle(" Label demo ");
		setVisible(true);
		setSize(400,300);
		add(m);
	}
	
	public static void main(String a[])
	{
		label_demo t=new label_demo();
	}
	
	
}
    
