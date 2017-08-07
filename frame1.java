import javax.swing.JFrame;

class FDemo
{
	JFrame obj;
	
	public FDemo()
	{
		obj=new JFrame();
		obj.setTitle("Demo");
		obj.setVisible(true);
		obj.setSize(400,400);
	}
	
	public static void main(String arg[])
	{
		FDemo fo=new FDemo();
	}
	
}