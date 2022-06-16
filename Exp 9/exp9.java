import java.awt.*;
import javax.swing.*;
import javax.swing.JTable;
/*<applet code="exp9" width=500 height=500></applet>*/
public class exp9 extends JApplet
{
	public void init()
	{
	Container contentPane=getContentPane();
	contentPane.setLayout(new BorderLayout());
	final String[] colHeads={"Name","Roll_NO","Y_OF_Addmission","Department"};
	final Object[][] data={
	{"Vinod","11","2020","BCA"},
	{"Anjali","06","2020","BCA"},
	{"Shubham","12","2020","BCA"},
	{"Amit","44","2020","BCA"},
	{"Anil","55","2020","BCA"},
	};
	JTable table = new JTable(data,colHeads);
	int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
	int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
	JScrollPane jsp= new JScrollPane(table,v,h);
	contentPane.add(jsp,BorderLayout.CENTER);
	}
}/*
Java program for printing your name , roll no,year of
admission, Dept. and section by using Applet.
*/