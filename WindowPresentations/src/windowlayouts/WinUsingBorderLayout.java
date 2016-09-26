/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowlayouts;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;

/**
 *
 * @author daniel
 */
public class WinUsingBorderLayout extends Frame {
    private Label l;
    private TextArea t;
    private Button b;
    private Checkbox c;
    
    //................................................
    
    public WinUsingBorderLayout(){
        BorderLayout y=new BorderLayout();
        l=new Label("Enter your information");
        t= new TextArea();
        b=new Button("Save");
        c=new Checkbox();
        add(l,BorderLayout.NORTH);
        add(t,BorderLayout.CENTER);
        add(b,BorderLayout.SOUTH);
        add(c,BorderLayout.WEST);
        setTitle("Using BorderLayout");
        setSize(400,300);
        setVisible(true);
    }
    
    //................................................
    
    public static void main(String[] args) {
        new WinUsingBorderLayout();
    }
}
