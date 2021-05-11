/* 18114323이정범
 * chap10 실습7 입력글자에따라 백그라운드바꾸기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_7 extends JFrame {
	
	private JLabel la = new JLabel();
	public ex10_7()
	{
		setTitle("Key Code 예제 : F1키:초록색, % 키 노란색");	//타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료
		Container c = getContentPane();
		c.addKeyListener(new MyKeyListener());
		c.add(la);
		setSize(300,150);	//프레임 300 150
		setVisible(true);		//활성화
		c.setFocusable(true); //키입력받을수있게
		c.requestFocus();//강제지정
	}
		class MyKeyListener extends KeyAdapter {
			public void keyPressed(KeyEvent e) {
				Container contentPane = (Container)e.getSource();
				la.setText(e.getKeyText(e.getKeyCode()));	//입력값
				
				if(e.getKeyChar() == '%')	//%입력시
					contentPane.setBackground(Color.YELLOW);	//백그라운드 옐로
					else if(e.getKeyCode() == KeyEvent.VK_F1)		//f1입력시
					contentPane.setBackground(Color.GREEN);		//백그라운드 그린
			}
		}
	public static void main(String[] args)
	{
		new ex10_7();
	}
}
