package com.gimhae;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Ex13 extends JFrame{
	// ȭ�� ����
	
		private final int width = 240;
		private final int height = 370;
		public JTextField inputSpace= new JTextField();
		
		private GridBagLayout grid = new GridBagLayout();
		  private GridBagConstraints gbc = new GridBagConstraints();
		  private Color darkColor = new Color(80, 82, 85);
		  TitledBorder tB = new TitledBorder(new LineBorder(darkColor, 1));

		String button_names[] = {"C", "��","%", "��", "7", "8", "9", "x","4", "5", "6", "-", "1", "2", "3","+","0", ".", "="};
		String buttonString = "C��%��789x456-123+0.=";
		JButton buttons[] = new JButton[button_names.length];
		MouseActionListener me = new MouseActionListener();
		
		Stack<Double> numStack = new Stack<>();
		Stack<Character> opStack= new Stack<>();
		
		String num = "";
		private String prev_operation = "";
		
		public Ex13() {
			
			setLayout(null);
			
			inputSpace.setEditable(false); // ���� �Ұ���
			inputSpace.setBackground(darkColor); // ����� ȭ��Ʈ
			inputSpace.setHorizontalAlignment(JTextField.RIGHT);  // ���� ��ġ
			inputSpace.setFont(new Font("Dialog", Font.PLAIN, 40)); // �۾� ü
			inputSpace.setBounds(0, 0, width, 70); // x:8, y:10 ��ġ 270x70 ũ��
			inputSpace.setBorder(new LineBorder(Color.gray, 0));
			inputSpace.setForeground(Color.white);
			
			JPanel buttonPanel = new JPanel();

			buttonPanel.setLayout(grid);
			buttonPanel.setBounds(0, 70, width, 274);
			buttonPanel.setBackground(darkColor);
			
			gbc.fill = GridBagConstraints.BOTH; // �� ä����
	        gbc.weightx = 1.0; // x�� �� �Ѿ
	        gbc.weighty = 1.0;// y�� �� �Ѿ
	        
			 int x = 0;
			 int y = 0;
			for(int i = 0; i<button_names.length; i++) {
				buttons[i] = new JButton(button_names[i]);
				buttons[i].setFont(new Font("Dialog", Font.BOLD, 20));
				buttons[i].setForeground(Color.white);
				if(button_names[i].matches("[��+=x-]")) {
					buttons[i].setBackground(new Color(255, 159, 9));
				}else if(button_names[i].matches("[C��%]")) {
					buttons[i].setBackground(new Color(97, 99, 102));
				}else {
					buttons[i].setBackground(new Color(123, 125, 127));
				}
				
				// ���� ���� ���� ======
				if(button_names[i] == "0") {
					makeFrame(buttons[i], x, y, 2, 1);
					x++;
				}else {
					makeFrame(buttons[i], x, y, 1, 1);
				}
				
				x++;
				if(x > 3) {
					x = 0;
					y++;
				}
				// ====== ======
				
				buttons[i].addActionListener(new ButtonActionListener());
				buttons[i].addMouseListener(me);
				
				buttons[i].setBorder(tB);
				buttonPanel.add(buttons[i]);
				buttons[i].setOpaque(true);
			}
			
			
			add(inputSpace);
			add(buttonPanel);
			
			setTitle("����");
			setVisible(true);
			setSize(width, height);
			setBackground(Color.DARK_GRAY);
			setLocationRelativeTo(null); // ȭ�� ����� ����
			setSize(300,400); // ���������� �Ұ�
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // â�� ������ �������� ���α׷� �� ����
			
		}

		public void makeFrame(JButton c, int x , int y, int w, int h) {
			gbc.gridy = y;
			gbc.gridx = x;
			gbc.gridheight = h;
			gbc.gridwidth = w;
			grid.setConstraints(c, gbc);
		}
		
		class ButtonActionListener implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) { 
				String inputValue = e.getActionCommand(); 
				
				if(inputValue.equals("C")) { 
					inputSpace.setText("");
				}else if( inputValue.equals("=")) {
					String result = Double.toString(calculate(inputSpace.getText()));
					inputSpace.setText(""+result);
					num = "";
				}else if(inputValue.equals("��")) {
					/*
					 *   �÷��� ���̳ʽ� ��ư ���� ��
					 */
				}else if(inputValue.matches("[��+x-]") || inputValue.matches("%") ) {
			    	if(inputSpace.getText().equals("") ) {
			    		inputSpace.setText("");
		    		}else if(prev_operation.matches("[��+x-]")  || prev_operation.matches("%")  || prev_operation.matches("��")){
			    		String is = inputSpace.getText();
			    		String lastS = is.substring(0, is.length() -1 );
			    		inputSpace.setText("");
			    		inputSpace.setText(lastS + inputValue);
			    		
			    	}else {
			    		inputSpace.setText(inputSpace.getText() + inputValue);
			    	}
				} else {
					inputSpace.setText(inputSpace.getText() + inputValue);
				}
				prev_operation = inputValue;
			}
		}
		
		private void preprocess(String inputText) {
			numStack.clear();
			opStack.clear();
			
			for(int i=0; i<inputText.length(); i++) {
				char ch = inputText.charAt(i); // 2
				
				if(ch == '-' || ch == '+'  || ch == 'x' || ch== '��' || ch== '%') {
					if(num != "" ) numStack.add(Double.valueOf(num));
					if(!opStack.isEmpty() && (opStack.peek().equals('x' ) || opStack.peek().equals('��') || opStack.peek().equals('%' ))) {
						
						double n1 = numStack.pop();
						double n2 = numStack.pop();
						Character oper = opStack.pop();
						
						if(oper.equals('x')){ numStack.add(n2*n1);
						}else if(oper.equals('%')){ numStack.add(n2%n1);
						}else if(oper.equals('��')) { numStack.add(n2/n1); }
					}

					opStack.add(ch);
					num ="";
				} else {
					num = num + ch;
				}
				
				if( i == inputText.length()-1) {
					if(ch == '-' || ch == '+'  || ch == 'x' || ch== '��' || ch== '%') {
						opStack.pop();
					}			
					if(!opStack.isEmpty() && (opStack.peek().equals('x' ) || opStack.peek().equals('��') || opStack.peek().equals('%' ))){
						double n1 = Double.valueOf(num);
						double n2 = numStack.pop();
						Character oper = opStack.pop();
						if(oper.equals('x')){ numStack.add(n2*n1);
						}else if(oper.equals('%')){ numStack.add(n2%n1);
						}else if(oper.equals('��')) { numStack.add(n2/n1); }
					}else {
						if(num != "" ) numStack.add(Double.valueOf(num));
					}
				}
			}
		}
		
		private double calculate(String inputText) {
			preprocess(inputText);
			
			while(!opStack.isEmpty() && numStack.size() >= 2) {
				double n1 = numStack.pop();
				double n2 = numStack.pop();
				Character op = opStack.pop();
				
				if(op == '+') numStack.add(n1+n2);
				else if(op == '-') numStack.add(n2-n1); 
			}
			return numStack.pop();
		}

		
		class MouseActionListener implements MouseListener{

			@Override
			public void mousePressed(MouseEvent e) {
				JButton jb = (JButton)e.getSource();
				int target = buttonString.indexOf(jb.getText());
				buttons[target].setBorder(new LineBorder(Color.black));
				
				if(jb.getText().matches("[��+=x-]")) {
					buttons[target].setBackground(Color.green);
				}else if(jb.getText().matches("[C��%]")) {
					buttons[target].setBackground(Color.green);
				}else {
					buttons[target].setBackground(Color.green);
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				JButton jb = (JButton)e.getSource();
				int target = buttonString.indexOf(jb.getText());
				buttons[target].setBorder(tB);
				if(jb.getText().matches("[��+=x-]")) {
					buttons[target].setBackground(new Color(255, 159, 9));
				}else if(jb.getText().matches("[C��%]")) {
					buttons[target].setBackground(new Color(97, 99, 102));
				}else {
					buttons[target].setBackground(new Color(123, 125, 127));
				}
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}
		}

	public static void main(String[] args) {
		new Ex13();

	}

}
