package shapes;

import java.text.DecimalFormat;

public class Circle{
	
	public Circle(double r){
		rad = r;
		

	
	}
	private double rad;
	public DecimalFormat df2 = new DecimalFormat(".##");
	
	public double getCircumference()
	{
		return (2*Math.PI*rad);
		
	}
	public String getFormattedCircumference()
	{
		return formatNum(getCircumference());
	}
	
	public double getArea()
	{
		return (Math.PI * rad * rad);	
	}
	public String getFormattedArea()
	{
		return formatNum(getArea());
	}
	public String formatNum (double x)
	{
		return df2.format(x);
	}
	
}
