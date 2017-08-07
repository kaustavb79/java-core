import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

class menu_item_demo extends JFrame
{
	JMenu fm,edm,exm;
	JMenuItem o,n,c,p,cu;
	JMenuBar p1;
	
	menu_item_demo()
	{
		p1=new JMenuBar();
		
		//decleration of JMenu package
		
		fm=new JMenu("FILE");											
		edm=new JMenu("EDIT");
		exm=new JMenu("EXIT");															
		
		
		p1.add(fm);											// object1.add(object);  :- it adds the respective component(i.e. object) in object1 
		p1.add(edm);
		p1.add(exm);
		
		
		n=new JMenuItem("New");
		o=new JMenuItem("Open");
		c=new JMenuItem("Copy");
		p=new JMenuItem("Paste");
		cu=new JMenuItem("Cut");
		
		fm.add(n);
		fm.add(o);
		
		edm.add(cu);
		edm.add(c);
		edm.add(p);
		
		setJMenuBar(p1);
		setTitle("Menu bar");
		setVisible(true);
		setSize(400,300);
	}
	
	public static void main(String a[])
	{
		menu_item_demo t=new menu_item_demo();
	}
}
    
