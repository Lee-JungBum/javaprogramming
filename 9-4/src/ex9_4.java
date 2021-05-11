/* 18114323이정범
 * chap9 실습4 boderlayout
 */
import javax.swing.*;
import java.awt.*;

public class ex9_4 extends JFrame {
	public ex9_4()
	{
		setTitle("BorderLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.setLayout(new BorderLayout(30, 40));	//30 40간격
		c.add(new JButton("add"), BorderLayout.NORTH);	//북
		c.add(new JButton("sub"), BorderLayout.SOUTH);	//남
		c.add(new JButton("mul"), BorderLayout.EAST);	//동
		c.add(new JButton("div"), BorderLayout.WEST);	//서
		c.add(new JButton("Calculate"), BorderLayout.CENTER);		//센터
		
		setSize(300,200);	//프레임300x200
		setVisible(true);	//활성화
	}
	public static void main(String[] args)
	{
		new ex9_4();
	}
}
