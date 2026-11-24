public class UserRegistration {
	public void register(String name, int id) {
		System.out.println("Registered user: " + name + " (ID: " + id + ")");
	}

	public void register(int id, String name) {
		System.out.println("Registered user: " + name + " (ID: " + id + ")");
	}
}

class Main {
	public static void main(String[] args) {
		UserRegistration registration = new UserRegistration();
		registration.register("Alice", 101);
		registration.register(102, "Bob");
	}
}
