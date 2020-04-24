
	abstract class Pizza
	{
		abstract public void prepare();
		// if there is single abstract function in a class then class will automatically become abstract class..
		{
			
		}
		public void bake()
		{
			System.out.println("Bake");
		}
		public void pack()
		{
			System.out.println("Pack");
		}
	}
	class VegPizza extends Pizza
	{
		public void prepare()
		{
			System.out.println("adding corn, corn");
		}
		
	}
	class CheesePizza extends Pizza
	{
      public void prepare()
		{
			System.out.println("adding cheese, cheese");
		}
	}
	class ChickenPizza extends Pizza
	{
		public void prepare()
		{
			System.out.println("adding chicken");
		}
		
	}
	class PizzaFactory
	{
		public Pizza getPizza(String name)
		{
			Pizza p=null;
			if(name.equals("veg"))
			// value comparison
			// a) primitive value/variables
			// i)compare 10,20 10==20 output false
			// ii)int x =10,y=10; x==y true
			// b)obj refernce 
			// i) student s1,s2; s1.equals(s2);
			{
				p = new VegPizza();
			}
			if(name.equals("cheese"))
			{
				p = new CheesePizza();
			}
			if(name.equals("chicken"))
			{
				p = new ChickenPizza();
			}
			return p;
		}
	}
	
	
public class FactoryDemo
{
	public static void main(String... x)
	{
		PizzaFactory pf = new PizzaFactory();
		Pizza p = pf.getPizza("veg");
		p.prepare();
		p.bake();
		p.pack();
	}
}