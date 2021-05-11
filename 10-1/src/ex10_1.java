/* 18114323이정범
 * chap10 실습1 액션시 글자바꾸기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_1 extends JFrame {
	public ex10_1()
	{
		setTitle("Action 이벤트 리스너 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");	//액션버튼생성
		btn.addActionListener(new MyActionListener());	//액션리스너
		c.add(btn);
		
			setSize(300,200);	//프레임 300x200
		setVisible(true);	//활성화
	}
	public static void main(String[] args)
	{
		new ex10_1();
	}
}
class MyActionListener implements ActionListener
{
	public void actionPerformed(ActionEvent e)//동작이잇을시
	{
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) //버튼이 액션일때
			b.setText("액션");	//출력
		else		//아닐때
			b.setText("Action");	//출력
				
	}
}