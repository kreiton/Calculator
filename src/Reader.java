import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame
{
	 JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bravno, bminus, bplus, brazd, bumn, bsteret, bplmin ;
	 JTextField t1;
	
	long i = 0;
	long i1;
	int k;
	double div;
	
	String a, b;
	eHandler handler = new eHandler();
	
	public Reader(String s)
	{
		super (s);
		setLayout(new FlowLayout());
	
	
	b0 = new JButton("0");
	b1 = new JButton("1");
	b2 = new JButton("2");
	b3 = new JButton("3");
	b4 = new JButton("4");
	b5 = new JButton("5");
	b6 = new JButton("6");
	b7 = new JButton("7");
	b8 = new JButton("8");
	b9 = new JButton("9");
	
	bravno = new JButton("=");
	bminus = new JButton("-");
	bplus = new JButton("+");
	brazd = new JButton("/");
	bumn = new JButton("х");
	bsteret = new JButton("Очистить");
	bplmin = new JButton("+/-");
	
	t1 = new JTextField(15);
	t1.setEditable(false);
	
		
	//t1 = new JTextField(15);
	
	
	
	add(t1); //добавляем поле вывода
	
	
	
	add(b7); //добавляем кнопки цифр, 1 ряд
	add(b8);
	add(b9);
	add(brazd);
	
	add(b4); //2 ряд
	add(b5);
	add(b6);
	add(bumn);
	
	add(b1);
	add(b2);
	add(b3);
	add(bminus);
	
	add(bplmin);
	add(b0);
	add(bravno);
	add(bplus);
	add(bsteret);  //добавляем кнопки стереть и backspace
	
	
	
	b0.addActionListener(handler);
	b1.addActionListener(handler);
	b2.addActionListener(handler);
	b3.addActionListener(handler);
	b4.addActionListener(handler);
	b5.addActionListener(handler);
	b6.addActionListener(handler);
	b7.addActionListener(handler);
	b8.addActionListener(handler);
	b9.addActionListener(handler);
	bsteret.addActionListener(handler);
	bplus.addActionListener(handler);
	bminus.addActionListener(handler);
	bumn.addActionListener(handler);
	brazd.addActionListener(handler);
	bplmin.addActionListener(handler);
	bravno.addActionListener(handler);
	}
	
	public class eHandler implements ActionListener
	{

		public void actionPerformed(ActionEvent e) 
		{
			try 
			{
				if(e.getSource() == b0) //задаем действие при нажатии конопок калькулятора с цифрами
			
				{
					i = i*10+0;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b1)
					
				{
					i = i*10+1;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b2)
					
				{
					i = i*10+2;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b3)
					
				{
					i = i*10+3;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b4)
					
				{
					i = i*10+4;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b5)
					
				{
					i = i*10+5;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b6)
					
				{
					i = i*10+6;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b7)
					
				{
					i = i*10+7;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b8)
					
				{
					i = i*10+8;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == b9)
					
				{
					i = i*10+9;
					a = ""+i;
					t1.setText(a);
				}
				
				if(e.getSource() == bsteret) 
				{
					t1.setText(null);
					i = 0;
				}
				
				if(e.getSource() == bplus) 
				{
					i1 = i;
					i = 0;
					a = i1+"+";
					k = 1;
					t1.setText(a);
				}
				
				if(e.getSource() == bminus) 
				{
					i1 = i;
					i = 0;
					a = i1+"-";
					k = 2;
					t1.setText(a);
				}
				
				if(e.getSource() == bumn)  
				{
					i1 = i;
					i = 0;
					a = i1+"x";
					k = 3;
					t1.setText(a);
				}
				
				if(e.getSource() == brazd) 
				{
					i1 = i;
					i = 0;
					a = i1+"/";
					k = 4;
					t1.setText(a);
				}
				
				if(e.getSource() == bplmin)
				{
					i = -i;
					a = i+"";
					
					t1.setText(a);
				}
				
				if(e.getSource() == bravno)
				{
					switch (k)
					{
					case 1:
					{
						a = i1+i+"";  //сложение
						t1.setText(a);
						break;
					}
					case 2:
					{
						a = i1-i+"";  //вычитание
						t1.setText(a);
						break;
					}
					case 3:
					{
						a = i1*i+"";  //умножение
						t1.setText(a);
						break;
					}
					case 4:
					{
						double i2 = i1;
						double i3 = i;
						div = i2/i3;  //деление
						a = div + "";
						t1.setText(a);
						break;
					}
										
				}
		
				}
			}
			
			catch (Exception ex)
			{
				JOptionPane.showMessageDialog(null, "Введите в поле целое число");
			}
		
		
		}
	}
	
}