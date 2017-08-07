import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

class textF_demo extends JFrame
{
	JPanel l;
	JTextField fn,sn;
	
	textF_demo()
	{
		l=new JPanel();
		
		fn=new JTextField();
		fn.setText("Kaustav");
		
		sn=new JTextField();
		sn.setText("Bhattacharya");
		
		l.add(fn);
		l.add(sn);
		
		setTitle("Text field demo");
		setSize(500,500);
		setVisible(true);
		add(l);
	}
	
	public static void main(String[] a)
	{
		textF_demo j=new textF_demo();
	}
}