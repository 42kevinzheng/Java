/**
 * 
 * 
 * Written by Kevin Zheng
 *
 */

public class Sheep {
    private String name;
    private double weight;

    public Sheep()
    {
        weight = 0.0;
        name = "null";
    }

    public Sheep( String aName,double aWeight)
    {
        this.name = aName;
        this.weight = aWeight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() 
    {
        return "name = "+"\""+name+"\","+ " weight= "+weight ;
    }

    public int compareTo(Sheep sheep)
    {
        if (this.weight>sheep.weight)
            return 1;
        else if(this.weight<sheep.weight)
            return -1;
        else
            return 0;
    }
  
    
}

