/* 18114323이정범
 * chap10 실습2 타이틀바꾸기
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ex10_2 extends JFrame {
	public ex10_2()
	{
		setTitle("Action 이벤트 리스너 예제");	//타이틀
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//종료
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");		//액션버튼생성
		btn.addActionListener(new MyActionListener());
		c.add(btn);
		
			setSize(300,200);	//프레임 300x200
		setVisible(true);		//활성화
	}
	class MyActionListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			JButton b = (JButton)e.getSource();		//입력시
			if(b.getText().equals("Action"))		//글자가 액션일시
				b.setText("액션");					//액션
			else							//아니면
				b.setText("Action");		//action
		ex10_2.this.setTitle(b.getText()); // 타이틀 바꾸기 
		}
	}
	public static void main(String[] args)
	{
		new ex10_2();
	}
}
