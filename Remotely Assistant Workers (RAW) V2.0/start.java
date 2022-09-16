
import raw.label.*;
import raw.button.*;
import raw.panel.*;
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
import java.sql.*;
import java.io.*; 
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.lang.*;
import com.mysql.jdbc.Connection;



public class start
{
	static JLabel l1,l2,l3,l4;
	static JPanel p1,p2;
	javax.swing.Timer timer;
boolean logged=false;	
	
	 boolean bsbd=false;
	boolean ssbd=false;
	boolean bspd=false;
	boolean sspd=false;
	boolean bsud=false;
	boolean ssud=false;
	boolean bscd=false;
	boolean ssus=false;
	boolean bsad=false;
	boolean ssad=false;
	boolean btr=false;
	boolean str=false;	
	boolean fd=false;
	boolean rp=false;
	boolean ct=false;
boolean ad=false;
	boolean bl=false;
	boolean sl=false;
	boolean bprp=false;
	boolean sprp=false;
	
	
    int X;
    int Y;
 JWindow w;
    start() {
 w=new JWindow();
 
    w.addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent me) {
          X=me.getX();
          Y=me.getY();
        }
    });
    w.addMouseMotionListener(new MouseMotionAdapter() {
        public void mouseDragged(MouseEvent me) {
          Point p = w.getLocation();
          w.setLocation(p.x + (me.getX()-X), p.y + (me.getY()-Y));
        }
    });
 
    Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
    w.setSize(screensize.width/2, screensize.height/2);
	
	 
    int x = (int) ((screensize.getWidth() - w.getWidth()) / 2);
    int y = (int) ((screensize.getHeight() - w.getHeight()) / 2);
    w.setLocation(x, y);
	
	w.getContentPane().setBackground( Color.decode("#010b13") );
	  //getContentPane().setBorder(BorderFactory.createLineBorder(Color.BLACK));
	  
	  
	  
	  
    p1 = new JPanel();
    p1.setSize(new Dimension(w.getWidth(),180));
	p1.setBackground( Color.decode("#010b13") );
	//p1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
	p1.setLayout(new BoxLayout(p1, BoxLayout.Y_AXIS));
 p1.setBorder(new EmptyBorder(100,390,10,300));
 
 
    l1 = new JLabel("RAW");
	CustomFont cf=new CustomFont();
	l1.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,60.0f));
	l1.setForeground(Color.decode("#046ba5"));
	//l1.setBounds(x-80,y-170,300,60);
	p1.add(l1);
    w.add(p1);
		
		
		l2 = new JLabel();
		l2.setFont(new Font("Magneto",Font.PLAIN,25));
		l2.setForeground(Color.decode("#d3d3d3"));
		l2.setBounds(x-120,y+85,350,25);
		w.add(l2);
		
		
		l3 = new JLabel();
		l3.setFont(new Font("Arial Black",Font.PLAIN,14));
		l3.setForeground(Color.decode("#a9a9a9"));
		l3.setBounds(x-210,y+125,1000,20);
		w.add(l3);
		
	ImageIcon loading = new ImageIcon("Resources/Gifs/Start/startup_loading_gif.gif");  //100*100
    w.add(new JLabel(loading, JLabel.CENTER));
 JProgressBar progress =new JProgressBar(0,100);
 
 
 progress.setForeground(Color.decode("#0498ea"));
 progress.setBackground(Color.decode("#010b13"));
 w.add(BorderLayout.PAGE_END,progress);
  w.revalidate();
  
  timer = new javax.swing.Timer(120,new ActionListener(){//ms
 
	 @Override
	 public void actionPerformed(ActionEvent e)
	 {
		 int x=progress.getValue();
		 if(x==100)
		 {
			//this.dispose();
			timer.stop();
			 w.setVisible(false);
		 }
		 else{
			 
			 progress.setValue(x+2);
		 }
		 
	 }
	 
 }); 
 timer.start();
 
    w.setVisible(true);
	fill();  
    w.setVisible(false);
	
	
	
  }
	
	public void database()
	{


 try {
     

String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();

      DatabaseMetaData meta = connection.getMetaData();
      ResultSet res = meta.getTables(null, null, null,new String[] {"TABLE"});

      while (res.next()) {
        
          if(res.getString("TABLE_NAME").equals("buyer_signup_basic_details"))
		  {
		  bsbd=true;
		  }
		   if(res.getString("TABLE_NAME").equals("buyer_signup_personal_details"))
		  {
			bspd=true;
			
		  }
		   if(res.getString("TABLE_NAME").equals("buyer_signup_user_details"))
		  {
			  bsud=true;
		  }
		   if(res.getString("TABLE_NAME").equals("buyer_signup_company_details"))
		  {
			 bscd=true;
		  }
		   if(res.getString("TABLE_NAME").equals("buyer_signup_account_details"))
		  {
			  bsad=true;
		  }
		   if(res.getString("TABLE_NAME").equals("seller_signup_basic_details"))
		  {
			  ssbd=true;
		  }
		   if(res.getString("TABLE_NAME").equals("seller_signup_personal_details"))
		  {
			 sspd=true;
		  }
		   if(res.getString("TABLE_NAME").equals("seller_signup_user_details"))
		  {
			 ssud=true;
		  }
		   if(res.getString("TABLE_NAME").equals("seller_signup_user_skills"))
		  {
			  ssus=true;
		  }
		   if(res.getString("TABLE_NAME").equals("seller_signup_account_details"))
		  {
			  ssad=true;
		  }
		   if(res.getString("TABLE_NAME").equals("feedback"))
		  {
			fd=true;
		  }
		   if(res.getString("TABLE_NAME").equals("report"))
		  {
			 rp=true; 
		  }
		   if(res.getString("TABLE_NAME").equals("contact"))
		  {
			 ct=true; 
		  }
		   if(res.getString("TABLE_NAME").equals("buyer_total_rating"))
		  {
			 btr=true; 
		  }
		   if(res.getString("TABLE_NAME").equals("seller_total_rating"))
		  {
			 str=true; 
		  }
		   if(res.getString("TABLE_NAME").equals("admin"))
		  {
			 ad=true; 
		  }
            if(res.getString("TABLE_NAME").equals("buyer_login"))
		  {
			 bl=true; 
		  }
		   if(res.getString("TABLE_NAME").equals("seller_login"))
		  {
			 sl=true; 
		  }
		     if(res.getString("TABLE_NAME").equals("buyer_prp_details"))
		  {
			 bprp=true; 
		  }
		      if(res.getString("TABLE_NAME").equals("seller_prp_details"))
		  {
			 sprp=true; 
		  }
      }
      res.close();
if(!ad)
{
	try{
	String adQ="CREATE TABLE ADMIN (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), PASSWORD VARCHAR(50), REMEMBER_ME VARCHAR(20), RESET_TIME VARCHAR(200), RESET_IP VARCHAR(200));";
statement.executeUpdate(adQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bsbd)
{
	try{
	String bsbdQ="CREATE TABLE BUYER_SIGNUP_BASIC_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), FIRST_NAME VARCHAR(60), LAST_NAME VARCHAR(40), COUNTRY_CODE VARCHAR(50), MOBILE_NUMBER VARCHAR(30), GENDER VARCHAR(8));";
statement.executeUpdate(bsbdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!ssbd)
{
	try{
	String ssbdQ="CREATE TABLE SELLER_SIGNUP_BASIC_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), FIRST_NAME VARCHAR(60), LAST_NAME VARCHAR(40), COUNTRY_CODE VARCHAR(50), MOBILE_NUMBER VARCHAR(30), GENDER VARCHAR(8));";
	
	statement.executeUpdate(ssbdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bspd)
{
	try{
	String bspdQ="CREATE TABLE BUYER_SIGNUP_PERSONAL_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), DATE_OF_BIRTH VARCHAR(15), BIRTH_DATE VARCHAR(2), BIRTH_MONTH VARCHAR(2), BIRTH_YEAR VARCHAR(4), AGE VARCHAR(50), NID_NUMBER VARCHAR(25), PASSPORT_NUMBER VARCHAR(25), COUNTRY VARCHAR(30), NATIONALITY VARCHAR(50), STREET_ADDRESS VARCHAR(200), ADDRESS_LINE_2 VARCHAR(200), CITY VARCHAR(80), STATE VARCHAR(50));";
	
	statement.executeUpdate(bspdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!sspd)
{
	try{
	String sspdQ="CREATE TABLE SELLER_SIGNUP_PERSONAL_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), DATE_OF_BIRTH VARCHAR(15), BIRTH_DATE VARCHAR(2), BIRTH_MONTH VARCHAR(2), BIRTH_YEAR VARCHAR(4), AGE VARCHAR(50), NID_NUMBER VARCHAR(25), PASSPORT_NUMBER VARCHAR(25), COUNTRY VARCHAR(30), NATIONALITY VARCHAR(50), STREET_ADDRESS VARCHAR(200), ADDRESS_LINE_2 VARCHAR(200), CITY VARCHAR(80), STATE VARCHAR(50));";
	
	statement.executeUpdate(sspdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bsud)
{
	try{
	String bsudQ="CREATE TABLE BUYER_SIGNUP_USER_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), PASSWORD VARCHAR(16), PROFILE_PICTURE VARCHAR(1000), PROMOTIONAL_EMAIL VARCHAR(10), STATUS VARCHAR(20), STATUS_MESSAGE VARCHAR(120),  RAW_POST VARCHAR(20));";
	
	statement.executeUpdate(bsudQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!ssud)
{
	try{
	String ssudQ="CREATE TABLE SELLER_SIGNUP_USER_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), PASSWORD VARCHAR(16), PROFILE_PICTURE VARCHAR(1000), PROMOTIONAL_EMAIL VARCHAR(10), STATUS VARCHAR(20), STATUS_MESSAGE VARCHAR(120), RAW_POST VARCHAR(20));";
	
	statement.executeUpdate(ssudQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bscd)
{
	try{
	String bscdQ="CREATE TABLE BUYER_SIGNUP_COMPANY_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), COMPANY_NAME VARCHAR(100), COMPANY_TYPE VARCHAR(20), COMPANY_DESIGNATION VARCHAR(20), WORKERS_AMOUNT VARCHAR(10), COMPANY_ADDRESS VARCHAR(200) , BUYER_REASON VARCHAR(300));";
	
	statement.executeUpdate(bscdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!ssus)
{
	try{
	String ssusQ="CREATE TABLE SELLER_SIGNUP_USER_SKILLS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), BASIC_SKILLS VARCHAR(1000), OTHER_SKILLS VARCHAR(1000), EXPERT_ON VARCHAR(1000), DEMO_PROJECTS VARCHAR(1000));";
	
	statement.executeUpdate(ssusQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bsad)
{
	try{
	String bsadQ="CREATE TABLE BUYER_SIGNUP_ACCOUNT_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), BANK_ACCOUNT_NUMBER VARCHAR(25), DESCRIPTION VARCHAR(500), HAVE_SELLER VARCHAR(10), SIGN_UP_TIME VARCHAR(200), SIGN_UP_IP VARCHAR(100));";
	
	statement.executeUpdate(bsadQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!ssad)
{
	try{
	String ssadQ="CREATE TABLE SELLER_SIGNUP_ACCOUNT_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), BANK_ACCOUNT_NUMBER VARCHAR(25), DESCRIPTION VARCHAR(500), HAVE_SELLER VARCHAR(10), SIGN_UP_TIME VARCHAR(200), SIGN_UP_IP VARCHAR(100));";
	
	statement.executeUpdate(ssadQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}


if(!btr)
{
	try{
	String btrQ="CREATE TABLE BUYER_TOTAL_RATING (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), CURRENT_RATING VARCHAR(25), TOTAL_RATED_BY VARCHAR(25));";
	
	statement.executeUpdate(btrQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!str)
{
	try{
	String strQ="CREATE TABLE SELLER_TOTAL_RATING (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), FULL_NAME VARCHAR(100), CURRENT_RATING VARCHAR(25), TOTAL_RATED_BY VARCHAR(25));";
	
	statement.executeUpdate(strQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}


if(!fd)
{
	try{
	String fdQ="CREATE TABLE FEEDBACK (FULL_NAME VARCHAR(100) , EMAIL VARCHAR(100), MOBILE_NUMBER VARCHAR(50), SATISFACTION_RATE VARCHAR(50), COMMENTS VARCHAR(3000), RAW_POST VARCHAR(50), SENDING_TIME VARCHAR(200), SENDING_IP VARCHAR(200));";
	
	statement.executeUpdate(fdQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}


if(!rp)
{
	try{
	String rpQ="CREATE TABLE REPORT (FULL_NAME VARCHAR(100) , EMAIL VARCHAR(100), REPORT_SECTION VARCHAR(50), SUSPECT_EMAIL VARCHAR(100), BANK_ACCOUNT_NO VARCHAR(50), PROBLEM_TYPE VARCHAR(200), SUB_PROBLEM_TYPE VARCHAR(200), ADDITIONAL_COMMENT VARCHAR(500), SENDING_TIME VARCHAR(200) , SENDING_IP VARCHAR(200), REPORT_CONDITION VARCHAR(50), INVESTIGATION_TIME VARCHAR(200), WARNING_TIME VARCHAR(200), CLOSING_TIME VARCHAR(200), HANDLER_EMAIL VARCHAR(100) , SOLUTION VARCHAR(500), USER_SATISFACTION VARCHAR(50));";
	
	statement.executeUpdate(rpQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}


if(!ct)
{
	try{
	String ctQ="CREATE TABLE CONTACT (FULL_NAME VARCHAR(100) , EMAIL VARCHAR(100), MOBILE_NUMBER VARCHAR(50), COMMUNICATION_METHOD VARCHAR(50), MESSAGE VARCHAR(3000), RAW_POST VARCHAR(50), SENDING_TIME VARCHAR(500),SENDING_IP VARCHAR(200), CONTACT_CONDITION VARCHAR(50));";
	
	statement.executeUpdate(ctQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!bl)
{
	try{
	String blQ="CREATE TABLE BUYER_LOGIN (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), PASSWORD VARCHAR(20), REMEMBER_ME VARCHAR(20), LOGIN_TIME VARCHAR(200), LOGIN_IP VARCHAR(200), RAW_POST VARCHAR(50));";
	
	statement.executeUpdate(blQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!sl)
{
	try{
	String slQ="CREATE TABLE SELLER_LOGIN (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), PASSWORD VARCHAR(20), REMEMBER_ME VARCHAR(20), LOGIN_TIME VARCHAR(200), LOGIN_IP VARCHAR(200), RAW_POST VARCHAR(50));";
	
	statement.executeUpdate(slQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}


if(!bprp)
{
	try{
	String bprpQ="CREATE TABLE BUYER_PRP_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), OLD_PASSWORD VARCHAR(20), NEW_PASSWORD VARCHAR(20), PRP_TIME VARCHAR(200), PRP_IP VARCHAR(200), RAW_POST VARCHAR(50));";
	
	statement.executeUpdate(bprpQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

if(!sprp)
{
	try{
	String sprpQ="CREATE TABLE SELLER_PRP_DETAILS (USER_NAME VARCHAR(100) , EMAIL VARCHAR(100), OLD_PASSWORD VARCHAR(20), NEW_PASSWORD VARCHAR(20), PRP_TIME VARCHAR(200), PRP_IP VARCHAR(200), RAW_POST VARCHAR(50));";
	
	statement.executeUpdate(sprpQ);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
}

      connection.close();
	  statement.close();
    } catch (Exception e) {
      System.err.println("Exception: "+e.getMessage());
    }
	}
	
	
public void user()
{
	File f= new File("Resources/Login_Info");
if(f.exists())
	{
		
	}
	else
	{
		f.mkdir();
	}
String p= f.getAbsolutePath();


try{
	File file =new File(p+"/login.rw");
	if (file.length() == 0) 
{
}	
else{	
	Scanner read= new Scanner(file);
		int i=0;
String email="";
String password="";
String raw_post="";
	while(read.hasNext())
	{
		if(i==0)
		{
			email=read.nextLine();
		}
		if(i==1)
		{
			password=read.nextLine();
		}
		if(i==2)
		{
			raw_post=read.nextLine();
		}
		i++;
	}
	read.close();
	logged=true;
	if(raw_post.equals("Buyer"))
	{
		buyerportal bp=new buyerportal(email, password);

	}
	if(raw_post.equals("Seller"))
	{
sellerportal spo=new sellerportal(email, password);

	}
	
	if(raw_post.equals("Admin"))
	{

adminportal ap= new adminportal(email, password);
	}
}
	
	}catch(Exception e)
{
	System.out.print(e);
	
}	


}	
	
	
	
	public static void main(String [] args)
	{		
	

try{		
ProcessBuilder P1 =new ProcessBuilder("C:\\xampp\\mysql_start.bat");
P1.start();


}catch(IOException ae)
{
System.out.println(ae);
}
	
	/*try{		


ProcessBuilder P2 =new ProcessBuilder("C:\\xampp\\apache_start.bat");
P2.start();

}catch(IOException ae)
{
System.out.println(ae);
}*/
start s=new start();
s.database();
s.user();



if(!s.logged)
{
mainmenu f1 = new mainmenu();
}
buyerportal bp=new buyerportal();
sellerportal spo=new sellerportal();
adminportal ap= new adminportal();
loginmenu lm=new loginmenu();
	signupmenu sm=new signupmenu();
exit ex=new exit();
contact c=new contact();
	about ab=new about();
	feedback f =new feedback();
	report r=new report();
	buyersignup bs=new buyersignup();
	buyerlogin bl=new buyerlogin();
	sellerlogin sl=new sellerlogin();
	sellersignup sp=new sellersignup();
	adminlogin al = new adminlogin();
	}



public static void fill()
{
	String name[] = {"         Tips: Do you know RAW is build with java?",
                   	 "Tips: Found traitor? You can report user as soon as possible.",
					 "        Tips: You send a message or mail to any user.",
					 "       Tips: You can't use (~,`) commands as and input."};
	//System.out.print(name[new Random().nextInt(name.length)]);	
	l3.setText( name[new Random().nextInt(name.length)]);
	
	l2.setText("   Processing...");
		  try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
    }
	
	l2.setText("   Connecting...");
		  try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
    }
	
	l2.setText("  Almost Ready...");
		  try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
    }
	
	l2.setText("Ready to Launch...");
		  try {
      Thread.sleep(1500);
    } catch (InterruptedException e) {
    }
}	

}