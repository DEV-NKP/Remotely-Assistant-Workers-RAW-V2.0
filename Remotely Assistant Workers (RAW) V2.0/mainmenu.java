import raw.label.*;
import raw.button.*;
import raw.panel.*;
import raw.mouse.*;
import raw.font.*;
import raw.textbox.*;
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
public class mainmenu
{
/////////////////////////////////////////////varriable declare for main page (Part-GUI)//////////////////////////////////////////
	JLabel labu1,labu2,labu3,labelm2,labelm3,availablelabel,labelm4,labelm5,labelmz5,labelm6,labelm7,labelm8,l1,l2,loginpanelbackground,signuppanelbackground,adminpanelbackground,labelx,labelx0,labelmb,labelmbx,labu,labelxs0;
	JButton buttons1,buttons2,buttons3,buttons4,buttons5,buttons6,buttons7,mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6,discordbttn,facebookbttn,linkedinbttn,youtubebttn; 
	JPanel p1, pm1,pm2,pm3,loginpanel,signuppanel,adminpanel,lefttransparentpanel,middletransparentpanel,righttransparentpanel,smallbuttonpanel;
	JFrame mainframe;
	JScrollPane jp;
	int x,y;
	Dimension screensize;
    JMenuBar mb; 
float barvolume=-20.0f;
float menuvolume=-40.0f;
float menuavailvolume=-60.0f;
float barclickvolume=-20.0f;
float exitvolume=-20.0f;
/////////////////////////////cursor///////////////////////////////////


java.awt.Toolkit toolkit = java.awt.Toolkit.getDefaultToolkit();




Image customImage = toolkit.getImage("11.png");//16x16
Cursor handcursor = Toolkit.getDefaultToolkit().createCustomCursor(customImage, new Point(0, 0), "handcursor");
 
 
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
//Cursor handcursor=new Cursor(Cursor.HAND_CURSOR);
//////////////////////////////////////contructor- Create Jframe (Part-GUI)///////////////////////////////////////////
public mainmenu()	
{	


    mainframe = new JFrame("RAW");

    Image icon = Toolkit.getDefaultToolkit().getImage("Resources/Images/Common/frame_icon_picture.png");  //256*256
    mainframe.setIconImage(icon);
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
    mainframe.setSize(((screensize.width/2)+320)+250, ((screensize.height/2)+220)+100);
    x = (int) ((screensize.getWidth() - mainframe.getWidth()) / 2);
    y = (int) ((screensize.getHeight() - mainframe.getHeight()) / 2);
    mainframe.setLocation(x, y);
	
	mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
    mainframe.setJMenuBar(menubar(mainframe));
    mainframe.add(menu(mainframe));
	
	


	mainframe.setVisible(true);
	//mainframe.setMinimumSize(new Dimension(((screensize.width/2)+320)+230, ((screensize.height/2)+220)+90));  //never ever try to delete this
	mainframe.setMinimumSize(new Dimension(1340,760));
}
	
	
/////////////////////////////////////////Constructor(perameterized)-receive JFrame (Part-GUI)////////////////////////////////
public mainmenu(JFrame frame)
{
	this.mainframe=frame;
}
public JMenuBar menubar(JFrame frame)
{

mb = new JMenuBar();
mb.setBackground(Color.BLACK);
mb.setPreferredSize(new java.awt.Dimension(1000, 55));
mb.setBorder(BorderFactory.createBevelBorder(1, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY));



////////////////////////////////Menubar gif///////////////////////////////////////////////////////////////////	

	ImageIcon imgx = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif"); //65*65
	labelmbx = new JLabel("",imgx,JLabel.CENTER);
	
////////////////////////////////Menubar black label///////////////////////////////////////////////////////////////////	
	
	labelmb = new JLabel("<html><font color=#008B8B>RAW</font></html>");
	CustomFont cf=new CustomFont();
	labelmb.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,25.0f));
	labelmb.setForeground(Color.decode("#00FFFF"));
	labelmb.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmb.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmb.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmb.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmb.setAlignmentX(Component.LEFT_ALIGNMENT);
	
//////////////////////////////Menubar Button///////////////////////////////////////////////////////////////////////////




	//------------------------------------------------------
	mbutton1 = new HoverButton(" HOME ");
	mbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton1.setBackground(new Color(125,125,125));
	mbutton1.setForeground(Color.WHITE);
	mbutton1.setCursor(handcursor);
	mbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
	mbutton1.setOpaque(false);
    mbutton1.setContentAreaFilled(false);
    mbutton1.setBorderPainted(true);
	mbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton1.setFocusable(false);
	mbutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
		mbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainframe.remove(menu(mainframe));
			mainframe.setJMenuBar(null);
            mainmenu mf = new mainmenu(mainframe);
			mainframe.setJMenuBar(mf.menubar(mainframe));
			mainframe.setContentPane(mf.menu(mainframe));
			mainframe.setVisible(true);	
			
		
		}		
		
	});	
	
	
	//------------------------------------------------------	
	mbutton2 = new HoverButton(" ABOUT ");
	mbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton2.setBackground(new Color(125,125,125));
	mbutton2.setForeground(Color.WHITE);
	mbutton2.setCursor(handcursor);
	mbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	mbutton2.setOpaque(false);
    mbutton2.setContentAreaFilled(false);
    mbutton2.setBorderPainted(true);
	mbutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton2.setFocusable(false);	
	mbutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);	
		
		}		
		
	});	
	mbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			mainframe.remove(menu(mainframe));
			mainframe.setJMenuBar(null);
            about ab = new about(mainframe);
			mainframe.setJMenuBar(ab.abmenubar(mainframe));
			mainframe.setContentPane(ab.aboutus(mainframe));
			mainframe.setVisible(true);	
			
			
		
		}		
		
	});	
	
	//------------------------------------------------------	
	mbutton3 = new HoverButton(" CONTACT ");
	mbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton3.setBackground(new Color(125,125,125));
	mbutton3.setForeground(Color.WHITE);
	mbutton3.setCursor(handcursor);
	mbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	mbutton3.setOpaque(false);
    mbutton3.setContentAreaFilled(false);
    mbutton3.setBorderPainted(true);
	mbutton3.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton3.setFocusable(false);
	mbutton3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	mbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
			mainframe.getContentPane().removeAll();
			mainframe.setJMenuBar(null);
			
            contact c = new contact(mainframe);
			
			mainframe.setJMenuBar(c.contactbar(mainframe));
			//mainframe.getContentPane().add(c.contactpage(mainframe));
			mainframe.setContentPane(c.contactpage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});
	

	//------------------------------------------------------	
	mbutton4 = new HoverButton(" FEEDBACK ");
	mbutton4.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton4.setBackground(new Color(125,125,125));
	mbutton4.setForeground(Color.WHITE);
	mbutton4.setCursor(handcursor);
	mbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	mbutton4.setOpaque(false);
    mbutton4.setContentAreaFilled(false);
    mbutton4.setBorderPainted(true);
	mbutton4.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton4.setFocusable(false);	
	mbutton4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	mbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainframe.remove(menu(mainframe));
			mainframe.setJMenuBar(null);
			
            feedback f = new feedback(mainframe);
			
			mainframe.setJMenuBar(f.feedbackbar(mainframe));
			mainframe.setContentPane(f.feedbackpage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});
	//------------------------------------------------------	
	mbutton5 = new HoverButton(" REPORT ");
	mbutton5.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton5.setBackground(new Color(125,125,125));
	mbutton5.setForeground(Color.decode("#00c700"));
	mbutton5.setCursor(handcursor);
	mbutton5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	mbutton5.setOpaque(false);
    mbutton5.setContentAreaFilled(false);
    mbutton5.setBorderPainted(true);
	mbutton5.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton5.setFocusable(false);
	mbutton5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
		mbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
			mainframe.remove(menu(mainframe));
			mainframe.setJMenuBar(null);
			
            report r = new report(mainframe);
			
			mainframe.setJMenuBar(r.reportbar(mainframe));
			mainframe.setContentPane(r.reportpage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});
	//------------------------------------------------------	
	mbutton6 = new HoverButton(" EXIT ");
	mbutton6.setFont(new Font("Comic Sans",Font.BOLD,18));
	mbutton6.setBackground(new Color(125,125,125));
	mbutton6.setForeground(Color.RED);
	mbutton6.setCursor(handcursor);
	mbutton6.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
	mbutton6.setOpaque(false);
    mbutton6.setContentAreaFilled(false);
    mbutton6.setBorderPainted(true);
	mbutton6.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton6.setFocusable(false);	
	mbutton6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	mbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(mainframe);
			ex.confirmexit(mainframe,exitvolume);
		
		}		
		
	});
	//-------------------------------------------------------------------
	
/////////////////////////////////Menubar button add on the menubar label///////////////////////////////////////////////////////

	mb.add(Box.createRigidArea(new Dimension(10, 0)));
	mb.add(labelmbx);
	
	mb.add(labelmb);
	mb.add(mbutton1);
	mb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mb.add(mbutton2);
	mb.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mb.add(mbutton3);
	mb.add(Box.createRigidArea(new Dimension(25,0)));
	
	mb.add(mbutton4);
	mb.add(Box.createRigidArea(new Dimension(25, 0)));

    mb.add(mbutton5);
    mb.add(Box.createRigidArea(new Dimension(25, 0)));

    mb.add(mbutton6);
    mb.add(Box.createRigidArea(new Dimension(50, 0)));


return mb;
 	
}

///////////////////////////////////////Main Menu function- receive Jframe and return Jscrollpane (Part-GUI)/////////////////////////////
public JPanel menu(JFrame frame)
{
 
/////////////////////Main pannel initialize//////////////////
	p1 = new JPanel();
    p1.setSize((frame.getWidth()), (frame.getHeight()));
	p1.setBackground(Color.decode("#191919"));
	p1.setLayout(new BoxLayout(p1, BoxLayout.X_AXIS));
	p1.setBorder(new EmptyBorder(0,0,0,0));
   
/////////////////////Backgroud wallpaper initialize//////////////
Image imgmbackground = null;
	try
	{
		
        imgmbackground = ImageIO.read(new File("Resources/Images/Mainmenu/mainpanel_background_picture.png")); //1920*1080
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	ImagePanel labelm1= new ImagePanel(imgmbackground);
	labelm1.setLayout(new GridLayout(1,0,0,0));
	labelm1.setBorder(new EmptyBorder(0,0,0,0));
	labelm1.setOpaque(false);
	
/////////////////////RAW label initialize/////////////////////
	ImageIcon imgmraw = new ImageIcon("Resources/Images/Mainmenu/main_panel_background_raw_picture.png"); //420*420
	labelm2 = new JLabel("",imgmraw,JLabel.CENTER);
	labelm2.setLayout(new GridLayout(1,3,0,0));////////////////row<COL<X GAP<Y GAP
	labelm2.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	labelm2.setOpaque(false);
	
/////////////////////Transparent pannel initialize//////////////

lefttransparentpanel = new JPanel();
middletransparentpanel = new JPanel();
righttransparentpanel = new JPanel();

	lefttransparentpanel.setBackground(new Color(0,0,0,0));
	lefttransparentpanel.setLayout(new GridLayout(1,0,0,0));
	lefttransparentpanel.setBorder(new EmptyBorder(150,100,150,20));
	
	middletransparentpanel.setBackground(new Color(0,0,0,0));
	middletransparentpanel.setLayout(new BoxLayout(middletransparentpanel, BoxLayout.Y_AXIS));
	middletransparentpanel.setBorder(new EmptyBorder(15,60,0,60));

	righttransparentpanel.setBackground(new Color(0,0,0,0));
	righttransparentpanel.setLayout(new BoxLayout(righttransparentpanel, BoxLayout.Y_AXIS));
	righttransparentpanel.setBorder(new EmptyBorder(150,20,0,100));
	
	
/////////////////////Small three panels(login, sinup and admin)//////////////////////////	
loginpanel = new JPanel();
signuppanel = new JPanel();
adminpanel = new JPanel();

/////////////////////Login gif panel 1//////////////////////////
	loginpanel.setLayout(null);
	loginpanel.setBackground(new Color(128,128,128));
	loginpanel.setLayout(new GridLayout(1,0,0,0));
	loginpanel.setBorder(new EmptyBorder(5,5,5,5));
	loginpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	loginpanel.setPreferredSize(new Dimension(10,10));

/////////////////////Signup gif panel 2/////////////////////////	
	signuppanel.setLayout(null);
	signuppanel.setBackground(new Color(128,128,128));
	signuppanel.setLayout(new GridLayout(1,0,0,0));
	signuppanel.setBorder(new EmptyBorder(5,5,5,5));
	signuppanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	signuppanel.setPreferredSize(new Dimension(10,10));

/////////////////////Admin gif panel 3/////////////////////////
	adminpanel.setLayout(null);
	adminpanel.setBackground(new Color(128,128,128));
	adminpanel.setLayout(new GridLayout(1,0,0,0));
	adminpanel.setBorder(new EmptyBorder(5,5,5,5));
	adminpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	adminpanel.setPreferredSize(new Dimension(10,10));
	
/////////////////////////////////////Small three panels background wallpaper///////////////////////////////////

	ImageIcon panimage1 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png");  //1920*1280
	loginpanelbackground = new JLabel("",panimage1,JLabel.CENTER);
	loginpanelbackground.setLayout(new BoxLayout(loginpanelbackground, BoxLayout.Y_AXIS));
	loginpanelbackground.setBorder(new EmptyBorder(20,5,20,5));
	loginpanelbackground.setOpaque(true);
	
	
	ImageIcon panimage2 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png"); //1920*1280
	signuppanelbackground = new JLabel("",panimage2,JLabel.CENTER);
	signuppanelbackground.setLayout(new BoxLayout(signuppanelbackground, BoxLayout.Y_AXIS));
	signuppanelbackground.setBorder(new EmptyBorder(20,5,20,5));
	signuppanelbackground.setOpaque(false);
	
	
	ImageIcon panimage3 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png"); //1920*1280
	adminpanelbackground = new JLabel("",panimage3,JLabel.CENTER);
	adminpanelbackground.setLayout(new BoxLayout(adminpanelbackground, BoxLayout.Y_AXIS));
	adminpanelbackground.setBorder(new EmptyBorder(20,5,20,5));
	adminpanelbackground.setOpaque(false);

	
////////////////////////////////////Login pannel//////////////////////////////////////////////////////////

                    /*gif button*/

	ImageIcon imgmlogin = new ImageIcon("Resources/Gifs/Mainmenu/login_button_gif.gif"); //220*200
	buttons1 = new HoverButton("",imgmlogin);
	buttons1.setBackground(Color.decode("#008B8B"));
	buttons1.setBorder(BorderFactory.createEtchedBorder(0));
	buttons1.setOpaque(false);
    buttons1.setContentAreaFilled(false);
    buttons1.setBorderPainted(false);
	buttons1.setCursor(handcursor);
	buttons1.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons1.setFocusable(false);
	buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 loginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			loginpanel.repaint();
			
			 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
	
			
		
		
		}		
		
	});	
buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       loginpanel.setBorder(new EmptyBorder(5,5,5,5));
			loginpanel.repaint();
		
		
		}		
		
	});	
	
	
	buttons1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
            loginmenu lm = new loginmenu(mainframe);
			
			mainframe.setJMenuBar(lm.loginmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});

                   /*login button*/
	buttons2 = new HoverButton("Log In");
	buttons2.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttons2.setBackground(Color.decode("#aed6dc"));
	buttons2.setForeground(Color.decode("#00ffff"));
	buttons2.setCursor(handcursor);
    buttons2.setBorder(BorderFactory.createEtchedBorder(0));
	buttons2.setOpaque(false);
    buttons2.setContentAreaFilled(false);
    buttons2.setBorderPainted(false);
	buttons2.setFocusable(false);
	buttons2.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		 loginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			loginpanel.repaint();
			 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
		
			
			
		
		}		
		
	});	
	buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       loginpanel.setBorder(new EmptyBorder(5,5,5,5));
			loginpanel.repaint();
		
		
		}		
		
	});	
	buttons2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
            loginmenu lm = new loginmenu(mainframe);
			
			mainframe.setJMenuBar(lm.loginmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});

                   /*login messege*/
	labelm3 = new JLabel("<html><font color=#a9a9a9>Stay updated on your professional world</font><br><font size=4>'RAW'</font><font size = 5.5 color=#808080> opens a door to explore things</font></html>");
	labelm3.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labelm3.setForeground(Color.RED);	
	labelm3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelm3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelm3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelm3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelm3.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelm3.setCursor(textcursor);
	
	
////////////////////////////////////Sign Up pannel///////////////////////////////////

                   /*Sign up Gifs*/
	ImageIcon imgmsignup = new ImageIcon("Resources/Gifs/Mainmenu/signup_button_gif.gif"); //220*200
	buttons3 = new HoverButton("",imgmsignup);
	buttons3.setBackground(Color.decode("#010b13"));
	buttons3.setBorder(BorderFactory.createEtchedBorder(0));
	buttons3.setOpaque(false);
    buttons3.setContentAreaFilled(false);
    buttons3.setBorderPainted(false);
    buttons3.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons3.setCursor(handcursor);
	buttons3.setFocusable(false);
		buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
			
	 signuppanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
	 signuppanel.repaint();
			
MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
			
		
		}		
		
	});	
	buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       signuppanel.setBorder(new EmptyBorder(5,5,5,5));
			signuppanel.repaint();
		
		
		}		
		
	});	
	
		buttons3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
            signupmenu sm = new signupmenu(mainframe);
			
			mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(sm.signupmenupage(mainframe));
mainframe.setContentPane(sm.signupmenupage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});
                   
				   /*Sign up button*/
	buttons4 = new HoverButton("Sign Up");
	buttons4.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttons4.setBackground(Color.decode("#aed6dc"));
	buttons4.setForeground(Color.decode("#007FFF"));
	buttons4.setBorder(BorderFactory.createEtchedBorder(0));
	buttons4.setOpaque(false);
    buttons4.setContentAreaFilled(false);
    buttons4.setBorderPainted(false);
	buttons4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons4.setCursor(handcursor);
	buttons4.setFocusable(false);
		buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		signuppanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
	 signuppanel.repaint();
	 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
	
			
			
		
		}		
		
	});	
	buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       signuppanel.setBorder(new EmptyBorder(5,5,5,5));
			signuppanel.repaint();
		
		
		}		
		
	});	
buttons4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
            signupmenu sm = new signupmenu(mainframe);
			
			mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(sm.signupmenupage(mainframe));
mainframe.setContentPane(sm.signupmenupage(mainframe));
			mainframe.setVisible(true);	
		}		
		
	});
                    /*signup messege*/
	labelm5 = new JLabel("<html><font color=#a9a9a9>Welcome to one of the</font></html>");
	labelm5.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labelm5.setForeground(Color.RED);
	labelm5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelm5.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelm5.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelm5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelm5.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelm5.setCursor(textcursor);
	
	
	labelmz5 = new JLabel("<html><font color=#a9a9a9>largest desktop based workplace:</font><font size = 4> 'RAW'</font></html>");
	labelmz5.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labelmz5.setForeground(Color.RED);	
	labelmz5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmz5.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelmz5.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelmz5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmz5.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelmz5.setCursor(textcursor);
	
//////////////////////////////////Admin access pannel////////////////////////////////////
	
                   /*admin login gif*/
	ImageIcon imgmadmin = new ImageIcon("Resources/Gifs/Mainmenu/admin_button_gif.gif"); //220*200
	buttons5 = new HoverButton("",imgmadmin);
	buttons5.setBackground(Color.decode("#010b13"));
	buttons5.setBorder(BorderFactory.createEtchedBorder(0));
	buttons5.setOpaque(false);
    buttons5.setContentAreaFilled(false);
    buttons5.setBorderPainted(false);
	buttons5.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons5.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons5.setCursor(handcursor);
	buttons5.setFocusable(false);
		buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		 adminpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
	       adminpanel.repaint();
	 
	 
	  MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
		
			
			
		
		}		
		
	});	
		buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       adminpanel.setBorder(new EmptyBorder(5,5,5,5));
			adminpanel.repaint();
		
		
		}		
		
	});	
	
			buttons5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 adminlogin al = new adminlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(bl.buyerlogpage(mainframe));
			mainframe.setContentPane(al.adminlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
                   /*admin login button*/
	buttons6 = new HoverButton("Admin Access");
	buttons6.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttons6.setBackground(Color.decode("#aed6dc"));
	buttons6.setForeground(Color.decode("#FA441D"));
	buttons6.setBorder(BorderFactory.createEtchedBorder(0));
	buttons6.setOpaque(false);
    buttons6.setContentAreaFilled(false);
    buttons6.setBorderPainted(false);
	buttons6.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons6.setCursor(handcursor);
	buttons6.setFocusable(false);
		buttons6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		adminpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
	       adminpanel.repaint();
		   
		 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
			
		
		}		
		
	});	
		buttons6.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       adminpanel.setBorder(new EmptyBorder(5,5,5,5));
			adminpanel.repaint();
		
		
		}		
		
	});
		buttons6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 adminlogin al = new adminlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(bl.buyerlogpage(mainframe));
			mainframe.setContentPane(al.adminlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
                   /*admin login messege*/
	labelm6 = new JLabel("<html><font color=#a9a9a9>Reserved for the administrator</font><br>Only for development purpose</html>");
	labelm6.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labelm6.setForeground(Color.RED);	
	labelm6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelm6.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelm6.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelm6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelm6.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelm6.setCursor(textcursor);
	
	
////////////////////////////////////// Title of the second big panel//////////////////////////////////////////

	
	labelx0 = new JLabel("  Welcome to the community  ");
	labelx0.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,18));
	labelx0.setForeground(Color.decode("#82CFFD"));
	labelx0.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#82CFFD"), Color.GRAY, Color.GRAY, Color.decode("#82CFFD")));
	labelx0.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelx0.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelx0.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelx0.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelx0.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelx0.setOpaque(false);
	
	
	labelxs0 = new JLabel("'Together everyone achieves more'");
	labelxs0.setFont(new Font("Comic Sans",Font.ITALIC,14));
	labelxs0.setForeground(Color.decode("#e00000"));
	labelxs0.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelxs0.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labelxs0.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labelxs0.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelxs0.setAlignmentX(Component.CENTER_ALIGNMENT);
	labelxs0.setOpaque(false);
	
	
////////////////////////////////////// extra buttons panel for discord, youtube, linkedin and facebook//////////////////////////////////////////	
    
	smallbuttonpanel = new JPanel();
	smallbuttonpanel.setLayout(null);
	smallbuttonpanel.setBackground(new Color(0,0,0,0));
	smallbuttonpanel.setLayout(new BoxLayout(smallbuttonpanel, BoxLayout.X_AXIS));
	smallbuttonpanel.setBorder(new EmptyBorder(0,0,0,0));
	
////////////////////////////////////// Buttons for discord, youtube, linkedin and facebook//////////////////////////////////////////
	
	availablelabel = new JLabel("  Available In:  ");
	availablelabel.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
	availablelabel.setForeground(Color.decode("#986960"));
	availablelabel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#c0362c"), Color.decode("#c0362c"), Color.decode("#c0362c"), Color.decode("#c0362c")));
	availablelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	availablelabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	availablelabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	availablelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	availablelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	availablelabel.setOpaque(false);

	ImageIcon dis1 = new ImageIcon("Resources/Images/Mainmenu/discord_logo.png");  //30*30
	discordbttn = new JButton("",dis1);
	discordbttn.setBackground(new Color(0,0,0));
	discordbttn.setBorder(null);
	discordbttn.setSize(dis1.getIconWidth(),dis1.getIconHeight());
	discordbttn.setOpaque(false);
    discordbttn.setContentAreaFilled(false);
    discordbttn.setBorderPainted(false);
	discordbttn.setMinimumSize(new java.awt.Dimension(30,30));
	discordbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	discordbttn.setCursor(handcursor);
	discordbttn.setFocusable(false);
		discordbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",menuavailvolume);
		
		
			
			
		
		}		
		
	});	
	discordbttn.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			openweb("https://discord.gg/RGjerCVbR3");
		}		
		
	});	
	
	
	ImageIcon face1 = new ImageIcon("Resources/Images/Mainmenu/facebook_logo.png");  //30*30
	facebookbttn = new JButton("",face1);
	facebookbttn.setBackground(new Color(0,0,0,0));
	facebookbttn.setBorder(null);
	facebookbttn.setSize(dis1.getIconWidth(),dis1.getIconHeight());
	facebookbttn.setOpaque(false);
    facebookbttn.setContentAreaFilled(false);
    facebookbttn.setBorderPainted(false);
	facebookbttn.setMinimumSize(new java.awt.Dimension(30,30));
	facebookbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	facebookbttn.setCursor(handcursor);
	facebookbttn.setFocusable(false);
	facebookbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",menuavailvolume);
			
			
		
		}		
		
	});	
	facebookbttn.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			openweb("https://www.facebook.com/niloykantipaul.NKP/");
		}		
		
	});	
	
	ImageIcon ins1 = new ImageIcon("Resources/Images/Mainmenu/linkedin_logo.png");  //30*30
	linkedinbttn = new JButton("",ins1);
	linkedinbttn.setBackground(new Color(0,0,0,0));
	linkedinbttn.setBorder(null);
	linkedinbttn.setSize(dis1.getIconWidth(),dis1.getIconHeight());
	linkedinbttn.setOpaque(false);
    linkedinbttn.setContentAreaFilled(false);
    linkedinbttn.setBorderPainted(false);
	linkedinbttn.setMinimumSize(new java.awt.Dimension(30,30));
	linkedinbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	linkedinbttn.setCursor(handcursor);
	linkedinbttn.setFocusable(false);
	linkedinbttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
	 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",menuavailvolume);
			
			
		
		}		
		
	});	
	linkedinbttn.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			openweb("https://www.linkedin.com/in/niloy-kanti-paul-5543181ab/");
		}		
		
	});		
	
	
	ImageIcon uthube = new ImageIcon("Resources/Images/Mainmenu/youtube_logo.png");  //30*30
	youtubebttn = new JButton("",uthube);
	youtubebttn.setBackground(new Color(0,0,0,0));
	youtubebttn.setBorder(null);
	youtubebttn.setSize(dis1.getIconWidth(),dis1.getIconHeight());
	youtubebttn.setOpaque(false);
    youtubebttn.setContentAreaFilled(false);
    youtubebttn.setBorderPainted(false);
	youtubebttn.setMinimumSize(new java.awt.Dimension(30,30));
	youtubebttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	youtubebttn.setCursor(handcursor);
	youtubebttn.setFocusable(false);	
	youtubebttn.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
	 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",menuavailvolume);
			
			
		
		}		
		
	});	
	youtubebttn.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			openweb("https://www.youtube.com/channel/UCDrxygFG_lz_2mUopZS-tvg/featured");
		}		
		
	});
	
	smallbuttonpanel.add(availablelabel);
	smallbuttonpanel.add(Box.createRigidArea(new Dimension(15, 0)));
	smallbuttonpanel.add(discordbttn);
	smallbuttonpanel.add(Box.createRigidArea(new Dimension(10, 0)));
	smallbuttonpanel.add(facebookbttn);
	smallbuttonpanel.add(Box.createRigidArea(new Dimension(10, 0)));
	smallbuttonpanel.add(linkedinbttn);
	smallbuttonpanel.add(Box.createRigidArea(new Dimension(10, 0)));
	smallbuttonpanel.add(youtubebttn);
	

/////////////////////// transparent pannel add to raw background ////////////
   
    loginpanelbackground.add(Box.createRigidArea(new Dimension(0, 5)));
    loginpanelbackground.add(buttons1);
	loginpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
    loginpanelbackground.add(buttons2);
	loginpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	loginpanelbackground.add(labelm3);
	
	
	signuppanelbackground.add(Box.createRigidArea(new Dimension(0, 5)));
    signuppanelbackground.add(buttons3);
	signuppanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	signuppanelbackground.add(buttons4);
	signuppanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	signuppanelbackground.add(labelm5);
	signuppanelbackground.add(Box.createRigidArea(new Dimension(0, 5)));
	signuppanelbackground.add(labelmz5);

    adminpanelbackground.add(Box.createRigidArea(new Dimension(0, 5)));
	adminpanelbackground.add(buttons5);
	adminpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	adminpanelbackground.add(buttons6);
	adminpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	adminpanelbackground.add(labelm6);
	

loginpanel.add(loginpanelbackground);
signuppanel.add(signuppanelbackground);
adminpanel.add(adminpanelbackground);


lefttransparentpanel.add(loginpanel);

middletransparentpanel.add(Box.createRigidArea(new Dimension(0, 37)));
middletransparentpanel.add(labelx0);

middletransparentpanel.add(Box.createRigidArea(new Dimension(0, 5)));
middletransparentpanel.add(labelxs0);

middletransparentpanel.add(Box.createRigidArea(new Dimension(0, 48)));

middletransparentpanel.add(signuppanel);


righttransparentpanel.add(adminpanel);
righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 99)));
righttransparentpanel.add(smallbuttonpanel);
righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 20)));


////////////////////// big panel add to raw background ////////////

labelm2.add(lefttransparentpanel);
labelm2.add(middletransparentpanel);
labelm2.add(righttransparentpanel);

middletransparentpanel.add(Box.createRigidArea(new Dimension(0, 150)));


////////////////////// raw add to main background ////////////
labelm1.add(labelm2);
////////////////////// main background add to main pannel ////////////

p1.add(labelm1);




return p1;
	
}
	
////////////////////// Function that controlling discord, youtube, linkedin and facebook  //////////////////////////
	
	public void openweb(String url)
	{
		String myos=System.getProperty("os.name").toLowerCase();
		
		
		try 
		{
            if(Desktop.isDesktopSupported()) // Probably Windows
			{ 
              
                Desktop desktop = Desktop.getDesktop();
                desktop.browse(new URI(url));
            } 
			else // Definitely Non-windows
			{ 
                Runtime runtime = Runtime.getRuntime();
                if(myos.contains("mac")) // Apples
				{                  
                    runtime.exec("open " + url);
                } 
                else if(myos.contains("nix") || myos.contains("nux")) // Linux flavours 
				{ 
                    runtime.exec("xdg-open " + url);
                }
                else 
				{
					System.exit(0);

				}
            }
          
        }
        catch(IOException | URISyntaxException eek) 
		{
			System.exit(0);
        }

	}

}