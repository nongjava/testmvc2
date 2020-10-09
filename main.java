

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      view theView = new view();
        
    	model theModel = new model();
        
       controller theController = new controller(theView,theModel);
        
        theView.setVisible(true);
	}

}
