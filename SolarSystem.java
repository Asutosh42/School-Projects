class planet
{
	String name;
	String satellites[];
	planet(String nm, String sats[])
	{
		name=nm;
		for(int i=0;i<sats.length;i++)
			satellites[i]= new String(sats[i]);
	}
	void print()
	{
		System.out.println("Planet Name: "+name);
		System.out.println("Satellites are:  ");
		for(int i=0;i<satellites.length;i++)
			System.out.println(satellites[i]);
	}
}

public class SolarSystem
{
	public static void main(String Args[])
	{
		String earth_sat[] = {"Moon","ABCD"};
		planet earth = new planet("Earth", earth_sat);
		earth.print();
	}
}
