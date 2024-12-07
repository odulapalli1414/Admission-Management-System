import java.awt.Image;
import javax.swing.*;

public class Splash extends JFrame implements Runnable{
    
    Thread t;

    Splash() {

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image scaled_i1_Image = i1.getImage().getScaledInstance(1500, 700, Image.SCALE_DEFAULT);
        ImageIcon scaled_i1 = new ImageIcon(scaled_i1_Image);
        JLabel image = new JLabel(scaled_i1);
        add(image);

        t = new Thread(this);
        t.start();

        setVisible(true);

        // setLocation(100,100);
        // setSize(1500, 700);
        
        int x = -185;
        for(int i=400; i<=600; i++, x+=1){
            // setLocation(i+10, 700-i);
            setLocation(320-((i+x)/2), 350 - (i/2));
            setSize(i+x+900, i+x/3+130);

            try{
                Thread.sleep(10);
            } catch(Exception e){}
        }   
    }

    public void run(){
        try{
            Thread.sleep(5000);
            setVisible(false);

            //Login
            new About();
        } catch (Exception e){

        }
    }

    public static void main(String[] args){
        new Splash();
    }
}
