import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JCheckBox;

//use to select multiple options

class check_box_demo extends JFrame
{
	JPanel l;
	JCheckBox f1,f2,f3;
	
	check_box_demo()
	{
		l=new JPanel();
		
		f1=new JCheckBox();
		f1.setText("music");
		
		f2=new JCheckBox();
		f2.setText("sports");
		
		f3=new JCheckBox();
		f3.setText("dance");
			
		l.add(f1);
		l.add(f2);
		l.add(f3);
		
		setTitle("Check box demo");
		setSize(500,500);
		setVisible(true);
		add(l);
	}
	
	public static void main(String[] a)
	{
		check_box_demo j=new check_box_demo();
	}
}