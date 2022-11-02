package kodlama.io.Devs.entities.concretes;

public class Programs {
	private int id;
	private String name;

	public Programs() {

	}

	public Programs(int id, String name) {

		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
