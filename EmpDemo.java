class Emp
{
	static int cnt;
	private int eid;
	private String ename;
	private double salary;
	public double getSalary()
	{
		return salary;
	}
	public Emp()
	{
		//1. Generating eid automatically
		cnt++;
		eid=cnt;
		ename=" ";
		salary=0;
	}
	public Emp(String ename,double salary)
	{
		cnt++;
		eid=cnt;
		this.ename=ename;
		this.salary=salary;
	}
	public String show()
	{
	      return "\t"+eid+"\t"+ename+"\t"+salary;
	}
	// Emp e1=new Emp("Seeta",6000);
	// System.out.println(e1.show());
	//e1.display();
	public void display()
	{
		System.out.println("\t"+eid+"\t"+ename+"\t"+salary);
	}
}
public class EmpDemo
{ 
	public static void filterEmp(Emp e[])
	{
		double sal;
		for(Emp obj :e)
		{
			sal=obj.getSalary();
			if(sal>5000)
				obj.display();
		}
	}
	public static void main(String s[])
	{
		Emp e1=new Emp();
		Emp e2=new Emp("Seeta",60000);
		Emp e3=new Emp("Geeta",7000);
		Emp e4=new Emp();
		Emp e5=new Emp("Gopal",80000);
		// Store objects in Array
		Emp emps[]=new Emp[5];
		emps[0]=e1;
		emps[1]=e2;
		emps[2]=e3;
		emps[3]=e4;
		emps[4]=e5;
		
		for(int i=0;i<5;i++)
			emps[i].display();
		EmpDemo.filterEmp(emps);
		
	}
	
	
}
		
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
    
	
	
	
	
	    