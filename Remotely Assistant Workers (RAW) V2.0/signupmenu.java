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
public class signupmenu 
{
	JLabel labels1,labels2,labels3,labels4,labels5,labels6,labels7,labels8;
	JButton buttonsign1,buttonsign2,buttonsign3,buttonsign4,buttonsign5,buttonsign6; 
	JPanel signuppanel,sellersignpanel,buyersignpanel,downtransparentpanel,uptransparentpanel,downrighttransparentpanel,downlefttransparentpanel,leftttransparentpanel,righttransparentpanel;
	JScrollPane jp2;
	JFrame mainframe;
	int x,y;
	Dimension screensize;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
	JLabel loginpanelbackground,loginpanelbackground1,rightpanelbackground,leftpanelbackground,labell1,labell2,labell3,labell4,labell5,labell6,labell7,labell8,slogtext1,slogtext2,labelmbx,labelmb,labelxs0,labelx0;
	JButton buttonl1,buttonl2,buttonl3,buttonl4,buttonl5,buttonl6,mbutton1,mbutton2,mbutton3,mbutton4,mbutton5,mbutton6; 
	
	
	JTextField textarea1;

	JMenuBar mb; 
	
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

	public signupmenu()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	
	}
	
		public signupmenu(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
	}
///////////////////////////////////////// Sign up function /////////////////////////////////////////////////	
		
public JMenuBar signupmenubar(JFrame frame)
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
			mainframe.getContentPane().add(m2.menu(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	
	//------------------------------------------------------	
	mbutton2 = new HoverButton(" Log In ");
	mbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton2.setBackground(new Color(125,125,125));
	mbutton2.setForeground(Color.decode("#00ffff"));
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
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			loginmenu lm = new loginmenu(mainframe);
			
			mainframe.setJMenuBar(lm.loginmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});		
		
	//------------------------------------------------------	
	mbutton3 = new HoverButton(" Sign Up ");
	mbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	mbutton3.setBackground(new Color(125,125,125));
	mbutton3.setForeground(Color.decode("#007FFF"));
	mbutton3.setCursor(handcursor);
	mbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF"),Color.decode("#007FFF")));
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
			mainframe.getContentPane().add(sm.signupmenupage(mainframe));
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
public JPanel signupmenupage(JFrame frame)
{

	signuppanel = new JPanel();
    signuppanel.setSize((frame.getWidth()), (frame.getHeight()));
	signuppanel.setBackground(Color.decode("#191919"));
    signuppanel.setLayout(new BoxLayout(signuppanel, BoxLayout.Y_AXIS));////////////////row<COL<X GAP<Y GAP
	signuppanel.setBorder(null);////////////////top<Left<bottom<right
	signuppanel.setOpaque(false);
	
	
	

	
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

	ImagePanel labels1= new ImagePanel(imgmbackground);
	labels1.setLayout(new GridLayout(1,0,0,0));
	labels1.setBorder(new EmptyBorder(0,0,0,0));
	labels1.setOpaque(false);

	
	ImageIcon imglraw = new ImageIcon("Resources/Images/Mainmenu/main_panel_background_raw_picture.png"); //420*420
	labels2 = new JLabel("",imglraw,JLabel.CENTER);
    labels2.setLayout(new BoxLayout(labels2, BoxLayout.Y_AXIS));
	labels2.setBorder(new EmptyBorder(10,10,10,10));
	labels2.setOpaque(false);

//////////////////////////////////////// Upper panel ///////////////////////////////////////////////////////////	

	uptransparentpanel = new JPanel();
	uptransparentpanel.setBackground(new Color(0,0,0,0));
	uptransparentpanel.setLayout(new BoxLayout(uptransparentpanel, BoxLayout.Y_AXIS));
	uptransparentpanel.setBorder(new EmptyBorder(20,150,20,150));
	
//////////////////////////////////////// Down panel ///////////////////////////////////////////////////////////	

	downtransparentpanel = new JPanel();
	downtransparentpanel.setBackground(new Color(0,0,0,0));
	downtransparentpanel.setLayout(new GridLayout(1,2,0,0));
	downtransparentpanel.setBorder(new EmptyBorder(15,60,100,60));
	
//////////////////////////////////////// Down left right panel ///////////////////////////////////////////////////////////	
	
	downlefttransparentpanel = new JPanel();
	downlefttransparentpanel.setBackground(new Color(0,0,0,0));
	downlefttransparentpanel.setLayout(new BoxLayout(downlefttransparentpanel, BoxLayout.Y_AXIS));
	downlefttransparentpanel.setBorder(new EmptyBorder(60,20,50,50));
	downlefttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

	
    downrighttransparentpanel = new JPanel();
	downrighttransparentpanel.setBackground(new Color(0,0,0,0));
	downrighttransparentpanel.setLayout(new BoxLayout(downrighttransparentpanel, BoxLayout.Y_AXIS));
	downrighttransparentpanel.setBorder(new EmptyBorder(60,20,50,50));
	downrighttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

//////////////////////////////////////// Upper label ///////////////////////////////////////////////////////////
	
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

//////////////////////////////////////// Seller sign up panel ///////////////////////////////////////////////////////////

	
	sellersignpanel = new JPanel();
	sellersignpanel.setLayout(null);
	sellersignpanel.setBackground(new Color(128,128,128));
	sellersignpanel.setLayout(new GridLayout(1,0,0,0));
	sellersignpanel.setBorder(new EmptyBorder(5,5,5,5));
	sellersignpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	sellersignpanel.setMinimumSize(new Dimension(350,500));
	sellersignpanel.setPreferredSize(new Dimension(350,500));
	sellersignpanel.setMaximumSize(new Dimension(400,600));
	
	ImageIcon panimage1 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png");  //1920*1280
	leftpanelbackground = new JLabel("",panimage1,JLabel.CENTER);
	leftpanelbackground.setLayout(new BoxLayout(leftpanelbackground, BoxLayout.Y_AXIS));
	leftpanelbackground.setBorder(new EmptyBorder(0,0,0,0));
	leftpanelbackground.setOpaque(true);
	
    leftttransparentpanel = new JPanel();
    leftttransparentpanel.setBackground(new Color(0,0,0,150));
    leftttransparentpanel.setLayout(new BoxLayout(leftttransparentpanel, BoxLayout.Y_AXIS));
    leftttransparentpanel.setBorder(new EmptyBorder(30,30,30,30));
	leftttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
/////////////////////////////////////// Buyer sign up panel ///////////////////////////////////////////////////////////



	buyersignpanel = new JPanel();
	buyersignpanel.setLayout(null);
	buyersignpanel.setBackground(new Color(128,128,128));
	buyersignpanel.setLayout(new GridLayout(1,0,0,0));
	buyersignpanel.setBorder(new EmptyBorder(5,5,5,5));
	buyersignpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignpanel.setMinimumSize(new Dimension(350,500));
	buyersignpanel.setPreferredSize(new Dimension(350,500));
	buyersignpanel.setMaximumSize(new Dimension(400,600));
	
	ImageIcon panimage2 = new ImageIcon("Resources/Images/Mainmenu/mainmenu_panels_background_picture.png");  //1920*1280
	rightpanelbackground = new JLabel("",panimage2,JLabel.CENTER);
	rightpanelbackground.setLayout(new BoxLayout(rightpanelbackground, BoxLayout.Y_AXIS));
	rightpanelbackground.setBorder(new EmptyBorder(0,0,0,0));
	rightpanelbackground.setOpaque(true);
	
    righttransparentpanel = new JPanel();
    righttransparentpanel.setBackground(new Color(0,0,0,150));
    righttransparentpanel.setLayout(new BoxLayout(righttransparentpanel, BoxLayout.Y_AXIS));
    righttransparentpanel.setBorder(new EmptyBorder(30,30,30,30));
	righttransparentpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
////////////////////////////////////// Seller Button ///////////////////////////////////////////////////////////

    ImageIcon imgsseller = new ImageIcon("Resources/Gifs/Signup_Menu/seller_signup.gif");
	buttonsign1 = new HoverButton("",imgsseller);
	buttonsign1.setBackground(Color.decode("#008B8B"));
	buttonsign1.setBorder(BorderFactory.createEtchedBorder(0));
	buttonsign1.setOpaque(false);
    buttonsign1.setContentAreaFilled(false);
    buttonsign1.setBorderPainted(false);
	buttonsign1.setCursor(handcursor);
	buttonsign1.setBorder(new EmptyBorder(20,0,0,0));
	buttonsign1.setMinimumSize(new java.awt.Dimension(220, 200));
	buttonsign1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonsign1.setFocusable(false);

	buttonsign1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 sellersignpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF")));
			sellersignpanel.repaint();
			
				
					MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
		
			
		
		
		}		
		
	});	
    buttonsign1.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       sellersignpanel.setBorder(new EmptyBorder(5,5,5,5));
			sellersignpanel.repaint();
		
		
		}		
		
	});	
	
	buttonsign1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 sellersignup bs = new sellersignup(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.getContentPane().add(bs.sellersignpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	

	
	buttonsign2 = new HoverButton("Seller Sign up");
	buttonsign2.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttonsign2.setBackground(Color.decode("#010b13"));
	buttonsign2.setForeground(Color.decode("#007FFF"));
	buttonsign2.setBorder(BorderFactory.createEtchedBorder(0));
	buttonsign2.setOpaque(false);
    buttonsign2.setContentAreaFilled(false);
    buttonsign2.setBorderPainted(false);
	buttonsign2.setCursor(handcursor);
	buttonsign2.setBorder(new EmptyBorder(20,0,0,0));
	buttonsign2.setMinimumSize(new java.awt.Dimension(220, 200));
	buttonsign2.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonsign2.setFocusable(false);

	buttonsign2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		 sellersignpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF")));
			sellersignpanel.repaint();
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
		
		
		}		
		
	});	
    buttonsign2.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       sellersignpanel.setBorder(new EmptyBorder(5,5,5,5));
			sellersignpanel.repaint();
		
		
		}		
		
	});	
	
	buttonsign2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			sellersignup ss1 = new sellersignup(mainframe);
			
			mainframe.getContentPane().add(ss1.sellersignpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	

////////////////////////////////////// Seller Label ///////////////////////////////////////////////////////////

	labels3 = new JLabel("Stay tuned with the RAW community...");
	labels3.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels3.setForeground(Color.decode("#ff6700"));	
	labels3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels3.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels3.setCursor(textcursor);

	labels4 = new JLabel("** Work Your Way **");
	labels4.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels4.setForeground(Color.decode("#ff6700"));	
	labels4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels4.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels4.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels4.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels4.setCursor(textcursor);
	
	labels5 = new JLabel("** Only skill is the best way to make money!!! **");
	labels5.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels5.setForeground(Color.decode("#ff6700"));	
	labels5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels5.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels5.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels5.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels5.setCursor(textcursor);

////////////////////////////////////// Buyer Button ///////////////////////////////////////////////////////////	
	
    ImageIcon imgsbuyer = new ImageIcon("Resources/Gifs/Signup_Menu/buyer_signup.gif");
	buttonsign3 = new HoverButton("",imgsbuyer);
	buttonsign3.setBackground(Color.decode("#008B8B"));
	buttonsign3.setBorder(BorderFactory.createEtchedBorder(0));
	buttonsign3.setOpaque(false);
    buttonsign3.setContentAreaFilled(false);
    buttonsign3.setBorderPainted(false);
	buttonsign3.setCursor(handcursor);
	buttonsign3.setBorder(new EmptyBorder(20,0,0,0));
	buttonsign3.setMinimumSize(new java.awt.Dimension(220, 200));
	buttonsign3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonsign3.setFocusable(false);
	buttonsign3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		buyersignpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF")));
		buyersignpanel.repaint();
			
			
        MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		
		}		
		
	});	
	
	buttonsign3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 buyersignup bs = new buyersignup(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.getContentPane().add(bs.buyersignpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
    buttonsign3.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       buyersignpanel.setBorder(new EmptyBorder(5,5,5,5));
			buyersignpanel.repaint();
		
		
		}		
		
	});		
	
	buttonsign4 = new HoverButton("Buyer Sign up");
	buttonsign4.setFont(new Font("Footlight MT Light",Font.BOLD,33));
	buttonsign4.setBackground(Color.decode("#010b13"));
	buttonsign4.setForeground(Color.decode("#007FFF"));
	buttonsign4.setBorder(BorderFactory.createEtchedBorder(0));
	buttonsign4.setOpaque(false);
    buttonsign4.setContentAreaFilled(false);
    buttonsign4.setBorderPainted(false);
	buttonsign4.setCursor(handcursor);
	buttonsign4.setBorder(new EmptyBorder(20,0,0,0));
	buttonsign4.setMinimumSize(new java.awt.Dimension(220, 200));
	buttonsign4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonsign4.setFocusable(false);
	
	buttonsign4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		
		buyersignpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF"), Color.decode("#007FFF")));
		buyersignpanel.repaint();
			
			
	    MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);
			
		
		
		}		
		
	});	
	buttonsign4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			 buyersignup bs = new buyersignup(mainframe);
			
			//mainframe.setJMenuBar(sm.signupmenubar(mainframe));
			//mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.getContentPane().add(bs.buyersignpage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
    buttonsign4.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
	       buyersignpanel.setBorder(new EmptyBorder(5,5,5,5));
			buyersignpanel.repaint();
		
		
		}		
		
	});	
////////////////////////////////////// Buyer Label ///////////////////////////////////////////////////////////	

	labels6 = new JLabel("Stay tuned with the RAW community...");
	labels6.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels6.setForeground(Color.decode("#89cff0"));	
	labels6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels6.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels6.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels6.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels6.setCursor(textcursor);
	
	labels7 = new JLabel("** Hire a skilled person for your project **");
	labels7.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels7.setForeground(Color.decode("#89cff0"));	
	labels7.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels7.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels7.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels7.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels7.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels7.setCursor(textcursor);
	
	labels8 = new JLabel("** Make the proper usage of your money **");
	labels8.setFont(new Font("Times New Roman",Font.PLAIN,18));
	labels8.setForeground(Color.decode("#89cff0"));	
	labels8.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labels8.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	labels8.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	labels8.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labels8.setAlignmentX(Component.CENTER_ALIGNMENT);
	labels8.setCursor(textcursor);
	
//////////////////////////////////////// adding all panel ////////////////////////////////////

	leftpanelbackground.add(buttonsign1);
	leftpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	leftpanelbackground.add(buttonsign2);
	leftpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	leftpanelbackground.add(labels3);
	leftpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	leftpanelbackground.add(labels4);
	leftpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	leftpanelbackground.add(labels5);
	sellersignpanel.add(leftpanelbackground);
	leftttransparentpanel.add(sellersignpanel);
	
	rightpanelbackground.add(buttonsign3);
	rightpanelbackground.add(Box.createRigidArea(new Dimension(0, 20)));
	rightpanelbackground.add(buttonsign4);
	rightpanelbackground.add(Box.createRigidArea(new Dimension(0, 25)));
	rightpanelbackground.add(labels6);
	rightpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	rightpanelbackground.add(labels7);
	rightpanelbackground.add(Box.createRigidArea(new Dimension(0, 7)));
	rightpanelbackground.add(labels8);
	buyersignpanel.add(rightpanelbackground);
	righttransparentpanel.add(buyersignpanel);
	
	downlefttransparentpanel.add(leftttransparentpanel);
	downrighttransparentpanel.add(righttransparentpanel);
	
	downtransparentpanel.add(downlefttransparentpanel);
	downtransparentpanel.add(downrighttransparentpanel);
	
	uptransparentpanel.add(labelx0);
	uptransparentpanel.add(Box.createRigidArea(new Dimension(0, 5)));
	uptransparentpanel.add(labelxs0);
	
	labels2.add(uptransparentpanel);
	labels2.add(downtransparentpanel);
	
	labels1.add(labels2);
	signuppanel.add(labels1);
	
	
	return signuppanel;
	
}

	
}