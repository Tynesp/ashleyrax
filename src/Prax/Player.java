package Prax;

public class Player {

	private String name;
	private int heightInCent;
	private int age;
        private int weight;
        private String language;
        
	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public int getHeightInCent() {
		return this.heightInCent;
	}

	/**
	 * 
	 * @param heightInCent
	 */
	public void setHeightInCent(int heightInCent) {
		this.heightInCent = heightInCent;
	}

	public int getAge() {
		return this.age;
	}

}