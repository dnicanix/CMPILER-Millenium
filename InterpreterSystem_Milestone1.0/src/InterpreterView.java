import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import java.awt.SystemColor;

public class InterpreterView {

	private JFrame frame;
	private JButton btnScan;
	private JTextArea srcCodeTextArea;
	private JScrollPane srcCodeScrollPane;
	private JTabbedPane tabbedPane;
	private JTextArea consoleTextArea, listOfTokensTextArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterpreterView window = new InterpreterView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterpreterView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Millenium Interpreter System");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 2500, 1500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnScan = new JButton("Scan");
		btnScan.setBounds(49, 42, 245, 78);
		btnScan.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnScan.setForeground(Color.BLACK);
		btnScan.setBackground(SystemColor.control);
		
		//Editor
		srcCodeTextArea = new JTextArea();
		srcCodeTextArea.setFont(new Font("Monospaced", Font.PLAIN, 40));
		srcCodeTextArea.setLineWrap(true);
		
		srcCodeScrollPane = new JScrollPane(srcCodeTextArea);
		srcCodeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		srcCodeScrollPane.setBounds(49, 167, 2376, 702);
		
		TextLineNumber tln = new TextLineNumber(srcCodeTextArea);
		srcCodeScrollPane.setRowHeaderView(tln);
		
		//Contains console and list of tokens text areas
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setBounds(49, 922, 2376, 467);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD,30));
		
		//For syntax and semantic errors
		consoleTextArea = new JTextArea();
		consoleTextArea.setEditable(false);
		consoleTextArea.setLineWrap(true);
		consoleTextArea.setBackground(SystemColor.control);
		consoleTextArea.setFont(new Font("Tahoma", Font.PLAIN, 35));
		tabbedPane.addTab("Console", null, consoleTextArea);
		
		//For output of lexical analyzer (list of tokens)
		listOfTokensTextArea = new JTextArea();
		listOfTokensTextArea.setEditable(false);
		listOfTokensTextArea.setBackground(SystemColor.control);
		listOfTokensTextArea.setFont(new Font("Tahoma", Font.PLAIN, 35));
		listOfTokensTextArea.setText("int : identifier\ni : variable\n= : operator\n0 : value");
		tabbedPane.addTab("List of Tokens", null, listOfTokensTextArea);
		
		frame.getContentPane().add(srcCodeScrollPane);
		frame.getContentPane().add(btnScan);
		frame.getContentPane().add(tabbedPane);
		frame.setVisible(true);
	}
}
