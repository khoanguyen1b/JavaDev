
package nhapN;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;

public class nhapN extends Frame implements ActionListener, WindowListener{
    
    Label lblhd=new Label("                  Tính tổng - Ước số - Số nguyên tố - Phân tích                ");
    Label lblN=new Label(" N=");
    Label lblKQ=new Label("Kết quả");
    TextField txtN=new TextField(15);
    TextField txtKQ=new TextField(15);
    Button btnS=new Button("S=1+2+...+n");
    Button btnUS=new Button("In Ước số");
    Button btnNT=new Button("KT số nguyên tố");
    Button btnPT=new Button("Phân Tích");
    Button btnTH=new Button("Bắt đầu");
    Button btnTT=new Button("Tiếp tục");
    Button btnout=new Button("Thoát");
    public nhapN()
    {
        this.add(lblhd);
    this.add(lblN);
    this.add(txtN);
    txtN.setEditable(false);
    this.add(lblKQ);
    this.add(txtKQ);
    txtKQ.setEditable(false);
    this.add(btnS);
    btnS.addActionListener(this);
    this.add(btnUS);
    btnUS.addActionListener(this);
    this.add(btnNT);
    btnNT.addActionListener(this);
    this.add(btnPT);
    btnPT.addActionListener(this);
    this.add(btnTH);
    btnTH.addActionListener(this);
    this.add(btnTT);
    btnTT.addActionListener(this);
    this.add(btnout);
    addWindowListener(this);
    btnout.addActionListener(this);
    this.setLayout(new FlowLayout());
    }
      
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnS)
        {
            int n=Integer.parseInt(txtN.getText());
            int s=0;
            for(int i=1;i<=n;i++)
            s=s+i;
            txtKQ.setText(s + ""); 
        }
        if(e.getSource()==btnUS)
        {
            int n=Integer.parseInt(txtN.getText());
            String s = "";
            for(int i=1;i<=n;i++)
            if (n%i==0) s=s+"-"+i;
            txtKQ.setText(s + ""); 
        }
        if(e.getSource()==btnNT)
        {
         int n=Integer.parseInt(txtN.getText());
         int dem=0;
         for(int i=2;i<n;i++)
             if(n%i==0)
             {dem++;
             break;
             }
             
         if(dem==1)
         txtKQ.setText(n+"không phải la so nguyen to" + ""); 
         else txtKQ.setText(n+"la so nguyen to" + ""); 
        }
        if(e.getSource()==btnPT)
        { String s = "1";
        
          int n=Integer.parseInt(txtN.getText());
          int i=2;
          while (n != 1)
    {
        if ((n%i) == 0)
        {
            s=s+"*"+i;
            n /= i;
        }

        else
            i++;
    }
          txtKQ.setText(s+"");  
        }
        if(e.getSource()==btnTT)
        {
            String s="";
            txtN.setText(s+ ""); 
            txtKQ.setText(s+ ""); 
        }
        if(e.getSource()==btnTH)
           txtN.setEditable(true); 
        if(e.getSource()==btnout) 
            System.exit(0);   
    }
    
    public static void main(String[] args) {
      nhapN p=new nhapN();
      p.setTitle("Bài tập tổng hợp");
      p.setSize(400,200);
      p.setVisible(true);
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
