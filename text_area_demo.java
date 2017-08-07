import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class text_area_demo extends JFrame
{
	JPanel l;
	JTextArea fn,sn;
	
	text_area_demo()
	{
		l=new JPanel();
		
		fn=new JTextArea(100,100);
			
		l.add(fn);
		fn.getText();
		
		setTitle("Text area demo");
		setSize(500,500);
		setVisible(true);
		add(l);
	}
	
	public static void main(String[] a)
	{
		text_area_demo j=new text_area_demo();
	}
}