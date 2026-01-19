package lab3.figpackage;
class Cone extends Figure
{
	double r, h, l, a, v;
	public void calcArea()
	{
		a = 2 * pi * r * l + pi * r * r;
	}
	public void calcVol()
	{
		v = pi * r * r * h / 3;
	}
	public void dispArea()
	{
		System.out.println("Area of cone is " + a);
	}
	public void dispVol()
	{
		System.out.println("Volume of cone is " + v);
	}
}