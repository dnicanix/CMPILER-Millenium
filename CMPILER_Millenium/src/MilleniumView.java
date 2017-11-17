



<<<<<<< HEAD




import java.awt.EventQueue;

=======
>>>>>>> origin/master
import javax.swing.JFrame;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;

import org.fife.ui.autocomplete.AutoCompletion;
import org.fife.ui.autocomplete.BasicCompletion;
import org.fife.ui.autocomplete.CompletionProvider;
import org.fife.ui.autocomplete.DefaultCompletionProvider;
import org.fife.ui.rsyntaxtextarea.AbstractTokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.TokenMakerFactory;
import org.fife.ui.rsyntaxtextarea.folding.CurlyFoldParser;
import org.fife.ui.rsyntaxtextarea.parser.Parser;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.JTextArea;

import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

import utils.CustomOutputStream;
import utils.TextLineNumber;

import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.InputStream;
import java.io.PrintStream;



public class MilleniumView implements ActionListener{

	private JFrame frame;
	private JButton btnRun, btnPause, btnStop, btnSave, btnLoad;
	//private JTextPane srcCodeTextArea;
	private JPanel contentPane = new JPanel(new BorderLayout());
	private RSyntaxTextArea srcCodeTextArea;
	private JScrollPane srcCodeScrollPane, 
						errorScrollPane, consoleScrollPane;
	private JTabbedPane tabbedPane;
	private JTable errorTable;
	private JTextArea consoleTextArea;
	private JComboBox<String> modeComboBox;
	private int widthCodeScrollPane, heightCodeScrollPane, 
				widthConsoleScrollPane, heightConsoleScrollPane,
				yTabbedPane, widthTabbedPane, heightTabbedPane;
	private ListSelectionModel consoleModel;
	private TableModel model;
	//private TextLineNumber tln;
	private PrintStream printStream;
<<<<<<< HEAD
	private InputStream inputStream;
=======
	private JPanel packageExplorerPanel, debugPanel;
>>>>>>> origin/master
	
	private String[] columnHeaders = {"Syntax Error", "Line Number", "Description"};
	

	private MilleniumController milleniumController;
	
	final StyleContext cont = StyleContext.getDefaultStyleContext();
    final AttributeSet attrRed = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(178, 0, 0));
    final AttributeSet attrBlue = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(25, 140, 255));
    final AttributeSet attrGreen = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, new Color(0, 76, 0));
    final AttributeSet attrBlack = cont.addAttribute(cont.getEmptySet(), StyleConstants.Foreground, Color.BLACK);
//    DefaultStyledDocument doc = new DefaultStyledDocument() {
//        public void insertString (int offset, String str, AttributeSet a) throws BadLocationException {
//            super.insertString(offset, str, a);
//
//            String text = getText(0, getLength());
//            int before = findLastNonWordChar(text, offset);
//            if (before < 0) before = 0;
//            int after = findFirstNonWordChar(text, offset + str.length());
//            int wordL = before;
//            int wordR = before;
//
//            while (wordR <= after) {
//                if (wordR == after || String.valueOf(text.charAt(wordR)).matches("\\W")) {
//                    if (text.substring(wordL, wordR).matches("(\\W)*(digitz|weh|lutang|Msg|single|walangibabalik)"))
//                        setCharacterAttributes(wordL, wordR - wordL, attrRed, false);
//                    else if (text.substring(wordL, wordR).matches("(\\W)*(priority|optionlang|nochoice|willingtowait|hanggatkeri|gora)"))
//                        setCharacterAttributes(wordL, wordR - wordL, attrBlue, false);
//                    else if (text.substring(wordL, wordR).matches("(\\W)*(#|consistent|shoutout|LEZGO|uwina|walangibabalik|yas|deins|post|gimmeinput)"))
//                        setCharacterAttributes(wordL, wordR - wordL, attrGreen, false);
//                    else
//                        setCharacterAttributes(wordL, wordR - wordL, attrBlack, false);
//                    wordL = wordR;
//                }
//                wordR++;
//            }
//        }
//
//        public void remove (int offs, int len) throws BadLocationException {
//            super.remove(offs, len);
//
//            String text = getText(0, getLength());
//            int before = findLastNonWordChar(text, offs);
//            if (before < 0) before = 0;
//            int after = findFirstNonWordChar(text, offs);
//
//            if (text.substring(before, after).matches("(\\W)*(digitz|weh|lutang|Msg|single|walangibabalik)")) {
//                setCharacterAttributes(before, after - before, attrRed, false);
//            } else if (text.substring(before, after).matches("(\\W)*(priority|optionlang|nochoice|willingtowait|hanggatkeri|gora)")){
//            	setCharacterAttributes(before, after - before, attrBlue, false);
//            } else if (text.substring(before, after).matches("(\\W)*(#|consistent|shoutout|LEZGO|uwina|walangibabalik|yas|deins|post|gimmeinput)")){
//            	setCharacterAttributes(before, after - before, attrBlue, false);
//            }
//            else {
//                setCharacterAttributes(before, after - before, attrBlack, false);
//            }
//        }
//    };
	
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
		widthCodeScrollPane = (int)DimMax.getWidth() - 850;
		heightCodeScrollPane = (int)DimMax.getHeight() - 475;
		widthConsoleScrollPane = (int)DimMax.getWidth() - 850;
		heightConsoleScrollPane = (int)DimMax.getHeight() - 475;
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
		
		modeComboBox = new JComboBox<String>();
		modeComboBox.setFont(new Font("Tahoma", Font.BOLD, 15));
		modeComboBox.addItem("Run");
		modeComboBox.addItem("Debug");
		modeComboBox.setBounds(830, 30, 90, 30);
		modeComboBox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(modeComboBox.getSelectedItem().equals("Run")) {
					btnPause.setEnabled(false);
					btnStop.setEnabled(false);
				} else if(modeComboBox.getSelectedItem().equals("Debug")) {
					btnPause.setEnabled(true);
					btnStop.setEnabled(true);
				}
			}
		});
		
		ImageIcon imgRun = new ImageIcon("res/play-button.png");
		btnRun = new JButton(imgRun);
		btnRun.setBounds(930, 30, 30, 30);
		btnRun.setBackground(SystemColor.control);
		btnRun.addActionListener(this);
		
		ImageIcon imgPause = new ImageIcon("res/music-player-pause-lines.png");
		btnPause = new JButton(imgPause);
		btnPause.setBounds(965, 30, 30, 30);
		btnPause.setEnabled(false);
		btnPause.setBackground(SystemColor.control);
		
		ImageIcon imgStop = new ImageIcon("res/stop.png");
		btnStop = new JButton(imgStop);
		btnStop.setBounds(1000, 30, 30, 30);
		btnStop.setEnabled(false);
		btnStop.setBackground(SystemColor.control);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(50, 40, 80, 30);
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setForeground(Color.BLACK);
		btnSave.setBackground(SystemColor.control);
		
		btnLoad = new JButton("Load");
		btnLoad.setBounds(140, 40, 80, 30);
		btnLoad.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLoad.setForeground(Color.BLACK);
		btnLoad.setBackground(SystemColor.control);
		
		//Editor
		srcCodeTextArea = new RSyntaxTextArea(widthCodeScrollPane, heightCodeScrollPane);
		
		AbstractTokenMakerFactory atmf = (AbstractTokenMakerFactory)TokenMakerFactory.getDefaultInstance();
		atmf.putMapping("text/myLanguage", "utils.SyntaxHighlightManager");		
		srcCodeTextArea.setSyntaxEditingStyle("text/myLanguage"); 
		srcCodeTextArea.setAutoIndentEnabled(true);
		srcCodeTextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
		contentPane.setBounds(425, 100, widthCodeScrollPane, heightCodeScrollPane);
		contentPane.add(new RTextScrollPane (srcCodeTextArea));
		
		CompletionProvider provider = createCompletionProvider();
		AutoCompletion ac = new AutoCompletion(provider);
		ac.install(srcCodeTextArea);
		
		/*New layout for package explorer and code outline*/
		packageExplorerPanel = new JPanel();
		packageExplorerPanel.setBackground(SystemColor.control);
		packageExplorerPanel.setBounds(50, 100, 360, heightCodeScrollPane);
		packageExplorerPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
		
		debugPanel = new JPanel();
		debugPanel.setBackground(SystemColor.control);
		debugPanel.setBounds(1510, 100, 360, heightCodeScrollPane);
		debugPanel.setBorder(BorderFactory.createLineBorder(Color.gray));
		
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
		
		model = new DefaultTableModel(null, columnHeaders)
		  {
		    public boolean isCellEditable(int row, int column)
		    {
		      return false;//This causes all cells to be not editable
		    }
		  };
		
		errorTable = new JTable(model);
		errorTable.setFont(new Font("Tahoma", Font.PLAIN, 15));
		errorTable.getTableHeader().setFont(new Font("Tahoma", Font.BOLD, 15));
		errorTable.setRowSelectionAllowed(true);
		errorTable.getTableHeader().setReorderingAllowed(false);
		errorTable.setVisible(true);
		errorTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		errorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		TableColumnModel columnModel = errorTable.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(150);
		columnModel.getColumn(1).setPreferredWidth(100);
		columnModel.getColumn(2).setPreferredWidth(1000);
		
		errorScrollPane = new JScrollPane(errorTable);
		errorScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		errorScrollPane.setBounds(50, 100, 1250, 400);
		tabbedPane.addTab("Errors", null, errorScrollPane);
		
		consoleModel = errorTable.getSelectionModel();
		consoleModel.addListSelectionListener(new ListSelectionListener(){

			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				if(e.getValueIsAdjusting()){
					return;
				}
				consoleModel = (ListSelectionModel)e.getSource();
				
				if(!consoleModel.isSelectionEmpty()){
					int selectedRow = consoleModel.getMinSelectionIndex();
					String errorLine = (String) model.getValueAt(selectedRow, 1);
				}
			}
			
		});
		
		/*Temporary table for displaying symbol table or variables*/
		debugPanel.setLayout(new BorderLayout());
		
		String debugColumnNames[]= {"Column 1","Column 2"};
		TableModel debugTableModel=new DefaultTableModel(debugColumnNames,2){
		    public boolean isCellEditable(int row, int column)
		    {
		      return false;//This causes all cells to be not editable
		    }
		  };

        JTable debugTable = new JTable(debugTableModel);
        JScrollPane debugTableContainer = new JScrollPane(debugTable);
        debugPanel.add(debugTableContainer, BorderLayout.CENTER);
		
		frame.getContentPane().add(contentPane);
		frame.getContentPane().add(modeComboBox);
		frame.getContentPane().add(btnRun);
		frame.getContentPane().add(btnSave);
		frame.getContentPane().add(btnPause);
		frame.getContentPane().add(btnStop);
		frame.getContentPane().add(btnLoad);
		frame.getContentPane().add(tabbedPane);
		frame.getContentPane().add(packageExplorerPanel);
		frame.getContentPane().add(debugPanel);
		
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
<<<<<<< HEAD
		if(e.getSource() == btnScan){
			
=======
		if(e.getSource() == btnRun){
>>>>>>> origin/master
			consoleTextArea.setText("");
			
			model = new DefaultTableModel(null, columnHeaders)
			  {
			    public boolean isCellEditable(int row, int column)
			    {
			      return false;//This causes all cells to be not editable
			    }
			  };
			
			
			errorTable.setModel(model);
			String tokens = milleniumController.getLexerTokens(srcCodeTextArea.getText());
			srcCodeTextArea.removeAllLineHighlights();
			milleniumController.parse();
			
		}
	}
	
	public void highlightError(int line){
		try {
			srcCodeTextArea.addLineHighlight(line-1, new Color(255, 178, 174));
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		tln.addLineError(line);
//		tln.repaint();
	}
	
	
	public void addErrorMessages(String errorType, String errorLine, String errorMsg){
		((DefaultTableModel) model).addRow(new Object[] {errorType, errorLine, errorMsg});
		highlightError(Integer.parseInt(errorLine.split(":")[0]));
	}
<<<<<<< HEAD
	
	public void addSemanticErrorMessages(String errorType, String errorLine, String errorMsg){
		((DefaultTableModel) model).addRow(new Object[] {errorType, errorLine, errorMsg});
		highlightError(Integer.parseInt(errorLine));
	}
	
=======

	private CompletionProvider createCompletionProvider() {
		DefaultCompletionProvider provider = new DefaultCompletionProvider();
		
		provider.addCompletion(new BasicCompletion(provider, "walangibabalik"));
		provider.addCompletion(new BasicCompletion(provider, "LEZGO"));
		provider.addCompletion(new BasicCompletion(provider, "willingtowait"));
		provider.addCompletion(new BasicCompletion(provider, "priority"));
		provider.addCompletion(new BasicCompletion(provider, "digitz"));
		provider.addCompletion(new BasicCompletion(provider, "lutang"));
		
		return provider;
	}
>>>>>>> origin/master
	
}