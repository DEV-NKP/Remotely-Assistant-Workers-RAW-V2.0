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
import javax.accessibility.*;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import com.mysql.jdbc.Connection;
import static javafx.scene.paint.Color.web;

public class buyerportal 
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
	
	String EMAIL="";
	String USER_NAME="";
	String RAW_POST="";
	String COUNTRY="";
	String SIGN_UP_TIME="";
	String SIGN_UP_YEAR="";
	String SIGN_UP_MONTH="";
	String STATUS_MESSAGE="";
	String CURRENT_RATING="";
	String TOTAL_RATED_BY="";
	String FIRST_NAME="";
	String LAST_NAME="";
	String STATUS="";
	
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

	public buyerportal()
	{
		
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	
	}
	
		public buyerportal(JFrame frame, String email, String pass)
	{
		this.USER_EMAIL=email;
		this.USER_PASSWORD=pass;
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
		
	}
	
	public buyerportal(String email, String pass)
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
    
  // mainframe.add(buyerportalpage(mainframe));
	
mainframe.setLayout(new BorderLayout());

mainframe.getContentPane().add(buyerportalpage(mainframe), BorderLayout.CENTER);
	// mainframe.getContentPane().add(buyerportaltranspage(mainframe), BorderLayout.CENTER);
 mainframe.setVisible(true);
 mainframe.setMinimumSize(new Dimension(((screensize.width/2)+320)+230, ((screensize.height/2)+220)+90));  //never ever try to delete this
 mainframe.setMinimumSize(new Dimension(1340,760));
	}



private static Color awtColor(javafx.scene.paint.Color fxColor) {
    return new Color(
        (float) fxColor.getRed(),
        (float) fxColor.getGreen(),
        (float) fxColor.getBlue(),
        (float) fxColor.getOpacity());
}

	
public JLayeredPane buyerportalpage(JFrame frame)
{
	
	
try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		
		try{
		String searchquery="SELECT * FROM `buyer_signup_user_details` WHERE BINARY EMAIL  ='"+ USER_EMAIL+"'  AND BINARY PASSWORD='"+  USER_PASSWORD+"'";

		
ResultSet result=statement.executeQuery(searchquery);
		if(result.next())
		{
this.USER_NAME=result.getString("USER_NAME");
this.EMAIL=result.getString("EMAIL");

this.RAW_POST=result.getString("RAW_POST");
this.STATUS=result.getString("STATUS");
this.STATUS_MESSAGE=result.getString("STATUS_MESSAGE");
		}
		}
		catch(SQLException ae)
				{
					System.out.println(ae);
				}
				
			try{
		String searchquery="SELECT * FROM `buyer_signup_personal_details` WHERE BINARY EMAIL  ='"+ USER_EMAIL+"';";

		
ResultSet result=statement.executeQuery(searchquery);
if(result.next())
		{		
this.COUNTRY=result.getString("COUNTRY");
		}
		}
		catch(SQLException ae)
				{
					System.out.println(ae);
				}		
				
			try{
		String searchquery="SELECT * FROM `buyer_signup_account_details` WHERE BINARY EMAIL  ='"+ USER_EMAIL+"';";

		
ResultSet result=statement.executeQuery(searchquery);
if(result.next())
{		
this.SIGN_UP_TIME=result.getString("SIGN_UP_TIME");
}
		}
		catch(SQLException ae)
				{
					System.out.println(ae);
				}		
try{
		String searchquery="SELECT * FROM `buyer_signup_basic_details` WHERE BINARY EMAIL  ='"+ USER_EMAIL+"';";

		
ResultSet result=statement.executeQuery(searchquery);
if(result.next())
{		
this.FIRST_NAME=result.getString("FIRST_NAME");
this.LAST_NAME=result.getString("LAST_NAME");
}
		}
		catch(SQLException ae)
				{
					System.out.println(ae);
				}			
		
	try{
		String searchquery="SELECT * FROM `buyer_total_rating` WHERE BINARY EMAIL  ='"+ USER_EMAIL+"';";

		
ResultSet result=statement.executeQuery(searchquery);
if(result.next())
{		
this.CURRENT_RATING=result.getString("CURRENT_RATING");
this.TOTAL_RATED_BY=result.getString("TOTAL_RATED_BY");
}
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
	
screensize = Toolkit.getDefaultToolkit().getScreenSize();



String[] splitsigntime = SIGN_UP_TIME.split(",");
String[] splitsigntime1 = splitsigntime[0].split("/");

SIGN_UP_YEAR=splitsigntime1[2];

 if(splitsigntime1[1].equals("01") || splitsigntime1[1].equals("1"))
	 {
		SIGN_UP_MONTH="January";
	 }
	  if(splitsigntime1[1].equals("02") || splitsigntime1[1].equals("2"))
	 {
		SIGN_UP_MONTH="February";
	 }
	  if(splitsigntime1[1].equals("03") || splitsigntime1[1].equals("3"))
	 {
		SIGN_UP_MONTH="March";
	 }
	  if(splitsigntime1[1].equals("04") || splitsigntime1[1].equals("4"))
	 {
		SIGN_UP_MONTH="April";
	 }
	  if(splitsigntime1[1].equals("05") || splitsigntime1[1].equals("5"))
	 {
		SIGN_UP_MONTH="May";
	 }
	  if(splitsigntime1[1].equals("06") || splitsigntime1[1].equals("6"))
	 {
		SIGN_UP_MONTH="June";
	 }
	  if(splitsigntime1[1].equals("07") || splitsigntime1[1].equals("7"))
	 {
		SIGN_UP_MONTH="July";
	 }
	  if(splitsigntime1[1].equals("08") || splitsigntime1[1].equals("8"))
	 {
		SIGN_UP_MONTH="August";
	 }
	  if(splitsigntime1[1].equals("09") || splitsigntime1[1].equals("9"))
	 {
		SIGN_UP_MONTH="September";
	 }
	  if(splitsigntime1[1].equals("10"))
	 {
		SIGN_UP_MONTH="October";
	 }
	  if(splitsigntime1[1].equals("11"))
	 {
		SIGN_UP_MONTH="November";
	 }
	  if(splitsigntime1[1].equals("12"))
	 {
		SIGN_UP_MONTH="December";
	 }


if(STATUS_MESSAGE.equals("N/A"))
{
	STATUS_MESSAGE="You have not set any Status Message.";
}



    JLayeredPane layeredpan = new JLayeredPane();
    layeredpan.setSize((frame.getWidth()), (frame.getHeight()));
	layeredpan.setBackground(Color.decode("#000000"));
   layeredpan.setLayout(new OverlayLayout(layeredpan));////////////////row<COL<X GAP<Y GAP
	layeredpan.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	layeredpan.setOpaque(false);
	 
////////////////////////////////////////   TRANSPARENT MAIN PANEL   /////////////////////////////////

    JPanel mainpanel1 = new JPanel();
  mainpanel1.setMinimumSize(new Dimension(500, 300));
  mainpanel1.setMaximumSize(new Dimension(1550, 800));
	mainpanel1.setBackground(new Color(245,245,245,150));
    mainpanel1.setLayout(new BoxLayout(mainpanel1, BoxLayout.Y_AXIS));////////////////row<COL<X GAP<Y GAP
	//mainpanel1.setLayout(new OverlayLayout(mainpanel1));////////////////row<COL<X GAP<Y GAP
	//mainpanel1.setBorder(new EmptyBorder(50,100,50,100));////////////////top<Left<bottom<right
	mainpanel1.setAlignmentY(Component.CENTER_ALIGNMENT);

	//mainpanel1.setOpaque(false);

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
	
	 JLabel messagelabel1 = new JLabel("For some unavoidable circumstances this section is under construction. We will get back soon!");
	messagelabel1.setFont(new Font("Arial",Font.BOLD,22));
	messagelabel1.setForeground(Color.decode("000000"));
	messagelabel1.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	messagelabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	messagelabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	messagelabel1.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	messagelabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	messagelabel1.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	
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
			
			
			loginmenu lm12 = new loginmenu(mainframe);
			mainframe.setJMenuBar(lm12.loginmenubar(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(lm12.loginmenupage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	JPanel mainpanel = new JPanel();
    mainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	mainpanel.setBackground(Color.decode("#000000"));
    mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	mainpanel.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	mainpanel.setOpaque(false);
	
	/////////////////////////////////////////////LEFT SIDE///////////////////////////////////////////////
	
	
	
	JPanel menupanel = new JPanel();
	menupanel.setBackground(new Color(128,128,128));//new Color(75, 162, 233)
	menupanel.setLayout(new BoxLayout(menupanel, BoxLayout.Y_AXIS));
	menupanel.setBorder(new EmptyBorder(1,1,1,1));
	menupanel.setMinimumSize(new Dimension(350,mainpanel.getHeight()));
	menupanel.setPreferredSize(new Dimension(350,mainpanel.getHeight()));
	menupanel.setMaximumSize(new Dimension(450,screensize.height));
	menupanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	/*ImageIcon imgx0 = new ImageIcon("Resources/Gifs/Buyer_Signup/Menu_gif.gif");  //248*248
	JLabel menugif = new JLabel("",imgx0,JLabel.CENTER);
	menugif.setSize(imgx0.getIconWidth(),imgx0.getIconHeight());
	menugif.setAlignmentX(Component.CENTER_ALIGNMENT);
	menugif.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	menugif.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	menugif.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	menugif.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	menugif.setAlignmentX(Component.CENTER_ALIGNMENT);
	menugif.setAlignmentY(Component.CENTER_ALIGNMENT);*/
	JPanel profilepicpan = new JPanel();
	profilepicpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	profilepicpan.setLayout(new BoxLayout(profilepicpan, BoxLayout.Y_AXIS));
	profilepicpan.setBorder(new EmptyBorder(1,1,1,1));
	profilepicpan.setMinimumSize(new Dimension(200,150));
	profilepicpan.setPreferredSize(new Dimension(200,150));
	profilepicpan.setMaximumSize(new Dimension(250,200));
	profilepicpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	


    ImageIcon profile = new ImageIcon("Resources/Images/Portal/profile.png"); //220*200
	JLabel profilepic = new JLabel(profile);
	profilepic.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	profilepic.setLayout(new BoxLayout(profilepic, BoxLayout.Y_AXIS));
	profilepic.setBorder(new EmptyBorder(1,1,1,1));
	profilepic.setMinimumSize(new Dimension(200,150));
	profilepic.setPreferredSize(new Dimension(200,150));
	profilepic.setMaximumSize(new Dimension(250,170));
	profilepic.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel namepan = new JPanel();
	namepan.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	namepan.setLayout(new BoxLayout(namepan, BoxLayout.Y_AXIS));
	namepan.setBorder(new EmptyBorder(5,1,1,1));
	namepan.setMinimumSize(new Dimension(200,30));
	namepan.setPreferredSize(new Dimension(200,30));
	namepan.setMaximumSize(new Dimension(250,40));
	namepan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel namelabel = new JLabel(USER_NAME);
	namelabel.setFont(new Font("Arial",Font.BOLD,20));
	namelabel.setForeground(Color.decode("#FFFFFF"));
	namelabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	namelabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	namelabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	namelabel.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	namelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	namelabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	JPanel postpan = new JPanel();
	postpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	postpan.setLayout(new BoxLayout(postpan, BoxLayout.Y_AXIS));
	postpan.setBorder(new EmptyBorder(1,1,1,1));
	postpan.setMinimumSize(new Dimension(200,20));
	postpan.setPreferredSize(new Dimension(200,20));
	postpan.setMaximumSize(new Dimension(250,30));
	postpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel postlabel = new JLabel(RAW_POST);
	postlabel.setFont(new Font("Arial",Font.BOLD,16));
	postlabel.setForeground(Color.decode("#FFFFFF"));
	postlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	postlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	postlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	postlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	postlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel linepan = new JPanel();
	linepan.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	linepan.setLayout(new BoxLayout(linepan, BoxLayout.Y_AXIS));
	linepan.setBorder(new EmptyBorder(1,1,1,1));
	linepan.setMinimumSize(new Dimension(200,2));
	linepan.setPreferredSize(new Dimension(200,2));
	linepan.setMaximumSize(new Dimension(250,2));
	linepan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel locationpan = new JPanel();
	locationpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	locationpan.setLayout(new BoxLayout(locationpan, BoxLayout.Y_AXIS));
	locationpan.setBorder(new EmptyBorder(1,1,1,1));
	locationpan.setMinimumSize(new Dimension(200,50));
	locationpan.setPreferredSize(new Dimension(200,50));
	locationpan.setMaximumSize(new Dimension(250,60));
	locationpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel locationlabel = new JLabel("From: "+COUNTRY);
	locationlabel.setFont(new Font("Arial",Font.BOLD,18));
	locationlabel.setForeground(Color.decode("#FFFFFF"));
	locationlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	locationlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	locationlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	locationlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	locationlabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	
	JLabel locationlabel1 = new JLabel("Member Since: "+SIGN_UP_MONTH+", "+SIGN_UP_YEAR);
	locationlabel1.setFont(new Font("Arial",Font.BOLD,15));
	locationlabel1.setForeground(Color.decode("#FFFFFF"));
	locationlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	locationlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	locationlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	locationlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	locationlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel biopan = new JPanel();
	biopan.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	biopan.setLayout(new BoxLayout(biopan, BoxLayout.X_AXIS));
	biopan.setBorder(new EmptyBorder(2,2,2,2));
	biopan.setMinimumSize(new Dimension(200,80));
	biopan.setPreferredSize(new Dimension(200,80));
	biopan.setMaximumSize(new Dimension(250,100));
	biopan.setAlignmentY(Component.TOP_ALIGNMENT);
	//biopan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel biolabel = new JLabel("<html>"+STATUS_MESSAGE+"</html>");
	biolabel.setFont(new Font("Arial",Font.BOLD,15));
	biolabel.setForeground(new Color(128,128,128));
	biolabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	biolabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	biolabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	biolabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	biolabel.setAlignmentY(Component.TOP_ALIGNMENT);
	biolabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel ratingpan = new JPanel();
	ratingpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	ratingpan.setLayout(new BoxLayout(ratingpan, BoxLayout.X_AXIS));
	ratingpan.setBorder(new EmptyBorder(1,1,1,1));
	ratingpan.setMinimumSize(new Dimension(200,30));
	ratingpan.setPreferredSize(new Dimension(200,30));
	ratingpan.setMaximumSize(new Dimension(250,40));
	ratingpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	Border ratiobttnborder = new LineBorder(Color.RED, 1);
	RoundedCornerButton ratiobutton = new RoundedCornerButton("<html> Ratings: "+CURRENT_RATING+" OUT OF "+TOTAL_RATED_BY+" </html>");
	ratiobutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	ratiobutton.setBackground(Color.decode("#000000"));
	ratiobutton.setBorder(new EmptyBorder(0,20,0,0));
	ratiobutton.setForeground(Color.WHITE);
	ratiobutton.setCursor(handcursor);
	ratiobutton.setBorder(ratiobttnborder);
	ratiobutton.setOpaque(false);
	ratiobutton.setEnabled(false);
    ratiobutton.setContentAreaFilled(false);
    ratiobutton.setBorderPainted(true);
	ratiobutton.setAlignmentX(Component.RIGHT_ALIGNMENT);
	ratiobutton.setFocusable(false);
	
	
	JPanel viewbuttonpan = new JPanel();
	viewbuttonpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	viewbuttonpan.setLayout(new BoxLayout(viewbuttonpan, BoxLayout.X_AXIS));
	viewbuttonpan.setBorder(new EmptyBorder(1,1,1,1));
	viewbuttonpan.setMinimumSize(new Dimension(150,30));
	viewbuttonpan.setPreferredSize(new Dimension(150,30));
	viewbuttonpan.setMaximumSize(new Dimension(200,40));
	viewbuttonpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	Border viewbttnborder = new LineBorder(Color.RED, 1);
	RoundedCornerButton viewbtton = new RoundedCornerButton("     View Profile     ");
	viewbtton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	viewbtton.setBackground(Color.decode("#000000"));
	viewbtton.setBorder(new EmptyBorder(0,20,0,0));
	viewbtton.setForeground(Color.WHITE);
	viewbtton.setCursor(handcursor);
	viewbtton.setBorder(viewbttnborder);
	viewbtton.setOpaque(false);
	viewbtton.setEnabled(false);
    viewbtton.setContentAreaFilled(false);
    viewbtton.setBorderPainted(true);
	viewbtton.setAlignmentX(Component.CENTER_ALIGNMENT);
	viewbtton.setFocusable(false);
	
	
	
	JPanel editbuttonpan = new JPanel();
	editbuttonpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	editbuttonpan.setLayout(new BoxLayout(editbuttonpan, BoxLayout.X_AXIS));
	editbuttonpan.setBorder(new EmptyBorder(1,1,1,1));
	editbuttonpan.setMinimumSize(new Dimension(150,30));
	editbuttonpan.setPreferredSize(new Dimension(150,30));
	editbuttonpan.setMaximumSize(new Dimension(200,40));
	editbuttonpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	Border editbttnborder = new LineBorder(Color.RED, 1);
	RoundedCornerButton editbutton = new RoundedCornerButton("     Edit Profile     ");
	editbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	editbutton.setBorder(new EmptyBorder(0,20,0,0));

	editbutton.setBackground(Color.decode("#000000"));
	editbutton.setForeground(Color.WHITE);
	editbutton.setCursor(handcursor);
	editbutton.setBorder(editbttnborder);
	editbutton.setOpaque(false);
	editbutton.setEnabled(false);
    editbutton.setContentAreaFilled(false);
    editbutton.setBorderPainted(true);
	editbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	editbutton.setFocusable(false);
	
	
	/*

	
	JPanel linkpan = new JPanel();
	linkpan.setBackground(new Color(128, 128, 128));//new Color(75, 162, 233)
	linkpan.setLayout(new BoxLayout(linkpan, BoxLayout.X_AXIS));
	linkpan.setBorder(new EmptyBorder(1,1,1,1));
	linkpan.setMinimumSize(new Dimension(200,40));
	linkpan.setPreferredSize(new Dimension(200,40));
	linkpan.setMaximumSize(new Dimension(250,50));
	linkpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	Border linkborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerButton linkbttn = new RoundedCornerButton(" FB ");
	linkbttn.setFont(new Font("Comic Sans",Font.PLAIN,18));
	linkbttn.setBackground(Color.decode("#000000"));
	linkbttn.setForeground(Color.WHITE);
	linkbttn.setBorder(new EmptyBorder(0,20,0,0));
	linkbttn.setCursor(handcursor);
	linkbttn.setBorder(linkborder);
	linkbttn.setOpaque(false);
	linkbttn.setEnabled(true);
    linkbttn.setContentAreaFilled(false);
    linkbttn.setBorderPainted(true);
	linkbttn.setMinimumSize(new Dimension(40,30));
	linkbttn.setPreferredSize(new Dimension(40,30));
	linkbttn.setMaximumSize(new Dimension(40,30));
	linkbttn.setAlignmentX(Component.CENTER_ALIGNMENT);
	linkbttn.setFocusable(false);
	linkbttn.setFocusable(false);
	
	RoundedCornerButton linkbttn1 = new RoundedCornerButton(" LN ");
	linkbttn1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	linkbttn1.setBackground(Color.decode("#000000"));
	linkbttn1.setForeground(Color.WHITE);
	linkbttn1.setBorder(new EmptyBorder(0,20,0,0));
	linkbttn1.setCursor(handcursor);
	linkbttn1.setBorder(linkborder);
	linkbttn1.setOpaque(false);
	linkbttn1.setEnabled(true);
    linkbttn1.setContentAreaFilled(false);
    linkbttn1.setBorderPainted(true);
	linkbttn1.setMinimumSize(new Dimension(40,30));
	linkbttn1.setPreferredSize(new Dimension(40,30));
	linkbttn1.setMaximumSize(new Dimension(40,30));
	linkbttn1.setAlignmentX(Component.CENTER_ALIGNMENT);
	linkbttn1.setFocusable(false);
	
	RoundedCornerButton linkbttn2 = new RoundedCornerButton(" IN ");
	linkbttn2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	linkbttn2.setBackground(Color.decode("#000000"));
	linkbttn2.setForeground(Color.WHITE);
	linkbttn2.setBorder(new EmptyBorder(0,20,0,0));

	linkbttn2.setCursor(handcursor);
	linkbttn2.setBorder(linkborder);
	linkbttn2.setOpaque(false);
	linkbttn2.setEnabled(true);
    linkbttn2.setContentAreaFilled(false);
    linkbttn2.setBorderPainted(true);
	linkbttn2.setMinimumSize(new Dimension(40,30));
	linkbttn2.setPreferredSize(new Dimension(40,30));
	linkbttn2.setMaximumSize(new Dimension(40,30));
	linkbttn2.setAlignmentX(Component.CENTER_ALIGNMENT);
	linkbttn2.setFocusable(false);
	
	*/
	
	JPanel logoutpan = new JPanel();
	logoutpan.setBackground(new Color(128,128,128));//new Color(75, 162, 233)
	logoutpan.setLayout(new BoxLayout(logoutpan, BoxLayout.X_AXIS));
	logoutpan.setBorder(new EmptyBorder(1,1,1,1));
	/*logoutpan.setMinimumSize(new Dimension(150,30));
	logoutpan.setPreferredSize(new Dimension(150,30));
	logoutpan.setMaximumSize(new Dimension(200,40));*/
	logoutpan.setAlignmentX(Component.CENTER_ALIGNMENT);

	Border logoutbttnborder1 = new LineBorder(Color.RED, 1);
	RoundedCornerButton logoutbutton = new RoundedCornerButton("     Log Out     ");
	logoutbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//next1.setBackground(new Color(125,125,125));
	logoutbutton.setBackground(Color.decode("#000000"));
	
	logoutbutton.setForeground(Color.WHITE);
	logoutbutton.setCursor(handcursor);
	logoutbutton.setBorder(logoutbttnborder1);
	logoutbutton.setOpaque(false);
	logoutbutton.setEnabled(false);
    logoutbutton.setContentAreaFilled(false);
    logoutbutton.setBorderPainted(true);
	logoutbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
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
			
			
			loginmenu lm12 = new loginmenu(mainframe);
			mainframe.setJMenuBar(lm12.loginmenubar(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(lm12.loginmenupage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});
	
	
	/////////////////////////////////////////////RIGHT SIDE////////////////////////////////////////////////
Rectangle r = frame.getBounds();
int h = r.height;
int w = r.width;
	
	contentpan = new JPanel();
	contentpan.setBackground(new Color(0, 0, 0));//new Color(240, 240, 240)
	contentpan.setLayout(new BoxLayout(contentpan, BoxLayout.Y_AXIS));
	contentpan.setBorder(new EmptyBorder(0,0,0,0));
	contentpan.setAlignmentX(Component.RIGHT_ALIGNMENT);
	contentpan.setMinimumSize(new Dimension((w-365),mainpanel.getHeight()));
	contentpan.setPreferredSize(new Dimension((w-365),mainpanel.getHeight()));
	contentpan.setMaximumSize(new Dimension((w-465),screensize.height));
	
	
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

    JLabel labelmb = new JLabel("<html><font color=#008B8B>RAW <br> PORTAL</font></html>");
	CustomFont cf=new CustomFont();
	labelmb.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,20.0f));
	labelmb.setForeground(Color.decode("#00FFFF"));
	labelmb.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmb.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmb.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmb.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmb.setAlignmentX(Component.LEFT_ALIGNMENT);

    JLabel labelmb1 = new JLabel("<html><font color=#008B8B>Welcome "+ LAST_NAME+", "+FIRST_NAME +"</font></html>");
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
	settingsbut.setEnabled(false);	
	settingsbut.setFocusable(false);	
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
	//bodypan.setAlignmentX(Component.CENTER_ALIGNMENT);
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

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	Border submitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerButton contbutton = new RoundedCornerButton("     Basic Work     ");
	contbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//next1.setBackground(new Color(125,125,125));
	contbutton.setBackground(Color.decode("#dcdcdc"));
	contbutton.setForeground(new Color(125,125,125));
	contbutton.setForeground(Color.WHITE);
	contbutton.setCursor(handcursor);
	contbutton.setBorder(submitbttnborder);
	contbutton.setOpaque(false);
	contbutton.setEnabled(false);
    contbutton.setContentAreaFilled(false);
    contbutton.setBorderPainted(true);
	contbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
	contbutton.setFocusable(false);
	
	contbutton.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});
	
	
	contbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		}		
		
	});
	
	RoundedCornerButton advbutton = new RoundedCornerButton("     Advanced Work     ");
	advbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//next1.setBackground(new Color(125,125,125));
	advbutton.setBackground(Color.decode("#dcdcdc"));
	advbutton.setForeground(new Color(125,125,125));
	advbutton.setForeground(Color.WHITE);
	advbutton.setCursor(handcursor);
	advbutton.setBorder(submitbttnborder);
	advbutton.setOpaque(false);
	advbutton.setEnabled(false);
    advbutton.setContentAreaFilled(false);
    advbutton.setBorderPainted(true);
	advbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
	advbutton.setFocusable(false);
	
	advbutton.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});
	
	
	advbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		}		
		
	});


////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	JPanel buyerlabelpanel = new JPanel();
	buyerlabelpanel.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	buyerlabelpanel.setLayout(new BoxLayout(buyerlabelpanel, BoxLayout.X_AXIS));
	buyerlabelpanel.setBorder(new EmptyBorder(10,10,10,10));
	buyerlabelpanel.setAlignmentY(Component.TOP_ALIGNMENT);
	buyerlabelpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

    JLabel buyerlabel1 = new JLabel("Buyer Options");
	buyerlabel1.setFont(new Font("Arial",Font.BOLD,20));
	buyerlabel1.setForeground(Color.decode("#00cc99"));
	buyerlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyerlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	buyerlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	buyerlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyerlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel rawoptionpanel = new JPanel();
	rawoptionpanel.setBackground(new Color(0, 0, 0));//new Color(75, 162, 233)
	rawoptionpanel.setLayout(new BoxLayout(rawoptionpanel, BoxLayout.X_AXIS));
	rawoptionpanel.setBorder(new EmptyBorder(10,10,10,10));
	rawoptionpanel.setAlignmentY(Component.TOP_ALIGNMENT);
	rawoptionpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

    JLabel rawoptionlabel1 = new JLabel("RAW Options");
	rawoptionlabel1.setFont(new Font("Arial",Font.BOLD,20));
	rawoptionlabel1.setForeground(Color.decode("#00cc99"));
	rawoptionlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	rawoptionlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	rawoptionlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	rawoptionlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	rawoptionlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);

/*

search - seller, buyer, job

/////
job- 
post a job
posted job
req job
////////

//////////
accept works
assigned seller
/////////

////////
project show
////////////

//////////
rejected by saller
reject job
/////

messenger

mail

//////////////
Bank Account-
deposite
withdraw
transactions
//////////////

///////////////////
Gig-

///////////////

/////////////
Others tools
-
Newsfeed
calculator
notes
calendar

many more.......
///////////////

*/

/*
Help and support

contact with us

about us

report

feedback

*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	JPanel search = new JPanel();
	search.setLayout(null);
	search.setBackground(new Color(0,0,0));
	search.setLayout(new BoxLayout(search, BoxLayout.Y_AXIS));
	search.setBorder(new EmptyBorder(0,0,0,0));
	search.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel jobpanel = new JPanel();
	jobpanel.setLayout(null);
	jobpanel.setBackground(new Color(0,0,0));
	jobpanel.setLayout(new BoxLayout(jobpanel, BoxLayout.Y_AXIS));
	jobpanel.setBorder(new EmptyBorder(0,0,0,0));
	jobpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel workdonepanel = new JPanel();
	workdonepanel.setLayout(null);
	workdonepanel.setBackground(new Color(0,0,0));
	workdonepanel.setLayout(new BoxLayout(workdonepanel, BoxLayout.Y_AXIS));
	workdonepanel.setBorder(new EmptyBorder(0,0,0,0));
	workdonepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel showpanel = new JPanel();
	showpanel.setLayout(null);
	showpanel.setBackground(new Color(0,0,0));
	showpanel.setLayout(new BoxLayout(showpanel, BoxLayout.Y_AXIS));
	showpanel.setBorder(new EmptyBorder(0,0,0,0));
	showpanel.setAlignmentX(Component.CENTER_ALIGNMENT);	
    
	JPanel rejection = new JPanel();
	rejection.setLayout(null);
	rejection.setBackground(new Color(0,0,0));
	rejection.setLayout(new BoxLayout(rejection, BoxLayout.Y_AXIS));
	rejection.setBorder(new EmptyBorder(0,0,0,0));
	rejection.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JPanel messengerpanel = new JPanel();
	messengerpanel.setLayout(null);
	messengerpanel.setBackground(new Color(0,0,0));
	messengerpanel.setLayout(new BoxLayout(messengerpanel, BoxLayout.Y_AXIS));
	messengerpanel.setBorder(new EmptyBorder(0,0,0,0));
	messengerpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mailpanel = new JPanel();
	mailpanel.setLayout(null);
	mailpanel.setBackground(new Color(0,0,0));
	mailpanel.setLayout(new BoxLayout(mailpanel, BoxLayout.Y_AXIS));
	mailpanel.setBorder(new EmptyBorder(0,0,0,0));
	mailpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel accountpanel = new JPanel();
	accountpanel.setLayout(null);
	accountpanel.setBackground(new Color(0,0,0));
	accountpanel.setLayout(new BoxLayout(accountpanel, BoxLayout.Y_AXIS));
	accountpanel.setBorder(new EmptyBorder(0,0,0,0));
	accountpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel gigpanel = new JPanel();
	gigpanel.setLayout(null);
	gigpanel.setBackground(new Color(0,0,0));
	gigpanel.setLayout(new BoxLayout(gigpanel, BoxLayout.Y_AXIS));
	gigpanel.setBorder(new EmptyBorder(0,0,0,0));
	gigpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    
	JPanel othertoolspanel = new JPanel();
	othertoolspanel.setLayout(null);
	othertoolspanel.setBackground(new Color(0,0,0));
	othertoolspanel.setLayout(new BoxLayout(othertoolspanel, BoxLayout.Y_AXIS));
	othertoolspanel.setBorder(new EmptyBorder(0,0,0,0));
	othertoolspanel.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	JPanel helppanel = new JPanel();
	helppanel.setLayout(null);
	helppanel.setBackground(new Color(0,0,0));
	helppanel.setLayout(new BoxLayout(helppanel, BoxLayout.Y_AXIS));
	helppanel.setBorder(new EmptyBorder(0,0,0,0));
	helppanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel contactpanel = new JPanel();
	contactpanel.setLayout(null);
	contactpanel.setBackground(new Color(0,0,0));
	contactpanel.setLayout(new BoxLayout(contactpanel, BoxLayout.Y_AXIS));
	contactpanel.setBorder(new EmptyBorder(0,0,0,0));
	contactpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel aboutpanel = new JPanel();
	aboutpanel.setLayout(null);
	aboutpanel.setBackground(new Color(0,0,0));
	aboutpanel.setLayout(new BoxLayout(aboutpanel, BoxLayout.Y_AXIS));
	aboutpanel.setBorder(new EmptyBorder(0,0,0,0));
	aboutpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel reportpanel = new JPanel();
	reportpanel.setLayout(null);
	reportpanel.setBackground(new Color(0,0,0));
	reportpanel.setLayout(new BoxLayout(reportpanel, BoxLayout.Y_AXIS));
	reportpanel.setBorder(new EmptyBorder(0,0,0,0));
	reportpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
    
	JPanel feedbackpanel = new JPanel();
	feedbackpanel.setLayout(null);
	feedbackpanel.setBackground(new Color(0,0,0));
	feedbackpanel.setLayout(new BoxLayout(feedbackpanel, BoxLayout.Y_AXIS));
	feedbackpanel.setBorder(new EmptyBorder(0,0,0,0));
	feedbackpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	JLabel searchbuttonlabel1 = new JLabel("Search");
	searchbuttonlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	searchbuttonlabel1.setForeground(Color.decode("#00FFFF"));
	searchbuttonlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	searchbuttonlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	searchbuttonlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	searchbuttonlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	searchbuttonlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel jobbuttonlabel1 = new JLabel("Job Post");
	jobbuttonlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	jobbuttonlabel1.setForeground(Color.decode("#00FFFF"));
	jobbuttonlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	jobbuttonlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	jobbuttonlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	jobbuttonlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	jobbuttonlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);	
	
	JLabel workbuttonlabel1 = new JLabel("Working Details");
	workbuttonlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	workbuttonlabel1.setForeground(Color.decode("#00FFFF"));
	workbuttonlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	workbuttonlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	workbuttonlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	workbuttonlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	workbuttonlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel showjoblabel1 = new JLabel("Past Projects");
	showjoblabel1.setFont(new Font("Calibri",Font.BOLD,16));
	showjoblabel1.setForeground(Color.decode("#00FFFF"));
	showjoblabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	showjoblabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	showjoblabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	showjoblabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	showjoblabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel rejectionlabel1 = new JLabel("Reject work/worker");
	rejectionlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	rejectionlabel1.setForeground(Color.decode("#00FFFF"));
	rejectionlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	rejectionlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	rejectionlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	rejectionlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	rejectionlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel messengerlabel1 = new JLabel("Messege");
	messengerlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	messengerlabel1.setForeground(Color.decode("#00FFFF"));
	messengerlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	messengerlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	messengerlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	messengerlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	messengerlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel maillabel1 = new JLabel("Mailbox");
	maillabel1.setFont(new Font("Calibri",Font.BOLD,16));
	maillabel1.setForeground(Color.decode("#00FFFF"));
	maillabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	maillabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	maillabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	maillabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	maillabel1.setAlignmentX(Component.CENTER_ALIGNMENT);	
	
	JLabel accountdetailslabel1 = new JLabel("Account Details");
	accountdetailslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	accountdetailslabel1.setForeground(Color.decode("#00FFFF"));
	accountdetailslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accountdetailslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accountdetailslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accountdetailslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accountdetailslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel giglabel = new JLabel("Gig");
	giglabel.setFont(new Font("Calibri",Font.BOLD,16));
	giglabel.setForeground(Color.decode("#00FFFF"));
	giglabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	giglabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	giglabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	giglabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	giglabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel othertoolslabel1 = new JLabel("Other tools");
	othertoolslabel1.setFont(new Font("Calibri",Font.BOLD,16));
	othertoolslabel1.setForeground(Color.decode("#00FFFF"));
	othertoolslabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	othertoolslabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	othertoolslabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	othertoolslabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	othertoolslabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	JLabel helplabel1 = new JLabel("Help and Support");
	helplabel1.setFont(new Font("Calibri",Font.BOLD,16));
	helplabel1.setForeground(Color.decode("#00FFFF"));
	helplabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	helplabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	helplabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	helplabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	helplabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel contactlabel1 = new JLabel("Contact With Us");
	contactlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	contactlabel1.setForeground(Color.decode("#00FFFF"));
	contactlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	contactlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	contactlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	contactlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	contactlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);	
	
	JLabel aboutlabel1 = new JLabel("About Us");
	aboutlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	aboutlabel1.setForeground(Color.decode("#00FFFF"));
	aboutlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	aboutlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	aboutlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	aboutlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	aboutlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel reportlabel1 = new JLabel("Report to Admin");
	reportlabel1.setFont(new Font("Calibri",Font.BOLD,16));
	reportlabel1.setForeground(Color.decode("#00FFFF"));
	reportlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	reportlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	reportlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	reportlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	reportlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JLabel feedbacklabel1 = new JLabel("Feedback");
	feedbacklabel1.setFont(new Font("Calibri",Font.BOLD,16));
	feedbacklabel1.setForeground(Color.decode("#00FFFF"));
	feedbacklabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	feedbacklabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	feedbacklabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	feedbacklabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	feedbacklabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	ImageIcon imgmlogin1 = new ImageIcon("Resources/Images/Portal/b1.png"); //220*200
	JButton buttons1 = new JButton("",imgmlogin1);
	buttons1.setBackground(Color.decode("#008B8B"));
	buttons1.setBorder(BorderFactory.createEtchedBorder(0));
	buttons1.setOpaque(false);
    buttons1.setContentAreaFilled(false);
    buttons1.setBorderPainted(false);
	buttons1.setCursor(handcursor);
	buttons1.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons1.setEnabled(false);
	buttons1.setFocusable(false);
	buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			search.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			search.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons1.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			search.setBorder(new EmptyBorder(5,5,5,5));
			search.repaint();
		
		
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


	ImageIcon imgmlogin2 = new ImageIcon("Resources/Images/Portal/b2.png"); //220*200
JButton buttons2 = new JButton("",imgmlogin2);
	buttons2.setBackground(Color.decode("#008B8B"));
	buttons2.setBorder(BorderFactory.createEtchedBorder(0));
	buttons2.setOpaque(false);
    buttons2.setContentAreaFilled(false);
    buttons2.setBorderPainted(false);
	buttons2.setCursor(handcursor);
	buttons2.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons2.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons2.setEnabled(false);
	buttons2.setFocusable(false);
	buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			jobpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			jobpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons2.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			jobpanel.setBorder(new EmptyBorder(5,5,5,5));
			jobpanel.repaint();
		
		
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



	ImageIcon imgmlogin3 = new ImageIcon("Resources/Images/Portal/b3.png"); //220*200
	JButton buttons3 = new JButton("",imgmlogin3);
	buttons3.setBackground(Color.decode("#008B8B"));
	buttons3.setBorder(BorderFactory.createEtchedBorder(0));
	buttons3.setOpaque(false);
    buttons3.setContentAreaFilled(false);
    buttons3.setBorderPainted(false);
	buttons3.setCursor(handcursor);
	buttons3.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons3.setEnabled(false);
	buttons3.setFocusable(false);
	buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			workdonepanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			workdonepanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons3.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			workdonepanel.setBorder(new EmptyBorder(5,5,5,5));
			workdonepanel.repaint();
		
		
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

	ImageIcon imgmlogin4 = new ImageIcon("Resources/Images/Portal/b4.png"); //220*200
	JButton buttons4 = new JButton("",imgmlogin4);
	buttons4.setBackground(Color.decode("#008B8B"));
	buttons4.setBorder(BorderFactory.createEtchedBorder(0));
	buttons4.setOpaque(false);
    buttons4.setContentAreaFilled(false);
    buttons4.setBorderPainted(false);
	buttons4.setCursor(handcursor);
	buttons4.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons4.setEnabled(false);
	buttons4.setFocusable(false);
	buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			showpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			showpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons4.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			showpanel.setBorder(new EmptyBorder(5,5,5,5));
			showpanel.repaint();
		
		
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


	ImageIcon imgmlogin5 = new ImageIcon("Resources/Images/Portal/b5.png"); //220*200
	JButton buttons5 = new JButton("",imgmlogin5);
	buttons5.setBackground(Color.decode("#008B8B"));
	buttons5.setBorder(BorderFactory.createEtchedBorder(0));
	buttons5.setOpaque(false);
    buttons5.setContentAreaFilled(false);
    buttons5.setBorderPainted(false);
	buttons5.setCursor(handcursor);
	buttons5.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons5.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons5.setEnabled(false);
	buttons5.setFocusable(false);
	buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			rejection.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			rejection.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons5.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			rejection.setBorder(new EmptyBorder(5,5,5,5));
			rejection.repaint();
		
		
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

	ImageIcon imgmlogin6 = new ImageIcon("Resources/Images/Portal/b6.png"); //220*200
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
			messengerpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			messengerpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons6.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			messengerpanel.setBorder(new EmptyBorder(5,5,5,5));
			messengerpanel.repaint();
		
		
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



	ImageIcon imgmlogin7 = new ImageIcon("Resources/Images/Portal/b7.png"); //220*200
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
			mailpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			mailpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons7.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			mailpanel.setBorder(new EmptyBorder(5,5,5,5));
			mailpanel.repaint();
		
		
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



	ImageIcon imgmlogin8 = new ImageIcon("Resources/Images/Portal/b8.png"); //220*200
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
			accountpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			accountpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons8.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			accountpanel.setBorder(new EmptyBorder(5,5,5,5));
			accountpanel.repaint();
		
		
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

	ImageIcon imgmlogin9 = new ImageIcon("Resources/Images/Portal/b9.png"); //220*200
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
			gigpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			gigpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons9.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			gigpanel.setBorder(new EmptyBorder(5,5,5,5));
			gigpanel.repaint();
		
		
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

	ImageIcon imgmlogin10 = new ImageIcon("Resources/Images/Portal/b10.png"); //220*200
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
			othertoolspanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			othertoolspanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons10.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			othertoolspanel.setBorder(new EmptyBorder(5,5,5,5));
			othertoolspanel.repaint();
		
		
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

	ImageIcon imgmlogin11 = new ImageIcon("Resources/Images/Portal/b11.png"); //220*200
    JButton buttons11 = new JButton("",imgmlogin11);
	buttons11.setBackground(Color.decode("#008B8B"));
	buttons11.setBorder(BorderFactory.createEtchedBorder(0));
	buttons11.setOpaque(false);
    buttons11.setContentAreaFilled(false);
    buttons11.setBorderPainted(false);
	buttons11.setCursor(handcursor);
	buttons11.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons11.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons11.setEnabled(false);
	buttons11.setFocusable(false);
	buttons11.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			helppanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			helppanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons11.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			helppanel.setBorder(new EmptyBorder(5,5,5,5));
			helppanel.repaint();
		
		
		}		
		
	});	

	buttons11.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});

	ImageIcon imgmlogin12 = new ImageIcon("Resources/Images/Portal/b12.png"); //220*200
    JButton buttons12 = new JButton("",imgmlogin12);
	buttons12.setBackground(Color.decode("#008B8B"));
	buttons12.setBorder(BorderFactory.createEtchedBorder(0));
	buttons12.setOpaque(false);
    buttons12.setContentAreaFilled(false);
    buttons12.setBorderPainted(false);
	buttons12.setCursor(handcursor);
	buttons12.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons12.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons12.setEnabled(false);
	buttons12.setFocusable(false);
	buttons12.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			contactpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			contactpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons12.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			contactpanel.setBorder(new EmptyBorder(5,5,5,5));
			contactpanel.repaint();
		
		
		}		
		
	});	

	buttons12.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});    
	
	ImageIcon imgmlogin13 = new ImageIcon("Resources/Images/Portal/b13.png"); //220*200
	JButton buttons13 = new JButton("",imgmlogin13);
	buttons13.setBackground(Color.decode("#008B8B"));
	buttons13.setBorder(BorderFactory.createEtchedBorder(0));
	buttons13.setOpaque(false);
    buttons13.setContentAreaFilled(false);
    buttons13.setBorderPainted(false);
	buttons13.setCursor(handcursor);
	buttons13.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons13.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons13.setEnabled(false);
	buttons13.setFocusable(false);
	buttons13.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			aboutpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			aboutpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons13.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			aboutpanel.setBorder(new EmptyBorder(5,5,5,5));
			aboutpanel.repaint();
		
		
		}		
		
	});	

	buttons13.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});
	
	ImageIcon imgmlogin14 = new ImageIcon("Resources/Images/Portal/b14.png"); //220*200
	JButton buttons14 = new JButton("",imgmlogin14);
	buttons14.setBackground(Color.decode("#008B8B"));
	buttons14.setBorder(BorderFactory.createEtchedBorder(0));
	buttons14.setOpaque(false);
    buttons14.setContentAreaFilled(false);
    buttons14.setBorderPainted(false);
	buttons14.setCursor(handcursor);
	buttons14.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons14.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons14.setEnabled(false);
	buttons14.setFocusable(false);
	buttons14.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			reportpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			reportpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons14.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			reportpanel.setBorder(new EmptyBorder(5,5,5,5));
			reportpanel.repaint();
		
		
		}		
		
	});	

	buttons14.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});	
	
	ImageIcon imgmlogin15 = new ImageIcon("Resources/Images/Portal/b15.png"); //220*200
	JButton buttons15 = new JButton("",imgmlogin15);
	buttons15.setBackground(Color.decode("#008B8B"));
	buttons15.setBorder(BorderFactory.createEtchedBorder(0));
	buttons15.setOpaque(false);
    buttons15.setContentAreaFilled(false);
    buttons15.setBorderPainted(false);
	buttons15.setCursor(handcursor);
	buttons15.setMinimumSize(new java.awt.Dimension(220, 200));
	buttons15.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttons15.setEnabled(false);
	buttons15.setFocusable(false);
	buttons15.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
			feedbackpanel.setBorder(BorderFactory.createBevelBorder(1, Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432"), Color.decode("#99c432")));
			feedbackpanel.repaint();
		
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Mainmenu/mainmenu_mouse_enter.wav",menuvolume);	
		}		
		
	});	

	buttons15.addMouseListener(new MouseAdapter(){
	
		public void mouseExited(MouseEvent e)
		{	
	
			feedbackpanel.setBorder(new EmptyBorder(5,5,5,5));
			feedbackpanel.repaint();
		
		
		}		
		
	});	

	buttons15.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
				
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			
		}		
		
	});	
		
	

/////////////////////////////////////////////////////////////////////////////////////////////////////


/*
menupanel.add(menugif);
menupanel.add(Box.createRigidArea(new Dimension(0, 100)));*/

profilepicpan.add(Box.createRigidArea(new Dimension(0, 20)));
profilepicpan.add(profilepic);



menupanel.add(Box.createRigidArea(new Dimension(0, 20)));
menupanel.add(profilepicpan);

namepan.add(namelabel);

menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(namepan);

postpan.add(postlabel);

menupanel.add(Box.createRigidArea(new Dimension(0, 5)));
menupanel.add(postpan);

menupanel.add(Box.createRigidArea(new Dimension(0, 5)));
menupanel.add(linepan);

locationpan.add(locationlabel);
locationpan.add(locationlabel1);

menupanel.add(Box.createRigidArea(new Dimension(0, 5)));
menupanel.add(locationpan);

biopan.add(Box.createRigidArea(new Dimension(0,0)));
biopan.add(biolabel);

menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(biopan);

ratingpan.add(Box.createRigidArea(new Dimension(0,0)));
ratingpan.add(ratiobutton);

menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(ratingpan);

viewbuttonpan.add(Box.createRigidArea(new Dimension(30,0)));
viewbuttonpan.add(viewbtton);

menupanel.add(Box.createRigidArea(new Dimension(0, 30)));
menupanel.add(viewbuttonpan);

editbuttonpan.add(Box.createRigidArea(new Dimension(30,0)));
editbuttonpan.add(editbutton);

menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(editbuttonpan);

// linkpan.add(Box.createRigidArea(new Dimension(30,0)));
// linkpan.add(linkbttn);
// linkpan.add(Box.createRigidArea(new Dimension(30,0)));
// linkpan.add(linkbttn1);
// linkpan.add(Box.createRigidArea(new Dimension(30,0)));
// linkpan.add(linkbttn2);


// menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
// menupanel.add(linkpan);

logoutpan.add(logoutbutton);

menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(logoutpan);

/*
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(titlepan1);

headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(titlepan2);

headingpan.add(Box.createRigidArea(new Dimension(100, 0)));
headingpan.add(titlepanmid);
*/

headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(labelmbx);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(titlelinepan);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(labelmb);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(labelmb1);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(notificationbut);
headingpan.add(Box.createRigidArea(new Dimension(10, 0)));
headingpan.add(settingsbut);

//////////////////////////////////////////////////////////////////////////////////////////////////

buyerlabelpanel.add(buyerlabel1);

//////////////////////////////////////////////////////////////////////////////////////////////////

search.add(buttons1);
search.add(Box.createRigidArea(new Dimension(0, 5)));
search.add(searchbuttonlabel1);

jobpanel.add(buttons2);
jobpanel.add(Box.createRigidArea(new Dimension(0, 5)));
jobpanel.add(jobbuttonlabel1);

workdonepanel.add(buttons3);
workdonepanel.add(Box.createRigidArea(new Dimension(0, 5)));
workdonepanel.add(workbuttonlabel1);

showpanel.add(buttons4);
showpanel.add(Box.createRigidArea(new Dimension(0, 5)));
showpanel.add(showjoblabel1);

rejection.add(buttons5);
rejection.add(Box.createRigidArea(new Dimension(0, 5)));
rejection.add(rejectionlabel1);

messengerpanel.add(buttons6);
messengerpanel.add(Box.createRigidArea(new Dimension(0, 5)));
messengerpanel.add(messengerlabel1);

mailpanel.add(buttons7);
mailpanel.add(Box.createRigidArea(new Dimension(0, 5)));
mailpanel.add(maillabel1);

accountpanel.add(buttons8);
accountpanel.add(Box.createRigidArea(new Dimension(0, 5)));
accountpanel.add(accountdetailslabel1);

gigpanel.add(buttons9);
gigpanel.add(Box.createRigidArea(new Dimension(0, 5)));
gigpanel.add(giglabel);

othertoolspanel.add(buttons10);
othertoolspanel.add(Box.createRigidArea(new Dimension(0, 5)));
othertoolspanel.add(othertoolslabel1);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan1.add(search);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(jobpanel);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(workdonepanel);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(showpanel);
bodypan1.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan1.add(rejection);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan2.add(messengerpanel);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(mailpanel);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(accountpanel);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(gigpanel);
bodypan2.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan2.add(othertoolspanel);

//////////////////////////////////////////////////////////////////////////////////////////////////

rawoptionpanel.add(rawoptionlabel1);

//////////////////////////////////////////////////////////////////////////////////////////////////

helppanel.add(buttons11);
helppanel.add(Box.createRigidArea(new Dimension(0, 5)));
helppanel.add(helplabel1);

contactpanel.add(buttons12);
contactpanel.add(Box.createRigidArea(new Dimension(0, 5)));
contactpanel.add(contactlabel1);

aboutpanel.add(buttons13);
aboutpanel.add(Box.createRigidArea(new Dimension(0, 5)));
aboutpanel.add(aboutlabel1);

reportpanel.add(buttons14);
reportpanel.add(Box.createRigidArea(new Dimension(0, 5)));
reportpanel.add(reportlabel1);

feedbackpanel.add(buttons15);
feedbackpanel.add(Box.createRigidArea(new Dimension(0, 5)));
feedbackpanel.add(feedbacklabel1);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan3.add(helppanel);
bodypan3.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan3.add(contactpanel);
bodypan3.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan3.add(aboutpanel);
bodypan3.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan3.add(reportpanel);
bodypan3.add(Box.createRigidArea(new Dimension(40, 0)));

bodypan3.add(feedbackpanel);

//////////////////////////////////////////////////////////////////////////////////////////////////

endpan.add(contbutton);
endpan.add(Box.createRigidArea(new Dimension(600, 0)));
endpan.add(advbutton);

//////////////////////////////////////////////////////////////////////////////////////////////////

bodypan.add(Box.createRigidArea(new Dimension(0, 10)));
bodypan.add(bodypan1);
bodypan.add(Box.createRigidArea(new Dimension(0, 10)));
bodypan.add(bodypan2);
bodypan.add(Box.createRigidArea(new Dimension(0, 20)));
bodypan.add(rawoptionpanel);
bodypan.add(Box.createRigidArea(new Dimension(0, 10)));
bodypan.add(bodypan3);
bodypan.add(Box.createRigidArea(new Dimension(0, 20)));
bodypan.add(endpan);
bodypan.add(Box.createRigidArea(new Dimension(0, 100)));

/////////////////////////////////////////////////////////////////////////////////////////////////

contentpan.add(headingpan);
contentpan.add(buyerlabelpanel);
contentpan.add(bodypan);

/////////////////////////////////////////////////////////////////////////////////////////////////

mainpanel.add(menupanel);

/////////////////////////////////////////////////////////////////////////////////////////////////

mainpanel.add(contentpan);

//////////////////////////////////////////////////////////////////////////////////////////////////
mainpanel1.add(Box.createRigidArea(new Dimension(50, 220)));
mainpanel1.add(messagelabel2);
mainpanel1.add(Box.createRigidArea(new Dimension(50, 100)));
mainpanel1.add(messagelabel);
mainpanel1.add(Box.createRigidArea(new Dimension(50, 15)));
mainpanel1.add(messagelabel1);



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

	contentpan.setMinimumSize(new Dimension((w-365),h));
	contentpan.setPreferredSize(new Dimension((w-365),h));
	contentpan.setMaximumSize(new Dimension((w-465),h));
	
	
	
	
contentpan.revalidate();
    }
});


return layeredpan;	
}
	
	
	
}
	