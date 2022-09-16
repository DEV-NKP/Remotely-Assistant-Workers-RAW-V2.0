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

public class contact
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
	
	JLabel namelabel,labelquote1,labelquote2,flabelm2,labelmbfx,labelmbfx1,labelmbfx2,labelmbcx,labelmbc,flabelmbx0,flabelmbx1,flabell,contactusitle,contactusdetail1,contactuslowtitle,midpan1stlabel,midpan2ndlabel,commentlabel,felabel4,emailtitlelabel,nametitlelabel,messagetitlelabel,numtitlelabel,rdtitlelabel,insmsglabel1,insmsglabel2,insmsglabel3;
	JButton cmbutton1,cmbutton2,cmbutton3,cmbutton4,cmbutton5,cmbutton6,sendbttn; 
	JPanel contactmainpanel,contactimgpanel,fpanr,transparentpanel,transparentuppanel,transparentmidpanel,transparentlowpanel,transparentlowrightpanel,transparentlowleftpanel,nameemailmsgpanel,namepanel,mailpanel,numpanel,msgpanel,lowerpanel,rdlabelpanel,rdpanel,sendbttnpanel;
	JRadioButton rb1,rb2;
	JFrame cmainframe;
	JScrollPane jpf;
	JScrollPane msgareascrollbar;
	Border radioborderbeforeclicked,radioborderafterclicked,sendbttnborder;
	HintTextArea messagetxtarea;
	HintTextField emailtxtfield,nametxtfield,numbertxtfield,taf4;
	
	static boolean msg=false;
	static boolean nm=false;
	static boolean emid=false;
	static boolean phn=false;
	static boolean radio=false;
	
	static boolean radiophn=false;
	static boolean radioemid=false;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float exitvolume=-20.0f;
	float typelockvolume=-20.0f;
	
	float submitbuttonvolume=-20.0f;
	float submitbuttonclickvolume=-20.0f;
	float submiterrorvolume=-20.0f;
	float submitdonevolume=-20.0f;
	
	String FULL_NAME="";
	String EMAIL="";
	String MOBILE_NUMBER="";
	String COMMUNICATION_METHOD="";
	String MESSAGE="";
	String RAW_POSITION="";
	String SENDING_TIME="";
	String SENDING_IP="";
	String CONTACT_CONDITION="";
	
	String contradio = "", contmsg="",contname="",contemail="", contnum="";
	
	int xf,yf;
	Dimension fscreensize;
    JMenuBar mbc; 
	
	public contact()
	{
	    fscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xf = (int) ((fscreensize.getWidth() - ((fscreensize.width/2)+320)) / 2);
        xf = (int) ((fscreensize.getHeight() - ((fscreensize.height/2)+220)) / 2);
	}
	
	public contact(JFrame frame)
	{
	    fscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xf = (int) ((fscreensize.getWidth() - ((fscreensize.width/2)+320)) / 2);
        yf = (int) ((fscreensize.getHeight() - ((fscreensize.height/2)+220)) / 2);
		this.cmainframe=frame;
	}
	
	
public JMenuBar contactbar(JFrame frame)
{

////////////////////////////////Menubar ///////////////////////////////////////////////////////////////////	

mbc = new JMenuBar();
mbc.setBackground(Color.BLACK);
mbc.setPreferredSize(new java.awt.Dimension(1000, 55));
mbc.setBorder(BorderFactory.createBevelBorder(1, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY));


////////////////////////////////Menubar gif///////////////////////////////////////////////////////////////////	

	ImageIcon imgxc = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif");  //65*65
	labelmbcx = new JLabel("",imgxc,JLabel.CENTER);
	
////////////////////////////////Menubar black label///////////////////////////////////////////////////////////////////	

	labelmbc = new JLabel("<html><font color=#008B8B>RAW</font></html>");
	labelmbc.setFont(new Font("Anurati",Font.BOLD,25));
	labelmbc.setForeground(Color.decode("#00FFFF"));
	labelmbc.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbc.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbc.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbc.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbc.setAlignmentX(Component.LEFT_ALIGNMENT);	

//////////////////////////////Menubar Button///////////////////////////////////////////////////////////////////////////
	
	cmbutton1 = new HoverButton(" HOME ");
	cmbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	cmbutton1.setBackground(new Color(125,125,125));
	cmbutton1.setForeground(Color.WHITE);
	cmbutton1.setCursor(handcursor);
	cmbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	cmbutton1.setOpaque(false);
    cmbutton1.setContentAreaFilled(false);
    cmbutton1.setBorderPainted(true);
	cmbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton1.setFocusable(false);
			cmbutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	cmbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainmenu m2 = new mainmenu(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(m2.menubar(cmainframe));
			//cmainframe.getContentPane().add(m2.menu(cmainframe));
			cmainframe.setContentPane(m2.menu(cmainframe));
			cmainframe.setVisible(true);
		}		
		
	});	
	
	//------------------------------------------------------	
	cmbutton2 = new HoverButton(" ABOUT ");
	cmbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	cmbutton2.setBackground(new Color(125,125,125));
	cmbutton2.setForeground(Color.WHITE);
	cmbutton2.setCursor(handcursor);
	cmbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	cmbutton2.setOpaque(false);
    cmbutton2.setContentAreaFilled(false);
    cmbutton2.setBorderPainted(true);
	cmbutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton2.setFocusable(false);		
			cmbutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	cmbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			about abt1 = new about(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(abt1.abmenubar(cmainframe));
			//cmainframe.getContentPane().add(abt1.aboutus(cmainframe));
			cmainframe.setContentPane(abt1.aboutus(cmainframe));
			cmainframe.setVisible(true);
		}		
		
	});	
	//------------------------------------------------------	
	cmbutton3 = new HoverButton(" CONTACT ");
	cmbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	cmbutton3.setBackground(new Color(125,125,125));
	cmbutton3.setForeground(Color.WHITE);
	cmbutton3.setCursor(handcursor);
	cmbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
	cmbutton3.setOpaque(false);
    cmbutton3.setContentAreaFilled(false);
    cmbutton3.setBorderPainted(true);
	cmbutton3.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton3.setFocusable(false);		
			cmbutton3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	cmbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			contact cnt = new contact(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(cnt.contactbar(cmainframe));
			//cmainframe.getContentPane().add(cnt.contactpage(cmainframe));
			cmainframe.setContentPane(cnt.contactpage(cmainframe));
			cmainframe.setVisible(true);
		}
		
	});	
	//------------------------------------------------------	
	cmbutton4 = new HoverButton(" FEEDBACK ");
	cmbutton4.setFont(new Font("Comic Sans",Font.PLAIN,18));
	cmbutton4.setBackground(new Color(125,125,125));
	cmbutton4.setForeground(Color.WHITE);
	cmbutton4.setCursor(handcursor);
	cmbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	cmbutton4.setOpaque(false);
    cmbutton4.setContentAreaFilled(false);
    cmbutton4.setBorderPainted(true);
	cmbutton4.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton4.setFocusable(false);	
			cmbutton4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	cmbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			feedback fd = new feedback(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(fd.feedbackbar(cmainframe));
			//cmainframe.getContentPane().add(fd.feedbackpage(cmainframe));
			cmainframe.setContentPane(fd.feedbackpage(cmainframe));
			cmainframe.setVisible(true);	
		}		
		
	});
	
	//------------------------------------------------------	
	cmbutton5 = new HoverButton(" REPORT ");
	cmbutton5.setFont(new Font("Comic Sans",Font.PLAIN,18));
	cmbutton5.setBackground(new Color(125,125,125));
	cmbutton5.setForeground(Color.decode("#00c700"));
	cmbutton5.setCursor(handcursor);
	cmbutton5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	cmbutton5.setOpaque(false);
    cmbutton5.setContentAreaFilled(false);
    cmbutton5.setBorderPainted(true);
	cmbutton5.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton5.setFocusable(false);	
			cmbutton5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	cmbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			report rpt = new report(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(rpt.reportbar(cmainframe));
			//cmainframe.getContentPane().add(rpt.reportpage(cmainframe));
			cmainframe.setContentPane(rpt.reportpage(cmainframe));
			cmainframe.setVisible(true);	
		}		
		
	});	
	//------------------------------------------------------	
	cmbutton6 = new HoverButton(" EXIT ");
	cmbutton6.setFont(new Font("Comic Sans",Font.BOLD,18));
	cmbutton6.setBackground(new Color(125,125,125));
	cmbutton6.setForeground(Color.RED);
	cmbutton6.setCursor(handcursor);
	cmbutton6.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
	cmbutton6.setOpaque(false);
    cmbutton6.setContentAreaFilled(false);
    cmbutton6.setBorderPainted(true);
	cmbutton6.setAlignmentX(Component.CENTER_ALIGNMENT);
	cmbutton6.setFocusable(false);
			cmbutton6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
cmbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(cmainframe);
			ex.confirmexit(cmainframe,exitvolume);
		
		}		
		
	});
	//-------------------------------------------------------------------
	
/////////////////////////////////Menubar button add on the menubar label///////////////////////////////////////////////////////

	mbc.add(Box.createRigidArea(new Dimension(10, 0)));
	mbc.add(labelmbcx);
	
	mbc.add(labelmbc);
	
	mbc.add(cmbutton1);
	mbc.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbc.add(cmbutton2);
	mbc.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbc.add(cmbutton3);
	mbc.add(Box.createRigidArea(new Dimension(25,0)));
	
	mbc.add(cmbutton4);
	mbc.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbc.add(cmbutton5);
	mbc.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbc.add(cmbutton6);
	mbc.add(Box.createRigidArea(new Dimension(50, 0)));

return mbc;
 	
}

public JPanel contactpage(JFrame frame)
{
	msg=false;
	nm=false;
	emid=false;
	phn=false;
	radio=false;
	
	radiophn=false;
	radioemid=false;
	
///////////////////////////pannel initialize/////////////////////////

	contactmainpanel = new JPanel();
    contactmainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	contactmainpanel.setBackground(Color.decode("#191919"));
	contactmainpanel.setLayout(new BoxLayout(contactmainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	contactmainpanel.setBorder(null);////////////////top<Left<bottom<right
	contactmainpanel.setOpaque(false);

/////////////////////backgroud panel on which the image is on/////////////////////////////
	
	contactimgpanel = new JPanel();
	contactimgpanel.setBackground(Color.decode("#00000"));
	contactimgpanel.setLayout(new GridLayout(1,1,0,0));
	contactimgpanel.setBorder(null);
	contactimgpanel.setMinimumSize(new Dimension(100, 0));
	contactimgpanel.setPreferredSize(new Dimension(100, 0));

/////////////////////contact page wallpaper/////////////////////////////

	Image cimgl = null;
	try
	{
		
        cimgl = ImageIO.read(new File("Resources/Images/Contact/contactpage_background.png"));//900*500
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	
	ImagePanel imag= new ImagePanel(cimgl);
	imag.setBackground(Color.decode("#00000"));
	imag.setLayout(new BoxLayout(imag, BoxLayout.Y_AXIS));
	imag.setBorder(null);
	imag.setMinimumSize(new Dimension(100, 0));
	imag.setPreferredSize(new Dimension(100, 0));
	imag.setBorder(new EmptyBorder(1,1,1,1));
	
/////////////////////////Transparent main panel /////////////////////////////

	/*Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	transparentpanel = new JPanel();
	transparentpanel.setBackground(new Color(0,0,0,140));
	transparentpanel.setLayout(new BoxLayout(transparentpanel, BoxLayout.Y_AXIS));
	transparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	transparentpanel.setMinimumSize(new Dimension(screensize.width, screensize.height));
    transparentpanel.setPreferredSize(new Dimension(screensize.width, screensize.height));
    transparentpanel.setMaximumSize(new Dimension(screensize.width, screensize.height));*/
	
	
///////////////////////////////////Title of contact page/////////////////////////////////////
	
	contactusitle = new JLabel("<html><font color=#FFFFFFF>Contact Us</font></html>");
	contactusitle.setFont(new Font("Times New Roman",Font.PLAIN,40));
	//contactusitle.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	contactusitle.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	contactusitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	contactusitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	contactusitle.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	contactusitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	contactusitle.setCursor(textcursor);	


///////////////////////////////////1st Details of contact page/////////////////////////////////////
	
	contactusdetail1 = new JLabel("<html><font color=#ADDFFF>For any problem contact with us</font></html>");
	contactusdetail1.setFont(new Font("Courier",Font.PLAIN,16));
	//contactusitle.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	contactusdetail1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	contactusdetail1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	contactusdetail1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	contactusdetail1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	contactusdetail1.setAlignmentX(Component.CENTER_ALIGNMENT);
	contactusdetail1.setCursor(textcursor);	
	
	
/////////////////////////Transparent mid panel in which the text form is located/////////////////////////////
	
	transparentmidpanel = new JPanel();
	transparentmidpanel.setBackground(new Color(0,0,0,0));
	transparentmidpanel.setLayout(new BoxLayout(transparentmidpanel, BoxLayout.X_AXIS));
	transparentmidpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	transparentmidpanel.setMinimumSize(new Dimension(frame.getWidth(), 500));
	transparentmidpanel.setPreferredSize(new Dimension(frame.getWidth(), 500));
    //transparentmidpanel.setMaximumSize(new Dimension(frame.getWidth(), 100));
	transparentmidpanel.setBorder(new EmptyBorder(50,0,25,0));

///////////////////////////////////Certification of RAW/////////////////////////////////////

	contactuslowtitle = new JLabel("<html><font color=#a9a9a9>All Rights Reserved By TEAM@RAW</font></html>");
	contactuslowtitle.setFont(new Font("Times New Roman",Font.PLAIN,12));
	contactuslowtitle.setVerticalAlignment(JLabel.BOTTOM);/////y axis for all-TOP,CENTER,BOTTOM
	contactuslowtitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	contactuslowtitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	contactuslowtitle.setVerticalTextPosition(JLabel.BOTTOM);/////y axis for text-TOP,CENTER,BOTTOM
	contactuslowtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	contactuslowtitle.setCursor(textcursor);
	
/////////////////////////Transparent lower left panel /////////////////////////////
	
	transparentlowleftpanel = new JPanel();
	transparentlowleftpanel.setBackground(new Color(0,0,0,0));
	transparentlowleftpanel.setLayout(new BoxLayout(transparentlowleftpanel, BoxLayout.Y_AXIS));
	transparentlowleftpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	transparentlowleftpanel.setMinimumSize(new Dimension(frame.getWidth()/2, 500));
	transparentlowleftpanel.setPreferredSize(new Dimension(frame.getWidth()/2,500));
	transparentlowleftpanel.setMaximumSize(new Dimension(frame.getWidth()/2, 800));
	transparentlowleftpanel.setBorder(new EmptyBorder(30,0,0,0));//1->up,2->left,3->down,4->right
	
	
/////////////////////////Image of icon in lower left panel /////////////////////////////
	
	
	labelquote1 = new JLabel("<html><b>Get a quote</html>");
	labelquote1.setFont(new Font("Times New Roman",Font.BOLD,34));
	labelquote1.setForeground(Color.decode("#b0e0e6"));
	labelquote1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelquote1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelquote1.setHorizontalTextPosition(JLabel.RIGHT);////x axis for text-LEFT,CENTER,RIGHT
	labelquote1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelquote1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	labelquote2 = new JLabel("<html>Fill up the form and our team will get back to tou within 24 hours.</html>");
	labelquote2.setFont(new Font("Arial",Font.PLAIN,18));
	labelquote2.setForeground(Color.decode("#ffc87c"));
	labelquote2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelquote2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelquote2.setHorizontalTextPosition(JLabel.RIGHT);////x axis for text-LEFT,CENTER,RIGHT
	labelquote2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelquote2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	ImageIcon imgxf = new ImageIcon("Resources/Images/Contact/location.png");  //60*60
	labelmbfx = new JLabel("<html><b>&nbsp;&nbsp;Location</b><br><font size=4 color=#f8de7e>&nbsp;&nbsp;American International University-Bangladesh (AIUB)</font></html>",imgxf,JLabel.LEFT);
	labelmbfx.setFont(new Font("Arial",Font.PLAIN,18));
	labelmbfx.setForeground(Color.decode("#AFDCEC"));
	labelmbfx.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbfx.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbfx.setHorizontalTextPosition(JLabel.RIGHT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbfx.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbfx.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	ImageIcon imgxf1 = new ImageIcon("Resources/Images/Contact/phone.png");  //50*50
    labelmbfx1 = new JLabel("<html><b>&nbsp;&nbsp;Phone Number</b><br><font size=4 color=#f8de7e>&nbsp;&nbsp;&nbsp;01787-700037<br>&nbsp;&nbsp;&nbsp;01778-385387<br>&nbsp;&nbsp;&nbsp;01720-246009</font></html>",imgxf1,JLabel.LEFT);
	labelmbfx1.setFont(new Font("Arial",Font.PLAIN,18));
	labelmbfx1.setForeground(Color.decode("#AFDCEC"));
	labelmbfx1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbfx1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbfx1.setHorizontalTextPosition(JLabel.RIGHT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbfx1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbfx1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	ImageIcon imgxf2 = new ImageIcon("Resources/Images/Contact/mail.png");  //60*60
	labelmbfx2 = new JLabel("<html><b>&nbsp;&nbsp;Mail adress</b><br><font size=4 color=#f8de7e>&nbsp;&nbsp;niloykanti.paul2017@gmail.com<br>&nbsp;&nbsp;biswaskaushik2020@gmail.com<br>&nbsp;&nbsp;dipanwitasaha7009@gmail.com</font></html>",imgxf2,JLabel.LEFT);
	labelmbfx2.setFont(new Font("Arial",Font.PLAIN,18));
	labelmbfx2.setForeground(Color.decode("#AFDCEC"));
	labelmbfx2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbfx2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbfx2.setHorizontalTextPosition(JLabel.RIGHT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbfx2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbfx2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
/////////////////////////Transparent lower right panel /////////////////////////////

	transparentlowrightpanel = new JPanel();
	transparentlowrightpanel.setBackground(new Color(0,0,0,0));
	transparentlowrightpanel.setLayout(new BoxLayout(transparentlowrightpanel, BoxLayout.Y_AXIS));
	transparentlowrightpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	transparentlowrightpanel.setMinimumSize(new Dimension(frame.getWidth()/2, 500));
	transparentlowrightpanel.setPreferredSize(new Dimension(frame.getWidth()/2, 500));
	transparentlowrightpanel.setMaximumSize(new Dimension(frame.getWidth()/2, 800));
	transparentlowrightpanel.setBorder(new EmptyBorder(0,150,0,110));//1->up,2->left,3->down,4->right
	
/////////////////////////Transparent lower right panel /////////////////////////////
    JPanel roundpanel = new RoundedPanel(40,Color.decode("#f0ffff"));
    //roundpanel.setBounds(10,10,650,700);
	//roundpanel.setBackground(Color.decode("#000000"));
	roundpanel.setLayout(new BoxLayout(roundpanel, BoxLayout.Y_AXIS));
	roundpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	roundpanel.setMinimumSize(new Dimension(400, 450));
	roundpanel.setPreferredSize(new Dimension(400, 450));
	roundpanel.setMaximumSize(new Dimension(540, 630));
	roundpanel.setBorder(new EmptyBorder(20,10,20,10));
 roundpanel.setOpaque(false);
/////////////////////////Lower right panel in which name email message panel located /////////////////////////////
	 
	 
	nameemailmsgpanel = new JPanel();
	nameemailmsgpanel.setBackground(Color.decode("#f0ffff"));
	nameemailmsgpanel.setLayout(new BoxLayout(nameemailmsgpanel, BoxLayout.Y_AXIS));
	nameemailmsgpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	nameemailmsgpanel.setMinimumSize(new Dimension(500, 550));
	nameemailmsgpanel.setPreferredSize(new Dimension(500, 550));
	nameemailmsgpanel.setMaximumSize(new Dimension(530, 600));
	
	
/////////////////////////Very Lower right panel in which name panel located /////////////////////////////
	 
	 
	namepanel = new JPanel();
	//namepanel.setBackground(new Color( 255,255,255));
	namepanel.setBackground(Color.decode("#f0ffff"));
	namepanel.setLayout(new BoxLayout(namepanel, BoxLayout.Y_AXIS));
	namepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	namepanel.setMinimumSize(new Dimension(100, 60));
	namepanel.setPreferredSize(new Dimension(100, 130));
	namepanel.setMaximumSize(new Dimension(500, 170));
	
/////////////////////////Very Lower right panel in which mail panel located /////////////////////////////
	 
	 
	mailpanel = new JPanel();
	//mailpanel.setBackground(new Color(255,255,255));
	mailpanel.setBackground(Color.decode("#f0ffff"));
	mailpanel.setLayout(new BoxLayout(mailpanel, BoxLayout.Y_AXIS));
	mailpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	mailpanel.setMinimumSize(new Dimension(100, 60));
	mailpanel.setPreferredSize(new Dimension(100, 60));
	mailpanel.setMaximumSize(new Dimension(500, 80));
	
	
/////////////////////////Very Lower right panel in which number panel located /////////////////////////////
	 
	 
	numpanel = new JPanel();
	//numpanel.setBackground(new Color( 255,255,255));
	numpanel.setBackground(Color.decode("#f0ffff"));
	numpanel.setLayout(new BoxLayout(numpanel, BoxLayout.Y_AXIS));
	numpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	numpanel.setMinimumSize(new Dimension(100, 60));
	numpanel.setPreferredSize(new Dimension(100, 60));
	numpanel.setMaximumSize(new Dimension(500, 80));
	
/////////////////////////Very Lower right panel in which message panel located /////////////////////////////
	 
	 
	msgpanel = new JPanel();
	//msgpanel.setBackground(new Color( 255,255,255));
	msgpanel.setBackground(Color.decode("#f0ffff"));
	msgpanel.setLayout(new BoxLayout(msgpanel, BoxLayout.Y_AXIS));
	msgpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	msgpanel.setMinimumSize(new Dimension(100, 40));
	msgpanel.setPreferredSize(new Dimension(100, 40));
	msgpanel.setMaximumSize(new Dimension(450, 60));
	
	
	
/////////////////////////Very Lower right panel in which radio button panel located /////////////////////////////

	rdpanel = new JPanel();
	//rdpanel.setBackground(new Color( 255,255,255));
	rdpanel.setBackground(Color.decode("#f0ffff"));
	rdpanel.setLayout(new BoxLayout(rdpanel, BoxLayout.X_AXIS));
	rdpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//nameemailmsgpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	rdpanel.setMinimumSize(new Dimension(100, 20));
	rdpanel.setPreferredSize(new Dimension(100, 20));
	rdpanel.setMaximumSize(new Dimension(450, 20));
	//rdpanel.setBorder(new EmptyBorder(0,60,0,40));//1->up,2->left,3->down,4->right
	
/////////////////////////Very Lower right panel in which radio button label located /////////////////////////////

	rdlabelpanel = new JPanel();
	//rdlabelpanel.setBackground(new Color( 0,0,0,0));
	rdlabelpanel.setBackground(Color.decode("#f0ffff"));
	rdlabelpanel.setLayout(new BoxLayout(rdlabelpanel, BoxLayout.Y_AXIS));
	rdlabelpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	//rdlabelpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	rdlabelpanel.setMinimumSize(new Dimension(100, 20));
	rdlabelpanel.setPreferredSize(new Dimension(100, 20));
	rdlabelpanel.setMaximumSize(new Dimension(550, 20));
	//rdlabelpanel.setBorder(new EmptyBorder(0,10,0,100));//1->up,2->left,3->down,4->right
	
	
///////////////////////////////Labels that indicates the text fields name /////////////////////////////////////
	
	
	nametitlelabel = new JLabel("<html><br>&nbsp;&nbsp;&nbsp;Send Us a Message</html>");
	nametitlelabel.setFont(new Font("Arial",Font.BOLD,28));
	nametitlelabel.setForeground(Color.decode("#0C090A"));
	nametitlelabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	nametitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	nametitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	nametitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	nametitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	nametitlelabel.setCursor(textcursor);
	
	namelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Name<font color=#ff0000> * </font></html>");
	namelabel.setFont(new Font("Arial",Font.BOLD,14));
	namelabel.setForeground(Color.decode("#2B3856"));
	namelabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	namelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	namelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	namelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	namelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	namelabel.setCursor(textcursor);
	
	emailtitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email<font color=#ff0000> * </font></html>");
	emailtitlelabel.setFont(new Font("Arial",Font.BOLD,14));
	emailtitlelabel.setForeground(Color.decode("#2B3856"));
	emailtitlelabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	emailtitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	emailtitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	emailtitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	emailtitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	emailtitlelabel.setCursor(textcursor);
	
	messagetitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Message<font color=#ff0000> * </font></html>");
	messagetitlelabel.setFont(new Font("Arial",Font.BOLD,14));
	messagetitlelabel.setForeground(Color.decode("#2B3856"));
	messagetitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	messagetitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	messagetitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	messagetitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	messagetitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	messagetitlelabel.setCursor(textcursor);
	
	numtitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Phone<font color=#ff0000> * </font></html>");
	numtitlelabel.setFont(new Font("Arial",Font.BOLD,14));
	numtitlelabel.setForeground(Color.decode("#2B3856"));
	numtitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	numtitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	numtitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	numtitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	numtitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	numtitlelabel.setCursor(textcursor);


    rdtitlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Preffered method of communication<font color=#ff0000> * </font></html>");
	rdtitlelabel.setFont(new Font("Arial",Font.BOLD,14));
	rdtitlelabel.setForeground(Color.decode("#2B3856"));
	rdtitlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	rdtitlelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	rdtitlelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	rdtitlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	rdtitlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	rdtitlelabel.setCursor(textcursor);

////////////////////////////////////////Labels for instruction messages//////////////////////////////////////////////

	insmsglabel1 = new JLabel(" ");
	insmsglabel1.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel1.setBackground(Color.decode("#fffff"));
	insmsglabel1.setForeground(Color.decode("#ff0000"));
	insmsglabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel1.setCursor(textcursor);
	//--------------------------------------------------------------------------------------------------
	insmsglabel2 = new JLabel(" ");
	insmsglabel2.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel2.setBackground(Color.decode("#ffffff"));
	insmsglabel2.setForeground(Color.decode("#ff0000"));
	insmsglabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel2.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel2.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel2.setCursor(textcursor);
	//--------------------------------------------------------------------------------------------------
	insmsglabel3 = new JLabel(" ");
	insmsglabel3.setFont(new Font("Times New Roman",Font.BOLD,15));
	insmsglabel3.setBackground(Color.decode("#ffffff"));
	insmsglabel3.setForeground(Color.decode("#ff0000"));
	insmsglabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	insmsglabel3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	insmsglabel3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	insmsglabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	insmsglabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	insmsglabel3.setCursor(textcursor);
	
	
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
	nametxtfield.activebgColor=Color.decode("#afeeee");
	nametxtfield.inactivebgColor=Color.decode("#b0e0e6");//00dbdb
	nametxtfield.activefgColor=Color.BLACK;////////////color on type
	nametxtfield.inactivefgColor=Color.BLACK;/////////////color when text inactive
	nametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	nametxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	nametxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	nametxtfield.setForeground(Color.BLACK);
	nametxtfield.setBackground(Color.decode("#b0e0e6"));
	nametxtfield.setColumns(30);
	nametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    nametxtfield.addMouseListener(new FieldMouseListener());
	nametxtfield.setCaretColor(Color.WHITE);
	nametxtfield.setMinimumSize(new Dimension(100, 40));
	nametxtfield.setPreferredSize(new Dimension(100, 40));
	nametxtfield.setMaximumSize(new Dimension(450, 50));


///////////////////////////////text field for email /////////////////////////////////////
	
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
	emailtxtfield.activebgColor=Color.decode("#afeeee");//cyan
	emailtxtfield.inactivebgColor=Color.decode("#b0e0e6");//cyan
	emailtxtfield.activefgColor=Color.BLACK;////////////color on type
	emailtxtfield.inactivefgColor=Color.BLACK;/////////////color when text inactive//cyan
	emailtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	emailtxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	emailtxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	emailtxtfield.setForeground(Color.BLACK);
	emailtxtfield.setBackground(Color.decode("#b0e0e6"));
	emailtxtfield.setColumns(30);
	emailtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(12,22,12,22))));        
    emailtxtfield.addMouseListener(new FieldMouseListener());
	emailtxtfield.setCaretColor(Color.WHITE);
	emailtxtfield.setMinimumSize(new Dimension(100, 40));
	emailtxtfield.setPreferredSize(new Dimension(100, 40));
	emailtxtfield.setMaximumSize(new Dimension(450, 50));


///////////////////////////////text field for number /////////////////////////////////////
	
	numbertxtfield = new HintTextField("Please enter your number");//border ac-border inactive
	
		numbertxtfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
				String txtd = null;
					if(numbertxtfield.getText().equals("Please enter your number"))
					{
						txtd = "";
					}
					if(!numbertxtfield.getText().equals("Please enter your number"))
					{
						txtd = numbertxtfield.getText();
					}
					
					
				if (evt.getKeyChar() == KeyEvent.VK_BACK_SPACE || evt.getKeyChar() == KeyEvent.VK_DELETE)
				{
					if(txtd.length() <= 1)
					{
					phn = false;
					charlimit();						
					}
					else 
					{
						phn = true;
						charlimit();
					}

				}
				
				if (!Character.isDigit(evt.getKeyChar())) 
				{
					//phn=false;
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				else 
				{
					
			if (txtd.length() > 1 && txtd.length() < 100) // limit textfield
			{
				phn = true;
				charlimit();
			}
			if(txtd.length() <= 1 || txtd.length() >= 100)
			{
				phn = false;
				charlimit();
			}
			if(txtd.length() >= 100)
			{
				phn = false;
				charlimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
				}
            }
        });
	
	numbertxtfield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	numbertxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	numbertxtfield.activebgColor=Color.decode("#afeeee");
	numbertxtfield.inactivebgColor=Color.decode("#b0e0e6");
	numbertxtfield.activefgColor=Color.BLACK;////////////color on type
	numbertxtfield.inactivefgColor=Color.BLACK;/////////////color when text inactive
	numbertxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	numbertxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	numbertxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	numbertxtfield.setForeground(Color.BLACK);
	numbertxtfield.setBackground(Color.decode("#b0e0e6"));
	numbertxtfield.setColumns(30);
	numbertxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
	numbertxtfield.addMouseListener(new FieldMouseListener());
	numbertxtfield.setCaretColor(Color.WHITE);
	numbertxtfield.setMinimumSize(new Dimension(100, 40));
	numbertxtfield.setPreferredSize(new Dimension(100, 40));
	numbertxtfield.setMaximumSize(new Dimension(450, 50));


///////////////////////////////////Text area for message/////////////////////////////////////

	
	messagetxtarea = new HintTextArea("Type your Message");//border ac-border inactive
	
	messagetxtarea.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
        if (messagetxtarea.getText().length() >= 20 && messagetxtarea.getText().length() <= 3000) // limit textfield
			{
				msg = true;
				charlimit();
			}
			else 
			{
				msg = false;
				charlimit();
			}
    }
	});
	
	messagetxtarea.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	messagetxtarea.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	messagetxtarea.activebgColor=Color.decode("#afeeee");
	messagetxtarea.inactivebgColor=Color.decode("#b0e0e6");
	messagetxtarea.activefgColor=Color.BLACK;////////////color on type
	messagetxtarea.inactivefgColor=Color.BLACK;/////////////color when text inactive
	messagetxtarea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	messagetxtarea.magColorM=Color.RED;///////// color if user click and unfill/ignore
	messagetxtarea.setFont(new Font("Arial",Font.PLAIN,12));
	messagetxtarea.setForeground(Color.BLACK);
	messagetxtarea.setBackground(Color.decode("#b0e0e6"));
	messagetxtarea.setColumns(30);
	messagetxtarea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
	messagetxtarea.addMouseListener(new FieldMouseListener());
	messagetxtarea.setCaretColor(Color.WHITE);
	messagetxtarea.setLineWrap(true);
	messagetxtarea.setWrapStyleWord(true);
  //  messagetxtarea.setMinimumSize(new Dimension(100, 40));
	//messagetxtarea.setPreferredSize(new Dimension(100, 40));
	//messagetxtarea.setMaximumSize(new Dimension(450, 50));

///////////////////////////////////text area scroll bar/////////////////////////////////////
	
	msgareascrollbar = new JScrollPane(messagetxtarea);
	msgareascrollbar.getVerticalScrollBar().setUnitIncrement(10);
	msgareascrollbar.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	msgareascrollbar.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
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
	
	msgareascrollbar.setBorder(null);
	msgareascrollbar.setOpaque(true);


//////////////////////////////////////// lower right panel in which send button is located//////////////////////////////////////////////
	
	sendbttnpanel = new JPanel();
	sendbttnpanel.setBackground( Color.decode("#f0ffff"));
	sendbttnpanel.setLayout(new BoxLayout(sendbttnpanel, BoxLayout.Y_AXIS));
	sendbttnpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	sendbttnpanel.setBorder(new EmptyBorder(0,0,0,0));
	//sendbttnpanel.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(5,15,5,15))));
	sendbttnpanel.setMinimumSize(new Dimension(400, 40));
	sendbttnpanel.setPreferredSize(new Dimension(400, 40));
	sendbttnpanel.setMaximumSize(new Dimension(450, 100));
	//sendbttnpanel.setBorder(new EmptyBorder(5,100,5,100));//1->up,2->left,3->down,4->right
	
	
///////////////////////////////////Send button/////////////////////////////////////
	
	sendbttnborder = new LineBorder(Color.decode("#367588"));
	
	sendbttn = new RoundedCornerButton("  SEND  ");
	sendbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	sendbttn.setBackground(Color.decode("#f0ffff"));
	sendbttn.setForeground(Color.decode("#888888"));
	sendbttn.setCursor(handcursor);
	sendbttn.setBorder(sendbttnborder);
	sendbttn.setOpaque(true);
	sendbttn.setEnabled(false);
    sendbttn.setContentAreaFilled(true);
    sendbttn.setBorderPainted(true);
	sendbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	sendbttn.setFocusable(false);
	sendbttn.setMinimumSize(new Dimension(1000, 20));
	sendbttn.setPreferredSize(new Dimension(1000, 20));
	sendbttn.setMaximumSize(new Dimension(1000, 30));
	
		sendbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
		sendbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
		MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
		String check = null;
		
		if(e.getSource() == sendbttn)
		{
			if(rb1.isSelected())
			{
				check = rb1.getText();
			}
			if(rb2.isSelected())
			{
				check = rb2.getText();
			}
			
			boolean flag = false;
			String message = messagetxtarea.getText();
			String email = emailtxtfield.getText();;
			String name = nametxtfield.getText();
			String mobile = "";
			
			if(numbertxtfield.getText().equals("Please enter your number"))
			{
				mobile = " ";
			}
			if(!numbertxtfield.getText().equals("Please enter your number"))
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
			
			/*if(mobile.equals(" ") || mobile.equals(""))
			{
				mobile="N/A";
				flag=true;
			}*/
			
			/*if(check.equals(" Phone   "))
			{*/
			
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
			/*}*/
			if(flag == true)
			{
				contradio=check;
				contmsg=message;
				contname=name;
				contemail=email;
				
				if(mobile.equals("") || mobile.equals(" "))
				{
					contnum="N/A";
				}
				if(!mobile.equals("") && !mobile.equals(" "))
				{
					contnum = mobile;
				}
				
				timeraw t=new timeraw();
					 rawip rp = new rawip();
				FULL_NAME=contname;
				EMAIL=contemail;
				MOBILE_NUMBER=contnum;
				COMMUNICATION_METHOD=contradio;
				MESSAGE=contmsg;
				RAW_POSITION="Visitor";
				SENDING_TIME=t.intime();
				SENDING_IP=rp.localhostaddress()+"\n"+rp.publicipaddress();
				CONTACT_CONDITION="Waiting";
					
try{	
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();

     try{		

		String insertquery1="INSERT INTO `contact`(`FULL_NAME`, `EMAIL`, `MOBILE_NUMBER`, `COMMUNICATION_METHOD`, `MESSAGE`, `RAW_POST`, `SENDING_TIME`, `SENDING_IP`, `CONTACT_CONDITION`) VALUES ('"+FULL_NAME+"','"+EMAIL+"','"+MOBILE_NUMBER+"','"+COMMUNICATION_METHOD+"','"+MESSAGE+"','"+RAW_POSITION+"','"+SENDING_TIME+"','"+SENDING_IP+"','"+CONTACT_CONDITION+"');";
		
		statement.executeUpdate(insertquery1);
	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
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
				
				//System.out.println(SENDING_IP);
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);
		
				roundpanel.removeAll();
				roundpanel.add(aftersubmitpane(roundpanel));
				roundpanel.revalidate();
				
			}
			
			if(flag == false)
			{
				contradio="";
				contmsg="";
				contname="";
				contemail="";
				contnum="";
			}
			
		}
		
		}		
		
	});
	
/////////////////////////////Radio button initialize///////////////////////////////////////
	
	rb1 = new JRadioButton();
	rb2 = new JRadioButton();

/////////////////////////////Radio button border before and after click///////////////////////////////////////
	
	radioborderbeforeclicked = new LineBorder(Color.decode("#808080"), 1);
	radioborderafterclicked = new LineBorder(Color.decode("#f0ffff"), 1);

/////////////////////////////Radio buttons///////////////////////////////////////
	
	rb1.setText(" Email   ");
	rb1.setFont(new Font("Arial",Font.PLAIN,15));
	rb1.setBackground(Color.decode("#f0ffff"));
	rb1.setForeground(Color.BLACK);
	rb1.setCursor(handcursor);
	rb1.setBorder(radioborderbeforeclicked);
	rb1.setOpaque(true);
    rb1.setBorderPainted(true);
	rb1.setFocusable(false);
	rb1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	rb1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			rb1.setBackground(Color.decode("#afeeee"));
			rb1.setForeground(Color.decode("#000000"));
			rb1.setBorder(radioborderafterclicked);
			
			rb2.setBackground( Color.decode("#ffffff"));
			rb2.setForeground(Color.decode("#000000"));
			rb2.setBorder(radioborderbeforeclicked);
			
			radio = true;
			radioemid = true;
			radiophn = false;
			
			charlimit();
		}		
		
	});	
	
    rb2.setText(" Phone   ");
	rb2.setFont(new Font("Arial",Font.PLAIN,15));
	rb2.setBackground(Color.decode("#f0ffff"));
	rb2.setForeground(Color.BLACK);
	rb2.setCursor(handcursor);
	rb2.setOpaque(true);
	rb2.setBorder(radioborderbeforeclicked);
    rb2.setBorderPainted(true);
	rb2.setFocusable(false);
	rb2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	rb2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			rb2.setBackground(Color.decode("#afeeee"));
			rb2.setForeground(Color.decode("#000000"));
			rb2.setBorder(radioborderafterclicked);
			
			rb1.setBackground( Color.decode("#ffffff"));
			rb1.setForeground(Color.decode("#000000"));
			rb1.setBorder(radioborderbeforeclicked);
			
			radio = true;
			radiophn = true;
			radioemid = false;
			
			charlimit();
		}		
		
	});	
	
	
/////////////////////////////////////Button group//////////////////////////////////////

    ButtonGroup bg = new ButtonGroup();

    bg.add(rb1);
    bg.add(rb2);


////////////////////////////////////////////////////////////////////////////////////////////////////////////

	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(150, 0)));
    transparentlowleftpanel.add(labelquote1);
	
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(150, 0)));
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 10)));
    transparentlowleftpanel.add(labelquote2);
	
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 60)));
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(150, 0)));
    transparentlowleftpanel.add(labelmbfx);
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	//transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 2)));
    transparentlowleftpanel.add(labelmbfx1);
	transparentlowleftpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	transparentlowleftpanel.add(labelmbfx2);
	

	namepanel.add(nametitlelabel);
	namepanel.add(Box.createRigidArea(new Dimension(0, 20)));
	namepanel.add(namelabel);
	namepanel.add(Box.createRigidArea(new Dimension(0, 2)));
	namepanel.add(nametxtfield);
	namepanel.add(Box.createRigidArea(new Dimension(0, 3)));
	nameemailmsgpanel.add(namepanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	
	mailpanel.add(emailtitlelabel);
	mailpanel.add(Box.createRigidArea(new Dimension(0, 3)));
	mailpanel.add(emailtxtfield);
	mailpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	nameemailmsgpanel.add(mailpanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	
	numpanel.add(numtitlelabel);
	numpanel.add(Box.createRigidArea(new Dimension(0, 3)));
	numpanel.add(numbertxtfield);
	numpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	nameemailmsgpanel.add(numpanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	
	rdlabelpanel.add(rdtitlelabel);
	rdlabelpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	nameemailmsgpanel.add(rdlabelpanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	rdpanel.add(Box.createRigidArea(new Dimension(150, 0)));
	rdpanel.add(rb1);
	rdpanel.add(Box.createRigidArea(new Dimension(30, 0)));
	rdpanel.add(rb2);
	rdpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	nameemailmsgpanel.add(rdpanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	
	nameemailmsgpanel.add(messagetitlelabel);
	msgpanel.add(Box.createRigidArea(new Dimension(0, 3)));
	msgpanel.add(msgareascrollbar);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 2)));
	nameemailmsgpanel.add(msgpanel);
	nameemailmsgpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	
	sendbttnpanel.add(Box.createRigidArea(new Dimension(0, 3)));	
	sendbttnpanel.add(insmsglabel1);
	sendbttnpanel.add(Box.createRigidArea(new Dimension(0, 3)));	
	sendbttnpanel.add(insmsglabel2);
	sendbttnpanel.add(Box.createRigidArea(new Dimension(0, 3)));	
	sendbttnpanel.add(insmsglabel3);
	sendbttnpanel.add(sendbttn);
	sendbttnpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	nameemailmsgpanel.add(sendbttnpanel);
	
	
	transparentlowrightpanel.add(Box.createRigidArea(new Dimension(0, 0)));	
	//transparentlowrightpanel.add(nameemailmsgpanel);
	roundpanel.add(nameemailmsgpanel);
	roundpanel.add(Box.createRigidArea(new Dimension(0, 10)));	
	transparentlowrightpanel.add(roundpanel);
	transparentlowrightpanel.add(Box.createRigidArea(new Dimension(0, 7)));	
	/*submitbttnpanel.add(submitbttn);
	transparentlowrightpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	transparentlowrightpanel.add(submitbttnpanel);*/
	
	transparentmidpanel.add(transparentlowleftpanel);

	transparentmidpanel.add(transparentlowrightpanel);

	/*transparentpanel.add(contactusitle);
	transparentpanel.add(contactusdetail1);
	transparentpanel.add(transparentmidpanel);
	transparentpanel.add(contactuslowtitle);
	imag.add(transparentpanel);*/
	imag.add(contactusitle);
	imag.add(contactusdetail1);
	imag.add(transparentmidpanel);
	imag.add(contactuslowtitle);
	
	contactimgpanel.add(imag);
	contactmainpanel.add(contactimgpanel);
	
	
	//submitbttn.addActionListener(this);
	
	
	return contactmainpanel;
	
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
	

public void charlimit()
{
	if(radio == true && emid == true && nm == true && msg == true && radioemid == true && (phn == true || phn == false))
	{
		sendbttn.setEnabled(true);
		sendbttn.setForeground(Color.decode("#000000"));
		sendbttn.setBackground(Color.decode("#f0ffff"));
		sendbttn.setBorder(new LineBorder(Color.RED, 1));
	}
	
	else if(radio == true && emid == true && nm == true && msg == true && phn == true && radiophn == true)
	{
		sendbttn.setEnabled(true);
		sendbttn.setForeground(Color.decode("#000000"));
		sendbttn.setBackground(Color.decode("#f0ffff"));
		sendbttn.setBorder(new LineBorder(Color.RED, 1));
	}
	
	else
	{
		sendbttn.setEnabled(false);
		sendbttn.setForeground(Color.decode("#000000"));
		sendbttn.setBackground(Color.decode("#f0ffff"));
		sendbttn.setBorder(new LineBorder(Color.RED, 1));
	}
}



public JPanel aftersubmitpane(JPanel p)
{
	JPanel aftersubpan101 = new JPanel();
	aftersubpan101.setBackground(Color.decode("#f0ffff"));
	aftersubpan101.setLayout(new BoxLayout(aftersubpan101, BoxLayout.Y_AXIS));
	aftersubpan101.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubpan101.setMinimumSize(new Dimension(p.getWidth()-50, p.getHeight()-50));
	aftersubpan101.setPreferredSize(new Dimension(p.getWidth()-50, p.getHeight()-50));
	aftersubpan101.setMaximumSize(new Dimension(p.getWidth()-50, p.getHeight()-50));

	JLabel aftersublab101 = new JLabel("<html>Your contact information successfully saved on our database.</html>");
	aftersublab101.setFont(new Font("Times New Roman",Font.BOLD,16));
	aftersublab101.setForeground(Color.decode("#000000"));
	aftersublab101.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab101.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab101.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab101.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab101.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab101.setCursor(textcursor);
	
	JLabel aftersublab201 = new JLabel("<html>You are welcome to contact with us at any time<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;to make your confusion clear.</html>");
	aftersublab201.setFont(new Font("Times New Roman",Font.BOLD,16));
	aftersublab201.setForeground(Color.decode("#ea3c53"));
	aftersublab201.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab201.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab201.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab201.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab201.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab201.setCursor(textcursor);
	
	JLabel aftersublab301 = new JLabel("<html>Our team will notify as soon as they got your message</html>");
	aftersublab301.setFont(new Font("Times New Roman",Font.BOLD,18));
	aftersublab301.setForeground(Color.decode("#8b0000"));
	aftersublab301.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab301.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab301.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab301.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab301.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab301.setCursor(textcursor);
	
	
	JButton aftersubbutton101 = new HoverButton(" HOME ");
	aftersubbutton101.setFont(new Font("Comic Sans",Font.PLAIN,18));
	aftersubbutton101.setBackground(Color.decode("#f0ffff"));
	aftersubbutton101.setForeground(new Color(0,0,0));
	aftersubbutton101.setCursor(handcursor);
	aftersubbutton101.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	aftersubbutton101.setOpaque(false);
    aftersubbutton101.setContentAreaFilled(false);
    aftersubbutton101.setBorderPainted(true);
	aftersubbutton101.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubbutton101.setFocusable(false);
	aftersubbutton101.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	aftersubbutton101.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
			mainmenu m201 = new mainmenu(cmainframe);
			cmainframe.setJMenuBar(null);
			cmainframe.getContentPane().removeAll();
			cmainframe.setJMenuBar(m201.menubar(cmainframe));
			//cmainframe.getContentPane().add(m201.menu(cmainframe));
			cmainframe.setContentPane(m201.menu(cmainframe));
			cmainframe.setVisible(true);
		}		
		
	});	
	
	
	aftersubpan101.add(Box.createRigidArea(new Dimension(0, 150)));	
	aftersubpan101.add(aftersublab101);
	aftersubpan101.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpan101.add(aftersublab201);
	aftersubpan101.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpan101.add(aftersublab301);
	aftersubpan101.add(Box.createRigidArea(new Dimension(0, 70)));

	
	aftersubpan101.add(aftersubbutton101);
	
	return aftersubpan101;
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
            g2d.setColor(Color.decode("#f0ffff"));//#838996
            g2d.drawRoundRect(x, y, width - 1 , height - 1, 30, 30);
        }
    }

}