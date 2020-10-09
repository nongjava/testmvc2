
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controller {
 
	private view theView;
	private model theModel;
	
	public controller(view theView, model theModel) {
		this.theView = theView;
		this.theModel = theModel;
		this.theView.addCalculateListener(new CalculateListener());
		
}
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			int studentid, password;
			studentid = theView.getstudentID();
	
			theModel.check(studentid);
			theView.setCalcSolution(theModel.getanswer1(),theModel.getanswer2(),theModel.getanswer3(),theModel.getanswer4());
			
    }
  }
	
	
}