import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

class menu_demo extends JFrame
{
	JMenu fm,edm,exm;
	JMenuBar p;
	
	menu_demo()
	{
		p=new JMenuBar();
		
		fm=new JMenu("FILE");
		edm=new JMenu("EDIT");
		exm=new JMenu("EXIT");
		
		p.add(fm);
		p.add(edm);
		p.add(exm);
		
		setJMenuBar(p);
		setTitle("Menu bar");
		setVisible(true);
		setSize(400,300);
	}
	
	public static void main(String a[])
	{
		menu_demo t=new menu_demo();
	}
}
    
