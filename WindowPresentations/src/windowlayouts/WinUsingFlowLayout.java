/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowlayouts;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Checkbox;

/**
 *
 * @author oop
 */
public class WinUsingFlowLayout extends Frame {
    private TextField nam;
    private Checkbox stu;
    private Choice nac;
//-------------------------------------------
 public WinUsingFlowLayout(){
     setLayout(new FlowLayout() );
    nam =new TextField("Enter Your Name: ");
    stu= new Checkbox();
    nac = new Choice();
    
    add(new Label("Name "));
    add(nam);
    add(new Label("Student"));
    add(stu);
    add(new Label("Nationality"));
    add(nac);
    
    nac.add("Colombian");
    nac.add("English");
    nac.add("Chinese");
    
    setTitle("Windo Usig Flow Layout");
    setSize(400,300);
    setVisible(true);
 }    
    public static void main(String[] args) {
        new WinUsingFlowLayout();
    }
}