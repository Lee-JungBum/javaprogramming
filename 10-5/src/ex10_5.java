/* 18114323이정범
 * chap10 실습5 마우스에 글자보내기(어댑터)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_5 extends JFrame {
	private JLabel la = new JLabel("Hello");
	public ex10_5()
	{
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseAdapter());
		
		
		c.setLayout(null);
		la.setSize(50,20);	//라벨사이즈 50 20
		la.setLocation(30,30); //라벨위치 30 30
		c.add(la);
		
		setSize(250,250);	//프레임사이즈 250 250
		setVisible(true);	//활성화
	}
	class MyMouseAdapter extends MouseAdapter	//어댑터클래스
	{
		public void mousePressed(MouseEvent e)
		{
			int x= e.getX();		//getx
			int y = e.getY();		//gety
			la.setLocation(x, y);	//위치이동
		}
	}

	public static void main(String[] args)
	{
		new ex10_5();
	}
}
