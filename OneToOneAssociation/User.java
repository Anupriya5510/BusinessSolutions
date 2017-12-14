package collections;

public class User implements Comparable<User> {

	public int id;
	public String username;
	public String password;

	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof User))
			return false;
		User another = (User) obj;
		return (this.hashCode() == another.hashCode());

	}

	@Override
	public int hashCode() {

		return 21 + username.hashCode() + Integer.hashCode(id);

	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}

	@Override
	public int compareTo(User o) {

		return 0;
	}

}
