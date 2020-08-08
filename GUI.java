import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;

public class GUI implements ActionListener
{
	Font textFont;
	
	static JMenuBar texts = new JMenuBar(); 
	static JMenu font = new JMenu("Font"); 
	static JMenu fontSize = new JMenu("Font Size"); 
	static JMenu textColor = new JMenu("Text Color"); 
	static JMenu background = new JMenu("Background Color"); 
	static JMenu borderColor = new JMenu("Border Color"); 
	
	static JRadioButtonMenuItem Times, Ariel, Georgia;
	static JRadioButtonMenuItem font18, font24, font40;
	static JRadioButtonMenuItem blueText, redText, randomColorText;
	static JRadioButtonMenuItem blueBackground, redBackground, randomColorBackground;
	static JRadioButtonMenuItem blueBorder, redBorder, randomColorBorder;
	static ButtonGroup fontGroup, fontSizeGroup, textColorGroup, backgroundGroup, borderColorGroup;
	static JFrame frame = new JFrame("GUI"); 
	static JPanel gridPanel = new JPanel();
	static JTextArea textArea = new JTextArea();
	
	static JButton buttonNorth = new JButton();
	static JButton buttonEast = new JButton();
	static JButton buttonWest = new JButton();
	static JButton buttonSouth = new JButton();
	
	public GUI()
	{
		 
		 addMenuItems();
		 menu();
		 frame.setLayout(new BorderLayout());
	     frame.add(texts,BorderLayout.NORTH);
	     texts.setAlignmentX(3f);
	        
	     frame.add(gridPanel,BorderLayout.CENTER);
	     
	     frame.setSize(1000,800);
	     
	     textArea.setColumns(7);
	     textArea.setRows(7);
	     Font f = textArea.getFont();
	     float size = f.getSize() + 5.0f;
	     textArea.setFont( f.deriveFont(size) );
	     frame.add(textArea);
	     
	     frame.setVisible(true);  	
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void addMenuItems() {
		texts.add(buttonNorth);
		 texts.add(buttonEast);
		 texts.add(buttonSouth);
		 texts.add(buttonWest);
		 texts.add(font);
		 texts.add(fontSize);
		 texts.add(textColor);
		 texts.add(background);
		 texts.add(borderColor);
	}
	
	 public void menu() 
	 {
		 	Times = new JRadioButtonMenuItem("Times New Roman"); 
		 	Ariel = new JRadioButtonMenuItem("Ariel "); 
		 	Georgia = new JRadioButtonMenuItem("Georgia"); 
		 	
		 	font18 = new JRadioButtonMenuItem("18"); 
		 	font24 = new JRadioButtonMenuItem("24"); 
		 	font40 = new JRadioButtonMenuItem("40"); 
		 	
		 	blueText = new JRadioButtonMenuItem("Blue"); 
		 	redText = new JRadioButtonMenuItem("Red"); 
		 	randomColorText = new JRadioButtonMenuItem("Random Color"); 
		 	
		 	blueBackground = new JRadioButtonMenuItem("Blue"); 
		 	redBackground = new JRadioButtonMenuItem("Red"); 
		 	randomColorBackground = new JRadioButtonMenuItem("Random Color"); 
		 	
		 	blueBorder = new JRadioButtonMenuItem("Blue"); 
		 	redBorder = new JRadioButtonMenuItem("Red"); 
		 	randomColorBorder = new JRadioButtonMenuItem("Random Color"); 
		 	
		 	fontGroup = new ButtonGroup();
		 	textColorGroup = new ButtonGroup();
		 	backgroundGroup = new ButtonGroup();
		 	borderColorGroup = new ButtonGroup();
		 	fontSizeGroup = new ButtonGroup();
		 	
		 	Times.addActionListener(this);
		 	Ariel.addActionListener(this);
		 	Georgia.addActionListener(this);
		 	
		 	font18.addActionListener(this);
		 	font24.addActionListener(this);
		 	font40.addActionListener(this);
		 	
		 	blueText.addActionListener(this);
		 	redText.addActionListener(this);
		 	randomColorText.addActionListener(this);
		 	
		 	blueBackground.addActionListener(this);
		 	redBackground.addActionListener(this);
		 	randomColorBackground.addActionListener(this);
		 	
		 	backgroundGroup.add(blueBackground);
		 	backgroundGroup.add(redBackground);
		 	backgroundGroup.add(randomColorBackground);
		 	
		 	blueBorder.addActionListener(this);
		 	redBorder.addActionListener(this);
		 	randomColorBorder.addActionListener(this);
		 	
		 	buttonEast.addActionListener(this);
		 	buttonNorth.addActionListener(this);
		 	buttonWest.addActionListener(this);
		 	buttonSouth.addActionListener(this);
		 	
		 	font.add(Times);
		 	font.add(Ariel);
		 	font.add(Georgia);
		 	
		 	fontGroup.add(Times);
		 	fontGroup.add(Ariel);
		 	fontGroup.add(Georgia);
		 	
		 	fontSize.add(font18);
		 	fontSize.add(font24);
		 	fontSize.add(font40);
		 	
		 	fontSizeGroup.add(font18);
		 	fontSizeGroup.add(font24);
		 	fontSizeGroup.add(font40);
		 	
		 	textColor.add(blueText);
		 	textColor.add(redText);
		 	textColor.add(randomColorText);
		 	
		 	textColorGroup.add(blueText);
		 	textColorGroup.add(redText);
		 	textColorGroup.add(randomColorText);
		 	
		 	background.add(blueBackground);
		 	background.add(redBackground);
		 	background.add(randomColorBackground);
		 	
		 	borderColor.add(blueBorder);
		 	borderColor.add(redBorder);
		 	borderColor.add(randomColorBorder);
		 	
		 	borderColorGroup.add(blueBorder);
		 	borderColorGroup.add(redBorder);
		 	borderColorGroup.add(randomColorBorder);
		 	
		 	//buttons:
		 	buttonNorth.setText("North");
		 	buttonSouth.setText("South");
		 	buttonWest.setText("West");
		 	buttonEast.setText("East");
		 	buttonEast.setActionCommand("East");
		 	buttonNorth.setActionCommand("North");
		 	buttonSouth.setActionCommand("South");
		 	buttonWest.setActionCommand("West");
		  
	 } 
	  public static void main(String[] args) 
	  { 
	    	GUI app=new GUI();
	  }
	  
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		// if each button is selected - what do i do:
		
		if(Times.isSelected())
		{
			textFont = new Font("Times New Roman", Font.PLAIN, textArea.getFont().getSize());
	        textArea.setFont(textFont);
		}
		if(Ariel.isSelected())
		{
			textFont = new Font("Arial", Font.PLAIN, textArea.getFont().getSize());
	        textArea.setFont(textFont);
		}
		if(Georgia.isSelected())
		{
			textFont = new Font("Georgia", Font.PLAIN, textArea.getFont().getSize());
	        textArea.setFont(textFont);
		}
		
		if(blueText.isSelected())
		{
			textArea.setForeground(Color.BLUE);
	        //System.out.print("BLUE TEXT WAS SELECTED");
		}
		
		if(redText.isSelected())
		{
			textArea.setForeground(Color.RED);
	        //System.out.print("RED TEXT WAS SELECTED");
		}
		
		if(randomColorText.isSelected())
		{
			int rand = (int)(Math.random()*6)+1;
			//System.out.print("RAND TEXT WAS SELECTED");
			
			if(rand == 1)
			{
				textArea.setForeground(Color.MAGENTA);
				randomColorText.setText("Magenta");
			}
			if(rand == 2)
			{
				textArea.setForeground(Color.GREEN);
				randomColorText.setText("Green");
			}
			if(rand == 3)
			{
				textArea.setForeground(Color.YELLOW);
				randomColorText.setText("Yellow");
			}
			if(rand == 4)
			{
				textArea.setForeground(Color.ORANGE);
				randomColorText.setText("Orange");
			}
			if(rand == 5)
			{
				textArea.setForeground(Color.PINK);
				randomColorText.setText("Pink");
			}
			if(rand == 6)
			{
				textArea.setForeground(Color.GRAY);
				randomColorText.setText("Gray");
			}
			
		}
		
		if(blueBackground.isSelected())
		{
			textArea.setBackground(Color.BLUE);
		}
		if(redBackground.isSelected())
		{
			textArea.setBackground(Color.RED);
		}
		
		if(randomColorBackground.isSelected())
		{
			int rand = (int)(Math.random()*6)+1;
			//System.out.print("RAND TEXT WAS SELECTED");
			
			if(rand == 1)
			{
				textArea.setBackground(Color.MAGENTA);
				randomColorBackground.setText("Magenta");
			}
			if(rand == 2)
			{
				textArea.setBackground(Color.GREEN);
				randomColorBackground.setText("Green");
			}
			if(rand == 3)
			{
				textArea.setBackground(Color.YELLOW);
				randomColorBackground.setText("Yellow");
			}
			if(rand == 4)
			{
				textArea.setBackground(Color.ORANGE);
				randomColorBackground.setText("Orange");
			}
			if(rand == 5)
			{
				textArea.setBackground(Color.PINK);
				randomColorBackground.setText("Pink");
			}
			if(rand == 6)
			{
				textArea.setBackground(Color.GRAY);
				randomColorBackground.setText("Gray");
			}
			
		}
		
		if(font18.isSelected())
		{
			textFont = new Font(textArea.getName(), Font.PLAIN, 18);
	        textArea.setFont(textFont);
		}
		if(font24.isSelected())
		{
			textFont = new Font(textArea.getName(), Font.PLAIN, 24);
	        textArea.setFont(textFont);
		}
		if(font40.isSelected())
		{
			textFont = new Font(textArea.getName(), Font.PLAIN, 40);
	        textArea.setFont(textFont);
		}
		//ygjyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy
		if(blueBorder.isSelected())
		{
			buttonNorth.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			buttonSouth.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			buttonWest.setBorder(BorderFactory.createLineBorder(Color.BLUE));
			buttonEast.setBorder(BorderFactory.createLineBorder(Color.BLUE));
		}
		
		if(redBorder.isSelected())
		{
			buttonNorth.setBorder(BorderFactory.createLineBorder(Color.RED));
			buttonSouth.setBorder(BorderFactory.createLineBorder(Color.RED));
			buttonWest.setBorder(BorderFactory.createLineBorder(Color.RED));
			buttonEast.setBorder(BorderFactory.createLineBorder(Color.RED));
		}
		if(randomColorBorder.isSelected())
		{
			int rand = (int)(Math.random()*6)+1;
			//System.out.print("RAND TEXT WAS SELECTED");
			
			if(rand == 1)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.MAGENTA));
				randomColorBorder.setText("Magenta");
			}
			if(rand == 2)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				randomColorBorder.setText("Green");
			}
			if(rand == 3)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				randomColorBorder.setText("Yellow");
			}
			if(rand == 4)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
				randomColorBorder.setText("Orange");
			}
			if(rand == 5)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.PINK));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.PINK));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.PINK));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.PINK));
				randomColorBorder.setText("Pink");
			}
			if(rand == 6)
			{
				buttonNorth.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				buttonSouth.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				buttonWest.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				buttonEast.setBorder(BorderFactory.createLineBorder(Color.GRAY));
				randomColorBorder.setText("Gray");
			}
			
		}
		
		
		if(arg0.getActionCommand().equals("North"))
		{
			System.out.println("NORTH");
			LayoutManager grid = new GridLayout(1,0);
			//texts = new JMenuBar();
			texts.setLayout(grid);
			//addMenuItems();
			//menu();
			//texts.setAlignmentX(3f);
			frame.add(texts,BorderLayout.NORTH);
			frame.setVisible(true);
		}
		if(arg0.getActionCommand().equals("South"))
		{
			System.out.println("SOUTH");
			LayoutManager grid = new GridLayout(1,0);
			//texts = new JMenuBar();
			texts.setLayout(grid);
			//addMenuItems();
			//menu();
			//texts.setAlignmentX(3f);
			frame.add(texts,BorderLayout.SOUTH);
			frame.setVisible(true);
		}
		if(arg0.getActionCommand().equals("West"))
		{
			System.out.println("WEST");
			LayoutManager grid = new GridLayout(0,1);
			//texts = new JMenuBar();
			texts.setLayout(grid);
			//addMenuItems();
			//menu();
			//texts.setAlignmentX(3f);
			frame.add(texts,BorderLayout.WEST);
			frame.setVisible(true);
		}
		if(arg0.getActionCommand().equals("East"))
		{
			System.out.println("EAST");
			LayoutManager grid = new GridLayout(0,1);
			//texts = new JMenuBar();
			texts.setLayout(grid);
			//addMenuItems();
			//menu();
			frame.add(texts,BorderLayout.EAST);
			frame.setVisible(true);
		}
		
	}	
	 
}
