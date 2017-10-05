

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import utils.CustomOutputStream;
import utils.TextLineNumber;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;


public class MilleniumView implements ActionListener{

	private JFrame frame;
	private JButton btnScan;
	private JTextArea srcCodeTextArea;
	private JScrollPane srcCodeScrollPane;
	private JScrollPane listOfTokensScrollPane;
	private JTabbedPane tabbedPane;
	private JTextArea consoleTextArea, listOfTokensTextArea;
	
	PrintStream printStream;
	
	private MilleniumController milleniumController;
	/**
	 * Create the application.
	 */
	public MilleniumView(MilleniumController milleniumController) {
		this.milleniumController = milleniumController;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		Dimension DimMax = Toolkit.getDefaultToolkit().getScreenSize();
		frame = new JFrame();
		frame.setTitle("Millenium Interpreter System");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#f9f9ff"));
		//frame.setBounds(100, 100, 1000, 1500);
		frame.setSize((int)DimMax.getWidth(), (int)DimMax.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnScan = new JButton("Scan");
		btnScan.setBounds(50, 40, 100, 30);
		btnScan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnScan.setForeground(Color.BLACK);
		btnScan.setBackground(SystemColor.control);
		btnScan.addActionListener(this);
		
		//Editor
		srcCodeTextArea = new JTextArea();
		srcCodeTextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		srcCodeTextArea.setLineWrap(true);
		
		srcCodeScrollPane = new JScrollPane(srcCodeTextArea);
		srcCodeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		srcCodeScrollPane.setBounds(50, 100, 1250, 400);
		
		TextLineNumber tln = new TextLineNumber(srcCodeTextArea);
		srcCodeScrollPane.setRowHeaderView(tln);
		
		//Contains console and list of tokens text areas
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setBounds(50, 530, 1250, 160);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD,15));
		
		//For syntax and semantic errors
		consoleTextArea = new JTextArea();
		consoleTextArea.setEditable(false);
		consoleTextArea.setLineWrap(true);
		consoleTextArea.setBackground(SystemColor.control);
		consoleTextArea.setForeground(Color.BLACK);
		consoleTextArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		tabbedPane.addTab("Console", null, consoleTextArea);
		
		//For output of lexical analyzer (list of tokens)
		listOfTokensTextArea = new JTextArea();
		listOfTokensTextArea.setEditable(false);
		listOfTokensTextArea.setBackground(SystemColor.control);
		listOfTokensTextArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
			
		listOfTokensScrollPane = new JScrollPane(listOfTokensTextArea);
		listOfTokensScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		listOfTokensScrollPane.setBounds(50, 100, 1250, 400);
		tabbedPane.addTab("List of Tokens", null, listOfTokensScrollPane);
		
		frame.getContentPane().add(srcCodeScrollPane);
		frame.getContentPane().add(btnScan);
		frame.getContentPane().add(tabbedPane);
		
		frame.setVisible(true);
		
		//Other initializations
		printStream = new PrintStream(new CustomOutputStream(consoleTextArea));
		System.setOut(printStream);
		System.setErr(printStream);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnScan){
			consoleTextArea.setText("");
			String tokens = milleniumController.getLexerTokens(srcCodeTextArea.getText());
			listOfTokensTextArea.setText(tokens);
		}
	}
	
	
}