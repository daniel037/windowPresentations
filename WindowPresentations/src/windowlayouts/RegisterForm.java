/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package windowlayouts;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author daniel
 */
public class RegisterForm extends Frame{
    private TextField name,profession;
    private TextArea cv;
    private Button save;
    //............................................
    public RegisterForm(){
        setLayout(new BorderLayout());
        Panel p=new Panel(new GridLayout(3,2));
        name=new TextField();
        profession=new TextField();
        cv=new TextArea();
        save=new Button("Save");
        
        p.add(new Label("name"));
        p.add(name);
        p.add(new Label("Profession"));
        p.add(profession);
        p.add(new Label("CV Summary"));
        
        add(p,BorderLayout.NORTH);
        add(cv,BorderLayout.CENTER);
        add(save,BorderLayout.SOUTH);
        
        setTitle("Register Form");
        setSize(400,300);
        setVisible(true);
    }
    //.......................................................
    public static void main(String[] args) {
        new RegisterForm();
    }
    
}
