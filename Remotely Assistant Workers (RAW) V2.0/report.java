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
public class report
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
	
	JLabel flabelm2,rmblabel,labelmbr,reportpagetitle,flabelmbx0,flabelmbx1,flabell,reportpagelowtitle,label1midpan,label2midpan,commentlabel,felabel4,emailtitlelabel,nametitlelabel,numbertitlelabel,insmsglabel1,insmsglabel2,insmsglabel3,label3midpan,label4midpan,label5midpan,label6midpan,label7midpan,label8midpan,label9midpan,label10midpan;
	JButton rmbutton1,rmbutton2,rmbutton3,rmbutton4,rmbutton5,rmbutton6,submitbttn,rprtbttn1,rprtbttn2,rprtbttn3,rprtsubmitbttn,rprtformbttn,softrprtformbttn,accrprtformbttn; 
	JPanel reportmainpanel,reportimgpanel,fpanr,midpaneltransparent,fpanel1,txtareapanel,lowerpanel,namemailpanel,numberpanel,submitbttnpanel,buttnpan1,lowpanforins,buttnpan2,buttnpan3,buttnpan4,lowpanmailname;
	JFrame rmainframe;
	HintTextField nametxt,mailtxt,accnotxtfield;
	Border sbttnborder;
	
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float exitvolume=-20.0f;
	float buttonvolume=-20.0f;
	float buttonclickvolume=-20.0f;
	float submiterrorvolume=-20.0f;
	float submitdonevolume=-20.0f;
	float submitbuttonvolume=-20.0f;
	float submitbuttonclickvolume=-20.0f;
	float typelockvolume=-20.0f;
	
	String problem = null;
	String subproblem = null;
	String rprtlastcomment = null;
	String accusedname = null;
	String accusedmail = null;
	
	String sproblem = null;
	String ssubproblem = null;
	String srprtlastcomment = null;

    String aproblem = null;
	String asubproblem = null;
	String arprtlastcomment = null;
	String bankaccountno = null;

	String reportsection = null;
	String lastsubmitusername = null;
	String lastsubmitusermail = null;
	
	String lastsubmitaccusename = null;
	String lastsubmitaccusemail = null;
	String lastbankaccountno = null;
	
	String lastsubmitproblem = null;
	String lastsubmitsubproblem = null;
	String lastsubmitcomment = null;

	static boolean rname=false;
	static boolean rmail=false;
	
	boolean rprtcmnt = false;
	
	
	
	static boolean userproblem=false;
	static boolean usercmnt=false;
	static boolean useraccused=false;
	static boolean accnoneeded=false;
	static boolean usersubproblem=false;
	
	static boolean softproblem=false;
	static boolean softcmnt=false;
	static boolean softsubproblem=false;

	static boolean accproblem=false;
	static boolean acccmnt=false;
	static boolean accsubproblem=false;	

	static boolean optionuser=false;
	static boolean optionsoftware=false;
	static boolean optionaccount=false;
	
	String FULL_NAME ="";
	String EMAIL ="";
	String REPORT_SECTION ="";
	String SUSPECT_EMAIL ="";
	String BANK_ACCOUNT_NO ="";
	String PROBLEM_TYPE ="";
	String SUB_PROBLEM_TYPE ="";
	String ADDITIONAL_COMMENT ="";
	String SENDING_TIME ="";
	String SENDING_IP  ="";
	String REPORT_CONDITION ="";
	String INVESTIGATION_TIME ="";
	String WARNING_TIME  ="";
	String CLOSING_TIME  ="";
	String HANDLER_EMAIL  ="";
	String SOLUTION  ="";
	String USER_SATISFACTION  ="";

	
	int xr,yr;
	Dimension rscreensize;
    JMenuBar rmb; 
	public report()
	{
	    rscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xr = (int) ((rscreensize.getWidth() - ((rscreensize.width/2)+320)) / 2);
        xr = (int) ((rscreensize.getHeight() - ((rscreensize.height/2)+220)) / 2);
	}
	
	public report(JFrame frame)
	{
	    rscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        xr = (int) ((rscreensize.getWidth() - ((rscreensize.width/2)+320)) / 2);
        yr = (int) ((rscreensize.getHeight() - ((rscreensize.height/2)+220)) / 2);
		this.rmainframe=frame;
	}
	
	
public JMenuBar reportbar(JFrame frame)
{

////////////////////////////////Menubar ///////////////////////////////////////////////////////////////////	

rmb = new JMenuBar();
rmb.setBackground(Color.BLACK);
rmb.setPreferredSize(new java.awt.Dimension(1000, 55));
rmb.setBorder(BorderFactory.createBevelBorder(1, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY));


////////////////////////////////Menubar gif///////////////////////////////////////////////////////////////////	

	ImageIcon imgxr = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif");  //65*65
	rmblabel = new JLabel("",imgxr,JLabel.CENTER);
	
////////////////////////////////Menubar black label///////////////////////////////////////////////////////////////////	

	labelmbr = new JLabel("<html><font color=#008B8B>RAW</font></html>");
	CustomFont cf=new CustomFont();
	labelmbr.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,25.0f));
	labelmbr.setForeground(Color.decode("#00FFFF"));
	labelmbr.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbr.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbr.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbr.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbr.setAlignmentX(Component.LEFT_ALIGNMENT);	

//////////////////////////////Menubar Button///////////////////////////////////////////////////////////////////////////
	
	rmbutton1 = new HoverButton(" HOME ");
	rmbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rmbutton1.setBackground(new Color(125,125,125));
	rmbutton1.setForeground(Color.WHITE);
	rmbutton1.setCursor(handcursor);
	rmbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	rmbutton1.setOpaque(false);
    rmbutton1.setContentAreaFilled(false);
    rmbutton1.setBorderPainted(true);
	rmbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton1.setFocusable(false);
		rmbutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	rmbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainmenu m3 = new mainmenu(rmainframe);
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			rmainframe.setJMenuBar(m3.menubar(rmainframe));
			//rmainframe.getContentPane().add(m3.menu(rmainframe));
			rmainframe.setContentPane(m3.menu(rmainframe));
			rmainframe.setVisible(true);
		}		
		
	});	
	
	//------------------------------------------------------	
	rmbutton2 = new HoverButton(" ABOUT ");
	rmbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rmbutton2.setBackground(new Color(125,125,125));
	rmbutton2.setForeground(Color.WHITE);
	rmbutton2.setCursor(handcursor);
	rmbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	rmbutton2.setOpaque(false);
    rmbutton2.setContentAreaFilled(false);
    rmbutton2.setBorderPainted(true);
	rmbutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton2.setFocusable(false);	
	rmbutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});		
	
	rmbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			about abt1 = new about(rmainframe);
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			rmainframe.setJMenuBar(abt1.abmenubar(rmainframe));
			//rmainframe.getContentPane().add(abt1.aboutus(rmainframe));
			rmainframe.setContentPane(abt1.aboutus(rmainframe));
			rmainframe.setVisible(true);
		}		
		
	});	
	//------------------------------------------------------	
	rmbutton3 = new HoverButton(" CONTACT ");
	rmbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rmbutton3.setBackground(new Color(125,125,125));
	rmbutton3.setForeground(Color.WHITE);
	rmbutton3.setCursor(handcursor);
	rmbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	rmbutton3.setOpaque(false);
    rmbutton3.setContentAreaFilled(false);
    rmbutton3.setBorderPainted(true);
	rmbutton3.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton3.setFocusable(false);	
		rmbutton3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		rmbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			
				 contact c = new contact(rmainframe);
			
			rmainframe.setJMenuBar(c.contactbar(rmainframe));
			//mainframe.getContentPane().add(c.contactpage(rmainframe));
			rmainframe.setContentPane(c.contactpage(rmainframe));
			
			rmainframe.setVisible(true);
		}		
		
	});	
	
	//------------------------------------------------------	
	rmbutton4 = new HoverButton(" FEEDBACK ");
	rmbutton4.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rmbutton4.setBackground(new Color(125,125,125));
	rmbutton4.setForeground(Color.WHITE);
	rmbutton4.setCursor(handcursor);
	rmbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	rmbutton4.setOpaque(false);
    rmbutton4.setContentAreaFilled(false);
    rmbutton4.setBorderPainted(true);
	rmbutton4.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton4.setFocusable(false);	
		rmbutton4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		rmbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			
             feedback f = new feedback(rmainframe);
			
			rmainframe.setJMenuBar(f.feedbackbar(rmainframe));
			rmainframe.setContentPane(f.feedbackpage(rmainframe));
			
			rmainframe.setVisible(true);
		}		
		
	});	
	
	
	
	//------------------------------------------------------	
	rmbutton5 = new HoverButton(" REPORT ");
	rmbutton5.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rmbutton5.setBackground(new Color(125,125,125));
	rmbutton5.setForeground(Color.decode("#00c700"));
	rmbutton5.setCursor(handcursor);
	rmbutton5.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#90ee90"), Color.BLACK, Color.BLACK, Color.decode("#90ee90")));
	rmbutton5.setOpaque(false);
    rmbutton5.setContentAreaFilled(false);
    rmbutton5.setBorderPainted(true);
	rmbutton5.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton5.setFocusable(false);	
		rmbutton5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	
		rmbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			
            report r = new report(rmainframe);
			
			rmainframe.setJMenuBar(r.reportbar(rmainframe));
			rmainframe.setContentPane(r.reportpage(rmainframe));
			
			rmainframe.setVisible(true);
		}		
		
	});	
	//------------------------------------------------------	
	rmbutton6 = new HoverButton(" EXIT ");
	rmbutton6.setFont(new Font("Comic Sans",Font.BOLD,18));
	rmbutton6.setBackground(new Color(125,125,125));
	rmbutton6.setForeground(Color.RED);
	rmbutton6.setCursor(handcursor);
	rmbutton6.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
	rmbutton6.setOpaque(false);
    rmbutton6.setContentAreaFilled(false);
    rmbutton6.setBorderPainted(true);
	rmbutton6.setAlignmentX(Component.CENTER_ALIGNMENT);
	rmbutton6.setFocusable(false);
		rmbutton6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	rmbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(rmainframe);
			ex.confirmexit(rmainframe,exitvolume);
		
		}		
		
	});
	//-------------------------------------------------------------------
	
/////////////////////////////////Menubar button add on the menubar label///////////////////////////////////////////////////////

	rmb.add(Box.createRigidArea(new Dimension(10, 0)));
	rmb.add(rmblabel);
	
	rmb.add(labelmbr);
	
	rmb.add(rmbutton1);
	rmb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	rmb.add(rmbutton2);
	rmb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	rmb.add(rmbutton3);
	rmb.add(Box.createRigidArea(new Dimension(25,0)));
	
	rmb.add(rmbutton4);
	rmb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	rmb.add(rmbutton5);
	rmb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	rmb.add(rmbutton6);
	rmb.add(Box.createRigidArea(new Dimension(50, 0)));

return rmb;
 	
}
	
public JPanel reportpage(JFrame frame)
{


rname=false;
rmail=false;
	
rprtcmnt = false;
	
	
	
userproblem=false;
 usercmnt=false;
 useraccused=false;
 accnoneeded=false;
 usersubproblem=false;
	
 softproblem=false;
 softcmnt=false;
 softsubproblem=false;

 accproblem=false;
 acccmnt=false;
 accsubproblem=false;	

	
	
 optionuser=false;
 optionsoftware=false;
 optionaccount=false;


///////////////////////////pannel initialize/////////////////////////

	reportmainpanel = new JPanel();
    reportmainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	reportmainpanel.setBackground(Color.decode("#191919"));
	reportmainpanel.setLayout(new BoxLayout(reportmainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	reportmainpanel.setBorder(null);////////////////top<Left<bottom<right
	reportmainpanel.setOpaque(false);
   
/////////////////////backgroud panel on which the image is on/////////////////////////////
	
	reportimgpanel = new JPanel();
	reportimgpanel.setBackground(Color.decode("#00000"));
	reportimgpanel.setLayout(new GridLayout(1,1,0,0));
	reportimgpanel.setBorder(null);
	reportimgpanel.setMinimumSize(new Dimension(100, 0));
	reportimgpanel.setPreferredSize(new Dimension(100, 0));

/////////////////////feedback page wallpaper/////////////////////////////

	Image rprtimg1 = null;
	try
	{
		
        rprtimg1 = ImageIO.read(new File("Resources/Images/Report/reportpage_background_picture.png"));//900*500
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	
	ImagePanel backimgreport= new ImagePanel(rprtimg1);
	backimgreport.setBackground(Color.decode("#00000"));
	backimgreport.setLayout(new BoxLayout(backimgreport, BoxLayout.Y_AXIS));
	backimgreport.setMinimumSize(new Dimension(100, 0));
	backimgreport.setPreferredSize(new Dimension(100, 0));
	backimgreport.setBorder(new EmptyBorder(1,1,1,1));
	
	Dimension screensize;
		screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	JPanel paneltransparent = new JPanel();
	paneltransparent.setBackground(new Color(125,125,125,50));
	paneltransparent.setLayout(new BoxLayout(paneltransparent, BoxLayout.Y_AXIS));
	paneltransparent.setAlignmentX(Component.CENTER_ALIGNMENT);
	paneltransparent.setMinimumSize(new Dimension(100, 0));
	paneltransparent.setPreferredSize(new Dimension(100, 0));
	paneltransparent.setMaximumSize(new Dimension(screensize.width, screensize.height));
paneltransparent.setBorder(new EmptyBorder(0,350,0,350));
/////////////////////////Transparent mid panel in which the text form is located/////////////////////////////
	
	midpaneltransparent = new JPanel();
	midpaneltransparent.setBackground(new Color(255,105,97,80));
	midpaneltransparent.setLayout(new BoxLayout(midpaneltransparent, BoxLayout.Y_AXIS));
	midpaneltransparent.setAlignmentX(Component.CENTER_ALIGNMENT);
	midpaneltransparent.setMinimumSize(new Dimension(100, 100));
	midpaneltransparent.setPreferredSize(new Dimension(100, 100));
	midpaneltransparent.setMaximumSize(new Dimension(830, screensize.height));
	midpaneltransparent.setBorder(new EmptyBorder(1,1,1,1));

///////////////////////////////////Title of feedback page/////////////////////////////////////
	
	reportpagetitle = new JLabel("<html><font color=#FFFFFFF>Report Form</font></html>");
	reportpagetitle.setFont(new Font("Times New Roman",Font.PLAIN,40));
	reportpagetitle.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	reportpagetitle.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	reportpagetitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	reportpagetitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	reportpagetitle.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	reportpagetitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	reportpagetitle.setCursor(textcursor);	

///////////////////////////////////Certification of RAW/////////////////////////////////////

	reportpagelowtitle = new JLabel("<html><font color=#a9a9a9>All Rights Reserved By TEAM@RAW</font></html>");
	reportpagelowtitle.setFont(new Font("Times New Roman",Font.PLAIN,12));
	reportpagelowtitle.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	reportpagelowtitle.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	reportpagelowtitle.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	reportpagelowtitle.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	reportpagelowtitle.setAlignmentX(Component.CENTER_ALIGNMENT);
	reportpagelowtitle.setCursor(textcursor);
	
/////////////////////////Label 1 on the mid transparent panel/////////////////////////////
	
	label1midpan = new JLabel("<html>&nbsp;&nbsp;&nbsp;Welcome To Our Report Section.</html>");
	label1midpan.setFont(new Font("Arial",Font.PLAIN,18));
	label1midpan.setForeground(Color.decode("#f0ffff"));
	label1midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label1midpan.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	label1midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label1midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label1midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label1midpan.setCursor(textcursor);
	
/////////////////////////Label 2 on the mid transparent panel/////////////////////////////
	
	label2midpan = new JLabel("<html><font>&nbsp;&nbsp;&nbsp;Please select the option whome you going to report? <font color=#ff0000>*</font></html>");
	label2midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label2midpan.setForeground(Color.decode("#aed6dc"));
	label2midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label2midpan.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	label2midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label2midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label2midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label2midpan.setCursor(textcursor);
	
/////////////////////////Panel for Buttons/////////////////////////////
	
	buttnpan1 = new JPanel();
	buttnpan1.setBackground(new Color(255,105,97,50));
	buttnpan1.setLayout(new BoxLayout(buttnpan1, BoxLayout.Y_AXIS));
	buttnpan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttnpan1.setMinimumSize(new Dimension(1000, 200));
	buttnpan1.setPreferredSize(new Dimension(1000, 200));
	buttnpan1.setMaximumSize(new Dimension(1000, 200));
	
	buttnpan2 = new RoundedPanel(10,new Color(255,105,97,50));
	buttnpan2.setBackground(new Color(255,105,97,50));
	buttnpan2.setLayout(new BoxLayout(buttnpan2, BoxLayout.Y_AXIS));
	buttnpan2.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttnpan2.setMinimumSize(new Dimension(750, 50));
	buttnpan2.setPreferredSize(new Dimension(750, 50));
	buttnpan2.setMaximumSize(new Dimension(750, 50));
	
	buttnpan3 = new RoundedPanel(10,new Color(255,105,97,50));
	buttnpan3.setBackground(new Color(255,105,97,50));
	buttnpan3.setLayout(new BoxLayout(buttnpan3, BoxLayout.Y_AXIS));
	buttnpan3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttnpan3.setMinimumSize(new Dimension(750, 50));
	buttnpan3.setPreferredSize(new Dimension(750, 50));
	buttnpan3.setMaximumSize(new Dimension(750, 50));
	
	buttnpan4 = new RoundedPanel(10,new Color(255,105,97,50));
	buttnpan4.setBackground(new Color(255,105,97,50));
	buttnpan4.setLayout(new BoxLayout(buttnpan4, BoxLayout.Y_AXIS));
	buttnpan4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttnpan4.setMinimumSize(new Dimension(750, 50));
	buttnpan4.setPreferredSize(new Dimension(750, 50));
	buttnpan4.setMaximumSize(new Dimension(750, 50));
	buttnpan4.setOpaque(true);

/////////////////////////Buttons on the panel/////////////////////////////

	Border sendbttnborder = new LineBorder(new Color(255,105,97));
	
	rprtbttn1 = new RoundedCornerButton("  User  ");
	rprtbttn1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtbttn1.setBackground(new Color(0,0,0));
	rprtbttn1.setForeground(new Color(255,99,71));
	rprtbttn1.setCursor(handcursor);
	rprtbttn1.setBorder(sendbttnborder);
	rprtbttn1.setOpaque(false);
	rprtbttn1.setEnabled(true);
    rprtbttn1.setContentAreaFilled(false);
    rprtbttn1.setBorderPainted(true);
	rprtbttn1.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtbttn1.setFocusable(false);
	rprtbttn1.setMinimumSize(new Dimension(750, 50));
	rprtbttn1.setPreferredSize(new Dimension(750, 50));
	rprtbttn1.setMaximumSize(new Dimension(750, 50));

	rprtbttn1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",buttonvolume);
		
		}		
		
	});	
	
	
	
	rprtbttn1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",buttonclickvolume);
			userproblem=false;
	        usercmnt=false;
	        useraccused=false;
			accnoneeded=false;
	        usersubproblem=false;
			 softproblem=false;
 softcmnt=false;
 softsubproblem=false;

 accproblem=false;
 acccmnt=false;
 accsubproblem=false;	
    		userreport(rmainframe);	
		}		
		
	});

	
	rprtbttn2 = new RoundedCornerButton(" Software ");
	rprtbttn2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtbttn2.setBackground(new Color(0,0,0));
	rprtbttn2.setForeground(new Color(255,99,71));//50,205,50
	rprtbttn2.setCursor(handcursor);
	rprtbttn2.setBorder(sendbttnborder);
	rprtbttn2.setOpaque(false);
    rprtbttn2.setContentAreaFilled(false);
    rprtbttn2.setBorderPainted(true);
	rprtbttn2.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtbttn2.setFocusable(false);	
	rprtbttn2.setMinimumSize(new Dimension(800, 50));
	rprtbttn2.setPreferredSize(new Dimension(800, 50));
	rprtbttn2.setMaximumSize(new Dimension(800, 50));

	rprtbttn2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",buttonvolume);
		
		}		
		
	});	
	
	rprtbttn2.setMaximumSize(new Dimension(1000, 50));
		rprtbttn2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",buttonclickvolume);
		
	userproblem=false;
	        usercmnt=false;
	        useraccused=false;
			accnoneeded=false;
	        usersubproblem=false;
			 softproblem=false;
 softcmnt=false;
 softsubproblem=false;

 accproblem=false;
 acccmnt=false;
 accsubproblem=false;
		softwarereport(rmainframe);
		
		}		
		
	});
	
	
	
	rprtbttn3 = new RoundedCornerButton("  Account ");
	rprtbttn3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtbttn3.setBackground(new Color(0,0,0));
	rprtbttn3.setForeground(new Color(255,99,71));
	rprtbttn3.setCursor(handcursor);
	rprtbttn3.setBorder(sendbttnborder);
	rprtbttn3.setOpaque(false);
    rprtbttn3.setContentAreaFilled(false);
    rprtbttn3.setBorderPainted(true);
	rprtbttn3.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtbttn3.setFocusable(false);
	rprtbttn3.setMinimumSize(new Dimension(800, 50));
	rprtbttn3.setPreferredSize(new Dimension(800, 50));
	rprtbttn3.setMaximumSize(new Dimension(800, 50));
	rprtbttn3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",buttonvolume);
		
		}		
		
	});	
	
	rprtbttn3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",buttonclickvolume);
				userproblem=false;
	        usercmnt=false;
	        useraccused=false;
	        accnoneeded=false;
	        usersubproblem=false;
			 softproblem=false;
 softcmnt=false;
 softsubproblem=false;

 accproblem=false;
 acccmnt=false;
 accsubproblem=false;
		accountreport(rmainframe);
		
		}		
		
	});
/////////////////////////Label 2 on the mid transparent panel/////////////////////////////
	
	label3midpan = new JLabel("<html>Instructions</html>");
	label3midpan.setFont(new Font("Times New Roman",Font.BOLD,20));
	label3midpan.setForeground(Color.decode("#32cd32"));
	label3midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label3midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label3midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label3midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label3midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label3midpan.setCursor(textcursor);
	
	label4midpan = new JLabel("<html>Any issues regarding any users(Both buyer and seller), you can report on our user report section.</html>");
	label4midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label4midpan.setForeground(Color.decode("#aed6dc"));
	label4midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label4midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label4midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label4midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label4midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label4midpan.setCursor(textcursor);
	
	label5midpan = new JLabel("<html>Are you facing hassel with our software? Please let us know to make it easier. </html>");
	label5midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label5midpan.setForeground(Color.decode("#aed6dc"));
	label5midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label5midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label5midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label5midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label5midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label5midpan.setCursor(textcursor);
	
	label6midpan = new JLabel("<html>Reporting on any account issue, you can report on the account section.</html>");
	label6midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label6midpan.setForeground(Color.decode("#aed6dc"));
	label6midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label6midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label6midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label6midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label6midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label6midpan.setCursor(textcursor);
	
	label7midpan = new JLabel("<html>For other issues, directly contact with Admin through 'Contact Us' option</html>");
	label7midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label7midpan.setForeground(Color.decode("#aed6dc"));
	label7midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label7midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label7midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label7midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label7midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label7midpan.setCursor(textcursor);
	
	label8midpan = new JLabel(" ");
	label8midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label8midpan.setForeground(Color.decode("#aed6dc"));
	label8midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label8midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label8midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label8midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label8midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label8midpan.setCursor(textcursor);
	
	label9midpan = new JLabel(" ");
	label9midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label9midpan.setForeground(Color.decode("#aed6dc"));
	label9midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label9midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label9midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label9midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label9midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label9midpan.setCursor(textcursor);
	
	label10midpan = new JLabel(" ");
	label10midpan.setFont(new Font("Times New Roman",Font.PLAIN,17));
	label10midpan.setForeground(Color.decode("#aed6dc"));
	label10midpan.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label10midpan.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label10midpan.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label10midpan.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label10midpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	label10midpan.setCursor(textcursor);
	
	lowpanforins = new JPanel();
	lowpanforins.setBackground(new Color(50,20,20));
	lowpanforins.setLayout(new BoxLayout(lowpanforins, BoxLayout.Y_AXIS));
	lowpanforins.setAlignmentX(Component.CENTER_ALIGNMENT);
	lowpanforins.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	lowpanforins.setMinimumSize(new Dimension(1000, 80));
	lowpanforins.setMaximumSize(new Dimension(1000, 130));
	
	
////////////////////////////////////////Lower left panel in which email and name textfield are located//////////////////////////////////////////////
	
	lowpanmailname = new JPanel();
	lowpanmailname.setBackground(new Color(0,0,0,150));
	lowpanmailname.setLayout(new BoxLayout(lowpanmailname, BoxLayout.X_AXIS));
	lowpanmailname.setAlignmentX(Component.CENTER_ALIGNMENT);
	lowpanmailname.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	lowpanmailname.setMinimumSize(new Dimension(1000, 80));
	lowpanmailname.setMaximumSize(new Dimension(1000, 100));
///////////////////////////////////text field for name /////////////////////////////////////

	nametxt = new HintTextField("Please enter your name");//border ac-border inactive
	
		nametxt.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent revt) 
			{
                if ((Character.isDigit(revt.getKeyChar()) || revt.getKeyChar() == '@' || revt.getKeyChar() == '$' || revt.getKeyChar() == '#' || revt.getKeyChar() == '%'  || revt.getKeyChar() == '&' || revt.getKeyChar() == '*' || revt.getKeyChar() == '!' || revt.getKeyChar() == '-' || revt.getKeyChar() == '+' || revt.getKeyChar() == '/' || revt.getKeyChar() == ';' || revt.getKeyChar() == ':' || revt.getKeyChar() == '>' || revt.getKeyChar() == '<' || revt.getKeyChar() == '?' || revt.getKeyChar() == '{' || revt.getKeyChar() == '}' || revt.getKeyChar() == '[' || revt.getKeyChar() == ']' || revt.getKeyChar() == '(' || revt.getKeyChar() == ')' || revt.getKeyChar() == '_' || revt.getKeyChar() == ',' || revt.getKeyChar() == '"' || revt.getKeyChar() == '=' || revt.getKeyChar() == '~' || revt.getKeyChar() == '`' || revt.getKeyChar() == '^' || revt.getKeyChar() == '|'))
				{	
                    revt.consume();
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
			if (nametxt.getText().length() > 0 && nametxt.getText().length() < 100) // limit textfield
			{
				rname = true;
				charlimit();
			}
			if(nametxt.getText().length() <= 0 || nametxt.getText().length() >= 100)
			{
				rname = false;
				charlimit();
			}	
			if(nametxt.getText().length() >= 100)
			{
				rname = false;
				charlimit();				
				revt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}			
				
            }
        });
		
		
	nametxt.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	nametxt.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	nametxt.activebgColor=Color.decode("#612b29");
	nametxt.inactivebgColor=Color.decode("#48201e");
	nametxt.activefgColor=Color.WHITE;////////////color on type
	nametxt.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	nametxt.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	nametxt.magColorM=Color.RED;///////// color if user click and unfill/ignore
	nametxt.setFont(new Font("Arial",Font.PLAIN,12));
	nametxt.setForeground(Color.decode("#FFFFFF"));
	nametxt.setBackground(Color.decode("#612b29"));
	nametxt.setColumns(30);
	nametxt.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    nametxt.addMouseListener(new FieldMouseListener());
	nametxt.setCaretColor(Color.WHITE);
	nametxt.setMinimumSize(new Dimension(100, 40));
	nametxt.setPreferredSize(new Dimension(100, 40));	

///////////////////////////////////text field for name /////////////////////////////////////
	
	mailtxt = new HintTextField("Please enter your email");//border ac-border inactive

		mailtxt.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent revt) 
			{
				
			if (mailtxt.getText().length() > 0 && mailtxt.getText().length() < 100) // limit textfield
			{
				rmail = true;
				charlimit();
			}
			if(mailtxt.getText().length() <= 0 || mailtxt.getText().length() >= 100)
			{
				rmail = false;
				charlimit();
			}
			if(mailtxt.getText().length() >= 100)
			{
				rmail = false;
				charlimit();
				revt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			
            }
        });

	
	mailtxt.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	mailtxt.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	mailtxt.activebgColor=Color.decode("#612b29");
	mailtxt.inactivebgColor=Color.decode("#48201e");
	mailtxt.activefgColor=Color.WHITE;////////////color on type
	mailtxt.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	mailtxt.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	mailtxt.magColorM=Color.RED;///////// color if user click and unfill/ignore
	mailtxt.setFont(new Font("Arial",Font.PLAIN,12));
	mailtxt.setForeground(Color.decode("#FFFFFF"));
	mailtxt.setBackground(Color.decode("#612b29"));
	mailtxt.setColumns(30);
	mailtxt.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    mailtxt.addMouseListener(new FieldMouseListener());
	mailtxt.setCaretColor(Color.WHITE);
	mailtxt.setMinimumSize(new Dimension(100, 40));
	mailtxt.setPreferredSize(new Dimension(100, 40));
	
///////////////////////////////////Add mid panel on the background image /////////////////////////////////////


	sbttnborder = new LineBorder(Color.RED, 1);
	
	rprtsubmitbttn = new JButton(" SUBMIT ");
	rprtsubmitbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtsubmitbttn.setBackground(new Color(125,125,125));
	rprtsubmitbttn.setForeground(Color.BLACK);
	rprtsubmitbttn.setCursor(handcursor);
	rprtsubmitbttn.setBorder(sbttnborder);
	rprtsubmitbttn.setOpaque(false);
	rprtsubmitbttn.setEnabled(false);
    rprtsubmitbttn.setContentAreaFilled(false);
    rprtsubmitbttn.setBorderPainted(true);
	rprtsubmitbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtsubmitbttn.setFocusable(false);
	
    rprtsubmitbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
	rprtsubmitbttn.addActionListener(new ActionListener() 
	{
		@Override
		
    public void actionPerformed(ActionEvent e)
	{
		MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
		String rprtemail = mailtxt.getText();
		String rprtname = nametxt.getText();
		boolean flag = false;
		
		if(mailcheck(rprtemail)==false)
		{
			label8midpan.setText("Sorry your mail id is containing wrong pattern.");
			label9midpan.setText("Please try again.");
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			flag = false;
		}
		if(mailcheck(rprtemail)==true)
		{
			label8midpan.setText(" ");
			label9midpan.setText(" ");
			flag = true;
		}
		
		if(flag == true)
		{
			if(optionuser == true)
			{
				reportsection = "User";
			    lastsubmitusername = rprtname;
	            lastsubmitusermail = rprtemail;
	
	            lastsubmitaccusename = accusedname;
	            lastsubmitaccusemail = accusedmail;
	
	            lastsubmitproblem = problem;
	            lastsubmitsubproblem = subproblem;
	            lastsubmitcomment = rprtlastcomment;
				
				rprtbttn2.setEnabled(false);
				rprtbttn3.setEnabled(false);
		    }
			
			if(optionsoftware == true)
			{
				reportsection = "Software";

				lastsubmitusername = rprtname;
	            lastsubmitusermail = rprtemail;
				
				lastsubmitaccusename = "N/A";
	            lastsubmitaccusemail = "N/A";
				
				lastsubmitproblem = sproblem;
	            lastsubmitsubproblem = ssubproblem;
	            lastsubmitcomment = srprtlastcomment;
				
				rprtbttn1.setEnabled(false);
				rprtbttn3.setEnabled(false);
				
			}
			
			if(optionaccount == true)
			{
				reportsection = "Account";
				lastsubmitusername = rprtname;
	            lastsubmitusermail = rprtemail;
				
				lastsubmitaccusename = "N/A";
	            lastsubmitaccusemail = "N/A";
				lastbankaccountno = bankaccountno;

				lastsubmitproblem = aproblem;
	            lastsubmitsubproblem = asubproblem;
	            lastsubmitcomment = arprtlastcomment;
				
				rprtbttn1.setEnabled(false);
				rprtbttn2.setEnabled(false);
				
			}
			
	timeraw t=new timeraw();
	rawip rp = new rawip(); 
	
	FULL_NAME =lastsubmitusername;
	EMAIL =lastsubmitusermail;
	REPORT_SECTION =reportsection;
	SUSPECT_EMAIL =lastsubmitaccusemail;
	BANK_ACCOUNT_NO =lastbankaccountno;
	PROBLEM_TYPE =lastsubmitproblem;
	SUB_PROBLEM_TYPE =lastsubmitsubproblem;
	ADDITIONAL_COMMENT =lastsubmitcomment;
	SENDING_TIME = t.intime();
	SENDING_IP = rp.localhostaddress()+"\n"+rp.publicipaddress();
	REPORT_CONDITION ="Pending";
	INVESTIGATION_TIME ="N/A";
	WARNING_TIME ="N/A";
	CLOSING_TIME ="N/A";
	HANDLER_EMAIL ="N/A";
	SOLUTION ="N/A";
	USER_SATISFACTION ="N/A";			
			
			
			
try{	
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();

		String searchquery="SELECT * FROM `report` WHERE EMAIL='"+ lastsubmitusermail+"' AND REPORT_CONDITION='Closed'";

		
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(result.next())
		{
			insmsglabel1.setText("Sorry, your previous report is under Survillance.");
				insmsglabel2.setText("Please try again.");
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			submitbttn.setEnabled(false);
		}
















     try{
			String reportquery = "INSERT INTO `report`(`FULL_NAME`, `EMAIL`, `REPORT_SECTION`, `SUSPECT_EMAIL`, `BANK_ACCOUNT_NO`, `PROBLEM_TYPE`, `SUB_PROBLEM_TYPE`, `ADDITIONAL_COMMENT`, `SENDING_TIME`, `SENDING_IP`, `REPORT_CONDITION`, `INVESTIGATION_TIME`, `WARNING_TIME`, `CLOSING_TIME`, `HANDLER_EMAIL`, `SOLUTION`, `USER_SATISFACTION`) VALUES ('"+FULL_NAME+"','"+EMAIL+"','"+REPORT_SECTION+"','"+SUSPECT_EMAIL+"','"+BANK_ACCOUNT_NO+"','"+PROBLEM_TYPE+"','"+SUB_PROBLEM_TYPE+"','"+ADDITIONAL_COMMENT+"','"+SENDING_TIME+"','"+SENDING_IP+"','"+REPORT_CONDITION+"','"+INVESTIGATION_TIME+"','"+WARNING_TIME+"','"+CLOSING_TIME+"','"+HANDLER_EMAIL+"','"+SOLUTION+"','"+USER_SATISFACTION+"');";
			statement.executeUpdate(reportquery);
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

			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);

				midpaneltransparent.removeAll();
				midpaneltransparent.add(rprtaftersubmitpane(midpaneltransparent));
				midpaneltransparent.revalidate();
		
		}
    }
	});
	

///////////////////////////////////Add mid panel on the background image /////////////////////////////////////
    
    backimgreport.add(Box.createRigidArea(new Dimension(0, 10)));
	backimgreport.add(reportpagetitle);
   	
	//buttnpan1.add(Box.createRigidArea(new Dimension(0, 10)));
	
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label1midpan);

	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label2midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 15)));

	buttnpan2.add(rprtbttn1);
	buttnpan3.add(rprtbttn2);
	buttnpan4.add(rprtbttn3);
	
	buttnpan1.add(Box.createRigidArea(new Dimension(0, 5)));
	buttnpan1.add(buttnpan2);
	buttnpan1.add(Box.createRigidArea(new Dimension(0, 20)));
	buttnpan1.add(buttnpan3);
	buttnpan1.add(Box.createRigidArea(new Dimension(0, 20)));
	buttnpan1.add(buttnpan4);
	buttnpan1.add(Box.createRigidArea(new Dimension(0, 5)));

	
	midpaneltransparent.add(buttnpan1);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	
	midpaneltransparent.add(label3midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label4midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label5midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label6midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	midpaneltransparent.add(label7midpan);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 20)));

	lowpanmailname.add(Box.createRigidArea(new Dimension(0, 5)));
	lowpanmailname.add(nametxt);
	
	lowpanmailname.add(Box.createRigidArea(new Dimension(10, 0)));
	lowpanmailname.add(mailtxt);
	
	midpaneltransparent.add(lowpanmailname);
	midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 5)));
	
	lowpanforins.add(label8midpan);
	lowpanforins.add(Box.createRigidArea(new Dimension(0, 5)));
    lowpanforins.add(label9midpan);
	lowpanforins.add(Box.createRigidArea(new Dimension(0, 3)));
	lowpanforins.add(label10midpan);
	lowpanforins.add(Box.createRigidArea(new Dimension(0, 0)));
	lowpanforins.add(rprtsubmitbttn);
	lowpanforins.add(Box.createRigidArea(new Dimension(0, 1)));
	
	midpaneltransparent.add(lowpanforins);

	//midpaneltransparent.add(rprtsubmitbttn);
	//midpaneltransparent.add(Box.createRigidArea(new Dimension(0, 1000)));

	paneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	paneltransparent.add(midpaneltransparent);
	paneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	paneltransparent.add(reportpagelowtitle);
	paneltransparent.add(Box.createRigidArea(new Dimension(0, 10)));
	
	backimgreport.add(paneltransparent);
	reportimgpanel.add(backimgreport);
	reportmainpanel.add(reportimgpanel);			
	
	return reportmainpanel;
	
}

public JDialog userreport(JFrame frame)
{
	
	optionuser = false;
	optionsoftware = false;
	optionaccount = false;
	
	
	JRadioButton rjrb1,rjrb2,rjrb3,rjrb4,rjrb5,rjrb6,rjrb7,rjrb8,rjrb9,rjrb10,rjrb11,rjrb12,rjrb13,rjrb14,rjrb15;
	HintTextArea cmntbox;
	HintTextField elsetxt,rprtusernamefield;
	JScrollPane scrl;
	JButton rprtcnclbttn;
	
	
	rjrb1 = new JRadioButton();
	rjrb2 = new JRadioButton();
	rjrb3 = new JRadioButton();
	rjrb4 = new JRadioButton();
	rjrb5 = new JRadioButton();
	rjrb6 = new JRadioButton();
	rjrb7 = new JRadioButton();
	rjrb8 = new JRadioButton();
	rjrb9 = new JRadioButton();
	rjrb10 = new JRadioButton();
	rjrb11 = new JRadioButton();	
	rjrb12 = new JRadioButton();
	rjrb13 = new JRadioButton();
	rjrb14 = new JRadioButton();
	rjrb15 = new JRadioButton();


	JDialog userdialog = new JDialog(frame,"Report to user",true);
	Point loc = frame.getLocation();
    userdialog.setLocation(loc.x+80,loc.y+80);
	userdialog.setSize(frame.getWidth()-250,frame.getHeight()-100);
 
    
    JPanel usermainpan = new JPanel();
    usermainpan.setSize((userdialog.getWidth()), (userdialog.getHeight()));
	usermainpan.setBackground(Color.decode("#0f0f0f"));
	usermainpan.setLayout(new BoxLayout(usermainpan, BoxLayout.Y_AXIS));
	usermainpan.setBorder(new EmptyBorder(0,0,0,0));
	usermainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	usermainpan.setMinimumSize(new Dimension(userdialog.getWidth(), userdialog.getHeight()));
	usermainpan.setPreferredSize(new Dimension(userdialog.getWidth(), userdialog.getHeight()));
	usermainpan.setMaximumSize(new Dimension(userdialog.getWidth(), userdialog.getHeight()));
	
	JPanel lab1pan1 = new JPanel();
    lab1pan1.setSize((userdialog.getWidth()), (userdialog.getHeight()));
	lab1pan1.setBackground(Color.decode("#000000"));
	lab1pan1.setLayout(new BoxLayout(lab1pan1, BoxLayout.Y_AXIS));
	lab1pan1.setBorder(new EmptyBorder(0,0,0,0));
	lab1pan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel userlabel1 = new JLabel("<html>Report</html>");
	userlabel1.setFont(new Font("Times New Roman",Font.BOLD,26));
	userlabel1.setForeground(Color.decode("#0000cd"));
	userlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userlabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	userlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	userlabel1.setCursor(textcursor);
	
	
	JPanel rprtusernamefieldpan = new JPanel();
	rprtusernamefieldpan.setBackground(new Color(14,14,14,150));
	rprtusernamefieldpan.setLayout(new BoxLayout(rprtusernamefieldpan, BoxLayout.Y_AXIS));
	rprtusernamefieldpan.setBorder(new EmptyBorder(0,0,0,0));
	rprtusernamefieldpan.setMinimumSize(new Dimension(1000, 60));
	rprtusernamefieldpan.setMaximumSize(new Dimension(10000, 120));
	
	
	rprtusernamefield = new HintTextField("Enter user email id");//border ac-border inactive	
	rprtusernamefield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	rprtusernamefield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	rprtusernamefield.activebgColor=Color.decode("#2C2F33");
	rprtusernamefield.inactivebgColor=Color.decode("#23272A");
	rprtusernamefield.activefgColor=Color.WHITE;////////////color on type
	rprtusernamefield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	rprtusernamefield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	rprtusernamefield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	rprtusernamefield.setFont(new Font("Arial",Font.PLAIN,12));
	rprtusernamefield.setForeground(Color.decode("#FFFFFF"));
	rprtusernamefield.setBackground(Color.decode("#2C2F33"));
	rprtusernamefield.setColumns(30);
	rprtusernamefield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    rprtusernamefield.addMouseListener(new FieldMouseListener());
	rprtusernamefield.setCaretColor(Color.WHITE);
	rprtusernamefield.setMinimumSize(new Dimension(100, 50));
	rprtusernamefield.setPreferredSize(new Dimension(100, 50));	
	rprtusernamefield.setMaximumSize(new Dimension(1000, 50));
	
	rprtusernamefield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
			if (rprtusernamefield.getText().length() > 0 && rprtusernamefield.getText().length() < 100) // limit textfield
			{
				useraccused = true;
				usercharlimit();
			}
			if(rprtusernamefield.getText().length() <= 0 || rprtusernamefield.getText().length() >= 100)
			{
				useraccused = false;
				usercharlimit();
			}
			if(rprtusernamefield.getText().length() >= 100)
			{
				useraccused = false;
				usercharlimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			
            }
        });	
	
	
	JLabel rprtusernamefieldlabel = new JLabel("<html>Enter user email id</html>");
	rprtusernamefieldlabel.setFont(new Font("Times New Roman",Font.PLAIN,17));
	rprtusernamefieldlabel.setForeground(Color.decode("#aed6dc"));
	rprtusernamefieldlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	rprtusernamefieldlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	rprtusernamefieldlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	rprtusernamefieldlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	rprtusernamefieldlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtusernamefieldlabel.setCursor(textcursor);
	
	JLabel userlabel2 = new JLabel("Please select a problem to continue");
	userlabel2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	userlabel2.setForeground(Color.decode("#aed6dc"));
	userlabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userlabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userlabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userlabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userlabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	userlabel2.setCursor(textcursor);
   
    JLabel userlabel3 = new JLabel("You can report a user problem after selecting a problem");
	userlabel3.setFont(new Font("Times New Roman",Font.PLAIN,17));
	userlabel3.setForeground(Color.decode("#aed6dc"));
	userlabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userlabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userlabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userlabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userlabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	userlabel3.setCursor(textcursor);
	
	JLabel userlabel4 = new JLabel("<html>Can you give us some more details</html>");
	userlabel4.setFont(new Font("Times New Roman",Font.PLAIN,17));
	userlabel4.setForeground(Color.decode("#aed6dc"));
	userlabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userlabel4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userlabel4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userlabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userlabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
	userlabel4.setCursor(textcursor);
	
//////////////////////////////////Button group panel///////////////////////////////////////////////////
	
	JPanel lab1pan2 = new JPanel();
    lab1pan2.setSize((userdialog.getWidth()), (userdialog.getHeight()));
	lab1pan2.setBackground(Color.decode("#0f0f0f")); //////////////////////////// #23272A
	lab1pan2.setLayout(new BoxLayout(lab1pan2, BoxLayout.Y_AXIS));
	lab1pan2.setBorder(new EmptyBorder(0,0,0,0));
	lab1pan2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////Extra comment panel///////////////////////////////////////////////////
	
	JPanel lab1pan3 = new JPanel();
    lab1pan3.setSize((userdialog.getWidth()), (userdialog.getHeight()));
	lab1pan3.setBackground(Color.decode("#191919")); //////////////////////////// #23272A
	lab1pan3.setLayout(new BoxLayout(lab1pan3, BoxLayout.Y_AXIS));
	lab1pan3.setBorder(new EmptyBorder(0,0,0,0));
	lab1pan3.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	elsetxt = new HintTextField("Please let us know what your exact problem is");//border ac-border inactive
	
	
	elsetxt.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (elsetxt.getText().length() >= 20 && elsetxt.getText().length() <= 3000) // limit textfield
			{
				usersubproblem = true;
				usercharlimit();
			}
			else 
			{
				usersubproblem = false;
				usercharlimit();			
			}
    }
	});	
	
	
	
	elsetxt.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	elsetxt.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	elsetxt.activebgColor=Color.decode("#2C2F33");
	elsetxt.inactivebgColor=Color.decode("#23272A");
	elsetxt.activefgColor=Color.WHITE;////////////color on type
	elsetxt.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	elsetxt.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	elsetxt.magColorM=Color.RED;///////// color if user click and unfill/ignore
	elsetxt.setFont(new Font("Arial",Font.PLAIN,12));
	elsetxt.setForeground(Color.decode("#FFFFFF"));
	elsetxt.setBackground(Color.decode("#2C2F33"));
	elsetxt.setColumns(30);
	elsetxt.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    elsetxt.addMouseListener(new FieldMouseListener());
	elsetxt.setCaretColor(Color.WHITE);
	elsetxt.setMinimumSize(new Dimension(100, 50));
	elsetxt.setPreferredSize(new Dimension(100, 50));	
	elsetxt.setMaximumSize(new Dimension(1000, 50));
	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	rjrb1.setText(" Pretending to be someone ");
	rjrb1.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb1.setBackground(Color.decode("#191919"));
	rjrb1.setForeground(Color.decode("#c7c7c7"));
	rjrb1.setCursor(handcursor);
	rjrb1.setOpaque(true);
	//rjrb1.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb1.setBorderPainted(true);
	rjrb1.setFocusable(false);
	rjrb1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		rjrb1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb1.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				
				lab1pan3.removeAll();
				lab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				lab1pan3.add(userlabel4);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				lab1pan3.add(rjrb9);
				lab1pan3.add(rjrb10);
				lab1pan3.add(rjrb11);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				lab1pan3.setVisible(true);
				usermainpan.revalidate();
				
				
				userproblem = true;
			    usercharlimit();
				
			}
		}		
		
	});
	
	rjrb2.setText(" Fake Name ");
	rjrb2.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb2.setBackground(Color.decode("#191919"));
	rjrb2.setForeground(Color.decode("#c7c7c7"));
	rjrb2.setCursor(handcursor);
	rjrb2.setOpaque(true);
	//rjrb2.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb2.setBorderPainted(true);
	rjrb2.setFocusable(false);
	rjrb2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		rjrb2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb2.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.setVisible(false);
				userproblem = true;
			    usersubproblem = true;
				usercharlimit();
			}
		}		
		
	});
	
	rjrb3.setText(" Fake Account ");
	rjrb3.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb3.setBackground(Color.decode("#191919"));
	rjrb3.setForeground(Color.decode("#c7c7c7"));
	rjrb3.setCursor(handcursor);
	rjrb3.setOpaque(true);
	//rjrb3.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb3.setBorderPainted(true);
	rjrb3.setFocusable(false);
	rjrb3.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb3.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.setVisible(false);
				userproblem = true;
			    usersubproblem = true;
				usercharlimit();
			}
		}		
		});	
	rjrb4.setText(" Posting Inappropriate Things ");
	rjrb4.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb4.setBackground(Color.decode("#191919"));
	rjrb4.setForeground(Color.decode("#c7c7c7"));
	rjrb4.setCursor(handcursor);
	rjrb4.setOpaque(true);
	//rjrb4.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb4.setBorderPainted(true);
	rjrb4.setFocusable(false);
	rjrb4.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb4.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.setVisible(false);
				userproblem = true;
			    usersubproblem = true;
				usercharlimit();
			}
		}		
		});
		
	rjrb5.setText(" Harassment or Bullying ");
	rjrb5.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb5.setBackground(Color.decode("#191919"));
	rjrb5.setForeground(Color.decode("#c7c7c7"));
	rjrb5.setCursor(handcursor);
	rjrb5.setOpaque(true);
	//rjrb5.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb5.setBorderPainted(true);
	rjrb5.setFocusable(false);
	rjrb5.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb5.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.setVisible(false);
				userproblem = true;
			    usersubproblem = true;
				usercharlimit();
			}
		}		
		});		
	
	rjrb6.setText(" I can't access to my account ");
	rjrb6.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb6.setBackground(Color.decode("#191919"));
	rjrb6.setForeground(Color.decode("#c7c7c7"));
	rjrb6.setCursor(handcursor);
	rjrb6.setOpaque(true);
	//rjrb6.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb6.setBorderPainted(true);
	rjrb6.setFocusable(false);
	rjrb6.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb6.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb6.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.setVisible(false);
				userproblem = true;
				usersubproblem = true;
			    usercharlimit();
			}
		}		
		});	
		
	rjrb7.setText(" I want to help ");
	rjrb7.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb7.setBackground(Color.decode("#191919"));
	rjrb7.setForeground(Color.decode("#c7c7c7"));
	rjrb7.setCursor(handcursor);
	rjrb7.setOpaque(true);
	//rjrb7.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb7.setBorderPainted(true);
	rjrb7.setFocusable(false);
	rjrb7.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb7.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb7.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.removeAll();				
				lab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				lab1pan3.add(userlabel4);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				lab1pan3.add(rjrb12);
				lab1pan3.add(rjrb13);
				lab1pan3.add(rjrb14);
				lab1pan3.add(rjrb15);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				lab1pan3.setVisible(true);
				
				usermainpan.revalidate();
				
				userproblem = true;
			    usercharlimit();
			}
		}		
		});	
	
	rjrb8.setText(" Something Else ");
	rjrb8.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb8.setBackground(Color.decode("#191919"));
	rjrb8.setForeground(Color.decode("#c7c7c7"));
	rjrb8.setCursor(handcursor);
	rjrb8.setOpaque(true);
	//rjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb8.setBorderPainted(true);
	rjrb8.setFocusable(false);
	rjrb8.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		rjrb8.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb8.isSelected())
			{
				usersubproblem = false;
			    usercharlimit();
				lab1pan3.removeAll();
				lab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				lab1pan3.add(userlabel4);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				lab1pan3.add(elsetxt);
				lab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				lab1pan3.setVisible(true);

				usermainpan.revalidate();

                userproblem = true;
			    usercharlimit();				
			}
		}	
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	rjrb9.setText(" Me ");
	rjrb9.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb9.setBackground(Color.decode("#0f0f0f")); 
	rjrb9.setForeground(Color.decode("#c7c7c7"));
	rjrb9.setCursor(handcursor);
	rjrb9.setOpaque(true);
	//rjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb9.setBorderPainted(true);
	rjrb9.setFocusable(false);
	rjrb9.setAlignmentX(Component.CENTER_ALIGNMENT);
	rjrb9.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb9.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});
	
	rjrb10.setText(" A friend ");
	rjrb10.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb10.setBackground(Color.decode("#0f0f0f")); 
	rjrb10.setForeground(Color.decode("#c7c7c7"));
	rjrb10.setCursor(handcursor);
	rjrb10.setOpaque(true);
	//rjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb10.setBorderPainted(true);
	rjrb10.setFocusable(false);
	rjrb10.setAlignmentX(Component.CENTER_ALIGNMENT);
		rjrb10.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb10.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});
	
	rjrb11.setText(" Celebrity ");
	rjrb11.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb11.setBackground(Color.decode("#0f0f0f")); 
	rjrb11.setForeground(Color.decode("#c7c7c7"));
	rjrb11.setCursor(handcursor);
	rjrb11.setOpaque(true);
	//rjrb11.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb11.setBorderPainted(true);
	rjrb11.setFocusable(false);
	rjrb11.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	rjrb11.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb11.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});	
	
	
    rjrb12.setText(" Suicide ");
	rjrb12.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb12.setBackground(Color.decode("#0f0f0f")); 
	rjrb12.setForeground(Color.decode("#c7c7c7"));
	rjrb12.setCursor(handcursor);
	rjrb12.setOpaque(true);
	//rjrb12.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb12.setBorderPainted(true);
	rjrb12.setFocusable(false);
	rjrb12.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	rjrb12.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb12.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});	
	
	
	rjrb13.setText(" Self Injury ");
	rjrb13.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb13.setBackground(Color.decode("#0f0f0f")); 
	rjrb13.setForeground(Color.decode("#c7c7c7"));
	rjrb13.setCursor(handcursor);
	rjrb13.setOpaque(true);
	//rjrb13.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb13.setBorderPainted(true);
	rjrb13.setFocusable(false);
	rjrb13.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	rjrb13.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb13.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});	
	
	rjrb14.setText(" Harassment ");
	rjrb14.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb14.setBackground(Color.decode("#0f0f0f")); 
	rjrb14.setForeground(Color.decode("#c7c7c7"));
	rjrb14.setCursor(handcursor);
	rjrb14.setOpaque(true);
	//rjrb14.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb14.setBorderPainted(true);
	rjrb14.setFocusable(false);
	rjrb14.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	rjrb14.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb14.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});	
	
	
	rjrb15.setText(" Hacked ");
	rjrb15.setFont(new Font("Arial",Font.PLAIN,15));
	rjrb15.setBackground(Color.decode("#0f0f0f")); 
	rjrb15.setForeground(Color.decode("#c7c7c7"));
	rjrb15.setCursor(handcursor);
	rjrb15.setOpaque(true);
	//rjrb15.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    rjrb15.setBorderPainted(true);
	rjrb15.setFocusable(false);
	rjrb15.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	rjrb15.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(rjrb15.isSelected())
			{
                usersubproblem = true;
			    usercharlimit();				
			}
		}	
		});
	
ButtonGroup urbg1 = new ButtonGroup();
ButtonGroup urbg2 = new ButtonGroup();


urbg1.add(rjrb1);
urbg1.add(rjrb2);
urbg1.add(rjrb3);
urbg1.add(rjrb4);
urbg1.add(rjrb5);	
urbg1.add(rjrb6);
urbg1.add(rjrb7);
urbg1.add(rjrb8);

urbg2.add(rjrb9);
urbg2.add(rjrb10);
urbg2.add(rjrb11);

urbg2.add(rjrb12);
urbg2.add(rjrb13);
urbg2.add(rjrb14);
urbg2.add(rjrb15);	


//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

rprtformbttn = new JButton(" SUBMIT ");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel cmnttxtpan = new JPanel();
	cmnttxtpan.setBackground(new Color(0,0,0,150));
	cmnttxtpan.setLayout(new GridLayout(1,1,0,0));
	cmnttxtpan.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	cmnttxtpan.setMinimumSize(new Dimension(1000, 60));
	//cmnttxtpan.setPreferredSize(new Dimension(1000, 60));
	cmnttxtpan.setMaximumSize(new Dimension(10000, 120));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    cmntbox = new HintTextArea("Additional Comment");//border ac-border inactive
	
	cmntbox.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (cmntbox.getText().length() >= 20 && cmntbox.getText().length() <= 3000) // limit textfield
			{
				usercmnt = true;
				usercharlimit();
			}
			else 
			{
				usercmnt = false;
				usercharlimit();			
			}
    }
	});
	
	cmntbox.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	cmntbox.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont
	cmntbox.activebgColor=Color.decode("#2C2F33");
	cmntbox.inactivebgColor=Color.decode("#23272A");
	cmntbox.activefgColor=Color.WHITE;////////////color on type
	cmntbox.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	cmntbox.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	cmntbox.magColorM=Color.RED;///////// color if user click and unfill/ignore
	cmntbox.setFont(new Font("Arial",Font.PLAIN,12));
	cmntbox.setForeground(Color.decode("#FFFFFF"));
	cmntbox.setBackground(Color.decode("#2C2F33"));
	cmntbox.setColumns(30);
	cmntbox.setLineWrap(true);
	cmntbox.setWrapStyleWord(true);
	cmntbox.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    cmntbox.addMouseListener(new FieldMouseListener());
	cmntbox.setCaretColor(Color.WHITE);
	
///////////////////////////////////text area scroll bar/////////////////////////////////////
	
	scrl = new JScrollPane(cmntbox);
	scrl.getVerticalScrollBar().setUnitIncrement(10);
	scrl.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	scrl.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
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
	
	scrl.setBorder(null);
	scrl.setOpaque(true);
////////////////////////////////////////////////////////////////////////////////////////////
	
	JLabel instructlab1 = new JLabel("Instructions:");
	instructlab1.setFont(new Font("Times New Roman",Font.PLAIN,17));
	instructlab1.setForeground(Color.decode("#aed6dc"));
	instructlab1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	instructlab1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	instructlab1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	instructlab1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	instructlab1.setAlignmentX(Component.CENTER_ALIGNMENT);
	instructlab1.setCursor(textcursor);
	
	JLabel instructlab2 = new JLabel("You can not submit the form without mentioning the actual problems.");
	instructlab2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	instructlab2.setForeground(Color.decode("#ff4500"));
	instructlab2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	instructlab2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	instructlab2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	instructlab2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	instructlab2.setAlignmentX(Component.CENTER_ALIGNMENT);
	instructlab2.setCursor(textcursor);
	
////////////////////////////////////////////////////////////////////////////////////////////
    
	JPanel rprtsubbttnpan = new JPanel();
    //rprtsubbttnpan.setSize((userdialog.getWidth()), (userdialog.getHeight()));
	rprtsubbttnpan.setBackground(Color.decode("#0f0f0f"));
	rprtsubbttnpan.setLayout(new BoxLayout(rprtsubbttnpan, BoxLayout.X_AXIS));
	rprtsubbttnpan.setBorder(new EmptyBorder(0,0,0,0));
	rprtsubbttnpan.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////

    Border submitbttnborderrprt = new LineBorder(Color.RED, 1);
	
	
	rprtformbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtformbttn.setBackground(new Color(125,125,125));
	rprtformbttn.setForeground(Color.BLACK);
	rprtformbttn.setCursor(handcursor);
	rprtformbttn.setBorder(submitbttnborderrprt);
	rprtformbttn.setOpaque(false);
	rprtformbttn.setEnabled(false);
    rprtformbttn.setContentAreaFilled(false);
    rprtformbttn.setBorderPainted(true);
	rprtformbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtformbttn.setFocusable(false);
		rprtformbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});
	
	
	
rprtformbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			String rep = null;
			String subrep = null;
			String rprtcmmntbox = null;
			String accusedrprt = null;
			
		if(e.getSource() == rprtformbttn)
		{
			if(rjrb1.isSelected())
			{
				rep = rjrb1.getText();
				
				if(rjrb9.isSelected())
				{
					subrep = rjrb9.getText();
				}
				if(rjrb10.isSelected())
				{
					subrep = rjrb10.getText();
				}
				if(rjrb11.isSelected())
				{
					subrep = rjrb11.getText();
				}
				
			}
			if(rjrb2.isSelected())
			{
				rep = rjrb2.getText();
				subrep = "N/A";
			}
			if(rjrb3.isSelected())
			{
				rep = rjrb3.getText();
				subrep = "N/A";
			}
			if(rjrb4.isSelected())
			{
				rep = rjrb4.getText();
				subrep = "N/A";
			}
			if(rjrb5.isSelected())
			{
				rep = rjrb5.getText();
				subrep = "N/A";
			}
			if(rjrb6.isSelected())
			{
				rep = rjrb6.getText();
				subrep = "N/A";
			}
			if(rjrb7.isSelected())
			{
				rep = rjrb7.getText();
				
				if(rjrb12.isSelected())
				{
					subrep = rjrb12.getText();
				}
				if(rjrb13.isSelected())
				{
					subrep = rjrb13.getText();
				}
				if(rjrb14.isSelected())
				{
					subrep = rjrb14.getText();
				}
				if(rjrb15.isSelected())
				{
					subrep = rjrb15.getText();
				}
				
			}
			if(rjrb8.isSelected())
			{
				rep = rjrb8.getText();
				subrep = elsetxt.getText();
			}
			
			rprtcmmntbox = cmntbox.getText();
            accusedrprt = rprtusernamefield.getText();
			
			problem = rep;
			subproblem = subrep;
			rprtlastcomment = rprtcmmntbox;
			accusedname = accusedrprt;
			accusedmail = accusedrprt;
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);
			optionuser = true;
			charlimit();
			userdialog.dispose();
		}
		}
		
	});
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	rprtcnclbttn = new JButton(" CANCEL ");
	rprtcnclbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	rprtcnclbttn.setBackground(new Color(125,125,125));
	rprtcnclbttn.setForeground(Color.BLACK);
	rprtcnclbttn.setCursor(handcursor);
	rprtcnclbttn.setBorder(submitbttnborderrprt);
	rprtcnclbttn.setOpaque(false);
	rprtcnclbttn.setEnabled(false);
    rprtcnclbttn.setContentAreaFilled(false);
    rprtcnclbttn.setBorderPainted(true);
	rprtcnclbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	rprtcnclbttn.setFocusable(false);
	rprtcnclbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
	rprtcnclbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			
		userdialog.dispose();
		
		}		
		
	});



	lab1pan1.add(userlabel1);
	usermainpan.add(lab1pan1);
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 2)));
	
	rprtusernamefieldpan.add(rprtusernamefieldlabel);
	rprtusernamefieldpan.add(Box.createRigidArea(new Dimension(0, 5)));

	rprtusernamefieldpan.add(rprtusernamefield);
    usermainpan.add(rprtusernamefieldpan);

	
	
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 2)));
    usermainpan.add(userlabel2);
	usermainpan.add(Box.createRigidArea(new Dimension(0, 2)));
    usermainpan.add(userlabel3);
	usermainpan.add(Box.createRigidArea(new Dimension(0, 5)));

	lab1pan2.add(rjrb1);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb2);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb3);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb4);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb5);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb6);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb7);
	lab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	lab1pan2.add(rjrb8);

	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 15)));
	usermainpan.add(lab1pan2);

	usermainpan.add(Box.createRigidArea(new Dimension(0, 15)));
	usermainpan.add(lab1pan3);
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	cmnttxtpan.add(scrl);
	
	usermainpan.add(cmnttxtpan);
	
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	usermainpan.add(instructlab1);
	usermainpan.add(Box.createRigidArea(new Dimension(0, 5)));
	usermainpan.add(instructlab2);
	
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	rprtsubbttnpan.add(Box.createRigidArea(new Dimension(0, 0)));
	rprtsubbttnpan.add(rprtformbttn);
	rprtsubbttnpan.add(Box.createRigidArea(new Dimension(30, 0)));
	rprtsubbttnpan.add(rprtcnclbttn);
	
	usermainpan.add(Box.createRigidArea(new Dimension(0, 20)));
	
	//usermainpan.add(Box.createRigidArea(new Dimension(500, 10)));
	usermainpan.add(rprtsubbttnpan);
	usermainpan.add(Box.createRigidArea(new Dimension(0, 20)));


	
	userdialog.add(usermainpan);
	

	userdialog.setVisible(true);
	
	
	return userdialog;
	
	
}


public void usercharlimit()
{
	
	if (userproblem == true && usercmnt == true && usersubproblem == true && useraccused == true)
	{
		rprtformbttn.setEnabled(true);
		rprtformbttn.setForeground(Color.decode("#FFFFFF"));
		rprtformbttn.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else 
	{
		rprtformbttn.setEnabled(false);
		rprtformbttn.setBorder(new LineBorder(Color.RED, 1));
	}
		
}

public JDialog softwarereport(JFrame frame)
{	
	
	optionuser = false;
	optionsoftware = false;
	optionaccount = false;
	
	
	JRadioButton softrjrb1,softrjrb2,softrjrb3,softrjrb4,softrjrb5,softrjrb6,softrjrb7,softrjrb8,softrjrb9,softrjrb10,softrjrb11,softrjrb12,softrjrb13,softrjrb14,softrjrb15;
	HintTextArea softcmmnt;
	HintTextField softelse;
	JScrollPane softscroll;
	JButton softcnclbttn;

	
	softrjrb1 = new JRadioButton();
	softrjrb2 = new JRadioButton();
	softrjrb3 = new JRadioButton();
	softrjrb4 = new JRadioButton();
	softrjrb5 = new JRadioButton();
	softrjrb6 = new JRadioButton();
	softrjrb7 = new JRadioButton();
	softrjrb8 = new JRadioButton();
	softrjrb9 = new JRadioButton();
	softrjrb10 = new JRadioButton();
	softrjrb11 = new JRadioButton();	
	softrjrb12 = new JRadioButton();
	softrjrb13 = new JRadioButton();
	softrjrb14 = new JRadioButton();
	softrjrb15 = new JRadioButton();

	JDialog softdialog = new JDialog(frame,"Report to user",true);
	Point loc1 = frame.getLocation();
    softdialog.setLocation(loc1.x+80,loc1.y+80);
	softdialog.setSize(frame.getWidth()-250,frame.getHeight()-100);
    
    JPanel softmainpan = new JPanel();
    softmainpan.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softmainpan.setBackground(Color.decode("#0f0f0f"));
	softmainpan.setLayout(new BoxLayout(softmainpan, BoxLayout.Y_AXIS));
	softmainpan.setBorder(new EmptyBorder(0,0,0,0));
	softmainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	softmainpan.setMinimumSize(new Dimension(softdialog.getWidth(), softdialog.getHeight()));
	softmainpan.setPreferredSize(new Dimension(softdialog.getWidth(), softdialog.getHeight()));
	softmainpan.setMaximumSize(new Dimension(softdialog.getWidth(), softdialog.getHeight()));
	
	JPanel softlab1pan1 = new JPanel();
    softlab1pan1.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softlab1pan1.setBackground(Color.decode("#000000"));
	softlab1pan1.setLayout(new BoxLayout(softlab1pan1, BoxLayout.Y_AXIS));
	softlab1pan1.setBorder(new EmptyBorder(0,0,0,0));
	softlab1pan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel softlabel1 = new JLabel("<html>Report</html>");
	softlabel1.setFont(new Font("Times New Roman",Font.BOLD,26));
	softlabel1.setForeground(Color.decode("#0000cd"));
	softlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softlabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	softlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	softlabel1.setCursor(textcursor);
	
	JLabel softlabel2 = new JLabel("Please select a problem to continue");
	softlabel2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	softlabel2.setForeground(Color.decode("#aed6dc"));
	softlabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softlabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	softlabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softlabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softlabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	softlabel2.setCursor(textcursor);
   
    JLabel softlabel3 = new JLabel("You can report a user problem after selecting a problem");
	softlabel3.setFont(new Font("Times New Roman",Font.PLAIN,17));
	softlabel3.setForeground(Color.decode("#aed6dc"));
	softlabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softlabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	softlabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softlabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softlabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	softlabel3.setCursor(textcursor);
	
	JLabel softlabel4 = new JLabel("<html>Can you give us some more details</html>");
	softlabel4.setFont(new Font("Times New Roman",Font.PLAIN,17));
	softlabel4.setForeground(Color.decode("#aed6dc"));
	softlabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softlabel4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	softlabel4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softlabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softlabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
	softlabel4.setCursor(textcursor);

//////////////////////////////////Button group panel///////////////////////////////////////////////////

	JPanel softlab1pan22 = new JPanel();
    softlab1pan22.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softlab1pan22.setBackground(Color.decode("#0f0f0f")); //////////////////////////// #23272A
	softlab1pan22.setLayout(new BoxLayout(softlab1pan22, BoxLayout.X_AXIS));
	softlab1pan22.setBorder(new EmptyBorder(0,0,0,0));
	softlab1pan22.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel softlab1pan2 = new JPanel();
    softlab1pan2.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softlab1pan2.setBackground(Color.decode("#0f0f0f")); //////////////////////////// #23272A
	softlab1pan2.setLayout(new BoxLayout(softlab1pan2, BoxLayout.Y_AXIS));
	softlab1pan2.setBorder(new EmptyBorder(0,0,0,0));
	softlab1pan2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel softlab1pan21 = new JPanel();
    softlab1pan21.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softlab1pan21.setBackground(Color.decode("#0f0f0f")); //////////////////////////// #23272A
	softlab1pan21.setLayout(new BoxLayout(softlab1pan21, BoxLayout.Y_AXIS));
	softlab1pan21.setBorder(new EmptyBorder(0,0,0,0));
	softlab1pan21.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////Extra comment panel///////////////////////////////////////////////////

	JPanel softlab1pan3 = new JPanel();
    softlab1pan3.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softlab1pan3.setBackground(Color.decode("#191919")); //////////////////////////// #23272A
	softlab1pan3.setLayout(new BoxLayout(softlab1pan3, BoxLayout.Y_AXIS));
	softlab1pan3.setBorder(new EmptyBorder(0,0,0,0));
	softlab1pan3.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	softelse = new HintTextField("Please let us know what your exact problem is");//border ac-border inactive
	
	
	softelse.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (softelse.getText().length() >= 20 && softelse.getText().length() <= 3000) // limit textfield
			{
				softsubproblem = true;
				softcharlimit();
			}
			else 
			{
				softsubproblem = false;
				softcharlimit();			
			}
    }
	});	
	
	
	
	softelse.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	softelse.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	softelse.activebgColor=Color.decode("#2C2F33");
	softelse.inactivebgColor=Color.decode("#23272A");
	softelse.activefgColor=Color.WHITE;////////////color on type
	softelse.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	softelse.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	softelse.magColorM=Color.RED;///////// color if user click and unfill/ignore
	softelse.setFont(new Font("Arial",Font.PLAIN,12));
	softelse.setForeground(Color.decode("#FFFFFF"));
	softelse.setBackground(Color.decode("#2C2F33"));
	softelse.setColumns(30);
	softelse.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    softelse.addMouseListener(new FieldMouseListener());
	softelse.setCaretColor(Color.WHITE);
	softelse.setMinimumSize(new Dimension(100, 50));
	softelse.setPreferredSize(new Dimension(100, 50));	
	softelse.setMaximumSize(new Dimension(1000, 50));
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	softrjrb1.setText(" Log in/Sign up Issue ");
	softrjrb1.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb1.setBackground(Color.decode("#191919"));
	softrjrb1.setForeground(Color.decode("#c7c7c7"));
	softrjrb1.setCursor(handcursor);
	softrjrb1.setOpaque(true);
	//softrjrb1.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb1.setBorderPainted(true);
	softrjrb1.setFocusable(false);
	softrjrb1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		softrjrb1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb1.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
				
			}
		}		
		
	});
	
	softrjrb2.setText(" Profile Issue ");
	softrjrb2.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb2.setBackground(Color.decode("#191919"));
	softrjrb2.setForeground(Color.decode("#c7c7c7"));
	softrjrb2.setCursor(handcursor);
	softrjrb2.setOpaque(true);
	//softrjrb2.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb2.setBorderPainted(true);
	softrjrb2.setFocusable(false);
	softrjrb2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		softrjrb2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb2.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		
	});
	
	softrjrb3.setText(" Job Post Issue ");
	softrjrb3.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb3.setBackground(Color.decode("#191919"));
	softrjrb3.setForeground(Color.decode("#c7c7c7"));
	softrjrb3.setCursor(handcursor);
	softrjrb3.setOpaque(true);
	//softrjrb3.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb3.setBorderPainted(true);
	softrjrb3.setFocusable(false);
	softrjrb3.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb3.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		});	
	softrjrb4.setText(" Job Submission Issue ");
	softrjrb4.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb4.setBackground(Color.decode("#191919"));
	softrjrb4.setForeground(Color.decode("#c7c7c7"));
	softrjrb4.setCursor(handcursor);
	softrjrb4.setOpaque(true);
	//softrjrb4.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb4.setBorderPainted(true);
	softrjrb4.setFocusable(false);
	softrjrb4.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb4.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		});
		
	softrjrb5.setText(" Couldn't find Seller/Buyer ");
	softrjrb5.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb5.setBackground(Color.decode("#191919"));
	softrjrb5.setForeground(Color.decode("#c7c7c7"));
	softrjrb5.setCursor(handcursor);
	softrjrb5.setOpaque(true);
	//softrjrb5.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb5.setBorderPainted(true);
	softrjrb5.setFocusable(false);
	softrjrb5.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb5.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		});		
	
	softrjrb6.setText(" Software Update Problem ");
	softrjrb6.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb6.setBackground(Color.decode("#191919"));
	softrjrb6.setForeground(Color.decode("#c7c7c7"));
	softrjrb6.setCursor(handcursor);
	softrjrb6.setOpaque(true);
	//softrjrb6.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb6.setBorderPainted(true);
	softrjrb6.setFocusable(false);
	softrjrb6.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb6.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb6.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		});	
		
	softrjrb7.setText(" Having Trouble with Messaging System ");
	softrjrb7.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb7.setBackground(Color.decode("#191919"));
	softrjrb7.setForeground(Color.decode("#c7c7c7"));
	softrjrb7.setCursor(handcursor);
	softrjrb7.setOpaque(true);
	//softrjrb7.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb7.setBorderPainted(true);
	softrjrb7.setFocusable(false);
	softrjrb7.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb7.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb7.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20,0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.setVisible(true);
				softmainpan.revalidate();
				
				
				softproblem = true;
			    softcharlimit();
			}
		}		
		});	
	
	softrjrb8.setText(" Something Else ");
	softrjrb8.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb8.setBackground(Color.decode("#191919"));
	softrjrb8.setForeground(Color.decode("#c7c7c7"));
	softrjrb8.setCursor(handcursor);
	softrjrb8.setOpaque(true);
	//softrjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb8.setBorderPainted(true);
	softrjrb8.setFocusable(false);
	softrjrb8.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		softrjrb8.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb8.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				softlab1pan3.setVisible(true);

				softmainpan.revalidate();

                softproblem = true;
			    softcharlimit();				
			}
		}	
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	softrjrb9.setText(" Mailing problem ");
	softrjrb9.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb9.setBackground(Color.decode("#191919")); 
	softrjrb9.setForeground(Color.decode("#c7c7c7"));
	softrjrb9.setCursor(handcursor);
	softrjrb9.setOpaque(true);
	//softrjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb9.setBorderPainted(true);
	softrjrb9.setFocusable(false);
	softrjrb9.setAlignmentX(Component.LEFT_ALIGNMENT);
	softrjrb9.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb9.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				softlab1pan3.setVisible(true);

				softmainpan.revalidate();

                softproblem = true;
			    softcharlimit();				
			}
		}	
		});
	
	softrjrb10.setText(" User Rating Problem ");
	softrjrb10.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb10.setBackground(Color.decode("#191919")); 
	softrjrb10.setForeground(Color.decode("#c7c7c7"));
	softrjrb10.setCursor(handcursor);
	softrjrb10.setOpaque(true);
	//softrjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb10.setBorderPainted(true);
	softrjrb10.setFocusable(false);
	softrjrb10.setAlignmentX(Component.LEFT_ALIGNMENT);
		softrjrb10.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb10.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				softlab1pan3.setVisible(true);

				softmainpan.revalidate();

                softproblem = true;
			    softcharlimit();				
			}
		}	
		});
	
	softrjrb11.setText(" Not getting access to the Bank Account ");
	softrjrb11.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb11.setBackground(Color.decode("#191919")); 
	softrjrb11.setForeground(Color.decode("#c7c7c7"));
	softrjrb11.setCursor(handcursor);
	softrjrb11.setOpaque(true);
	//softrjrb11.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb11.setBorderPainted(true);
	softrjrb11.setFocusable(false);
	softrjrb11.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	softrjrb11.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb11.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				softlab1pan3.setVisible(true);

				softmainpan.revalidate();

                softproblem = true;
			    softcharlimit();				
			}
		}	
		});	
	
	
    softrjrb12.setText(" Something which is against Standard Community ");
	softrjrb12.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb12.setBackground(Color.decode("#191919")); 
	softrjrb12.setForeground(Color.decode("#c7c7c7"));
	softrjrb12.setCursor(handcursor);
	softrjrb12.setOpaque(true);
	//softrjrb12.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb12.setBorderPainted(true);
	softrjrb12.setFocusable(false);
	softrjrb12.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	softrjrb12.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb12.isSelected())
			{
				softsubproblem = false;
			    softcharlimit();
				softlab1pan3.removeAll();
				softlab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				softlab1pan3.add(softlabel4);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				softlab1pan3.add(softelse);
				softlab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				softlab1pan3.setVisible(true);

				softmainpan.revalidate();

                softproblem = true;
			    softcharlimit();				
			}
		}	
		});	
	
	
/*	softrjrb13.setText(" Self Injury ");
	softrjrb13.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb13.setBackground(Color.decode("#0f0f0f")); 
	softrjrb13.setForeground(Color.decode("#c7c7c7"));
	softrjrb13.setCursor(handcursor);
	softrjrb13.setOpaque(true);
	//softrjrb13.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb13.setBorderPainted(true);
	softrjrb13.setFocusable(false);
	softrjrb13.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	softrjrb13.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb13.isSelected())
			{
                softsubproblem = true;
			    softcharlimit();				
			}
		}	
		});	
	
	softrjrb14.setText(" Harassment ");
	softrjrb14.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb14.setBackground(Color.decode("#0f0f0f")); 
	softrjrb14.setForeground(Color.decode("#c7c7c7"));
	softrjrb14.setCursor(handcursor);
	softrjrb14.setOpaque(true);
	//softrjrb14.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb14.setBorderPainted(true);
	softrjrb14.setFocusable(false);
	softrjrb14.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	softrjrb14.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb14.isSelected())
			{
                softsubproblem = true;
			    softcharlimit();				
			}
		}	
		});	
	
	
	softrjrb15.setText(" Hacked ");
	softrjrb15.setFont(new Font("Arial",Font.PLAIN,15));
	softrjrb15.setBackground(Color.decode("#0f0f0f")); 
	softrjrb15.setForeground(Color.decode("#c7c7c7"));
	softrjrb15.setCursor(handcursor);
	softrjrb15.setOpaque(true);
	//softrjrb15.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    softrjrb15.setBorderPainted(true);
	softrjrb15.setFocusable(false);
	softrjrb15.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	softrjrb15.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(softrjrb15.isSelected())
			{
                softsubproblem = true;
			    softcharlimit();				
			}
		}	
		});*/
	
ButtonGroup surbg1 = new ButtonGroup();
ButtonGroup surbg2 = new ButtonGroup();


surbg1.add(softrjrb1);
surbg1.add(softrjrb2);
surbg1.add(softrjrb3);
surbg1.add(softrjrb4);
surbg1.add(softrjrb5);	
surbg1.add(softrjrb6);
surbg1.add(softrjrb7);
surbg1.add(softrjrb9);
surbg1.add(softrjrb10);
surbg1.add(softrjrb11);
surbg1.add(softrjrb12);
surbg1.add(softrjrb8);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

softrprtformbttn = new JButton(" SUBMIT ");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel softcmnttxtpan = new JPanel();
	softcmnttxtpan.setBackground(new Color(0,0,0,150));
	softcmnttxtpan.setLayout(new GridLayout(1,1,0,0));
	softcmnttxtpan.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	softcmnttxtpan.setMinimumSize(new Dimension(1000, 60));
	//softcmnttxtpan.setPreferredSize(new Dimension(1000, 60));
	softcmnttxtpan.setMaximumSize(new Dimension(10000, 120));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    softcmmnt = new HintTextArea("Additional Comment");//border ac-border inactive
	
	softcmmnt.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (softcmmnt.getText().length() >= 20 && softcmmnt.getText().length() <= 3000) // limit textfield
			{
				softcmnt = true;
				softcharlimit();
			}
			else 
			{
				softcmnt = false;
				softcharlimit();			
			}
    }
	});
	
	softcmmnt.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	softcmmnt.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont
	softcmmnt.activebgColor=Color.decode("#2C2F33");
	softcmmnt.inactivebgColor=Color.decode("#23272A");
	softcmmnt.activefgColor=Color.WHITE;////////////color on type
	softcmmnt.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	softcmmnt.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	softcmmnt.magColorM=Color.RED;///////// color if user click and unfill/ignore
	softcmmnt.setFont(new Font("Arial",Font.PLAIN,12));
	softcmmnt.setForeground(Color.decode("#FFFFFF"));
	softcmmnt.setBackground(Color.decode("#2C2F33"));
	softcmmnt.setColumns(30);
	softcmmnt.setLineWrap(true);
	softcmmnt.setWrapStyleWord(true);
	softcmmnt.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    softcmmnt.addMouseListener(new FieldMouseListener());
	softcmmnt.setCaretColor(Color.WHITE);
	
///////////////////////////////////text area scroll bar/////////////////////////////////////
	
	softscroll = new JScrollPane(softcmmnt);
	softscroll.getVerticalScrollBar().setUnitIncrement(10);
	softscroll.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	softscroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
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
	
	softscroll.setBorder(null);
	softscroll.setOpaque(true);
////////////////////////////////////////////////////////////////////////////////////////////
	
	JLabel softinstructlab1 = new JLabel("Instructions:");
	softinstructlab1.setFont(new Font("Times New Roman",Font.BOLD,20));
	softinstructlab1.setForeground(Color.decode("#aed6dc"));
	softinstructlab1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softinstructlab1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	softinstructlab1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softinstructlab1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softinstructlab1.setAlignmentX(Component.CENTER_ALIGNMENT);
	softinstructlab1.setCursor(textcursor);
	
	JLabel softinstructlab2 = new JLabel("You can not submit the form without mentioning the actual problems.");
	softinstructlab2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	softinstructlab2.setForeground(Color.decode("#ff4500"));
	softinstructlab2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	softinstructlab2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	softinstructlab2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	softinstructlab2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	softinstructlab2.setAlignmentX(Component.CENTER_ALIGNMENT);
	softinstructlab2.setCursor(textcursor);
	
////////////////////////////////////////////////////////////////////////////////////////////
    
	JPanel softrprtsubbttnpan = new JPanel();
    //softrprtsubbttnpan.setSize((softdialog.getWidth()), (softdialog.getHeight()));
	softrprtsubbttnpan.setBackground(Color.decode("#0f0f0f"));
	softrprtsubbttnpan.setLayout(new BoxLayout(softrprtsubbttnpan, BoxLayout.X_AXIS));
	softrprtsubbttnpan.setBorder(new EmptyBorder(0,0,0,0));
	softrprtsubbttnpan.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////

    Border softsubmitbttnborderrprt = new LineBorder(Color.RED, 1);
	
	
	softrprtformbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	softrprtformbttn.setBackground(new Color(125,125,125));
	softrprtformbttn.setForeground(Color.BLACK);
	softrprtformbttn.setCursor(handcursor);
	softrprtformbttn.setBorder(softsubmitbttnborderrprt);
	softrprtformbttn.setOpaque(false);
	softrprtformbttn.setEnabled(false);
    softrprtformbttn.setContentAreaFilled(false);
    softrprtformbttn.setBorderPainted(true);
	softrprtformbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	softrprtformbttn.setFocusable(false);
	softrprtformbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	softrprtformbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			String softrep = null;
			String softsubrep = null;
			String softrprtcmmntbox = null;
			String accusedrprt = null;
			
		if(e.getSource() == softrprtformbttn)
		{
			if(softrjrb1.isSelected())
			{
				softrep = softrjrb2.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb2.isSelected())
			{
				softrep = softrjrb2.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb3.isSelected())
			{
				softrep = softrjrb3.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb4.isSelected())
			{
				softrep = softrjrb4.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb5.isSelected())
			{
				softrep = softrjrb5.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb6.isSelected())
			{
				softrep = softrjrb6.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb7.isSelected())
			{
				softrep = softrjrb7.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb9.isSelected())
			{
				softrep = softrjrb9.getText();
				softsubrep = softelse.getText();
			}			
			if(softrjrb10.isSelected())
			{
				softrep = softrjrb10.getText();
				softsubrep = softelse.getText();
			}
			if(softrjrb11.isSelected())
			{
				softrep = softrjrb11.getText();
				softsubrep = softelse.getText();				
			}			
			if(softrjrb12.isSelected())
			{
				softrep = softrjrb12.getText();
				softsubrep = softelse.getText();			
			}				
			if(softrjrb8.isSelected())
			{
				softrep = softrjrb8.getText();
				softsubrep = softelse.getText();
			}
			
			softrprtcmmntbox = softcmmnt.getText();
			
			sproblem = softrep;
			ssubproblem = softsubrep;
			srprtlastcomment = softrprtcmmntbox;
			
			optionsoftware = true;
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);
			charlimit();
			softdialog.dispose();
		}
		}
		
	});
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	softcnclbttn = new JButton(" CANCEL ");
	softcnclbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	softcnclbttn.setBackground(new Color(125,125,125));
	softcnclbttn.setForeground(Color.BLACK);
	softcnclbttn.setCursor(handcursor);
	softcnclbttn.setBorder(softsubmitbttnborderrprt);
	softcnclbttn.setOpaque(false);
	softcnclbttn.setEnabled(false);
    softcnclbttn.setContentAreaFilled(false);
    softcnclbttn.setBorderPainted(true);
	softcnclbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	softcnclbttn.setFocusable(false);
	softcnclbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
	softcnclbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			
		softdialog.dispose();
		
		}		
		
	});



	softlab1pan1.add(softlabel1);
	softmainpan.add(softlab1pan1);
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 2)));
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 20)));
    softmainpan.add(softlabel2);
	softmainpan.add(Box.createRigidArea(new Dimension(0, 5)));
    softmainpan.add(softlabel3);
	softmainpan.add(Box.createRigidArea(new Dimension(0, 5)));

	softlab1pan2.add(softrjrb1);
	softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan2.add(softrjrb2);
	softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan2.add(softrjrb3);
	softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan2.add(softrjrb4);
	softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan2.add(softrjrb5);
	softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan2.add(softrjrb6);
	//softlab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	
	
	softlab1pan21.add(softrjrb7);
	softlab1pan21.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan21.add(softrjrb9);
	softlab1pan21.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan21.add(softrjrb10);
	softlab1pan21.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan21.add(softrjrb11);
	softlab1pan21.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan21.add(softrjrb12);
	softlab1pan21.add(Box.createRigidArea(new Dimension(0, 2)));
	softlab1pan21.add(softrjrb8);
	
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
	softlab1pan22.add(softlab1pan2);
	softlab1pan22.add(Box.createRigidArea(new Dimension(30, 0)));
	softlab1pan22.add(softlab1pan21);
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 0)));
	softmainpan.add(softlab1pan22);

	softmainpan.add(Box.createRigidArea(new Dimension(0, 15)));
	softmainpan.add(softlab1pan3);
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	softcmnttxtpan.add(softscroll);
	
	softmainpan.add(softcmnttxtpan);
	
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 80)));
	softmainpan.add(softinstructlab1);
	softmainpan.add(Box.createRigidArea(new Dimension(0, 3)));
	softmainpan.add(softinstructlab2);
	
	
	softrprtsubbttnpan.add(Box.createRigidArea(new Dimension(0, 0)));
	softrprtsubbttnpan.add(softrprtformbttn);
	softrprtsubbttnpan.add(Box.createRigidArea(new Dimension(30, 0)));
	softrprtsubbttnpan.add(softcnclbttn);
	
	softmainpan.add(Box.createRigidArea(new Dimension(0, 20)));
	
	//softmainpan.add(Box.createRigidArea(new Dimension(500, 10)));
	softmainpan.add(softrprtsubbttnpan);
	//softmainpan.add(Box.createRigidArea(new Dimension(0, 20)));


	
	softdialog.add(softmainpan);
	

	softdialog.setVisible(true);
	
	
	return softdialog;
	
	
}


public void softcharlimit()
{
	
	if (softproblem == true && softcmnt == true && softsubproblem == true)
	{
		softrprtformbttn.setEnabled(true);
		softrprtformbttn.setForeground(Color.decode("#FFFFFF"));
		softrprtformbttn.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else 
	{
		softrprtformbttn.setEnabled(false);
		softrprtformbttn.setBorder(new LineBorder(Color.RED, 1));
	}
		
}


public JDialog accountreport(JFrame frame)
{	
	
	optionuser = false;
	optionsoftware = false;
	optionaccount = false;
	
	
	JRadioButton accrjrb1,accrjrb2,accrjrb3,accrjrb4,accrjrb5,accrjrb6,accrjrb7,accrjrb8,accrjrb9,accrjrb10,accrjrb11,accrjrb12,accrjrb13,accrjrb14,accrjrb15;
	HintTextArea acccmmnt;
	HintTextField accelse;
	JScrollPane accscroll;
	JButton acccnclbttn;

	
	accrjrb1 = new JRadioButton();
	accrjrb2 = new JRadioButton();
	accrjrb3 = new JRadioButton();
	accrjrb4 = new JRadioButton();
	accrjrb5 = new JRadioButton();
	accrjrb6 = new JRadioButton();
	accrjrb7 = new JRadioButton();
	accrjrb8 = new JRadioButton();
	accrjrb9 = new JRadioButton();
	accrjrb10 = new JRadioButton();
	accrjrb11 = new JRadioButton();	
	accrjrb12 = new JRadioButton();
	accrjrb13 = new JRadioButton();
	accrjrb14 = new JRadioButton();
	accrjrb15 = new JRadioButton();


	JDialog accdialog = new JDialog(frame,"Report to user",true);
	Point loc2 = frame.getLocation();
    accdialog.setLocation(loc2.x+80,loc2.y+80);
	accdialog.setSize(frame.getWidth()-250,frame.getHeight()-100);
 
    
    JPanel accmainpan = new JPanel();
    accmainpan.setSize((accdialog.getWidth()), (accdialog.getHeight()));
	accmainpan.setBackground(Color.decode("#0f0f0f"));///23272A///2C2F33
	accmainpan.setLayout(new BoxLayout(accmainpan, BoxLayout.Y_AXIS));
	accmainpan.setBorder(new EmptyBorder(0,0,0,0));
	accmainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	accmainpan.setMinimumSize(new Dimension(accdialog.getWidth(), accdialog.getHeight()));
	accmainpan.setPreferredSize(new Dimension(accdialog.getWidth(), accdialog.getHeight()));
	accmainpan.setMaximumSize(new Dimension(accdialog.getWidth(), accdialog.getHeight()));
	
	JPanel acclab1pan1 = new JPanel();
    acclab1pan1.setSize((accdialog.getWidth()), (accdialog.getHeight()));
	acclab1pan1.setBackground(Color.decode("#000000"));
	acclab1pan1.setLayout(new BoxLayout(acclab1pan1, BoxLayout.Y_AXIS));
	acclab1pan1.setBorder(new EmptyBorder(0,0,0,0));
	acclab1pan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel acclabel1 = new JLabel("<html>Report</html>");
	acclabel1.setFont(new Font("Times New Roman",Font.BOLD,26));
	acclabel1.setForeground(Color.decode("#0000cd"));
	acclabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	acclabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	acclabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	acclabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	acclabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	acclabel1.setCursor(textcursor);
	
	JPanel accnopan = new JPanel();
	accnopan.setBackground(new Color(14,14,14,150));
	accnopan.setLayout(new BoxLayout(accnopan, BoxLayout.Y_AXIS));
	accnopan.setBorder(new EmptyBorder(0,0,0,0));
	accnopan.setMinimumSize(new Dimension(1000, 60));
	accnopan.setMaximumSize(new Dimension(10000, 120));
	
	accnotxtfield = new HintTextField("Enter your account number");//border ac-border inactive	
	accnotxtfield.gainFont=new Font("Arial", Font.PLAIN, 12);////////////typing font
	accnotxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	accnotxtfield.activebgColor=Color.decode("#2C2F33");
	accnotxtfield.inactivebgColor=Color.decode("#23272A");
	accnotxtfield.activefgColor=Color.WHITE;////////////color on type
	accnotxtfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	accnotxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	accnotxtfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	accnotxtfield.setFont(new Font("Arial",Font.PLAIN,12));
	accnotxtfield.setForeground(Color.decode("#FFFFFF"));
	accnotxtfield.setBackground(Color.decode("#2C2F33"));
	accnotxtfield.setColumns(30);
	accnotxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    accnotxtfield.addMouseListener(new FieldMouseListener());
	accnotxtfield.setCaretColor(Color.WHITE);
	accnotxtfield.setMinimumSize(new Dimension(100, 50));
	accnotxtfield.setPreferredSize(new Dimension(100, 50));	
	accnotxtfield.setMaximumSize(new Dimension(1000, 50));
	
	accnotxtfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
			if (accnotxtfield.getText().length() > 0 && accnotxtfield.getText().length() < 100) // limit textfield
			{
				accnoneeded = true;
				acccharlimit();
			}
			if(accnotxtfield.getText().length() <= 0 || accnotxtfield.getText().length() >= 100)
			{
				accnoneeded = false;
				acccharlimit();
			}
			if(accnotxtfield.getText().length() >= 100)
			{
				accnoneeded = false;
				acccharlimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			
            }
        });	
	
	
	JLabel acclabel2 = new JLabel("Please select a problem to continue");
	acclabel2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	acclabel2.setForeground(Color.decode("#aed6dc"));
	acclabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	acclabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	acclabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	acclabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	acclabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	acclabel2.setCursor(textcursor);
   
    JLabel acclabel3 = new JLabel("You can report software problem after selecting a problem");
	acclabel3.setFont(new Font("Times New Roman",Font.PLAIN,17));
	acclabel3.setForeground(Color.decode("#aed6dc"));
	acclabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	acclabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	acclabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	acclabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	acclabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	acclabel3.setCursor(textcursor);
	
	JLabel acclabel4 = new JLabel("<html>Can you give us some more details</html>");
	acclabel4.setFont(new Font("Times New Roman",Font.PLAIN,17));
	acclabel4.setForeground(Color.decode("#aed6dc"));
	acclabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	acclabel4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	acclabel4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	acclabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	acclabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
	acclabel4.setCursor(textcursor);
	
//////////////////////////////////Button group panel///////////////////////////////////////////////////
	
	JPanel acclab1pan2 = new JPanel();
    acclab1pan2.setSize((accdialog.getWidth()), (accdialog.getHeight()));
	acclab1pan2.setBackground(Color.decode("#0f0f0f")); //////////////////////////// #23272A
	acclab1pan2.setLayout(new BoxLayout(acclab1pan2, BoxLayout.Y_AXIS));
	acclab1pan2.setBorder(new EmptyBorder(0,0,0,0));
	acclab1pan2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////Extra comment panel///////////////////////////////////////////////////
	
	JPanel acclab1pan3 = new JPanel();
    acclab1pan3.setSize((accdialog.getWidth()), (accdialog.getHeight()));
	acclab1pan3.setBackground(Color.decode("#191919")); //////////////////////////// #23272A   091f23
	acclab1pan3.setLayout(new BoxLayout(acclab1pan3, BoxLayout.Y_AXIS));
	acclab1pan3.setBorder(new EmptyBorder(0,0,0,0));
	acclab1pan3.setAlignmentX(Component.CENTER_ALIGNMENT);
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	accelse = new HintTextField("Please let us know what your exact problem is");//border ac-border inactive
	
	
	accelse.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (accelse.getText().length() >= 20 && accelse.getText().length() <= 3000) // limit textfield
			{
				accsubproblem = true;
				acccharlimit();
			}
			else 
			{
				accsubproblem = false;
				acccharlimit();			
			}
    }
	});	
	
	
	
	accelse.gainFont=new Font("Arial", Font.PLAIN, 14);////////////typing font
	accelse.lostFont=new Font("Arial", Font.PLAIN, 14);////////////////inactive font==setFont	
	accelse.activebgColor=Color.decode("#2C2F33");//616161
	accelse.inactivebgColor=Color.decode("#23272A");//4f4f4f
	accelse.activefgColor=Color.WHITE;////////////color on type
	accelse.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	accelse.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	accelse.magColorM=Color.RED;///////// color if user click and unfill/ignore
	accelse.setFont(new Font("Arial",Font.PLAIN,14));
	accelse.setForeground(Color.decode("#FFFFFF"));
	accelse.setBackground(Color.decode("#2C2F33"));
	accelse.setColumns(30);
	accelse.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    accelse.addMouseListener(new FieldMouseListener());
	accelse.setCaretColor(Color.WHITE);
	accelse.setMinimumSize(new Dimension(100, 50));
	accelse.setPreferredSize(new Dimension(100, 50));	
	accelse.setMaximumSize(new Dimension(1000, 50));
	

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	accrjrb1.setText(" Buyer Account Problems ");
	accrjrb1.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb1.setBackground(Color.decode("#191919"));
	accrjrb1.setForeground(Color.decode("#c7c7c7"));
	accrjrb1.setCursor(handcursor);
	accrjrb1.setOpaque(true);
	//accrjrb1.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb1.setBorderPainted(true);
	accrjrb1.setFocusable(false);
	accrjrb1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		accrjrb1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb1.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
				
			}
		}		
		
	});
	
	accrjrb2.setText(" Seller Account Problems ");
	accrjrb2.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb2.setBackground(Color.decode("#191919"));
	accrjrb2.setForeground(Color.decode("#c7c7c7"));
	accrjrb2.setCursor(handcursor);
	accrjrb2.setOpaque(true);
	//accrjrb2.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb2.setBorderPainted(true);
	accrjrb2.setFocusable(false);
	accrjrb2.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		accrjrb2.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb2.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		
	});
	
	accrjrb3.setText(" Transaction Issue ");
	accrjrb3.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb3.setBackground(Color.decode("#191919"));
	accrjrb3.setForeground(Color.decode("#c7c7c7"));
	accrjrb3.setCursor(handcursor);
	accrjrb3.setOpaque(true);
	//accrjrb3.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb3.setBorderPainted(true);
	accrjrb3.setFocusable(false);
	accrjrb3.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb3.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		});	
	accrjrb4.setText(" Account Number Problems ");
	accrjrb4.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb4.setBackground(Color.decode("#191919"));
	accrjrb4.setForeground(Color.decode("#c7c7c7"));
	accrjrb4.setCursor(handcursor);
	accrjrb4.setOpaque(true);
	//accrjrb4.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb4.setBorderPainted(true);
	accrjrb4.setFocusable(false);
	accrjrb4.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb4.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb4.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		});
		
	accrjrb5.setText(" Send Money Issue ");
	accrjrb5.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb5.setBackground(Color.decode("#191919"));
	accrjrb5.setForeground(Color.decode("#c7c7c7"));
	accrjrb5.setCursor(handcursor);
	accrjrb5.setOpaque(true);
	//accrjrb5.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb5.setBorderPainted(true);
	accrjrb5.setFocusable(false);
	accrjrb5.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb5.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		});		
	
	accrjrb6.setText(" Recieve Money Issue ");
	accrjrb6.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb6.setBackground(Color.decode("#191919"));
	accrjrb6.setForeground(Color.decode("#c7c7c7"));
	accrjrb6.setCursor(handcursor);
	accrjrb6.setOpaque(true);
	//accrjrb6.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb6.setBorderPainted(true);
	accrjrb6.setFocusable(false);
	accrjrb6.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb6.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb6.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		});	
		
	accrjrb7.setText(" Bonus Send/Recieve Problem ");
	accrjrb7.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb7.setBackground(Color.decode("#191919"));
	accrjrb7.setForeground(Color.decode("#c7c7c7"));
	accrjrb7.setCursor(handcursor);
	accrjrb7.setOpaque(true);
	//accrjrb7.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb7.setBorderPainted(true);
	accrjrb7.setFocusable(false);
	accrjrb7.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb7.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb7.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();	
			}
		}		
		});	
	
	accrjrb8.setText(" Something Else ");
	accrjrb8.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb8.setBackground(Color.decode("#191919"));
	accrjrb8.setForeground(Color.decode("#c7c7c7"));
	accrjrb8.setCursor(handcursor);
	accrjrb8.setOpaque(true);
	//accrjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb8.setBorderPainted(true);
	accrjrb8.setFocusable(false);
	accrjrb8.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		accrjrb8.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb8.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();				
			}
		}	
		});
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	accrjrb9.setText(" Account Recovery Problem ");
	accrjrb9.setFont(new Font("Arial",Font.PLAIN,15));
	accrjrb9.setBackground(Color.decode("#0f0f0f")); 
	accrjrb9.setForeground(Color.decode("#c7c7c7"));
	accrjrb9.setCursor(handcursor);
	accrjrb9.setOpaque(true);
	//accrjrb8.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
    accrjrb9.setBorderPainted(true);
	accrjrb9.setFocusable(false);
	accrjrb9.setAlignmentX(Component.LEFT_ALIGNMENT);
	accrjrb9.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(accrjrb9.isSelected())
			{
				accsubproblem = false;
			    acccharlimit();
				acclab1pan3.removeAll();
				acclab1pan3.add(Box.createRigidArea(new Dimension(20, 0)));
				acclab1pan3.add(acclabel4);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 5)));
				acclab1pan3.add(accelse);
				acclab1pan3.add(Box.createRigidArea(new Dimension(0, 7)));
				acclab1pan3.setVisible(true);

				accmainpan.revalidate();

                accproblem = true;
			    acccharlimit();				
			}
		}	
		});

	
ButtonGroup aurbg1 = new ButtonGroup();

aurbg1.add(accrjrb1);
aurbg1.add(accrjrb2);
aurbg1.add(accrjrb3);
aurbg1.add(accrjrb4);
aurbg1.add(accrjrb5);	
aurbg1.add(accrjrb6);
aurbg1.add(accrjrb7);
aurbg1.add(accrjrb9);
aurbg1.add(accrjrb8);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

accrprtformbttn = new JButton(" SUBMIT ");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel acccmnttxtpan = new JPanel();
	acccmnttxtpan.setBackground(new Color(0,0,0,150));
	acccmnttxtpan.setLayout(new GridLayout(1,1,0,0));
	acccmnttxtpan.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));
	acccmnttxtpan.setMinimumSize(new Dimension(1000, 60));
	//acccmnttxtpan.setPreferredSize(new Dimension(1000, 60));
	acccmnttxtpan.setMaximumSize(new Dimension(10000, 120));

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    acccmmnt = new HintTextArea("Additional Comment");//border ac-border inactive
	
	acccmmnt.addKeyListener(new KeyAdapter() 
	{
    public void keyTyped(KeyEvent e)
	{
         if (acccmmnt.getText().length() >= 20 && acccmmnt.getText().length() <= 3000) // limit textfield
			{
				acccmnt = true;
				acccharlimit();
			}
			else 
			{
				acccmnt = false;
				acccharlimit();			
			}
    }
	});
	
	acccmmnt.gainFont=new Font("Arial", Font.PLAIN, 14);////////////typing font
	acccmmnt.lostFont=new Font("Arial", Font.PLAIN, 14);////////////////inactive font==setFont
	acccmmnt.activebgColor=Color.decode("#2C2F33");
	acccmmnt.inactivebgColor=Color.decode("#23272A");
	acccmmnt.activefgColor=Color.WHITE;////////////color on type
	acccmmnt.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	acccmmnt.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	acccmmnt.magColorM=Color.RED;///////// color if user click and unfill/ignore
	acccmmnt.setFont(new Font("Arial",Font.PLAIN,14));
	acccmmnt.setForeground(Color.decode("#FFFFFF"));
	acccmmnt.setBackground(Color.decode("#2C2F33"));
	acccmmnt.setColumns(30);
	acccmmnt.setLineWrap(true);
	acccmmnt.setWrapStyleWord(true);
	acccmmnt.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    acccmmnt.addMouseListener(new FieldMouseListener());
	acccmmnt.setCaretColor(Color.WHITE);
	
///////////////////////////////////text area scroll bar/////////////////////////////////////
	
	accscroll = new JScrollPane(acccmmnt);
	accscroll.getVerticalScrollBar().setUnitIncrement(10);
	accscroll.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	accscroll.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
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
	
	accscroll.setBorder(null);
	accscroll.setOpaque(true);
////////////////////////////////////////////////////////////////////////////////////////////
	
	JLabel accinstructlab1 = new JLabel("Instructions:");
	accinstructlab1.setFont(new Font("Times New Roman",Font.BOLD,20));
	accinstructlab1.setForeground(Color.decode("#aed6dc"));
	accinstructlab1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accinstructlab1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accinstructlab1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accinstructlab1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accinstructlab1.setAlignmentX(Component.CENTER_ALIGNMENT);
	accinstructlab1.setCursor(textcursor);
	
	JLabel accinstructlab2 = new JLabel("You can not submit the form without mentioning the actual problems.");
	accinstructlab2.setFont(new Font("Times New Roman",Font.PLAIN,17));
	accinstructlab2.setForeground(Color.decode("#ff4500"));
	accinstructlab2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accinstructlab2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accinstructlab2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accinstructlab2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accinstructlab2.setAlignmentX(Component.CENTER_ALIGNMENT);
	accinstructlab2.setCursor(textcursor);
	
////////////////////////////////////////////////////////////////////////////////////////////
    
	JPanel accrprtsubbttnpan = new JPanel();
    //accrprtsubbttnpan.setSize((accdialog.getWidth()), (accdialog.getHeight()));
	accrprtsubbttnpan.setBackground(Color.decode("#0f0f0f"));
	accrprtsubbttnpan.setLayout(new BoxLayout(accrprtsubbttnpan, BoxLayout.X_AXIS));
	accrprtsubbttnpan.setBorder(new EmptyBorder(0,0,0,0));
	accrprtsubbttnpan.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////

    Border accsubmitbttnborderrprt = new LineBorder(Color.RED, 1);
	
	
	accrprtformbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	accrprtformbttn.setBackground(new Color(125,125,125));
	accrprtformbttn.setForeground(Color.BLACK);
	accrprtformbttn.setCursor(handcursor);
	accrprtformbttn.setBorder(accsubmitbttnborderrprt);
	accrprtformbttn.setOpaque(false);
	accrprtformbttn.setEnabled(false);
    accrprtformbttn.setContentAreaFilled(false);
    accrprtformbttn.setBorderPainted(true);
	accrprtformbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	accrprtformbttn.setFocusable(false);
	
		accrprtformbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
	accrprtformbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			String accrep = null;
			String accsubrep = null;
			String accrprtcmmntbox = null;
			String bankacc = null;
			
		if(e.getSource() == accrprtformbttn)
		{
			if(accrjrb1.isSelected())
			{
				accrep = accrjrb1.getText();
				
				if(accrjrb9.isSelected())
				{
					accsubrep = accrjrb9.getText();
				}
				if(accrjrb10.isSelected())
				{
					accsubrep = accrjrb10.getText();
				}
				if(accrjrb11.isSelected())
				{
					accsubrep = accrjrb11.getText();
				}
				
			}
			if(accrjrb2.isSelected())
			{
				accrep = accrjrb2.getText();
				accsubrep = "N/A";
			}
			if(accrjrb3.isSelected())
			{
				accrep = accrjrb3.getText();
				accsubrep = "N/A";
			}
			if(accrjrb4.isSelected())
			{
				accrep = accrjrb4.getText();
				accsubrep = "N/A";
			}
			if(accrjrb5.isSelected())
			{
				accrep = accrjrb5.getText();
				accsubrep = "N/A";
			}
			if(accrjrb6.isSelected())
			{
				accrep = accrjrb6.getText();
				accsubrep = "N/A";
			}
			if(accrjrb7.isSelected())
			{
				accrep = accrjrb7.getText();
				
				if(accrjrb12.isSelected())
				{
					accsubrep = accrjrb12.getText();
				}
				if(accrjrb13.isSelected())
				{
					accsubrep = accrjrb13.getText();
				}
				if(accrjrb14.isSelected())
				{
					accsubrep = accrjrb14.getText();
				}
				if(accrjrb15.isSelected())
				{
					accsubrep = accrjrb15.getText();
				}
				
			}
			if(accrjrb8.isSelected())
			{
				accrep = accrjrb8.getText();
				accsubrep = accelse.getText();
			}
			
			accrprtcmmntbox = acccmmnt.getText();
			bankacc = accnotxtfield.getText();
			
			aproblem = accrep;
			asubproblem = accsubrep;
			arprtlastcomment = accrprtcmmntbox;
			bankaccountno = bankacc;
			
			optionaccount = true;
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/submit_done.wav",submitdonevolume);
			charlimit();
			accdialog.dispose();
		}
		}
		
	});
	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	acccnclbttn = new JButton(" CANCEL ");
	acccnclbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	acccnclbttn.setBackground(new Color(125,125,125));
	acccnclbttn.setForeground(Color.BLACK);
	acccnclbttn.setCursor(handcursor);
	acccnclbttn.setBorder(accsubmitbttnborderrprt);
	acccnclbttn.setOpaque(false);
	acccnclbttn.setEnabled(false);
    acccnclbttn.setContentAreaFilled(false);
    acccnclbttn.setBorderPainted(true);
	acccnclbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	acccnclbttn.setFocusable(false);
	acccnclbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});	
	
	acccnclbttn.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
			
		accdialog.dispose();
		
		}		
		
	});



	acclab1pan1.add(acclabel1);
	accmainpan.add(acclab1pan1);
	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	accnopan.add(accnotxtfield);
	accmainpan.add(accnopan);

	accmainpan.add(Box.createRigidArea(new Dimension(0, 2)));
	
	accmainpan.add(Box.createRigidArea(new Dimension(20, 2)));
    accmainpan.add(acclabel2);
	accmainpan.add(Box.createRigidArea(new Dimension(20, 2)));
    accmainpan.add(acclabel3);
	accmainpan.add(Box.createRigidArea(new Dimension(0, 10)));

	acclab1pan2.add(accrjrb1);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb2);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb3);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb4);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb5);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb6);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb7);
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb9);	
	acclab1pan2.add(Box.createRigidArea(new Dimension(0, 2)));
	acclab1pan2.add(accrjrb8);

	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 15)));
	accmainpan.add(acclab1pan2);

	accmainpan.add(Box.createRigidArea(new Dimension(0, 15)));
	accmainpan.add(acclab1pan3);
	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	acccmnttxtpan.add(accscroll);
	
	accmainpan.add(acccmnttxtpan);
	
	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	accmainpan.add(accinstructlab1);
	accmainpan.add(Box.createRigidArea(new Dimension(0, 5)));
	accmainpan.add(accinstructlab2);
	
	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 10)));
	accrprtsubbttnpan.add(Box.createRigidArea(new Dimension(0, 0)));
	accrprtsubbttnpan.add(accrprtformbttn);
	accrprtsubbttnpan.add(Box.createRigidArea(new Dimension(30, 0)));
	accrprtsubbttnpan.add(acccnclbttn);
	
	accmainpan.add(Box.createRigidArea(new Dimension(0, 20)));
	
	//accmainpan.add(Box.createRigidArea(new Dimension(500, 10)));
	accmainpan.add(accrprtsubbttnpan);
	accmainpan.add(Box.createRigidArea(new Dimension(0, 20)));


	
	accdialog.add(accmainpan);
	

	accdialog.setVisible(true);
	
	
	return accdialog;
	
	
}


public void acccharlimit()
{
	
	if (accproblem == true && acccmnt == true && accsubproblem == true && accnoneeded == true)
	{
		accrprtformbttn.setEnabled(true);
		accrprtformbttn.setForeground(Color.decode("#FFFFFF"));
		accrprtformbttn.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else 
	{
		accrprtformbttn.setEnabled(false);
		accrprtformbttn.setBorder(new LineBorder(Color.RED, 1));
	}
		
}

///////////////////////////////////Make the button active or inactive /////////////////////////////////////

public void charlimit()
{
	
	if (rname == true && rmail == true && (optionuser==true||optionsoftware==true||optionaccount==true))
	{
		rprtsubmitbttn.setEnabled(true);
		rprtsubmitbttn.setForeground(Color.decode("#FFFFFF"));
		rprtsubmitbttn.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else 
	{
		rprtsubmitbttn.setEnabled(false);
		rprtsubmitbttn.setBorder(new LineBorder(Color.RED, 1));
	}
		
}

///////////////////////////////////////////////////////////////////////////////////////////////////////////


public JPanel rprtaftersubmitpane(JPanel p)
{
	JPanel aftersubpanrprt = new JPanel();
	aftersubpanrprt.setBackground(new Color(128,128,128));
	aftersubpanrprt.setLayout(new BoxLayout(aftersubpanrprt, BoxLayout.Y_AXIS));
	aftersubpanrprt.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubpanrprt.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	aftersubpanrprt.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	aftersubpanrprt.setMaximumSize(new Dimension(p.getWidth(), p.getHeight()));

	JLabel aftersublab1rprt = new JLabel("<html>Your report form successfully sumitted to our system.</html>");
	aftersublab1rprt.setFont(new Font("Times New Roman",Font.BOLD,20));
	aftersublab1rprt.setForeground(Color.decode("#aed6dc"));
	aftersublab1rprt.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab1rprt.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab1rprt.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab1rprt.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab1rprt.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab1rprt.setCursor(textcursor);
	
	JLabel aftersublab2rprt = new JLabel("<html>For your further query you can contact directly to the admin.</html>");
	aftersublab2rprt.setFont(new Font("Times New Roman",Font.BOLD,20));
	aftersublab2rprt.setForeground(Color.decode("#aed6dc"));
	aftersublab2rprt.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab2rprt.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab2rprt.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab2rprt.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab2rprt.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab2rprt.setCursor(textcursor);
	
	JLabel aftersublab3rprt = new JLabel("<html>Hope you have enjoyed our service. Thank you.</html>");
	aftersublab3rprt.setFont(new Font("Times New Roman",Font.BOLD,20));
	aftersublab3rprt.setForeground(Color.decode("#aed6dc"));
	aftersublab3rprt.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aftersublab3rprt.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aftersublab3rprt.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aftersublab3rprt.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aftersublab3rprt.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersublab3rprt.setCursor(textcursor);
	
	
	JButton aftersubbuttonrprt = new HoverButton(" HOME ");
	aftersubbuttonrprt.setFont(new Font("Comic Sans",Font.PLAIN,18));
	aftersubbuttonrprt.setBackground(new Color(125,125,125));
	aftersubbuttonrprt.setForeground(Color.WHITE);
	aftersubbuttonrprt.setCursor(handcursor);
	aftersubbuttonrprt.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	aftersubbuttonrprt.setOpaque(false);
    aftersubbuttonrprt.setContentAreaFilled(false);
    aftersubbuttonrprt.setBorderPainted(true);
	aftersubbuttonrprt.setAlignmentX(Component.CENTER_ALIGNMENT);
	aftersubbuttonrprt.setFocusable(false);
		aftersubbuttonrprt.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",submitbuttonvolume);

		}		
		
	});
	
	aftersubbuttonrprt.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",submitbuttonclickvolume);
		
			mainmenu m2rprt = new mainmenu(rmainframe);
			rmainframe.setJMenuBar(null);
			rmainframe.getContentPane().removeAll();
			rmainframe.setJMenuBar(m2rprt.menubar(rmainframe));
			//rmainframe.getContentPane().add(m2rprt.menu(rmainframe));
			rmainframe.setContentPane(m2rprt.menu(rmainframe));
			rmainframe.setVisible(true);
		}		
		
	});	
	
	
	aftersubpanrprt.add(Box.createRigidArea(new Dimension(0, 110)));	
	aftersubpanrprt.add(aftersublab1rprt);
	aftersubpanrprt.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpanrprt.add(aftersublab2rprt);
	aftersubpanrprt.add(Box.createRigidArea(new Dimension(0, 10)));	
	aftersubpanrprt.add(aftersublab3rprt);
	aftersubpanrprt.add(Box.createRigidArea(new Dimension(0, 25)));	

	
	aftersubpanrprt.add(aftersubbuttonrprt);
	
	return aftersubpanrprt;
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


/*class ZeroSizeButton extends JButton {
  @Override public Dimension getPreferredSize() {
    return new Dimension();
  }
}*/



