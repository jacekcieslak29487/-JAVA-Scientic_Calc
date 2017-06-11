package freedCalc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.Box;
import javax.swing.JTextPane;
import java.awt.SystemColor;



public class freedCalc {

	private boolean przecinek;
	private JFrame frmFreedcalc;
	private JTextField txtwyswietlacz;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					freedCalc window = new freedCalc();
					window.frmFreedcalc.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public freedCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFreedcalc = new JFrame();
		frmFreedcalc.setBackground(new Color(255, 255, 225));
		frmFreedcalc.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 11));
		frmFreedcalc.setForeground(SystemColor.info);
		frmFreedcalc.setFont(new Font("Arial", Font.BOLD, 14));
		frmFreedcalc.setResizable(false);
		frmFreedcalc.setTitle("JacekCieslakCalc");
		frmFreedcalc.setBounds(100, 100, 305, 421);
		frmFreedcalc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFreedcalc.getContentPane().setLayout(null);
		
		txtwyswietlacz = new JTextField();
		txtwyswietlacz.setBounds(10, 11, 277, 40);
		txtwyswietlacz.setHorizontalAlignment(SwingConstants.RIGHT);
		txtwyswietlacz.setForeground(Color.WHITE);
		txtwyswietlacz.setFont(new Font("Nirmala UI", Font.PLAIN, 22));
		txtwyswietlacz.setBackground(Color.BLACK);
		frmFreedcalc.getContentPane().add(txtwyswietlacz);
		txtwyswietlacz.setColumns(10);
		
		
		JButton btnC = new JButton("C");
		btnC.setToolTipText("wyczy\u015B\u0107 ekran");
		btnC.setBounds(245, 62, 45, 45);
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(btnC);
		btnC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtwyswietlacz.setText(null);
			}
		});
		
		JButton button_1 = new JButton("1");
		button_1.setBounds(10, 168, 45, 45);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_1.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_2 = new JButton("2");
		button_2.setBounds(62, 168, 45, 45);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_2.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_3 = new JButton("3");
		button_3.setBounds(114, 168, 45, 45);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_3.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_4 = new JButton("4");
		button_4.setBounds(10, 115, 45, 45);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_4.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_5 = new JButton("5");
		button_5.setBounds(62, 115, 45, 45);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_5.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_6 = new JButton("6");
		button_6.setBounds(114, 115, 45, 45);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_6.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_7 = new JButton("7");
		button_7.setBounds(10, 62, 45, 45);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_7.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_8 = new JButton("8");
		button_8.setBounds(62, 62, 45, 45);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_8.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_9 = new JButton("9");
		button_9.setBounds(114, 62, 45, 45);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_9.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button = new JButton("0");
		button.setBounds(62, 221, 45, 45);
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_10 = new JButton(".");
		button_10.setToolTipText("przecinek (liczba dziesi\u0119tna)");
		button_10.setBounds(114, 221, 45, 45);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!przecinek){
				String WpiszWartosc = txtwyswietlacz.getText() + button_10.getText();
				txtwyswietlacz.setText(WpiszWartosc);
				przecinek = true;
				}				
			}
		});
		
		JButton button_11 = new JButton("±");
		button_11.setToolTipText("minus");
		button_11.setBounds(10, 221, 45, 45);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 14));
		frmFreedcalc.getContentPane().add(button_11);
		button_11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				double x = Double.valueOf(txtwyswietlacz.getText());
				double plusminus;
				plusminus = x*(-1); 
				txtwyswietlacz.setText(String.valueOf(plusminus));
			}
		});
		
			
		
		JButton button_12 = new JButton("/");
		button_12.setToolTipText("dzielenie");
		button_12.setBounds(192, 62, 45, 45);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_12.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton btnX = new JButton("X");
		btnX.setToolTipText("mnozenie");
		btnX.setBounds(192, 115, 45, 45);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 15));
		frmFreedcalc.getContentPane().add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + "*";
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_14 = new JButton("-");
		button_14.setToolTipText("odejmowanie");
		button_14.setBounds(192, 168, 45, 45);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmFreedcalc.getContentPane().add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText() + button_14.getText();
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton button_15 = new JButton("+");
		button_15.setToolTipText("dodawanie");
		button_15.setBounds(192, 221, 45, 45);
		button_15.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmFreedcalc.getContentPane().add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtwyswietlacz.setText(txtwyswietlacz.getText() + "+");
				
			}
		});
		
		JButton button_13 = new JButton("<");
		button_13.setToolTipText("cofnij");
		button_13.setBounds(245, 115, 45, 45);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmFreedcalc.getContentPane().add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String cofnij=null;
				if(txtwyswietlacz.getText().length()>0){
					StringBuilder strB = new StringBuilder(txtwyswietlacz.getText());
					strB.deleteCharAt(txtwyswietlacz.getText().length()-1);
					cofnij=strB.toString();
					txtwyswietlacz.setText(cofnij);
				}
			}
		});
		
		JButton button_16 = new JButton("=");
		button_16.setToolTipText("wynik");
		button_16.setBounds(245, 168, 45, 98);
		button_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		frmFreedcalc.getContentPane().add(button_16);
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ScriptEngineManager MGR = new ScriptEngineManager();
				ScriptEngine engine = MGR.getEngineByName("JavaScript");
				
				try{
					txtwyswietlacz.setText(engine.eval(txtwyswietlacz.getText()).toString());
				}
				catch(ScriptException b){
					System.out.println("Error:" + b);
				}
			}
		});
		
		JButton btnPi = new JButton("\u03C0");
		btnPi.setToolTipText("liczba Pi (3,14159)");
		btnPi.setBounds(240, 286, 48, 42);
		btnPi.setFont(new Font("Tahoma", Font.BOLD, 17));
		frmFreedcalc.getContentPane().add(btnPi);
		btnPi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtwyswietlacz.setText(txtwyswietlacz.getText()+"3.14159");
			}
		});
		
		
		JButton btnCtg = new JButton("n!");
		btnCtg.setToolTipText("silnia");
		btnCtg.setBounds(187, 286, 48, 42);
		btnCtg.setFont(new Font("Tahoma", Font.BOLD, 13));
		frmFreedcalc.getContentPane().add(btnCtg);
		btnCtg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				double n = Double.valueOf(txtwyswietlacz.getText());
				int i;
				double silnia=1;
				for(i=1;i<n;i++){
					silnia=silnia*(i+1);
				}
			txtwyswietlacz.setText(String.valueOf(silnia));	
					
			}
		});
		
		JButton button_18 = new JButton("(");
		button_18.setToolTipText("otw\u00F3rz nawias");
		button_18.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_18.setBounds(80, 338, 48, 42);
		frmFreedcalc.getContentPane().add(button_18);
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText()+"(";
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton btnM = new JButton("\u221a");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double liczba = Double.valueOf(txtwyswietlacz.getText());
				double pierw = Math.sqrt (liczba);
				txtwyswietlacz.setText(String.valueOf(pierw));
			}
		});
		btnM.setToolTipText("pierwiastek");
		btnM.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnM.setBounds(240, 338, 48, 42);
		frmFreedcalc.getContentPane().add(btnM);
		
		
		JButton btnLog_1 = new JButton("log");
		btnLog_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double lo;
				double t = Double.valueOf(txtwyswietlacz.getText());
				lo = Math.log10(t);
				txtwyswietlacz.setText(String.valueOf(lo));
			}
		});
		btnLog_1.setToolTipText("logarytm o podstawie 10");
		btnLog_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnLog_1.setBounds(187, 338, 48, 42);
		frmFreedcalc.getContentPane().add(btnLog_1);
		
		JButton button_21 = new JButton(")");
		button_21.setToolTipText("zamknij nawias");
		button_21.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_21.setBounds(132, 338, 48, 42);
		frmFreedcalc.getContentPane().add(button_21);
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String WpiszWartosc = txtwyswietlacz.getText()+")";
				txtwyswietlacz.setText(WpiszWartosc);
			}
		});
		
		JButton btnpow = new JButton("x\u00B2");
		btnpow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			double y = Double.valueOf(txtwyswietlacz.getText());
			int pot = 2;
			double kwadrat = Math.pow(y, pot);
			txtwyswietlacz.setText(String.valueOf(kwadrat));
			}
		});
		btnpow.setToolTipText("podnie\u015B do kwadratu");
		btnpow.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnpow.setBounds(80, 286, 48, 42);
		frmFreedcalc.getContentPane().add(btnpow);
		
		JButton btnX_1 = new JButton("xn");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double l = Double.valueOf(txtwyswietlacz.getText());
				String p;
				p = JOptionPane.showInputDialog("Podaj potêgê:");;
				double pp = Double.valueOf(p);
				double poteguj = Math.pow(l, pp);
				txtwyswietlacz.setText(String.valueOf(poteguj));
			}
		});
		btnX_1.setToolTipText("potêgowanie");
		btnX_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnX_1.setBounds(132, 286, 48, 42);
		frmFreedcalc.getContentPane().add(btnX_1);
		
		
	}
}
