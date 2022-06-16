import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.lang.Exception;  
  
class testloginForm extends JFrame implements ActionListener  
{   JButton b1;  
    JPanel newPanel;  
    JLabel userLabel, passLabel;  
    final JTextField  textField1, textField2;  
      
    testloginForm()  
    {     
        userLabel = new JLabel();  
        userLabel.setText("Username");        
        textField1 = new JTextField(15);    
        passLabel = new JLabel();  
        passLabel.setText("Password");      
        textField2 = new JPasswordField(15);     
        b1 = new JButton("SUBMIT");   
        newPanel = new JPanel(new GridLayout(3, 1));  
        newPanel.add(userLabel);    
        newPanel.add(textField1);     
        newPanel.add(passLabel);      
        newPanel.add(textField2);     
        newPanel.add(b1);           
        add(newPanel, BorderLayout.CENTER);  
        b1.addActionListener(this);     
        setTitle("LOGIN FORM");        
    }  
      
    public class tloginForm {
        
    }
    public void actionPerformed(ActionEvent ae)    
    {  
        String userValue = textField1.getText();          
        String passValue = textField2.getText();          
        if (userValue.equals("user") && passValue.equals("pass")) {    
            NewPage page = new NewPage();  
            page.setVisible(true);  
            JLabel wel_label = new JLabel("Welcome: "+userValue);  
            page.getContentPane().add(wel_label);  
        }  
        else{
            System.out.println("Please enter valid username and password");  
        }  
    }  
}    
public class loginForm  
{  
    public static void main(String arg[])  
    {  
        try  
        {  
            testloginForm form = new testloginForm();  
            form.setSize(200,250);  
            form.setVisible(true);  
        }  
        catch(Exception e)  
        {     
            JOptionPane.showMessageDialog(null, e.getMessage());  
        }  
    }  
} 