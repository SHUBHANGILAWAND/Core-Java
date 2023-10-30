package data;

public class Point2D {
	private int x;
	private int y;
	
	public Point2D()
	{
		x=0;
		y=0;
	}
	
	public Point2D(int a,int b)
	{
		x=a;
		y=b;
	}
	
	public String show()
	{
		return "Co-ordinates of point are:"+this.x+" "+this.y;
	}
	
	public boolean isEqual(Point2D p)
	{
		if(this.x==p.x && this.y==p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public double getDistance(Point2D p)
	{
		double distx=0,disty=0,dist=0;
		distx=(p.x-this.x)*(p.x-this.x);
		disty=(p.y-this.y)*(p.y-this.y);
		dist=Math.sqrt(distx + disty);
		return dist;
	}
}