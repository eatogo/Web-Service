package _00_global.model;

public class FOOD_TYPES {
	private String food_type;
	private String food_type_description;
	
	public FOOD_TYPES() {
	}

	public FOOD_TYPES(String food_type, String food_type_description) {
		super();
		this.food_type = food_type;
		this.food_type_description = food_type_description;
	}

	public String getFood_type() {
		return food_type;
	}

	public void setFood_type(String food_type) {
		this.food_type = food_type;
	}

	public String getFood_type_description() {
		return food_type_description;
	}

	public void setFood_type_description(String food_type_description) {
		this.food_type_description = food_type_description;
	}

	@Override
	public String toString() {
		return "FOOD_TYPES [food_type=" + food_type + ", food_type_description=" + food_type_description + "]";
	}
	
}
