package awtcounter;

import java.awt.*;        
import java.awt.event.*;  
 

public class AWTCounter extends Frame implements ActionListener {
   private Label lblCount;   
   private TextField tfCount;
   private Button btnCount;  
   private int count = 0;   
 
  
   public AWTCounter () {
      setLayout(new FlowLayout());
       
 
      lblCount = new Label("Counter"); 
      add(lblCount);                   
 
      tfCount = new TextField("0", 10); 
      tfCount.setEditable(false);     
      add(tfCount);                    
 
      btnCount = new Button("Count");   
      add(btnCount);                   
 
      btnCount.addActionListener(this);
        
      setTitle("AWT Counter");  
      setSize(250, 100);        
 
      
 
      setVisible(true);         
      
   }
 
  
 
   
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; 
      
      tfCount.setText(count + ""); 
   }

    void start() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
  