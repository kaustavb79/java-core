import javax.swing.JFrame;
import javax.swing.JMenuBar;

class menu_bar_demo extends JFrame
{
	JMenuBar k;
	
	menu_bar_demo()
	{
		k=new JMenuBar();
		
		setJMenuBar(k);
		setTitle("Menu bar");
		setVisible(true);
		setSize(400,300);
	}
	
	public static void main(String a[])
	{
		menu_bar_demo t=new menu_bar_demo();
	}
}
    
