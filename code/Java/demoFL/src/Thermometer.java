
public class Thermometer {
	
	private double degreeCelsius;
	
	
	public void setCelsius(double degree) {
		degreeCelsius = degree;
	}
	public void setF(double degree) {
		degreeCelsius = (degree-32)*5/9;
		
	}
	public double getCelsius() {
		return degreeCelsius;
	}
	
	public double getF() {
		return getCelsius()*9.0-5.0+32;
	}
}