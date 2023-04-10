import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class Prac9B extends Frame implements
		ActionListener {
	TextField t1, t2;
	Button b1, b2;
	Label l1, l2, l3, l4;
	String msg = "", str = "";

	public Prac9B() {
		l1 = new Label("Enter String1 ", Label.LEFT);
		l2 = new Label("Enter String2 ", Label.LEFT);
		l3 = new Label("Result ", Label.RIGHT);
		l4 = new Label("", Label.RIGHT);
		b1 = new Button("Reverse");
		b2 = new Button("Concatenate");
		t1 = new TextField(20);
		t2 = new TextField(20);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(b2);
		add(l4);

		b1.addActionListener(this);
		b2.addActionListener(this);
		setLayout(new FlowLayout());
		setTitle("String Methos");
		setVisible(true);
		setSize(150, 400);
	}

	public void actionPerformed(ActionEvent ae) {
		str = t1.getText();

		if (ae.getSource().equals(b1)) {
			int i;
			int l = str.length();
			for (i = l - 1; i >= 0; i--) {
				msg = msg + str.charAt(i);
			}
			l4.setText(msg);
		}
		if (ae.getSource().equals(b2)) {
			String str2 = t2.getText();
			String str3 = str + " " + str2;
			l4.setText(str3);
		}
	}

	public static void main(String arg[]) {
		new Prac9B();
	}
}