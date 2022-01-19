
import java.awt.Rectangle;
import static javax.swing.JOptionPane.showMessageDialog;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;

public class ClickEvent extends MouseAdapter {	
	//Top 3
	Rectangle rect1= new Rectangle(550,300,100,100);
	Rectangle rect2= new Rectangle(650,300,100,100); 
	Rectangle rect3= new Rectangle(750,300,100,100);
	

	//Middle 3
	Rectangle rect4= new Rectangle(550,400,100,100);
	Rectangle rect5= new Rectangle(650,400,100,100);  //Rectangles for reference
	Rectangle rect6= new Rectangle(750,400,100,100);
	
	
	//Bottom 3
	Rectangle rect7= new Rectangle(550,500,100,100);
	Rectangle rect8= new Rectangle(650,500,100,100);
	Rectangle rect9= new Rectangle(750,500,100,100);
	 
	 int rect1Square=0;		int rect1Diamond=0;
	 int rect2Square=0;		int rect2Diamond=0;
	 int rect3Square=0;		int rect3Diamond=0;
	 int rect4Square=0;		int rect4Diamond=0;
	 int rect5Square=0;		int rect5Diamond=0;  // variables to check if there is a square or diamond and to check if won
	 int rect6Square=0;		int rect6Diamond=0;
	 int rect7Square=0;		int rect7Diamond=0;
	 int rect8Square=0;		int rect8Diamond=0;
	 int rect9Square=0;		int rect9Diamond=0;
	 
	 int clickCount = 0; 
	 
	private DrawPanel panel;

	public ClickEvent(DrawPanel panel) {
		this.panel = panel;
		}
    

	public void mouseClicked(MouseEvent e) { 
	  
	  if(
		// check if user clicked a rectangle and that the user is not clicking a already filled rectangle
	    // Also makes sure that the computer doesn't do anything when the user clicks a filled space
		 (rect1.contains(e.getX(),e.getY())&&rect1Square!=1&&rect1Diamond!=1||	
		 rect2.contains(e.getX(),e.getY())&&rect2Square!=1&&rect2Diamond!=1||
		 rect3.contains(e.getX(),e.getY())&&rect3Square!=1&&rect3Diamond!=1||
		 rect4.contains(e.getX(),e.getY())&&rect4Square!=1&&rect4Diamond!=1||
		 rect5.contains(e.getX(),e.getY())&&rect5Square!=1&&rect5Diamond!=1||
		 rect6.contains(e.getX(),e.getY())&&rect6Square!=1&&rect6Diamond!=1||
		 rect7.contains(e.getX(),e.getY())&&rect7Square!=1&&rect7Diamond!=1||
		 rect8.contains(e.getX(),e.getY())&&rect8Square!=1&&rect8Diamond!=1||
		 rect9.contains(e.getX(),e.getY())&&rect9Square!=1&&rect9Diamond!=1)
		  
		  &&
		  //Draw if the Computer Didn't Win
		  (rect1Diamond+rect2Diamond+rect3Diamond!=3)&&
		  (rect4Diamond+rect5Diamond+rect6Diamond!=3)&&
		  (rect7Diamond+rect8Diamond+rect9Diamond!=3)&&
		  (rect1Diamond+rect4Diamond+rect7Diamond!=3)&&
		  (rect2Diamond+rect5Diamond+rect8Diamond!=3)&& 
		  (rect3Diamond+rect6Diamond+rect9Diamond!=3)&&
		  (rect1Diamond+rect5Diamond+rect9Diamond!=3)&&
		  (rect3Diamond+rect5Diamond+rect7Diamond!=3)
		   
		   && 
		    // Draw if The User Didn't Win
		    (rect1Square+rect2Square+rect3Square!=3)&&
		    (rect4Square+rect5Square+rect6Square!=3)&&
			(rect7Square+rect8Square+rect9Square!=3)&&
			(rect1Square+rect4Square+rect7Square!=3)&&
			(rect2Square+rect5Square+rect8Square!=3)&& 
			(rect3Square+rect6Square+rect9Square!=3)&&
			(rect1Square+rect5Square+rect9Square!=3)&&
			(rect3Square+rect5Square+rect7Square!=3))
		
	  {
		 
	// Draws in Squares
	  if(rect1.contains(e.getX(),e.getY())&&rect1Square==0&&rect1Diamond==0) {
		  panel.addSquare(new DrawSquare(570,375));
		  rect1Square=1;
		  clickCount++;
	  }
	  
	  if(rect2.contains(e.getX(),e.getY())&&rect2Square==0&&rect2Diamond==0){
		  panel.addSquare(new DrawSquare(675,375));
		  rect2Square=1;
		  clickCount++;
	  }
	  
	  if(rect3.contains(e.getX(),e.getY())&&rect3Square==0&&rect3Diamond==0){
		  panel.addSquare(new DrawSquare(775,375));
		  rect3Square=1;
		  clickCount++;
	  }
	  if(rect4.contains(e.getX(),e.getY())&&rect4Square==0&&rect4Diamond==0){
		  panel.addSquare(new DrawSquare(575,475));
		  rect4Square=1;
		  clickCount++;
		 
	  }
	  if(rect5.contains(e.getX(),e.getY())&&rect5Square==0&&rect5Diamond==0){
		  panel.addSquare(new DrawSquare(675,475));
		  rect5Square=1;
		  clickCount++;
		 
	  }
	  if(rect6.contains(e.getX(),e.getY())&&rect6Square==0&&rect6Diamond==0){
		  panel.addSquare(new DrawSquare(775,475));
		  rect6Square=1;
		  clickCount++;
		
	  }
	  if(rect7.contains(e.getX(),e.getY())&&rect7Square==0&&rect7Diamond==0){
		  panel.addSquare(new DrawSquare(575,575));
		  rect7Square=1;
		  clickCount++;
	  }
	  if(rect8.contains(e.getX(),e.getY())&&rect8Square==0&&rect8Diamond==0){
		  panel.addSquare(new DrawSquare(675,575));
		  rect8Square=1;
		  clickCount++;
		  
	  }
	  if(rect9.contains(e.getX(),e.getY())&&rect9Square==0&&rect9Diamond==0){
		  panel.addSquare(new DrawSquare(775,575));
		  rect9Square=1;
		  clickCount++;
		  
	  }
	  
	  
	  //Check Lose Conditions
	  
	  //Check first row for squares
	  if(rect1Square==1&&rect2Square==1&&rect3Square==1) {
	  showMessageDialog(null, "Game over: You Lose");
	  return;
	  }
	  
	  //Check second row for squares
	  if(rect4Square==1&&rect5Square==1&&rect6Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	//Check third row for squares
	  if(rect7Square==1&&rect8Square==1&&rect9Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	  //Check first column for squares
	  if(rect1Square==1&&rect4Square==1&&rect7Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	  //Check second column for squares
	  if(rect2Square==1&&rect5Square==1&&rect8Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	//Check second column for squares
	  if(rect3Square==1&&rect6Square==1&&rect9Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	  
	  //Check crosses
	  if(rect1Square==1&&rect5Square==1&&rect9Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
		  }
	  
	//Check second cross for squares
	  if(rect3Square==1&&rect5Square==1&&rect7Square==1) {
		  showMessageDialog(null, "Game over: You Lose");
		  return;
	  }
	
	//Diamond Drawing
	  while(true) {
		  //Check game tie
		  if(	(rect1Square==1||rect1Diamond==1)&&(rect2Square==1||rect2Diamond==1)&&(rect3Square==1||rect3Diamond==1)&&
				(rect4Square==1||rect4Diamond==1)&&(rect5Square==1||rect5Diamond==1)&&(rect6Square==1||rect6Diamond==1)&&
				(rect7Square==1||rect7Diamond==1)&&(rect8Square==1||rect8Diamond==1)&&(rect9Square==1||rect9Diamond==1)) {
					  showMessageDialog(null, "Game over: Tie");
					  return;
		 
					  }
		  
		  int choice = (int)(Math.random()*9);
		  
		  if(rect1Square==0&&rect1Diamond==0&&choice==0) {
		  panel.addDiamond(new DrawDiamond(600,375));
		  rect1Diamond++;
		  
		//Check If Lost
		  //Check first row for diamonds
		  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
		  showMessageDialog(null, "Game over: You Win");
		  return;
		  }
		  
		  //Check second row for diamonds
		  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		//Check third row for diamonds
		  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		  //Check first column for diamonds
		  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		  //Check second column for diamonds
		  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		//Check second column for diamonds
		  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		  
		  //Check crosses
		  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
		   
		  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
		  }
		  break;
		  }
		  
		  if(rect2Square==0&&rect2Diamond==0&&choice==1) {
			  panel.addDiamond(new DrawDiamond(700,375));
			  rect2Diamond++;
			   
			//Check If Lost
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
				  
				  //Check second row for diamonds
				  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				//Check third row for diamonds
				  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				  //Check first column for diamonds
				  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				  //Check second column for diamonds
				  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				//Check second column for diamonds
				  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				  
				  //Check crosses
				  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
					  showMessageDialog(null, "Game over: You Win");
					  return;
					  }
				   
				  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
					  showMessageDialog(null, "Game over: You Lose");
					  return;
					  
				  }
				  break;
			  }
		  
		  if(rect3Square==0&&rect3Diamond==0&&choice==2) {
			  panel.addDiamond(new DrawDiamond(800,375));
			  rect3Diamond++;
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			//Check If Lost
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  
			  }
		  
		  if(rect4Square==0&&rect4Diamond==0&&choice==3) {
			  panel.addDiamond(new DrawDiamond(600,475));
			  rect4Diamond++;
			  
			//Check If Lost
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  }
		  
		  if(rect5Square==0&&rect5Diamond==0&&choice==4) {
			  panel.addDiamond(new DrawDiamond(700,475));
			  rect5Diamond++;
			  
			//Check If Lost
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  }
		  
		  if(rect6Square==0&&rect6Diamond==0&&choice==5) {
			  panel.addDiamond(new DrawDiamond(800,475));
			  rect6Diamond++;
			  
			//Check If Lost
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  }
		  
		  if(rect7Square==0&&rect7Diamond==0&&choice==6) {
			  panel.addDiamond(new DrawDiamond(600,575));
			  rect7Diamond++;
			  
			  //Check If Lost
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  }
		  
		  if(rect8Square==0&&rect8Diamond==0&&choice==7) {
			  panel.addDiamond(new DrawDiamond(700,575));
			  rect8Diamond++;
			 
			//Check If Lost
			  
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  }
		  
		  if(rect9Square==0&&rect9Diamond==0&&choice==8) {
			  panel.addDiamond(new DrawDiamond(800,575));
			  rect9Diamond++;
			  
			  
			  //Check If Lost
			  
			  //Check first row for diamonds
			  if(rect1Diamond==1&&rect2Diamond==1&&rect3Diamond==1) {
			  showMessageDialog(null, "Game over: You Win");
			  return;
			  }
			  
			  //Check second row for diamonds
			  if(rect4Diamond==1&&rect5Diamond==1&&rect6Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check third row for diamonds
			  if(rect7Diamond==1&&rect8Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check first column for diamonds
			  if(rect1Diamond==1&&rect4Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  //Check second column for diamonds
			  if(rect2Diamond==1&&rect5Diamond==1&&rect8Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			//Check second column for diamonds
			  if(rect3Diamond==1&&rect6Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			  
			  //Check crosses
			  if(rect1Diamond==1&&rect5Diamond==1&&rect9Diamond==1) {
				  showMessageDialog(null, "Game over: You Win");
				  return;
				  }
			   
			  if(rect3Diamond==1&&rect5Diamond==1&&rect7Diamond==1) {
				  showMessageDialog(null, "Game over: You Lose");
				  return;
			  }
			  break;
			  } 
		  else {
			  continue;
		  }
		  
		  }
}
    }
	}

