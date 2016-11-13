package businesslogic.Userberbl;
import java.util.ArrayList;

public class UserList {
	private ArrayList<User> list;
	public UserList(){
		list=new ArrayList<User>();
	}
	public void addUser(User u){
		list.add(u);
	}
	public void deleteUser(User u){
		list.remove(u);
	}
	public UserList getUserList(){
		return this;
	}
	
	
}
