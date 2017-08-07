import javax.swing.JDialog;

class FDia_Demo
{
	JDialog obj;
	
	public FDia_Demo()
	{
		obj=new JDialog();
		obj.setTitle("Dia Demo");
		obj.setVisible(true);
		obj.setSize(400,100);
	}
	
	public static void main(String arg[])
	{
		FDia_Demo fo=new FDia_Demo();
	}
	
}