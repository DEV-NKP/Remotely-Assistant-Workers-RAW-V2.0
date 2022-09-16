import raw.label.*;
import raw.combobox.*;
import raw.button.*;
import raw.panel.*;
import raw.mouse.*;
import raw.font.*;
import raw.textbox.*;
import raw.time.*;
import raw.checker.*;
import raw.locate.*;
import raw.email.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.*;
import java.net.*;
import java.io.*; 
import javax.swing.plaf.basic.*;
import javax.swing.plaf.metal.*;
import javax.imageio.ImageIO;
import java.util.regex.*; 
import javax.swing.event.*;
import java.awt.geom.*;
import java.applet.*;
import javax.sound.sampled.*;
import java.util.Timer;
import java.util.TimerTask;
import java.text.DecimalFormat;   
import java.util.Random;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import com.mysql.jdbc.Connection;
public class feedback
{
	
	
/////////////////////////////cursor///////////////////////////////////
Cursor Eresizecursor=new Cursor(Cursor.E_RESIZE_CURSOR);	
Cursor movecursor=new Cursor(Cursor.MOVE_CURSOR);
Cursor Nresizecursor=new Cursor(Cursor.N_RESIZE_CURSOR);	
Cursor textcursor=new Cursor(Cursor.TEXT_CURSOR);		
Cursor NEresizecursor=new Cursor(Cursor.NE_RESIZE_CURSOR);
Cursor NWresizecursor=new Cursor(Cursor.NW_RESIZE_CURSOR);
Cursor Sresizecursor=new Cursor(Cursor.S_RESIZE_CURSOR);
Cursor SEresizecursor=new Cursor(Cursor.SE_RESIZE_CURSOR);
Cursor SWresizecursor=new Cursor(Cursor.SW_RESIZE_CURSOR);	
Cursor waitcursor=new Cursor(Cursor.WAIT_CURSOR);	
Cursor handcursor=new Cursor(Cursor.HAND_CURSOR);
	
/////////////////////////////////////////////varriable declare for main page (Part-GUI)//////////////////////////////////////////
	
	JLabel flabelm2,labelmbfx,labelmbf,feedbackpagetitle,flabelmbx0,flabelmbx1,flabell,feedbackpagelowtitle,midpanfirstlabel,midpansecondlabel,commentlabel,felabel4,emailtitlelabel,nametitlelabel,numbertitlelabel,insmsglabel1,insmsglabel2,insmsglabel3;
	JButton fmbutton1,fmbutton2,fmbutton3,fmbutton4,fmbutton5,fmbutton6,submitbttn; 
	JPanel feedbackmainpanel,feedbackimgpanel,fpanr,transparentmidpanel,fpanel1,txtareapanel,lowerpanel,namemailpanel,numberpanel,submitbttnpanel;
	JRadioButton jb1,jb2,jb3,jb4,jb5;
	JFrame fmainframe;
	JScrollPane jpf;
	JScrollPane txtareascrollbar;
	Border radioborderbeforeclicked,radioborderafterclicked,submitbttnborder;
	HintTextArea cmnttxtarea;
	HintTextField emailtxtfield,nametxtfield,numbertxtfield,taf4;
	
	static boolean cmnt=false;
	static boolean nm=false;
	static boolean emid=false;
	static boolean fed=false;
	String feedrating="",feedcomment="",feedname="",feedemail="",feednumber="",SENDING_IP="",RAW_POST="";
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float exitvolume=-20.0f;
	float typelockvolume=-20.0f;
	
	float submitbuttonvolume=-20.0f;
	float submitbuttonclickvolume=-20.0f;
	float submiterrorvolume=-20.0f;
	float submitdonevolume=-20.0f;
	int xf,yf;
	Dimension fscreensize;
    JMenuBar mbf; 
	public feedback()
	{
	    fscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xf = (int) ((fscreensize.getWidth() - ((fscreensize.width/2)+320)) / 2);
        xf = (int) ((fscreensize.getHeight() - ((fscreensize.height/2)+220)) / 2);
	}
	
	public feedback(JFrame frame)
	{
	    fscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xf = (int) ((fscreensize.getWidth() - ((fscreensize.width/2)+320)) / 2);
        yf = (int) ((fscreensize.getHeight() - ((fscreensize.height/2)+220)) / 2);
		this.fmainframe=frame;
	}
	
	
public JMenuBar feedbackbar(JFrame frame)
{

////////////////////////////////Menubar ///////////////////////////////////////////////////////////////////	

mbf = new JMenuBar();
mbf.setBackground(Color.BLACK);
mbf.setPreferredSize(new java.awt.Dimension(1000, 55));
mbf.setBorder(BorderFactory.createBevelBorder(1, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY));


////////////////////////////////Menubar gif///////////////////////////////////////////////////////////////////	

	ImageIcon imgxf = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif");  //65*65
	labelmbfx = new JLabel("",imgxf,JLabel.CENTER);
	
////////////////////////////////Menubar black label///////////////////////////////////////////////////////////////////	

	labelmbf = new JLabel("<html><font color=#008B8B>RAW</font></html>");
	CustomFont cf=new CustomFont();
	labelmbf.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,25.0f));
	
	
	labelmbf.setForeground(Color.decode("#00FFFF"));
	labelmbf.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbf.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbf.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbf.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbf.setAlignmentX(Component.LEFT_ALIGNMENT);	

//////////////////////////////Menubar Button///////////////////////////////////////////////////////////////////////////
	
	fmbutton1 = new HoverButton(" HOME ");
	fmbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fmbutton1.setBackground(new Color(125,125,125));
	fmbutton1.setForeground(Color.WHITE);
	fmbutton1.setCursor(handcursor);
	fmbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	fmbutton1.setOpaque(false);
    fmbutton1.setContentAreaFilled(false);
    fmbutton1.setBorderPainted(true);
	fmbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton1.setFocusable(false);
		fmbutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	fmbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
			mainmenu m2 = new mainmenu(fmainframe);
			fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			fmainframe.setJMenuBar(m2.menubar(fmainframe));
			//fmainframe.getContentPane().add(m2.menu(fmainframe));
			fmainframe.setContentPane(m2.menu(fmainframe));
			fmainframe.setVisible(true);
		}		
		
	});	
	
	//------------------------------------------------------	
	fmbutton2 = new HoverButton(" ABOUT ");
	fmbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fmbutton2.setBackground(new Color(125,125,125));
	fmbutton2.setForeground(Color.WHITE);
	fmbutton2.setCursor(handcursor);
	fmbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	fmbutton2.setOpaque(false);
    fmbutton2.setContentAreaFilled(false);
    fmbutton2.setBorderPainted(true);
	fmbutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton2.setFocusable(false);	
	fmbutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});		
	
	fmbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
			about abt1 = new about(fmainframe);
			fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			fmainframe.setJMenuBar(abt1.abmenubar(fmainframe));
			//fmainframe.getContentPane().add(abt1.aboutus(fmainframe));
			fmainframe.setContentPane(abt1.aboutus(fmainframe));
			fmainframe.setVisible(true);
		}		
		
	});	
	//------------------------------------------------------	
	fmbutton3 = new HoverButton(" CONTACT ");
	fmbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fmbutton3.setBackground(new Color(125,125,125));
	fmbutton3.setForeground(Color.WHITE);
	fmbutton3.setCursor(handcursor);
	fmbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	fmbutton3.setOpaque(false);
    fmbutton3.setContentAreaFilled(false);
    fmbutton3.setBorderPainted(true);
	fmbutton3.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton3.setFocusable(false);	
		fmbutton3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	fmbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			
			 contact c = new contact(fmainframe);
			
			fmainframe.setJMenuBar(c.contactbar(fmainframe));
			//mainframe.getContentPane().add(c.contactpage(fmainframe));
			fmainframe.setContentPane(c.contactpage(fmainframe));
			fmainframe.setVisible(true);
		}		
		
	});	
	
	
	
	//------------------------------------------------------	
	fmbutton4 = new HoverButton(" FEEDBACK ");
	fmbutton4.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fmbutton4.setBackground(new Color(125,125,125));
	fmbutton4.setForeground(Color.WHITE);
	fmbutton4.setCursor(handcursor);
	fmbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
	fmbutton4.setOpaque(false);
    fmbutton4.setContentAreaFilled(false);
    fmbutton4.setBorderPainted(true);
	fmbutton4.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton4.setFocusable(false);	
		fmbutton4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	fmbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
				fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			
            feedback f = new feedback(fmainframe);
			
			fmainframe.setJMenuBar(f.feedbackbar(fmainframe));
			fmainframe.setContentPane(f.feedbackpage(fmainframe));
			fmainframe.setVisible(true);	
		}		
		
	});
	
	//------------------------------------------------------	
	fmbutton5 = new HoverButton(" REPORT ");
	fmbutton5.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fmbutton5.setBackground(new Color(125,125,125));
	fmbutton5.setForeground(Color.decode("#00c700"));
	fmbutton5.setCursor(handcursor);
	fmbutton5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	fmbutton5.setOpaque(false);
    fmbutton5.setContentAreaFilled(false);
    fmbutton5.setBorderPainted(true);
	fmbutton5.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton5.setFocusable(false);	
		fmbutton5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		fmbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
				fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			
            report r = new report(fmainframe);
			
			fmainframe.setJMenuBar(r.reportbar(fmainframe));
			fmainframe.setContentPane(r.reportpage(fmainframe));
			fmainframe.setVisible(true);	
		}		
		
	});
	//------------------------------------------------------	
	fmbutton6 = new HoverButton(" EXIT ");
	fmbutton6.setFont(new Font("Comic Sans",Font.BOLD,18));
	fmbutton6.setBackground(new Color(125,125,125));
	fmbutton6.setForeground(Color.RED);
	fmbutton6.setCursor(handcursor);
	fmbutton6.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
	fmbutton6.setOpaque(false);
    fmbutton6.setContentAreaFilled(false);
    fmbutton6.setBorderPainted(true);
	fmbutton6.setAlignmentX(Component.CENTER_ALIGNMENT);
	fmbutton6.setFocusable(false);
		fmbutton6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	fmbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(fmainframe);
			ex.confirmexit(fmainframe,exitvolume);
		
		}		
		
	});
	//-------------------------------------------------------------------
	
/////////////////////////////////Menubar button add on the menubar label///////////////////////////////////////////////////////

	mbf.add(Box.createRigidArea(new Dimension(10, 0)));
	mbf.add(labelmbfx);
	
	mbf.add(labelmbf);
	
	mbf.add(fmbutton1);
	mbf.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbf.add(fmbutton2);
	mbf.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbf.add(fmbutton3);
	mbf.add(Box.createRigidArea(new Dimension(25,0)));
	
	mbf.add(fmbutton4);
	mbf.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbf.add(fmbutton5);
	mbf.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbf.add(fmbutton6);
	mbf.add(Box.createRigidArea(new Dimension(50, 0)));

return mbf;
 	
}
	
public JPanel feedbackpage(JFrame frame)
{
cmnt=false;
 nm=false;
 emid=false;
 fed=false;
 
 Dimension screensize;
 	screensize = Toolkit.getDefaultToolkit().getScreenSize();
///////////////////////////pannel initialize/////////////////////////

	feedbackmainpanel = new JPanel();
    feedbackmainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	feedbackmainpanel.setBackground(Color.decode("#191919"));
	feedbackmainpanel.setLayout(new BoxLayout(feedbackmainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	feedbackmainpanel.setBorder(null);////////////////top<Left<bottom<right
	feedbackmainpanel.setOpaque(false);
   
/////////////////////backgroud panel on which the image is on/////////////////////////////
	
	feedbackimgpanel = new JPanel();
	feedbackimgpanel.setBackground(Color.decode("#00000"));
	feedbackimgpanel.setLayout(new GridLayout(1,1,0,0));
	feedbackimgpanel.setBorder(null);
	feedbackimgpanel.setMinimumSize(new Dimension(100, 0));
	feedbackimgpanel.setPreferredSize(new Dimension(100, 0));

/////////////////////feedback page wallpaper/////////////////////////////

	Image fimgl = null;
	try
	{
		
        fimgl = ImageIO.read(new File("Resources/Images/Feedback/feedbackpage_background_picture.png"));//900*500
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	
	ImagePanel imagep= new ImagePanel(fimgl);
	imagep.setBackground(Color.decode("#00000"));
	imagep.setLayout(new BoxLayout(imagep, BoxLayout.Y_AXIS));
	imagep.setBorder(null);
	imagep.setMinimumSize(new Dimension(100, 0));
	imagep.setPreferredSize(new Dimension(100, 0));
	imagep.setBorder(new EmptyBorder(0,350,0,350));

/////////////////////////Transparent mid panel in which the text form is located/////////////////////////////
	
	transparentmidpanel = new JPanel();
	transparentmidpanel.setBackground(new Color(0,0,0,150));
	transparentmidpanel.setLayout(new BoxLayout(transparentmidpanel, BoxLayout.Y_AXIS));
	transparentmidpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	transparentmidpanel.setMinimumSize(new Dimension(100, 0));
	transparentmidpanel.setPreferredSize(new Dimension(100, 0));
transparentmidpanel.setMaximumSize(new Dimension(1000, screensize.height));

/////////////////////////Label 1 on the mid transparent panel/////////////////////////////
	
	midpanfirstlabel = new JLabel("<html><font>&nbsp;&nbsp;&nbsp;Please help us to serve you better and it will take a few seconds.</html>");
	midpanfirstlabel.setFont(new Font("Arial",Font.PLAIN,18));
	midpanfirstlabel.setForeground(Color.decode("#f0ffff"));
	midpanfirstlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	midpanfirstlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	midpanfirstlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	midpanfirstlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	midpanfirstlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	midpanfirstlabel.setCursor(textcursor);
	
/////////////////////////Label 2 on the mid transparent panel/////////////////////////////
	
	midpansecondlabel = new JLabel("<html><font>&nbsp;&nbsp;&nbsp;How much satisfied were you with our services? <font color=#ff0000>*</font></html>");
	midpansecondlabel.setFont(new Font("Times New Roman",Font.PLAIN,17));
	midpansecondlabel.setForeground(Color.decode("#aed6dc"));
	midpansecondlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	midpansecondlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	midpansecondlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	midpansecondlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	midpansecondlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	midpansecondlabel.setCursor(textcursor);

///////////////////////////////////Title of feedback page/////////////////////////////////////
	
	feedbackpagetitle = new JLabel("<html><font color=#FFFFFFF>Feedback Form</font></html>");
	feedbackpagetitle.setFont(new Font("Times New Roman",Font.PLAIN,40));
	feedbackpagetitle.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	feedbackpagetitle.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	feedbackpagetitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	feedbackpagetitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	feedbackpagetitle.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	feedbackpagetitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	feedbackpagetitle.setCursor(textcursor);	

///////////////////////////////////Certification of RAW/////////////////////////////////////

	feedbackpagelowtitle = new JLabel("<html><font color=#a9a9a9>All Rights Reserved By TEAM@RAW</font></html>");
	feedbackpagelowtitle.setFont(new Font("Times New Roman",Font.PLAIN,12));
	feedbackpagelowtitle.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	feedbackpagelowtitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	feedbackpagelowtitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	feedbackpagelowtitle.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	feedbackpagelowtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	feedbackpagelowtitle.setCursor(textcursor);
	
/////////////////////////////Radio button initialize///////////////////////////////////////
	
	jb1 = new JRadioButton();
	jb2 = new JRadioButton();
	jb3 = new JRadioButton();
	jb4 = new JRadioButton();
	jb5 = new JRadioButton();

/////////////////////////////Radio button border before and after click///////////////////////////////////////
	
	radioborderbeforeclicked = new LineBorder(Color.decode("#838996"), 2);
	radioborderafterclicked = new LineBorder(Color.decode("#000000"), 2);

/////////////////////////////Radio buttons///////////////////////////////////////
	
	jb1.setText(" Excellent  ");
	jb1.setFont(new Font("Arial",Font.PLAIN,15));
	jb1.setBackground(new Color(0,0,0));
	jb1.setForeground(Color.decode("#c7c7c7"));
	jb1.setCursor(handcursor);
	jb1.setBorder(radioborderbeforeclicked);
	jb1.setOpaque(true);
    jb1.setBorderPainted(true);
	jb1.setFocusable(false);
	jb1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	jb1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			jb1.setBackground(Color.decode("#90ee90"));
			jb1.setForeground(Color.decode("#000000"));
			jb1.setBorder(radioborderafterclicked);
			
			jb2.setBackground(new Color(0,0,0));
			jb2.setForeground(Color.decode("#c7c7c7"));
			jb2.setBorder(radioborderbeforeclicked);
			
			jb3.setBackground(new Color(0,0,0));
			jb3.setForeground(Color.decode("#c7c7c7"));
			jb3.setBorder(radioborderbeforeclicked);
			
			jb4.setBackground(new Color(0,0,0));
			jb4.setForeground(Color.decode("#c7c7c7"));
			jb4.setBorder(radioborderbeforeclicked);
			
			jb5.setBackground(new Color(0,0,0));
			jb5.setForeground(Color.decode("#c7c7c7"));
			jb5.setBorder(radioborderbeforeclicked);
			
			fed = true;
			charlimit();
		}		
		
	});	
	
	
	
	jb2.setText(" Good        ");
	jb2.setFont(new Font("Arial",Font.PLAIN,15));
	jb2.setBackground(new Color(0,0,0));
	jb2.setForeground(Color.decode("#c7c7c7"));
	jb2.setCursor(handcursor);
	jb2.setOpaque(true);
	jb2.setBorder(radioborderbeforeclicked);
    jb2.setBorderPainted(true);
	jb2.setFocusable(false);
	jb2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	jb2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			jb2.setBackground(Color.decode("#90ee90"));
			jb2.setForeground(Color.decode("#000000"));
			jb2.setBorder(radioborderafterclicked);
			
			jb1.setBackground(new Color(0,0,0));
			jb1.setForeground(Color.decode("#c7c7c7"));
			jb1.setBorder(radioborderbeforeclicked);
			
			jb3.setBackground(new Color(0,0,0));
			jb3.setForeground(Color.decode("#c7c7c7"));
			jb3.setBorder(radioborderbeforeclicked);
			
			jb4.setBackground(new Color(0,0,0));
			jb4.setForeground(Color.decode("#c7c7c7"));
			jb4.setBorder(radioborderbeforeclicked);
			
			jb5.setBackground(new Color(0,0,0));
			jb5.setForeground(Color.decode("#c7c7c7"));
			jb5.setBorder(radioborderbeforeclicked);
			
			fed = true;
			charlimit();
		}		
		
	});	
	

	jb3.setText(" Neutral     ");
	jb3.setFont(new Font("Arial",Font.PLAIN,15));
	jb3.setBackground(new Color(0,0,0));
	jb3.setForeground(Color.decode("#c7c7c7"));
	jb3.setCursor(handcursor);
	jb3.setOpaque(true);
	jb3.setBorder(radioborderbeforeclicked);
    jb3.setBorderPainted(true);
	jb3.setFocusable(false);
	jb3.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	jb3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			jb3.setBackground(Color.decode("#90ee90"));
			jb3.setForeground(Color.decode("#000000"));
			jb3.setBorder(radioborderafterclicked);
			
			jb2.setBackground(new Color(0,0,0));
			jb2.setForeground(Color.decode("#c7c7c7"));
			jb2.setBorder(radioborderbeforeclicked);
			
			jb1.setBackground(new Color(0,0,0));
			jb1.setForeground(Color.decode("#c7c7c7"));
			jb1.setBorder(radioborderbeforeclicked);
			
			jb4.setBackground(new Color(0,0,0));
			jb4.setForeground(Color.decode("#c7c7c7"));
			jb4.setBorder(radioborderbeforeclicked);
			
			jb5.setBackground(new Color(0,0,0));
			jb5.setForeground(Color.decode("#c7c7c7"));
			jb5.setBorder(radioborderbeforeclicked);
			
			fed = true;
			charlimit();
		}		
		
	});		

	jb4.setText(" Poor         ");
	jb4.setFont(new Font("Arial",Font.PLAIN,15));
	jb4.setBackground(new Color(0,0,0));
	jb4.setForeground(Color.decode("#c7c7c7"));
	jb4.setCursor(handcursor);
	jb4.setOpaque(true);
	jb4.setBorder(radioborderbeforeclicked);
    jb4.setBorderPainted(true);
	jb4.setFocusable(false);
	jb4.setAlignmentX(Component.LEFT_ALIGNMENT);

	jb4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			jb4.setBackground(Color.decode("#90ee90"));
			jb4.setForeground(Color.decode("#000000"));
			jb4.setBorder(radioborderafterclicked);
			
			jb2.setBackground(new Color(0,0,0));
			jb2.setForeground(Color.decode("#c7c7c7"));
			jb2.setBorder(radioborderbeforeclicked);
			
			jb3.setBackground(new Color(0,0,0));
			jb3.setForeground(Color.decode("#c7c7c7"));
			jb3.setBorder(radioborderbeforeclicked);
			
			jb1.setBackground(new Color(0,0,0));
			jb1.setForeground(Color.decode("#c7c7c7"));
			jb1.setBorder(radioborderbeforeclicked);
			
			jb5.setBackground(new Color(0,0,0));
			jb5.setForeground(Color.decode("#c7c7c7"));
			jb5.setBorder(radioborderbeforeclicked);
			
			fed = true;
			charlimit();
		}		
		
	});	
	
	jb5.setText(" Very Poor ");
	jb5.setFont(new Font("Arial",Font.PLAIN,15));
	jb5.setBackground(new Color(0,0,0));
	jb5.setForeground(Color.decode("#c7c7c7"));
	jb5.setCursor(handcursor);
	jb5.setOpaque(true);
	jb5.setBorder(radioborderbeforeclicked);
    jb5.setBorderPainted(true);
	jb5.setFocusable(false);
	jb5.setAlignmentX(Component.LEFT_ALIGNMENT);	
	
	jb5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			jb5.setBackground(Color.decode("#90ee90"));
			jb5.setForeground(Color.decode("#000000"));
			jb5.setBorder(radioborderafterclicked);
			
			jb2.setBackground(new Color(0,0,0));
			jb2.setForeground(Color.decode("#c7c7c7"));
			jb2.setBorder(radioborderbeforeclicked);
			
			jb3.setBackground(new Color(0,0,0));
			jb3.setForeground(Color.decode("#c7c7c7"));
			jb3.setBorder(radioborderbeforeclicked);
			
			jb4.setBackground(new Color(0,0,0));
			jb4.setForeground(Color.decode("#c7c7c7"));
			jb4.setBorder(radioborderbeforeclicked);
			
			jb1.setBackground(new Color(0,0,0));
			jb1.setForeground(Color.decode("#c7c7c7"));
			jb1.setBorder(radioborderbeforeclicked);
			
			fed = true;
			charlimit();
		}		
		
	});
/////////////////////////////////////Button group//////////////////////////////////////

ButtonGroup bg = new ButtonGroup();

bg.add(jb1);
bg.add(jb2);
bg.add(jb3);
bg.add(jb4);
bg.add(jb5);


////////////////////////////////////////Comment in the textarea//////////////////////////////////////////////

    commentlabel = new JLabel("<html><font>&nbsp;&nbsp;&nbsp;If you have specific feedback, please write to us ( Enter atleast 20-3000 characters ) <font color=#ff0000>*</font><html>");
	commentlabel.setFont(new Font("Times New Roman",Font.PLAIN,16));
	commentlabel.setForeground(Color.decode("#aed6dc"));
	commentlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	commentlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	commentlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	commentlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	commentlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	commentlabel.setCursor(textcursor);
	
////////////////////////////////////////Upper Panel in which textarea is located//////////////////////////////////////////////
	
	txtareapanel = new JPanel();
	txtareapanel.setBackground(new Color(0,0,0,150));
	txtareapanel.setLayout(new GridLayout(1,1,0,0));
	txtareapanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	txtareapanel.setMinimumSize(new Dimension(1000, 60));
	//txtareapanel.setPreferredSize(new Dimension(1000, 60));
	txtareapanel.setMaximumSize(new Dimension(10000, 120));

////////////////////////////////////////Lower panel in which the other two panels(panels for text fields) are situated//////////////////////////////////////////////
	
	lowerpanel = new JPanel();
	lowerpanel.setBackground(new Color(0,0,0,150));
	lowerpanel.setLayout(new BoxLayout(lowerpanel, BoxLayout.X_AXIS));
	lowerpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	lowerpanel.setMinimumSize(new Dimension(100, 120));
	lowerpanel.setPreferredSize(new Dimension(100, 120));
	lowerpanel.setMaximumSize(new Dimension(10000, 250));

////////////////////////////////////////Lower left panel in which email and name textfield are located//////////////////////////////////////////////
	
	namemailpanel = new JPanel();
	namemailpanel.setBackground(new Color(0,0,0,150));
	namemailpanel.setLayout(new BoxLayout(namemailpanel, BoxLayout.Y_AXIS));
	namemailpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	namemailpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	namemailpanel.setMinimumSize(new Dimension(300, 200));
namemailpanel.setMaximumSize(new Dimension(600, 200));
////////////////////////////////////////Lower right panel in which number text field is located//////////////////////////////////////////////

	numberpanel = new JPanel();
	numberpanel.setBackground(new Color(0,0,0,150));
	numberpanel.setLayout(new BoxLayout(numberpanel, BoxLayout.Y_AXIS));
	numberpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	numberpanel.setMinimumSize(new Dimension(300, 200));
	numberpanel.setMaximumSize(new Dimension(600, 200));

////////////////////////////////////////Very lower right panel in which submit button is located//////////////////////////////////////////////
	
	submitbttnpanel = new JPanel();
	submitbttnpanel.setBackground(Color.decode("#091f23"));
	submitbttnpanel.setLayout(new BoxLayout(submitbttnpanel, BoxLayout.Y_AXIS));
	submitbttnpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	submitbttnpanel.setMinimumSize(new Dimension(400, 100));
	submitbttnpanel.setPreferredSize(new Dimension(400, 100));
	submitbttnpanel.setMaximumSize(new Dimension(10000, 110));

////////////////////////////////////////Labels for instruction messages//////////////////////////////////////////////

	insmsglabel1 = new JLabel(" ");
	insmsglabel1.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel1.setBackground(Color.decode("#FFFFFF"));
	insmsglabel1.setForeground(Color.decode("#FA441D"));
	insmsglabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel1.setCursor(textcursor);
	//--------------------------------------------------------------------------------------------------
	insmsglabel2 = new JLabel(" ");
	insmsglabel2.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel2.setBackground(Color.decode("#FFFFFF"));
	insmsglabel2.setForeground(Color.decode("#FA441D"));
	insmsglabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel2.setCursor(textcursor);
	//--------------------------------------------------------------------------------------------------
	insmsglabel3 = new JLabel(" ");
	insmsglabel3.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel3.setBackground(Color.decode("#FFFFFF"));
	insmsglabel3.setForeground(Color.decode("#FA441D"));
	insmsglabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel3.setCursor(textcursor);

///////////////////////////////////text area for comment/////////////////////////////////////
	
    cmnttxtarea = new HintTextArea("Additional Comment");//border ac-border inactive
	
	cmnttxtarea.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
        if (cmnttxtarea.getText().length() >= 20 && cmnttxtarea.getText().length() <= 3000) // limit textfield
			{
				cmnt = true;
				charlimit();
			}
			else 
			{
				cmnt = false;
				charlimit();			
			}
    }
	});
	
	cmnttxtarea.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	cmnttxtarea.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont
	cmnttxtarea.activebgColor=Color.decode("#0D2D33");
	cmnttxtarea.inactivebgColor=Color.decode("#091f23");
	cmnttxtarea.activefgColor=Color.WHITE;////////////color on type
	cmnttxtarea.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	cmnttxtarea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	cmnttxtarea.magColorM=Color.RED;///////// color if user click and unfill/ignore
	cmnttxtarea.setFont(new Font("Arial",Font.PLAIN,12));
	cmnttxtarea.setForeground(Color.decode("#FFFFFF"));
	cmnttxtarea.setBackground(Color.decode("#091f23"));
	cmnttxtarea.setColumns(30);
	cmnttxtarea.setLineWrap(true);
	cmnttxtarea.setWrapStyleWord(true);
	cmnttxtarea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    cmnttxtarea.addMouseListener(new FieldMouseListener());
	cmnttxtarea.setCaretColor(Color.WHITE);	
	
///////////////////////////////////text area scroll bar/////////////////////////////////////
	
	txtareascrollbar = new JScrollPane(cmnttxtarea);
	txtareascrollbar.getVerticalScrollBar().setUnitIncrement(10);
	txtareascrollbar.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	txtareascrollbar.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
	{
    @Override
    protected void configureScrollBarColors()
	{
        this.thumbColor = Color.decode("#696969");
    }
	protected JButton createIncreaseButton(int orientation)
	{
		return new ZeroSizeButton();
	}
  
    protected JButton createDecreaseButton(int orientation)
	{
    return new ZeroSizeButton();
	}
	});
	
	txtareascrollbar.setBorder(null);
	txtareascrollbar.setOpaque(true);


///////////////////////////////////text field for name /////////////////////////////////////
	
	emailtxtfield = new HintTextField("Please enter your email");//border ac-border inactive

		emailtxtfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
			if (emailtxtfield.getText().length() > 0 && emailtxtfield.getText().length() < 100) // limit textfield
			{
				emid = true;
				charlimit();
			}
			if(emailtxtfield.getText().length() <= 0 || emailtxtfield.getText().length() >= 100)
			{
				emid = false;
				charlimit();
			}
			if(emailtxtfield.getText().length() >= 100)
			{
				emid = false;
				charlimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			
            }
        });

	
	emailtxtfield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	emailtxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	emailtxtfield.activebgColor=Color.decode("#0D2D33");
	emailtxtfield.inactivebgColor=Color.decode("#091f23");
	emailtxtfield.activefgColor=Color.WHITE;////////////color on type
	emailtxtfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	emailtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	emailtxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	emailtxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	emailtxtfield.setForeground(Color.decode("#FFFFFF"));
	emailtxtfield.setBackground(Color.decode("#091f23"));
	emailtxtfield.setColumns(30);
	emailtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    emailtxtfield.addMouseListener(new FieldMouseListener());
	emailtxtfield.setCaretColor(Color.WHITE);
	emailtxtfield.setMinimumSize(new Dimension(100, 40));
	emailtxtfield.setPreferredSize(new Dimension(100, 40));

///////////////////////////////////text field for name /////////////////////////////////////

	nametxtfield = new HintTextField("Please enter your name");//border ac-border inactive
	
		nametxtfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
                if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|'))
				{	
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
			if (nametxtfield.getText().length() > 0 && nametxtfield.getText().length() < 100) // limit textfield
			{
				nm = true;
				charlimit();
			}
			if(nametxtfield.getText().length() <= 0 || nametxtfield.getText().length() >= 100)
			{
				nm = false;
				charlimit();
			}	
			if(nametxtfield.getText().length() >= 100)
			{
				nm = false;
				charlimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}			
				
            }
        });
		
		
	
	nametxtfield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	nametxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	nametxtfield.activebgColor=Color.decode("#0D2D33");
	nametxtfield.inactivebgColor=Color.decode("#091f23");
	nametxtfield.activefgColor=Color.WHITE;////////////color on type
	nametxtfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	nametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	nametxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	nametxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	nametxtfield.setForeground(Color.decode("#FFFFFF"));
	nametxtfield.setBackground(Color.decode("#091f23"));
	nametxtfield.setColumns(30);
	nametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    nametxtfield.addMouseListener(new FieldMouseListener());
	nametxtfield.setCaretColor(Color.WHITE);
	nametxtfield.setMinimumSize(new Dimension(100, 40));
	nametxtfield.setPreferredSize(new Dimension(100, 40));

///////////////////////////////////text field for number/////////////////////////////////////

	numbertxtfield = new HintTextField("Please enter your number(optional)");//border ac-border inactive
	
		numbertxtfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
                if (!Character.isDigit(evt.getKeyChar())) 
				{
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
            }
        });
	
	numbertxtfield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	numbertxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	numbertxtfield.activebgColor=Color.decode("#0D2D33");
	numbertxtfield.inactivebgColor=Color.decode("#091f23");
	numbertxtfield.activefgColor=Color.WHITE;////////////color on type
	numbertxtfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	numbertxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	numbertxtfield.magColorM=Color.WHITE;///////// color if user click and unfill/ignore
	numbertxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	numbertxtfield.setForeground(Color.decode("#FFFFFF"));
	numbertxtfield.setBackground(Color.decode("#091f23"));
	numbertxtfield.setColumns(30);
	numbertxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
	numbertxtfield.addMouseListener(new FieldMouseListener());
	numbertxtfield.setCaretColor(Color.WHITE);
	numbertxtfield.setMinimumSize(new Dimension(100, 40));
	numbertxtfield.setPreferredSize(new Dimension(100, 40));

///////////////////////////////////Submit button/////////////////////////////////////
	
	submitbttnborder = new LineBorder(Color.RED, 1);
	
	submitbttn = new JButton(" SUBMIT ");
	submitbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitbttn.setBackground(new Color(125,125,125));
	submitbttn.setForeground(Color.BLACK);
	submitbttn.setCursor(handcursor);
	submitbttn.setBorder(submitbttnborder);
	submitbttn.setOpaque(false);
	submitbttn.setEnabled(false);
    submitbttn.setContentAreaFilled(false);
    submitbttn.setBorderPainted(true);
	submitbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	submitbttn.setFocusable(false);
	
		submitbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
		submitbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
			String feed = null;
		
		if(e.getSource() == submitbttn)
		{
			if(jb1.isSelected())
			{
				feed = jb1.getText();
			}
			if(jb2.isSelected())
			{
				feed = jb2.getText();
			}
			if(jb3.isSelected())
			{
				feed = jb3.getText();
			}
			if(jb4.isSelected())
			{
				feed = jb4.getText();
			}
			if(jb5.isSelected())
			{
				feed = jb5.getText();
			}
			
			boolean flag = false;
			String comment = cmnttxtarea.getText();
			String email = emailtxtfield.getText();
			String name = nametxtfield.getText();
			String mobile = "";
			
			if(numbertxtfield.getText().equals("Please enter your number(optional)"))
			{
				mobile = " ";
			}
			if(!numbertxtfield.getText().equals("Please enter your number(optional)"))
			{
				mobile = numbertxtfield.getText();
			}
		
		
			if(mailcheck(email)==false)
			{
				insmsglabel1.setText("Sorry your mail id is containing wrong pattern.");
				insmsglabel2.setText("Please try again.");
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
				flag = false;
			}
			if(mailcheck(email)==true)
			{
				insmsglabel1.setText(" ");
				insmsglabel2.setText(" ");
				flag = true;
			}
			
			
			if(!mobile.equals("") && !mobile.equals(" "))
			{
			if(mblnumberchecker(mobile)==false)
			{
				insmsglabel3.setText("Sorry your phone number is not valid.");
				insmsglabel2.setText("Please try again.");
				
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
		
				flag = false;
			}
			if(mblnumberchecker(mobile)==true)
			{
				insmsglabel3.setText(" ");
				
				if(mailcheck(email)==true)
				{
					insmsglabel2.setText(" ");
					flag = true;
				}
	
			}
			}
			
			if(flag == true)
			{
				rawip rp = new rawip();
				feedrating=feed;
				feedcomment=comment;
				feedname=name;
				feedemail=email;
				RAW_POST="Visistor";
				SENDING_IP=rp.localhostaddress()+"\n"+rp.publicipaddress();
				if(mobile.equals("") || mobile.equals(" "))
				{
					feednumber="N/A";
				}
				if(!mobile.equals("") && !mobile.equals(" "))
				{
					feednumber = mobile;
				}

	
	
			try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		timeraw t=new timeraw();
		
		
		
		String searchquery="SELECT * FROM `feedback` WHERE EMAIL='"+ feedemail+"'";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(result.next())
		{
			insmsglabel1.setText("Sorry, This mail is already in our Database.");
				insmsglabel2.setText("Please try again.");
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			submitbttn.setEnabled(false);
		}
		else{
			
				try{		
		
		
		String history=t.intime();
		
		String insertquery="INSERT INTO `feedback` (`FULL_NAME`, `EMAIL`, `MOBILE_NUMBER`, `SATISFACTION_RATE`, `COMMENTS`, `RAW_POST`, `SENDING_TIME`, `SENDING_IP`) VALUES ('"+feedname+"', '"+feedemail+"', '"+feednumber+"', '"+feedrating+"', '"+feedcomment+"', '"+RAW_POST+"', '"+history+"', '"+SENDING_IP+"');";


		
		statement.executeUpdate(insertquery);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	
				
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);
				transparentmidpanel.removeAll();
				transparentmidpanel.add(aftersubmitpane(transparentmidpanel));
				transparentmidpanel.revalidate();	
				
		}

		connection.close();
		statement.close();
		}
		catch(ClassNotFoundException ae)
				{
					System.out.println(ae);
				}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	
				
			
				
				
			}
			
			if(flag == false)
			{
				feedrating="";
				feedcomment="";
				feedname="";
				feedemail="";
				feednumber="";
			}
			
		}
		}		
		
	});
	

///////////////////////////////////Labels that indicates the text fields name /////////////////////////////////////
	
	emailtitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;Email <font color=#ff0000>* </font></html>");
	emailtitlelabel.setFont(new Font("Times New Roman",Font.BOLD,14));
	emailtitlelabel.setForeground(Color.decode("#aed6dc"));
	emailtitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	emailtitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	emailtitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	emailtitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	emailtitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	emailtitlelabel.setCursor(textcursor);
	
	nametitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;Name <font color=#ff0000>* </font></html>");
	nametitlelabel.setFont(new Font("Times New Roman",Font.BOLD,14));
	nametitlelabel.setForeground(Color.decode("#aed6dc"));
	nametitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	nametitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	nametitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	nametitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	nametitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	nametitlelabel.setCursor(textcursor);
	
	numbertitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;Mobile Number </html>");
	numbertitlelabel.setFont(new Font("Times New Roman",Font.BOLD,14));
	numbertitlelabel.setForeground(Color.decode("#aed6dc"));
	numbertitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	numbertitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	numbertitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	numbertitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	numbertitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	numbertitlelabel.setCursor(textcursor);
	

	
	
///////////////////////////////////Add the component in the panel/////////////////////////////////////
	
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	transparentmidpanel.add(midpanfirstlabel);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	transparentmidpanel.add(midpansecondlabel);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	transparentmidpanel.add(jb1);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	transparentmidpanel.add(jb2);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	transparentmidpanel.add(jb3);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	transparentmidpanel.add(jb4);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	transparentmidpanel.add(jb5);
	
	
	
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
	transparentmidpanel.add(commentlabel);
	
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	txtareapanel.add(txtareascrollbar);
	
	
	namemailpanel.add(emailtitlelabel);
	namemailpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	namemailpanel.add(emailtxtfield);
	namemailpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	
	
	namemailpanel.add(nametitlelabel);
	namemailpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	namemailpanel.add(nametxtfield);
	
	
	numberpanel.add(numbertitlelabel);
	numberpanel.add(Box.createRigidArea(new Dimension(0, 7)));	
	numberpanel.add(numbertxtfield);
	
	submitbttnpanel.add(insmsglabel1);
	submitbttnpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	submitbttnpanel.add(insmsglabel2);
	submitbttnpanel.add(Box.createRigidArea(new Dimension(0, 1)));
	submitbttnpanel.add(insmsglabel3);
	submitbttnpanel.add(Box.createRigidArea(new Dimension(0, 5)));	
	submitbttnpanel.add(Box.createRigidArea(new Dimension(1000, 0)));
	submitbttnpanel.add(submitbttn);
submitbttnpanel.add(Box.createRigidArea(new Dimension(0, 10)));	

	numberpanel.add(Box.createRigidArea(new Dimension(0, 7)));	
	numberpanel.add(submitbttnpanel);	
	
	lowerpanel.add(namemailpanel);
	lowerpanel.add(numberpanel);
	
	transparentmidpanel.add(txtareapanel);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	transparentmidpanel.add(lowerpanel);
	transparentmidpanel.add(Box.createRigidArea(new Dimension(0, 100)));

///////////////////////////////////Add mid panel on the background image /////////////////////////////////////

    imagep.add(Box.createRigidArea(new Dimension(0, 10)));
	imagep.add(feedbackpagetitle);
	imagep.add(Box.createRigidArea(new Dimension(0, 10)));
	imagep.add(transparentmidpanel);
	imagep.add(Box.createRigidArea(new Dimension(0, 10)));
	imagep.add(feedbackpagelowtitle);
	imagep.add(Box.createRigidArea(new Dimension(0, 10)));
	
	feedbackimgpanel.add(imagep);
	feedbackmainpanel.add(feedbackimgpanel);		
	
	
	//submitbttn.addActionListener(this);
	
	
	return feedbackmainpanel;
	
}

///////////////////////////////////Make the button active or inactive /////////////////////////////////////
public JPanel aftersubmitpane(JPanel p)
{
	JPanel aftersubpan = new JPanel();
	aftersubpan.setBackground(new Color(3, 42, 49));
	aftersubpan.setLayout(new BoxLayout(aftersubpan, BoxLayout.Y_AXIS));
	aftersubpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	aftersubpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	aftersubpan.setMaximumSize(new Dimension(p.getWidth(), p.getHeight()));

	JLabel aftersublab1 = new JLabel("<html>Your feedback form successfully sumitted to our system.</html>");
	aftersublab1.setFont(new Font("Times New Roman",Font.BOLD,14));
	aftersublab1.setForeground(Color.decode("#aed6dc"));
	aftersublab1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab1.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab1.setCursor(textcursor);
	
	JLabel aftersublab2 = new JLabel("<html>For your further query you can contact directly to the admin.</html>");
	aftersublab2.setFont(new Font("Times New Roman",Font.BOLD,14));
	aftersublab2.setForeground(Color.decode("#aed6dc"));
	aftersublab2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab2.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab2.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab2.setCursor(textcursor);
	
	JLabel aftersublab3 = new JLabel("<html>Hope you have enjoyed our service. Thank you.</html>");
	aftersublab3.setFont(new Font("Times New Roman",Font.BOLD,14));
	aftersublab3.setForeground(Color.decode("#aed6dc"));
	aftersublab3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab3.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab3.setCursor(textcursor);
	
	
	JButton aftersubbutton = new HoverButton(" HOME ");
	aftersubbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	aftersubbutton.setBackground(new Color(125,125,125));
	aftersubbutton.setForeground(Color.WHITE);
	aftersubbutton.setCursor(handcursor);
	aftersubbutton.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	aftersubbutton.setOpaque(false);
    aftersubbutton.setContentAreaFilled(false);
    aftersubbutton.setBorderPainted(true);
	aftersubbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubbutton.setFocusable(false);
		aftersubbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	aftersubbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
			mainmenu m2 = new mainmenu(fmainframe);
			fmainframe.setJMenuBar(null);
			fmainframe.getContentPane().removeAll();
			fmainframe.setJMenuBar(m2.menubar(fmainframe));
			//fmainframe.getContentPane().add(m2.menu(fmainframe));
			fmainframe.setContentPane(m2.menu(fmainframe));
			fmainframe.setVisible(true);
		}		
		
	});	
	
	
	aftersubpan.add(Box.createRigidArea(new Dimension(0, 20)));	
	aftersubpan.add(aftersublab1);
	aftersubpan.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpan.add(aftersublab2);
	aftersubpan.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpan.add(aftersublab3);
	aftersubpan.add(Box.createRigidArea(new Dimension(0, 25)));	

	
	aftersubpan.add(aftersubbutton);
	
	return aftersubpan;
}


public void charlimit()
{
	
	if (cmnt == true && nm == true && emid == true && fed == true)
	{
		submitbttn.setEnabled(true);
		submitbttn.setForeground(Color.decode("#FFFFFF"));
		submitbttn.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else 
	{
		submitbttn.setEnabled(false);
		submitbttn.setBorder(new LineBorder(Color.RED, 1));
	}
		
}

///////////////////////////////////Mail Id validation/////////////////////////////////////

public static boolean mailcheck(String email) 
    { 
        String emailRegex = "^[a-z0-9_+&*-]+(?:\\."+ 
                            "[a-z0-9_+&*-]+)*@" + 
                            "(?:[a-z0-9-]+\\.)+[a-z" + 
                            "]{2,7}$"; 
                              
        Pattern pat = Pattern.compile(emailRegex); 
        if (email == null) 
            return false; 
        return pat.matcher(email).matches(); 
    }

///////////////////////////////////Mobile number validation/////////////////////////////////////

public static boolean mblnumberchecker(String number) 
    { 
        String numberRegex = "^(\\+\\d{1,3}( )?)?((\\(\\d{1,3}\\))|\\d{1,3})[- .]?\\d{3,4}[- .]?\\d{4}$";

	   Pattern p = Pattern.compile(numberRegex); 
        if (number == null) 
            return false; 
        return p.matcher(number).matches(); 
    }
	
	boolean activate = false;
	
	class FieldMouseListener implements MouseListener
	{
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            if(activate == false){
                
            }
            activate = true;			
        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
		}

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

		
	class CustomeBorder extends AbstractBorder
	{
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
                 
		{    
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D)g;
            g2d.setStroke(new BasicStroke(12));
            g2d.setColor(new Color(0,0,0,100));
            g2d.drawRoundRect(x, y, width - 1 , height - 1, 30, 30);
        }
    }

}

class ZeroSizeButton extends JButton {
  @Override public Dimension getPreferredSize() {
    return new Dimension();
  }
}



