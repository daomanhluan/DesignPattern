package BuilderPattern;

public class User {

	private final String firstName;
	private final String lastName;
	private final int age;
	private final String phone;
	private final String address;
	private User(UserBuilder build) {
		this.firstName=build.firstName;
		this.lastName=build.lastName;
		this.age=build.age;
		this.address=build.address;
		this.phone=build.phone;
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getPhone() {
		return phone;
	}


	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

	public static class UserBuilder{
		private final String firstName;
		private final String lastName;
		private int age;
		private String address;
		private String phone;
		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilder age(int age) {
			this.age=age;
			return this;
		}
		public UserBuilder phone(String phone) {
			this.phone=phone;
			return this;
		}
		public UserBuilder address(String address) {
			this.address=address;
			return this;
		}
		
		public User build() {
			User user = new User(this);
			return user;
		}
	}
	
	public static void main(String[] args) {
		User user = new User.UserBuilder("Luan", "Dao")
			.address("HN")
			.build();
		System.out.println(user.toString());;
	}
}
