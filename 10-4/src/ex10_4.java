/* 18114323이정범
 * chap10 실습4 마우스클릭한곳으로 글자보내기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_4 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public ex10_4()
	{
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		
		
		c.setLayout(null);
		la.setSize(50,20);		//라벨사이즈 50 20
		la.setLocation(30,30);	//라벨옮긴다 30 30
		c.add(la);
		
		setSize(250,250);	//프레임250x250
		setVisible(true);	//활성화
	}
	class MyMouseListener implements MouseListener
	{
		public void mousePressed(MouseEvent e)	//마우스이동
		{
			int x= e.getX();	//getx
			int y = e.getY();	//gety
			la.setLocation(x, y);	//위치시켜라
		}
		
		public void mouseReleased(MouseEvent e) {};
		public void mouseClicked(MouseEvent e) {};
		public void mouseEntered(MouseEvent e) {};
		public void mouseExited(MouseEvent e) {};
	}

	public static void main(String[] args)
	{
		new ex10_4();
	}
}
