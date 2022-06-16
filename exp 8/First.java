import java.applet.*;
import java.awt.*;
import java.awt.event.*;


public class First extends Applet implements Runnable,ActionListener{

    int x,y;
    Thread t;
    Button cmdstart,cmdstop;

    public void init(){
       this.setForeground(Color.RED);
        x=20;
        y=20;
        cmdstart=new Button("start");
        add(cmdstart);
        cmdstart.addActionListener(this);
        cmdstop=new Button("stop");
        add(cmdstop);
        cmdstop.addActionListener(this);
    }
    public void paint(Graphics G){
        G.fillOval(x, y, 25, 25);
    }
    
    
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==cmdstart){
            t=new Thread(this);
            t.start();
        }else if(e.getSource()==cmdstop){
            t.interrupt();
        }
    }
    public void run(){
        while(true){
            try{
                 Thread.sleep(100);
            }catch(Exception e){
                System.out.println(e);
            }
            repaint();
            x=(int)(Math.random()*getWidth());
            y=(int)(Math.random()*getHeight());
            if(x>=this.getWidth()-25){
                x=0;
            }
            if(y>=this.getHeight()-25){
                y=0;
            }
        }
    }
    
}
/* <applet code=First.class width=400 height=400></applet>*/