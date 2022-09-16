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
public class adminlogin 
{
	JFrame mainframe;
	JLabel label1, label2;
	JButton fogpassbutton, logbutton, signbutton;
	JPanel contentpan, buttonpan, borderpan1, borderpan2;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
	float typelockvolume=-20.0f;
	int x,y;
	Dimension screensize;
	int hidden=0;
	
	
	String USER_NAME="";
	String EMAIL="";
	String PASSWORD="";
	String REMEMBER_ME="";
	String RESET_IP="";
	String RESET_TIME="";
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

	public adminlogin()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	
	}
	
		public adminlogin(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
	}
	
	
public JPanel adminlogpage(JFrame frame)
{
	
screensize = Toolkit.getDefaultToolkit().getScreenSize();


	JPanel mainpanel = new JPanel();
    mainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	mainpanel.setBackground(new Color(22,22,28));
    mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.Y_AXIS));////////////////row<COL<X GAP<Y GAP
	mainpanel.setBorder(new EmptyBorder(20,200,50,200));////////////////top<Left<bottom<right
	mainpanel.setOpaque(true);
	
	
	JLabel label1 = new JLabel("Welcome to RAW Login");
	label1.setFont(new Font("Times New Roman",Font.PLAIN,30));
	label1.setForeground(Color.decode("#fe6f5e"));
	label1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	label1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	label1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label1.setAlignmentX(Component.CENTER_ALIGNMENT);
	label1.setCursor(textcursor);
	
	JPanel borderpan1 = new JPanel();
	borderpan1.setBackground(new Color(22,22,28));//new Color(75, 162, 233)
	borderpan1.setLayout(new BoxLayout(borderpan1, BoxLayout.Y_AXIS));
	borderpan1.setMinimumSize(new Dimension(mainpanel.getWidth()-220,mainpanel.getHeight()-220));
	borderpan1.setPreferredSize(new Dimension(mainpanel.getWidth()-220,mainpanel.getHeight()-220));
	borderpan1.setMaximumSize(new Dimension(mainpanel.getWidth()-220,mainpanel.getHeight()-220));
	borderpan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	borderpan1.setBorder(new EmptyBorder(10,10,10,10));////////////////top<Left<bottom<right
   borderpan1.setBorder(new LineBorder (Color.decode("#fe6f5e"), 5));


	JLabel loglabel = new JLabel("ADMINISTRATOR  LOG-IN");
	loglabel.setFont(new Font("Times New Roman",Font.PLAIN,30));
	loglabel.setForeground(Color.decode("#fe6f5e"));
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
	maillabel.setForeground(Color.decode("#fe6f5e"));
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
	umailfield.activebgColor=Color.decode("#fe9285");
	umailfield.inactivebgColor=Color.decode("#fe9285");
	umailfield.activefgColor=Color.WHITE;////////////color on type
	umailfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	umailfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	umailfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	umailfield.setFont(new Font("Arial",Font.PLAIN,12));
	umailfield.setForeground(Color.decode("#FFFFFF"));
	umailfield.setBackground(Color.decode("#fe9285"));
	umailfield.setColumns(30);
	umailfield.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));        
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
	passlabel.setForeground(Color.decode("#fe6f5e"));
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
	passfield.activebgColor=Color.decode("#fe9285");
	passfield.inactivebgColor=Color.decode("#fe9285");
	passfield.activefgColor=Color.WHITE;////////////color on type
	passfield.inactivefgColor=Color.decode("#57F287");/////////////color when text inactive
	passfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	passfield.magColorM=Color.RED;///////// color if user click and unfill/ignore
	passfield.setFont(new Font("Arial",Font.PLAIN,12));
	passfield.setForeground(Color.decode("#FFFFFF"));
	passfield.setBackground(Color.decode("#fe9285"));
	passfield.setColumns(30);
	passfield.setEchoChar('*');
	passfield.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));        
    passfield.addMouseListener(new FieldMouseListener());
	passfield.setCaretColor(Color.WHITE);
	passfield.setMinimumSize(new Dimension(400, 40));
	passfield.setPreferredSize(new Dimension(400, 40));
	
	
	 

	
	JButton hidebutton = new HoverButton("Show");
	hidebutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	hidebutton.setBackground(new Color(125,125,125));
	hidebutton.setForeground(Color.WHITE);
	hidebutton.setCursor(handcursor);
	hidebutton.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));
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
	remember.setForeground(Color.decode("#fe6f5e"));
	remember.setBorder(new EmptyBorder(0,30,0,0));
	remember.setOpaque(false);
    remember.setContentAreaFilled(false);
    remember.setBorderPainted(true);
	remember.setAlignmentX(Component.LEFT_ALIGNMENT);
	remember.setFocusable(false);
	
	 // fogpassbutton = new HoverButton(" Forgot Password ");
	// fogpassbutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	
	// fogpassbutton.setForeground(Color.WHITE);
	// fogpassbutton.setCursor(handcursor);
	// fogpassbutton.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));
	// fogpassbutton.setOpaque(false);
    // fogpassbutton.setContentAreaFilled(false);
    // fogpassbutton.setBorderPainted(true);
	// fogpassbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	// fogpassbutton.setFocusable(false);
	// fogpassbutton.setMinimumSize(new Dimension(130,30));
    // fogpassbutton.setPreferredSize(new Dimension(130,30));
    // fogpassbutton.setMaximumSize(new Dimension(130,30));
	// fogpassbutton.setBackground(new Color(121, 181, 79));
	
		// fogpassbutton.addMouseListener(new MouseAdapter(){
	
		// public void mouseEntered(MouseEvent e)
		// {	
		
			// MouseClickSound ms=new MouseClickSound();
		// ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		// }		
		
	// });	
	
		// fogpassbutton.addActionListener(new ActionListener(){
		
		// @Override
		// public void actionPerformed(ActionEvent e)
		// {
				// MouseClickSound ms1=new MouseClickSound();
		// ms1.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
		
		// }
		
		// });	
	
	
	
	
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
	logbutton.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));
	logbutton.setOpaque(false);
    logbutton.setContentAreaFilled(false);
    logbutton.setBorderPainted(true);
	logbutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	logbutton.setFocusable(false);
	logbutton.setMinimumSize(new Dimension(400,40));
    logbutton.setPreferredSize(new Dimension(400,40));
    logbutton.setMaximumSize(new Dimension(400,40));
	logbutton.setBackground(Color.decode("#fe6f5e"));
	
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
		
		

		
		msglabel.setText("Your Mail and Password did not match with our database.");
		

		
		try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		
		
		
		
		String searchquery="SELECT * FROM `admin`;";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(!result.next())
		{
			try{		
		USER_NAME="admin";
		EMAIL="admin@gmail.com";
		PASSWORD="admin";
		REMEMBER_ME="No";
		timeraw t=new timeraw();
		rawip rp = new rawip();
		 RESET_TIME=t.intime();
		RESET_IP=rp.localhostaddress()+"\n"+rp.publicipaddress();
		String insertquery="INSERT INTO `admin`(`USER_NAME`, `EMAIL`, `PASSWORD`, `REMEMBER_ME`, `RESET_TIME`, `RESET_IP`) VALUES ('"+USER_NAME+"','"+EMAIL+"','"+PASSWORD+"','"+REMEMBER_ME+"','"+RESET_TIME+"','"+RESET_IP+"');";


		
		statement.executeUpdate(insertquery);
		

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	
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
		
	
try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		
		
		
		
		String searchquery="SELECT * FROM `admin` WHERE EMAIL='"+ umailfield.getText()+"' OR USER_NAME='"+  umailfield.getText()+"' AND PASSWORD='"+  passfield.getText()+"'";


		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();
		ResultSet result=statement.executeQuery(searchquery);
		
		
		
		if(result.next())
		{
			
			if(remember.isSelected())
{
	String EMAIL=result.getString("EMAIL");
	String PASSWORD=result.getString("PASSWORD");
	

	String RAW_POST="Admin";
	
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
		
		mainframe.getContentPane().removeAll();
			 
			 adminportal ap = new adminportal(mainframe);
			
			//mainframe.setJMenuBar(bp.buyerportalpage(mainframe));
			//mainframe.getContentPane().add(lm.loginmenupage(mainframe));
			mainframe.setContentPane(ap.adminportalpage(mainframe));
			mainframe.setVisible(true);
		
		
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
		
		
		
		
		////////////////////////////////////////////
		
		
		
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
	backbutton.setBorder(new LineBorder (Color.decode("#fe6f5e"), 1));
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
			
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			mainmenu m2 = new mainmenu(mainframe);
			
			mainframe.getContentPane().removeAll();
			mainframe.setJMenuBar(m2.menubar(mainframe));
			//mainframe.getContentPane().add(m2.menu(mainframe));
			mainframe.setContentPane(m2.menu(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	

backpan.add(backbutton);




logpan.add(logbutton);			
	
fogpasspan.add(remember);	
fogpasspan.add(Box.createRigidArea(new Dimension(200, 1)));	
//fogpasspan.add(fogpassbutton);	
	
	
	
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
borderpan1.add(Box.createRigidArea(new Dimension(0, 20)));	
borderpan1.add(msglabel);
borderpan1.add(Box.createRigidArea(new Dimension(0, 40)));	
borderpan1.add(mailpan);	
borderpan1.add(Box.createRigidArea(new Dimension(0, 40)));	
borderpan1.add(passpan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(fogpasspan);
borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(logpan);

borderpan1.add(Box.createRigidArea(new Dimension(0, 30)));	
borderpan1.add(backpan);





mainpanel.add(label1);	
mainpanel.add(Box.createRigidArea(new Dimension(0, 20)));
mainpanel.add(borderpan1);


return mainpanel;	
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
	
	
	
	
}