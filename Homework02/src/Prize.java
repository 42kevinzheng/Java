public class Prize {
private String name;
private double price;
public Prize()
{
	name="none";
	price=0.0;
}
public Prize( String aName,double aPrice)
{
	this.setName(aName);
	this.setPrice(aPrice);
}
public String getName()
{
	return this.name;
}
public double getPrice()
{
	return this.price;
}
public void setName(String aName)
{
	this.name=aName;
}
public void setPrice(double aPrice)
{
	this.price=aPrice;
}
		
}