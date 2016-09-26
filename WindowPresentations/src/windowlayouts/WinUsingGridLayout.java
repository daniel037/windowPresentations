/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowlayouts;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.Random;

/**
 *
 * @author oop
 */
public class WinUsingGridLayout extends Frame {
    private Button b[];
    //------------------------------------
    public WinUsingGridLayout(){
        GridLayout grid=new GridLayout(3,4);
        setLayout(grid);
        b=new Button[12];
        Random r= new Random();
        for(int i=0;i<12;i++){
            b[i]=new Button(""+ r.nextInt(100));
            add( b[i]);
        }
        setTitle("Window Usig Grid Layout");
        setSize(400,300);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        new WinUsingGridLayout();
    }
}