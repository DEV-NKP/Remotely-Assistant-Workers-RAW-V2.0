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
public class sellerlogin 
{
	JFrame mainframe;
	JLabel label1, label2,msglabel1;
	JButton fogpassbutton, logbutton, signbutton, resendbutton,confirmbutton;
	JPanel contentpan, buttonpan, borderpan1, borderpan2;
	JDialog forgotdialog;
	Point loc1;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
	float typelockvolume=-20.0f;
	int x,y;
	Dimension screensize;
	int hidden=0;
	
	boolean otp1=false;
	boolean passw1=false;
	boolean passw2=false;
	
	int seconds=0;
	int hidden1=0;
	int hidden2=0;
	
	String OTP="";
	String RESET_EMAIL="";
	String RESET_USER_NAME="";
	String RESET_OLD_PASSWORD="";
	String NEW_PASSWORD="";
	String RESET_RAW_POST="";
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

	public sellerlogin()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	
	}
	
		public sellerlogin(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
	}
	
	
public JPanel sellerlogpage(JFrame frame)
{
	
screensize = Toolkit.getDefaultToolkit().getScreenSize();


	JPanel smainpanel = new JPanel();
    smainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	smainpanel.setBackground(new Color(22,22,28));
    smainpanel.setLayout(new BoxLayout(smainpanel, BoxLayout.Y_AXIS));////////////////row<COL<X GAP<Y GAP
	smainpanel.setBorder(new EmptyBorder(20,200,50,200));////////////////top<Left<bottom<right
	smainpanel.setOpaque(true);
	
	
	JLabel label1 = new JLabel("Welcome to RAW Login");
	label1.setFont(new Font("Times New Roman",Font.PLAIN,30));
	label1.setForeground(Color.decode("#bfff00"));
	label1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	label1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label1.setAlignmentX(Component.CENTER_ALIGNMENT);
	label1.setCursor(textcursor);
	
	JPanel borderpan1 = new JPanel();
	borderpan1.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	borderpan1.setLayout(new BoxLayout(borderpan1, BoxLayout.Y_AXIS));
	borderpan1.setMinimumSize(new Dimension(smainpanel.getWidth()-220,smainpanel.getHeight()-220));
	borderpan1.setPreferredSize(new Dimension(smainpanel.getWidth()-220,smainpanel.getHeight()-220));
	borderpan1.setMaximumSize(new Dimension(smainpanel.getWidth()-220,smainpanel.getHeight()-220));
	borderpan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	borderpan1.setBorder(new EmptyBorder(10,10,10,10));////////////////top<Left<bottom<right
   borderpan1.setBorder(new LineBorder (new Color(173,255,47), 5));


	JLabel loglabel = new JLabel("SELLER  LOG-IN");
	loglabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
	loglabel.setForeground(Color.decode("#bfff00"));
	loglabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	loglabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	loglabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	loglabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	loglabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	loglabel.setCursor(textcursor);
	
	JLabel msglabel = new JLabel(" ");
	msglabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
	msglabel.setForeground(Color.decode("#fe6f5e"));
	msglabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	msglabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	msglabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	msglabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	msglabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	msglabel.setCursor(textcursor);
	
	
	JPanel mailpan = new JPanel();
	mailpan.setBackground(new Color(22,22,28));
	mailpan.setLayout(new BoxLayout(mailpan, BoxLayout.Y_AXIS));
	mailpan.setMinimumSize(new Dimension(500,70));
	mailpan.setPreferredSize(new Dimension(500,70));
	mailpan.setMaximumSize(new Dimension(500,70));
	mailpan.setAlignmentX(Component.CENTER_ALIGNMENT);
  
    JLabel maillabel = new JLabel("Enter Mail or User Name : ");
	maillabel.setFont(new Font("Calibri",Font.PLAIN,18));
	maillabel.setForeground(Color.decode("#bfff00"));
	maillabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	maillabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	maillabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	maillabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	maillabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	maillabel.setCursor(textcursor);
  
  	HintTextField umailfield = new HintTextField("  example@raw.com");//border ac-border inactive
	
		umailfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
               	
						
				
            }
        });
		
		
	
	umailfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
	umailfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	umailfield.activebgColor=Color.decode("#385724");
	umailfield.inactivebgColor=Color.decode("#385724");
	umailfield.activefgColor=Color.WHITE;////////////color on type
	umailfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	umailfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	umailfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	umailfield.setFont(new Font("Arial",Font.PLAIN,12));
	umailfield.setForeground(Color.decode("#FFFFFF"));
	umailfield.setBackground(Color.decode("#385724"));
	umailfield.setColumns(30);
	umailfield.setBorder(new LineBorder (new Color(173,255,47), 1));        
    umailfield.addMouseListener(new FieldMouseListener());
	umailfield.setCaretColor(Color.WHITE);
	umailfield.setMinimumSize(new Dimension(400, 40));
	umailfield.setPreferredSize(new Dimension(400, 40));
  
  
  
  
  
  
  
  
	JPanel passpan = new JPanel();
	passpan.setBackground(new Color(22,22,28));
	passpan.setLayout(new BoxLayout(passpan, BoxLayout.Y_AXIS));
	passpan.setMinimumSize(new Dimension(500,70));
	passpan.setPreferredSize(new Dimension(500,70));
	passpan.setMaximumSize(new Dimension(500,70));
	passpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel passpan1 = new JPanel();
	passpan1.setBackground(new Color(22,22,28));
	passpan1.setLayout(new BoxLayout(passpan1, BoxLayout.X_AXIS));
	passpan1.setMinimumSize(new Dimension(500,45));
	passpan1.setPreferredSize(new Dimension(500,45));
	passpan1.setMaximumSize(new Dimension(500,45));
	passpan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel passlabel = new JLabel("Enter Password : ");
	passlabel.setFont(new Font("Calibri",Font.PLAIN,18));
	passlabel.setForeground(Color.decode("#bfff00"));
	passlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	passlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	passlabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	passlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	passlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	passlabel.setCursor(textcursor);
  
  	HintPassField passfield = new HintPassField("");//border ac-border inactive
	
		passfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
               
				
				
				
            }
        });
		
		
	
	passfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
	passfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	passfield.activebgColor=Color.decode("#385724");
	passfield.inactivebgColor=Color.decode("#385724");
	passfield.activefgColor=Color.WHITE;////////////color on type
	passfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	passfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	passfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	passfield.setFont(new Font("Arial",Font.PLAIN,12));
	passfield.setForeground(Color.decode("#FFFFFF"));
	passfield.setBackground(Color.decode("#385724"));
	passfield.setColumns(30);
	passfield.setEchoChar('*');
	passfield.setBorder(new LineBorder (new Color(173,255,47), 1));        
    passfield.addMouseListener(new FieldMouseListener());
	passfield.setCaretColor(Color.WHITE);
	passfield.setMinimumSize(new Dimension(400, 40));
	passfield.setPreferredSize(new Dimension(400, 40));
	
	
	 

	
	JButton hidebutton = new HoverButton("Show");
	hidebutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	hidebutton.setBackground(new Color(125,125,125));
	hidebutton.setForeground(Color.WHITE);
	hidebutton.setCursor(handcursor);
	hidebutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	hidebutton.setOpaque(false);
    hidebutton.setContentAreaFilled(false);
    hidebutton.setBorderPainted(true);
	hidebutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	hidebutton.setFocusable(false);
	hidebutton.setMinimumSize(new Dimension(60,45));
    hidebutton.setPreferredSize(new Dimension(60,45));
    hidebutton.setMaximumSize(new Dimension(60,45));
		hidebutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		hidebutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		hidden++;
		if(hidden%2==0)
		{
			passfield.setEchoChar('*');
			hidebutton.setText("Show");
			
		}
		else{
			passfield.setEchoChar((char)0);
			hidebutton.setText("Hide");
			
		}
		
		
		}
		
		});	
		
	
	
	
	
	
	
	JPanel fogpasspan = new JPanel();
	fogpasspan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	fogpasspan.setLayout(new BoxLayout(fogpasspan, BoxLayout.X_AXIS));
	fogpasspan.setMinimumSize(new Dimension(500,60));
	fogpasspan.setPreferredSize(new Dimension(500,60));
	fogpasspan.setMaximumSize(new Dimension(500,60));
	fogpasspan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JCheckBox remember = new JCheckBox("Remember me");
	remember.setFont(new Font("Comic Sans",Font.PLAIN,16));
	remember.setBackground(new Color(22,22,28));
	remember.setForeground(Color.decode("#bfff00"));
	remember.setBorder(new EmptyBorder(0,30,0,0));
	remember.setOpaque(false);
    remember.setContentAreaFilled(false);
    remember.setBorderPainted(true);
	remember.setAlignmentX(Component.LEFT_ALIGNMENT);
	remember.setFocusable(false);
	
	 fogpassbutton = new HoverButton(" Forgot Password ");
	fogpassbutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	
	fogpassbutton.setForeground(Color.WHITE);
	fogpassbutton.setCursor(handcursor);
	fogpassbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	fogpassbutton.setOpaque(false);
    fogpassbutton.setContentAreaFilled(false);
    fogpassbutton.setBorderPainted(true);
	fogpassbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	fogpassbutton.setFocusable(false);
	fogpassbutton.setMinimumSize(new Dimension(130,30));
    fogpassbutton.setPreferredSize(new Dimension(130,30));
    fogpassbutton.setMaximumSize(new Dimension(130,30));
	fogpassbutton.setBackground(new Color(121, 181, 79));
	
		fogpassbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		fogpassbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		forgotpassword(mainframe);
		
		}
		
		});	
	
	
	
	
	JPanel logpan = new JPanel();
	logpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	logpan.setLayout(new BoxLayout(logpan, BoxLayout.Y_AXIS));
	logpan.setMinimumSize(new Dimension(500,60));
	logpan.setPreferredSize(new Dimension(500,60));
	logpan.setMaximumSize(new Dimension(500,60));
	logpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	
	logbutton = new HoverButton(" Log In ");
	logbutton.setFont(new Font("Comic Sans",Font.PLAIN,20));
	
	logbutton.setForeground(Color.WHITE);
	logbutton.setCursor(handcursor);
	logbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	logbutton.setOpaque(false);
    logbutton.setContentAreaFilled(false);
    logbutton.setBorderPainted(true);
	logbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	logbutton.setFocusable(false);
	logbutton.setMinimumSize(new Dimension(400,40));
    logbutton.setPreferredSize(new Dimension(400,40));
    logbutton.setMaximumSize(new Dimension(400,40));
	logbutton.setBackground(new Color(121, 181, 79));
	
		logbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		logbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
		
			
try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		
		
		
		
		String searchquery="SELECT * FROM `seller_signup_user_details` WHERE BINARY EMAIL  ='"+ umailfield.getText()+"' OR BINARY USER_NAME='"+  umailfield.getText()+"' AND BINARY PASSWORD='"+  passfield.getText()+"'";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(result.next())
		{
			
String USER_NAME=result.getString("USER_NAME");
String EMAIL=result.getString("EMAIL");
String PASSWORD=result.getString("PASSWORD");
String RAW_POST=result.getString("RAW_POST");
String REMEMBER_ME="";
if(remember.isSelected())
{
	 REMEMBER_ME="yes";
	 
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
FileWriter s1 = new FileWriter(p+"/login.rw", true);
Formatter form1 = new Formatter(s1);

form1.format("%s\r\n%s\r\n%s\r\n",EMAIL,PASSWORD,RAW_POST);

	form1.close();
	
}catch(IOException e1)
{
	System.out.print(e1);
	
}

}
if(!remember.isSelected())
{
	 REMEMBER_ME="no";
}
timeraw t=new timeraw();
String ltime=t.intime();	
rawip rp = new rawip();
String lip=rp.localhostaddress()+"\n"+rp.publicipaddress();
		 
		 try{		

        String insertquery="INSERT INTO `seller_login` (`USER_NAME`, `EMAIL`, `PASSWORD`, `REMEMBER_ME`, `LOGIN_TIME`, `LOGIN_IP`, `RAW_POST`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+PASSWORD+"','"+REMEMBER_ME+"', '"+ltime+"', '"+lip+"', '"+RAW_POST+"');";
		
		statement.executeUpdate(insertquery);

		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
		
		
		
	mainframe.getContentPane().removeAll();
			 
			 sellerportal spo = new sellerportal(mainframe, EMAIL, PASSWORD);
			
			//mainframe.setJMenuBar(bp.buyerportalpage(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(spo.sellerportalpage(mainframe));
			mainframe.setVisible(true);
		
		
		}
		else{
			msglabel.setText("Your Mail and Password did not match with our database.");
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
		
		});	
		
	
	
	
	
	
	
	
	
	
	JPanel signpan = new JPanel();
	signpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	signpan.setLayout(new BoxLayout(signpan, BoxLayout.X_AXIS));
	signpan.setMinimumSize(new Dimension(500,60));
	signpan.setPreferredSize(new Dimension(500,60));
	signpan.setMaximumSize(new Dimension(500,60));
	signpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	
	JLabel signlabel = new JLabel("Not a member?");
	signlabel.setFont(new Font("Calibri",Font.PLAIN,18));
	signlabel.setForeground(Color.decode("#bfff00"));
	signlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	signlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	signlabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	signlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	signlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	signlabel.setCursor(textcursor);
  
	
	
	
	signbutton = new HoverButton(" Sign Up ");
	signbutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	
	signbutton.setForeground(Color.WHITE);
	signbutton.setCursor(handcursor);
	signbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	signbutton.setOpaque(false);
    signbutton.setContentAreaFilled(false);
    signbutton.setBorderPainted(true);
	signbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	signbutton.setFocusable(false);
	signbutton.setMinimumSize(new Dimension(80,30));
    signbutton.setPreferredSize(new Dimension(80,30));
    signbutton.setMaximumSize(new Dimension(80,30));
	signbutton.setBackground(new Color(121, 181, 79));
	
		signbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
	
		signbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mainframe.setJMenuBar(null);
		
			mainframe.getContentPane().removeAll();
             sellersignup lm = new sellersignup(mainframe);


           // mainframe.setJMenuBar(lm.signupmenubar(mainframe));
            //mainframe.getContentPane().add(lm.loginmenupage(mainframe));
            mainframe.setContentPane(lm.sellersignpage(mainframe));
            mainframe.setVisible(true);
		
		}
		
		});	
		
		
	
	
	
	
	JPanel backpan = new JPanel();
	backpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	backpan.setLayout(new BoxLayout(backpan, BoxLayout.Y_AXIS));
	backpan.setMinimumSize(new Dimension(500,60));
	backpan.setPreferredSize(new Dimension(500,60));
	backpan.setMaximumSize(new Dimension(500,60));
	backpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JButton backbutton = new HoverButton(" Go Back ");
	backbutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	
	backbutton.setForeground(Color.WHITE);
	backbutton.setCursor(handcursor);
	backbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	backbutton.setOpaque(false);
    backbutton.setContentAreaFilled(false);
    backbutton.setBorderPainted(true);
	backbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	backbutton.setFocusable(false);
	backbutton.setMinimumSize(new Dimension(80,30));
    backbutton.setPreferredSize(new Dimension(80,30));
    backbutton.setMaximumSize(new Dimension(80,30));
	backbutton.setBackground(new Color(121, 181, 79));
	
		backbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		backbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
			mainframe.getContentPane().removeAll();
			 loginmenu lm = new loginmenu(mainframe);
			
			
			mainframe.setJMenuBar(lm.loginmenubar(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(lm.loginmenupage(mainframe));
			mainframe.setVisible(true);
		
		}
		
		});	
	
	
	
	
backpan.add(backbutton);


signpan.add(Box.createRigidArea(new Dimension(150, 0)));	
signpan.add(signlabel);	
signpan.add(Box.createRigidArea(new Dimension(10, 0)));	
signpan.add(signbutton);	


logpan.add(logbutton);			
	
fogpasspan.add(remember);	
fogpasspan.add(Box.createRigidArea(new Dimension(200, 1)));	
fogpasspan.add(fogpassbutton);	
	
	
	
mailpan.add(maillabel);	
mailpan.add(Box.createRigidArea(new Dimension(0, 5)));		
mailpan.add(umailfield);	

passpan1.add(passfield);	
passpan1.add(hidebutton);

passpan.add(passlabel);	
mailpan.add(Box.createRigidArea(new Dimension(0, 5)));	
passpan.add(passpan1);		

	
borderpan1.add(Box.createRigidArea(new Dimension(0, 20)));	
borderpan1.add(loglabel);
borderpan1.add(Box.createRigidArea(new Dimension(0, 10)));	
borderpan1.add(msglabel);
borderpan1.add(Box.createRigidArea(new Dimension(0, 10)));	
borderpan1.add(mailpan);	
borderpan1.add(Box.createRigidArea(new Dimension(0, 40)));	
borderpan1.add(passpan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(fogpasspan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(logpan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 10)));	
borderpan1.add(signpan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(backpan);




smainpanel.add(label1);	
smainpanel.add(Box.createRigidArea(new Dimension(0, 20)));
smainpanel.add(borderpan1);


return smainpanel;	
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
            g2d.setColor(new Color(44, 47, 51));
            g2d.drawRoundRect(x, y, width - 1 , height - 1, 30, 30);
        }
    }
	
		
public JDialog forgotpassword(JFrame frame)
{	
	
	forgotdialog = new JDialog(frame,"Reset Password Form",true);
	loc1 = frame.getLocation();
    forgotdialog.setLocation(loc1.x+300,loc1.y+100);
	forgotdialog.setSize(frame.getWidth()-600,frame.getHeight()-200);
 
    
    JPanel forgotmainpan = new JPanel();
    forgotmainpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	forgotmainpan.setBackground(new Color(22,22,28));
	forgotmainpan.setLayout(new BoxLayout(forgotmainpan, BoxLayout.Y_AXIS));
	forgotmainpan.setBorder(new EmptyBorder(0,0,0,0));
	forgotmainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	forgotmainpan.setMinimumSize(new Dimension(forgotdialog.getWidth(), forgotdialog.getHeight()));
	forgotmainpan.setPreferredSize(new Dimension(forgotdialog.getWidth(), forgotdialog.getHeight()));
	forgotmainpan.setMaximumSize(new Dimension(forgotdialog.getWidth(), forgotdialog.getHeight()));
	
	JPanel forgotborderpan = new JPanel();
	forgotborderpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	forgotborderpan.setLayout(new BoxLayout(forgotborderpan, BoxLayout.Y_AXIS));
	forgotborderpan.setMinimumSize(new Dimension(forgotdialog.getWidth()-260,forgotdialog.getHeight()-220));
	forgotborderpan.setPreferredSize(new Dimension(forgotdialog.getWidth()-260,forgotdialog.getHeight()-220));
	forgotborderpan.setMaximumSize(new Dimension(forgotdialog.getWidth()-260,forgotdialog.getHeight()-220));
	forgotborderpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	forgotborderpan.setBorder(new EmptyBorder(10,10,10,10));////////////////top<Left<bottom<right
   forgotborderpan.setBorder(new LineBorder (new Color(173,255,47), 5));
	
	JPanel firstpan = new JPanel();
    firstpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	firstpan.setBackground(new Color(22,22,28));
	firstpan.setLayout(new BoxLayout(firstpan, BoxLayout.Y_AXIS));
	firstpan.setBorder(new EmptyBorder(0,0,0,0));
	firstpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel secondpan = new JPanel();
    //secondpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	secondpan.setBackground(new Color(22,22,28));
	secondpan.setLayout(new BoxLayout(secondpan, BoxLayout.Y_AXIS));
	secondpan.setBorder(new EmptyBorder(0,0,0,0));
	secondpan.setMinimumSize(new Dimension(350, 90));
	secondpan.setPreferredSize(new Dimension(350, 90));
	secondpan.setMaximumSize(new Dimension(360, 110));
	secondpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel thirdpan = new JPanel();
    thirdpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	thirdpan.setBackground(new Color(22,22,28));
	thirdpan.setLayout(new BoxLayout(thirdpan, BoxLayout.Y_AXIS));
	thirdpan.setBorder(new EmptyBorder(0,0,0,0));
	thirdpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel forgotlabel = new JLabel("<html>Reset Password Form</html>");
	forgotlabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
	forgotlabel.setForeground(new Color(173,255,47));
	forgotlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	forgotlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	forgotlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	forgotlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	forgotlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	forgotlabel.setCursor(textcursor);
	
	////////////////////////////////// 1st label //////////////////////
	JLabel fstlabel = new JLabel("<html>Forgot Your Password ?</html>");
	fstlabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
	fstlabel.setForeground(new Color(173,255,47));
	fstlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	fstlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	fstlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	fstlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	fstlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	fstlabel.setCursor(textcursor);
	
	JLabel sndlabel = new JLabel("<html>Enter your registered email to receive </html>");
	sndlabel.setFont(new Font("Calibri",Font.PLAIN,15));
	sndlabel.setForeground(new Color(173,255,47));
	sndlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	sndlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	sndlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	sndlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	sndlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	sndlabel.setCursor(textcursor);
	
	JLabel thdlabel = new JLabel("<html>password reset information.</html>");
	thdlabel.setFont(new Font("Calibri",Font.PLAIN,15));
	thdlabel.setForeground(new Color(173,255,47));
	thdlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	thdlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	thdlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	thdlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	thdlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	thdlabel.setCursor(textcursor);
	
	JLabel emaillabel = new JLabel("<html>User Email</html>");
	emaillabel.setFont(new Font("Calibri",Font.BOLD,16));
	emaillabel.setForeground(new Color(173,255,47));
	emaillabel.setBorder(new EmptyBorder(0,0,0,0));
	emaillabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	emaillabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	emaillabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	emaillabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	emaillabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	emaillabel.setCursor(textcursor);
	
	HintTextField mailfield = new HintTextField("  example@raw.com");//border ac-border inactive
	
		mailfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
                			
				
            }
        });
		
		
	
	mailfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
    mailfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	mailfield.activebgColor=Color.decode("#385724");
	mailfield.inactivebgColor=Color.decode("#385724");
	mailfield.activefgColor=Color.WHITE;////////////color on type
	mailfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	mailfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	mailfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	mailfield.setFont(new Font("Arial",Font.PLAIN,12));
	mailfield.setForeground(Color.decode("#FFFFFF"));
	mailfield.setBackground(Color.decode("#385724"));
	mailfield.setColumns(30);
	mailfield.setBorder(new LineBorder (new Color(173,255,47), 1));        
    mailfield.addMouseListener(new FieldMouseListener());
	mailfield.setCaretColor(Color.WHITE);
	mailfield.setMinimumSize(new Dimension(400, 40));
	mailfield.setPreferredSize(new Dimension(400, 40));
	//mailfield.setAlignmentX(Component.CENTER_ALIGNMENT);
	mailfield.setHorizontalAlignment(HintTextField.CENTER);

JLabel msglabel = new JLabel(" ");
	msglabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
	msglabel.setForeground(Color.decode("#fe6f5e"));
	msglabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	msglabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	msglabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	msglabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	msglabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	msglabel.setCursor(textcursor);
	
	
	HoverButton sendbutton = new HoverButton(" SEND ");
	sendbutton.setFont(new Font("Comic Sans",Font.BOLD,16));
	
	sendbutton.setForeground(Color.WHITE);
	sendbutton.setCursor(handcursor);
	sendbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	sendbutton.setOpaque(true);
    sendbutton.setContentAreaFilled(false);
    sendbutton.setBorderPainted(true);
	sendbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	sendbutton.setFocusable(false);
	sendbutton.setMinimumSize(new Dimension(130,30));
    sendbutton.setPreferredSize(new Dimension(130,30));
    sendbutton.setMaximumSize(new Dimension(130,30));
	sendbutton.setBackground(new Color(121, 181, 79));
	
		sendbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		sendbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//forgotdialog.removeAll();
		//forgotdialog.add(otp(forgotdialog));
		//forgotdialog.revalidate();
		
		try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		
		
		
		
		String searchquery="SELECT * FROM `seller_signup_user_details` WHERE BINARY EMAIL  ='"+ mailfield.getText()+"' OR BINARY USER_NAME='"+  mailfield.getText()+"'";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(result.next())
		{
    OTP= new DecimalFormat("000000").format(new Random().nextInt(999999));
    mailerhtml mh=new mailerhtml();
	RESET_EMAIL=result.getString("EMAIL");
	RESET_USER_NAME=result.getString("USER_NAME");
	RESET_OLD_PASSWORD=result.getString("PASSWORD");
	RESET_RAW_POST=result.getString("RAW_POST");
	
	mh.sendhtml("system.confirmation.validity@gmail.com","cezsxtphsghceajb",RESET_EMAIL,"Verification of RAW Account","<h3>Dear "+RESET_USER_NAME+",</h3> <br> Your verification code is: "+OTP +" <br> <br><br><br>Enter this code in RAW software to reset your Seller account password. <br><br>Once your password will changed, you will be able to login to your RAW portal with new password. <br><br> If this wasn't you:<br> keep calm we will not start your account <b><i>Password Recovery Process(PRP)</i></b> without this confirmation code. <br><br><br> Do not reply here. <br><br><br> If you have any questions, send us an email( raw.helpdesk@gmail.com ). <br><br><br> Thanks, <br> RAW <br><br><br><br><br>All rights reserved @Team RAW. ","text/html");


		
        forgotdialog.getContentPane().removeAll();
		forgotdialog.add(otp(forgotdialog));
		forgotdialog.revalidate();
		
		
		}
		else{
			msglabel.setText("Your Mail or User-Name did not match with our database.");
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
		
		});	
	
	//softmainpan.add(softrprtsubbttnpan);

	firstpan.add(Box.createRigidArea(new Dimension(0, 80)));	
	firstpan.add(fstlabel);
	firstpan.add(Box.createRigidArea(new Dimension(0, 20)));	
	firstpan.add(msglabel);
	firstpan.add(Box.createRigidArea(new Dimension(0, 20)));	
	firstpan.add(sndlabel);	
	firstpan.add(Box.createRigidArea(new Dimension(0, 5)));	
	firstpan.add(thdlabel);
	
	secondpan.add(Box.createRigidArea(new Dimension(0, 40)));	
	secondpan.add(emaillabel);	
	secondpan.add(Box.createRigidArea(new Dimension(0, 10)));	
	secondpan.add(mailfield);
	
	thirdpan.add(Box.createRigidArea(new Dimension(0, 60)));	
	thirdpan.add(sendbutton);
	
	forgotborderpan.add(firstpan);	
	forgotborderpan.add(secondpan);	
	forgotborderpan.add(thirdpan);	
	
	
	forgotmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
	forgotmainpan.add(forgotlabel);	
    forgotmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
    forgotmainpan.add(forgotborderpan);
	
	forgotdialog.add(forgotmainpan);
	
	///////////////////////
/*	forgotdialog.getContentPane().removeAll();
	forgotdialog.add(changepass(forgotdialog));
		forgotdialog.revalidate();
	*/
//////////////////////
	forgotdialog.setVisible(true);
	
	
	return forgotdialog;
	
	
}

	
public JPanel otp(JDialog otpdialog)
{	
	
    
    JPanel otpmainpan = new JPanel();
    otpmainpan.setSize((otpdialog.getWidth()), (otpdialog.getHeight()));
	otpmainpan.setBackground(new Color(22,22,28));
	otpmainpan.setLayout(new BoxLayout(otpmainpan, BoxLayout.Y_AXIS));
	otpmainpan.setBorder(new EmptyBorder(0,0,0,0));
	otpmainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	otpmainpan.setMinimumSize(new Dimension(otpdialog.getWidth(), otpdialog.getHeight()));
	otpmainpan.setPreferredSize(new Dimension(otpdialog.getWidth(), otpdialog.getHeight()));
	otpmainpan.setMaximumSize(new Dimension(otpdialog.getWidth(), otpdialog.getHeight()));
	
	JPanel otpborderpan = new JPanel();
	otpborderpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	otpborderpan.setLayout(new BoxLayout(otpborderpan, BoxLayout.Y_AXIS));
	otpborderpan.setMinimumSize(new Dimension(otpdialog.getWidth()-260,otpdialog.getHeight()-220));
	otpborderpan.setPreferredSize(new Dimension(otpdialog.getWidth()-260,otpdialog.getHeight()-220));
	otpborderpan.setMaximumSize(new Dimension(otpdialog.getWidth()-260,otpdialog.getHeight()-220));
	otpborderpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	otpborderpan.setBorder(new EmptyBorder(10,10,10,10));////////////////top<Left<bottom<right
   otpborderpan.setBorder(new LineBorder (new Color(173,255,47), 5));
	
	JPanel firstpan = new JPanel();
    firstpan.setSize((otpdialog.getWidth()), (otpdialog.getHeight()));
	firstpan.setBackground(new Color(22,22,28));
	firstpan.setLayout(new BoxLayout(firstpan, BoxLayout.Y_AXIS));
	firstpan.setBorder(new EmptyBorder(0,0,0,0));
	firstpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel secondpan = new JPanel();
    //secondpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	secondpan.setBackground(new Color(22,22,28));
	secondpan.setLayout(new BoxLayout(secondpan, BoxLayout.Y_AXIS));
	secondpan.setBorder(new EmptyBorder(0,0,0,0));
	secondpan.setMinimumSize(new Dimension(150, 80));
	secondpan.setPreferredSize(new Dimension(150, 80));
	secondpan.setMaximumSize(new Dimension(160, 90));
	secondpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	HintTextField otpfield = new HintTextField(" Enter OTP ");//border ac-border inactive
	
		otpfield.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
                			
				
            }
        });
		
		
	
	otpfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
    otpfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	otpfield.activebgColor=Color.decode("#385724");
	otpfield.inactivebgColor=Color.decode("#385724");
	otpfield.activefgColor=Color.WHITE;////////////color on type
	otpfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	otpfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	otpfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	otpfield.setFont(new Font("Arial",Font.PLAIN,12));
	otpfield.setForeground(Color.decode("#FFFFFF"));
	otpfield.setBackground(Color.decode("#385724"));
	otpfield.setColumns(30);
	otpfield.setBorder(new LineBorder (new Color(173,255,47), 1));        
    otpfield.addMouseListener(new FieldMouseListener());
	otpfield.setCaretColor(Color.WHITE);
	otpfield.setMinimumSize(new Dimension(150, 40));
	otpfield.setPreferredSize(new Dimension(150, 40));
	//mailfield.setAlignmentX(Component.CENTER_ALIGNMENT);
	otpfield.setHorizontalAlignment(HintTextField.CENTER);



	JPanel thirdpan = new JPanel();
    thirdpan.setSize((otpdialog.getWidth()), (otpdialog.getHeight()));
	thirdpan.setBackground(new Color(22,22,28));
	thirdpan.setLayout(new BoxLayout(thirdpan, BoxLayout.X_AXIS));
	thirdpan.setBorder(new EmptyBorder(0,0,0,200));
	thirdpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel frtlabel = new JLabel("<html>Did not receive a code ?  </html>");
	frtlabel.setFont(new Font("Calibri",Font.PLAIN,15));
	frtlabel.setForeground(new Color(173,255,47));
	frtlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	frtlabel.setHorizontalAlignment(JLabel.RIGHT);////x axis for all-LEFT,CENTER,RIGHT
	frtlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	frtlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	frtlabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	frtlabel.setCursor(textcursor);
	
	 resendbutton = new HoverButton(" RESEND ");
	resendbutton.setFont(new Font("Comic Sans",Font.BOLD,12));
	
	resendbutton.setForeground(Color.WHITE);
	resendbutton.setCursor(handcursor);
	resendbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	resendbutton.setOpaque(true);
    resendbutton.setContentAreaFilled(false);
    resendbutton.setBorderPainted(true);
	resendbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	resendbutton.setFocusable(false);
	resendbutton.setMinimumSize(new Dimension(80,15));
    resendbutton.setPreferredSize(new Dimension(80,15));
    resendbutton.setMaximumSize(new Dimension(80,15));
	resendbutton.setBackground(new Color(121, 181, 79));
	resendbutton.setEnabled(false);
		resendbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		resendbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
	    OTP= new DecimalFormat("000000").format(new Random().nextInt(999999));
    mailerhtml mh=new mailerhtml();
	mh.sendhtml("raw.system.recovery@gmail.com","raw@2020",RESET_EMAIL,"Verification of RAW Account","<h3>Dear "+RESET_USER_NAME+",</h3> <br> Your verification code is: "+OTP +" <br> <br><br><br>Enter this code in RAW software to reset your Seller account password. <br><br>Once your password will changed, you will be able to login to your RAW portal with new password. <br><br> If this wasn't you:<br> keep calm we will not start your account <b><i>Password Recovery Process(PRP)</i></b> without this confirmation code. <br><br><br> Do not reply here. <br><br><br> If you have any questions, send us an email( raw.helpdesk@gmail.com ). <br><br><br> Thanks, <br> RAW <br><br><br><br><br>All rights reserved @Team RAW. ","text/html");
verificationtimer();
		
		}
		
		});	
	
	JPanel forthpan = new JPanel();
    forthpan.setSize((otpdialog.getWidth()), (otpdialog.getHeight()));
	forthpan.setBackground(new Color(22,22,28));
	forthpan.setLayout(new BoxLayout(forthpan, BoxLayout.Y_AXIS));
	forthpan.setBorder(new EmptyBorder(0,0,0,0));
	forthpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	 msglabel1 = new JLabel(" ");
	msglabel1.setFont(new Font("Times New Roman",Font.PLAIN,18));
	msglabel1.setForeground(Color.decode("#fe6f5e"));
	msglabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	msglabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	msglabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	msglabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	msglabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	msglabel1.setCursor(textcursor);
	verificationtimer();
	
	HoverButton verifybutton = new HoverButton(" VERIFY ");
	verifybutton.setFont(new Font("Comic Sans",Font.BOLD,16));
	verifybutton.setForeground(Color.WHITE);
	verifybutton.setCursor(handcursor);
	verifybutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	verifybutton.setOpaque(true);
    verifybutton.setContentAreaFilled(false);
    verifybutton.setBorderPainted(true);
	verifybutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	verifybutton.setFocusable(false);
	verifybutton.setMinimumSize(new Dimension(130,30));
    verifybutton.setPreferredSize(new Dimension(130,30));
    verifybutton.setMaximumSize(new Dimension(130,30));
	verifybutton.setBackground(new Color(121, 181, 79));
	
		verifybutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		verifybutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//forgotdialog.removeAll();
		//forgotdialog.add(otp(forgotdialog));
		//forgotdialog.revalidate();
		
		if(OTP.equals(otpfield.getText()))
		{
			otp1=true;
		otpdialog.getContentPane().removeAll();
		otpdialog.add(changepass(otpdialog));
		otpdialog.revalidate();
		}
		else{
		msglabel1.setText("Your OTP was Incorrect, Please Enter Valid one.");

		}
		}
		
		});	
		
	JLabel otplabel = new JLabel("<html>Reset Password Form</html>");
	otplabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
	otplabel.setForeground(new Color(173,255,47));
	otplabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	otplabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	otplabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	otplabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	otplabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	otplabel.setCursor(textcursor);
	
	////////////////////////////////// 1st label //////////////////////
	JLabel fstlabel = new JLabel("<html>OTP</html>");
	fstlabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
	fstlabel.setForeground(new Color(173,255,47));
	fstlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	fstlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	fstlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	fstlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	fstlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	fstlabel.setCursor(textcursor);
	
	JLabel sndlabel = new JLabel("<html>Please enter your one time password </html>");
	sndlabel.setFont(new Font("Calibri",Font.PLAIN,15));
	sndlabel.setForeground(new Color(173,255,47));
	sndlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	sndlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	sndlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	sndlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	sndlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	sndlabel.setCursor(textcursor);
	
	JLabel thdlabel = new JLabel("<html>to verify your email</html>");
	thdlabel.setFont(new Font("Calibri",Font.PLAIN,15));
	thdlabel.setForeground(new Color(173,255,47));
	thdlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	thdlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	thdlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	thdlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	thdlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	thdlabel.setCursor(textcursor);
	
	firstpan.add(Box.createRigidArea(new Dimension(0, 60)));	
	firstpan.add(fstlabel);
	firstpan.add(Box.createRigidArea(new Dimension(0, 15)));	
	firstpan.add(msglabel1);
	firstpan.add(Box.createRigidArea(new Dimension(0, 15)));	
	firstpan.add(sndlabel);	
	firstpan.add(Box.createRigidArea(new Dimension(0, 5)));	
	firstpan.add(thdlabel);
	
	secondpan.add(Box.createRigidArea(new Dimension(0, 50)));	
	secondpan.add(otpfield);
	
	thirdpan.add(Box.createRigidArea(new Dimension(0, 80)));	
	thirdpan.add(frtlabel);
	thirdpan.add(Box.createRigidArea(new Dimension(10, 0)));	
	thirdpan.add(resendbutton);
	
	forthpan.add(Box.createRigidArea(new Dimension(0, 20)));	
	forthpan.add(verifybutton);
	
	otpborderpan.add(firstpan);	
	otpborderpan.add(secondpan);	
	otpborderpan.add(thirdpan);
	otpborderpan.add(forthpan);
	
	otpmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
	otpmainpan.add(otplabel);	
    otpmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
    otpmainpan.add(otpborderpan);
	
	
	
	return otpmainpan;
	
}

public void verificationtimer()
	{
		Timer timer = new Timer();
    
        TimerTask task;

         task = new TimerTask() {
        private final int MAX_SECONDS = 120;

        @Override
        public void run() { 
            if (seconds < MAX_SECONDS && !otp1) 
			{
				
			msglabel1.setText("*Please Check Your Mailbox For OTP (Resend after: "+(120-seconds)+" Seconds)");

                seconds++;
            } 
			
			else {
                 timer.cancel();
			if(!otp1)
			{				
			msglabel1.setText("*You Can Re-Send OTP Mail Now.");
			}			
	        resendbutton.setEnabled(true);
			seconds=0;
			return;
            }
        }
    };
	if (seconds < 121) 
			{
         timer.schedule(task, 0, 1000);
			}
	}
public JPanel changepass(JDialog passdialog)
{	
	
    
    JPanel passmainpan = new JPanel();
    passmainpan.setSize((passdialog.getWidth()), (passdialog.getHeight()));
	passmainpan.setBackground(new Color(22,22,28));
	passmainpan.setLayout(new BoxLayout(passmainpan, BoxLayout.Y_AXIS));
	passmainpan.setBorder(new EmptyBorder(0,0,0,0));
	passmainpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	passmainpan.setMinimumSize(new Dimension(passdialog.getWidth(), passdialog.getHeight()));
	passmainpan.setPreferredSize(new Dimension(passdialog.getWidth(), passdialog.getHeight()));
	passmainpan.setMaximumSize(new Dimension(passdialog.getWidth(), passdialog.getHeight()));
	
	JPanel passborderpan = new JPanel();
	passborderpan.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	passborderpan.setLayout(new BoxLayout(passborderpan, BoxLayout.Y_AXIS));
	passborderpan.setMinimumSize(new Dimension(passdialog.getWidth()-260,passdialog.getHeight()-220));
	passborderpan.setPreferredSize(new Dimension(passdialog.getWidth()-260,passdialog.getHeight()-220));
	passborderpan.setMaximumSize(new Dimension(passdialog.getWidth()-260,passdialog.getHeight()-220));
	passborderpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	passborderpan.setBorder(new EmptyBorder(10,10,10,10));////////////////top<Left<bottom<right
   passborderpan.setBorder(new LineBorder (new Color(173,255,47), 5));
	
	JLabel passlabel = new JLabel("<html>Reset Password Form</html>");
	passlabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
	passlabel.setForeground(new Color(173,255,47));
	passlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	passlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	passlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	passlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	passlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	passlabel.setCursor(textcursor);
	
	JPanel firstpan = new JPanel();
    firstpan.setSize((passdialog.getWidth()), (passdialog.getHeight()));
	firstpan.setBackground(new Color(22,22,28));
	firstpan.setLayout(new BoxLayout(firstpan, BoxLayout.Y_AXIS));
	firstpan.setBorder(new EmptyBorder(0,0,0,0));
	firstpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel secondpan = new JPanel();
    //secondpan.setSize((forgotdialog.getWidth()), (forgotdialog.getHeight()));
	secondpan.setBackground(new Color(22,22,28));
	secondpan.setLayout(new BoxLayout(secondpan, BoxLayout.Y_AXIS));
	secondpan.setBorder(new EmptyBorder(0,0,0,0));
	secondpan.setMinimumSize(new Dimension(400, 80));
	secondpan.setPreferredSize(new Dimension(400, 80));
	secondpan.setMaximumSize(new Dimension(400, 90));
	secondpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel thirdpan = new JPanel();
    thirdpan.setSize((passdialog.getWidth()), (passdialog.getHeight()));
	thirdpan.setBackground(new Color(22,22,28));
	thirdpan.setLayout(new BoxLayout(thirdpan, BoxLayout.Y_AXIS));
	thirdpan.setBorder(new EmptyBorder(0,0,0,0));
	thirdpan.setMinimumSize(new Dimension(400, 80));
	thirdpan.setPreferredSize(new Dimension(400, 80));
	thirdpan.setMaximumSize(new Dimension(400, 90));
	thirdpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	////////////////////////////////// 1st label //////////////////////
	JLabel fstlabel = new JLabel("<html>Create New Password</html>");
	fstlabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
	fstlabel.setForeground(new Color(173,255,47));
	fstlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	fstlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	fstlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	fstlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	fstlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	fstlabel.setCursor(textcursor);
	
	
	JLabel sndlabel = new JLabel("<html>Your new password must be different from </html>");
	sndlabel.setFont(new Font("Calibri",Font.PLAIN,14));
	sndlabel.setForeground(new Color(173,255,47));
	sndlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	sndlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	sndlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	sndlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	sndlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	sndlabel.setCursor(textcursor);
	
	JLabel thdlabel = new JLabel("<html>previously used passwords.</html>");
	thdlabel.setFont(new Font("Calibri",Font.PLAIN,14));
	thdlabel.setForeground(new Color(173,255,47));
	thdlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	thdlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	thdlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	thdlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	thdlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	thdlabel.setCursor(textcursor);
	
	JPanel passpan11 = new JPanel();
	passpan11.setBackground(new Color(44,47,51));
	passpan11.setLayout(new BoxLayout(passpan11, BoxLayout.X_AXIS));
	passpan11.setMinimumSize(new Dimension(450,40));
	passpan11.setPreferredSize(new Dimension(450,40));
	passpan11.setMaximumSize(new Dimension(500,40));
	passpan11.setBorder(new EmptyBorder(0,0,0,0));
	passpan11.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	

	JLabel pass1label = new JLabel("<html>Enter New Password<font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/16)</font></font></html>");
	pass1label.setFont(new Font("Calibri",Font.BOLD,16));
	pass1label.setForeground(new Color(173,255,47));
	pass1label.setBorder(new EmptyBorder(0,40,0,0));
	pass1label.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	pass1label.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	pass1label.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	pass1label.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	pass1label.setAlignmentX(Component.CENTER_ALIGNMENT);
	pass1label.setCursor(textcursor);
	

	JLabel msglabel = new JLabel(" ");
	msglabel.setFont(new Font("Times New Roman",Font.PLAIN,18));
	msglabel.setForeground(Color.decode("#fe6f5e"));
	msglabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	msglabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	msglabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	msglabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	msglabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	msglabel.setCursor(textcursor);
	
	
	HintPassField pass1field = new HintPassField("");//border ac-border inactive
	pass1field.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
    pass1field.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	pass1field.activebgColor=Color.decode("#385724");
	pass1field.inactivebgColor=Color.decode("#385724");
	pass1field.activefgColor=Color.WHITE;////////////color on type
	pass1field.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	pass1field.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	pass1field.magColorM=Color.RED;///////// color if user click and unfill/ignore
	pass1field.setFont(new Font("Arial",Font.PLAIN,12));
	pass1field.setForeground(Color.decode("#FFFFFF"));
	pass1field.setBackground(Color.decode("#385724"));
	pass1field.setColumns(30);
	pass1field.setBorder(new LineBorder (new Color(173,255,47), 1));     
    pass1field.setEchoChar('*');	
    pass1field.addMouseListener(new FieldMouseListener());
	pass1field.setCaretColor(Color.WHITE);
	//pass1field.setMinimumSize(new Dimension(400, 40));
	//pass1field.setPreferredSize(new Dimension(400, 40));
	
	pass1field.addKeyListener(new KeyAdapter()
		{
			validpassword vs=new validpassword();
public void keyPressed(KeyEvent evt)
{
	
	if(pass1field.getText().length()==0)
	{
		passw1 = true;
		paslimit();
		
		
		pass1label.setText("<html>Enter New Password<font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass1field.getText().length()+1)+"/16)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   passw1=false;
		paslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
    	pass1label.setText("<html>Enter New Password<font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass1field.getText().length())+"/16)</font></font></html>");

    }	
	}
	
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				
				if (pass1field.getText().length() > 0 && pass1field.getText().length() < 16) // limit textfield
				{
					if(vs.passcheck(RESET_USER_NAME,pass1field.getText())=="")
					{
					passw1 = true;
					paslimit();
					msglabel.setText("<html> </html>");
					}
					else{
						msglabel.setText(vs.passcheck(RESET_USER_NAME,pass1field.getText()));
					}
					pass1label.setText("<html>Enter New Password<font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass1field.getText().length()+1)+"/16)</font></font></html>");
				}
				if(pass1field.getText().length() <= 0 || pass1field.getText().length() >16)
				{
					passw1 = false;
					paslimit();
				}	
				if(pass1field.getText().length() >=16)
				{
					passw1 = false;
					paslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
            }
			
			public void keyReleased(KeyEvent evt) 
{
	msglabel.setText("<html> </html>");
	
	{
if(vs.passcheck(RESET_USER_NAME,pass1field.getText())=="")
					{
					passw1 = true;
					paslimit();
					msglabel.setText("");
					}
					else{
						msglabel.setText(vs.passcheck(RESET_USER_NAME,pass1field.getText()));
					}
}

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
pass1label.setText("<html>Enter New Password<font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass1field.getText().length())+"/16)</font></font></html>");

if(pass1field.getText().length() == 16)
				{
					
				pass1label.setText("<html>Enter New Password<font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass1field.getText().length()-1)+"/16)</font></font></html>");
	
				}
				
				}

}	
        });		
		
	if (pass1field.getText()!="")
		{
			pass1field.setText(pass1field.getText());
		}

HoverButton hidebutton1 = new HoverButton("Show");
	hidebutton1.setFont(new Font("Comic Sans",Font.PLAIN,16));
	hidebutton1.setBackground(new Color(125,125,125));
	hidebutton1.setForeground(Color.WHITE);
	hidebutton1.setCursor(handcursor);
	hidebutton1.setBorder(new LineBorder (Color.decode("#091f23"), 1));

	hidebutton1.setOpaque(false);
    hidebutton1.setContentAreaFilled(false);
    hidebutton1.setBorderPainted(true);
	hidebutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	hidebutton1.setFocusable(false);
	hidebutton1.setMinimumSize(new Dimension(60,45));
    hidebutton1.setPreferredSize(new Dimension(60,45));
    hidebutton1.setMaximumSize(new Dimension(60,45));
	hidebutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		hidebutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		hidden1++;
		if(hidden1%2==0)
		{
			pass1field.setEchoChar('*');
			hidebutton1.setText("Show");
		
		}
		else{
			pass1field.setEchoChar((char)0);
			hidebutton1.setText("Hide");
			
		}
		
		
		}
		
		});	


	JPanel passpan12 = new JPanel();
	passpan12.setBackground(new Color(44,47,51));
	passpan12.setLayout(new BoxLayout(passpan12, BoxLayout.X_AXIS));
	passpan12.setMinimumSize(new Dimension(450,40));
	passpan12.setPreferredSize(new Dimension(450,40));
	passpan12.setMaximumSize(new Dimension(500,40));
	passpan12.setBorder(new EmptyBorder(0,00,0,00));
	passpan12.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	JLabel pass2label = new JLabel("<html>Confirm New Password<font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/16)</font></font></html>");
	pass2label.setFont(new Font("Calibri",Font.BOLD,16));
	pass2label.setForeground(new Color(173,255,47));
	pass2label.setBorder(new EmptyBorder(0,40,0,0));
	pass2label.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	pass2label.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	pass2label.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	pass2label.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	pass2label.setAlignmentX(Component.CENTER_ALIGNMENT);
	pass2label.setCursor(textcursor);
	
	HintPassField pass2field = new HintPassField("");//border ac-border inactive
	pass2field.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
    pass2field.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	pass2field.activebgColor=Color.decode("#385724");
	pass2field.inactivebgColor=Color.decode("#385724");
	pass2field.activefgColor=Color.WHITE;////////////color on type
	pass2field.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	pass2field.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	pass2field.magColorM=Color.RED;///////// color if user click and unfill/ignore
	pass2field.setFont(new Font("Arial",Font.PLAIN,12));
	pass2field.setForeground(Color.decode("#FFFFFF"));
	pass2field.setBackground(Color.decode("#385724"));
	pass2field.setColumns(30);
	pass2field.setBorder(new LineBorder (new Color(173,255,47), 1));        
    pass2field.addMouseListener(new FieldMouseListener());
	pass2field.setCaretColor(Color.WHITE);
	pass2field.setMinimumSize(new Dimension(150, 40));
	pass2field.setPreferredSize(new Dimension(150, 40));
	//mailfield.setAlignmentX(Component.CENTER_ALIGNMENT);
	//pass2field.setHorizontalAlignment(HintTextField.CENTER);
	pass2field.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent evt)
{
	if(passw1)
	{
	if(pass2field.getText().length()==0)
	{
		passw2 = true;
		paslimit();
		
		
		pass2label.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass2field.getText().length()+1)+"/16)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   passw2=false;
		paslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	pass2label.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass2field.getText().length())+"/16)</font></font></html>");

    }	
	}
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				if(!passw1)
				{
					evt.consume();
					msglabel.setText("<html>*Please Enter at Password box first.</html>");
				}
				else{
				if (pass2field.getText().length() > 0 && pass2field.getText().length() < 16) // limit textfield
				{
					
					if(pass2field.getText().equals(pass1field.getText()))
				{
					passw2 = true;
					paslimit();
				msglabel.setText("<html> </html>");
				}
				else
				{
					msglabel.setText("<html>*Please Enter as same as Password.</html>");
				}
					
					
					
					pass2label.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass2field.getText().length()+1)+"/16)</font></font></html>");

				}
				if(pass2field.getText().length() <= 0 || pass2field.getText().length() >16)
				{
					passw2 = false;
					paslimit();
				}	
				if(pass2field.getText().length() >=100)
				{
					passw2 = false;
					paslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}
				}				
				
            }
			public void keyReleased(KeyEvent evt) 
{ 
if(passw1)
{
if(pass2field.getText().equals(pass1field.getText()))
				{
					passw2 = true;
					paslimit();
				msglabel.setText("<html> </html>");
				}
				else{
					msglabel.setText("<html>*Please Enter as same as Password.</html>");
				}
}
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
pass2label.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass2field.getText().length())+"/16)</font></font></html>");

if(pass2field.getText().length() == 16)
				{
					
				pass2label.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(pass2field.getText().length()-1)+"/16)</font></font></html>");
	
				}
				
				}

}	
    
        });	
		
	if (pass2field.getText()!="")
		{
			pass2field.setText(pass2field.getText());
		}

HoverButton hidebutton2 = new HoverButton("Show");
	hidebutton2.setFont(new Font("Comic Sans",Font.PLAIN,16));
	hidebutton2.setBackground(new Color(125,125,125));
	hidebutton2.setForeground(Color.WHITE);
	hidebutton2.setCursor(handcursor);
	hidebutton2.setBorder(new LineBorder (Color.decode("#091f23"), 1));

	hidebutton2.setOpaque(false);
    hidebutton2.setContentAreaFilled(false);
    hidebutton2.setBorderPainted(true);
	hidebutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	hidebutton2.setFocusable(false);
	hidebutton2.setMinimumSize(new Dimension(60,45));
    hidebutton2.setPreferredSize(new Dimension(60,45));
    hidebutton2.setMaximumSize(new Dimension(60,45));
	hidebutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		hidebutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		hidden2++;
		if(hidden2%2==0)
		{
			pass2field.setEchoChar('*');
			hidebutton2.setText("Show");
		
		}
		else{
			pass2field.setEchoChar((char)0);
			hidebutton2.setText("Hide");
			
		}
		
		
		}
		
		});	

	JPanel forthpan = new JPanel();
    forthpan.setSize((passdialog.getWidth()), (passdialog.getHeight()));
	forthpan.setBackground(new Color(22,22,28));
	forthpan.setLayout(new BoxLayout(forthpan, BoxLayout.Y_AXIS));
	forthpan.setBorder(new EmptyBorder(0,0,0,0));
	forthpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	

	
	
	 confirmbutton = new HoverButton(" SUBMIT ");
	confirmbutton.setFont(new Font("Comic Sans",Font.BOLD,16));
	confirmbutton.setForeground(Color.WHITE);
	confirmbutton.setCursor(handcursor);
	confirmbutton.setBorder(new LineBorder (new Color(173,255,47), 1));
	confirmbutton.setOpaque(true);
    confirmbutton.setContentAreaFilled(false);
    confirmbutton.setBorderPainted(true);
	confirmbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	confirmbutton.setFocusable(false);
	confirmbutton.setMinimumSize(new Dimension(130,30));
    confirmbutton.setPreferredSize(new Dimension(130,30));
    confirmbutton.setMaximumSize(new Dimension(130,30));
	confirmbutton.setBackground(new Color(121, 181, 79));
	
		confirmbutton.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
		confirmbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				MouseClickSound ms1=new MouseClickSound();
		ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		timeraw t=new timeraw();
String PRP_TIME=t.intime();	
rawip rp = new rawip();
String PRP_IP=rp.localhostaddress()+"\n"+rp.publicipaddress();
			
			NEW_PASSWORD= pass1field.getText();
try{	
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();

     try{		

		String updatequery="UPDATE `seller_signup_user_details` SET `PASSWORD`='"+NEW_PASSWORD+"' WHERE BINARY EMAIL  ='"+ RESET_EMAIL+"' ;";
		
		statement.executeUpdate(updatequery);
	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	
				
		     try{		



		String insertquery="INSERT INTO `SELLER_PRP_DETAILS` (`USER_NAME`, `EMAIL`, `OLD_PASSWORD`, `NEW_PASSWORD`, `PRP_TIME`, `PRP_IP`, `RAW_POST`) VALUES ('"+RESET_USER_NAME+"', '"+RESET_EMAIL+"', '"+RESET_OLD_PASSWORD+"', '"+NEW_PASSWORD+"', '"+PRP_TIME+"', '"+PRP_IP+"', '"+RESET_RAW_POST+"');";
		
		statement.executeUpdate(insertquery);
	
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
		
		
		
		
		
		
		forgotdialog.setVisible(false);

		
		}
		
		});	
	
	firstpan.add(Box.createRigidArea(new Dimension(0, 40)));	
	firstpan.add(fstlabel);
	firstpan.add(Box.createRigidArea(new Dimension(0, 15)));	
	firstpan.add(msglabel);	
	firstpan.add(Box.createRigidArea(new Dimension(0, 15)));	
	firstpan.add(sndlabel);	
	firstpan.add(Box.createRigidArea(new Dimension(0, 5)));	
	firstpan.add(thdlabel);
	
	passpan11.add(pass1field);
	passpan11.add(hidebutton1);
	
	secondpan.add(Box.createRigidArea(new Dimension(0, 15)));	
	secondpan.add(pass1label);	
	secondpan.add(Box.createRigidArea(new Dimension(0, 10)));	
	secondpan.add(passpan11);
	
	passpan12.add(pass2field);
	passpan12.add(hidebutton2);
	
	thirdpan.add(Box.createRigidArea(new Dimension(0, 20)));	
	thirdpan.add(pass2label);	
	thirdpan.add(Box.createRigidArea(new Dimension(0, 10)));	
	thirdpan.add(passpan12);
	
	forthpan.add(Box.createRigidArea(new Dimension(0, 40)));	
	forthpan.add(confirmbutton);
	
	passborderpan.add(firstpan);
	passborderpan.add(Box.createRigidArea(new Dimension(0, 10)));		
	passborderpan.add(secondpan);	
	passborderpan.add(thirdpan);
	passborderpan.add(forthpan);
	
	
	passmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
	passmainpan.add(passlabel);	
    passmainpan.add(Box.createRigidArea(new Dimension(0, 30)));
    passmainpan.add(passborderpan);
	
	
	
	return passmainpan;

}


public void paslimit()
{
	if(passw1 && passw2)
	{
		confirmbutton.setEnabled(true);
	}
	
}

	
	
	
}