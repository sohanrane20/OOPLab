package lab3.figpackage;
class Cylinder extends Figure
{
	double r, h, a, v;
	public void calcArea()
	{
		a = 2 * pi * r * h + pi * r * r;
	}
	public void calcVol()
	{
		v = pi * r * r * h / 3;
	}
	public void dispArea()
	{
		System.out.println("Area of cylinder is " + a);
	}
	public void dispVol()
	{
		System.out.println("Volume of cylinder is " + v);
	}
}