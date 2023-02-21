import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.StringContent;

public class project1{
    public static void main(String[] args) {
    //
        String a = JOptionPane.showInputDialog(null,
                "nhập số thứ nhất: ",
                JOptionPane.INFORMATION_MESSAGE);
        String b = JOptionPane.showInputDialog(null,
                "nhập số thứ hai: ",
                JOptionPane.INFORMATION_MESSAGE);
		String c = JOptionPane.showInputDialog(null,
            	"nhập phép toán + - * /:",
                JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(a);
        double num2 = Double.parseDouble(b);
		char   kt   = c.charAt(0);
        
		switch (kt) {
			case '+':
				JOptionPane.showMessageDialog(null,
                      num1 + " + " + num2 + " = " + (num1 + num2), "Kết quả",
                    JOptionPane.INFORMATION_MESSAGE);
				
				break;
			case '-':
				JOptionPane.showMessageDialog(null,
					  num1 + " - " + num2 + " = " + (num1 - num2), "Kết quả",
					JOptionPane.INFORMATION_MESSAGE);
				
				break;
			case '*':
				JOptionPane.showMessageDialog(null,
					  num1 + " * " + num2 + " = " + (num1 * num2), "Kết quả",
					JOptionPane.INFORMATION_MESSAGE);
				
				break;
			case '/':
				if (num2 == 0) {
					JOptionPane.showMessageDialog(null,"Số bị chia phải khác 0.");
					
				} else {
					JOptionPane.showMessageDialog(null,
					  num1 + " / " + num2 + " = " +  num1 / num2, "Kết quả",
					JOptionPane.INFORMATION_MESSAGE);
		
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"Nhập phép tính không hợp lệ.");
				
			}
	}	
}
