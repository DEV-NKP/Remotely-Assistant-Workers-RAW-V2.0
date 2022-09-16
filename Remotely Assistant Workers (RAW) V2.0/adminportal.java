import raw.label.*;
import raw.combobox.*;
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
public class adminportal 
{
	JFrame mainframe;
	JLabel label1, label2;
	JButton mbutton1, mbutton2, mbutton3,  mbutton4, mbutton5, mbutton6, mbutton7, cbutton1;
	JPanel contentpan, buttonpan, roundpanel1, roundpanel2;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
	int x,y;
	Dimension screensize;
	String USER_EMAIL="";
	String USER_PASSWORD="";
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

	public adminportal()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	}
	
	public adminportal(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;		
	}
		public adminportal( String email, String pass)
	{
		this.USER_EMAIL=email;
		this.USER_PASSWORD=pass;
	    mainframe = new JFrame("RAW");

    Image icon = Toolkit.getDefaultToolkit().getImage("Resources/Images/Common/frame_icon_picture.png");  //256*256
    mainframe.setIconImage(icon);
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
    mainframe.setSize(((screensize.width/2)+320)+250, ((screensize.height/2)+220)+100);
    x = (int) ((screensize.getWidth() - mainframe.getWidth()) / 2);
    y = (int) ((screensize.getHeight() - mainframe.getHeight()) / 2);
    mainframe.setLocation(x, y);
	
	mainframe.setDefaultCloseOperation(mainframe.EXIT_ON_CLOSE);
    
      
mainframe.setLayout(new BorderLayout());

mainframe.getContentPane().add(adminportalpage(mainframe), BorderLayout.CENTER);
	// mainframe.getContentPane().add(buyerportaltranspage(mainframe), BorderLayout.CENTER);
 mainframe.setVisible(true);
	//mainframe.setMinimumSize(new Dimension(((screensize.width/2)+320)+230, ((screensize.height/2)+220)+90));  //never ever try to delete this
	mainframe.setMinimumSize(new Dimension(1340,760));
	}
	
	
	
	
	private static Color awtColor(javafx.scene.paint.Color fxColor) {
    return new Color(
        (float) fxColor.getRed(),
        (float) fxColor.getGreen(),
        (float) fxColor.getBlue(),
        (float) fxColor.getOpacity());
}


public JLayeredPane adminportalpage(JFrame frame)
{

	screensize = Toolkit.getDefaultToolkit().getScreenSize();




    JLayeredPane layeredpan = new JLayeredPane();
    layeredpan.setSize((frame.getWidth()), (frame.getHeight()));
	layeredpan.setBackground(Color.decode("#000000"));
   layeredpan.setLayout(new OverlayLayout(layeredpan));////////////////row<COL<X GAP<Y GAP
	layeredpan.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	layeredpan.setOpaque(false);
	 
////////////////////////////////////////   TRANSPARENT MAIN PANEL   /////////////////////////////////

    JPanel mainpanel1 = new JPanel();
  mainpanel1.setMinimumSize(new Dimension(500, 400));
  mainpanel1.setMaximumSize(new Dimension(1400, 800));
	mainpanel1.setBackground(new Color(245,245,245,150));
    mainpanel1.setLayout(new BoxLayout(mainpanel1, BoxLayout.Y_AXIS));////////////////row<COL<X GAP<Y GAP
	//mainpanel1.setLayout(new OverlayLayout(mainpanel1));////////////////row<COL<X GAP<Y GAP
	//mainpanel1.setBorder(new EmptyBorder(50,100,50,100));////////////////top<Left<bottom<right
	mainpanel1.setAlignmentY(Component.CENTER_ALIGNMENT);

	 JLabel messagelabel2 = new JLabel("CONSTRUCTION AREA !!");
	messagelabel2.setFont(new Font("Arial",Font.BOLD,40));
	messagelabel2.setForeground(Color.decode("000000"));
	messagelabel2.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	messagelabel2.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	messagelabel2.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	messagelabel2.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	messagelabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	messagelabel2.setAlignmentY(Component.CENTER_ALIGNMENT);

    JLabel messagelabel = new JLabel("Thanks for staying with us. Hope you enjoyed.");
	messagelabel.setFont(new Font("Arial",Font.BOLD,22));
	messagelabel.setForeground(Color.decode("000000"));
	messagelabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	messagelabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	messagelabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	messagelabel.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	messagelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	messagelabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	 JLabel messagelabel3 = new JLabel("For some unavoidable circumstances this section is under construction. We will get back soon!");
	messagelabel3.setFont(new Font("Arial",Font.BOLD,22));
	messagelabel3.setForeground(Color.decode("000000"));
	messagelabel3.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	messagelabel3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	messagelabel3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	messagelabel3.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	messagelabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	messagelabel3.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	
	JPanel logoutpan1 = new JPanel();
	logoutpan1.setBackground(new Color(128,128,128));//new Color(75, 162, 233)
	logoutpan1.setLayout(new BoxLayout(logoutpan1, BoxLayout.X_AXIS));
	logoutpan1.setBorder(new EmptyBorder(1,1,1,1));
	/*logoutpan.setMinimumSize(new Dimension(150,30));
	logoutpan.setPreferredSize(new Dimension(150,30));
	logoutpan.setMaximumSize(new Dimension(200,40));*/
	logoutpan1.setAlignmentX(Component.CENTER_ALIGNMENT);

	Border logoutbttnborder = new LineBorder(Color.RED, 1);
	RoundedCornerButton logoutbutton1 = new RoundedCornerButton("     Log Out     ");
	logoutbutton1.setFont(new Font("Comic Sans",Font.PLAIN,20));
	//next1.setBackground(new Color(125,125,125));
	logoutbutton1.setBackground(Color.decode("#000000"));
	
	logoutbutton1.setForeground(Color.WHITE);
	logoutbutton1.setCursor(handcursor);
	logoutbutton1.setBorder(logoutbttnborder);
	logoutbutton1.setOpaque(false);
	logoutbutton1.setEnabled(true);
    logoutbutton1.setContentAreaFilled(false);
    logoutbutton1.setBorderPainted(true);
	logoutbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	logoutbutton1.setFocusable(false);
	
	
	logoutbutton1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});
	
	
	logoutbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
	File f= new File("Resources/Login_Info");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();			

try
{
FileWriter fw= new FileWriter(p+"/login.rw", false);
Formatter fd= new Formatter(fw);
fd.flush();
        fd.close();
        fw.close();
}
catch(Exception e1)
{
	System.out.println(e1);
}
			
			
			mainmenu lm12 = new mainmenu(mainframe);
			mainframe.setJMenuBar(lm12.menubar(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(lm12.menu(mainframe));
			mainframe.setVisible(true);
		}		
		
	});
	
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	
	
	JPanel mainpanel = new JPanel();
    mainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	mainpanel.setBackground(Color.decode("#000000"));
    mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	mainpanel.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	mainpanel.setOpaque(false);	
	
	/////////////////////////////////////////////RIGHT SIDE////////////////////////////////////////////////
	Rectangle r = frame.getBounds();
	int h = r.height;
	int w = r.width;
	
	
	contentpan = new JPanel();
	contentpan.setBackground(new Color(0, 0, 0));//new Color(240, 240, 240)
	contentpan.setLayout(new BoxLayout(contentpan, BoxLayout.Y_AXIS));
	contentpan.setBorder(new EmptyBorder(0,0,0,0));
	contentpan.setAlignmentX(Component.RIGHT_ALIGNMENT);
	contentpan.setMinimumSize(new Dimension(mainpanel.getWidth(),mainpanel.getHeight()));
	contentpan.setPreferredSize(new Dimension(mainpanel.getWidth(),mainpanel.getHeight()));
	contentpan.setMaximumSize(new Dimension(mainpanel.getWidth(),screensize.height));
	
	
	JPanel headingpan = new JPanel();
	headingpan.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	headingpan.setLayout(new BoxLayout(headingpan, BoxLayout.X_AXIS));
	headingpan.setBorder(new EmptyBorder(10,10,10,10));
	/*headingpan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	headingpan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	headingpan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	//headingpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	headingpan.setAlignmentY(Component.TOP_ALIGNMENT);
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	ImageIcon imgx = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif"); //65*65
	JLabel labelmbx = new JLabel("",imgx,JLabel.CENTER);
	labelmbx.setAlignmentX(Component.LEFT_ALIGNMENT);

	JPanel titlelinepan = new JPanel();
	titlelinepan.setBackground(new Color(255,215,0));//new Color(75, 162, 233)
	titlelinepan.setLayout(new BoxLayout(titlelinepan, BoxLayout.Y_AXIS));
	titlelinepan.setBorder(new EmptyBorder(1,1,1,1));
	titlelinepan.setMinimumSize(new Dimension(2,60));
	titlelinepan.setPreferredSize(new Dimension(2,60));
	titlelinepan.setMaximumSize(new Dimension(2,70));
	titlelinepan.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel labelmb = new JLabel("<html><font color=#008B8B>Admin <br> PORTAL</font></html>");
	CustomFont cf=new CustomFont();
	labelmb.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,20.0f));
	labelmb.setForeground(Color.decode("#00FFFF"));
	labelmb.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmb.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmb.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmb.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmb.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel labelmb1 = new JLabel("<html><font color=#008B8B>Welcome Admin</font></html>");
	labelmb1.setFont(new Font("Comic Sans",Font.BOLD,25));
	labelmb1.setForeground(Color.decode("#00FFFF"));
	labelmb1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmb1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmb1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmb1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmb1.setAlignmentX(Component.CENTER_ALIGNMENT);

	ImageIcon noti = new ImageIcon("Resources/Images/Portal/notification.png");  
	JButton notificationbut = new JButton("",noti);
	notificationbut.setBackground(new Color(0,0,0,0));
	notificationbut.setBorder(null);
	notificationbut.setSize(noti.getIconWidth(),noti.getIconHeight());
	notificationbut.setOpaque(false);
    notificationbut.setContentAreaFilled(false);
    notificationbut.setBorderPainted(false);
	notificationbut.setMinimumSize(new java.awt.Dimension(30,30));
	notificationbut.setAlignmentX(Component.RIGHT_ALIGNMENT);
	notificationbut.setCursor(handcursor);
	notificationbut.setFocusable(false);	
	notificationbut.setEnabled(false);	
	notificationbut.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
	 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",barvolume);
			
			
		
		}		
		
	});	
	notificationbut.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});



	ImageIcon sett = new ImageIcon("Resources/Images/Portal/settings.png"); 
	JButton settingsbut = new JButton("",sett);
	settingsbut.setBackground(new Color(0,0,0,0));
	settingsbut.setBorder(null);
	settingsbut.setSize(noti.getIconWidth(),noti.getIconHeight());
	settingsbut.setOpaque(false);
    settingsbut.setContentAreaFilled(false);
    settingsbut.setBorderPainted(false);
	settingsbut.setMinimumSize(new java.awt.Dimension(30,30));
	settingsbut.setAlignmentX(Component.RIGHT_ALIGNMENT);
	settingsbut.setCursor(handcursor);
	settingsbut.setFocusable(false);	
	settingsbut.setEnabled(false);	
	settingsbut.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
	 MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Mainmenu/mainmenu_available_mouse_enter.wav",barvolume);
			
			
		
		}		
		
	});	
	settingsbut.addActionListener(new ActionListener()
	{
	    @Override
	    public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});





	JPanel bodypan = new JPanel();
	bodypan.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	bodypan.setLayout(new BoxLayout(bodypan, BoxLayout.Y_AXIS));
	bodypan.setBorder(new EmptyBorder(10,10,10,10));
	/*bodypan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	//bodypan.setAlignmentX(Component.CENTER_ALIGNMENT);
	bodypan.setAlignmentY(Component.BOTTOM_ALIGNMENT);

	JPanel bodypan1 = new JPanel();
	bodypan1.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	bodypan1.setLayout(new BoxLayout(bodypan1, BoxLayout.X_AXIS));
	bodypan1.setBorder(new EmptyBorder(10,10,10,10));
	/*bodypan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	bodypan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	bodypan1.setAlignmentY(Component.TOP_ALIGNMENT);


	JPanel bodypan2 = new JPanel();
	bodypan2.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	bodypan2.setLayout(new BoxLayout(bodypan2, BoxLayout.X_AXIS));
	bodypan2.setBorder(new EmptyBorder(10,10,10,10));
	/*bodypan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	//bodypan.setAlignmentX(Component.CENTER_ALIGNMENT);
	bodypan2.setAlignmentY(Component.CENTER_ALIGNMENT);


	JPanel bodypan3 = new JPanel();
	bodypan3.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	bodypan3.setLayout(new BoxLayout(bodypan3, BoxLayout.X_AXIS));
	bodypan3.setBorder(new EmptyBorder(10,10,10,10));
	/*bodypan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	//bodypan.setAlignmentX(Component.CENTER_ALIGNMENT);
	bodypan3.setAlignmentY(Component.BOTTOM_ALIGNMENT);

	JPanel endpan = new JPanel();
	endpan.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	endpan.setLayout(new BoxLayout(endpan, BoxLayout.X_AXIS));
	endpan.setBorder(new EmptyBorder(10,10,10,10));
	/*bodypan.setMinimumSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setPreferredSize(new Dimension((frame.getWidth()-menupanel.getWidth()),70));
	bodypan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),80));*/
	//bodypan.setAlignmentX(Component.CENTER_ALIGNMENT);
	endpan.setAlignmentY(Component.BOTTOM_ALIGNMENT);


	Border submitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerButton logoutbutton = new RoundedCornerButton("     Log Out     ");
	logoutbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//next1.setBackground(new Color(125,125,125));
	logoutbutton.setBackground(Color.decode("#dcdcdc"));
	logoutbutton.setForeground(new Color(125,125,125));
	logoutbutton.setForeground(Color.WHITE);
	logoutbutton.setCursor(handcursor);
	logoutbutton.setBorder(submitbttnborder);
	logoutbutton.setOpaque(false);
	logoutbutton.setEnabled(false);
    logoutbutton.setContentAreaFilled(false);
    logoutbutton.setBorderPainted(true);
	logoutbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
	logoutbutton.setFocusable(false);
	
	logoutbutton.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});
	
	
	logoutbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
				File f= new File("Resources/Login_Info");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();			

try
{
FileWriter fw= new FileWriter(p+"/login.rw", false);
Formatter fd= new Formatter(fw);
fd.flush();
        fd.close();
        fw.close();
}
catch(Exception e1)
{
	System.out.println(e1);
}

frame.getContentPane().removeAll();
			 mainmenu mm = new mainmenu(frame);
			
			
			frame.setJMenuBar(mm.menubar(frame));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			frame.setContentPane(mm.menu(frame));
			frame.setVisible(true);

}		
	






	
	});
	
	RoundedCornerButton exitbutton = new RoundedCornerButton("     Exit     ");
	exitbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//next1.setBackground(new Color(125,125,125));
	exitbutton.setBackground(Color.decode("#dcdcdc"));
	exitbutton.setForeground(new Color(125,125,125));
	exitbutton.setForeground(Color.WHITE);
	exitbutton.setCursor(handcursor);
	exitbutton.setBorder(submitbttnborder);
	exitbutton.setOpaque(false);
	exitbutton.setEnabled(false);
    exitbutton.setContentAreaFilled(false);
    exitbutton.setBorderPainted(true);
	exitbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
	exitbutton.setFocusable(false);
	
	exitbutton.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});
	
	
	exitbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		}		
		
	});










///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	JPanel jobdetailspan = new JPanel();
	jobdetailspan.setLayout(null);
	jobdetailspan.setBackground(new Color(0,0,0));
	jobdetailspan.setLayout(new BoxLayout(jobdetailspan, BoxLayout.Y_AXIS));
	jobdetailspan.setBorder(new EmptyBorder(0,0,0,0));
	jobdetailspan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel userdetailspan = new JPanel();
	userdetailspan.setLayout(null);
	userdetailspan.setBackground(new Color(0,0,0));
	userdetailspan.setLayout(new BoxLayout(userdetailspan, BoxLayout.Y_AXIS));
	userdetailspan.setBorder(new EmptyBorder(0,0,0,0));
	userdetailspan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel banuserpan = new JPanel();
	banuserpan.setLayout(null);
	banuserpan.setBackground(new Color(0,0,0));
	banuserpan.setLayout(new BoxLayout(banuserpan, BoxLayout.Y_AXIS));
	banuserpan.setBorder(new EmptyBorder(0,0,0,0));
	banuserpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel userreportpan = new JPanel();
	userreportpan.setLayout(null);
	userreportpan.setBackground(new Color(0,0,0));
	userreportpan.setLayout(new BoxLayout(userreportpan, BoxLayout.Y_AXIS));
	userreportpan.setBorder(new EmptyBorder(0,0,0,0));
	userreportpan.setAlignmentX(Component.CENTER_ALIGNMENT);	
    
	JPanel contactrequestpan = new JPanel();
	contactrequestpan.setLayout(null);
	contactrequestpan.setBackground(new Color(0,0,0));
	contactrequestpan.setLayout(new BoxLayout(contactrequestpan, BoxLayout.Y_AXIS));
	contactrequestpan.setBorder(new EmptyBorder(0,0,0,0));
	contactrequestpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JPanel rawfeedbackpan = new JPanel();
	rawfeedbackpan.setLayout(null);
	rawfeedbackpan.setBackground(new Color(0,0,0));
	rawfeedbackpan.setLayout(new BoxLayout(rawfeedbackpan, BoxLayout.Y_AXIS));
	rawfeedbackpan.setBorder(new EmptyBorder(0,0,0,0));
	rawfeedbackpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel useraccountdetailspan = new JPanel();
	useraccountdetailspan.setLayout(null);
	useraccountdetailspan.setBackground(new Color(0,0,0));
	useraccountdetailspan.setLayout(new BoxLayout(useraccountdetailspan, BoxLayout.Y_AXIS));
	useraccountdetailspan.setBorder(new EmptyBorder(0,0,0,0));
	useraccountdetailspan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel messagepan = new JPanel();
	messagepan.setLayout(null);
	messagepan.setBackground(new Color(0,0,0));
	messagepan.setLayout(new BoxLayout(messagepan, BoxLayout.Y_AXIS));
	messagepan.setBorder(new EmptyBorder(0,0,0,0));
	messagepan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mailboxpan = new JPanel();
	mailboxpan.setLayout(null);
	mailboxpan.setBackground(new Color(0,0,0));
	mailboxpan.setLayout(new BoxLayout(mailboxpan, BoxLayout.Y_AXIS));
	mailboxpan.setBorder(new EmptyBorder(0,0,0,0));
	mailboxpan.setAlignmentX(Component.CENTER_ALIGNMENT);
    
	JPanel otherspan = new JPanel();
	otherspan.setLayout(null);
	otherspan.setBackground(new Color(0,0,0));
	otherspan.setLayout(new BoxLayout(otherspan, BoxLayout.Y_AXIS));
	otherspan.setBorder(new EmptyBorder(0,0,0,0));
	otherspan.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	JLabel jobdetailslabel1 = new JLabel("Job Details");
	jobdetailslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	jobdetailslabel1.setForeground(Color.decode("#00FFFF"));
	jobdetailslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	jobdetailslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	jobdetailslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	jobdetailslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	jobdetailslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel userdetailslabel1 = new JLabel("User Details");
	userdetailslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	userdetailslabel1.setForeground(Color.decode("#00FFFF"));
	userdetailslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userdetailslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userdetailslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userdetailslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userdetailslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);	
	
	JLabel banuserlabel1 = new JLabel("Ban User");
	banuserlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	banuserlabel1.setForeground(Color.decode("#00FFFF"));
	banuserlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	banuserlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	banuserlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	banuserlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	banuserlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel userreportlabel1 = new JLabel("User Reports");
	userreportlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	userreportlabel1.setForeground(Color.decode("#00FFFF"));
	userreportlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userreportlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userreportlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userreportlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userreportlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel contactrequestlabel1 = new JLabel("Contact Requests");
	contactrequestlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	contactrequestlabel1.setForeground(Color.decode("#00FFFF"));
	contactrequestlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	contactrequestlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	contactrequestlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	contactrequestlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	contactrequestlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel rawfeedbacklabel1 = new JLabel("Raw Feedbacks");
	rawfeedbacklabel1.setFont(new Font("Calibri",Font.BOLD,16));
	rawfeedbacklabel1.setForeground(Color.decode("#00FFFF"));
	rawfeedbacklabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	rawfeedbacklabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	rawfeedbacklabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	rawfeedbacklabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	rawfeedbacklabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel useraccountdetailslabel1 = new JLabel("User Account Details");
	useraccountdetailslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	useraccountdetailslabel1.setForeground(Color.decode("#00FFFF"));
	useraccountdetailslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	useraccountdetailslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	useraccountdetailslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	useraccountdetailslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	useraccountdetailslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);	
	
	JLabel messagelabel1 = new JLabel("Messages");
	messagelabel1.setFont(new Font("Calibri",Font.BOLD,16));
	messagelabel1.setForeground(Color.decode("#00FFFF"));
	messagelabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	messagelabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	messagelabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	messagelabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	messagelabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel mailboxlabel1 = new JLabel("Mailbox");
	mailboxlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	mailboxlabel1.setForeground(Color.decode("#00FFFF"));
	mailboxlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	mailboxlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	mailboxlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	mailboxlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	mailboxlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel otherslabel1 = new JLabel("Others");
	otherslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	otherslabel1.setForeground(Color.decode("#00FFFF"));
	otherslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	otherslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	otherslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	otherslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	otherslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	ImageIcon imgmlogin1 = new ImageIcon("Resources/Images/Portal/a1.png"); //220*200
	JButton buttons1 = new JButton("",imgmlogin1);
	buttons1.setBackground(Color.decode("#008B8B"));
	buttons1.setBorder(BorderFactory.createEtchedBorder(0));
	buttons1.setOpaque(false);
    buttons1.setContentAreaFilled(false);
    buttons1.setBorderPainted(false);
	buttons1.setCursor(handcursor);
	//buttons1.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons1.setEnabled(false);
	buttons1.setFocusable(false);
	buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			jobdetailspan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			jobdetailspan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			jobdetailspan.setBorder(new EmptyBorder(5,5,5,5));
			jobdetailspan.repaint();
		
		
		}		
		
	});	

	buttons1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});


	ImageIcon imgmlogin2 = new ImageIcon("Resources/Images/Portal/a2.png"); //220*200
JButton buttons2 = new JButton("",imgmlogin2);
	buttons2.setBackground(Color.decode("#008B8B"));
	buttons2.setBorder(BorderFactory.createEtchedBorder(0));
	buttons2.setOpaque(false);
    buttons2.setContentAreaFilled(false);
    buttons2.setBorderPainted(false);
	buttons2.setCursor(handcursor);
	//buttons2.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons2.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons2.setEnabled(false);
	buttons2.setFocusable(false);
	buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			userdetailspan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			userdetailspan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			userdetailspan.setBorder(new EmptyBorder(5,5,5,5));
			userdetailspan.repaint();
		
		
		}		
		
	});	

	buttons2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});



	ImageIcon imgmlogin3 = new ImageIcon("Resources/Images/Portal/a3.png"); //220*200
	JButton buttons3 = new JButton("",imgmlogin3);
	buttons3.setBackground(Color.decode("#008B8B"));
	buttons3.setBorder(BorderFactory.createEtchedBorder(0));
	buttons3.setOpaque(false);
    buttons3.setContentAreaFilled(false);
    buttons3.setBorderPainted(false);
	buttons3.setCursor(handcursor);
	//buttons3.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons3.setEnabled(false);
	buttons3.setFocusable(false);
	buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			banuserpan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			banuserpan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			banuserpan.setBorder(new EmptyBorder(5,5,5,5));
			banuserpan.repaint();
		
		
		}		
		
	});	

	buttons3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});

	ImageIcon imgmlogin4 = new ImageIcon("Resources/Images/Portal/a4.png"); //220*200
	JButton buttons4 = new JButton("",imgmlogin4);
	buttons4.setBackground(Color.decode("#008B8B"));
	buttons4.setBorder(BorderFactory.createEtchedBorder(0));
	buttons4.setOpaque(false);
    buttons4.setContentAreaFilled(false);
    buttons4.setBorderPainted(false);
	buttons4.setCursor(handcursor);
	//buttons4.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons4.setEnabled(false);
	buttons4.setFocusable(false);
	buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			userreportpan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			userreportpan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			userreportpan.setBorder(new EmptyBorder(5,5,5,5));
			userreportpan.repaint();
		
		
		}		
		
	});	

	buttons4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});


	ImageIcon imgmlogin5 = new ImageIcon("Resources/Images/Portal/a5.png"); //220*200
	JButton buttons5 = new JButton("",imgmlogin5);
	buttons5.setBackground(Color.decode("#008B8B"));
	buttons5.setBorder(BorderFactory.createEtchedBorder(0));
	buttons5.setOpaque(false);
    buttons5.setContentAreaFilled(false);
    buttons5.setBorderPainted(false);
	buttons5.setCursor(handcursor);
	//buttons5.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons5.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons5.setEnabled(false);
	buttons5.setFocusable(false);
	buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			contactrequestpan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			contactrequestpan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			contactrequestpan.setBorder(new EmptyBorder(5,5,5,5));
			contactrequestpan.repaint();
		
		
		}		
		
	});	

	buttons5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});

	ImageIcon imgmlogin6 = new ImageIcon("Resources/Images/Portal/a6.png"); //220*200
	JButton buttons6 = new JButton("",imgmlogin6);
	buttons6.setBackground(Color.decode("#008B8B"));
	buttons6.setBorder(BorderFactory.createEtchedBorder(0));
	buttons6.setOpaque(false);
    buttons6.setContentAreaFilled(false);
    buttons6.setBorderPainted(false);
	buttons6.setCursor(handcursor);
	buttons6.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons6.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons6.setEnabled(false);
	buttons6.setFocusable(false);
	buttons6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			rawfeedbackpan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			rawfeedbackpan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons6.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			rawfeedbackpan.setBorder(new EmptyBorder(5,5,5,5));
			rawfeedbackpan.repaint();
		
		
		}		
		
	});	

	buttons6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		}		
		
	});



	ImageIcon imgmlogin7 = new ImageIcon("Resources/Images/Portal/a7.png"); //220*200
	JButton buttons7 = new JButton("",imgmlogin7);
	buttons7.setBackground(Color.decode("#008B8B"));
	buttons7.setBorder(BorderFactory.createEtchedBorder(0));
	buttons7.setOpaque(false);
    buttons7.setContentAreaFilled(false);
    buttons7.setBorderPainted(false);
	buttons7.setCursor(handcursor);
	buttons7.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons7.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons7.setEnabled(false);
	buttons7.setFocusable(false);
	buttons7.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			useraccountdetailspan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			useraccountdetailspan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons7.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			useraccountdetailspan.setBorder(new EmptyBorder(5,5,5,5));
			useraccountdetailspan.repaint();
		
		
		}		
		
	});	

	buttons7.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});



	ImageIcon imgmlogin8 = new ImageIcon("Resources/Images/Portal/a8.png"); //220*200
	JButton buttons8 = new JButton("",imgmlogin8);
	buttons8.setBackground(Color.decode("#008B8B"));
	buttons8.setBorder(BorderFactory.createEtchedBorder(0));
	buttons8.setOpaque(false);
    buttons8.setContentAreaFilled(false);
    buttons8.setBorderPainted(false);
	buttons8.setCursor(handcursor);
	buttons8.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons8.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons8.setEnabled(false);
	buttons8.setFocusable(false);
	buttons8.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			messagepan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			messagepan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons8.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			messagepan.setBorder(new EmptyBorder(5,5,5,5));
			messagepan.repaint();
		
		
		}		
		
	});	

	buttons8.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});

	ImageIcon imgmlogin9 = new ImageIcon("Resources/Images/Portal/a9.png"); //220*200
	JButton buttons9 = new JButton("",imgmlogin9);
	buttons9.setBackground(Color.decode("#008B8B"));
	buttons9.setBorder(BorderFactory.createEtchedBorder(0));
	buttons9.setOpaque(false);
    buttons9.setContentAreaFilled(false);
    buttons9.setBorderPainted(false);
	buttons9.setCursor(handcursor);
	buttons9.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons9.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons9.setEnabled(false);
	buttons9.setFocusable(false);
	buttons9.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			mailboxpan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			mailboxpan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons9.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			mailboxpan.setBorder(new EmptyBorder(5,5,5,5));
			mailboxpan.repaint();
		
		
		}		
		
	});	

	buttons9.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});

	ImageIcon imgmlogin10 = new ImageIcon("Resources/Images/Portal/a10.png"); //220*200
	JButton buttons10 = new JButton("",imgmlogin10);
	buttons10.setBackground(Color.decode("#008B8B"));
	buttons10.setBorder(BorderFactory.createEtchedBorder(0));
	buttons10.setOpaque(false);
    buttons10.setContentAreaFilled(false);
    buttons10.setBorderPainted(false);
	buttons10.setCursor(handcursor);
	buttons10.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons10.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons10.setEnabled(false);
	buttons10.setFocusable(false);
	buttons10.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			otherspan.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			otherspan.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons10.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			otherspan.setBorder(new EmptyBorder(5,5,5,5));
			otherspan.repaint();
		
		
		}		
		
	});	

	buttons10.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});
/////////////////////////////////////////////////////////////////////////////////////////////////////

headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(labelmbx);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(titlelinepan);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(labelmb);
headingpan.add(Box.createRigidArea(new Dimension(0, 0)));
headingpan.add(labelmb1);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(notificationbut);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(settingsbut);

//////////////////////////////////////////////////////////////////////////////////////////////////

jobdetailspan.add(buttons1);
jobdetailspan.add(Box.createRigidArea(new Dimension(0, 5)));
jobdetailspan.add(jobdetailslabel1);

userdetailspan.add(buttons2);
userdetailspan.add(Box.createRigidArea(new Dimension(0, 5)));
userdetailspan.add(userdetailslabel1);

banuserpan.add(buttons3);
banuserpan.add(Box.createRigidArea(new Dimension(0, 5)));
banuserpan.add(banuserlabel1);

userreportpan.add(buttons4);
userreportpan.add(Box.createRigidArea(new Dimension(0, 5)));
userreportpan.add(userreportlabel1);

contactrequestpan.add(buttons5);
contactrequestpan.add(Box.createRigidArea(new Dimension(0, 5)));
contactrequestpan.add(contactrequestlabel1);

rawfeedbackpan.add(buttons6);
rawfeedbackpan.add(Box.createRigidArea(new Dimension(0, 5)));
rawfeedbackpan.add(rawfeedbacklabel1);

useraccountdetailspan.add(buttons7);
useraccountdetailspan.add(Box.createRigidArea(new Dimension(0, 5)));
useraccountdetailspan.add(useraccountdetailslabel1);

messagepan.add(buttons8);
messagepan.add(Box.createRigidArea(new Dimension(0, 5)));
messagepan.add(messagelabel1);

mailboxpan.add(buttons9);
mailboxpan.add(Box.createRigidArea(new Dimension(0, 5)));
mailboxpan.add(mailboxlabel1);

otherspan.add(buttons10);
otherspan.add(Box.createRigidArea(new Dimension(0, 5)));
otherspan.add(otherslabel1);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan1.add(jobdetailspan);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(userdetailspan);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(banuserpan);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(userreportpan);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(contactrequestpan);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan2.add(rawfeedbackpan);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(useraccountdetailspan);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(messagepan);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(mailboxpan);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(otherspan);

//////////////////////////////////////////////////////////////////////////////////////////////////

endpan.add(logoutbutton);
endpan.add(Box.createRigidArea(new Dimension(600, 0)));
endpan.add(exitbutton);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan.add(Box.createRigidArea(new Dimension(0, 20)));
bodypan.add(bodypan1);
bodypan.add(Box.createRigidArea(new Dimension(0, 20)));
bodypan.add(bodypan2);
bodypan.add(Box.createRigidArea(new Dimension(0, 20)));
bodypan.add(endpan);
bodypan.add(Box.createRigidArea(new Dimension(0, 100)));

/////////////////////////////////////////////////////////////////////////////////////////////////

contentpan.add(headingpan);
contentpan.add(Box.createRigidArea(new Dimension(0, 50)));
contentpan.add(bodypan);

/////////////////////////////////////////////////////////////////////////////////////////////////

mainpanel.add(contentpan);



//////////////////////////////////////////////////////////////////////////////////////////////////
mainpanel1.add(Box.createRigidArea(new Dimension(50, 250)));
mainpanel1.add(messagelabel2);
mainpanel1.add(Box.createRigidArea(new Dimension(50, 100)));
mainpanel1.add(messagelabel);
mainpanel1.add(Box.createRigidArea(new Dimension(50, 15)));
mainpanel1.add(messagelabel3);
	
logoutpan1.add(logoutbutton1);

mainpanel1.add(Box.createRigidArea(new Dimension(50, 50)));
mainpanel1.add(logoutpan1);
mainpanel1.add(Box.createRigidArea(new Dimension(50, 100)));
////////////////////////////////////////////////////////////////////////////////////////
layeredpan.add(mainpanel1, new Integer(2));
layeredpan.add(mainpanel, new Integer(1));




	frame.addComponentListener(new ComponentAdapter() {
    public void componentResized(ComponentEvent componentEvent) {
		Rectangle r = frame.getBounds();
int h = r.height;
int w = r.width;

	
	
	/*
	headingpan.setMinimumSize(new Dimension(w,90));
	headingpan.setPreferredSize(new Dimension(w,90));
	headingpan.setMaximumSize(new Dimension(w,90));	
	
	bodypan.setMinimumSize(new Dimension(w,(h-90)));
	bodypan.setPreferredSize(new Dimension(w,(h-90)));
	bodypan.setMaximumSize(new Dimension(w,(h-90)));	
	
	bodypan1.setMinimumSize(new Dimension(w,((h/2)-150)));
	bodypan1.setPreferredSize(new Dimension(w,((h/2)-150)));
	bodypan1.setMaximumSize(new Dimension(w,((h/2)-150)));

	bodypan2.setMinimumSize(new Dimension(w,((h/2)-150)));
	bodypan2.setPreferredSize(new Dimension(w,((h/2)-150)));
	bodypan2.setMaximumSize(new Dimension(w,((h/2)-150)));
	
	jobdetailspan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	jobdetailspan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	jobdetailspan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	userdetailspan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	userdetailspan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	userdetailspan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));	
	
	banuserpan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	banuserpan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	banuserpan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	userreportpan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	userreportpan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	userreportpan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	contactrequestpan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	contactrequestpan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	contactrequestpan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	rawfeedbackpan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	rawfeedbackpan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	rawfeedbackpan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	useraccountdetailspan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	useraccountdetailspan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	useraccountdetailspan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	messagepan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	messagepan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	messagepan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	mailboxpan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	mailboxpan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	mailboxpan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	
	otherspan.setMinimumSize(new Dimension((int)(w/6.5),((h/2)-220)));
	otherspan.setPreferredSize(new Dimension((int)(w/6.5),((h/2)-220)));
	otherspan.setMaximumSize(new Dimension((int)(w/6.5),((h/2)-220)));*/
	
	
	
	contentpan.setMinimumSize(new Dimension(w,h));
	contentpan.setPreferredSize(new Dimension(w,h));
	contentpan.setMaximumSize(new Dimension(w,h));
	
	
	
/*bodypan1.revalidate();
bodypan2.revalidate();
bodypan.revalidate();

buttons1.setAlignmentY(Component.CENTER_ALIGNMENT);
buttons2.setAlignmentY(Component.CENTER_ALIGNMENT);
buttons3.setAlignmentY(Component.CENTER_ALIGNMENT);
buttons4.setAlignmentY(Component.CENTER_ALIGNMENT);
buttons5.setAlignmentY(Component.CENTER_ALIGNMENT);
buttons6.revalidate();
buttons7.revalidate();
buttons8.revalidate();
buttons9.revalidate();
buttons10.revalidate();

jobdetailspan.revalidate();
userdetailspan.revalidate();
banuserpan.revalidate();
userreportpan.revalidate();
contactrequestpan.revalidate();
rawfeedbackpan.revalidate();
useraccountdetailspan.revalidate();
messagepan.revalidate();
mailboxpan.revalidate();
otherspan.revalidate();
*/




contentpan.revalidate();
    }
});


return layeredpan;	
}
	
	
	
}
	