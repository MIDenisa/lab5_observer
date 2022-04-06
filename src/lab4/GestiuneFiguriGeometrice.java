package lab4;


import java.util.Vector;

public class GestiuneFiguriGeometrice
{
	Vector<Observer> observers;
	Vector <FiguraGeometrica> figuriGeometrice;
	Linie linie;
	
	public GestiuneFiguriGeometrice()
	{
		observers=new Vector<Observer>();
		figuriGeometrice=new Vector<FiguraGeometrica>();
	}
	
	public void Adauga (Observer l)
	{
		observers.add(l);
	}
	
	public void Sterge(Observer o)
	{
		observers.remove(o);
	}
	
	public void AdaugaFigura(FiguraGeometrica f)
	{
		figuriGeometrice.add(f);
		this.UpdateAll();
	}
	
	public void StergeFigura(FiguraGeometrica f)
	{
		figuriGeometrice.remove(f);
		this.UpdateAll();
	}
	
	private void UpdateAll()
	{
		for(int i=0;i<observers.size();i++)
		{
			observers.get(i).update(); 
		}
	} 

}
