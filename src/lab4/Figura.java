package lab4;
import java.io.Serializable;
import java.util.Vector;

public class Figura implements Serializable {
	
	Vector<FiguraGeometrica>figuri;
	
	public static Figura instantaFigura;

	private Figura() {
		figuri=new Vector<FiguraGeometrica>();
	}
	
	public static Figura CreareFigura()
	{
		if(instantaFigura==null)
		{
			instantaFigura=new Figura();
		}
		return instantaFigura;
	}
	
	public boolean AdaugaFiguraGeometrica(FiguraGeometrica f)
	{
		boolean fig=figuri.add(f);
		return fig;
	}
}
