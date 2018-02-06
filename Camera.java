package equalsMethod;

public class Camera {
	private int model;
	private int numberOfSettings;
	private String brand;
	
	public Camera(int givenModel, int givenNumberOfSettings, String givenBrand){
		model = givenModel;
		numberOfSettings = givenNumberOfSettings;
		brand = givenBrand;
	}
	
	@Override
	public String toString() {
		String s = "";
		s += "This camera is a" + brand + " " + model;
		s += ", and This camera has " + numberOfSettings + " number of settings.";
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		Object xxyyzz = new Object();
		xxyyzz.equals("abc");
		String str = "abc";
		str.equals("abc");
		//1 - Make sure the object given is not null
		if(obj == null)
			return false;
		
		//2 - Make sure they are of the same class
		if(this.getClass() != obj.getClass())
			return false;
		
		//3 - Downcast object to this type of class
		Camera tmp = (Camera)obj;
		
		//4 - Check its contents, and ensure they are in fact equal
		if(tmp.model != this.model)
			return false;
		
		else if(tmp.model != this.model)
			return false;
		
		else if(!tmp.brand.equals(this.brand))
			return false;
		
		
		return true;
	}
}