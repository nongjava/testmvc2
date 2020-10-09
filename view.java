

import java.awt.event.ActionListener;
import javax.swing.*;

public class view extends JFrame{
	    private JLabel word1 = new JLabel("StudentID");
		private JTextField StudentID  = new JTextField(10);
		private JButton Search = new JButton("Show");
		
		JTextField ThaiFname = new JTextField();
		JTextField EngFname = new JTextField();
		JTextField ThaiLname = new JTextField();
		JTextField EngLname = new JTextField();
		
		final JComponent[] inputs = new JComponent[] {
				new JLabel("ThaiFirstName"),
				ThaiFname,
				new JLabel("EngFirstName"),
				EngFname,
				new JLabel("ThaiLastName"),
				ThaiLname,
				new JLabel("EngLastName"),
				EngLname
		};
	
		view(){
			
			// Sets up the view and adds the components
			
			JPanel Panel = new JPanel();
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setSize(350, 200);
			Panel.add(word1);
			Panel.add(StudentID);
			
			Panel.add(Search);
			
			
			this.add(Panel);
			
			// End of setting up the components --------
			
		}
		public int getstudentID(){
			return Integer.parseInt(StudentID.getText());
		}
	
		public void setCalcSolution(String TFname,String EFname,String TLname, String ELname){
			ThaiFname.setText(TFname);
			EngFname.setText(EFname);
			ThaiLname.setText(TLname);
			EngLname.setText(ELname);
			
			JOptionPane.showMessageDialog(null, inputs, "Example Studentcard", JOptionPane.PLAIN_MESSAGE);
		}
		void addCalculateListener(ActionListener listenForCalcButton){
			
			
			
	
			Search.addActionListener(listenForCalcButton);
			
	    }
       
       
			

   
  
}
