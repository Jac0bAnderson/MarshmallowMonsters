package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{

	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster information: "+ info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is " + info);
	}
	
	public void displayMonsterCool(int eyes)
	{
		JOptionPane.showMessageDialog(null,"Ur monster hasss " +eyes+ " eyes");
	}
	
	
}
