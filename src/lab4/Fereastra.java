package lab4;
import java.awt.*;

import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.Vector;
public class Fereastra extends JFrame {
	
	
	private GestiuneFiguriGeometrice g;
	
	private JPanel components=new JPanel(new GridLayout(2,5));
	private JPanel canv=new JPanel(new GridLayout(1,0));
	private JButton btnlinie;
	private Font f=new Font("Trebuchet MS", Font.BOLD,12);
	private Linie l;
	
	public Fereastra()
	{
		
		this.init();
		this.setSize(600,900);
		this.setTitle("Trasare figuri geometrice");
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		g=new GestiuneFiguriGeometrice();
	} 
	
	public void init()
	{
		Container c=this.getContentPane();
		c.setLayout(new GridLayout(2,1));
		Linie l=new Linie();
		canv.add(l);
		btnlinie=new JButton("Trasare linie");
		btnlinie.setFont(f);
		components.add(btnlinie);
	}
	

	public static void main(String[] args) 
	{
		Fereastra fereastra=new Fereastra();
		fereastra.setVisible(true);
		
		Figura forma=Figura.CreareFigura();
		
	}

}
