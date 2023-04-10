import java.awt.*;
import java.awt.event.*;
import java.applet.*;

/*<applet code="Prac9A.java" width="500" height="400">
</applet>*/
public class Prac9A extends Applet implements
		ActionListener {
	TextField t1;
	Button b1;
	Label l1, l2, l3;
	int num, i, fact = 1;
	String msg, s1;

	public void init() {
		l1 = new Label("Enter 1 number ");
		t1 = new TextField(4);
		b1 = new Button("Calculate");
		l2 = new Label("Result ");
		l3 = new Label();
		add(l1);
		add(t1);
		add(b1);
		add(l2);
		add(l3);
		b1.addActionListener(this);
	}

	public void actionPerformed(ActionEvent ae) {
		msg = t1.getText();
		try {
			if (msg != "") {
				num = Integer.parseInt(msg);
				for (i = num; i > 0; i--) {
					fact = fact * i;
				}
				s1 = "" + fact;
				l3.setText(s1);
			}
		} catch (Exception e) {
			l3.setText("Enter number first");
		}
		fact = 1;
		num = 0;
	}
}
