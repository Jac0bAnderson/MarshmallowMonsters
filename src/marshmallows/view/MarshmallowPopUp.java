package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowPopUp
{

	public void showResponse(String monsterPopUp)
	{
		JOptionPane.showMessageDialog(null, monsterPopUp);
	}
	
	
	public String grabAnswer(String stuff)
	{
		String answer = "";
		
	answer =	JOptionPane.showInputDialog(null, stuff);
		
		return answer;
	}
	
	
	
	
	
	
}
