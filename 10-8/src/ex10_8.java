/* 18114323이정범
 * chap10 실습8 상화좌우
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_8 extends JFrame {
	private final int FLYING_UNIT = 10;
	private JLabel la = new JLabel("HELLO");
	public ex10_8() {
	setTitle("상,하,좌,우 키를 이용하여 텍스트 움직이기");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container c = getContentPane();
	c.setLayout(null);		//layout직접
	c.addKeyListener(new MyKeyListener());	//생성
	la.setLocation(50,50);		//라벨위치 50 50
	la.setSize(100,20);			//라벨사이즈 `100 20
	c.add(la);
	setSize(300,300);	//프레임사이즈 300 300
	setVisible(true);
	c.setFocusable(true);
	c.requestFocus();
	c.addMouseListener(new MouseAdapter() {
	public void mouseClicked(MouseEvent e) {
	Component com = (Component)e.getSource();
	com.setFocusable(true);
	com.requestFocus();
	}
	});
	}
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		switch(keyCode) {
			case KeyEvent.VK_UP:		//상
				la.setLocation(la.getX(), la.getY()-FLYING_UNIT);//위치
			break;
			case KeyEvent.VK_DOWN:			//하
				la.setLocation(la.getX(), la.getY()+FLYING_UNIT);//위치
			break;
			case KeyEvent.VK_LEFT:			//좌
				la.setLocation(la.getX()-FLYING_UNIT, la.getY());//위치
			break;
			case KeyEvent.VK_RIGHT:		//우
				la.setLocation(la.getX()+FLYING_UNIT, la.getY());//위치
			break;
			}
		}
	}
	public static void main(String[] args)
	{
		new ex10_8();
	}
}
