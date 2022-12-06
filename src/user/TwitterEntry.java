package user;

import visitor.Visitable;

public interface TwitterEntry extends Visitable {
	
	// set the id of the entry (either: User or UserGroup)
	public void setID(String id); 
	
	//setting and getting either User or Group Id 
	public String getName(); 
	
	//get total entries (either user or group)
	public int getTotal(); 
	
	//set the creation time 
	public void setCreationTime(long time); 
	
	//get the creation time 
	public long getCreationTime(); 
}
