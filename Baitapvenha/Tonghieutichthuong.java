package tonghieutichthuong;
import java.awt.*;
import java.awt.event.*;
public class Tonghieutichthuong extends Frame implements ActionListener, WindowListener{
    Label lblhd=new Label("                                  Calculator                                   ");
    Label lblA=new Label("A=");
    Label lblB=new Label("b=");
    Label lblKQ=new Label("Kết quả");
    TextField txtA=new TextField(8);
    TextField txtB=new TextField(8);
    TextField txtKQ=new TextField(10);
    Button btnTong=new Button("Tong");
    Button btnHieu=new Button("Hieu");
    Button btnTich=new Button("Tich");
    Button btnThuong=new Button("Thuong");
    public Tonghieutichthuong()
    {   this.add(lblhd);
        this.add(lblA);
        this.add(txtA);
        this.add(lblB);
        this.add(txtB);
        this.add(btnTong);
        btnTong.addActionListener(this);
        this.add(btnHieu);
        btnHieu.addActionListener(this);
        this.add(btnTich);
        btnTich.addActionListener(this);
        this.add(btnThuong);
        btnThuong.addActionListener(this);
        this.add(lblKQ);
        this.add(txtKQ);
        addWindowListener(this);
        txtKQ.setEditable(false);
        this.setLayout(new FlowLayout());
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btnTong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a+b;
            txtKQ.setText(c + ""); 
        }
         if(e.getSource()==btnHieu)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a-b;
            txtKQ.setText(c + ""); 
            

        }
          if(e.getSource()==btnTich)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            int c=a*b;
            txtKQ.setText(c + ""); 
            

        }
           if(e.getSource()==btnThuong)
        {
            int a=Integer.parseInt(txtA.getText());
            int b=Integer.parseInt(txtB.getText());
            float c=(float)a/b;
            txtKQ.setText(c + ""); 
            

        }
    }
    public static void main(String[] args) {
        Tonghieutichthuong thtt=new Tonghieutichthuong();
        thtt.setTitle("tonghieutichthuong");
        thtt.setSize(270,200);
        
        thtt.setVisible(true);
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
