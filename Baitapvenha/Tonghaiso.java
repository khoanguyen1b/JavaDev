
package tonghaiso;

import java.awt.*;        
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class tonghaiso extends Frame implements ActionListener, WindowListener{

  Button btnkq;
  TextField txtA,txtB,txtKQ;
  Label lblhd,lblA,lblB,lblKQ;
  public tonghaiso()
 {
setLayout(new FlowLayout());
lblhd=new Label("       TÍNH TỔNG HAI SỐ NGUYÊN            ");
this.add(lblhd);
lblA=new Label("  Nhập số thứ nhất      ");
this.add(lblA);
txtA=new TextField(17);
this.add(txtA);

lblB=new Label("    Nhập số thứ  hai      ");
this.add(lblB);
txtB=new TextField(17);
this.add(txtB);
lblKQ=new Label("                            Kết quả :  ");
this.add(lblKQ);
txtKQ=new TextField(17);
this.add(txtKQ);
txtKQ.setEditable(false);
btnkq=new Button("Kết quả");
btnkq.addActionListener(this);
addWindowListener(this);
this.add(btnkq);
 }
   

           public void actionPerformed(ActionEvent e)
           {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c+"");
            }
     
public static void main(String[] args)
{
    tonghaiso test=new tonghaiso() ;  
    
    test.setTitle("tính tổng hai số");
    test.setSize(380,200);
    test.setVisible(true);
}
 public void windowClosing(WindowEvent evt) {
      System.exit(0); 
   }
 
   
   @Override public void windowOpened(WindowEvent evt) { }
   @Override public void windowClosed(WindowEvent evt) { }
   @Override public void windowIconified(WindowEvent evt) { }
   @Override public void windowDeiconified(WindowEvent evt) { }
   @Override public void windowActivated(WindowEvent evt) { }
   @Override public void windowDeactivated(WindowEvent evt) { }
}

  

   


