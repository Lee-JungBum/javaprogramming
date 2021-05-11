/* 18114323이정범
 * chap10 실습2 타이틀바꾸기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_6 extends JFrame {
	private JLabel [] keyMessage;
	public ex10_6()
	{
		setTitle("KeyListener 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel[3];
		keyMessage [0] = new JLabel(" getKeyCode()");	//코드저정될곳
		keyMessage [1] = new JLabel(" getKeychar()");	//char저장될곳
		keyMessage [2] = new JLabel(" getKeytext()");	//text저장될곳
		
		for(int i=0; i<keyMessage.length; i++) {	//크기까지반복
			c.add(keyMessage[i]);	
			keyMessage[i].setOpaque(true);	//불투명
			keyMessage[i].setBackground(Color.YELLOW);	//노란색으로변경
			}
			setSize(300,150);	//size 300 150
			setVisible(true);	//활성화
			c.setFocusable(true);	
			c.requestFocus();
			}
			class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));	//출력
			keyMessage[1].setText(Character.toString(keyChar));	//출력
			keyMessage[2].setText(e.getKeyText(keyCode));		//출력
			}
			}
	public static void main(String[] args)
	{
		new ex10_6();
	}
}
