package DotComKilling;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;
	
	public void SetLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	
	public void setName(String n) {
		name = n;
	}
	
	public String checkYourself(String userInput){
		String status = "miss";
		
		int index = locationCells.indexOf(userInput);
		
		if (index>=0) {
			locationCells.remove(index);
			
			if (locationCells.isEmpty()) {
				status = "kill";
				System.out.println("Ouch! You sunk"+ name + "  : (");
			} else {
				status = "hit";
			}
		}
		return status;
	}
}
