/* 18114323이정범
 * chap10 실습10 더블클릭시 백그라운드 랜덤값
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_10 extends JFrame {
	public ex10_10() {
		setTitle("Click and DoubleClick 예제");	//타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		setSize(300,200);	//프레임 300x200
		setVisible(true);	//활성화
	}
	class MyMouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(e.getClickCount() == 2) { //더블클릭
			int r = (int)(Math.random()*256); //랜덤색
			int g = (int)(Math.random()*256); //랜덤색
			int b = (int)(Math.random()*256);// 랜덤색
			Component c = (Component)e.getSource();
			c.setBackground(new Color(r,b,g));	//랜덤rgb받은거
			}
		}
	}
	public static void main(String[] args)
	{
		new ex10_10();
	}
}
