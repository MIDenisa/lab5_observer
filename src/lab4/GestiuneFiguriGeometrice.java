package lab4;
import java.util.Vector;

public class GestiuneFiguriGeometrice
{
	Vector <FiguraGeometrica> figuriGeometrice;
	Linie linie;
	
	public GestiuneFiguriGeometrice()
	{
		figuriGeometrice=new Vector<FiguraGeometrica>();
	}
	
	public void AdaugaFigura(FiguraGeometrica f)
	{
		figuriGeometrice.add(f);
	}
	
	public void StergeFigura(FiguraGeometrica f)
	{
		figuriGeometrice.remove(f);
	}

}
