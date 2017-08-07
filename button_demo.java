import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

//use to select one option
class button_demo extends JFrame
{
	JPanel l;
	JRadioButton f1,f2,f3;
	ButtonGroup b;
	
	button_demo()
	{
		l=new JPanel();
		
		f1=new JRadioButton();
		f1.setText("music");
		
		f2=new JRadioButton();
		f2.setText("sports");
		
		f3=new JRadioButton();
		f3.setText("dance");
		
		b=new ButtonGroup();
		
		b.add(f1);
		b.add(f2);
		b.add(f3);
		
		
		l.add(f1);
		l.add(f2);
		l.add(f3);
		
		setTitle(" Radio button demo");
		setSize(500,500);
		setVisible(true);
		add(l);
	}
	
	public static void main(String[] a)
	{
		button_demo j=new button_demo();
	}
}