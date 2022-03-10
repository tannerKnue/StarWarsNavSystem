package StarWarsProject;

public class Planet
{
    // coordinates of planets
    private double x;
    private double y;
    //region of planet
    private String r;
    //name of plane
    private String name;
    public Planet(String name, String r, double x, double y){ //construtor
    	this.name=name; 
        this.x=x;
        this.y =y;
        this.r=r;
    }
    //get methods
    public  String getName() {
    	return this.name; 
    }
    public double getX ()
    {
        return x;   //return x-coordinate
    }
    public double getY ()
    {
        return y;   //return the y-coordinate
    }
    public String getRegion ()
    {
        return r;   //return the region
    }
}
