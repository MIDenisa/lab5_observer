package lab4;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.Vector;
public class Fereastra extends JFrame implements ActionListener {
	
	
	private GestiuneFiguriGeometrice g;
	private JButton update;
	private JButton btnlinie;
	private JPanel components=new JPanel(new GridLayout(2,5));
	private JPanel canv=new JPanel(new GridLayout(1,0));
	private Font f=new Font("Trebuchet MS", Font.BOLD,12);
	private Linie l;
	
	
	
	public Fereastra()
	{
		super();
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
		g.AdaugaFigura(l);
		g.Adauga(l);
		canv.add(l);
		btnlinie=new JButton("Trasare linie");
		btnlinie.setFont(f);
		components.add(btnlinie);
		
		btnlinie.addActionListener(
				new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource()==btnlinie)
						{
							update=new JButton("UPDATE");
							update.setFont(f);
							components.add(update);
							update.addActionListener(this);
						}
					}
				}
		);
		c.add(canv);
		c.add(components);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==update)
		{
			try {
				l.update();
			}catch(Exception ex) {}
		}
	}
	
	public static void main(String[] args) 
	{
		Fereastra fereastra=new Fereastra();
		fereastra.setVisible(true);
		
		
		
	}

}
