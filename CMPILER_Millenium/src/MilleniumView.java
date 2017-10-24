



import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SpringLayout;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

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
import java.util.ArrayList;


public class MilleniumView implements ActionListener{

	private JFrame frame;
	private JButton btnScan;
	private JTextPane srcCodeTextArea;
	private JScrollPane srcCodeScrollPane, 
						consoleScrollPane, listOfTokensScrollPane;
	private JTabbedPane tabbedPane;
	private JTextArea consoleTextArea, listOfTokensTextArea;
	private int widthCodeScrollPane, heightCodeScrollPane, 
				widthConsoleScrollPane, heightConsoleScrollPane,
				yTabbedPane, widthTabbedPane, heightTabbedPane;
	TextLineNumber tln;
	PrintStream printStream;
	

	private MilleniumController milleniumController;
	
	final StyleContext cont = StyleContext.getDefaultStyleContext();
    final AttributeSet attrRed = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(178, 0, 0));
    final AttributeSet attrBlue = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(25, 140, 255));
    final AttributeSet attrGreen = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(0, 76, 0));
    final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
    DefaultStyledDocument doc = new DefaultStyledDocument() {
        public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
            super.insertString(offset, str, a);

            String text = getText(0, getLength());
            int before = findLastNonWordChar(text, offset);
            if (before < 0) before = 0;
            int after = findFirstNonWordChar(text, offset + str.length());
            int wordL = before;
            int wordR = before;

            while (wordR <= after) {
                if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
                    if (text.substring(wordL, wordR).matches("(\\W)*(digitz|weh|lutang|Msg|single|walangibabalik)"))
                        setCharacterAttributes(wordL, wordR - wordL, attrRed, false);
                    else if (text.substring(wordL, wordR).matches("(\\W)*(priority|optionlang|nochoice|willingtowait|hanggatkeri|gora)"))
                        setCharacterAttributes(wordL, wordR - wordL, attrBlue, false);
                    else if (text.substring(wordL, wordR).matches("(\\W)*(#|consistent|shoutout|LEZGO|uwina|walangibabalik|yas|deins|post|gimmeinput)"))
                        setCharacterAttributes(wordL, wordR - wordL, attrGreen, false);
                    else
                        setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
                    wordL = wordR;
                }
                wordR++;
            }
        }

        public void remove (int offs, int len) throws BadLocationException {
            super.remove(offs, len);

            String text = getText(0, getLength());
            int before = findLastNonWordChar(text, offs);
            if (before < 0) before = 0;
            int after = findFirstNonWordChar(text, offs);

            if (text.substring(before, after).matches("(\\W)*(digitz|weh|lutang|Msg|single|walangibabalik)")) {
                setCharacterAttributes(before, after - before, attrRed, false);
            } else if (text.substring(before, after).matches("(\\W)*(priority|optionlang|nochoice|willingtowait|hanggatkeri|gora)")){
            	setCharacterAttributes(before, after - before, attrBlue, false);
            } else if (text.substring(before, after).matches("(\\W)*(#|consistent|shoutout|LEZGO|uwina|walangibabalik|yas|deins|post|gimmeinput)")){
            	setCharacterAttributes(before, after - before, attrBlue, false);
            }
            else {
                setCharacterAttributes(before, after - before, attrBlack, false);
            }
        }
    };
	
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
		widthCodeScrollPane = (int)DimMax.getWidth() - 100;
		heightCodeScrollPane = (int)DimMax.getHeight() - 500;
		widthConsoleScrollPane = (int)DimMax.getWidth() - 100;
		heightConsoleScrollPane = (int)DimMax.getHeight() - 500;
		yTabbedPane = (int)DimMax.getHeight() - 350;
		widthTabbedPane = (int)DimMax.getWidth() - 100;
		heightTabbedPane = (int)DimMax.getHeight() - yTabbedPane - 70;
		
		frame = new JFrame();
		frame.setTitle("Millenium Interpreter System");
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.decode("#f9f9ff"));
		//frame.setBounds(100, 100, 1000, 1500);
		frame.setSize((int)DimMax.getWidth(), (int)DimMax.getHeight());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnScan = new JButton("Run");
		btnScan.setBounds(50, 40, 100, 30);
		btnScan.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnScan.setForeground(Color.BLACK);
		btnScan.setBackground(SystemColor.control);
		btnScan.addActionListener(this);
		
		//Editor
		srcCodeTextArea = new JTextPane(doc);
		srcCodeTextArea.setFont(new Font("Monospaced", Font.PLAIN, 15));
		//srcCodeTextArea.setLineWrap(true);
		
		srcCodeScrollPane = new JScrollPane(srcCodeTextArea);
		srcCodeScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		srcCodeScrollPane.setBounds(50, 100, widthCodeScrollPane, heightCodeScrollPane);
		
		tln = new TextLineNumber(srcCodeTextArea);
		srcCodeScrollPane.setRowHeaderView(tln);
		
		//Contains console and list of tokens text areas
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setSelectedIndex(-1);
		tabbedPane.setBounds(50, yTabbedPane, widthTabbedPane, heightTabbedPane);
		tabbedPane.setFont(new Font("Tahoma", Font.BOLD,15));
		
		//For syntax and semantic errors
		consoleTextArea = new JTextArea();
		consoleTextArea.setEditable(false);
		consoleTextArea.setLineWrap(true);
		consoleTextArea.setBackground(SystemColor.control);
		consoleTextArea.setForeground(Color.BLACK);
		consoleTextArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		consoleScrollPane = new JScrollPane(consoleTextArea);
		consoleScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		consoleScrollPane.setBounds(50, 100, 1250, 400);
		tabbedPane.addTab("Console", null, consoleScrollPane);
		
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
	
	private int findLastNonWordChar (String text, int index) {
		while (--index >= 0) {
			if (String.valueOf(text.charAt(index)).matches("\\W")) {
				break;
			}
		}
	        return index;
	}

	private int findFirstNonWordChar (String text, int index) {
		while (index < text.length()) {
			if (String.valueOf(text.charAt(index)).matches("\\W")) {
				break;
	        }
			index++;
		}
		return index;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == btnScan){
			consoleTextArea.setText("");
			String tokens = milleniumController.getLexerTokens(srcCodeTextArea.getText());
			listOfTokensTextArea.setText(tokens);
			tln.resetLineErrors();
			milleniumController.parse();
		}
	}
	
	public void highlightError(int line){
		tln.addLineError(line);
		tln.repaint();
	}
	
	
	
}