
/**
 * Aaron Ortiz
 * Assignment #3
 * 03/28/2015
 * CSC 200
 */



import javax.swing.JOptionPane;



public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				
				String username = "aaron" , password = "ortiz", a , b;
				
				for (int j = 0; j < 3; j++) {
					a = JOptionPane.showInputDialog("Please enter your username ");
					if (username.equalsIgnoreCase(a))
					{
						do {b = JOptionPane.showInputDialog("Please enter your password ");
						if (password.equalsIgnoreCase(b)) {
			JOptionPane.showMessageDialog(null, "Correct Username and Password!!!!");
			String [] choices = {"Administrator", "Student", "Staff"};
				
				boolean notCorrect = false;
				do
				{
				 String input = (String) JOptionPane.showInputDialog(null, "Choose account " 
						 + "type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
				 System.out.println(input);
				
				switch (input){
		        case ("Administrator") :
		        JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file. ");
		        
		        break;
				case ("Student") :
			        JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file. ");
		        
		        break;
		        case ("Staff") :
		        JOptionPane.showMessageDialog(null, "Welcome Staff! You can update, read, add, delete file. ");
	                notCorrect = true;
			        break;}
				
				} while (!notCorrect);
				return;
				
						}
						else {j++;}
					} while (j<3);
					JOptionPane.showMessageDialog(null,  "Contact an Administrator.");
					
				}
				else
					JOptionPane.showMessageDialog(null, "Username Invalid");
	}
	JOptionPane.showMessageDialog(null, "Contact Administrator ");
	}
}
	
				
			
