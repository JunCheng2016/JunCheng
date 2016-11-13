package businesslogic.Userberbl;

import po.ResultMessage;
import po.UserPO;
import vo.UserVO;

public class UserController {
	public class UserCntroller{
		private User u;
		public void UserController(User user){
			u=user;
		}
		public void addUser(User user){
			u.addUser(user);
		}
		public ResultMessage modifyUser(String ID,UserPO po){
			return u.modifyUser(ID, po);
		}
		
		public void endMaintain(){
			u.endMaintain();
		}
	}
}
