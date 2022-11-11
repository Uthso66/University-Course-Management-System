/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package university.course.management.system;

/**
 *
 * @author Uthso
 */
import java.awt.*;
import javax.swing.*;

public class Splash {
    public static void main(String s[]){
        Frame f = new Frame();
        f.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=4, x+=1){
            f.setLocation(800-((i+x)/2), 500-(i/2));
            f.setSize(i+3*x, i+x/2);
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){}
        }
    }
}

class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(){
        super("University Course Management System");
        setLayout(new FlowLayout());
        
        ImageIcon c1;
        c1 = new ImageIcon(ClassLoader.getSystemResource("university/course/management/system/icons/first.jpg"));
        
        Image i1;
        i1 = c1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        
        ImageIcon i2;
        i2 = new ImageIcon(i1);
        
        JLabel m1;
        m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    @Override
    public void run(){
        try{
            Thread.sleep(4000);
            this.setVisible(false);
            Login f1 = new Login();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
