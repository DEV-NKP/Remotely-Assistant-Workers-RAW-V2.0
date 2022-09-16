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
public class loginmenu 
{
    JLabel labell1,labell2,labell3,labell4,labell5,labell6,labell7,labell8,slogtext1,slogtext2,labelmbx,labelmb,labelxs0,labelx0,sellerloginpanelbackground,buyerloginpanelbackground;
	JButton buttonl1,buttonl2,buttonl3,buttonl4,buttonl5,buttonl6,mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6; 
	JPanel buyerloginpanel,sellerloginpanel,logpanel,slogpanel,downtransparentpanel,uptransparentpanel,downrighttransparentpanel,downlefttransparentpanel,leftttransparentpanel,righttransparentpanel,sellerpan1,sellerpan2,buyerpan1,buyerpan2;
	JScrollPane loginmjp,sellerlogjp;
	JFrame mainframe;
	JTextField textarea1;
	int x,y;
	Dimension screensize;
	JMenuBar mb; 
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
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



	public loginmenu()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	}
	
	public loginmenu(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
	}
	
	
public JMenuBar loginmenubar(JFrame frame)
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
	mbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
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
		
			mainmenu m2 = new mainmenu(mainframe);
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			mainframe.setJMenuBar(m2.menubar(mainframe));
			//mainframe.getContentPane().add(m2.menu(mainframe));
			mainframe.setContentPane(m2.menu(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	
	//------------------------------------------------------	
	mbutton2 = new HoverButton(" Log In ");
	mbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton2.setBackground(new Color(125,125,125));
	mbutton2.setForeground(Color.decode("#00ffff"));
	mbutton2.setCursor(handcursor);
	mbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff")));
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
			
	//------------------------------------------------------	
	mbutton3 = new HoverButton(" Sign Up ");
	mbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton3.setBackground(new Color(125,125,125));
	mbutton3.setForeground(Color.decode("#007FFF"));
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
	
	//------------------------------------------------------	
	mbutton4 = new HoverButton(" EXIT ");
	mbutton4.setFont(new Font("Comic Sans",Font.BOLD,18));
	mbutton4.setBackground(new Color(125,125,125));
	mbutton4.setForeground(Color.RED);
	mbutton4.setCursor(handcursor);
	mbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
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



return mb;
 	
}
///////////////////////////////////////// Login menu function /////////////////////////////////////////////////
	
public JPanel loginmenupage(JFrame frame)
{
	logpanel = new JPanel();
    logpanel.setSize((frame.getWidth()), (frame.getHeight()));
	logpanel.setBackground(Color.decode("#191919"));
	logpanel.setLayout(new BoxLayout(logpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	logpanel.setBorder(null);////////////////top<Left<bottom<right
	logpanel.setOpaque(false);
	
	
	
//////////////////////////////////////// Background ///////////////////////////////////////////////////////////	
	
	Image imgmbackground = null;
	try
	{
        imgmbackground = ImageIO.read(new File("Resources/Images/Mainmenu/mainpanel_background_picture.png")); //1920*1080
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	ImagePanel labell1= new ImagePanel(imgmbackground);
	labell1.setLayout(new GridLayout(1,0,0,0));
	labell1.setBorder(new EmptyBorder(0,0,0,0));
	labell1.setOpaque(false);
	
	ImageIcon imglraw = new ImageIcon("Resources/Images/Mainmenu/main_panel_background_raw_picture.png"); //420*420
	labell2 = new JLabel("",imglraw,JLabel.CENTER);
	labell2.setLayout(new BoxLayout(labell2, BoxLayout.Y_AXIS));
	labell2.setBorder(new EmptyBorder(10,10,10,10));
	labell2.setOpaque(false);

    uptransparentpanel = new JPanel();
	uptransparentpanel.setBackground(new Color(0,0,0,0));
	uptransparentpanel.setLayout(new BoxLayout(uptransparentpanel, BoxLayout.Y_AXIS));
	uptransparentpanel.setBorder(new EmptyBorder(20,150,20,150));
	
	downtransparentpanel = new JPanel();
	downtransparentpanel.setBackground(new Color(0,0,0,0));
	downtransparentpanel.setLayout(new GridLayout(1,2,0,0));
	downtransparentpanel.setBorder(new EmptyBorder(15,60,100,60));
	
	downlefttransparentpanel = new JPanel();
	downlefttransparentpanel.setBackground(new Color(0,0,0,0));
	downlefttransparentpanel.setLayout(new BoxLayout(downlefttransparentpanel, BoxLayout.Y_AXIS));
	downlefttransparentpanel.setBorder(new EmptyBorder(60,50,50,20));
	downlefttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
    downrighttransparentpanel = new JPanel();
	downrighttransparentpanel.setBackground(new Color(0,0,0,0));
	downrighttransparentpanel.setLayout(new BoxLayout(downrighttransparentpanel, BoxLayout.Y_AXIS));
	downrighttransparentpanel.setBorder(new EmptyBorder(60,20,50,50));
	downrighttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

	
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

/*
sellerpan1 = new JPanel();
sellerpan1.setBackground(new Color(0,0,0));
sellerpan1.setLayout(new BoxLayout(sellerpan1, BoxLayout.Y_AXIS));
sellerpan1.setBorder(new EmptyBorder(0,0,0,0));	

sellerpan2 = new JPanel();
sellerpan2.setBackground(new Color(0,0,0));
sellerpan2.setLayout(new BoxLayout(sellerpan2, BoxLayout.Y_AXIS));
sellerpan2.setBorder(new EmptyBorder(0,0,0,0));	
*/
/*buyerpan1 = new JPanel();
buyerpan1.setBackground(new Color(0,0,0));
buyerpan1.setLayout(new BoxLayout(buyerpan1, BoxLayout.Y_AXIS));
buyerpan1.setBorder(new EmptyBorder(0,0,0,0));	

buyerpan2 = new JPanel();
buyerpan2.setBackground(new Color(0,0,0));
buyerpan2.setLayout(new BoxLayout(buyerpan2, BoxLayout.Y_AXIS));
buyerpan2.setBorder(new EmptyBorder(0,0,0,0));*/



leftttransparentpanel = new JPanel();
leftttransparentpanel.setBackground(new Color(0,0,0,150));
leftttransparentpanel.setLayout(new BoxLayout(leftttransparentpanel, BoxLayout.Y_AXIS));
leftttransparentpanel.setBorder(new EmptyBorder(30,30,30,30));
leftttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

sellerloginpanel = new JPanel();
sellerloginpanel.setBackground(new Color(128,128,128));
sellerloginpanel.setLayout(new GridLayout(1,0,0,0));
sellerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
sellerloginpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
sellerloginpanel.setMinimumSize(new Dimension(350, 500));
sellerloginpanel.setPreferredSize(new Dimension(350, 500));
sellerloginpanel.setMaximumSize(new Dimension(400, 600));

ImageIcon panimage11 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png");  //1920*1280
sellerloginpanelbackground = new JLabel("",panimage11,JLabel.CENTER);
sellerloginpanelbackground.setLayout(new BoxLayout(sellerloginpanelbackground, BoxLayout.Y_AXIS));
sellerloginpanelbackground.setBorder(new EmptyBorder(0,0,0,0));
sellerloginpanelbackground.setOpaque(true);


righttransparentpanel = new JPanel();
righttransparentpanel.setBackground(new Color(0,0,0,150));
righttransparentpanel.setLayout(new BoxLayout(righttransparentpanel, BoxLayout.Y_AXIS));
righttransparentpanel.setBorder(new EmptyBorder(30,30,30,30));
righttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

buyerloginpanel = new JPanel();
buyerloginpanel.setBackground(new Color(128,128,128));
buyerloginpanel.setLayout(new GridLayout(1,0,0,0));
buyerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
buyerloginpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
buyerloginpanel.setMinimumSize(new Dimension(350, 500));
buyerloginpanel.setPreferredSize(new Dimension(350, 500));
buyerloginpanel.setMaximumSize(new Dimension(400, 600));

ImageIcon panimage12 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png");  //1920*1280
buyerloginpanelbackground = new JLabel("",panimage12,JLabel.CENTER);
buyerloginpanelbackground.setLayout(new BoxLayout(buyerloginpanelbackground, BoxLayout.Y_AXIS));
buyerloginpanelbackground.setBorder(new EmptyBorder(0,0,0,0));
buyerloginpanelbackground.setOpaque(true);
////////////////////////////////////// Seller Sign in ///////////////////////////////////////////////////////////	

    ImageIcon imgselsign = new ImageIcon("Resources/Gifs/Login_Menu/seller_login.gif");
	buttonl1 = new HoverButton("",imgselsign);
	buttonl1.setBackground(Color.decode("#008B8B"));
	buttonl1.setBorder(BorderFactory.createEtchedBorder(0));
	buttonl1.setOpaque(false);
    buttonl1.setContentAreaFilled(false);
    buttonl1.setBorderPainted(false);
	buttonl1.setCursor(handcursor);
	buttonl1.setBorder(new EmptyBorder(20,0,0,0));
	buttonl1.setMinimumSize(new java.awt.Dimension(230, 210));
	buttonl1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonl1.setFocusable(false);
	
	buttonl1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 sellerloginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff")));
			sellerloginpanel.repaint();
			
			
	MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
		
		
		}		
		
	});	
	
	buttonl1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 sellerlogin sl = new sellerlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(sl.sellerlogpage(mainframe));
			mainframe.setContentPane(sl.sellerlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	
buttonl1.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       sellerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
			sellerloginpanel.repaint();
		
		
		}		
		
	});	
	
	
	
	buttonl2 = new HoverButton("Seller Log In");
	buttonl2.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttonl2.setBackground(Color.decode("#aed6dc"));
	buttonl2.setForeground(Color.decode("#00ffff"));
	buttonl2.setCursor(handcursor);
    buttonl2.setBorder(BorderFactory.createEtchedBorder(0));
	buttonl2.setOpaque(false);
    buttonl2.setContentAreaFilled(false);
    buttonl2.setBorderPainted(false);
	buttonl2.setFocusable(false);
	buttonl2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	buttonl2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 sellerloginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff")));
			sellerloginpanel.repaint();
			
			
	MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
		
		
		}		
		
	});	
	
	buttonl2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 sellerlogin sl = new sellerlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(sl.sellerlogpage(mainframe));
			mainframe.setContentPane(sl.sellerlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	
buttonl2.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       sellerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
			sellerloginpanel.repaint();
		
		
		}		
		
	});		
	

	
	labell3 = new JLabel("Stay tuned with the RAW community...");
	labell3.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell3.setForeground(Color.decode("#00b2b2"));
	labell3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell3.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell3.setCursor(textcursor);
	
	labell4 = new JLabel("** Work Your Way **");
	labell4.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell4.setForeground(Color.decode("#00b2b2"));
	labell4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell4.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell4.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell4.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell4.setCursor(textcursor);
	
	labell5 = new JLabel("** Only skill is the best way to make money!!! **");
	labell5.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell5.setForeground(Color.decode("#00b2b2"));
	labell5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell5.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell5.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell5.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell5.setCursor(textcursor);		
	
////////////////////////////////////// Buyer Sign in /////////////////////////////////////////////////////////////		
	
    ImageIcon imgbuysign = new ImageIcon("Resources/Gifs/Login_Menu/buyer_login.gif");
	buttonl3 = new HoverButton("",imgbuysign);
	buttonl3.setBackground(Color.decode("#008B8B"));
	buttonl3.setBorder(BorderFactory.createEtchedBorder(0));
	buttonl3.setBorder(new EmptyBorder(20,0,0,0));
	buttonl3.setOpaque(false);
    buttonl3.setContentAreaFilled(false);
    buttonl3.setBorderPainted(false);
	buttonl3.setCursor(handcursor);
	buttonl3.setMinimumSize(new java.awt.Dimension(220, 200));
	buttonl3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonl3.setFocusable(false);
	
	buttonl3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 buyerloginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff")));
			buyerloginpanel.repaint();
			
			
MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
		
		
		}		
		
	});	
	
	
	buttonl3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 buyerlogin bl = new buyerlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(bl.buyerlogpage(mainframe));
			mainframe.setContentPane(bl.buyerlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
buttonl3.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       buyerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
			buyerloginpanel.repaint();
		
		
		}		
		
	});		
	
	
	buttonl4 = new HoverButton("Buyer Log In");
	buttonl4.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttonl4.setBackground(Color.decode("#aed6dc"));
	buttonl4.setForeground(Color.decode("#00ffff"));
	buttonl4.setCursor(handcursor);
    buttonl4.setBorder(BorderFactory.createEtchedBorder(0));
	buttonl4.setOpaque(false);
    buttonl4.setContentAreaFilled(false);
    buttonl4.setBorderPainted(false);
	buttonl4.setFocusable(false);
	buttonl4.setAlignmentX(Component.CENTER_ALIGNMENT);

	buttonl4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 buyerloginpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff"), Color.decode("#00ffff")));
			buyerloginpanel.repaint();
			
			
	MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
		
		
		}		
		
	});	
	
	buttonl4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			
			mainframe.getContentPane().removeAll();
			mainframe.setJMenuBar(null);
			 buyerlogin bl = new buyerlogin(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			//mainframe.getContentPane().add(bl.buyerlogpage(mainframe));
			mainframe.setContentPane(bl.buyerlogpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
buttonl4.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       buyerloginpanel.setBorder(new EmptyBorder(5,5,5,5));
			buyerloginpanel.repaint();
		
		
		}		
		
	});		
	
	
	labell6 = new JLabel("Stay tuned with the RAW community...");
	labell6.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell6.setForeground(Color.RED);	
	labell6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell6.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell6.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell6.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell6.setCursor(textcursor);
	
	
	labell7 = new JLabel("** Hire a skilled person for your project **");
	labell7.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell7.setForeground(Color.RED);	
	labell7.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell7.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell7.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell7.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell7.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell7.setCursor(textcursor);
	
	labell8 = new JLabel("** Make the proper usage of your money **");
	labell8.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labell8.setForeground(Color.RED);	
	labell8.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labell8.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labell8.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labell8.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labell8.setAlignmentX(Component.CENTER_ALIGNMENT);
	labell8.setCursor(textcursor);
	
	
	sellerloginpanelbackground.add(buttonl1);
	sellerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	sellerloginpanelbackground.add(buttonl2);
	sellerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	sellerloginpanelbackground.add(labell3);
	sellerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	sellerloginpanelbackground.add(labell4);
	sellerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	sellerloginpanelbackground.add(labell5);
	sellerloginpanel.add(sellerloginpanelbackground);
	leftttransparentpanel.add(sellerloginpanel);
	
	
	buyerloginpanelbackground.add(buttonl3);
	buyerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	buyerloginpanelbackground.add(buttonl4);
	buyerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	buyerloginpanelbackground.add(labell6);
	buyerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	buyerloginpanelbackground.add(labell7);
	buyerloginpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	buyerloginpanelbackground.add(labell8);
	buyerloginpanel.add(buyerloginpanelbackground);
	righttransparentpanel.add(buyerloginpanel);

	/*leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	leftttransparentpanel.add(sellerpan1);
	leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	leftttransparentpanel.add(sellerpan2);
	leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 25)));
	leftttransparentpanel.add(labell3);
	leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	leftttransparentpanel.add(labell4);
	leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	leftttransparentpanel.add(labell5);
	leftttransparentpanel.add(Box.createRigidArea(new Dimension(0, 150)));*/
	
	/*righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	righttransparentpanel.add(buyerpan1);
	righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 20)));
	righttransparentpanel.add(buyerpan2);
	righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 25)));
	righttransparentpanel.add(labell6);
	righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	righttransparentpanel.add(labell7);
	righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 7)));
	righttransparentpanel.add(labell8);
	righttransparentpanel.add(Box.createRigidArea(new Dimension(0, 150)));*/

	
	downlefttransparentpanel.add(leftttransparentpanel);
	downrighttransparentpanel.add(righttransparentpanel);
	
	downtransparentpanel.add(downlefttransparentpanel);
	downtransparentpanel.add(downrighttransparentpanel);
	
	uptransparentpanel.add(labelx0);
	uptransparentpanel.add(labelxs0);
	
	labell2.add(uptransparentpanel);
	labell2.add(downtransparentpanel);
	
	labell1.add(labell2);
	logpanel.add(labell1);
	
	return logpanel;	
}


////////////////////////////////////////////////////////////////////////////////////////

public JScrollPane sellerlogin(JFrame frame)
{
	slogpanel = new JPanel();
    slogpanel.setSize((screensize.width), (screensize.height));
	slogpanel.setBackground(Color.decode("#010b13"));
	
	sellerlogjp = new JScrollPane();
	
////////////////////////////////////////////////////////////////////////////////////////	
	
	ImageIcon imgslbackground = new ImageIcon("b.jpg");
	slogtext1 = new JLabel("",imgslbackground,JLabel.CENTER);
	slogtext1.setBounds(0,0,(int)screensize.getWidth(),(int)screensize.getHeight());
	slogpanel.add(slogtext1);
	sellerlogjp.setViewportView(slogpanel);
	
	ImageIcon imgl2 = new ImageIcon("ico3.png");
	slogtext2 = new JLabel("",imgl2,JLabel.CENTER);
	slogtext2.setBounds(x-160,y-110,(((screensize.width/2)+320)+320),(((screensize.height/2)+220)+220));
	slogtext1.add(slogtext2);
	slogpanel.add(slogtext1);
	sellerlogjp.setViewportView(slogpanel);
	
	
	textarea1 = new JTextField("Please input: ");
	textarea1.setBounds(x+200,y+150,200,40);
	textarea1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
	textarea1.setBackground(Color.decode("#696969"));
	textarea1.setFont(new Font("Arial",Font.ITALIC,15));
	textarea1.setForeground(Color.decode("#ffd700"));
	textarea1.setColumns(30);
	textarea1.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
	textarea1.addActionListener(new FieldListener());
    textarea1.addMouseListener(new FieldMouseListener());
	slogtext2.add(textarea1);
	slogtext1.add(slogtext2);
	slogpanel.add(slogtext1);
	sellerlogjp.setViewportView(slogpanel);
	
	
	return sellerlogjp;
}



	public void actionPerformed(ActionEvent ae)
	{
		JButton button = (JButton) ae.getSource();
		
		if(button == buttonl1 || button == buttonl2)
	    {
            mainframe.remove(loginmjp);
			sellerlogin(mainframe);
			mainframe.setContentPane(sellerlogjp);
			mainframe.setVisible(true);		
		}
		
	    else if(button == buttonl3 || button == buttonl4)
		{
			
		}
		
	    else if(button == buttonl5)
		{
			System.exit(0);
		}	
		
	    else if(button == buttonl6)
		{
			/*mainframe.remove(jp1);
			mainframe.();
            mainmenu main1 = new mainmenu(mainframe);
			mainframe.setContentPane(main1.menu(mainframe));
			mainframe.setVisible(true);*/
		}
		
	}
	
	
	 boolean activate = false;
	
	class FieldMouseListener implements MouseListener
	{
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
            if(activate == false){
                textarea1.setText("");
            }
            activate = true;
            textarea1.setForeground(Color.black);
        }

        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // TODO Auto-generated method stub

        }

        @Override
        public void mouseExited(MouseEvent e) {
            // TODO Auto-generated method stub

        }
    }

	
	class FieldListener implements ActionListener
	{
        public void actionPerformed(ActionEvent e) 
		{
            //System.out.println(textarea1.getText());
        }
    }
	
	
	class CustomeBorder extends AbstractBorder
	{
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height)
                 
		{    
            super.paintBorder(c, g, x, y, width, height);
            Graphics2D g2d = (Graphics2D)g;
            g2d.setStroke(new BasicStroke(12));
            //g2d.setColor(Color.blue);
			//g2d.setBorder(javax.swing.BorderFactory.createEmptyBorder());
            g2d.drawRoundRect(x, y, width - 1, height - 1, 25, 25);
        }   
    }	
	
		
	
}