package collections;
import java.util.Set;
import java.util.TreeSet;

public class Solution {

	public static void main(String[] args) {
		Set<User> users=null;
		int ch=3;
		if(ch==1)
		{
			users=new TreeSet<User>(new UserIdComparator());
		}
		else
		{
			users=new TreeSet<User>(new UserNameComparator());
		}
		//List<User> user=new LinkedList<User>();
		users.add(new User(1, "Anu", "priya"));
		users.add(new User(2, "Anu", "priya"));
		users.add(new User(3, "hari", "prakash"));
		users.add(new User(4, "hari", "prakash"));
		users.add(new User(5, "Anu", "priya"));
		System.out.println(users);
		/*user.add(new User(3, "hari", "prakash"));
		user.add(new User(4, "hari", "prakash"));
		user.add(new User(3, "Anu", "priya"));
		user.sort(new UserNameComparator());
		System.out.println(user);*/
		
	}

}
