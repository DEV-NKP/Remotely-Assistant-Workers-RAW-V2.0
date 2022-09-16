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
public class sellersignup 
{
	JFrame mainframe;
	JLabel label1, label2,lastlabel,newlabel8;
	JButton mbutton1, mbutton2, mbutton3,  mbutton4, mbutton5, mbutton6, mbutton7, bcontinue, pcontinue, ucontinue, ccontinue, acontinue,verifybutton;
	RoundedCornerHoverButton cbutton1;
	JPanel contentpan, buttonpan, roundpanel1, roundpanel2;
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float menuvolume=-40.0f;
	float exitvolume=-20.0f;
	float typelockvolume=-20.0f;
	float submiterrorvolume=-20.0f;
	int x,y;
	String S1="";
	String S2="";
	String S3="";
	String S4="";
	String txtd,txtd1,txtd2,txtd3;
	int i=0,k=0,j=0, l=0;
	String bankacc="";
	int hidden=0;
	int hidden1=0;
	String A="";
	String B="";
	String C="";
	String D="";
	String[] newarray = new String[41];
	String[] array = new String[41];
	String[] array1 = new String[41];
	String[] array2 = new String[41];
	String[] array3 = new String[41];
	String[] skill= new String[i+1];
	String[] skill1= new String[j+1];
	String[] skill2= new String[k+1];
	String[] skill3= new String[l+1];
	int countfn=0;
	int count=0;
	
	
	
	boolean BasicDetails=false;
	boolean PersonalDetails=false;
	boolean UserDetails=false;
	boolean UserSkills=false;
	boolean AccountDetails=false;
	
	boolean skillflag=false;
	boolean skillflag1=false;
	boolean skillflag2=false;
	boolean skillflag3=false;
	
	boolean addflag=false;
	boolean addflag1=false;
	boolean addflag2=false;
	boolean addflag3=false;
	
	
////// BASIC DETAILS //////
	
	String EMAIL="";
	String FULL_NAME="";
	String FIRST_NAME="";
	String LAST_NAME="";
	String COUNTRY_CODE="";
	String MOBILE_NUMBER="";
	String GENDER="";
	
	boolean fn=false;
	boolean ln=false;
	boolean ccode=false;
	boolean mail=false;
	boolean cmail=false;
	boolean phnno=false;
	boolean gen=false;
	
	String SUBEMAIL="";
	String SUBCON_EMAIL="";
	String SUBFIRST_NAME="";
	String SUBLAST_NAME="";
	String SUBCOUNTRY_CODE="";
	String SUBMOBILE_NUMBER="";
	String SUBGENDER="";

////// PERSONAL DETAILS //////
	
	String DATE_OF_BIRTH="";
	String BIRTH_DATE="";
	String BIRTH_MONTH="";
	String BIRTH_YEAR="";
	String AGE="";
	String NID_NUMBER="";
	String PASSPORT_NUMBER="";
	String COUNTRY="";
	String NATIONALITY="";
	String STREET_ADDRESS="";
	String ADDRESS_LINE_2="";
	String CITY="";
	String STATE="";
	
	boolean birda=false;
	boolean birmo=false;
	boolean birye=false;
	boolean nid=false;
	boolean ppno=false;
	boolean natlity=false;
	boolean coun=false;
	boolean sadd=false;
	boolean add2=false;
	boolean cit=false;
	boolean prov=false;

	String SUBBIRTH_DATE="";
	String SUBBIRTH_MONTH="";
	String SUBBIRTH_YEAR="";
	String SUBNID_NUMBER="";
	String SUBPASSPORT_NUMBER="";
	String SUBCOUNTRY="";
	String SUBNATIONALITY="";
	String SUBSTREET_ADDRESS="";
	String SUBADDRESS_LINE_2="";
	String SUBCITY="";
	String SUBSTATE="";	
	
////// USER DETAILS //////

	String USER_NAME="";
	String PASSWORD="";
	String PROFILE_PICTURE="";
	String PROMOTIONAL_EMAIL="";
	String STATUS="";	
	String STATUS_MESSAGE="";	
	String RAW_POST="";

	boolean una=false;
	boolean cuna=false;
	boolean passw=false;
	boolean cpassw=false;
	boolean otp=false;
	boolean sende=false;
	boolean tac=false;
	
	String SUBUSER_NAME="";
	String SUBCON_USER_NAME="";
	String SUBPASSWORD="";
	String SUBCON_PASSWORD="";
	String SUBPROFILE_PICTURE="";
	String SUBPROMOTIONAL_EMAIL="";
	String SUBOTP="";	
	String SUBTAC="";	
	
////// USER SKILLS //////

	String BASIC_SKILLS="";
	String OTHER_SKILLS="";
	String EXPERT_ON="";
	String DEMO_PROJECTS="";
	
	boolean bsls=false;
	boolean osls=false;
	boolean eort=false;
	boolean dpts=false;
	
	String SUBBASIC_SKILLS="";
	String SUBOTHER_SKILLS="";
	String SUBEXPERT_ON="";
	String SUBDEMO_PROJECTS="";
	
////// ACCOUNT DETAILS //////

	String BANK_ACCOUNT_NUMBER="";
	String DESCRIPTION="";
	String HAVE_SELLER="";
	String SIGN_UP_TIME="";	
	String SIGN_UP_IP="";	
	
	boolean dec=false;
	boolean selac=false;
	boolean atac=false;	

	String SUBBANK_ACCOUNT_NUMBER="";
	String SUBDESCRIPTION="";
	String SUBHAVE_SELLER="";
	String SUBATAC="";
	
		
///////////////////////
	String TOTAL_RATING="";
	String TOTAL_RATED_NUMBER="";
		Dimension screensize;
	
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

	public sellersignup()
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
	
	}
	
		public sellersignup(JFrame frame)
	{
	    screensize = Toolkit.getDefaultToolkit().getScreenSize();
        x = (int) ((screensize.getWidth() - ((screensize.width/2)+320)) / 2);
        y = (int) ((screensize.getHeight() - ((screensize.height/2)+220)) / 2);
		this.mainframe=frame;
	}
	public String generator(int n)
	{
		String accno;
	char A[] = new char[16];
	
	    Random random = new Random();

        String setOfCharacters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"0123456789";
		StringBuilder sb = new StringBuilder(n);
  
        for (int i = 0; i < n; i++)
		{
  
            int index= (int)(setOfCharacters.length()* Math.random());
			A[i]= setOfCharacters.charAt(index);

        }

	for(int j= 0; j< 16; j++)
	{
		if(j<4)
		{
	S1 += String.valueOf(A[j]);
		}
		if(j>=4 && j<8)
		{
	S2 += String.valueOf(A[j]);
		}
		if(j>=8 && j<12)
		{
	S3 += String.valueOf(A[j]);
		}
		if(j>=12 && j<16)
		{
	S4 += String.valueOf(A[j]);
		}
	}
	accno= S1+" "+S2+" "+S3+" "+S4;
	
	
     return accno;
	}
	
public JPanel sellersignpage(JFrame frame)
{
	
screensize = Toolkit.getDefaultToolkit().getScreenSize();


	JPanel mainpanel = new JPanel();
    mainpanel.setSize((frame.getWidth()), (frame.getHeight()));
	mainpanel.setBackground(Color.decode("#000000"));
    mainpanel.setLayout(new BoxLayout(mainpanel, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	mainpanel.setBorder(new EmptyBorder(0,0,0,0));////////////////top<Left<bottom<right
	mainpanel.setOpaque(false);
	
	
	JPanel menupanel = new JPanel();
	menupanel.setBackground(new Color(27,27,27));//new Color(75, 162, 233)
	menupanel.setLayout(new BoxLayout(menupanel, BoxLayout.Y_AXIS));
	menupanel.setBorder(new EmptyBorder(1,1,1,1));
	menupanel.setMinimumSize(new Dimension(300,mainpanel.getHeight()));
	menupanel.setPreferredSize(new Dimension(300,mainpanel.getHeight()));
	menupanel.setMaximumSize(new Dimension(400,screensize.height));
	menupanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	ImageIcon imgx0 = new ImageIcon("Resources/Gifs/Buyer_Signup/Menu_gif.gif");  //248*248
	JLabel menugif = new JLabel("",imgx0,JLabel.CENTER);
	menugif.setSize(imgx0.getIconWidth(),imgx0.getIconHeight());
	menugif.setAlignmentX(Component.CENTER_ALIGNMENT);
	menugif.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	menugif.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	menugif.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	menugif.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	menugif.setAlignmentX(Component.CENTER_ALIGNMENT);
	menugif.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan1 = new JPanel();
	mbuttonpan1.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan1.setLayout(new BoxLayout(mbuttonpan1, BoxLayout.Y_AXIS));
	mbuttonpan1.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan1.setMinimumSize(new Dimension(200,50));
	mbuttonpan1.setPreferredSize(new Dimension(200,50));
	mbuttonpan1.setMaximumSize(new Dimension(250,60));
	mbuttonpan1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan2 = new JPanel();
	mbuttonpan2.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan2.setLayout(new BoxLayout(mbuttonpan2, BoxLayout.Y_AXIS));
	mbuttonpan2.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan2.setMinimumSize(new Dimension(200,50));
	mbuttonpan2.setPreferredSize(new Dimension(200,50));
	mbuttonpan2.setMaximumSize(new Dimension(250,60));
	mbuttonpan2.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan3 = new JPanel();
	mbuttonpan3.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan3.setLayout(new BoxLayout(mbuttonpan3, BoxLayout.Y_AXIS));
	mbuttonpan3.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan3.setMinimumSize(new Dimension(200,50));
	mbuttonpan3.setPreferredSize(new Dimension(200,50));
	mbuttonpan3.setMaximumSize(new Dimension(250,60));
	mbuttonpan3.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan4 = new JPanel();
	mbuttonpan4.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan4.setLayout(new BoxLayout(mbuttonpan4, BoxLayout.Y_AXIS));
	mbuttonpan4.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan4.setMinimumSize(new Dimension(200,50));
	mbuttonpan4.setPreferredSize(new Dimension(200,50));
	mbuttonpan4.setMaximumSize(new Dimension(250,60));
	mbuttonpan4.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan5 = new JPanel();
	mbuttonpan5.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan5.setLayout(new BoxLayout(mbuttonpan5, BoxLayout.Y_AXIS));
	mbuttonpan5.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan5.setMinimumSize(new Dimension(200,50));
	mbuttonpan5.setPreferredSize(new Dimension(200,50));
	mbuttonpan5.setMaximumSize(new Dimension(250,60));
	mbuttonpan5.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel mbuttonpan6 = new JPanel();
	mbuttonpan6.setBackground(new Color(27, 27, 27));//new Color(75, 162, 233)
	mbuttonpan6.setLayout(new BoxLayout(mbuttonpan6, BoxLayout.X_AXIS));
	mbuttonpan6.setBorder(new EmptyBorder(1,1,1,1));
	mbuttonpan6.setMinimumSize(new Dimension(200,50));
	mbuttonpan6.setPreferredSize(new Dimension(200,50));
	mbuttonpan6.setMaximumSize(new Dimension(250,60));
	mbuttonpan6.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	//JButton mbutton1, mbutton2, mbutton3,  mbutton4, mbutton5, mbutton6, mbutton7;
	
	 mbutton1=new RoundedCornerHoverButton("     Basic Details     ");
	mbutton1.setFont(new Font("Comic Sans",Font.PLAIN,20));
	mbutton1.setBackground(new Color(0,0,0));
	mbutton1.setForeground(Color.decode("#00ffff"));
	mbutton1.setCursor(handcursor);
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
	
	
	
	 mbutton2=new RoundedCornerHoverButton("   Personal Details  ");
	mbutton2.setFont(new Font("Comic Sans",Font.PLAIN,20));
	mbutton2.setBackground(new Color(0,0,0));
	mbutton2.setForeground(Color.decode("#00ffff"));
	mbutton2.setCursor(handcursor);
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
	
	
	 mbutton3=new RoundedCornerHoverButton("     User Details      ");
	mbutton3.setFont(new Font("Comic Sans",Font.PLAIN,20));
	mbutton3.setBackground(new Color(0,0,0));
	mbutton3.setForeground(Color.decode("#00ffff"));
	mbutton3.setCursor(handcursor);
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
	
	
	
	 mbutton4=new RoundedCornerHoverButton("  User Skills  ");
	mbutton4.setFont(new Font("Comic Sans",Font.PLAIN,20));
	mbutton4.setBackground(new Color(0,0,0));
	mbutton4.setForeground(Color.decode("#00ffff"));
	mbutton4.setCursor(handcursor);
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
	
	
	
	 mbutton5=new RoundedCornerHoverButton("   Account Details   ");
	mbutton5.setFont(new Font("Comic Sans",Font.PLAIN,20));
	mbutton5.setBackground(new Color(0,0,0));
	mbutton5.setForeground(Color.decode("#00ffff"));
	mbutton5.setCursor(handcursor);
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
	
	
	
	 mbutton6=new RoundedCornerHoverButton(" Back to Menu ");
	mbutton6.setFont(new Font("Comic Sans",Font.PLAIN,16));
	mbutton6.setBackground(new Color(0,0,0));
	mbutton6.setForeground(Color.decode("#00ffff"));
	mbutton6.setCursor(handcursor);
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
		    //mainframe.remove(buyersignup(mainframe));
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			signupmenu s2 = new signupmenu(mainframe);
			mainframe.setJMenuBar(s2.signupmenubar(mainframe));
			mainframe.getContentPane().add(s2.signupmenupage(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	
	
	
	
	mbutton7=new RoundedCornerHoverButton(" Exit ");
	mbutton7.setFont(new Font("Comic Sans",Font.PLAIN,17));
	mbutton7.setBackground(new Color(0,0,0));
	mbutton7.setForeground(Color.decode("#00ffff"));
	mbutton7.setCursor(handcursor);
	mbutton7.setOpaque(false);
    mbutton7.setContentAreaFilled(false);
    mbutton7.setBorderPainted(true);
	mbutton7.setAlignmentX(Component.CENTER_ALIGNMENT);
	mbutton7.setFocusable(false);
	mbutton7.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	mbutton7.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(mainframe);
		ex.confirmexit(mainframe,exitvolume);
		
		}		
		
	});
	
	
	
	
	
	contentpan = new JPanel();
	contentpan.setBackground(new Color(44, 47, 51));//new Color(240, 240, 240)
	contentpan.setLayout(new BoxLayout(contentpan, BoxLayout.Y_AXIS));
	contentpan.setBorder(new EmptyBorder(1,1,1,1));
	contentpan.setAlignmentX(Component.RIGHT_ALIGNMENT);
	contentpan.setMinimumSize(new Dimension((mainpanel.getWidth()-menupanel.getWidth()),mainpanel.getHeight()));
	contentpan.setPreferredSize(new Dimension((mainpanel.getWidth()-menupanel.getWidth()),mainpanel.getHeight()));
	contentpan.setMaximumSize(new Dimension((screensize.width-menupanel.getWidth()),screensize.height));
	
	
	
		mbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//mbutton1.setForeground(Color.decode("#FA441D"));//error
			
		mbutton1.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
		
		contentpan.removeAll();
		contentpan.add(basicdetails(contentpan));
		contentpan.revalidate();
		
		/*mbutton1.setEnabled(false);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);*/
		}		
		
	});	
	
	
		mbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
		
		
		contentpan.removeAll();
		contentpan.add(personaldetails(contentpan));
		contentpan.revalidate();
		
		
		/*mbutton1.setEnabled(true);
		mbutton2.setEnabled(false);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);*/
		
		}		
		
	});	
	
	
		mbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(userdetails(contentpan));
		contentpan.revalidate();
			
		/*mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(false);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);*/
		}		
		
	});	
	
	
	
		mbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton4.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(userskills(contentpan));
		contentpan.revalidate();
			
		/*mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(false);
		mbutton5.setEnabled(true);*/
		}		
		
	});	
	
		mbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton5.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(accountdetails(contentpan));
		contentpan.revalidate();
		
		/*mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(false);*/
		}		
		
	});	
	
	
		mbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		mbutton6.setForeground(Color.decode("#000000"));
			
			
		
		}		
		
	});	
	
		mbutton7.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		mbutton7.setForeground(Color.decode("#000000"));
			
			
		
		}		
		
	});	
	 
	/*Image imgmbackground = null;
	try
	{
		
        imgmbackground = ImageIO.read(new File("Resources/Images/Mainmenu/mainpanel_background_picture.png")); //1920*1080
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }

	ImagePanel labels1= new ImagePanel(imgmbackground);
	label1.setLayout(new GridLayout(1,0,0,0));
	label1.setBorder(new EmptyBorder(0,0,0,0));
	label1.setOpaque(false);

	
	ImageIcon imglraw = new ImageIcon("Resources/Images/Mainmenu/main_panel_background_raw_picture.png"); //420*420
	label2 = new JLabel("",imglraw,JLabel.CENTER);
    label2.setLayout(new BoxLayout(label2, BoxLayout.Y_AXIS));
	label2.setBorder(new EmptyBorder(10,10,10,10));
	label2.setOpaque(false);*/
//////////////////////////////////////////////////////////////////////////////////////////////////

	
	
	
	
	
mbuttonpan1.add(mbutton1);
mbuttonpan2.add(mbutton2);
mbuttonpan3.add(mbutton3);
mbuttonpan4.add(mbutton4);
mbuttonpan5.add(mbutton5);
mbuttonpan6.add(Box.createRigidArea(new Dimension(10, 1)));
mbuttonpan6.add(mbutton6);
mbuttonpan6.add(Box.createRigidArea(new Dimension(20, 1)));
mbuttonpan6.add(mbutton7);





menupanel.add(menugif);
menupanel.add(Box.createRigidArea(new Dimension(0, 100)));
menupanel.add(mbuttonpan1);
menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(mbuttonpan2);
menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(mbuttonpan3);
menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(mbuttonpan4);
menupanel.add(Box.createRigidArea(new Dimension(0, 10)));
menupanel.add(mbuttonpan5);
menupanel.add(Box.createRigidArea(new Dimension(0, 160)));
menupanel.add(mbuttonpan6);
menupanel.add(Box.createRigidArea(new Dimension(0, 50)));

mainpanel.add(menupanel);


contentpan.add(signinfo(contentpan));
mainpanel.add(contentpan);


return mainpanel;	
}
	
public JPanel signinfo(JPanel p)
{
	 bankacc= generator(16);
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	JPanel infopan = new JPanel();
	infopan.setBackground(Color.decode("#292929"));
	infopan.setLayout(new BoxLayout(infopan, BoxLayout.Y_AXIS));
	infopan.setAlignmentX(Component.CENTER_ALIGNMENT);
	infopan.setMinimumSize(new Dimension(p.getWidth()+300, p.getHeight()));
	infopan.setPreferredSize(new Dimension(p.getWidth()+300, p.getHeight()));
	infopan.setMaximumSize(new Dimension(screensize.width, screensize.height));
	infopan.setBorder(new EmptyBorder(70,170,80,0));
	
	/*Image bimgl = null;
	try
	{
		
        bimgl = ImageIO.read(new File("Resources/Images/BuyerSignUp/resizepic4.png"));//900*500
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }
	
	ImagePanel imagb= new ImagePanel(bimgl);
	imagb.setBackground(Color.decode("#00000"));
	imagb.setLayout(new BoxLayout(imagb, BoxLayout.Y_AXIS));
	imagb.setAlignmentX(Component.CENTER_ALIGNMENT);
	imagb.setBorder(null);
	imagb.setMinimumSize(new Dimension(3000, 700));
	imagb.setPreferredSize(new Dimension(3000, 700));
	imagb.setMaximumSize(new Dimension(3200, 800));
	//imagb.setBorder(new EmptyBorder(1,1,1,1));*/
	
	roundpanel1 = new RoundedPanel(50,new Color(0,241,197));
    //roundpanel.setBounds(10,10,650,700);
	//roundpanel.setBackground(Color.decode("#000000"));
	roundpanel1.setLayout(new BoxLayout(roundpanel1, BoxLayout.X_AXIS));
	roundpanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	roundpanel1.setMinimumSize(new Dimension(850,690));
	roundpanel1.setPreferredSize(new Dimension(850,690));
	roundpanel1.setMaximumSize(new Dimension(880,700));
	roundpanel1.setBorder(new EmptyBorder(12,12,12,12));
    roundpanel1.setOpaque(false);
	
	roundpanel2 = new RoundedPanel(30, Color.decode("#000000"));
    //roundpanel.setBounds(10,10,650,700);
	//roundpanel2.setBackground(new Color(0,0,0,0));
	roundpanel2.setLayout(new BoxLayout(roundpanel2, BoxLayout.Y_AXIS));
	roundpanel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	roundpanel2.setMinimumSize(new Dimension(838, 675));
	roundpanel2.setPreferredSize(new Dimension(835, 675));
	roundpanel2.setMaximumSize(new Dimension(865,685));
	roundpanel2.setBorder(new EmptyBorder(20,20,20,20));
    roundpanel2.setOpaque(false);
 

	buttonpan = new JPanel();
	buttonpan.setBackground(new Color(0,0,0,0));//new Color(240, 240, 240)
	buttonpan.setLayout(new BoxLayout(buttonpan, BoxLayout.Y_AXIS));
	buttonpan.setBorder(new EmptyBorder(20,55,10,15));
	buttonpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	buttonpan.setMinimumSize(new Dimension(200,100));
	buttonpan.setPreferredSize(new Dimension(200,100));
	buttonpan.setMaximumSize(new Dimension(400,200));
	

	cbutton1=new RoundedCornerHoverButton("     Continue     ");
	cbutton1.setFont(new Font("Comic Sans",Font.PLAIN,20));
	cbutton1.setBackground(Color.decode("#20b2aa"));//(new Color(4, 110, 92));
	cbutton1.setForeground(new Color(255,255,255));
	cbutton1.setCursor(handcursor);
	cbutton1.setOpaque(false);
    cbutton1.setContentAreaFilled(false);
    cbutton1.setBorderPainted(true);
	cbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	cbutton1.setFocusable(false);

	cbutton1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
	cbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//mbutton1.setForeground(Color.decode("#FA441D"));//error
			
		mbutton1.setForeground(Color.decode("#00ffff"));
	
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton4.setForeground(new Color(75, 162, 233));
		mbutton5.setForeground(new Color(75, 162, 233));
		
		contentpan.removeAll();
		contentpan.add(basicdetails(contentpan));
		contentpan.revalidate();
		
		BasicDetails=false;
		PersonalDetails=false;
		UserDetails=false;
		UserSkills=false;
		AccountDetails=false;
		
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(false);
		mbutton3.setEnabled(false);
		mbutton4.setEnabled(false);
		mbutton5.setEnabled(false);
		}		
		
	});
	
	
	JLabel titlelabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;Welcome to the Sign Up of the RAW</html>");
	titlelabel.setFont(new Font("Times New Roman",Font.BOLD,32));
	titlelabel.setForeground(new Color(0,241,197));
	titlelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	titlelabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	titlelabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	titlelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	titlelabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	titlelabel.setCursor(textcursor);
	
	JLabel buyersignlabel1 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Raw is here to serve you services.</html>");
	buyersignlabel1.setFont(new Font("Times New Roman",Font.PLAIN,20));
	buyersignlabel1.setForeground(new Color(153,230,179));
	buyersignlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyersignlabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	buyersignlabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	buyersignlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyersignlabel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignlabel1.setCursor(textcursor);
	
	JLabel buyersignlabel2 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;New here? Signup and then Log In to explore the new world with us.</html>");
	buyersignlabel2.setFont(new Font("Times New Roman",Font.PLAIN,20));
	buyersignlabel2.setForeground(new Color(68,215,168));//50,205,50
	buyersignlabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyersignlabel2.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	buyersignlabel2.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	buyersignlabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyersignlabel2.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignlabel2.setCursor(textcursor);
	
	JLabel buyersignlabel3 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Looking for a assistant? That's why RAW is here. <br>&nbsp;&nbsp;&nbsp;All you need to do is SignUp and LogIn to get the assistant.</html>");
	buyersignlabel3.setFont(new Font("Times New Roman",Font.PLAIN,20));
	buyersignlabel3.setForeground(new Color(153,230,179));
	buyersignlabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyersignlabel3.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	buyersignlabel3.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	buyersignlabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyersignlabel3.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignlabel3.setCursor(textcursor);
	
	JLabel buyersignlabel4 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;If there is any issue regarding the SignUp, please let us know through <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;the Contact Us option from the Home.</html>");
	buyersignlabel4.setFont(new Font("Times New Roman",Font.PLAIN,20));
	buyersignlabel4.setForeground(new Color(41,171,135));
	buyersignlabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyersignlabel4.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	buyersignlabel4.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	buyersignlabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyersignlabel4.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignlabel4.setCursor(textcursor);
	
	JLabel buyersignlabel5 = new JLabel("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Thanks for using RAW</html>");
	buyersignlabel5.setFont(new Font("Times New Roman",Font.BOLD,26));
	buyersignlabel5.setForeground(new Color(0,241,197));
	buyersignlabel5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	buyersignlabel5.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	buyersignlabel5.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	buyersignlabel5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	buyersignlabel5.setAlignmentX(Component.CENTER_ALIGNMENT);
	buyersignlabel5.setCursor(textcursor);
	
	
		
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 60)));
	roundpanel2.add(titlelabel);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 70)));
	roundpanel2.add(buyersignlabel1);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 30)));
	roundpanel2.add(buyersignlabel2);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 30)));
	roundpanel2.add(buyersignlabel3);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 30)));
	roundpanel2.add(buyersignlabel4);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 60)));
	roundpanel2.add(buyersignlabel5);
	roundpanel2.add(Box.createRigidArea(new Dimension(0, 40)));
	buttonpan.add(cbutton1);
	buttonpan.add(Box.createRigidArea(new Dimension(0, 10)));
	roundpanel2.add(buttonpan);
	roundpanel1.add(roundpanel2);
	infopan.add(Box.createRigidArea(new Dimension(0, 0)));
	infopan.add(roundpanel1);
	//infopan.add(Box.createRigidArea(new Dimension(3000, 10)));
	//infopan.add(Box.createRigidArea(new Dimension(1000, 15)));
	
		
	return infopan;	
}

		
public JPanel basicdetails(JPanel p)
{
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	JPanel basicpan = new JPanel();
	basicpan.setBackground(new Color(44, 47, 51));
	basicpan.setLayout(new BoxLayout(basicpan, BoxLayout.Y_AXIS));
	basicpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	basicpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	basicpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	basicpan.setMaximumSize(new Dimension(screensize.width, screensize.height));

	
	JPanel firstpanel = new JPanel();
	firstpanel.setBackground(new Color(44, 47, 51));
	firstpanel.setLayout(new BoxLayout(firstpanel, BoxLayout.Y_AXIS));
	firstpanel.setBorder(new EmptyBorder(0,0,0,0));


	JLabel label1 = new JLabel("<html>Basic Information</html>");
	label1.setFont(new Font("Calibri",Font.BOLD,40));
	label1.setForeground(Color.decode("#aaf0d1"));
	//label1.setBorder(new EmptyBorder(0,50,0,0));
	label1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	label1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label1.setAlignmentX(Component.LEFT_ALIGNMENT);
	label1.setOpaque(false);
	
	JPanel secondpanel = new JPanel();
	secondpanel.setBackground(new Color(44,47,51));
	secondpanel.setLayout(new BoxLayout(secondpanel, BoxLayout.Y_AXIS));
	secondpanel.setBorder(new EmptyBorder(0,0,0,0));
	secondpanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
	
	JPanel firstlastnamepanel = new JPanel();
	firstlastnamepanel.setBackground(new Color(44, 47, 51));
	firstlastnamepanel.setLayout(new BoxLayout(firstlastnamepanel, BoxLayout.X_AXIS));
	firstlastnamepanel.setBorder(new EmptyBorder(0,0,0,0));
	firstlastnamepanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel firstnamepanel = new JPanel();
	firstnamepanel.setBackground(new Color(44, 47, 51));
	firstnamepanel.setLayout(new BoxLayout(firstnamepanel, BoxLayout.Y_AXIS));
	firstnamepanel.setBorder(new EmptyBorder(0,0,0,0));
	//firstnamepanel.setBorder(null);
	firstnamepanel.setMinimumSize(new Dimension(300, 70));
	firstnamepanel.setPreferredSize(new Dimension(300, 70));
	firstnamepanel.setMaximumSize(new Dimension(550, 85));

	JLabel firstnamelabel = new JLabel("<html>First name <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/60)</font></font></html>");
	firstnamelabel.setFont(new Font("Calibri",Font.BOLD,18));
	firstnamelabel.setForeground(Color.decode("#7fffd4"));
	firstnamelabel.setBorder(new EmptyBorder(0,10,0,0));
	firstnamelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	firstnamelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	firstnamelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	firstnamelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	firstnamelabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	firstnamelabel.setOpaque(false);
	
	 
	
	HintTextField firstnametxtfield = new HintTextField("Enter your first name");//border ac-border inactive
	firstnametxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	firstnametxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	firstnametxtfield.activebgColor=Color.decode("#004953");
	firstnametxtfield.inactivebgColor=Color.decode("#091f23");
	firstnametxtfield.activefgColor=Color.WHITE;////////////color on type
	firstnametxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	firstnametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	firstnametxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	firstnametxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	firstnametxtfield.setForeground(Color.decode("#FFFFFF"));
	firstnametxtfield.setBackground(Color.decode("#091f23"));
	firstnametxtfield.setColumns(30);
	firstnametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    firstnametxtfield.addMouseListener(new FieldMouseListener());
	firstnametxtfield.setCaretColor(Color.WHITE);
	firstnametxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/

		firstnametxtfield.addKeyListener(new KeyAdapter() 
		{
			
			
		public void keyPressed(KeyEvent evt)
{
	if(firstnametxtfield.getText().length()==0)
	{
		fn = true;
		baslimit();
		
		firstnamelabel.setText("<html>First name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(firstnametxtfield.getText().length()+1)+"/60)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   fn=false;
		baslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	firstnamelabel.setText("<html>First name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(firstnametxtfield.getText().length())+"/60)</font></font></html>");

    }	
	}
	
}	
	


			
			
            public void keyTyped(KeyEvent evt) 
			{
				

     
	  if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|'))
				{	
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (firstnametxtfield.getText().length() > 0 && firstnametxtfield.getText().length() < 60) // limit textfield
				{
					
				
					fn = true;
					baslimit();
					
				
				firstnamelabel.setText("<html>First name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(firstnametxtfield.getText().length()+1)+"/60)</font></font></html>");
				}
				if(firstnametxtfield.getText().length() <= 0 || firstnametxtfield.getText().length() > 60)
				{
					fn = false;
					baslimit();
				}	
				if(firstnametxtfield.getText().length() >= 60)
				{
				
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
					
				
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
firstnamelabel.setText("<html>First name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(firstnametxtfield.getText().length())+"/60)</font></font></html>");

if(firstnametxtfield.getText().length() == 60)
				{
					
				firstnamelabel.setText("<html>First name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(firstnametxtfield.getText().length()-1)+"/60)</font></font></html>");
	
				}
				
				}

}	
			
        });
		
		if (SUBFIRST_NAME!="")
		{
			firstnametxtfield.setText(SUBFIRST_NAME);
		}
		
		
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	JPanel lastnamepanel = new JPanel();
	lastnamepanel.setBackground(new Color(44, 47, 51));
	lastnamepanel.setLayout(new BoxLayout(lastnamepanel, BoxLayout.Y_AXIS));
	lastnamepanel.setBorder(new EmptyBorder(0,0,0,0));
	//lastnamepanel.setBorder(null);
	lastnamepanel.setMinimumSize(new Dimension(300, 70));
	lastnamepanel.setPreferredSize(new Dimension(300, 70));
	lastnamepanel.setMaximumSize(new Dimension(550, 85));
	
	JLabel lastnamelabel = new JLabel("<html>Last name <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/40)</font></font></html>");
	lastnamelabel.setFont(new Font("Calibri",Font.BOLD,18));
	lastnamelabel.setForeground(Color.decode("#7fffd4"));
	lastnamelabel.setBorder(new EmptyBorder(0,10,0,0));
	lastnamelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	lastnamelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	lastnamelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	lastnamelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	lastnamelabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	lastnamelabel.setOpaque(false);
	
	HintTextField lastnametxtfield = new HintTextField("Enter your last name");//border ac-border inactive
	lastnametxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	lastnametxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	lastnametxtfield.activebgColor=Color.decode("#004953");//2f4f4f
	lastnametxtfield.inactivebgColor=Color.decode("#091f23");
	lastnametxtfield.activefgColor=Color.WHITE;
	lastnametxtfield.inactivefgColor=Color.decode("#009494");////////////color on type
	lastnametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	lastnametxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	lastnametxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	lastnametxtfield.setForeground(Color.decode("#FFFFFF"));
	lastnametxtfield.setBackground(Color.decode("#091f23"));
	lastnametxtfield.setColumns(30);
	lastnametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    lastnametxtfield.addMouseListener(new FieldMouseListener());
	lastnametxtfield.setCaretColor(Color.WHITE);
	lastnametxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*lastnametxtfield.setMinimumSize(new Dimension(100, 40));
	lastnametxtfield.setPreferredSize(new Dimension(100, 40));
	lastnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	
	lastnametxtfield.addKeyListener(new KeyAdapter()
		{
			
			public void keyPressed(KeyEvent evt)
{
	if(lastnametxtfield.getText().length()==0)
	{
		ln = true;
		baslimit();
		
		lastnamelabel.setText("<html>Last name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(lastnametxtfield.getText().length()+1)+"/40)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   ln=false;
		baslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	lastnamelabel.setText("<html>Last name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(lastnametxtfield.getText().length())+"/40)</font></font></html>");

    }	
	}
	
}	

            public void keyTyped(KeyEvent evt) 
			{
                if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|'))
				{	
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (lastnametxtfield.getText().length() > 0 && lastnametxtfield.getText().length() < 40) // limit textfield
				{
					ln = true;
					baslimit();
					
				lastnamelabel.setText("<html>Last name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(lastnametxtfield.getText().length()+1)+"/40)</font></font></html>");

				}
				if(lastnametxtfield.getText().length() <= 0 || lastnametxtfield.getText().length() > 40)
				{
					ln = false;
					baslimit();
				}	
				if(lastnametxtfield.getText().length() >= 40)
				{
					ln = false;
					baslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
lastnamelabel.setText("<html>Last name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(lastnametxtfield.getText().length())+"/40)</font></font></html>");

if(lastnametxtfield.getText().length() == 40)
				{
					
				lastnamelabel.setText("<html>Last name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(lastnametxtfield.getText().length()-1)+"/40)</font></font></html>");
	
				}
				
				}

}	
        });
		
				if (SUBLAST_NAME!="")
		{
			lastnametxtfield.setText(SUBLAST_NAME);
		}

///////////////////////////////////////////////////////////////////////////
JLabel newlabel = new JLabel(" ");
	newlabel.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel.setForeground(Color.decode("#ff4040"));
	newlabel.setBorder(new EmptyBorder(0,10,0,0));
	newlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel.setOpaque(false);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel emailconfirmemailpanel = new JPanel();
	emailconfirmemailpanel.setBackground(new Color(44, 47, 51));
	emailconfirmemailpanel.setLayout(new BoxLayout(emailconfirmemailpanel, BoxLayout.X_AXIS));
	emailconfirmemailpanel.setBorder(new EmptyBorder(0,0,0,0));
	emailconfirmemailpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel emailpanel = new JPanel();
	emailpanel.setBackground(new Color(44, 47, 51));
	emailpanel.setLayout(new BoxLayout(emailpanel, BoxLayout.Y_AXIS));
	emailpanel.setBorder(new EmptyBorder(0,0,0,0));
	//emailpanel.setBorder(null);
	emailpanel.setMinimumSize(new Dimension(300, 100));
	emailpanel.setPreferredSize(new Dimension(300,100));
	emailpanel.setMaximumSize(new Dimension(550, 110));
	
	JLabel emaillabel = new JLabel("<html>Email <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/100)</font></font></html>");
	emaillabel.setFont(new Font("Calibri",Font.BOLD,18));
	emaillabel.setForeground(Color.decode("#7fffd4"));
	emaillabel.setBorder(new EmptyBorder(0,10,0,0));
	emaillabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	emaillabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	emaillabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	emaillabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	emaillabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	emaillabel.setOpaque(false);
	
	
	///////////////////////////////////////////////////////////////////////////
JLabel newlabel1 = new JLabel("<html> </html>");
	newlabel1.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel1.setForeground(Color.decode("#ff4040"));
	newlabel1.setBorder(new EmptyBorder(0,10,0,0));
	newlabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel1.setOpaque(false);
	
	HintTextField emailtxtfield = new HintTextField("Enter your Email Id");//border ac-border inactive
	emailtxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	emailtxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	emailtxtfield.activebgColor=Color.decode("#004953");
	emailtxtfield.inactivebgColor=Color.decode("#091f23");
	emailtxtfield.activefgColor=Color.WHITE;
	emailtxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	emailtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	emailtxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	emailtxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	emailtxtfield.setForeground(Color.decode("#FFFFFF"));
	emailtxtfield.setBackground(Color.decode("#091f23"));
	emailtxtfield.setColumns(30);
	emailtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    emailtxtfield.addMouseListener(new FieldMouseListener());
	emailtxtfield.setCaretColor(Color.WHITE);
	emailtxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	emailtxtfield.addKeyListener(new KeyAdapter() 
		{
			validmail vm=new validmail();
			
			
		public void keyPressed(KeyEvent evt)
{
	if(emailtxtfield.getText().length()==0)
	{
		mail = true;
		baslimit();
		
		emaillabel.setText("<html>Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(emailtxtfield.getText().length()+1)+"/100)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   mail=false;
		baslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	emaillabel.setText("<html>Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(emailtxtfield.getText().length())+"/100)</font></font></html>");

    }	
	}
	
}	

            public void keyTyped(KeyEvent evt) 
			{
				
			if (emailtxtfield.getText().length() > 0 && emailtxtfield.getText().length() < 100) // limit textfield
			{
				if(vm.mailcheck(emailtxtfield.getText()))
				{
				mail = true;
				baslimit();
				newlabel.setText("<html> </html>");
				}
				else{
					newlabel.setText("<html>*Please Enter a Valid E-Mail.</html>");
				}
				
				
				emaillabel.setText("<html>Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(emailtxtfield.getText().length()+1)+"/100)</font></font></html>");
            


			}
			if(emailtxtfield.getText().length() <= 0 || emailtxtfield.getText().length() > 100)
			{
				mail = false;
				baslimit();
			}
			if(emailtxtfield.getText().length() >=100)
			{
				mail = false;
				baslimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			
            }
			
			public void keyReleased(KeyEvent evt) 
{ 
                if(vm.mailcheck(emailtxtfield.getText()))
				{
				mail = true;
				baslimit();
				newlabel.setText("<html> </html>");
				}
				else{
					newlabel.setText("<html>*Please Enter a Valid E-Mail.</html>");
				}
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
emaillabel.setText("<html>Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(emailtxtfield.getText().length())+"/100)</font></font></html>");

if(emailtxtfield.getText().length() == 100)
				{
					
				emaillabel.setText("<html>Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(emailtxtfield.getText().length()-1)+"/100)</font></font></html>");
	
				}
				
				}

}	
        });
		
		if (SUBEMAIL!="")
		{
			emailtxtfield.setText(SUBEMAIL);
		}	

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	JPanel confirmemailpanel = new JPanel();
	confirmemailpanel.setBackground(new Color(44, 47, 51));
	confirmemailpanel.setLayout(new BoxLayout(confirmemailpanel, BoxLayout.Y_AXIS));
	confirmemailpanel.setBorder(new EmptyBorder(0,0,0,0));
	//confirmemailpanel.setBorder(null);
	confirmemailpanel.setMinimumSize(new Dimension(300, 100));
	confirmemailpanel.setPreferredSize(new Dimension(300, 100));
	confirmemailpanel.setMaximumSize(new Dimension(550, 110));
	
	JLabel confirmemaillabel = new JLabel("<html>Confirm Email <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/100)</font></font></html>");
	confirmemaillabel.setFont(new Font("Calibri",Font.BOLD,18));
	confirmemaillabel.setForeground(Color.decode("#7fffd4"));
	confirmemaillabel.setBorder(new EmptyBorder(0,10,0,0));
	confirmemaillabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	confirmemaillabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	confirmemaillabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	confirmemaillabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	confirmemaillabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	confirmemaillabel.setOpaque(false);
	
	HintTextField confirmemailtxtfield = new HintTextField("Confirm your Email Id");//border ac-border inactive
	confirmemailtxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	confirmemailtxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	confirmemailtxtfield.activebgColor=Color.decode("#004953");
	confirmemailtxtfield.inactivebgColor=Color.decode("#091f23");
	confirmemailtxtfield.activefgColor=Color.WHITE;////////////color on type
	confirmemailtxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	confirmemailtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	confirmemailtxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	confirmemailtxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	confirmemailtxtfield.setForeground(Color.decode("#FFFFFF"));
	confirmemailtxtfield.setBackground(Color.decode("#091f23"));
	confirmemailtxtfield.setColumns(30);
	confirmemailtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    confirmemailtxtfield.addMouseListener(new FieldMouseListener());
	confirmemailtxtfield.setCaretColor(Color.WHITE);
	confirmemailtxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	confirmemailtxtfield.setTransferHandler(null);
		confirmemailtxtfield.addKeyListener(new KeyAdapter() 
		{
			
public void keyPressed(KeyEvent evt)
{
	if(mail)
	{
	if(confirmemailtxtfield.getText().length()==0)
	{
		cmail = true;
		baslimit();
		
		confirmemaillabel.setText("<html>Confirm Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmemailtxtfield.getText().length()+1)+"/100)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   cmail=false;
		baslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	confirmemaillabel.setText("<html>Confirm Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmemailtxtfield.getText().length())+"/100)</font></font></html>");

    }	
	}
	}
}	

            public void keyTyped(KeyEvent evt) 
			{
				if(!mail)
				{
					evt.consume();
					newlabel1.setText("<html>*Please Enter at E-Mail box first.</html>");
				}
			else{	
			if (confirmemailtxtfield.getText().length() > 0 && confirmemailtxtfield.getText().length() < 100) // limit textfield
			{
				
				
				if(confirmemailtxtfield.getText().equals(emailtxtfield.getText()))
				{
				cmail = true;
				baslimit();
				newlabel1.setText("<html> </html>");
				}
				else{
					newlabel1.setText("<html>*Please Enter as same as E-Mail.</html>");
				}
				
				
				confirmemaillabel.setText("<html>Confirm Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmemailtxtfield.getText().length()+1)+"/100)</font></font></html>");

			}
			if(confirmemailtxtfield.getText().length() <= 0 || confirmemailtxtfield.getText().length() > 100)
			{
				cmail = false;
				baslimit();
			}
			if(confirmemailtxtfield.getText().length() >=100)
			{
				cmail = false;
				baslimit();
				evt.consume();
				MouseClickSound ms=new MouseClickSound();
				ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
			}
			}
            }
			
			public void keyReleased(KeyEvent evt) 
{ 
if(mail)
{
if(confirmemailtxtfield.getText().equals(emailtxtfield.getText()))
				{
				cmail = true;
				baslimit();
				newlabel1.setText("<html> </html>");
				}
				else{
					newlabel1.setText("<html>*Please Enter as same as E-Mail.</html>");
				}	
}


if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
confirmemaillabel.setText("<html>Confirm Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmemailtxtfield.getText().length())+"/100)</font></font></html>");

if(confirmemailtxtfield.getText().length() == 100)
				{
					
				confirmemaillabel.setText("<html>Confirm Email <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmemailtxtfield.getText().length()-1)+"/100)</font></font></html>");
	
				}
				
				}

}	
		
        });
		
		if (SUBCON_EMAIL!="")
		{
			confirmemailtxtfield.setText(SUBCON_EMAIL);
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	

	JPanel genderpanel = new JPanel();
	genderpanel.setBackground(new Color(44, 47, 51));
	genderpanel.setLayout(new BoxLayout(genderpanel, BoxLayout.Y_AXIS));
	genderpanel.setBorder(new EmptyBorder(0,5,0,0));
	genderpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel radiopanel = new JPanel();
	radiopanel.setBackground(new Color(44, 47, 51));
	radiopanel.setLayout(new BoxLayout(radiopanel, BoxLayout.X_AXIS));
	radiopanel.setBorder(new EmptyBorder(0,0,0,0));
	radiopanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel genderlabel = new JLabel("<html>Please Select your Gender <font color=#ff4040>*</font></html>");
	genderlabel.setFont(new Font("Calibri",Font.BOLD,18));
	genderlabel.setForeground(Color.decode("#7fffd4"));
	genderlabel.setBorder(new EmptyBorder(0,10,0,0));
	genderlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	genderlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	genderlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	genderlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	genderlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	genderlabel.setOpaque(false);
	
	JRadioButton radio1 = new JRadioButton();
	radio1.setText(" Male ");
	radio1.setFont(new Font("Arial",Font.PLAIN,16));
	radio1.setBackground(new Color(44, 47, 51));
	radio1.setForeground(Color.decode("#c7c7c7"));
	radio1.setCursor(handcursor);
	radio1.setOpaque(true);
    radio1.setBorderPainted(false);
	radio1.setFocusable(false);
	radio1.setAlignmentX(Component.LEFT_ALIGNMENT);	
	
	radio1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			gen = true;
			baslimit();
		}		
		
	});		
	
	
	
	
	JRadioButton radio2 = new JRadioButton();
	radio2.setText(" Female ");
	radio2.setFont(new Font("Arial",Font.PLAIN,16));
	radio2.setBackground(new Color(44, 47, 51));
	radio2.setForeground(Color.decode("#c7c7c7"));
	radio2.setCursor(handcursor);
	radio2.setOpaque(true);
    radio2.setBorderPainted(false);
	radio2.setFocusable(false);
	radio2.setAlignmentX(Component.LEFT_ALIGNMENT);
	radio2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			gen = true;
			baslimit();
		}		
		
	});		
	
	JRadioButton radio3 = new JRadioButton();
	radio3.setText(" Others ");
	radio3.setFont(new Font("Arial",Font.PLAIN,16));
	radio3.setBackground(new Color(44, 47, 51));
	radio3.setForeground(Color.decode("#c7c7c7"));
	radio3.setCursor(handcursor);
	radio3.setOpaque(true);
    radio3.setBorderPainted(false);
	radio3.setFocusable(false);
	radio3.setAlignmentX(Component.LEFT_ALIGNMENT);	
	radio3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			
			gen = true;
			baslimit();
		}		
		
	});	
	
	if(SUBGENDER!="")
	{
		if(SUBGENDER==" Male ")
		{
			radio1.setSelected(true);
		}
		if(SUBGENDER==" Female ")
		{
			radio2.setSelected(true);
		}
		if(SUBGENDER==" Others ")
		{
			radio3.setSelected(true);
		}
	}
	
	
ButtonGroup bg = new ButtonGroup();
bg.add(radio1);
bg.add(radio2);
bg.add(radio3);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel countryphonenopanel = new JPanel();
	countryphonenopanel.setBackground(new Color(44, 47, 51));
	countryphonenopanel.setLayout(new BoxLayout(countryphonenopanel, BoxLayout.X_AXIS));
	countryphonenopanel.setBorder(new EmptyBorder(0,0,0,0));
	countryphonenopanel.setAlignmentX(Component.LEFT_ALIGNMENT);

	JPanel countrypanel = new JPanel();
	countrypanel.setBackground(new Color(44, 47, 51));
	countrypanel.setLayout(new BoxLayout(countrypanel, BoxLayout.Y_AXIS));
	countrypanel.setBorder(new EmptyBorder(0,0,0,0));
	countrypanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
    JPanel combopanel = new JPanel();
	combopanel.setBackground(new Color(44, 47, 51));
	combopanel.setLayout(new BoxLayout(combopanel, BoxLayout.X_AXIS));
	combopanel.setBorder(new EmptyBorder(0,0,0,0));
	combopanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	combopanel.setMinimumSize(new Dimension(300, 20));
	combopanel.setPreferredSize(new Dimension(300, 20));
	combopanel.setMaximumSize(new Dimension(300, 30));

	JLabel countrylabel = new JLabel("<html>Please Select your Country Code <font color=#ff4040>*</font></html>");
	countrylabel.setFont(new Font("Calibri",Font.BOLD,18));
	countrylabel.setForeground(Color.decode("#7fffd4"));
	countrylabel.setBorder(new EmptyBorder(0,10,0,0));
	countrylabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	countrylabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	countrylabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	countrylabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	countrylabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	countrylabel.setOpaque(false);

CustomComboBox comboi=new CustomComboBox(Color.decode("#091f23"),Color.WHITE,Color.decode("#004953"),Color.decode("#20b2aa"));//bg-fg-sbg-sfg

    comboi.setButtonH(Color.decode("#091f23"));
    comboi.setButtonDS(Color.decode("#20b2aa"));
    comboi.setButtonS(Color.BLACK);
    comboi.setButtonBG(new Color(44, 47, 51));


    JComboBox comb=comboi.customComboBox(comboi.countrycode());


            comb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                  
					
						if(comboi.getname()=="    Select Your Country")
					{
						ccode=false;
					baslimit();
					}
					else{
						ccode=true;
					baslimit();
					SUBCOUNTRY_CODE = comboi.getname();
					//System.out.println(SUBCOUNTRY_CODE);
					}
					
                
                }

            });

////////////////////////////////////////////////////////////////////////


	JLabel newlabel2 = new JLabel(" ");
	newlabel2.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel2.setForeground(Color.decode("#ff4040"));
	newlabel2.setBorder(new EmptyBorder(0,10,0,0));
	newlabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel2.setAlignmentY(Component.LEFT_ALIGNMENT);
	newlabel2.setOpaque(false);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel phonenopanel = new JPanel();
	phonenopanel.setBackground(new Color(44,47,51));
	phonenopanel.setLayout(new BoxLayout(phonenopanel, BoxLayout.Y_AXIS));
	phonenopanel.setBorder(new EmptyBorder(0,125,0,0));
	phonenopanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel phonenumbertxtpanel = new JPanel();
	phonenumbertxtpanel.setBackground(new Color(44,47,51));
	phonenumbertxtpanel.setLayout(new BoxLayout(phonenumbertxtpanel, BoxLayout.Y_AXIS));
	phonenumbertxtpanel.setBorder(new EmptyBorder(0,0,0,0));
	//emailpanel.setBorder(null);
	phonenumbertxtpanel.setMinimumSize(new Dimension(470, 50));
	phonenumbertxtpanel.setPreferredSize(new Dimension(470, 50));
	phonenumbertxtpanel.setMaximumSize(new Dimension(550, 62));
	
	JLabel phonenolabel = new JLabel("<html>Mobile Number <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/30)</font></font></html>");
	phonenolabel.setFont(new Font("Calibri",Font.BOLD,18));
	phonenolabel.setForeground(Color.decode("#7fffd4"));
	phonenolabel.setBorder(new EmptyBorder(0,10,0,0));
	phonenolabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	phonenolabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	phonenolabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	phonenolabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	phonenolabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	phonenolabel.setOpaque(false);
	
	HintTextField phonetxtfield = new HintTextField("Enter your Mobile Number");//border ac-border inactive
	phonetxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	phonetxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	phonetxtfield.activebgColor=Color.decode("#004953");
	phonetxtfield.inactivebgColor=Color.decode("#091f23");
	phonetxtfield.activefgColor=Color.WHITE;////////////color on type
	phonetxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	phonetxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	phonetxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	phonetxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	phonetxtfield.setForeground(Color.decode("#FFFFFF"));
	phonetxtfield.setBackground(Color.decode("#091f23"));
	phonetxtfield.setColumns(30);
	phonetxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    phonetxtfield.addMouseListener(new FieldMouseListener());
	phonetxtfield.setCaretColor(Color.WHITE);
	phonetxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	phonetxtfield.addKeyListener(new KeyAdapter() 
		{
validmobile vp= new validmobile();
public void keyPressed(KeyEvent evt)
{
	if(phonetxtfield.getText().length()==0)
	{
		phnno = true;
		baslimit();
		
		phonenolabel.setText("<html>Mobile Number <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(phonetxtfield.getText().length()+1)+"/30)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   phnno=false;
		baslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	phonenolabel.setText("<html>Mobile Number <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(phonetxtfield.getText().length())+"/30)</font></font></html>");

    }	
	}
	
}	
	
	
            public void keyTyped(KeyEvent evt) 
			{
                if (!Character.isDigit(evt.getKeyChar())) 
				{
                    evt.consume();
					phnno=false;
					baslimit();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (phonetxtfield.getText().length() > 0 && phonetxtfield.getText().length() < 30) // limit textfield
				{
					if(vp.mblnumberchecker(phonetxtfield.getText()))
					{
					phnno = true;
					baslimit();	
					newlabel2.setText("<html> </html>");
					}
					else{
					phnno = false;
					baslimit();		
					newlabel2.setText("<html>*Please Enter a Valid Mobile Number.</html>");
					}
					
				phonenolabel.setText("<html>Mobile Number <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(phonetxtfield.getText().length()+1)+"/30)</font></font></html>");

				}
				if(phonetxtfield.getText().length() <= 0 || phonetxtfield.getText().length() > 30)
				{
					phnno = false;
					baslimit();
				}	
				if(phonetxtfield.getText().length() >=30)
				{
					phnno = false;
					baslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
				public void keyReleased(KeyEvent evt) 
{ 
	{
if(vp.mblnumberchecker(phonetxtfield.getText()))
{
phnno = true;
baslimit();	
newlabel2.setText("<html> </html>");
}
else{
phnno = false;
baslimit();	
newlabel2.setText("<html>*Please Enter a Valid Mobile Number.</html>");
	
}
	}
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
phonenolabel.setText("<html>Mobile Number <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(phonetxtfield.getText().length())+"/30)</font></font></html>");

if(phonetxtfield.getText().length() == 30)
				{
					
				phonenolabel.setText("<html>Mobile Number <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(phonetxtfield.getText().length()-1)+"/30)</font></font></html>");
	
				}
				
				}

}	
        });
	
		if (SUBMOBILE_NUMBER!="")
		{
			phonetxtfield.setText(SUBMOBILE_NUMBER);
		}	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

JPanel lastpanel = new JPanel();
	lastpanel.setBackground(new Color(44,47,51));//44 47 51 
	lastpanel.setLayout(new BoxLayout(lastpanel, BoxLayout.X_AXIS));
	lastpanel.setBorder(new EmptyBorder(0,0,0,0));
	lastpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	lastpanel.setMinimumSize(new Dimension(1100, 50));
	lastpanel.setPreferredSize(new Dimension(1100, 50));
	lastpanel.setMaximumSize(new Dimension(1200, 60));
	
    JPanel removepanel1 = new JPanel();
	removepanel1.setBackground(new Color(44,47,51));
	removepanel1.setLayout(new BoxLayout(removepanel1, BoxLayout.Y_AXIS));
	removepanel1.setBorder(new EmptyBorder(0,0,0,0));
	removepanel1.setAlignmentY(Component.TOP_ALIGNMENT);
	
	JPanel nextpanel1 = new JPanel();
	nextpanel1.setBackground(new Color(44,47,51));
	nextpanel1.setLayout(new BoxLayout(nextpanel1, BoxLayout.Y_AXIS));
	nextpanel1.setBorder(new EmptyBorder(0,40,0,0));
	nextpanel1.setAlignmentY(Component.TOP_ALIGNMENT);
	
	
	JPanel thirdpanel = new JPanel();
	thirdpanel.setBackground(new Color(44, 47, 51));//44 47 51 
	thirdpanel.setLayout(new BoxLayout(thirdpanel, BoxLayout.X_AXIS));
	thirdpanel.setBorder(new EmptyBorder(0,0,0,0));
	thirdpanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
    thirdpanel.setMinimumSize(new Dimension(basicpan.getWidth(), 100));
	thirdpanel.setPreferredSize(new Dimension(basicpan.getWidth(), 100));
	thirdpanel.setMaximumSize(new Dimension(screensize.width, 100));
	
	JPanel removepanel = new JPanel();
	removepanel.setBackground(new Color(44, 47, 51));
	removepanel.setLayout(new BoxLayout(removepanel, BoxLayout.Y_AXIS));
	removepanel.setBorder(new EmptyBorder(0,0,0,0));
	removepanel.setAlignmentY(Component.TOP_ALIGNMENT);
	
	JPanel nextpanel = new JPanel();
	nextpanel.setBackground(new Color(44, 47, 51));
	nextpanel.setLayout(new BoxLayout(nextpanel, BoxLayout.Y_AXIS));
	nextpanel.setBorder(new EmptyBorder(0,0,0,0));
	nextpanel.setAlignmentY(Component.TOP_ALIGNMENT);


	Border submitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerHoverButton removeall = new RoundedCornerHoverButton("   Clear All   ");
	removeall.setFont(new Font("Comic Sans",Font.PLAIN,18));
	removeall.setBackground(Color.decode("#20b2aa"));
	removeall.setForeground(new Color(125,125,125));
	removeall.setForeground(Color.WHITE);
	removeall.setCursor(handcursor);
	removeall.setBorder(submitbttnborder);
	removeall.setOpaque(false);
	//removeall.setEnabled(false);
    removeall.setContentAreaFilled(false);
    removeall.setBorderPainted(true);
	removeall.setAlignmentX(Component.CENTER_ALIGNMENT);
	removeall.setFocusable(false);
	
	removeall.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
	removeall.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//mbutton1.setForeground(Color.decode("#FA441D"));//error
			
		mbutton1.setForeground(Color.decode("#00ffff"));
	
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton4.setForeground(new Color(75, 162, 233));
		mbutton5.setForeground(new Color(75, 162, 233));
		
		contentpan.removeAll();
		contentpan.add(basicdetails(contentpan));
		contentpan.revalidate();
		
		mbutton1.setEnabled(false);
		
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);
		}
		
		
	
		});
	
	////////////////////////////////////////////////////////////////////////
	
	bcontinue = new RoundedCornerHoverButton("     Continue     ");
	bcontinue.setFont(new Font("Comic Sans",Font.PLAIN,18));
	bcontinue.setBackground(Color.decode("#20b2aa"));
	bcontinue.setForeground(new Color(125,125,125));
	bcontinue.setForeground(Color.WHITE);
	bcontinue.setCursor(handcursor);
	bcontinue.setBorder(submitbttnborder);
	bcontinue.setOpaque(false);
	bcontinue.setEnabled(false);
    bcontinue.setContentAreaFilled(false);
    bcontinue.setBorderPainted(true);
	bcontinue.setAlignmentX(Component.CENTER_ALIGNMENT);
	bcontinue.setFocusable(false);
	
	
	bcontinue.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
		bcontinue.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		boolean semail=false;
		boolean smbl=false;
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		Statement statement=connection.createStatement();
		

	

	
	try{		
		
String emailsearch="SELECT * FROM `seller_signup_basic_details` WHERE EMAIL='"+ emailtxtfield.getText()+"'";
ResultSet result1=statement.executeQuery(emailsearch);	
		if(result1.next())
		{
			semail=true;
		
		}
		
		}catch(SQLException ae)
				{
					System.out.println(ae);
				}	
					
		try{
			
String mobilesearch="SELECT * FROM `seller_signup_basic_details` WHERE MOBILE_NUMBER='"+ phonetxtfield.getText()+"'";
ResultSet result2=statement.executeQuery(mobilesearch);		
	if(result2.next())
		{
			smbl=true;
		
		}

		}catch(SQLException ae)
				{
					System.out.println(ae);
				}	
		
		
		
			if(semail)
		{
		newlabel.setText("Sorry, This mail is already in our Database.");
			
		
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			bcontinue.setEnabled(false);
		}
		
	
		
	if(smbl)
		{
		newlabel2.setText("Sorry, This Mobile Number is already in our Database.");
			
		
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			bcontinue.setEnabled(false);
		}
		
		if(!semail && !smbl)
		{
			if(emailtxtfield.getText().equals(confirmemailtxtfield.getText()))
			{
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
		
		
		contentpan.removeAll();
		contentpan.add(personaldetails(contentpan));
		contentpan.revalidate();
		
		
		BasicDetails=true;		
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(false);
		mbutton4.setEnabled(false);
		mbutton5.setEnabled(false);
		
		
		
			if(radio1.isSelected())
			{
				SUBGENDER = radio1.getText();
			}
			if(radio2.isSelected())
			{
				SUBGENDER = radio2.getText();
			}
			if(radio3.isSelected())
			{
				SUBGENDER = radio3.getText();
			}
		
		
		SUBFIRST_NAME = firstnametxtfield.getText();
		SUBLAST_NAME = lastnametxtfield.getText();
		SUBEMAIL = emailtxtfield.getText();
		SUBCON_EMAIL = confirmemailtxtfield.getText();
		SUBMOBILE_NUMBER = phonetxtfield.getText();
		
					//System.out.println(SUBFIRST_NAME+"   "+SUBLAST_NAME+"   "+SUBEMAIL+"   "+SUBCON_EMAIL+"   "+SUBMOBILE_NUMBER+"   "+SUBCOUNTRY_CODE+"   "+SUBGENDER);

		}
		else{
			newlabel.setText("<html>Email and Confirm Email should be same.</html>");
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
		
		


		
		
		
		
		
		
		
		
		}		
		
	});	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
firstpanel.add(Box.createRigidArea(new Dimension(10, 20)));
firstpanel.add(label1);
firstpanel.add(Box.createRigidArea(new Dimension(0, 25)));

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

firstnamepanel.add(Box.createRigidArea(new Dimension(5, 0)));
firstnamepanel.add(firstnamelabel);
firstnamepanel.add(Box.createRigidArea(new Dimension(5, 5)));
firstnamepanel.add(firstnametxtfield);

firstnamepanel.add(Box.createRigidArea(new Dimension(5, 0)));
lastnamepanel.add(lastnamelabel);
lastnamepanel.add(Box.createRigidArea(new Dimension(5, 5)));
lastnamepanel.add(lastnametxtfield);

firstlastnamepanel.add(firstnamepanel);
firstlastnamepanel.add(Box.createRigidArea(new Dimension(40, 0)));
firstlastnamepanel.add(lastnamepanel);


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

emailpanel.add(Box.createRigidArea(new Dimension(5, 0)));
emailpanel.add(emaillabel);
emailpanel.add(Box.createRigidArea(new Dimension(5, 5)));
emailpanel.add(emailtxtfield);
emailpanel.add(newlabel);
	
confirmemailpanel.add(Box.createRigidArea(new Dimension(5, 0)));
confirmemailpanel.add(confirmemaillabel);
confirmemailpanel.add(Box.createRigidArea(new Dimension(5, 5)));
confirmemailpanel.add(confirmemailtxtfield);
confirmemailpanel.add(newlabel1);


emailconfirmemailpanel.add(emailpanel);
emailconfirmemailpanel.add(Box.createRigidArea(new Dimension(40, 0)));
emailconfirmemailpanel.add(confirmemailpanel);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

combopanel.add(Box.createRigidArea(new Dimension(10, 0)));
combopanel.add(comb);
countrypanel.add(Box.createRigidArea(new Dimension(20, 0)));
countrypanel.add(countrylabel);
countrypanel.add(Box.createRigidArea(new Dimension(0, 5)));
countrypanel.add(combopanel);

phonenopanel.add(Box.createRigidArea(new Dimension(60, 0)));
phonenopanel.add(phonenolabel);
phonenumbertxtpanel.add(phonetxtfield);
phonenopanel.add(phonenumbertxtpanel);
phonenopanel.add(newlabel2);

countryphonenopanel.add(countrypanel);
countryphonenopanel.add(Box.createRigidArea(new Dimension(60, 0)));
countryphonenopanel.add(phonenopanel);
countryphonenopanel.add(Box.createRigidArea(new Dimension(160, 0)));

///////////////////////////////////////////////////////////////////////////////////////////////////////////

genderpanel.add(Box.createRigidArea(new Dimension(5, 0)));
genderpanel.add(genderlabel);
radiopanel.add(Box.createRigidArea(new Dimension(10, 10)));
radiopanel.add(radio1);
radiopanel.add(Box.createRigidArea(new Dimension(20, 10)));
radiopanel.add(radio2);
radiopanel.add(Box.createRigidArea(new Dimension(20, 10)));
radiopanel.add(radio3);
genderpanel.add(Box.createRigidArea(new Dimension(0, 10)));
genderpanel.add(radiopanel);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

secondpanel.add(firstlastnamepanel);
secondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
secondpanel.add(emailconfirmemailpanel);
secondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
secondpanel.add(countryphonenopanel);
secondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
secondpanel.add(genderpanel);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

removepanel.add(removeall);
nextpanel.add(bcontinue);	
thirdpanel.add(Box.createRigidArea(new Dimension(100, 0)));
thirdpanel.add(Box.createRigidArea(new Dimension(0, 50)));

thirdpanel.add(removepanel);
thirdpanel.add(Box.createRigidArea(new Dimension(740, 0)));
thirdpanel.add(Box.createRigidArea(new Dimension(0, 50)));
thirdpanel.add(nextpanel);	


//thirdpanel.add(Box.createRigidArea(new Dimension(1000, 0)));

basicpan.add(firstpanel);
basicpan.add(Box.createRigidArea(new Dimension(0, 20)));
basicpan.add(secondpanel);
basicpan.add(Box.createRigidArea(new Dimension(0, 200)));
basicpan.add(thirdpanel);


	return basicpan;	
}
	
public JPanel personaldetails(JPanel p)
{
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
		JPanel personalpan = new JPanel();
	personalpan.setBackground(new Color(44, 47, 51));
	personalpan.setLayout(new BoxLayout(personalpan, BoxLayout.Y_AXIS));
	personalpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	personalpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	personalpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	personalpan.setMaximumSize(new Dimension(screensize.width, screensize.height));
		
	
	JPanel Pfirstpanel = new JPanel();
	Pfirstpanel.setBackground(new Color(0,0,0,0));
	Pfirstpanel.setLayout(new BoxLayout(Pfirstpanel, BoxLayout.Y_AXIS));
	Pfirstpanel.setBorder(new EmptyBorder(0,0,0,0));
	
	JLabel plabel1 = new JLabel("<html>Personal Details</html>");
	plabel1.setFont(new Font("Calibri",Font.BOLD,40));
	plabel1.setForeground(Color.decode("#aaf0d1"));
	//label1.setBorder(new EmptyBorder(0,50,0,0));
	plabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	plabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	plabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	plabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	plabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	plabel1.setOpaque(false);
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	JPanel Psecondpanel = new JPanel();
	Psecondpanel.setBackground(new Color(0,0,0,0));
	Psecondpanel.setLayout(new BoxLayout(Psecondpanel, BoxLayout.Y_AXIS));
	Psecondpanel.setBorder(new EmptyBorder(0,0,0,0));
	Psecondpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel dateofbirthpanel = new JPanel();
	dateofbirthpanel.setBackground(new Color(44,47,51));//44, 47, 51
	dateofbirthpanel.setLayout(new BoxLayout(dateofbirthpanel, BoxLayout.X_AXIS));
	dateofbirthpanel.setBorder(new EmptyBorder(0,15,0,0));
	dateofbirthpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	dateofbirthpanel.setMinimumSize(new Dimension(1000, 70));
	dateofbirthpanel.setPreferredSize(new Dimension(1000, 70));
	dateofbirthpanel.setMaximumSize(new Dimension(1100, 85));
	
	
	
	JPanel dateofbirthrightpan = new JPanel();
	dateofbirthrightpan.setBackground(new Color(44,47,51));//44, 47, 51
	dateofbirthrightpan.setLayout(new BoxLayout(dateofbirthrightpan, BoxLayout.Y_AXIS));
	dateofbirthrightpan.setBorder(new EmptyBorder(35,0,0,0));
	dateofbirthrightpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	dateofbirthrightpan.setMinimumSize(new Dimension(200, 30));
	dateofbirthrightpan.setPreferredSize(new Dimension(200, 30));
	dateofbirthrightpan.setMaximumSize(new Dimension(300, 60));
	
	
	JPanel dateofbirthleftpan = new JPanel();
	dateofbirthleftpan.setBackground(new Color(44,47,51));//44, 47, 51
	dateofbirthleftpan.setLayout(new BoxLayout(dateofbirthleftpan, BoxLayout.Y_AXIS));
	dateofbirthleftpan.setBorder(new EmptyBorder(0,0,0,0));
	dateofbirthleftpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	dateofbirthleftpan.setMinimumSize(new Dimension(200, 70));
	dateofbirthleftpan.setPreferredSize(new Dimension(200, 70));
	dateofbirthleftpan.setMaximumSize(new Dimension(350, 85));
	
	
	JPanel datecombopanel = new JPanel();
	datecombopanel.setBackground(new Color(44,47,51));
	datecombopanel.setLayout(new BoxLayout(datecombopanel, BoxLayout.X_AXIS));
	datecombopanel.setBorder(new EmptyBorder(0,0,0,0));
	//emailpanel.setBorder(null);
	datecombopanel.setMinimumSize(new Dimension(300, 70));
	datecombopanel.setPreferredSize(new Dimension(300, 70));
	datecombopanel.setMaximumSize(new Dimension(550, 85));
	
	
	JPanel combopanel1 = new JPanel();
	combopanel1.setBackground(new Color(44,47,51));
	combopanel1.setLayout(new BoxLayout(combopanel1, BoxLayout.X_AXIS));
	combopanel1.setBorder(new EmptyBorder(0,0,0,0));
	//emailpanel.setBorder(null);
	combopanel1.setMinimumSize(new Dimension(20, 20));
	combopanel1.setPreferredSize(new Dimension(20, 20));
	combopanel1.setMaximumSize(new Dimension(60, 30));
	
	JPanel combopanell2 = new JPanel();
	combopanell2.setBackground(new Color(44,47,51));
	combopanell2.setLayout(new BoxLayout(combopanell2, BoxLayout.X_AXIS));
	combopanell2.setBorder(new EmptyBorder(0,0,0,0));
	//combopanel2.setBorder(null);
	combopanell2.setMinimumSize(new Dimension(100, 20));
	combopanell2.setPreferredSize(new Dimension(100, 20));
	combopanell2.setMaximumSize(new Dimension(120, 30));
	
	JPanel combopanel3 = new JPanel();
	combopanel3.setBackground(new Color(44,47,51));
	combopanel3.setLayout(new BoxLayout(combopanel3, BoxLayout.X_AXIS));
	combopanel3.setBorder(new EmptyBorder(0,0,0,0));
	//combopanel3.setBorder(null);
	combopanel3.setMinimumSize(new Dimension(80, 20));
	combopanel3.setPreferredSize(new Dimension(80, 20));
	combopanel3.setMaximumSize(new Dimension(100, 30));
////////////////////////////////////////////////////////////////////////////////////////////

    JLabel newlabel3 = new JLabel(" ");
	newlabel3.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel3.setForeground(Color.decode("#ff4040"));
	newlabel3.setBorder(new EmptyBorder(0,0,0,0));
	newlabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel3.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel3.setOpaque(false);

////////////////////////////////////////////////////////////////////////////////////////////


	
	JLabel dateofbirthlabel = new JLabel("<html>Date of Birth <font color=#ff4040>*</font></html>");
	dateofbirthlabel.setFont(new Font("Calibri",Font.BOLD,18));
	dateofbirthlabel.setForeground(Color.decode("#7fffd4"));
	dateofbirthlabel.setBorder(new EmptyBorder(0,10,0,0));
	dateofbirthlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	dateofbirthlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	dateofbirthlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	dateofbirthlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	dateofbirthlabel.setAlignmentX(Component.RIGHT_ALIGNMENT);
	dateofbirthlabel.setOpaque(false);
	
CustomComboBox combodate=new CustomComboBox(Color.decode("#091f23"),Color.WHITE,Color.decode("#004953"),Color.decode("#20b2aa"));//bg-fg-sbg-sfg

    combodate.setButtonH(Color.decode("#091f23"));
    combodate.setButtonDS(Color.decode("#20b2aa"));
    combodate.setButtonS(Color.BLACK);
    combodate.setButtonBG(new Color(44, 47, 51));


    JComboBox combdate=combodate.customComboBox(combodate.bdate());


            combdate.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    personalpan.repaint();
					if(combodate.getname()==" Day")
					{
						birda=false;
					perlimit();
					}
					else{
						if(birye==true && birmo==true)
						{
							SUBBIRTH_DATE = combodate.getname();
		                SUBBIRTH_DATE= SUBBIRTH_DATE.replace(" ", "");
		                SUBBIRTH_MONTH= SUBBIRTH_MONTH.replace(" ", "");
		                SUBBIRTH_YEAR= SUBBIRTH_YEAR.replace(" ", "");
						
							validdate vd=new validdate();
							String valid=SUBBIRTH_DATE+"/"+SUBBIRTH_MONTH+"/"+SUBBIRTH_YEAR;
							if(vd.isLegalDate(valid))
							{
							birda=true;
							perlimit();
					       
						   newlabel3.setText("<html> </html>");
							}
							else{
								birda=false;
								perlimit();
								newlabel3.setText("<html>*Please Enter a Valid Date.</html>");
							}
							
							
						
						}
						else{
							birda=true;
							perlimit();
							SUBBIRTH_DATE = combodate.getname();
						}
					
					}
					
                    
                }

            });
	
CustomComboBox combomonth=new CustomComboBox(Color.decode("#091f23"),Color.WHITE,Color.decode("#004953"),Color.decode("#20b2aa"));//bg-fg-sbg-sfg

    combomonth.setButtonH(Color.decode("#091f23"));
    combomonth.setButtonDS(Color.decode("#20b2aa"));
    combomonth.setButtonS(Color.BLACK);
    combomonth.setButtonBG(new Color(44, 47, 51));


    JComboBox combmonth=combomonth.customComboBox(combomonth.bmonth());


            combmonth.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    
					personalpan.repaint();
					
					if(combomonth.getname()=="   Month")
					{
						birmo=false;
					perlimit();
					}
					else{

					
						if(birye==true && birda==true)
						{
							SUBBIRTH_MONTH = combomonth.getname();
		                SUBBIRTH_DATE= SUBBIRTH_DATE.replace(" ", "");
		                SUBBIRTH_MONTH= SUBBIRTH_MONTH.replace(" ", "");
		                SUBBIRTH_YEAR= SUBBIRTH_YEAR.replace(" ", "");
						
							validdate vd=new validdate();
							String valid=SUBBIRTH_DATE+"/"+SUBBIRTH_MONTH+"/"+SUBBIRTH_YEAR;
							if(vd.isLegalDate(valid))
							{
							birmo=true;
					perlimit();
					
					newlabel3.setText("<html> </html>");
							}
							else{
								birmo=false;
								perlimit();
								newlabel3.setText("<html>*Please Enter a Valid Date.</html>");
							}
							
							
						
						}
						else{
							birmo=true;
					perlimit();
					SUBBIRTH_MONTH = combomonth.getname();
						}
					}
                }

            });
	
CustomComboBox comboyear=new CustomComboBox(Color.decode("#091f23"),Color.WHITE,Color.decode("#004953"),Color.decode("#20b2aa"));//bg-fg-sbg-sfg

    comboyear.setButtonH(Color.decode("#091f23"));
    comboyear.setButtonDS(Color.decode("#20b2aa"));
    comboyear.setButtonS(Color.BLACK);
    comboyear.setButtonBG(new Color(44, 47, 51));


    JComboBox combyear=comboyear.customComboBox(comboyear.byear());


            combyear.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                   personalpan.repaint();

					if(comboyear.getname()=="   Year")
					{
						birye=false;
					perlimit();
					}
					else{
						
					
					if(birmo==true && birda==true)
						{
							SUBBIRTH_YEAR = comboyear.getname();
						
		                SUBBIRTH_DATE= SUBBIRTH_DATE.replace(" ", "");
		                SUBBIRTH_MONTH= SUBBIRTH_MONTH.replace(" ", "");
		                SUBBIRTH_YEAR= SUBBIRTH_YEAR.replace(" ", "");
							validdate vd=new validdate();
							String valid=SUBBIRTH_DATE+"/"+SUBBIRTH_MONTH+"/"+SUBBIRTH_YEAR;
							//System.out.print(valid);
							if(vd.isLegalDate(valid))
							{
							birye=true;
					perlimit();
					
					newlabel3.setText("<html> </html>");
							}
							else{
								
								birye=false;
								perlimit();
								newlabel3.setText("<html>*Please Enter a Valid Date.</html>");
							}
							
							
						
						}
						else{
							birye=true;
					perlimit();
					SUBBIRTH_YEAR = comboyear.getname();
						}
					}
                }

            });
		
///////////////////////////////////////////////////////////////////////////////////////////
 lastlabel = new JLabel("<html>*Please fill up at least one National Document Number between NID and Passport.</html>");
	lastlabel.setFont(new Font("Calibri",Font.PLAIN,16));
	lastlabel.setForeground(Color.decode("#ff4040"));
	lastlabel.setBorder(new EmptyBorder(0,0,0,0));
	lastlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	lastlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	lastlabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	lastlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	lastlabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	lastlabel.setOpaque(false);

    JPanel nidpassportpanel = new JPanel();
	nidpassportpanel.setBackground(new Color(44, 47, 51));
	nidpassportpanel.setLayout(new BoxLayout(nidpassportpanel, BoxLayout.X_AXIS));
	nidpassportpanel.setBorder(new EmptyBorder(10,0,0,0));
	nidpassportpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel nidpanel = new JPanel();
	nidpanel.setBackground(new Color(44, 47, 51));
	nidpanel.setLayout(new BoxLayout(nidpanel, BoxLayout.Y_AXIS));
	nidpanel.setBorder(new EmptyBorder(0,0,0,0));
	//nidpanel.setBorder(null);
	nidpanel.setMinimumSize(new Dimension(290, 100));
	nidpanel.setPreferredSize(new Dimension(290, 100));
	nidpanel.setMaximumSize(new Dimension(550, 110));
	
	JLabel newlabel13 = new JLabel("<html> </html>");
	newlabel13.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel13.setForeground(Color.decode("#ff4040"));
	newlabel13.setBorder(new EmptyBorder(0,10,0,0));
	newlabel13.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel13.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel13.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel13.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel13.setAlignmentY(Component.LEFT_ALIGNMENT);
	newlabel13.setOpaque(false);
	
	
	JLabel nidlabel = new JLabel("<html>National Identity Number <font color=#838996> <font size = 4>(0/25)</font></font></html>");
	nidlabel.setFont(new Font("Calibri",Font.BOLD,18));
	nidlabel.setForeground(Color.decode("#7fffd4"));
	nidlabel.setBorder(new EmptyBorder(0,10,0,0));
	nidlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	nidlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	nidlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	nidlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	nidlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	nidlabel.setOpaque(false);
	
	HintTextField nidtxtfield = new HintTextField("Enter your nid number");//border ac-border inactive
	nidtxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	nidtxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	nidtxtfield.activebgColor=Color.decode("#004953");
	nidtxtfield.inactivebgColor=Color.decode("#091f23");
	nidtxtfield.activefgColor=Color.WHITE;////////////color on type
	nidtxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	nidtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	nidtxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	nidtxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	nidtxtfield.setForeground(Color.decode("#FFFFFF"));
	nidtxtfield.setBackground(Color.decode("#091f23"));
	nidtxtfield.setColumns(30);
	nidtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    nidtxtfield.addMouseListener(new FieldMouseListener());
	nidtxtfield.setCaretColor(Color.WHITE);
	nidtxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	
		nidtxtfield.addKeyListener(new KeyAdapter() 
		{
			
			public void keyPressed(KeyEvent evt)
{
	if(nidtxtfield.getText().length()==0)
	{
		nid = true;
		perlimit();
		
		nidlabel.setText("<html>National Identity Number "+" <font color=#838996> <font size = 4>("+(nidtxtfield.getText().length()+1)+"/25)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   nid=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	nidlabel.setText("<html>National Identity Number "+" <font color=#838996> <font size = 4>("+(nidtxtfield.getText().length())+"/25)</font></font></html>");

    }	
	}
	
}

            public void keyTyped(KeyEvent evt) 
			{
                if (!Character.isDigit(evt.getKeyChar())) 
				{
                    evt.consume();
					nid=false;
					perlimit();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (nidtxtfield.getText().length() > 0 && nidtxtfield.getText().length() < 25) // limit textfield
				{
					nid = true;
					perlimit();
					
				nidlabel.setText("<html>National Identity Number "+" <font color=#838996> <font size = 4>("+(nidtxtfield.getText().length()+1)+"/25)</font></font></html>");

				}
				if(nidtxtfield.getText().length() <= 0 || nidtxtfield.getText().length() > 25)
				{
					nid = false;
					perlimit();
				}	
				if(nidtxtfield.getText().length() >=25)
				{
					nid = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
			public void keyReleased(KeyEvent evt) 
{
newlabel13.setText("<html> </html>");	

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
nidlabel.setText("<html>National Identity Number "+" <font color=#838996> <font size = 4>("+(nidtxtfield.getText().length())+"/25)</font></font></html>");

if(nidtxtfield.getText().length() == 25)
				{
					
				nidlabel.setText("<html>National Identity Number "+" <font color=#838996> <font size = 4>("+(nidtxtfield.getText().length()-1)+"/25)</font></font></html>");
	
				}
				
				}

}	
        });
		
		if (SUBNID_NUMBER!="")
		{
			nidtxtfield.setText(SUBNID_NUMBER);
		}	
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
		JLabel newlabel12 = new JLabel("<html> </html>");
	newlabel12.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel12.setForeground(Color.decode("#ff4040"));
	newlabel12.setBorder(new EmptyBorder(0,10,0,0));
	newlabel12.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel12.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel12.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel12.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel12.setAlignmentY(Component.LEFT_ALIGNMENT);
	newlabel12.setOpaque(false);
	
	JPanel passportpanel = new JPanel();
	passportpanel.setBackground(new Color(44, 47, 51));
	passportpanel.setLayout(new BoxLayout(passportpanel, BoxLayout.Y_AXIS));
	passportpanel.setBorder(new EmptyBorder(0,0,0,0));
	//passportpanel.setBorder(null);
	passportpanel.setMinimumSize(new Dimension(300, 100));
	passportpanel.setPreferredSize(new Dimension(300, 100));
	passportpanel.setMaximumSize(new Dimension(550, 110));
	
	JLabel passportlabel = new JLabel("<html>Passport Number <font color=#838996> <font size = 4>(0/25)</font></font></html>");
	passportlabel.setFont(new Font("Calibri",Font.BOLD,18));
	passportlabel.setForeground(Color.decode("#7fffd4"));
	passportlabel.setBorder(new EmptyBorder(0,10,0,0));
	passportlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	passportlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	passportlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	passportlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	passportlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	passportlabel.setOpaque(false);
	
	HintTextField passporttxtfield = new HintTextField("Enter your passport no");//border ac-border inactive
	passporttxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	passporttxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	passporttxtfield.activebgColor=Color.decode("#004953");
	passporttxtfield.inactivebgColor=Color.decode("#091f23");
	passporttxtfield.activefgColor=Color.WHITE;////////////color on type
	passporttxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	passporttxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	passporttxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	passporttxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	passporttxtfield.setForeground(Color.decode("#FFFFFF"));
	passporttxtfield.setBackground(Color.decode("#091f23"));
	passporttxtfield.setColumns(30);
	passporttxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    passporttxtfield.addMouseListener(new FieldMouseListener());
	passporttxtfield.setCaretColor(Color.WHITE);
	passporttxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*lastnametxtfield.setMinimumSize(new Dimension(100, 40));
	lastnametxtfield.setPreferredSize(new Dimension(100, 40));
	lastnametxtfield.setMaximumSize(new Dimension(200, 60));*/	
	
	passporttxtfield.addKeyListener(new KeyAdapter() 
		{
			
			public void keyPressed(KeyEvent evt)
{
	if(passporttxtfield.getText().length()==0)
	{
		ppno = true;
		perlimit();
		
		passportlabel.setText("<html>Passport Number "+" <font color=#838996> <font size = 4>("+(passporttxtfield.getText().length()+1)+"/25)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   ppno=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	passportlabel.setText("<html>Passport Number "+" <font color=#838996> <font size = 4>("+(passporttxtfield.getText().length())+"/25)</font></font></html>");

    }	
	}
	
}	

            public void keyTyped(KeyEvent evt) 
			{
                if ( evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|')
				{	
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				if (passporttxtfield.getText().length() > 0 && passporttxtfield.getText().length() < 25) // limit textfield
				{
					ppno = true;
					perlimit();
					passportlabel.setText("<html>Passport Number "+" <font color=#838996> <font size = 4>("+(passporttxtfield.getText().length()+1)+"/25)</font></font></html>");

				}
				if(passporttxtfield.getText().length() <= 0 || passporttxtfield.getText().length() >25)
				{
					ppno = false;
					perlimit();
				}	
				if(passporttxtfield.getText().length() >=25)
				{
					ppno = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
			public void keyReleased(KeyEvent evt) 
{ 
newlabel12.setText("<html> </html>");
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
passportlabel.setText("<html>Passport Number "+" <font color=#838996> <font size = 4>("+(passporttxtfield.getText().length())+"/25)</font></font></html>");

if(passporttxtfield.getText().length() == 25)
				{
					
				passportlabel.setText("<html>Passport Number "+" <font color=#838996> <font size = 4>("+(passporttxtfield.getText().length()-1)+"/25)</font></font></html>");
	
				}
				
				}

}	
        });	
		
		if (SUBPASSPORT_NUMBER!="")
		{
			passporttxtfield.setText(SUBPASSPORT_NUMBER);
		}	
///////////////////////////////////////////////////////////////////////////////////////////
    
	JPanel nationcountrypanel = new JPanel();
	nationcountrypanel.setBackground(new Color(44, 47, 51));
	nationcountrypanel.setLayout(new BoxLayout(nationcountrypanel, BoxLayout.X_AXIS));
	nationcountrypanel.setBorder(new EmptyBorder(0,0,0,0));
	nationcountrypanel.setAlignmentX(Component.LEFT_ALIGNMENT);

    JPanel nationpanel = new JPanel();
	nationpanel.setBackground(new Color(44, 47, 51));
	nationpanel.setLayout(new BoxLayout(nationpanel, BoxLayout.Y_AXIS));
	nationpanel.setBorder(new EmptyBorder(0,5,0,0));
	nationpanel.setMinimumSize(new Dimension(300, 70));
	nationpanel.setPreferredSize(new Dimension(300, 70));
	nationpanel.setMaximumSize(new Dimension(550, 85));
	//nationpanel.setAlignmentX(Component.LEFT_ALIGNMENT);


	
	JLabel nationlabel = new JLabel("<html>Nationality <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/50)</font></font></html>");
	nationlabel.setFont(new Font("Calibri",Font.BOLD,18));
	nationlabel.setForeground(Color.decode("#7fffd4"));
	nationlabel.setBorder(new EmptyBorder(0,10,0,0));
	nationlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	nationlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	nationlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	nationlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	nationlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	nationlabel.setOpaque(false);
	
	HintTextField nationtxtfield = new HintTextField("Enter nationality");//border ac-border inactive
	nationtxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	nationtxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	nationtxtfield.activebgColor=Color.decode("#004953");
	nationtxtfield.inactivebgColor=Color.decode("#091f23");
	nationtxtfield.activefgColor=Color.WHITE;////////////color on type
	nationtxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	nationtxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	nationtxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	nationtxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	nationtxtfield.setForeground(Color.decode("#FFFFFF"));
	nationtxtfield.setBackground(Color.decode("#091f23"));
	nationtxtfield.setColumns(30);
	nationtxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    nationtxtfield.addMouseListener(new FieldMouseListener());
	nationtxtfield.setCaretColor(Color.WHITE);
	nationtxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		nationtxtfield.addKeyListener(new KeyAdapter() 
		{
			
			public void keyPressed(KeyEvent evt)
{
	if(nationtxtfield.getText().length()==0)
	{
		natlity = true;
		perlimit();
		
		nationlabel.setText("<html>Nationality "+" <font color=#838996> <font size = 4>("+(nationtxtfield.getText().length()+1)+"/50)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   natlity=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	nationlabel.setText("<html>Nationality "+" <font color=#838996> <font size = 4>("+(nationtxtfield.getText().length())+"/50)</font></font></html>");

    }	
	}
	
}	
	
	
            public void keyTyped(KeyEvent evt) 
			{
                if ((Character.isDigit(evt.getKeyChar()) || evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|'))
				{	
                    evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (nationtxtfield.getText().length() > 0 && nationtxtfield.getText().length() < 50) // limit textfield
				{
					natlity = true;
					perlimit();
					
					nationlabel.setText("<html>Nationality "+" <font color=#838996> <font size = 4>("+(nationtxtfield.getText().length()+1)+"/50)</font></font></html>");

				}
				if(nationtxtfield.getText().length() <= 0 || nationtxtfield.getText().length() >50)
				{
					natlity = false;
					perlimit();
				}	
				if(nationtxtfield.getText().length() >=50)
				{
					natlity = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
nationlabel.setText("<html>Nationality "+" <font color=#838996> <font size = 4>("+(nationtxtfield.getText().length())+"/50)</font></font></html>");

if(nationtxtfield.getText().length() == 50)
				{
					
				nationlabel.setText("<html>Nationality "+" <font color=#838996> <font size = 4>("+(nationtxtfield.getText().length()-1)+"/50)</font></font></html>");
	
				}
				
				}

}	
    
        });
		
		if (SUBNATIONALITY!="")
		{
			nationtxtfield.setText(SUBNATIONALITY);
		}
	
///////////////////////////////////////////////////////////////////////////////////////////////

    JPanel countrypanel = new JPanel();
	countrypanel.setBackground(new Color(44, 47, 51));
	countrypanel.setLayout(new BoxLayout(countrypanel, BoxLayout.Y_AXIS));
	countrypanel.setBorder(new EmptyBorder(0,0,0,0));
	countrypanel.setMinimumSize(new Dimension(300, 70));
	countrypanel.setPreferredSize(new Dimension(300, 70));
	countrypanel.setMaximumSize(new Dimension(550, 85));
	//countrypanel.setAlignmentY(Component.LEFT_ALIGNMENT);

	
	
	JLabel countrylabel = new JLabel("<html>Country <font color=#ff4040>*</font></html>");
	countrylabel.setFont(new Font("Calibri",Font.BOLD,18));
	countrylabel.setForeground(Color.decode("#7fffd4"));
	countrylabel.setBorder(new EmptyBorder(0,10,0,0));
	countrylabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	countrylabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	countrylabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	countrylabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	countrylabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	countrylabel.setOpaque(false);
	
	 JPanel combopanel2 = new JPanel();
	combopanel2.setBackground(new Color(44, 47, 51));
	combopanel2.setLayout(new BoxLayout(combopanel2, BoxLayout.X_AXIS));
	combopanel2.setBorder(new EmptyBorder(0,0,0,0));
	combopanel2.setAlignmentX(Component.LEFT_ALIGNMENT);
	combopanel2.setMinimumSize(new Dimension(300, 20));
	combopanel2.setPreferredSize(new Dimension(300, 20));
	combopanel2.setMaximumSize(new Dimension(300, 30));
	
CustomComboBox combocountry=new CustomComboBox(Color.decode("#091f23"),Color.WHITE,Color.decode("#004953"),Color.decode("#20b2aa"));//bg-fg-sbg-sfg

    combocountry.setButtonH(Color.decode("#091f23"));
    combocountry.setButtonDS(Color.decode("#20b2aa"));
    combocountry.setButtonS(Color.BLACK);
    combocountry.setButtonBG(new Color(44, 47, 51));


    JComboBox combcountry=combocountry.customComboBox(combocountry.country());
/*combcountry. addMouseListener(new MouseAdapter() { 
     public void mousePressed(MouseEvent me) { 
      personalpan.repaint();
     } 
    }); 
*/
            combcountry.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    
					personalpan.repaint();
					
					if(combocountry.getname()=="    Select Your Country")
					{
						coun=false;
					perlimit();
					}
					else{
						coun=true;
					perlimit();
					SUBCOUNTRY = combocountry.getname();
					//System.out.println(SUBCOUNTRY);
					}
					
                }

            });
	
///////////////////////////////////////////////////////////////////////////////////////////////

    JPanel address1panel = new JPanel();
	address1panel.setBackground(new Color(44, 47, 51));
	address1panel.setLayout(new BoxLayout(address1panel, BoxLayout.Y_AXIS));
	address1panel.setBorder(new EmptyBorder(10,0,0,0));
	address1panel.setAlignmentX(Component.LEFT_ALIGNMENT);
	address1panel.setMinimumSize(new Dimension(1000, 90));
	address1panel.setPreferredSize(new Dimension(1000, 90));
	address1panel.setMaximumSize(new Dimension(1137, 100));
	
	
	JLabel address1label = new JLabel("<html>Street Address <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/200)</font></font></html>");
	address1label.setFont(new Font("Calibri",Font.BOLD,18));
	address1label.setForeground(Color.decode("#7fffd4"));
	address1label.setBorder(new EmptyBorder(0,10,0,0));
	address1label.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	address1label.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	address1label.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	address1label.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	address1label.setAlignmentY(Component.LEFT_ALIGNMENT);
	address1label.setOpaque(false);
	
	HintTextField address1txtfield = new HintTextField("Where do you live? (Street Name and Number)");//border ac-border inactive
	address1txtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	address1txtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	address1txtfield.activebgColor=Color.decode("#004953");
	address1txtfield.inactivebgColor=Color.decode("#091f23");
	address1txtfield.activefgColor=Color.WHITE;////////////color on type
	address1txtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	address1txtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	address1txtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	address1txtfield.setFont(new Font("Arial",Font.PLAIN,16));
	address1txtfield.setForeground(Color.decode("#FFFFFF"));
	address1txtfield.setBackground(Color.decode("#091f23"));
	address1txtfield.setColumns(30);
	address1txtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    address1txtfield.addMouseListener(new FieldMouseListener());
	address1txtfield.setCaretColor(Color.WHITE);
	address1txtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		address1txtfield.addKeyListener(new KeyAdapter() 
		{
			
			public void keyPressed(KeyEvent evt)
{
	if(address1txtfield.getText().length()==0)
	{
		sadd = true;
		perlimit();
		
		address1label.setText("<html>Street Address <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(address1txtfield.getText().length()+1)+"/200)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   sadd=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	address1label.setText("<html>Street Address <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(address1txtfield.getText().length())+"/200)</font></font></html>");

    }	
	}
	
}	

            public void keyTyped(KeyEvent evt) 
			{
				
				if (address1txtfield.getText().length() > 0 && address1txtfield.getText().length() < 200) // limit textfield
				{
					sadd = true;
					perlimit();
					address1label.setText("<html>Street Address <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(address1txtfield.getText().length()+1)+"/200)</font></font></html>");

				}
				if(address1txtfield.getText().length() <= 0 || address1txtfield.getText().length() >200)
				{
					sadd = false;
					perlimit();
				}	
				if(address1txtfield.getText().length() >=200)
				{
					sadd = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
address1label.setText("<html>Street Address <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(address1txtfield.getText().length())+"/200)</font></font></html>");

if(address1txtfield.getText().length() == 200)
				{
					
				nationlabel.setText("<html>Street Address <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(address1txtfield.getText().length()-1)+"/200)</font></font></html>");
	
				}
				
				}

}	
    
        
        });	
	
			if (SUBSTREET_ADDRESS!="")
		{
			address1txtfield.setText(SUBSTREET_ADDRESS);
		}
	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

    JPanel address2panel = new JPanel();
	address2panel.setBackground(new Color(44, 47, 51));//44, 47, 51
	address2panel.setLayout(new BoxLayout(address2panel, BoxLayout.Y_AXIS));
	address2panel.setBorder(new EmptyBorder(10,0,0,0));
	address2panel.setAlignmentX(Component.LEFT_ALIGNMENT);
	address2panel.setMinimumSize(new Dimension(100, 90));
	address2panel.setPreferredSize(new Dimension(1000, 90));
	address2panel.setMaximumSize(new Dimension(1137, 100));
	
	
	JLabel address2label = new JLabel("<html>Address Line 2 <font color=#838996> <font size = 4>(0/200)</font></font></html>");
	address2label.setFont(new Font("Calibri",Font.BOLD,18));
	address2label.setForeground(Color.decode("#7fffd4"));
	address2label.setBorder(new EmptyBorder(0,10,0,0));
	address2label.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	address2label.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	address2label.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	address2label.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	address2label.setAlignmentY(Component.LEFT_ALIGNMENT);
	address2label.setOpaque(false);
	
	HintTextField address2txtfield = new HintTextField("Specify Street Information (If have)");//border ac-border inactive
	address2txtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	address2txtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	address2txtfield.activebgColor=Color.decode("#004953");
	address2txtfield.inactivebgColor=Color.decode("#091f23");
	address2txtfield.activefgColor=Color.WHITE;////////////color on type
	address2txtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	address2txtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	address2txtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	address2txtfield.setFont(new Font("Arial",Font.PLAIN,16));
	address2txtfield.setForeground(Color.decode("#FFFFFF"));
	address2txtfield.setBackground(Color.decode("#091f23"));
	address2txtfield.setColumns(30);
	address2txtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    address2txtfield.addMouseListener(new FieldMouseListener());
	address2txtfield.setCaretColor(Color.WHITE);
	address2txtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
		address2txtfield.addKeyListener(new KeyAdapter() 
		{
				public void keyPressed(KeyEvent evt)
{
	if(address2txtfield.getText().length()==0)
	{
		add2 = true;
		perlimit();
		
		
		address2label.setText("<html>Address Line 2 "+" <font color=#838996> <font size = 4>("+(address2txtfield.getText().length()+1)+"/200)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   add2=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	address2label.setText("<html>Address Line 2 "+" <font color=#838996> <font size = 4>("+(address2txtfield.getText().length())+"/200)</font></font></html>");

    }	
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				
				if (address2txtfield.getText().length() > 0 && address2txtfield.getText().length() < 200) // limit textfield
				{
					add2 = true;
					perlimit();
					address2label.setText("<html>Address Line 2 "+" <font color=#838996> <font size = 4>("+(address2txtfield.getText().length()+1)+"/200)</font></font></html>");

				}
				if(address2txtfield.getText().length() <= 0 || address2txtfield.getText().length() >= 200)
				{
					add2 = false;
					perlimit();
				}	
				if(address2txtfield.getText().length() >=200)
				{
					add2 = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
				public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
address2label.setText("<html>Address Line 2 "+" <font color=#838996> <font size = 4>("+(address2txtfield.getText().length())+"/200)</font></font></html>");

if(address2txtfield.getText().length() == 200)
				{
					
				address2label.setText("<html>Address Line 2 "+" <font color=#838996> <font size = 4>("+(address2txtfield.getText().length()-1)+"/200)</font></font></html>");
	
				}
				
				}

}	
        });	
		
		if (SUBADDRESS_LINE_2!="")
		{
			address2txtfield.setText(SUBADDRESS_LINE_2);
		}		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////

     JPanel citystatepanel = new JPanel();
	citystatepanel.setBackground(new Color(44, 47, 51));
	citystatepanel.setLayout(new BoxLayout(citystatepanel, BoxLayout.X_AXIS));
	citystatepanel.setBorder(new EmptyBorder(0,0,0,0));
	citystatepanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel citypanel = new JPanel();
	citypanel.setBackground(new Color(44, 47, 51));
	citypanel.setLayout(new BoxLayout(citypanel, BoxLayout.Y_AXIS));
	citypanel.setBorder(new EmptyBorder(0,0,0,0));
	//citypanel.setBorder(null);
	citypanel.setMinimumSize(new Dimension(300, 70));
	citypanel.setPreferredSize(new Dimension(300, 70));
	citypanel.setMaximumSize(new Dimension(550, 85));

	JLabel citylabel = new JLabel("<html>City <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/80)</font></font></html>");
	citylabel.setFont(new Font("Calibri",Font.BOLD,18));
	citylabel.setForeground(Color.decode("#7fffd4"));
	citylabel.setBorder(new EmptyBorder(0,10,0,0));
	citylabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	citylabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	citylabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	citylabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	citylabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	citylabel.setOpaque(false);
	
	HintTextField citytxtfield = new HintTextField("City name");//border ac-border inactive
	citytxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	citytxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	citytxtfield.activebgColor=Color.decode("#004953");
	citytxtfield.inactivebgColor=Color.decode("#091f23");
	citytxtfield.activefgColor=Color.WHITE;////////////color on type
	citytxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	citytxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	citytxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	citytxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	citytxtfield.setForeground(Color.decode("#FFFFFF"));
	citytxtfield.setBackground(Color.decode("#091f23"));
	citytxtfield.setColumns(30);
	citytxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    citytxtfield.addMouseListener(new FieldMouseListener());
	citytxtfield.setCaretColor(Color.WHITE);
	citytxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	
	
		citytxtfield.addKeyListener(new KeyAdapter() 
		{
			
			
				public void keyPressed(KeyEvent evt)
{
	if(citytxtfield.getText().length()==0)
	{
		cit = true;
		perlimit();
		
		
		citylabel.setText("<html>City <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(citytxtfield.getText().length()+1)+"/80)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   cit=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	citylabel.setText("<html>City <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(citytxtfield.getText().length())+"/80)</font></font></html>");

    }	
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				
				if (citytxtfield.getText().length() > 0 && citytxtfield.getText().length() < 80) // limit textfield
				{
					cit = true;
					perlimit();
					citylabel.setText("<html>City <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(citytxtfield.getText().length()+1)+"/80)</font></font></html>");

				}
				if(citytxtfield.getText().length() <= 0 || citytxtfield.getText().length() >80)
				{
					cit = false;
					perlimit();
				}	
				if(citytxtfield.getText().length() >= 80)
				{
					cit = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
							public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
citylabel.setText("<html>City <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(citytxtfield.getText().length())+"/80)</font></font></html>");

if(citytxtfield.getText().length() == 80)
				{
					
				citylabel.setText("<html>City <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(citytxtfield.getText().length()-1)+"/80)</font></font></html>");
	
				}
				
				}

}	
        });	
			
		if (SUBCITY!="")
		{
			citytxtfield.setText(SUBCITY);
		}	
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	JPanel statepanel = new JPanel();
	statepanel.setBackground(new Color(44, 47, 51));
	statepanel.setLayout(new BoxLayout(statepanel, BoxLayout.Y_AXIS));
	statepanel.setBorder(new EmptyBorder(0,0,0,0));
	//statepanel.setBorder(null);
	statepanel.setMinimumSize(new Dimension(300, 70));
	statepanel.setPreferredSize(new Dimension(300, 70));
	statepanel.setMaximumSize(new Dimension(550, 85));
	
	JLabel statelabel = new JLabel("<html>State/ Province/ Region <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/50)</font></font></html>");
	statelabel.setFont(new Font("Calibri",Font.BOLD,18));
	statelabel.setForeground(Color.decode("#7fffd4"));
	statelabel.setBorder(new EmptyBorder(0,10,0,0));
	statelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	statelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	statelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	statelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	statelabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	statelabel.setOpaque(false);
	
	HintTextField statetxtfield = new HintTextField("State/ Province/ Region name");//border ac-border inactive
	statetxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	statetxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	statetxtfield.activebgColor=Color.decode("#004953");
	statetxtfield.inactivebgColor=Color.decode("#091f23");
	statetxtfield.activefgColor=Color.WHITE;////////////color on type
	statetxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	statetxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	statetxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	statetxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	statetxtfield.setForeground(Color.decode("#FFFFFF"));
	statetxtfield.setBackground(Color.decode("#091f23"));
	statetxtfield.setColumns(30);
	statetxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    statetxtfield.addMouseListener(new FieldMouseListener());
	statetxtfield.setCaretColor(Color.WHITE);
	statetxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*lastnametxtfield.setMinimumSize(new Dimension(100, 40));
	lastnametxtfield.setPreferredSize(new Dimension(100, 40));
	lastnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	
		statetxtfield.addKeyListener(new KeyAdapter() 
		{
			
				public void keyPressed(KeyEvent evt)
{
	if(statetxtfield.getText().length()==0)
	{
		prov = true;
		perlimit();
		
		
		statelabel.setText("<html>State/ Province/ Region <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(statetxtfield.getText().length()+1)+"/50)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   prov=false;
		perlimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	statelabel.setText("<html>State/ Province/ Region <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(statetxtfield.getText().length())+"/50)</font></font></html>");

    }	
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				
				if (statetxtfield.getText().length() > 0 && statetxtfield.getText().length() < 50) // limit textfield
				{
					prov = true;
					perlimit();
					
				statelabel.setText("<html>State/ Province/ Region <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(statetxtfield.getText().length()+1)+"/50)</font></font></html>");

				}
				if(statetxtfield.getText().length() <= 0 || statetxtfield.getText().length() >50)
				{
					prov = false;
					perlimit();
				}	
				if(statetxtfield.getText().length() >=50)
				{
					prov = false;
					perlimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}	
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
statelabel.setText("<html>State/ Province/ Region <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(statetxtfield.getText().length())+"/50)</font></font></html>");

if(statetxtfield.getText().length() == 50)
				{
					
				statelabel.setText("<html>State/ Province/ Region <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(statetxtfield.getText().length()-1)+"/50)</font></font></html>");
	
				}
				
				}

}	
        });		

		if (SUBSTATE!="")
		{
			statetxtfield.setText(SUBSTATE);
		}
		
		
///////////////////////////////////////////////////////////////////////////////////////////////////////////

    JPanel lastlabelpan = new JPanel();
	lastlabelpan.setBackground(new Color(44, 47, 51));
	lastlabelpan.setLayout(new BoxLayout(lastlabelpan, BoxLayout.Y_AXIS));
	lastlabelpan.setBorder(new EmptyBorder(0,50,0,0));
	lastlabelpan.setMinimumSize(new Dimension(1000, 20));
	lastlabelpan.setPreferredSize(new Dimension(1000, 20));
	lastlabelpan.setMaximumSize(new Dimension(1100, 30));
	//statepanel.setBorder(null);
	
	
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
	JPanel lastpanel = new JPanel();
	lastpanel.setBackground(new Color(44,47,51));//44 47 51 
	lastpanel.setLayout(new BoxLayout(lastpanel, BoxLayout.X_AXIS));
	lastpanel.setBorder(new EmptyBorder(0,0,0,0));
	lastpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	lastpanel.setMinimumSize(new Dimension(1100, 40));
	lastpanel.setPreferredSize(new Dimension(1100, 40));
	lastpanel.setMaximumSize(new Dimension(1200, 50));
	
    JPanel removepanel1 = new JPanel();
	removepanel1.setBackground(new Color(44,47,51));
	removepanel1.setLayout(new BoxLayout(removepanel1, BoxLayout.Y_AXIS));
	removepanel1.setBorder(new EmptyBorder(0,0,0,0));
	removepanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel nextpanel1 = new JPanel();
	nextpanel1.setBackground(new Color(44,47,51));
	nextpanel1.setLayout(new BoxLayout(nextpanel1, BoxLayout.Y_AXIS));
	nextpanel1.setBorder(new EmptyBorder(0,40,0,0));
	nextpanel1.setAlignmentX(Component.LEFT_ALIGNMENT);


	Border submitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerHoverButton removeall1 = new RoundedCornerHoverButton("   Clear All   ");
	removeall1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	removeall1.setBackground(Color.decode("#20b2aa"));
	removeall1.setForeground(new Color(125,125,125));
	removeall1.setForeground(Color.WHITE);
	removeall1.setCursor(handcursor);
	removeall1.setBorder(submitbttnborder);
	removeall1.setOpaque(false);
	//removeall1.setEnabled(false);
    removeall1.setContentAreaFilled(false);
    removeall1.setBorderPainted(true);
	removeall1.setAlignmentX(Component.CENTER_ALIGNMENT);
	removeall1.setFocusable(false);
	
	removeall1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
	removeall1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
		
		
		contentpan.removeAll();
		contentpan.add(personaldetails(contentpan));
		contentpan.revalidate();
		
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(false);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);
		
		}		
		
	});	
	
	//////////////////////////////////////////////////////////////////////////
	
	pcontinue = new RoundedCornerHoverButton("     Continue     ");
	pcontinue.setFont(new Font("Comic Sans",Font.PLAIN,18));
	//pcontinue.setBackground(new Color(125,125,125));
	pcontinue.setBackground(Color.decode("#20b2aa"));
	pcontinue.setForeground(new Color(125,125,125));
	pcontinue.setForeground(Color.WHITE);
	pcontinue.setCursor(handcursor);
	pcontinue.setBorder(submitbttnborder);
	pcontinue.setOpaque(false);
	pcontinue.setEnabled(false);
    pcontinue.setContentAreaFilled(false);
    pcontinue.setBorderPainted(true);
	pcontinue.setAlignmentX(Component.CENTER_ALIGNMENT);
	pcontinue.setFocusable(false);
	
	pcontinue.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
		pcontinue.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		boolean snid=false;
		boolean sppn=false;
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		
		try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		Statement statement=connection.createStatement();
		

	

	
	try{		
		
String nidsearch="SELECT * FROM `seller_signup_personal_details` WHERE NID_NUMBER='"+ nidtxtfield.getText()+"'";
ResultSet result1=statement.executeQuery(nidsearch);	
		if(result1.next())
		{
			snid=true;
		
		}
		
		}catch(SQLException ae)
				{
					System.out.println(ae);
				}	
					
		try{
			
String ppnsearch="SELECT * FROM `seller_signup_personal_details` WHERE PASSPORT_NUMBER='"+ passporttxtfield.getText()+"'";
ResultSet result2=statement.executeQuery(ppnsearch);		
	if(result2.next())
		{
			sppn=true;
		
		}

		}catch(SQLException ae)
				{
					System.out.println(ae);
				}	
		
		
		
			if(snid)
		{
		newlabel13.setText("<html>Sorry, This NID Number is already in our Database.</html>");
			
		
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			bcontinue.setEnabled(false);
		}
		
	
		
	if(sppn)
		{
		newlabel12.setText("<html>Sorry, This Passport Number is already in our Database.</html>");
			
		
		ms.clickSound("Resources/Audio/Common/error_1.wav",submiterrorvolume);
			bcontinue.setEnabled(false);
		}
		
		if(!snid && !sppn)
		{
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(userdetails(contentpan));
		contentpan.revalidate();
			
		PersonalDetails=true;
			
			
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(false);
		mbutton5.setEnabled(false);
		
		
		//SUBNID_NUMBER = nidtxtfield.getText();
		//SUBPASSPORT_NUMBER = passporttxtfield.getText();
		
		if (nidtxtfield.getText().equals("Enter your nid number"))
		{
			SUBNID_NUMBER = "N/A";
		}
		if (!nidtxtfield.getText().equals("Enter your nid number"))
		{
			SUBNID_NUMBER = nidtxtfield.getText();
		}
		
		if (passporttxtfield.getText().equals("Enter your passport no"))
		{
			SUBPASSPORT_NUMBER = "N/A";
		}
		if (!passporttxtfield.getText().equals("Enter your passport no"))
		{
			SUBPASSPORT_NUMBER = passporttxtfield.getText();
		}
		
		if (address2txtfield.getText().equals("Specify Street Information (If have)"))
		{
			SUBADDRESS_LINE_2 = "N/A";
		}
		if (!address2txtfield.getText().equals("Specify Street Information (If have)"))
		{
			SUBADDRESS_LINE_2 = address2txtfield.getText();
		}
		
		
		SUBNATIONALITY = nationtxtfield.getText();
		SUBSTREET_ADDRESS = address1txtfield.getText();
		
		SUBCITY = citytxtfield.getText();
		SUBSTATE = statetxtfield.getText();
		
		//System.out.println(SUBNID_NUMBER+"   "+SUBPASSPORT_NUMBER+"   "+SUBNATIONALITY+"   "+SUBSTREET_ADDRESS+"   "+SUBADDRESS_LINE_2+"   "+SUBCITY+"   "+SUBSTATE);
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

/////////////////////////////////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
    Pfirstpanel.add(Box.createRigidArea(new Dimension(8, 20)));
    Pfirstpanel.add(plabel1);
	Pfirstpanel.add(Box.createRigidArea(new Dimension(0, 25)));
	
	
	
	combopanel1.add(combdate);
	combopanell2.add(combmonth);
	combopanel3.add(combyear);

	
	datecombopanel.add(Box.createRigidArea(new Dimension(10,0)));
	datecombopanel.add(combopanel1);
	datecombopanel.add(Box.createRigidArea(new Dimension(10,0)));
	datecombopanel.add(combopanell2);
	datecombopanel.add(Box.createRigidArea(new Dimension(10,0)));
	datecombopanel.add(combopanel3);

	
	dateofbirthleftpan.add(dateofbirthlabel);
	dateofbirthleftpan.add(datecombopanel);
	dateofbirthrightpan.add(newlabel3);
	
	
	dateofbirthpanel.add(dateofbirthleftpan);
	dateofbirthpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	dateofbirthpanel.add(dateofbirthrightpan);
	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	nidpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	nidpanel.add(nidlabel);
	nidpanel.add(Box.createRigidArea(new Dimension(5, 5)));
	nidpanel.add(nidtxtfield);
	nidpanel.add(newlabel13);
	nidpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	
	passportpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	passportpanel.add(passportlabel);
	passportpanel.add(Box.createRigidArea(new Dimension(5, 5)));
	passportpanel.add(passporttxtfield);
	passportpanel.add(newlabel12);
	passportpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	
	nidpassportpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	nidpassportpanel.add(nidpanel);
	nidpassportpanel.add(Box.createRigidArea(new Dimension(40, 0)));
	nidpassportpanel.add(passportpanel);
	
	////////////////////////////////////////////////////////////////////////////////////
	
	nationpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	nationpanel.add(nationlabel);
	nationpanel.add(Box.createRigidArea(new Dimension(5, 5)));
	nationpanel.add(nationtxtfield);
	nationpanel.add(Box.createRigidArea(new Dimension(5, 0)));
	

    combopanel2.add(Box.createRigidArea(new Dimension(15, 0)));
    combopanel2.add(combcountry);
	countrypanel.add(Box.createRigidArea(new Dimension(5, 0)));
	countrypanel.add(countrylabel);
	countrypanel.add(Box.createRigidArea(new Dimension(15, 0)));
	countrypanel.add(Box.createRigidArea(new Dimension(0, 5)));
	countrypanel.add(combopanel2);
	countrypanel.add(Box.createRigidArea(new Dimension(5, 0)));
	
	nationcountrypanel.add(nationpanel);
	nationcountrypanel.add(Box.createRigidArea(new Dimension(40, 0)));
	nationcountrypanel.add(countrypanel);
	
	//////////////////////////////////////////////////////////////////////////////////////
	
	address1panel.add(Box.createRigidArea(new Dimension(3, 0)));
	address1panel.add(address1label);
	address1panel.add(Box.createRigidArea(new Dimension(3, 5)));
	address1panel.add(address1txtfield);
	
	///////////////////////////////////////////////////////////////////////////////////////
	
	address2panel.add(Box.createRigidArea(new Dimension(3, 0)));
	address2panel.add(address2label);
	address2panel.add(Box.createRigidArea(new Dimension(3, 5)));
	address2panel.add(address2txtfield);
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	citypanel.add(Box.createRigidArea(new Dimension(5, 0)));
	citypanel.add(citylabel);
	citypanel.add(Box.createRigidArea(new Dimension(5, 5)));
	citypanel.add(citytxtfield);
	citypanel.add(Box.createRigidArea(new Dimension(0, 0)));

	
	statepanel.add(Box.createRigidArea(new Dimension(5, 0)));
	statepanel.add(statelabel);
	statepanel.add(Box.createRigidArea(new Dimension(5, 5)));
	statepanel.add(statetxtfield);
	statepanel.add(Box.createRigidArea(new Dimension(5, 0)));
	
	citystatepanel.add(citypanel);
	citystatepanel.add(Box.createRigidArea(new Dimension(40, 0)));
	citystatepanel.add(statepanel);
	
	
	lastlabelpan.add(lastlabel);
	
	
	
	////////////////////////////////////////////////////////////////////////////////////
	
	
	
	Psecondpanel.add(dateofbirthpanel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	Psecondpanel.add(nidpassportpanel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	Psecondpanel.add(nationcountrypanel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	Psecondpanel.add(address1panel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	Psecondpanel.add(address2panel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	Psecondpanel.add(citystatepanel);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	Psecondpanel.add(lastlabelpan);
	Psecondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	//removepanel1.add(Box.createRigidArea(new Dimension(50, 0)));
	removepanel1.add(removeall1);
	nextpanel1.add(pcontinue);	
    lastpanel.add(Box.createRigidArea(new Dimension(100, 0)));
	lastpanel.add(Box.createRigidArea(new Dimension(0, 170)));
	
	
    lastpanel.add(removepanel1);
    lastpanel.add(Box.createRigidArea(new Dimension(700, 0)));
    lastpanel.add(Box.createRigidArea(new Dimension(0, 170)));
    lastpanel.add(nextpanel1);
		
	
	personalpan.add(Box.createRigidArea(new Dimension(0, 0)));
	personalpan.add(Pfirstpanel);
	personalpan.add(Box.createRigidArea(new Dimension(0, 20)));
	personalpan.add(Psecondpanel);
	personalpan.add(Box.createRigidArea(new Dimension(0, 0)));
	Psecondpanel.add(lastpanel);
	personalpan.add(Box.createRigidArea(new Dimension(0, 00)));

	//personalpan.add(Pthirdpanel);

	
		
	
		
		
	return personalpan;	
}


public JPanel userdetails(JPanel p)
{
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	JPanel userpan = new JPanel();
	userpan.setBackground(new Color(44, 47, 51));
	userpan.setLayout(new BoxLayout(userpan, BoxLayout.Y_AXIS));
	userpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	userpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	userpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	userpan.setMaximumSize(new Dimension(screensize.width, screensize.height));

    JPanel usdfirstpanel = new JPanel();
	usdfirstpanel.setBackground(new Color(44, 47, 51));
	usdfirstpanel.setLayout(new BoxLayout(usdfirstpanel, BoxLayout.Y_AXIS));
	usdfirstpanel.setBorder(new EmptyBorder(0,40,0,0));

	JLabel label101 = new JLabel("<html>User Details</html>");
	label101.setFont(new Font("Calibri",Font.BOLD,40));
	label101.setForeground(Color.decode("#aaf0d1"));
	//label101.setBorder(new EmptyBorder(0,50,0,0));
	label101.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	label101.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	label101.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	label101.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	label101.setAlignmentX(Component.LEFT_ALIGNMENT);
	label101.setOpaque(false);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    JPanel usdsecondpanel = new JPanel();
	usdsecondpanel.setBackground(new Color(44,47,51));
	usdsecondpanel.setLayout(new BoxLayout(usdsecondpanel, BoxLayout.Y_AXIS));
	usdsecondpanel.setBorder(new EmptyBorder(0,0,0,0));
	usdsecondpanel.setAlignmentX(Component.LEFT_ALIGNMENT);

	
	JPanel userconfirmuserpanel = new JPanel();
	userconfirmuserpanel.setBackground(new Color(44, 47, 51));
	userconfirmuserpanel.setLayout(new BoxLayout(userconfirmuserpanel, BoxLayout.X_AXIS));
	userconfirmuserpanel.setBorder(new EmptyBorder(0,0,0,0));
	userconfirmuserpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel newlabel4 = new JLabel("<html> </html>");
	newlabel4.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel4.setForeground(Color.decode("#ff4040"));
	newlabel4.setBorder(new EmptyBorder(0,10,0,0));
	newlabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel4.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel4.setOpaque(false);
	
	
	JPanel usernamepanel = new JPanel();
	usernamepanel.setBackground(new Color(44, 47, 51));
	usernamepanel.setLayout(new BoxLayout(usernamepanel, BoxLayout.Y_AXIS));
	usernamepanel.setBorder(new EmptyBorder(0,0,0,0));
	usernamepanel.setMinimumSize(new Dimension(300, 100));
	usernamepanel.setPreferredSize(new Dimension(300, 100));
	usernamepanel.setMaximumSize(new Dimension(550, 110));

	JLabel usernamelabel = new JLabel("<html>User Name <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/100)</font></font></html>");
	usernamelabel.setFont(new Font("Calibri",Font.BOLD,18));
	usernamelabel.setForeground(Color.decode("#7fffd4"));
	usernamelabel.setBorder(new EmptyBorder(0,10,0,0));
	usernamelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	usernamelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	usernamelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	usernamelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	usernamelabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	usernamelabel.setOpaque(false);
	
	HintTextField usernametxtfield = new HintTextField("Enter your user name");//border ac-border inactive
	usernametxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	usernametxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	usernametxtfield.activebgColor=Color.decode("#004953");
	usernametxtfield.inactivebgColor=Color.decode("#091f23");
	usernametxtfield.activefgColor=Color.WHITE;////////////color on type
	usernametxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	usernametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	usernametxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	usernametxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	usernametxtfield.setForeground(Color.decode("#FFFFFF"));
	usernametxtfield.setBackground(Color.decode("#091f23"));
	usernametxtfield.setColumns(30);
	usernametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    usernametxtfield.addMouseListener(new FieldMouseListener());
	usernametxtfield.setCaretColor(Color.WHITE);
	usernametxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
usernametxtfield.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent evt)
{
	if(usernametxtfield.getText().length()==0)
	{
		
		
		
		usernamelabel.setText("<html>User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(usernametxtfield.getText().length()+1)+"/100)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   una=false;
		uslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	usernamelabel.setText("<html>User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(usernametxtfield.getText().length())+"/100)</font></font></html>");

    }	
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				
				if (usernametxtfield.getText().length() > 0 && usernametxtfield.getText().length() < 100) // limit textfield
				{
					/*una = true;
					uslimit();*/
					usernamelabel.setText("<html>User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(usernametxtfield.getText().length()+1)+"/100)</font></font></html>");

				}
				if(usernametxtfield.getText().length() <= 0 || usernametxtfield.getText().length() >100)
				{
					una = false;
					uslimit();
				}	
				if(usernametxtfield.getText().length() >=100)
				{
					una = false;
					uslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
            }
			
			public void keyReleased(KeyEvent evt) 
{ 
newlabel4.setText("<html> </html>");

	try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		Statement statement=connection.createStatement();
		String nidsearch="SELECT * FROM `seller_signup_user_details` WHERE USER_NAME='"+ usernametxtfield.getText()+"'";
ResultSet result1=statement.executeQuery(nidsearch);	
		if(result1.next())
		{
			newlabel4.setText("<html>Sorry, This User-Name is already Taken.</html>");
		
		}
		
		
		
		
		if(!result1.next())
		{
			una = true;
			uslimit();
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
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
usernamelabel.setText("<html>User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(usernametxtfield.getText().length())+"/100)</font></font></html>");

if(usernametxtfield.getText().length() == 100)
				{
					
				usernamelabel.setText("<html>User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(usernametxtfield.getText().length()-1)+"/100)</font></font></html>");
	
				}
				
				}

}	
        });

		if (SUBUSER_NAME!="")
		{
			usernametxtfield.setText(SUBUSER_NAME);
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

    JLabel newlabel5 = new JLabel(" ");
	newlabel5.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel5.setForeground(Color.decode("#ff4040"));
	newlabel5.setBorder(new EmptyBorder(0,10,0,0));
	newlabel5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel5.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel5.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel5.setAlignmentY(Component.LEFT_ALIGNMENT);
	newlabel5.setOpaque(false);
	
	JPanel confirmusernamepanel = new JPanel();
	confirmusernamepanel.setBackground(new Color(44, 47, 51));
	confirmusernamepanel.setLayout(new BoxLayout(confirmusernamepanel, BoxLayout.Y_AXIS));
	confirmusernamepanel.setBorder(new EmptyBorder(0,0,0,0));
	//confirmusernamepanel.setBorder(null);
	confirmusernamepanel.setMinimumSize(new Dimension(300, 100));
	confirmusernamepanel.setPreferredSize(new Dimension(300, 100));
	confirmusernamepanel.setMaximumSize(new Dimension(550, 110));
	confirmusernamepanel.setAlignmentX(Component.LEFT_ALIGNMENT);

	
	JLabel confirmusernamelabel = new JLabel("<html>Confirm User Name <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/100)</font></font></html>");
	confirmusernamelabel.setFont(new Font("Calibri",Font.BOLD,18));
	confirmusernamelabel.setForeground(Color.decode("#7fffd4"));
	confirmusernamelabel.setBorder(new EmptyBorder(0,10,0,0));
	confirmusernamelabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	confirmusernamelabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	confirmusernamelabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	confirmusernamelabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	confirmusernamelabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	confirmusernamelabel.setOpaque(false);
	
	HintTextField confirmusernametxtfield = new HintTextField("Please Re-Enter your user name");//border ac-border inactive
	confirmusernametxtfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	confirmusernametxtfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	confirmusernametxtfield.activebgColor=Color.decode("#004953");
	confirmusernametxtfield.inactivebgColor=Color.decode("#091f23");
	confirmusernametxtfield.activefgColor=Color.WHITE;////////////color on type
	confirmusernametxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	confirmusernametxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	confirmusernametxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	confirmusernametxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	confirmusernametxtfield.setForeground(Color.decode("#FFFFFF"));
	confirmusernametxtfield.setBackground(Color.decode("#091f23"));
	confirmusernametxtfield.setColumns(30);
	confirmusernametxtfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    confirmusernametxtfield.addMouseListener(new FieldMouseListener());
	confirmusernametxtfield.setCaretColor(Color.WHITE);
	confirmusernametxtfield.setTransferHandler(null);
	confirmusernametxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		confirmusernametxtfield.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent evt)
{
	if(una)
	{
	if(confirmusernametxtfield.getText().length()==0)
	{
		cuna = true;
		uslimit();
		
		
		confirmusernamelabel.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmusernametxtfield.getText().length()+1)+"/100)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   cuna=false;
		uslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	confirmusernamelabel.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmusernametxtfield.getText().length())+"/100)</font></font></html>");

    }	
	}
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				if(!una)
				{
					evt.consume();
					newlabel5.setText("<html>*Please Enter at User-Name box first.</html>");
				}
				else{
				if (confirmusernametxtfield.getText().length() > 0 && confirmusernametxtfield.getText().length() < 100) // limit textfield
				{
					
					if(confirmusernametxtfield.getText().equals(usernametxtfield.getText()))
				{
					cuna = true;
					uslimit();
				newlabel5.setText("<html> </html>");
				}
				else
				{
					newlabel5.setText("<html>*Please Enter as same as User-Name.</html>");
				}
					
					
					
					confirmusernamelabel.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmusernametxtfield.getText().length()+1)+"/100)</font></font></html>");

				}
				if(confirmusernametxtfield.getText().length() <= 0 || confirmusernametxtfield.getText().length() >100)
				{
					cuna = false;
					uslimit();
				}	
				if(confirmusernametxtfield.getText().length() >=100)
				{
					cuna = false;
					uslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}
				}				
				
            }
			public void keyReleased(KeyEvent evt) 
{ 
if(una)
{
if(confirmusernametxtfield.getText().equals(usernametxtfield.getText()))
				{
					cuna = true;
					uslimit();
				newlabel5.setText("<html> </html>");
				}
				else{
					newlabel5.setText("<html>*Please Enter as same as User-Name.</html>");
				}
}
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
confirmusernamelabel.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmusernametxtfield.getText().length())+"/100)</font></font></html>");

if(confirmusernametxtfield.getText().length() == 100)
				{
					
				confirmusernamelabel.setText("<html>Confirm User Name <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmusernametxtfield.getText().length()-1)+"/100)</font></font></html>");
	
				}
				
				}

}	
    
        });	
		
		if (SUBCON_USER_NAME!="")
		{
			confirmusernametxtfield.setText(SUBCON_USER_NAME);
		}

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	JPanel userpassconfirmuserpasspanel = new JPanel();
	userpassconfirmuserpasspanel.setBackground(new Color(44, 47, 51));
	userpassconfirmuserpasspanel.setLayout(new BoxLayout(userpassconfirmuserpasspanel, BoxLayout.X_AXIS));
	userpassconfirmuserpasspanel.setBorder(new EmptyBorder(0,0,0,0));
	userpassconfirmuserpasspanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel newlabel6 = new JLabel("<html> </html>");
	newlabel6.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel6.setForeground(Color.decode("#ff4040"));
	newlabel6.setBorder(new EmptyBorder(0,25,0,0));
	newlabel6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel6.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel6.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel6.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel6.setOpaque(false);
	
	
	JPanel userpasspanel = new JPanel();
	userpasspanel.setBackground(new Color(44, 47, 51));
	userpasspanel.setLayout(new BoxLayout(userpasspanel, BoxLayout.Y_AXIS));
	userpasspanel.setBorder(new EmptyBorder(0,0,0,0));
	userpasspanel.setMinimumSize(new Dimension(300, 100));
	userpasspanel.setPreferredSize(new Dimension(300, 100));
	userpasspanel.setMaximumSize(new Dimension(550, 110));
	userpasspanel.setAlignmentX(Component.LEFT_ALIGNMENT);


//////////////////////////////////////
JLabel userpasslabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;Password <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/16)</font></font></html>");
	userpasslabel.setFont(new Font("Calibri",Font.BOLD,18));
	userpasslabel.setForeground(Color.decode("#7fffd4"));
	userpasslabel.setBorder(new EmptyBorder(0,10,0,0));
	userpasslabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	userpasslabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	userpasslabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	userpasslabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	userpasslabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	userpasslabel.setOpaque(false);
	


	JPanel passpan1 = new JPanel();
	passpan1.setBackground(new Color(44,47,51));
	passpan1.setLayout(new BoxLayout(passpan1, BoxLayout.X_AXIS));
	passpan1.setMinimumSize(new Dimension(300,45));
	passpan1.setPreferredSize(new Dimension(300,45));
	passpan1.setMaximumSize(new Dimension(550,45));
	passpan1.setBorder(new EmptyBorder(0,20,0,10));
	passpan1.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
  
  	HintPassField userpasstxtfield = new HintPassField("");//border ac-border inactive
	userpasstxtfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
	userpasstxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	userpasstxtfield.activebgColor=Color.decode("#004953");
	userpasstxtfield.inactivebgColor=Color.decode("#091f23");
	userpasstxtfield.activefgColor=Color.WHITE;////////////color on type
	userpasstxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	userpasstxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	userpasstxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	userpasstxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	userpasstxtfield.setForeground(Color.decode("#FFFFFF"));
	userpasstxtfield.setBackground(Color.decode("#091f23"));
	userpasstxtfield.setColumns(30);
	//userpasstxtfield.setBorder(new LineBorder (Color.decode("#091f23"), 1));   
userpasstxtfield.setBorder(new EmptyBorder(0,15,0,0));
	userpasstxtfield.setEchoChar('*');
	     
    userpasstxtfield.addMouseListener(new FieldMouseListener());
	userpasstxtfield.setCaretColor(Color.WHITE);
	userpasstxtfield.setAlignmentX(Component.LEFT_ALIGNMENT);
	//userpasstxtfield.setMinimumSize(new Dimension(200, 30));
	//userpasstxtfield.setPreferredSize(new Dimension(200, 30));
	userpasstxtfield.addKeyListener(new KeyAdapter()
		{
			validpassword vs=new validpassword();
public void keyPressed(KeyEvent evt)
{
	if(cuna)
	{
	if(userpasstxtfield.getText().length()==0)
	{
		passw = true;
		uslimit();
		
		
		userpasslabel.setText("<html>Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(userpasstxtfield.getText().length()+1)+"/16)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   passw=false;
		uslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
    	userpasslabel.setText("<html>Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(userpasstxtfield.getText().length())+"/16)</font></font></html>");

    }	
	}
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				if(!cuna)
				{
					evt.consume();
					newlabel6.setText("<html>*Please Enter at Confirm User-Name box first.</html>");
				}
				else{
				if (userpasstxtfield.getText().length() > 0 && userpasstxtfield.getText().length() < 16) // limit textfield
				{
					if(vs.passcheck(usernametxtfield.getText(),userpasstxtfield.getText())=="")
					{
					passw = true;
					uslimit();
					newlabel6.setText("<html> </html>");
					}
					else{
						newlabel6.setText(vs.passcheck(usernametxtfield.getText(),userpasstxtfield.getText()));
					}
					userpasslabel.setText("<html>Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(userpasstxtfield.getText().length()+1)+"/16)</font></font></html>");
				}
				if(userpasstxtfield.getText().length() <= 0 || userpasstxtfield.getText().length() >16)
				{
					passw = false;
					uslimit();
				}	
				if(userpasstxtfield.getText().length() >=16)
				{
					passw = false;
					uslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				}
            }
			
			public void keyReleased(KeyEvent evt) 
{
	newlabel6.setText("<html> </html>");
if(cuna)
{	
	{
if(vs.passcheck(usernametxtfield.getText(),userpasstxtfield.getText())=="")
					{
					passw = true;
					uslimit();
					newlabel6.setText("");
					}
					else{
						newlabel6.setText(vs.passcheck(usernametxtfield.getText(),userpasstxtfield.getText()));
					}
}
}
if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
userpasslabel.setText("<html>Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(userpasstxtfield.getText().length())+"/16)</font></font></html>");

if(userpasstxtfield.getText().length() == 16)
				{
					
				userpasslabel.setText("<html>Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(userpasstxtfield.getText().length()-1)+"/16)</font></font></html>");
	
				}
				
				}

}	
        });		


		if (SUBPASSWORD!="")
		{
			userpasstxtfield.setText(SUBPASSWORD);
		}
	
	 

	
	JButton hidebutton = new HoverButton("Show");
	hidebutton.setFont(new Font("Comic Sans",Font.PLAIN,16));
	hidebutton.setBackground(new Color(125,125,125));
	hidebutton.setForeground(Color.WHITE);
	hidebutton.setCursor(handcursor);
	hidebutton.setBorder(new LineBorder (Color.decode("#091f23"), 1));

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
			userpasstxtfield.setEchoChar('*');
			hidebutton.setText("Show");
		
		}
		else{
			userpasstxtfield.setEchoChar((char)0);
			hidebutton.setText("Hide");
			
		}
		
		
		}
		
		});	


	
	


///////////////////////////////////////////////////////////////////////////////////////////////////////////

	JPanel confirmuserpasspanel = new JPanel();
	confirmuserpasspanel.setBackground(new Color(44, 47, 51));
	confirmuserpasspanel.setLayout(new BoxLayout(confirmuserpasspanel, BoxLayout.Y_AXIS));
	confirmuserpasspanel.setBorder(new EmptyBorder(0,0,0,0));
	//confirmuserpasspanel.setBorder(null);
	confirmuserpasspanel.setMinimumSize(new Dimension(300, 100));
	confirmuserpasspanel.setPreferredSize(new Dimension(300, 100));
	confirmuserpasspanel.setMaximumSize(new Dimension(550, 110));
	confirmuserpasspanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel newlabel7 = new JLabel(" ");
	newlabel7.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel7.setForeground(Color.decode("#ff4040"));
	newlabel7.setBorder(new EmptyBorder(0,25,0,0));
	newlabel7.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel7.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel7.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel7.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel7.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel7.setOpaque(false);
	
	
	JLabel confirmuserpasslabel = new JLabel("<html>&nbsp;&nbsp;&nbsp;Confirm Password <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/16)</font></font></html>");
	confirmuserpasslabel.setFont(new Font("Calibri",Font.BOLD,18));
	confirmuserpasslabel.setForeground(Color.decode("#7fffd4"));
	confirmuserpasslabel.setBorder(new EmptyBorder(0,10,0,0));
	confirmuserpasslabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	confirmuserpasslabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	confirmuserpasslabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	confirmuserpasslabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	confirmuserpasslabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	confirmuserpasslabel.setOpaque(false);

/////////////////////////

	JPanel passpan11 = new JPanel();
	passpan11.setBackground(new Color(44,47,51));
	passpan11.setLayout(new BoxLayout(passpan11, BoxLayout.X_AXIS));
	passpan11.setMinimumSize(new Dimension(300,45));
	passpan11.setPreferredSize(new Dimension(300,45));
	passpan11.setMaximumSize(new Dimension(550,45));
	passpan11.setBorder(new EmptyBorder(0,20,0,10));
	passpan11.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
  
  	HintPassField confirmuserpasstxtfield = new HintPassField("");//border ac-border inactive
	confirmuserpasstxtfield.gainFont=new Font("Arial", Font.PLAIN, 18);////////////typing font
	confirmuserpasstxtfield.lostFont=new Font("Arial", Font.PLAIN, 12);////////////////inactive font==setFont	
	confirmuserpasstxtfield.activebgColor=Color.decode("#004953");
	confirmuserpasstxtfield.inactivebgColor=Color.decode("#091f23");
	confirmuserpasstxtfield.activefgColor=Color.WHITE;////////////color on type
	confirmuserpasstxtfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	confirmuserpasstxtfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	confirmuserpasstxtfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	confirmuserpasstxtfield.setFont(new Font("Arial",Font.PLAIN,16));
	confirmuserpasstxtfield.setForeground(Color.decode("#FFFFFF"));
	confirmuserpasstxtfield.setBackground(Color.decode("#091f23"));
	confirmuserpasstxtfield.setColumns(30);
	//confirmuserpasstxtfield.setBorder(new LineBorder (Color.decode("#091f23"), 1));   
confirmuserpasstxtfield.setBorder(new EmptyBorder(0,15,0,0));
	confirmuserpasstxtfield.setEchoChar('*');
	     
    confirmuserpasstxtfield.addMouseListener(new FieldMouseListener());
	confirmuserpasstxtfield.setCaretColor(Color.WHITE);
	confirmuserpasstxtfield.setTransferHandler(null);
	//confirmuserpasstxtfield.setMinimumSize(new Dimension(200, 30));
	//confirmuserpasstxtfield.setPreferredSize(new Dimension(200, 30));
	confirmuserpasstxtfield.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent evt)
{
	if(passw)
	{
	if(confirmuserpasstxtfield.getText().length()==0)
	{
		cpassw = true;
		uslimit();
		
		
		confirmuserpasslabel.setText("<html>Confirm Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmuserpasstxtfield.getText().length()+1)+"/16)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   cpassw=false;
		uslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	    confirmuserpasslabel.setText("<html>Confirm Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmuserpasstxtfield.getText().length())+"/16)</font></font></html>");

    }	
	}
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
				if(!passw)
				{
				evt.consume();
					newlabel7.setText("<html>*Please Enter at Password box first.</html>");	
				}
				else{
				if (confirmuserpasstxtfield.getText().length() > 0 && confirmuserpasstxtfield.getText().length() < 16) // limit textfield
				{
					if(confirmuserpasstxtfield.getText().equals(userpasstxtfield.getText()))
				{
                   cpassw = true;
					uslimit();
				newlabel7.setText("<html> </html>");
				}
				else{
					newlabel7.setText("<html>*Please Enter as same as Password.</html>");
				}
					
					confirmuserpasslabel.setText("<html>Confirm Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmuserpasstxtfield.getText().length()+1)+"/16)</font></font></html>");

				}
				if(confirmuserpasstxtfield.getText().length() <= 0 || confirmuserpasstxtfield.getText().length() >16)
				{
					cpassw = false;
					uslimit();
				}	
				if(confirmuserpasstxtfield.getText().length() >=16)
				{
					cpassw = false;
					uslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				}
            }
			
			public void keyReleased(KeyEvent evt) 
{ 

if(passw)
{
		if(confirmuserpasstxtfield.getText().equals(userpasstxtfield.getText()))
				{
                   cpassw = true;
					uslimit();
				newlabel7.setText("<html> </html>");
				}
				else{
					newlabel7.setText("<html>*Please Enter as same as Password.</html>");
				}
}


if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
confirmuserpasslabel.setText("<html>Confirm Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmuserpasstxtfield.getText().length())+"/16)</font></font></html>");

if(confirmuserpasstxtfield.getText().length() == 16)
				{
					
				confirmuserpasslabel.setText("<html>Confirm Password <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(confirmuserpasstxtfield.getText().length()-1)+"/16)</font></font></html>");
	
				}
				
				}

}	
        });		
	
		if (SUBCON_PASSWORD!="")
		{
			confirmuserpasstxtfield.setText(SUBCON_PASSWORD);
		}

	
	 

	
	JButton hidebutton1 = new HoverButton("Show");
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
			confirmuserpasstxtfield.setEchoChar('*');
			hidebutton1.setText("Show");
		
		}
		else{
			confirmuserpasstxtfield.setEchoChar((char)0);
			hidebutton1.setText("Hide");
			
		}
		
		
		}
		
		});	



////////////////////////////////




/////////////////////////////////////Profile Picture///////////////////////////////////////////

	JPanel profilepicpanel = new JPanel();
	profilepicpanel.setBackground(new Color(44, 47, 51));
	profilepicpanel.setLayout(new BoxLayout(profilepicpanel, BoxLayout.Y_AXIS));
	profilepicpanel.setBorder(new EmptyBorder(0,0,0,0));
	profilepicpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	//confirmuserpasspanel.setBorder(null);
	/*profilepicpanel.setMinimumSize(new Dimension(300, 70));
	profilepicpanel.setPreferredSize(new Dimension(300, 70));
	profilepicpanel.setMaximumSize(new Dimension(550, 85));
	*/
    JLabel profilepiclabel = new JLabel("Profile Picture");
	profilepiclabel.setFont(new Font("Calibri",Font.BOLD,18));
	profilepiclabel.setForeground(Color.decode("#7fffd4"));
	profilepiclabel.setBorder(new EmptyBorder(0,0,0,0));
	profilepiclabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	profilepiclabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	profilepiclabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	profilepiclabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	profilepiclabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	profilepiclabel.setOpaque(false);
	
	JPanel picturepanel = new JPanel();
	picturepanel.setBackground(new Color(0,0,0));
	picturepanel.setLayout(new BoxLayout(picturepanel, BoxLayout.X_AXIS));
	picturepanel.setBorder(new EmptyBorder(0,0,0,0));
	//confirmuserpasspanel.setBorder(null);
	picturepanel.setMinimumSize(new Dimension(100, 80));
	picturepanel.setPreferredSize(new Dimension(100, 80));
	picturepanel.setMaximumSize(new Dimension(200, 95));
	picturepanel.setAlignmentX(Component.CENTER_ALIGNMENT);

	
	Border submitprofilepicturenborder = new LineBorder(Color.decode("#367588"));
	
	JButton submitprofilepicture = new RoundedCornerButton("     Submit Picture     ");
	submitprofilepicture.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitprofilepicture.setBackground(new Color(44, 47, 51));
	submitprofilepicture.setForeground(Color.decode("#888888"));
	submitprofilepicture.setCursor(handcursor);
	submitprofilepicture.setBorder(submitprofilepicturenborder);
	submitprofilepicture.setOpaque(true);
	submitprofilepicture.setEnabled(false);
    submitprofilepicture.setContentAreaFilled(true);
    submitprofilepicture.setBorderPainted(true);
	submitprofilepicture.setAlignmentX(Component.CENTER_ALIGNMENT);
	submitprofilepicture.setFocusable(false);
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

 newlabel8 = new JLabel("<html>*Please Click Verify Yourself.</html>");
	newlabel8.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel8.setForeground(Color.decode("#ff4040"));
	newlabel8.setBorder(new EmptyBorder(10,0,0,0));
	newlabel8.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel8.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	newlabel8.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	newlabel8.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel8.setAlignmentX(Component.CENTER_ALIGNMENT);
	newlabel8.setOpaque(false);
	if(otp)
	{
		newlabel8.setText("<html><font color=#7fffd4>Verification Success.</font></html>");
	}
	
	JPanel verifybuttonpanel = new JPanel();
	verifybuttonpanel.setBackground(new Color(44, 47, 51));
	verifybuttonpanel.setLayout(new BoxLayout(verifybuttonpanel, BoxLayout.Y_AXIS));
	verifybuttonpanel.setBorder(new EmptyBorder(0,160,0,0));
	verifybuttonpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	verifybuttonpanel.setMinimumSize(new Dimension(1000, 50));
	verifybuttonpanel.setPreferredSize(new Dimension(1000, 50));
	verifybuttonpanel.setMaximumSize(new Dimension(1000, 70));
	
	Border verifybuttonborder = new LineBorder(Color.decode("#367588"));

	 verifybutton = new RoundedCornerButton("    Verify Yourself    ");
	verifybutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	verifybutton.setBackground(new Color(44, 47, 51));
	verifybutton.setForeground(Color.decode("#888888"));
	verifybutton.setCursor(handcursor);
	verifybutton.setBorder(verifybuttonborder);
	verifybutton.setOpaque(false);
	verifybutton.setEnabled(false);
    verifybutton.setContentAreaFilled(false);
    verifybutton.setBorderPainted(true);
	verifybutton.setAlignmentX(Component.CENTER_ALIGNMENT);
	verifybutton.setFocusable(false);
	/*verifybutton.setMinimumSize(new Dimension(1000, 20));
	verifybutton.setPreferredSize(new Dimension(1000, 20));
	verifybutton.setMaximumSize(new Dimension(1000, 30));*/
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
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		newlabel8.setText("<html>*Please Check Your Mailbox For OTP (Resend after: 120 Seconds)</html>");
	    verifybutton.setEnabled(false);
		verificationtimer();
	String otp= new DecimalFormat("000000").format(new Random().nextInt(999999));
    mailerhtml mh=new mailerhtml();
	mh.sendhtml("system.confirmation.validity@gmail.com","cezsxtphsghceajb",SUBEMAIL,"Verification of RAW Account","<h3>Dear "+SUBLAST_NAME+",</h3> <br> Your verification code is: "+otp +" <br> <br><br><br>Enter this code in RAW software to activate your Buyer account.<br>Your User Name: "+usernametxtfield.getText()+"<br><br>Once your account is activated, you will be able to login to your RAW portal. <br><br> If this wasn't you:<br> keep calm we will not register your account without this confirmation code. <br><br><br> Do not reply here. <br><br><br> If you have any questions, send us an email( raw.helpdesk@gmail.com ). <br><br><br> Thanks, <br> RAW <br><br><br><br><br>All rights reserved @Team RAW. ","text/html");
    SUBOTP=otp;
		}		
		
	});	
	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	JPanel otppanel = new JPanel();
	otppanel.setBackground(new Color(44, 47, 51));
	otppanel.setLayout(new BoxLayout(otppanel, BoxLayout.Y_AXIS));
	otppanel.setBorder(new EmptyBorder(0,170,0,0));
	otppanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	otppanel.setMinimumSize(new Dimension(1000, 70));
	otppanel.setPreferredSize(new Dimension(1000, 70));
	otppanel.setMaximumSize(new Dimension(1000, 80));
	
	JPanel otplabelpanel = new JPanel();
	otplabelpanel.setBackground(new Color(44, 47, 51));
	otplabelpanel.setLayout(new BoxLayout(otplabelpanel, BoxLayout.Y_AXIS));
	otplabelpanel.setBorder(new EmptyBorder(0,0,0,0));
	otplabelpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	
	JLabel otplabel = new JLabel("<html>Enter OTP <font color=#ff4040>*</font></html>");
	otplabel.setFont(new Font("Calibri",Font.BOLD,18));
	otplabel.setForeground(Color.decode("#7fffd4"));
	//otplabel.setBorder(new EmptyBorder(0,10,0,0));
	otplabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	otplabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	otplabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	otplabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	otplabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	otplabel.setOpaque(false);
	
	HintTextField otpfield = new HintTextField("    Enter OTP   ");//border ac-border inactive
	otpfield.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	otpfield.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	otpfield.activebgColor=Color.decode("#004953");
	otpfield.inactivebgColor=Color.decode("#091f23");
	otpfield.activefgColor=Color.WHITE;////////////color on type
	otpfield.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	otpfield.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	otpfield.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	otpfield.setFont(new Font("Arial",Font.PLAIN,16));
	otpfield.setForeground(Color.decode("#FFFFFF"));
	otpfield.setBackground(Color.decode("#091f23"));
	otpfield.setColumns(30);
	otpfield.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    otpfield.addMouseListener(new FieldMouseListener());
	otpfield.setCaretColor(Color.WHITE);
	otpfield.setAlignmentX(Component.CENTER_ALIGNMENT);
	otpfield.setMinimumSize(new Dimension(150, 50));
	otpfield.setPreferredSize(new Dimension(150, 50));
	otpfield.setMaximumSize(new Dimension(150, 60));
	if(otp)
	{
		otpfield.setEditable(false);
	}
	
	otpfield.addKeyListener(new KeyAdapter()
		{
			public void keyPressed(KeyEvent evt)
{
	if(otpfield.getText().length()==0)
	{

	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   otp=false;
		uslimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);

    }	
	}
	
}	
            public void keyTyped(KeyEvent evt) 
			{
                if (evt.getKeyChar() == '@' || evt.getKeyChar() == '$' || evt.getKeyChar() == '#' || evt.getKeyChar() == '%'  || evt.getKeyChar() == '&' || evt.getKeyChar() == '*' || evt.getKeyChar() == '!' || evt.getKeyChar() == '-' || evt.getKeyChar() == '+' || evt.getKeyChar() == '/' || evt.getKeyChar() == ';' || evt.getKeyChar() == ':' || evt.getKeyChar() == '>' || evt.getKeyChar() == '<' || evt.getKeyChar() == '?' || evt.getKeyChar() == '{' || evt.getKeyChar() == '}' || evt.getKeyChar() == '[' || evt.getKeyChar() == ']' || evt.getKeyChar() == '(' || evt.getKeyChar() == ')' || evt.getKeyChar() == '_' || evt.getKeyChar() == ',' || evt.getKeyChar() == '"' || evt.getKeyChar() == '=' || evt.getKeyChar() == '~' || evt.getKeyChar() == '`' || evt.getKeyChar() == '^' || evt.getKeyChar() == '|')
				{	evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
                }
				
				if (otpfield.getText().length() > 0 && otpfield.getText().length() < 10) // limit textfield
				{
					
					if(otpfield.getText().equals(SUBOTP))
					{
						if(!SUBOTP.equals("") && !SUBOTP.equals(" "))
						{
							otp = true;
					        uslimit();
						}
					
					
					}
					else{
						otp = false;
					uslimit();
					}
					

				}
				if(otpfield.getText().length() <= 0 || otpfield.getText().length() >= 10)
				{
					otp = false;
					uslimit();
				}	
				if(otpfield.getText().length() > 10)
				{
					otp = false;
					uslimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
            }
			
			public void keyReleased(KeyEvent evt) 
{ 
	{
if(otpfield.getText().equals(SUBOTP))
					{
						if(!SUBOTP.equals("") && !SUBOTP.equals(" "))
						{
						
						otp = true;
					    uslimit();
					    newlabel8.setText("<html><font color=#7fffd4>Verification Success.</font></html>");
					    otpfield.setEditable(false);
						}
				
					}
					else{
						otp = false;
					uslimit();
					}
}


}	
		});


		if (SUBOTP!="")
		{
			otpfield.setText(SUBOTP);
		}


///////////////////////////////////////////////////////////////////////////////////////////////////////////

    JCheckBox sendemail = new JCheckBox("   Send me email to the provided email address.");
	sendemail.setFont(new Font("Calibri",Font.BOLD,16));
	sendemail.setBackground(new Color(44, 47, 51));
	sendemail.setForeground(Color.decode("#7fffd4"));
	sendemail.setBorder(new EmptyBorder(0,30,0,0));
	sendemail.setFocusable(false);
	
		sendemail.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(sendemail.isSelected())
			{
				sende = true;
			}
			
			else
			{
				sende = false;
			}
			
		}		
		
	});

	if(sende)
	{
		sendemail.setSelected(true);
	}	

    JCheckBox termsconditions = new JCheckBox("<html>&nbsp;&nbsp;&nbsp;I accept all the Terms and Conditions. <font color=#ff4040>*</font></html>");
	termsconditions.setFont(new Font("Calibri",Font.BOLD,16));
	termsconditions.setBackground(new Color(44, 47, 51));
	termsconditions.setForeground(Color.decode("#7fffd4"));
	termsconditions.setBorder(new EmptyBorder(0,30,0,0));
	termsconditions.setFocusable(false);
	
	
		termsconditions.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(termsconditions.isSelected())
			{
				tac = true;
				uslimit();
			}
			
			else
			{
				tac = false;
				uslimit();
			}
			
		}		
		
	});	
	
	if(tac)
	{
		termsconditions.setSelected(true);
	}
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel usdthirdpanel = new JPanel();
	usdthirdpanel.setBackground(new Color(44,47,51));
	usdthirdpanel.setLayout(new BoxLayout(usdthirdpanel, BoxLayout.X_AXIS));
	usdthirdpanel.setBorder(new EmptyBorder(0,0,0,0));
	usdthirdpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel usdremovepanel = new JPanel();
	usdremovepanel.setBackground(new Color(44, 47, 51));
	usdremovepanel.setLayout(new BoxLayout(usdremovepanel, BoxLayout.X_AXIS));
	usdremovepanel.setBorder(new EmptyBorder(0,0,0,0));
	usdremovepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel usdnextpanel = new JPanel();
	usdnextpanel.setBackground(new Color(44, 47, 51));
	usdnextpanel.setLayout(new BoxLayout(usdnextpanel, BoxLayout.X_AXIS));
	usdnextpanel.setBorder(new EmptyBorder(0,40,0,0));
	usdnextpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

	Border usdsubmitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerHoverButton usdremoveall = new RoundedCornerHoverButton("   Clear All   ");
	usdremoveall.setFont(new Font("Comic Sans",Font.PLAIN,18));
	usdremoveall.setBackground(Color.decode("#20b2aa"));
	usdremoveall.setForeground(new Color(125,125,125));
	usdremoveall.setForeground(Color.WHITE);
	usdremoveall.setCursor(handcursor);
	usdremoveall.setBorder(usdsubmitbttnborder);
	usdremoveall.setOpaque(false);
	//usdremoveall.setEnabled(false);
    usdremoveall.setContentAreaFilled(false);
    usdremoveall.setBorderPainted(true);
	usdremoveall.setAlignmentX(Component.CENTER_ALIGNMENT);
	usdremoveall.setFocusable(false);
	
	usdremoveall.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
	usdremoveall.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(userdetails(contentpan));
		contentpan.revalidate();
			
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(false);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(true);
		}		
		
	});	
	
	/////////////////////////////////////////////////////////////////////////
	ucontinue = new RoundedCornerHoverButton("     Continue     ");
	ucontinue.setFont(new Font("Comic Sans",Font.PLAIN,18));
	ucontinue.setBackground(Color.decode("#20b2aa"));
	ucontinue.setForeground(new Color(125,125,125));
	ucontinue.setForeground(Color.WHITE);
	ucontinue.setCursor(handcursor);
	ucontinue.setBorder(usdsubmitbttnborder);
	ucontinue.setOpaque(false);
	ucontinue.setEnabled(false);
    ucontinue.setContentAreaFilled(false);
    ucontinue.setBorderPainted(true);
	ucontinue.setAlignmentX(Component.CENTER_ALIGNMENT);
	ucontinue.setFocusable(false);
	
	ucontinue.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	


		ucontinue.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
	

			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
				
		try{		
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
			Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		Statement statement=connection.createStatement();
		String nidsearch="SELECT * FROM `seller_signup_user_details` WHERE USER_NAME='"+ usernametxtfield.getText()+"'";
ResultSet result1=statement.executeQuery(nidsearch);	
		if(result1.next())
		{
			newlabel4.setText("<html>Sorry, This User-Name is already Taken.</html>");
		
		}
		
		
		
		
		if(!result1.next())
		{
			
		
		if(!usernametxtfield.getText().equals(confirmusernametxtfield.getText()))
		{
			newlabel4.setText("<html>Your User-Name and Confirm User-Name should be same.</html>");
		}
		if(!userpasstxtfield.getText().equals(confirmuserpasstxtfield.getText()))
		{
			newlabel6.setText("<html>Your Password and Confirm Password should be same.</html>");
		}
	if(usernametxtfield.getText().equals(confirmusernametxtfield.getText()) && userpasstxtfield.getText().equals(confirmuserpasstxtfield.getText()))	
	{
		mbutton4.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
		mbutton5.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(userskills(contentpan));
		contentpan.revalidate();
		
		
		UserDetails=true;
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(false);
		
		
		
		
		SUBUSER_NAME = usernametxtfield.getText();
		SUBCON_USER_NAME = confirmusernametxtfield.getText();
		SUBPASSWORD = userpasstxtfield.getText();
		SUBCON_PASSWORD = confirmuserpasstxtfield.getText();
		SUBOTP = otpfield.getText();
		//SUBTAC = termsconditions.getText();
		
		if (termsconditions.isSelected())
		{
			SUBTAC="Accepted";
		}
		if (sendemail.isSelected())
		{
			SUBPROMOTIONAL_EMAIL="Accepted";
		}
		if (!sendemail.isSelected())
		{
			SUBPROMOTIONAL_EMAIL="Declined";
		}
		
		//System.out.println(SUBUSER_NAME+"   "+SUBCON_USER_NAME+"   "+SUBPASSWORD+"   "+SUBCON_PASSWORD+"   "+SUBOTP+"   "+SUBTAC+"   "+SUBPROMOTIONAL_EMAIL);
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
		
		
		
		}		
		
	});	
	

	
///////////////////////////////////////////////////////////////////////////////////////////////////////////

usdfirstpanel.add(Box.createRigidArea(new Dimension(0, 20)));
usdfirstpanel.add(Box.createRigidArea(new Dimension(0, 0)));
usdfirstpanel.add(label101);
usdfirstpanel.add(Box.createRigidArea(new Dimension(0, 25)));

///////////////////////////////////////////////////////////////////////////////////////////////////////////

usernamepanel.add(Box.createRigidArea(new Dimension(5, 0)));
usernamepanel.add(usernamelabel);
usernamepanel.add(Box.createRigidArea(new Dimension(5, 5)));
usernamepanel.add(usernametxtfield);
usernamepanel.add(newlabel4);

confirmusernamepanel.add(Box.createRigidArea(new Dimension(5, 0)));
confirmusernamepanel.add(confirmusernamelabel);
confirmusernamepanel.add(Box.createRigidArea(new Dimension(5, 5)));
confirmusernamepanel.add(confirmusernametxtfield);
confirmusernamepanel.add(newlabel5);

userconfirmuserpanel.add(usernamepanel);
userconfirmuserpanel.add(Box.createRigidArea(new Dimension(40, 5)));
userconfirmuserpanel.add(confirmusernamepanel);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

passpan1.add(userpasstxtfield);	
passpan1.add(hidebutton);


userpasspanel.add(Box.createRigidArea(new Dimension(5, 0)));
userpasspanel.add(userpasslabel);
userpasspanel.add(Box.createRigidArea(new Dimension(5, 5)));
userpasspanel.add(passpan1);
userpasspanel.add(newlabel6);

passpan11.add(confirmuserpasstxtfield);
passpan11.add(hidebutton1);


confirmuserpasspanel.add(Box.createRigidArea(new Dimension(5, 0)));
confirmuserpasspanel.add(confirmuserpasslabel);
confirmuserpasspanel.add(Box.createRigidArea(new Dimension(5, 5)));
confirmuserpasspanel.add(passpan11);
confirmuserpasspanel.add(newlabel7);

userpassconfirmuserpasspanel.add(userpasspanel);
userpassconfirmuserpasspanel.add(Box.createRigidArea(new Dimension(40, 0)));
userpassconfirmuserpasspanel.add(confirmuserpasspanel);

//////////////////////////////////////////////////////////////////////////////////////////////////////////
profilepicpanel.add(Box.createRigidArea(new Dimension(1160, 0)));
profilepicpanel.add(profilepiclabel);
profilepicpanel.add(picturepanel);
profilepicpanel.add(Box.createRigidArea(new Dimension(0, 10)));
profilepicpanel.add(submitprofilepicture);
profilepicpanel.add(Box.createRigidArea(new Dimension(-1160, 0)));


verifybuttonpanel.add(verifybutton);
verifybuttonpanel.add(newlabel8);
	
otplabelpanel.add(otplabel);
otppanel.add(otplabelpanel);
otppanel.add(otpfield);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

usdsecondpanel.add(userconfirmuserpanel);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
usdsecondpanel.add(userpassconfirmuserpasspanel);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
usdsecondpanel.add(profilepicpanel);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 20)));
usdsecondpanel.add(verifybuttonpanel);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 10)));
usdsecondpanel.add(otppanel);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 20)));
usdsecondpanel.add(sendemail);
usdsecondpanel.add(Box.createRigidArea(new Dimension(0, 15)));

usdsecondpanel.add(termsconditions);

//////////////////////////////////////////////////////////////////////////////////////////////////////////

usdremovepanel.add(usdremoveall);
usdnextpanel.add(ucontinue);
usdthirdpanel.add(Box.createRigidArea(new Dimension(100, 0)));
usdthirdpanel.add(usdremovepanel);
usdthirdpanel.add(Box.createRigidArea(new Dimension(700, 0)));
usdthirdpanel.add(usdnextpanel);	

///////////////////////////////////////////////////////////////////////////////////////////////////////////

userpan.add(usdfirstpanel);
userpan.add(Box.createRigidArea(new Dimension(0, 20)));
userpan.add(usdsecondpanel);
userpan.add(Box.createRigidArea(new Dimension(0, 30)));
userpan.add(usdthirdpanel);

///////////////////////////////////////////////////////////////////////////////////////////////////////////

	return userpan;	
}


public JPanel userskills(JPanel p)
{
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	JPanel userskillpan = new JPanel();
	userskillpan.setBackground(new Color(44, 47, 51));
	userskillpan.setLayout(new BoxLayout(userskillpan, BoxLayout.Y_AXIS));
	userskillpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	userskillpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	userskillpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	userskillpan.setMaximumSize(new Dimension(screensize.width, screensize.height));
	
    JPanel firstpan = new JPanel();
	firstpan.setBackground(new Color(44, 47, 51));
	firstpan.setLayout(new BoxLayout(firstpan, BoxLayout.Y_AXIS));
	firstpan.setBorder(new EmptyBorder(20,40,0,0));


	JLabel skilllabel = new JLabel("User Skills");
	skilllabel.setFont(new Font("Calibri",Font.BOLD,40));
	skilllabel.setForeground(Color.decode("#aaf0d1"));
	//skilllabel.setBorder(new EmptyBorder(0,50,0,0));
	skilllabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	skilllabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	skilllabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	skilllabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	skilllabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	skilllabel.setOpaque(false);

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    JPanel secondpan = new JPanel();
	secondpan.setBackground(new Color(44, 47, 51));
	secondpan.setLayout(new BoxLayout(secondpan, BoxLayout.X_AXIS));
	secondpan.setBorder(new EmptyBorder(0,10,0,0));
	secondpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel thirdpan = new JPanel();
	thirdpan.setBackground(new Color(44, 47, 51));
	thirdpan.setLayout(new BoxLayout(thirdpan, BoxLayout.X_AXIS));
	thirdpan.setBorder(new EmptyBorder(0,10,0,0));
	thirdpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel basicskillpan = new JPanel();
	basicskillpan.setBackground(new Color(44, 47, 51));
	basicskillpan.setLayout(new BoxLayout(basicskillpan, BoxLayout.Y_AXIS));
	basicskillpan.setBorder(new EmptyBorder(0,0,0,0));
	basicskillpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel basiclabel = new JLabel("Basic Skills");
	basiclabel.setFont(new Font("Calibri",Font.BOLD,18));
	basiclabel.setForeground(Color.decode("#7fffd4"));
	basiclabel.setBorder(new EmptyBorder(0,7,0,0));
	basiclabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	basiclabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	basiclabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	basiclabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	basiclabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	basiclabel.setOpaque(false);
	
	JPanel basicpan = new JPanel();
	basicpan.setBackground(new Color(100,50,100));
	basicpan.setLayout(new BoxLayout(basicpan, BoxLayout.Y_AXIS));
	basicpan.setBorder(new EmptyBorder(0,0,0,0));
	basicpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	basicpan.setMinimumSize(new Dimension(280, 20));
	basicpan.setPreferredSize(new Dimension(280, 20));
	basicpan.setMaximumSize(new Dimension(500, 50));
	
	JPanel txtareapanel = new JPanel();
	txtareapanel.setBackground(new Color(0,0,0));
	txtareapanel.setLayout(new BoxLayout(txtareapanel, BoxLayout.X_AXIS));
	txtareapanel.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
	txtareapanel.setBorder(new EmptyBorder(0,14,0,0));
	txtareapanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	txtareapanel.setMinimumSize(new Dimension(280, 100));
	txtareapanel.setPreferredSize(new Dimension(280, 100));
	txtareapanel.setMaximumSize(new Dimension(500, 150));
	
	
	JLabel newlabel20 = new JLabel(" ");
	newlabel20.setFont(new Font("Calibri",Font.PLAIN,14));
	newlabel20.setForeground(Color.decode("#ff4040"));
	newlabel20.setBorder(new EmptyBorder(0,10,0,0));
	newlabel20.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel20.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel20.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel20.setAlignmentX(Component.LEFT_ALIGNMENT);
	//newlabel20.setOpaquesetVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel20.setOpaque(false);
	///////////////////////////////////////////////////////////////////////
	
	HintTextField basicarea = new HintTextField("Enter what basic skills you got");//border ac-border inactive
	
	basicarea.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	basicarea.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	basicarea.activebgColor=Color.decode("#004953");
	basicarea.inactivebgColor=Color.decode("#091f23");
	basicarea.activefgColor=Color.WHITE;////////////color on type
	basicarea.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	basicarea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	basicarea.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	basicarea.setFont(new Font("Arial",Font.PLAIN,16));
	basicarea.setForeground(Color.decode("#FFFFFF"));
	basicarea.setBackground(Color.decode("#091f23"));
	basicarea.setColumns(30);
	basicarea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    basicarea.addMouseListener(new FieldMouseListener());
	basicarea.setCaretColor(Color.WHITE);
	basicarea.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	//RoundedCornerButton[] button = new RoundedCornerButton[40];
	Border submitbttnborder = new LineBorder(Color.RED, 1);

	
		basicarea.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
				txtd = null;
					if(basicarea.getText().equals("Enter what basic skills you got"))
					{
						txtd = "";
					}
					if(basicarea.getText().contains(" "))
					{
						txtd = "";
					}
					
					if(!basicarea.getText().equals("Enter what basic skills you got"))
					{
						
						txtd = basicarea.getText();
						 if (evt.getKeyChar() == '\n')
                            {	
						      
							  basicarea.setText("");
							  
	
	//RoundedCornerButton[] button = new RoundedCornerButton[40];
	RoundedCornerButton submitbutton = new RoundedCornerButton(" "+txtd+" ");
	submitbutton.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitbutton.setBackground(Color.decode("#20b2aa"));
	submitbutton.setForeground(new Color(125,125,125));
	submitbutton.setForeground(Color.WHITE);
	submitbutton.setCursor(handcursor);
	submitbutton.setBorder(submitbttnborder);
	submitbutton.setOpaque(false);
    submitbutton.setContentAreaFilled(false);
    submitbutton.setBorderPainted(true);
	submitbutton.setAlignmentX(Component.LEFT_ALIGNMENT);
	submitbutton.setAlignmentY(Component.TOP_ALIGNMENT);

	submitbutton.setFocusable(false);
	if(addflag==false)
	{
	//button[i] = submitbutton;
	i++;
	array[i] = submitbutton.getText();
	
	txtareapanel.add(Box.createRigidArea(new Dimension(3, 0)));
	txtareapanel.add(submitbutton);
	//basicscrollbar.add(txtareapanel);
	txtareapanel.revalidate();
	}
	submitbutton.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms= new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}
		});		
	
	
	submitbutton.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			MouseClickSound ms= new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			A = submitbutton.getText();
			//System.out.println(A);
			txtareapanel.remove(submitbutton);
			txtareapanel.repaint();
			txtareapanel.revalidate();

			
			for(int s=1; s<=i; s++)
			{
				if(array[s].equals(A))
				{
					skillflag = true;
					skill=removebutton(s);
		    
			i--;
				}
				
				
					
			}

			
		}
		
		
	});
	
	if(i>=40)
	{
			newlabel20.setText("*Maximum limit reached. You can't enter more now.");

		    addflag = true;
			basicarea.setEditable(false);

	}
	else{
		newlabel20.setText(" ");

	    addflag = false;
		basicarea.setEditable(true);

	}
	if(skillflag == false)
	{
		skill=array;
	}
	
		}
		
		
	
    }
	
	


   }
		}
		);
		
		
	//////////////////////////////////////////////////////////////////
	
	JPanel expertskillpan = new JPanel();
	expertskillpan.setBackground(new Color(44,47,51));
	expertskillpan.setLayout(new BoxLayout(expertskillpan, BoxLayout.Y_AXIS));
	expertskillpan.setBorder(new EmptyBorder(0,0,0,0));
	expertskillpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel expertlabel = new JLabel("Expert On");
	expertlabel.setFont(new Font("Calibri",Font.BOLD,18));
	expertlabel.setForeground(Color.decode("#7fffd4"));
	expertlabel.setBorder(new EmptyBorder(0,7,0,0));
	expertlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	expertlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	expertlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	expertlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	expertlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	expertlabel.setOpaque(false);
	
	JLabel newlabel21 = new JLabel(" ");
	newlabel21.setFont(new Font("Calibri",Font.PLAIN,14));
	newlabel21.setForeground(Color.decode("#ff4040"));
	newlabel21.setBorder(new EmptyBorder(0,10,0,0));
	newlabel21.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel21.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel21.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel21.setAlignmentX(Component.LEFT_ALIGNMENT);
	//newlabel21.setOpaquesetVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel21.setOpaque(false);
	
	JPanel expertpan = new JPanel();
	expertpan.setBackground(new Color(100,50,100));
	expertpan.setLayout(new BoxLayout(expertpan, BoxLayout.Y_AXIS));
	expertpan.setBorder(new EmptyBorder(0,0,0,0));
	expertpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	expertpan.setMinimumSize(new Dimension(280, 20));
	expertpan.setPreferredSize(new Dimension(280, 20));
	expertpan.setMaximumSize(new Dimension(500, 50));
	
	JPanel txtareapanel1 = new JPanel();
	txtareapanel1.setBackground(new Color(0,0,0));
	txtareapanel1.setLayout(new BoxLayout(txtareapanel1, BoxLayout.X_AXIS));
	txtareapanel1.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
	txtareapanel1.setBorder(new EmptyBorder(0,14,0,0));
	txtareapanel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	txtareapanel1.setMinimumSize(new Dimension(280, 100));
	txtareapanel1.setPreferredSize(new Dimension(280, 100));
	txtareapanel1.setMaximumSize(new Dimension(500, 150));
	
	
	///////////////////////////////////////////////////////////////////////
	
	HintTextField exparea = new HintTextField("Enter what skills you are expert on");//border ac-border inactive
	
	exparea.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	exparea.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	exparea.activebgColor=Color.decode("#004953");
	exparea.inactivebgColor=Color.decode("#091f23");
	exparea.activefgColor=Color.WHITE;////////////color on type
	exparea.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	exparea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	exparea.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	exparea.setFont(new Font("Arial",Font.PLAIN,16));
	exparea.setForeground(Color.decode("#FFFFFF"));
	exparea.setBackground(Color.decode("#091f23"));
	exparea.setColumns(30);
	exparea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    exparea.addMouseListener(new FieldMouseListener());
	exparea.setCaretColor(Color.WHITE);
	exparea.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	RoundedCornerButton[] button1 = new RoundedCornerButton[40];

	
		exparea.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
				txtd1 = null;
					if(exparea.getText().equals("Enter what skills you are expert on"))
					{
						txtd1 = "";
					}
					if(exparea.getText().contains(" "))
					{
						txtd1 = "";
					}
					
					if(!exparea.getText().equals("Enter what skills you are expert on"))
					{
						
						txtd1 = exparea.getText();
						 if (evt.getKeyChar() == '\n')
                            {	
							  exparea.setText("");
							  
	
	//RoundedCornerButton[] button = new RoundedCornerButton[40];
	RoundedCornerButton submitbutton1 = new RoundedCornerButton(" "+txtd1+" ");
	submitbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitbutton1.setBackground(Color.decode("#20b2aa"));
	submitbutton1.setForeground(new Color(125,125,125));
	submitbutton1.setForeground(Color.WHITE);
	submitbutton1.setCursor(handcursor);
	submitbutton1.setBorder(submitbttnborder);
	submitbutton1.setOpaque(false);
    submitbutton1.setContentAreaFilled(false);
    submitbutton1.setBorderPainted(true);
	submitbutton1.setAlignmentX(Component.LEFT_ALIGNMENT);
	submitbutton1.setAlignmentY(Component.TOP_ALIGNMENT);

	submitbutton1.setFocusable(false);
	if(addflag1==false)
	{
	j++;
	array1[j] = submitbutton1.getText();
	
	txtareapanel1.add(Box.createRigidArea(new Dimension(0, 2)));
	txtareapanel1.add(submitbutton1);
	txtareapanel1.revalidate();
	}
	submitbutton1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}
		});		
	
	
	submitbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			MouseClickSound ms= new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			B = submitbutton1.getText();
			//System.out.println(A);
			txtareapanel1.remove(submitbutton1);
			txtareapanel1.repaint();
			txtareapanel1.revalidate();
			
			for(int t=1; t<=j; t++)
			{
				if(array1[t].equals(B))
				{
					skillflag1 = true;
					skill1=removebutton1(t);
		    
			j--;
				}
				
					
			}
		}		
		
	});
	if(j>=40)
	{
		newlabel21.setText("*Maximum limit reached. You can't enter more now.");

		addflag1 = true;
			exparea.setEditable(false);

	}
	else{
		newlabel20.setText(" ");

		addflag1=false;
		exparea.setEditable(true);

	}
	if(skillflag1 == false)
	{
		skill1=array1;
	}
	
		}

	
                            }
					}
		}
		);
				
		//////////////////////////////////////////////////////////////////
	
	JPanel otherskillpan = new JPanel();
	otherskillpan.setBackground(new Color(44,47,51));
	otherskillpan.setLayout(new BoxLayout(otherskillpan, BoxLayout.Y_AXIS));
	otherskillpan.setBorder(new EmptyBorder(0,0,0,0));
	otherskillpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel otherlabel = new JLabel("Other Skills");
	otherlabel.setFont(new Font("Calibri",Font.BOLD,18));
	otherlabel.setForeground(Color.decode("#7fffd4"));
	otherlabel.setBorder(new EmptyBorder(0,7,0,0));
	otherlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	otherlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	otherlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	otherlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	otherlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	otherlabel.setOpaque(false);
	
	JLabel newlabel22 = new JLabel(" ");
	newlabel22.setFont(new Font("Calibri",Font.PLAIN,14));
	newlabel22.setForeground(Color.decode("#ff4040"));
	newlabel22.setBorder(new EmptyBorder(0,10,0,0));
	newlabel22.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel22.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel22.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel22.setAlignmentX(Component.LEFT_ALIGNMENT);
	//newlabel21.setOpaquesetVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel22.setOpaque(false);
	
	JPanel otherpan = new JPanel();
	otherpan.setBackground(new Color(100,50,100));
	otherpan.setLayout(new BoxLayout(otherpan, BoxLayout.Y_AXIS));
	otherpan.setBorder(new EmptyBorder(0,0,0,0));
	otherpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	otherpan.setMinimumSize(new Dimension(280, 20));
	otherpan.setPreferredSize(new Dimension(280, 20));
	otherpan.setMaximumSize(new Dimension(500, 50));
	
	JPanel txtareapanel2 = new JPanel();
	txtareapanel2.setBackground(new Color(0,0,0));
	txtareapanel2.setLayout(new BoxLayout(txtareapanel2, BoxLayout.X_AXIS));
	txtareapanel2.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
	txtareapanel2.setBorder(new EmptyBorder(0,14,0,0));
	txtareapanel2.setAlignmentX(Component.LEFT_ALIGNMENT);
	txtareapanel2.setMinimumSize(new Dimension(280, 100));
	txtareapanel2.setPreferredSize(new Dimension(280, 100));
	txtareapanel2.setMaximumSize(new Dimension(500, 150));
	
	
	///////////////////////////////////////////////////////////////////////
	
	HintTextField otherarea = new HintTextField("Reveal your other skills");//border ac-border inactive
	
	otherarea.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	otherarea.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	otherarea.activebgColor=Color.decode("#004953");
	otherarea.inactivebgColor=Color.decode("#091f23");
	otherarea.activefgColor=Color.WHITE;////////////color on type
	otherarea.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	otherarea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	otherarea.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	otherarea.setFont(new Font("Arial",Font.PLAIN,16));
	otherarea.setForeground(Color.decode("#FFFFFF"));
	otherarea.setBackground(Color.decode("#091f23"));
	otherarea.setColumns(30);
	otherarea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    otherarea.addMouseListener(new FieldMouseListener());
	otherarea.setCaretColor(Color.WHITE);
	otherarea.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	RoundedCornerButton[] button2 = new RoundedCornerButton[40];

	
		otherarea.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
				txtd2 = null;
					if(otherarea.getText().equals("Reveal your other skills"))
					{
						txtd2 = "";
					}
					if(otherarea.getText().contains(" "))
					{
						txtd2 = "";
					}
					
					if(!otherarea.getText().equals("Reveal your other skills"))
					{
						
						txtd2 = otherarea.getText();
						 if (evt.getKeyChar() == '\n')
                            {	
						
							  otherarea.setText("");
							  
	
	//RoundedCornerButton[] button = new RoundedCornerButton[40];
	RoundedCornerButton submitbutton2 = new RoundedCornerButton(" "+txtd2+" ");
	submitbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitbutton2.setBackground(Color.decode("#20b2aa"));
	submitbutton2.setForeground(new Color(125,125,125));
	submitbutton2.setForeground(Color.WHITE);
	submitbutton2.setCursor(handcursor);
	submitbutton2.setBorder(submitbttnborder);
	submitbutton2.setOpaque(false);
    submitbutton2.setContentAreaFilled(false);
    submitbutton2.setBorderPainted(true);
	submitbutton2.setAlignmentX(Component.LEFT_ALIGNMENT);
	submitbutton2.setAlignmentY(Component.TOP_ALIGNMENT);

	submitbutton2.setFocusable(false);
	if(addflag2==false)
	{
	k++;
	array2[k] = submitbutton2.getText();
	
	
	txtareapanel2.add(Box.createRigidArea(new Dimension(0, 2)));
	txtareapanel2.add(submitbutton2);
	txtareapanel2.revalidate();
	}
	submitbutton2.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}
		});		
	
	
	submitbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			MouseClickSound ms= new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			C = submitbutton2.getText();
			//System.out.println(A);
			txtareapanel2.remove(submitbutton2);
			txtareapanel2.repaint();
			txtareapanel2.revalidate();
			
			for(int u=1; u<=k; u++)
			{
				if(array2[u].equals(C))
				{
					skillflag2 = true;
					skill2=removebutton2(u);
		    
			k--;
				}
				
					
			}
		}		
		
	});
		if(k>=40)
	{
		newlabel22.setText("*Maximum limit reached. You can't enter more now.");

		addflag2=true;
			otherarea.setEditable(false);

	}
	else{
	newlabel22.setText(" ");

		addflag2 = false;
		otherarea.setEditable(true);

	}
	if(skillflag2 == false)
	{
		skill2=array2;
	}
	
		}

	
                            }
					}
		}
		);
				
		
		/////////////////////////// demo project ///////////////////////////////////////
	
	JPanel demoprojectpan = new JPanel();
	demoprojectpan.setBackground(new Color(44,47,51));
	demoprojectpan.setLayout(new BoxLayout(demoprojectpan, BoxLayout.Y_AXIS));
	demoprojectpan.setBorder(new EmptyBorder(0,0,0,0));
	demoprojectpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel demolabel = new JLabel("Demo project");
	demolabel.setFont(new Font("Calibri",Font.BOLD,18));
	demolabel.setForeground(Color.decode("#7fffd4"));
	demolabel.setBorder(new EmptyBorder(0,7,0,0));
	demolabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	demolabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	demolabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	demolabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	demolabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	demolabel.setOpaque(false);
	
	JPanel demopan = new JPanel();
	demopan.setBackground(new Color(100,50,100));
	demopan.setLayout(new BoxLayout(demopan, BoxLayout.Y_AXIS));
	demopan.setBorder(new EmptyBorder(0,0,0,0));
	demopan.setAlignmentX(Component.LEFT_ALIGNMENT);
	demopan.setMinimumSize(new Dimension(280, 20));
	demopan.setPreferredSize(new Dimension(280, 20));
	demopan.setMaximumSize(new Dimension(500, 50));
	
	JLabel newlabel23 = new JLabel(" ");
	newlabel23.setFont(new Font("Calibri",Font.PLAIN,14));
	newlabel23.setForeground(Color.decode("#ff4040"));
	newlabel23.setBorder(new EmptyBorder(0,10,0,0));
	newlabel23.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel23.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel23.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel23.setAlignmentX(Component.LEFT_ALIGNMENT);
	//newlabel21.setOpaquesetVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel23.setOpaque(false);
	
	JPanel txtareapanel3 = new JPanel();
	txtareapanel3.setBackground(new Color(0,0,0));
	txtareapanel3.setLayout(new BoxLayout(txtareapanel3, BoxLayout.X_AXIS));
	txtareapanel3.setLayout(new FlowLayout(FlowLayout.LEFT,1,1));
	txtareapanel3.setBorder(new EmptyBorder(0,14,0,0));
	txtareapanel3.setAlignmentX(Component.LEFT_ALIGNMENT);
	txtareapanel3.setMinimumSize(new Dimension(280, 100));
	txtareapanel3.setPreferredSize(new Dimension(280, 100));
	txtareapanel3.setMaximumSize(new Dimension(500, 150));
	
	
	///////////////////////////////////////////////////////////////////////
	
	HintTextField demoarea = new HintTextField("Submit your project (link)");//border ac-border inactive
	
	demoarea.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	demoarea.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont	
	demoarea.activebgColor=Color.decode("#004953");
	demoarea.inactivebgColor=Color.decode("#091f23");
	demoarea.activefgColor=Color.WHITE;////////////color on type
	demoarea.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	demoarea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	demoarea.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	demoarea.setFont(new Font("Arial",Font.PLAIN,16));
	demoarea.setForeground(Color.decode("#FFFFFF"));
	demoarea.setBackground(Color.decode("#091f23"));
	demoarea.setColumns(30);
	demoarea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    demoarea.addMouseListener(new FieldMouseListener());
	demoarea.setCaretColor(Color.WHITE);
	demoarea.setAlignmentX(Component.LEFT_ALIGNMENT);
	/*firstnametxtfield.setMinimumSize(new Dimension(100, 40));
	firstnametxtfield.setPreferredSize(new Dimension(100, 40));
	firstnametxtfield.setMaximumSize(new Dimension(200, 60));*/
	RoundedCornerButton[] button3 = new RoundedCornerButton[40];

	
		demoarea.addKeyListener(new KeyAdapter() 
		{
            public void keyTyped(KeyEvent evt) 
			{
				
				txtd3 = null;
					if(demoarea.getText().equals("Submit your project (link)"))
					{
						txtd3 = "";
					}
					if(demoarea.getText().contains(" "))
					{
						txtd3 = "";
					}
					
					if(!demoarea.getText().equals("Submit your project (link)"))
					{
						
						txtd3 = demoarea.getText();
						 if (evt.getKeyChar() == '\n')
                            {	
						
							  demoarea.setText("");
							  
	
	//RoundedCornerButton[] button = new RoundedCornerButton[40];
	RoundedCornerButton submitbutton3 = new RoundedCornerButton(" "+txtd3+" ");
	submitbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	submitbutton3.setBackground(Color.decode("#20b2aa"));
	submitbutton3.setForeground(new Color(125,125,125));
	submitbutton3.setForeground(Color.WHITE);
	submitbutton3.setCursor(handcursor);
	submitbutton3.setBorder(submitbttnborder);
	submitbutton3.setOpaque(false);
    submitbutton3.setContentAreaFilled(false);
    submitbutton3.setBorderPainted(true);
	submitbutton3.setAlignmentX(Component.LEFT_ALIGNMENT);
	submitbutton3.setAlignmentY(Component.TOP_ALIGNMENT);

	submitbutton3.setFocusable(false);
	if(addflag3==false)
	{
	l++;
	array3[l] = submitbutton3.getText();
	
	txtareapanel3.add(Box.createRigidArea(new Dimension(0, 2)));
	txtareapanel3.add(submitbutton3);
	txtareapanel3.revalidate();
	}
	submitbutton3.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}
		});		
	
	
	submitbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			MouseClickSound ms= new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			D = submitbutton3.getText();
			//System.out.println(A);
			txtareapanel3.remove(submitbutton3);
			txtareapanel3.repaint();
			txtareapanel3.revalidate();
			
			for(int v=1; v<=l; v++)
			{
				if(array3[v].equals(D))
				{
					skillflag3 = true;
					skill3=removebutton3(v);
		    
			l--;
				}
				
					
			}
		}		
		
	});
	if(l>=40)
	{
		newlabel23.setText("*Maximum limit reached. You can't enter more now.");

		addflag3 = true;
			demoarea.setEditable(false);

	}
	else{
		newlabel23.setText(" ");

		addflag3= false;
		demoarea.setEditable(true);

	}
	if(skillflag3 == false)
	{
		skill3=array3;
	}
	
		}

	
                            }
					}
		}
		);
				
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	

    JPanel lastpan = new JPanel();
	lastpan.setBackground(new Color(44,47,51));
	lastpan.setLayout(new BoxLayout(lastpan, BoxLayout.X_AXIS));
	lastpan.setBorder(new EmptyBorder(0,0,0,0));
	lastpan.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JPanel usdremovepanel = new JPanel();
	usdremovepanel.setBackground(new Color(44,47,51));
	usdremovepanel.setLayout(new BoxLayout(usdremovepanel, BoxLayout.X_AXIS));
	usdremovepanel.setBorder(new EmptyBorder(0,0,0,0));
	usdremovepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel usdnextpanel = new JPanel();
	usdnextpanel.setBackground(new Color(44,47,51));
	usdnextpanel.setLayout(new BoxLayout(usdnextpanel, BoxLayout.X_AXIS));
	usdnextpanel.setBorder(new EmptyBorder(0,0,0,0));
	usdnextpanel.setAlignmentX(Component.CENTER_ALIGNMENT);

	Border usdsubmitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerHoverButton usdremoveall = new RoundedCornerHoverButton("     Clear All     ");
	usdremoveall.setFont(new Font("Comic Sans",Font.PLAIN,18));
	usdremoveall.setBackground(Color.decode("#20b2aa"));
	usdremoveall.setForeground(new Color(125,125,125));
	usdremoveall.setForeground(Color.WHITE);
	usdremoveall.setCursor(handcursor);
	usdremoveall.setBorder(usdsubmitbttnborder);
	usdremoveall.setOpaque(false);
	//usdremoveall.setEnabled(false);
    usdremoveall.setContentAreaFilled(false);
    usdremoveall.setBorderPainted(true);
	usdremoveall.setAlignmentX(Component.CENTER_ALIGNMENT);
	usdremoveall.setFocusable(false);
	
	usdremoveall.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	
	usdremoveall.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		//mbutton1.setForeground(Color.decode("#FA441D"));//error
			
		usdremoveall.setForeground(Color.decode("#00ffff"));
	
		
		}		
		
	});
	
	/////////////////////////////////////////////////////////////////////////
	RoundedCornerHoverButton usdnext = new RoundedCornerHoverButton("     Continue     ");
	usdnext.setFont(new Font("Comic Sans",Font.PLAIN,18));
	usdnext.setBackground(Color.decode("#20b2aa"));
	usdnext.setForeground(new Color(125,125,125));
	usdnext.setForeground(Color.WHITE);
	usdnext.setCursor(handcursor);
	usdnext.setBorder(usdsubmitbttnborder);
	usdnext.setOpaque(false);
	//usdnext.setEnabled(false);
    usdnext.setContentAreaFilled(false);
    usdnext.setBorderPainted(true);
	usdnext.setAlignmentX(Component.CENTER_ALIGNMENT);
	usdnext.setFocusable(false);
	
	usdnext.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	
	String BASIC_SKILLS="";
	String OTHER_SKILLS="";
	String EXPERT_ON="";
	String DEMO_PROJECTS="";
	
	
	usdnext.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		for(int b=1; b<=i; b++)
		{
			
			SUBBASIC_SKILLS= SUBBASIC_SKILLS+skill[b]+" ";
		
			//System.out.println(skill[b]);
		}
		for(int c=1; c<=j; c++)
		{
		    SUBOTHER_SKILLS= SUBOTHER_SKILLS+skill1[c]+" ";

			//System.out.println(skill1[c]);
		}
		for(int d=1; d<=k; d++)
		{
			SUBEXPERT_ON= SUBEXPERT_ON+skill2[d]+" ";

			//System.out.println(skill2[d]);
		}
		for(int f=1; f<=l; f++)
		{
			SUBDEMO_PROJECTS= SUBDEMO_PROJECTS+skill3[f]+" ";

			//System.out.println(skill3[f]);
		}
		
		//mbutton1.setForeground(Color.decode("#FA441D"));//error
			
		mbutton5.setForeground(Color.decode("#00ffff"));
	
		mbutton1.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(new Color(75, 162, 233));
		mbutton3.setForeground(new Color(75, 162, 233));
		mbutton4.setForeground(new Color(75, 162, 233));
		
		contentpan.removeAll();
		contentpan.add(accountdetails(contentpan));
		contentpan.revalidate();
		
		UserSkills=true;
		mbutton5.setEnabled(false);
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		}		
		
	});
		
		
	
		
		
	
firstpan.add(skilllabel);
firstpan.add(Box.createRigidArea(new Dimension(0, 17)));	
	
////////////////////////////////////////////////////

basicpan.add(basicarea);
basicpan.add(Box.createRigidArea(new Dimension(0, 0)));


basicskillpan.add(basiclabel);
basicskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
basicskillpan.add(txtareapanel);
basicskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
basicskillpan.add(basicpan);
basicskillpan.add(newlabel20);
basicskillpan.add(Box.createRigidArea(new Dimension(0, 0)));

///////////////////////////////////////////////////

expertpan.add(exparea);
expertpan.add(Box.createRigidArea(new Dimension(0, 0)));


expertskillpan.add(expertlabel);
expertskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
expertskillpan.add(txtareapanel1);
expertskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
expertskillpan.add(expertpan);
expertskillpan.add(newlabel21);
expertskillpan.add(Box.createRigidArea(new Dimension(0, 0)));

///////////////////////////////////////////////////

otherpan.add(otherarea);
otherpan.add(Box.createRigidArea(new Dimension(0, 0)));


otherskillpan.add(otherlabel);
otherskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
otherskillpan.add(txtareapanel2);
otherskillpan.add(Box.createRigidArea(new Dimension(0, 0)));	
otherskillpan.add(otherpan);
otherskillpan.add(newlabel22);
otherskillpan.add(Box.createRigidArea(new Dimension(0, 0)));

///////////////////////////////////////////////////

demopan.add(demoarea);
demopan.add(Box.createRigidArea(new Dimension(0, 0)));


demoprojectpan.add(demolabel);
demoprojectpan.add(Box.createRigidArea(new Dimension(0, 0)));	
demoprojectpan.add(txtareapanel3);
demoprojectpan.add(Box.createRigidArea(new Dimension(0, 0)));	
demoprojectpan.add(demopan);
demoprojectpan.add(newlabel23);
demoprojectpan.add(Box.createRigidArea(new Dimension(0, 0)));

//////////////////////////////////////////////////////

secondpan.add(Box.createRigidArea(new Dimension(20, 0)));
secondpan.add(basicskillpan);
secondpan.add(Box.createRigidArea(new Dimension(80, 0)));
secondpan.add(expertskillpan);
secondpan.add(Box.createRigidArea(new Dimension(80, 0)));

////////////////////////////////////////////////////////

thirdpan.add(Box.createRigidArea(new Dimension(20, 0)));
thirdpan.add(otherskillpan);
thirdpan.add(Box.createRigidArea(new Dimension(80, 0)));
thirdpan.add(demoprojectpan);
thirdpan.add(Box.createRigidArea(new Dimension(80, 0)));

//////////////////////////////////////////////////////////

usdremovepanel.add(usdremoveall);
usdnextpanel.add(usdnext);
lastpan.add(Box.createRigidArea(new Dimension(50, 0)));
lastpan.add(usdremovepanel);
lastpan.add(Box.createRigidArea(new Dimension(700, 0)));
lastpan.add(usdnextpanel);

//////////////////////////////////////////////////////

userskillpan.add(Box.createRigidArea(new Dimension(0, 20)));	
userskillpan.add(firstpan);
userskillpan.add(Box.createRigidArea(new Dimension(0, 40)));	
userskillpan.add(secondpan);
userskillpan.add(Box.createRigidArea(new Dimension(0, 40)));	
userskillpan.add(thirdpan);
userskillpan.add(Box.createRigidArea(new Dimension(0, 40)));
userskillpan.add(lastpan);
userskillpan.add(Box.createRigidArea(new Dimension(0, 0)));
	
	return userskillpan;	
}

public void button()
{
	
}


public JPanel accountdetails(JPanel p)
{
	//cmnt=false;
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	JPanel accountpan = new JPanel();
	accountpan.setBackground(new Color(44, 47, 51));
	accountpan.setLayout(new BoxLayout(accountpan, BoxLayout.Y_AXIS));
	accountpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	accountpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	accountpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	accountpan.setMaximumSize(new Dimension(screensize.width, screensize.height));
	
	JLabel alabel1 = new JLabel("<html>Account Details</html>");
	alabel1.setFont(new Font("Calibri",Font.BOLD,40));
	alabel1.setForeground(Color.decode("#aaf0d1"));
	//label1.setBorder(new EmptyBorder(0,50,0,0));
	alabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	alabel1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	alabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	alabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	alabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	alabel1.setOpaque(false);
	
	/////////////////////////// 1st and 2nd panel //////////////////////////////
		
	JPanel Afirstpanel = new JPanel();
	Afirstpanel.setBackground(new Color(44, 47, 51));
	Afirstpanel.setLayout(new BoxLayout(Afirstpanel, BoxLayout.Y_AXIS));
	Afirstpanel.setBorder(new EmptyBorder(0,0,0,0));
	Afirstpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	
	JPanel Asecondpanel = new JPanel();
	Asecondpanel.setBackground(new Color(44, 47, 51));
	Asecondpanel.setLayout(new BoxLayout(Asecondpanel, BoxLayout.Y_AXIS));
	Asecondpanel.setBorder(new EmptyBorder(0,0,0,0));
	Asecondpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	//Asecondpanel.setMinimumSize(new Dimension(800, 100));
	//Asecondpanel.setPreferredSize(new Dimension(800, 100));
	//Asecondpanel.setMaximumSize(new Dimension(1000, 400));
	
	JPanel Asecondthirdpanel = new JPanel();
	Asecondthirdpanel.setBackground(new Color(0,0,0,0));
	Asecondthirdpanel.setLayout(new BoxLayout(Asecondthirdpanel, BoxLayout.X_AXIS));
	Asecondthirdpanel.setBorder(new EmptyBorder(0,230,0,0));
	Asecondthirdpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
	JLabel accountlabel = new JLabel("<html>Hello User, This is Your Transactions Account Number in RAW, Please note it out for future use.<font color=#ff4040>*</font></html>");
	accountlabel.setFont(new Font("Calibri",Font.BOLD,18));
	accountlabel.setForeground(Color.decode("#7fffd4"));
	accountlabel.setBorder(new EmptyBorder(0,0,0,0));
	accountlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accountlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accountlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accountlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accountlabel.setAlignmentX(Component.LEFT_ALIGNMENT);
	accountlabel.setOpaque(false);
	
	
	JPanel Athirdpanel = new JPanel();
	Athirdpanel.setBackground(new Color(44, 47, 51));
	Athirdpanel.setLayout(new BoxLayout(Athirdpanel, BoxLayout.X_AXIS));
	Athirdpanel.setBorder(new EmptyBorder(0,430,0,0));
	Athirdpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	Athirdpanel.setMinimumSize(new Dimension(800, 20));
	Athirdpanel.setPreferredSize(new Dimension(800, 20));
	Athirdpanel.setMaximumSize(new Dimension(1000, 80));
	
	JPanel Aforthpanel = new JPanel();
	Aforthpanel.setBackground(new Color(44, 47, 51));
	Aforthpanel.setLayout(new BoxLayout(Aforthpanel, BoxLayout.Y_AXIS));
	Aforthpanel.setBorder(new EmptyBorder(0,25,0,0));
	Aforthpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	Aforthpanel.setMinimumSize(new Dimension(800, 70));
	Aforthpanel.setPreferredSize(new Dimension(800, 70));
	Aforthpanel.setMaximumSize(new Dimension(1000, 90));
	
	JPanel Afifthpanel = new JPanel();
	Afifthpanel.setBackground(new Color(44, 47,51 ));
	Afifthpanel.setLayout(new BoxLayout(Afifthpanel, BoxLayout.Y_AXIS));
	Afifthpanel.setBorder(new EmptyBorder(0,200,0,0));
	Afifthpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	
		JLabel newlabel9 = new JLabel("You can re-check your information by going back. Press Submit button if all of your information is right.  If you submitted it ");
	newlabel9.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel9.setForeground(Color.decode("#ff4040"));
	newlabel9.setBorder(new EmptyBorder(30,0,0,0));
	newlabel9.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel9.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel9.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel9.setAlignmentX(Component.LEFT_ALIGNMENT);
	//newlabel9.setOpaquesetVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel9.setOpaque(false);
	
	JLabel newlabel11 = new JLabel("once, you are not able to change some information.");
	newlabel11.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel11.setForeground(Color.decode("#ff4040"));
	newlabel11.setBorder(new EmptyBorder(0,245,0,0));
	newlabel11.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel11.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel11.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel11.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel11.setAlignmentX(Component.LEFT_ALIGNMENT);
	newlabel11.setOpaque(false);
	
	JLabel newlabel10 = new JLabel("<html>new label 10</html>");
	newlabel10.setFont(new Font("Calibri",Font.PLAIN,16));
	newlabel10.setForeground(Color.decode("#ff4040"));
	newlabel10.setBorder(new EmptyBorder(10,350,0,0));
	newlabel10.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	newlabel10.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	newlabel10.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	newlabel10.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	newlabel10.setAlignmentY(Component.LEFT_ALIGNMENT);
	newlabel10.setOpaque(false);
	
	
	
	////////////////////////////////// label for description //////////////////////////
	
		
	JPanel descriptitlepanel = new JPanel();
	descriptitlepanel.setBackground(new Color(44, 47,51 ));
	descriptitlepanel.setLayout(new BoxLayout(descriptitlepanel, BoxLayout.X_AXIS));
	descriptitlepanel.setBorder(new EmptyBorder(0,170,0,0));
	descriptitlepanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	descriptitlepanel.setMinimumSize(new Dimension(800, 30));
	descriptitlepanel.setPreferredSize(new Dimension(800, 30));
	descriptitlepanel.setMaximumSize(new Dimension(1000, 50));
	
	JLabel descriptionlabel = new JLabel("<html>Description <font color=#ff4040>*</font> <font color=#838996> <font size = 4>(0/500)</font></font></html>");
	descriptionlabel.setFont(new Font("Calibri",Font.BOLD,18));
	descriptionlabel.setForeground(Color.decode("#7fffd4"));
	descriptionlabel.setBorder(new EmptyBorder(0,0,0,0));
	descriptionlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	descriptionlabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	descriptionlabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	descriptionlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	descriptionlabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	descriptionlabel.setOpaque(false);
	
	
	///////////////////////////////////text area for description/////////////////////////////////////
	
	
	JPanel txtareapanel = new JPanel();
	txtareapanel.setBackground(new Color(44, 47,51 ));
	txtareapanel.setLayout(new BoxLayout(txtareapanel, BoxLayout.Y_AXIS));
	txtareapanel.setBorder(new EmptyBorder(0,180,0,0));
	txtareapanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	txtareapanel.setMinimumSize(new Dimension(900, 150));
	txtareapanel.setPreferredSize(new Dimension(900, 150));
	txtareapanel.setMaximumSize(new Dimension(1000, 200));
	
	
    HintTextArea descriparea = new HintTextArea("                                                                       Tell us something about you");//border ac-border inactive
	descriparea.gainFont=new Font("Arial", Font.PLAIN, 16);////////////typing font
	descriparea.lostFont=new Font("Arial", Font.PLAIN, 16);////////////////inactive font==setFont
	descriparea.activebgColor=Color.decode("#004953");
	descriparea.inactivebgColor=Color.decode("#091f23");
	descriparea.activefgColor=Color.WHITE;////////////color on type
	descriparea.inactivefgColor=Color.decode("#009494");/////////////color when text inactive
	descriparea.msgColorN=Color.WHITE;//////////color that firstly shown ==setForeground
	descriparea.magColorM=Color.decode("#dc143c");///////// color if user click and unfill/ignore
	descriparea.setFont(new Font("Arial",Font.PLAIN,16));
	descriparea.setForeground(Color.decode("#FFFFFF"));
	descriparea.setBackground(Color.decode("#091f23"));
	descriparea.setColumns(30);
	descriparea.setLineWrap(true);
	descriparea.setWrapStyleWord(true);
	descriparea.setBorder(BorderFactory.createCompoundBorder(new CustomeBorder(),new EmptyBorder(new Insets(15,25,15,25))));        
    descriparea.addMouseListener(new FieldMouseListener());
	descriparea.setCaretColor(Color.WHITE);	

	descriparea.addKeyListener(new KeyAdapter()
		{
				public void keyPressed(KeyEvent evt)
{
	if(descriparea.getText().length()==0)
	{
		dec = true;
		acclimit();
		
		
		descriptionlabel.setText("<html>Description <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(descriparea.getText().length()+1)+"/500)</font></font></html>");
	if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
    {  
       evt.consume();
	   dec=false;
		acclimit();
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
	descriptionlabel.setText("<html>Description <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(descriparea.getText().length())+"/500)</font></font></html>");

    }	
	}
	
}	
        
            public void keyTyped(KeyEvent evt) 
			{
				
				if (descriparea.getText().length() > 0 && descriparea.getText().length() < 500) // limit textfield
				{
					dec = true;
					acclimit();
					descriptionlabel.setText("<html>Description <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(descriparea.getText().length()+1)+"/500)</font></font></html>");

				}
				if(descriparea.getText().length() <= 0 || descriparea.getText().length() >500)
				{
					dec = false;
					acclimit();
				}	
				if(descriparea.getText().length() >=500)
				{
					dec = false;
					acclimit();
					evt.consume();
					MouseClickSound ms=new MouseClickSound();
					ms.clickSound("Resources/Audio/Common/type_lock.wav",typelockvolume);
				}			
				
            }
			
				public void keyReleased(KeyEvent evt) 
{ 

if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE)
{ 
descriptionlabel.setText("<html>Description <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(descriparea.getText().length())+"/500)</font></font></html>");

if(descriparea.getText().length() == 500)
				{
					
				descriptionlabel.setText("<html>Description <font color=#ff4040>*</font>"+" <font color=#838996> <font size = 4>("+(descriparea.getText().length()-1)+"/500)</font></font></html>");
	
				}
				
				}

}	
   
		});

		if (SUBDESCRIPTION!="")
		{
			descriparea.setText(SUBDESCRIPTION);
		}
		
/////////////////////////////////////text area scroll bar/////////////////////////////////////
	
	JScrollPane txtareascrollbar = new JScrollPane(descriparea);
	txtareascrollbar.getVerticalScrollBar().setUnitIncrement(10);
	txtareascrollbar.getVerticalScrollBar().setBackground(Color.decode("#c0c0c0"));
	
	txtareascrollbar.getVerticalScrollBar().setUI(new BasicScrollBarUI() 
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
	
	txtareascrollbar.setBorder(null);
	txtareascrollbar.setOpaque(true);
	
/////////////////////////////////////// account no panel //////////////////////////////
	
	JLabel accnolabel = new JLabel("Account No. : ");
	accnolabel.setFont(new Font("Calibri",Font.BOLD,18));
	accnolabel.setForeground(Color.decode("#7fffd4"));
	accnolabel.setBorder(new EmptyBorder(7,0,0,0));
	accnolabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accnolabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accnolabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accnolabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accnolabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	accnolabel.setOpaque(false);
	
	JPanel accnoshowpanel = new JPanel();
	accnoshowpanel.setBackground(new Color(44, 47, 51));//44 47 51 
	accnoshowpanel.setLayout(new BoxLayout(accnoshowpanel, BoxLayout.X_AXIS));
	accnoshowpanel.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	accnoshowpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	accnoshowpanel.setMinimumSize(new Dimension(160, 20));
	accnoshowpanel.setPreferredSize(new Dimension(160, 20));
	//accnoshowpanel.setMaximumSize(new Dimension(100, 20));
	
	JLabel accnoshowlabel = new JLabel();
	accnoshowlabel.setText(bankacc);
	accnoshowlabel.setFont(new Font("Calibri",Font.BOLD,18));
	//accnoshowlabel.setBackground(Color.decode("#091f23"));
	accnoshowlabel.setForeground(Color.decode("#7fffd4"));
	accnoshowlabel.setBorder(new EmptyBorder(5,10,0,10));
	accnoshowlabel.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	accnoshowlabel.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	accnoshowlabel.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	accnoshowlabel.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	accnoshowlabel.setAlignmentY(Component.LEFT_ALIGNMENT);
	accnoshowlabel.setOpaque(false);
	if(SUBBANK_ACCOUNT_NUMBER!="")
	{
		accnoshowlabel.setText(SUBBANK_ACCOUNT_NUMBER);
	}
	
	
////////////////////////////////// button ////////////////////////////////////////
    JCheckBox alreadyseller = new JCheckBox("<html>   I also have a seller account in RAW Community.</html>");
	alreadyseller.setFont(new Font("Calibri",Font.BOLD,16));
	alreadyseller.setBackground(new Color(44, 47, 51));
	alreadyseller.setForeground(Color.decode("#7fffd4"));
	alreadyseller.setBorder(new EmptyBorder(0,0,0,0));
	alreadyseller.setFocusable(false);	
	
		alreadyseller.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(alreadyseller.isSelected())
			{
				selac = true;
			}
			
			else
			{
				selac = false;
			}
			
		}		
		
	});

	if(selac)
	{
		alreadyseller.setSelected(true);
	}
	
////////////////////////////////// button ////////////////////////////////////////
    JCheckBox atermsconditions = new JCheckBox("<html>   I accept all the Terms and Conditions. <font color=#ff4040>*</font></html>");
	atermsconditions.setFont(new Font("Calibri",Font.BOLD,16));
	atermsconditions.setBackground(new Color(44, 47, 51));
	atermsconditions.setForeground(Color.decode("#7fffd4"));
	atermsconditions.setBorder(new EmptyBorder(0,0,0,0));
	atermsconditions.setFocusable(false);
	
		atermsconditions.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			if(atermsconditions.isSelected())
			{
				atac = true;
				acclimit();
			}
			
			else
			{
				atac = false;
				acclimit();
			}
			
		}		
		
	});	
	
	if(atac)
	{
		atermsconditions.setSelected(true);
	}
	
//////////////////////////////////// last panel ///////////////////////////////////////

    JPanel lastpanel = new JPanel();
	lastpanel.setBackground(new Color(44,47,51));//44 47 51 
	lastpanel.setLayout(new BoxLayout(lastpanel, BoxLayout.X_AXIS));
	lastpanel.setBorder(new EmptyBorder(60,0,0,0));
	lastpanel.setAlignmentX(Component.LEFT_ALIGNMENT);
	lastpanel.setMinimumSize(new Dimension(1080, 180));
	lastpanel.setPreferredSize(new Dimension(1080, 180));
	lastpanel.setMaximumSize(new Dimension(1150, 220));
	
    JPanel removepanel1 = new JPanel();
	removepanel1.setBackground(new Color(44, 47, 51));
	removepanel1.setLayout(new BoxLayout(removepanel1, BoxLayout.X_AXIS));
	removepanel1.setBorder(new EmptyBorder(0,0,0,0));
	removepanel1.setAlignmentX(Component.CENTER_ALIGNMENT);
	
	JPanel nextpanel1 = new JPanel();
	nextpanel1.setBackground(new Color(44, 47, 51));
	nextpanel1.setLayout(new BoxLayout(nextpanel1, BoxLayout.X_AXIS));
	nextpanel1.setBorder(new EmptyBorder(0,40,0,0));
	nextpanel1.setAlignmentX(Component.CENTER_ALIGNMENT);


	Border submitbttnborder = new LineBorder(Color.RED, 1);
	
	RoundedCornerHoverButton removeall1 = new RoundedCornerHoverButton("   Clear All   ");
	removeall1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	removeall1.setBackground(Color.decode("#20b2aa"));
	removeall1.setForeground(new Color(125,125,125));
	removeall1.setForeground(Color.WHITE);
	removeall1.setCursor(handcursor);
	removeall1.setBorder(submitbttnborder);
	removeall1.setOpaque(false);
	//removeall1.setEnabled(false);
    removeall1.setContentAreaFilled(false);
    removeall1.setBorderPainted(true);
	removeall1.setAlignmentX(Component.CENTER_ALIGNMENT);
	removeall1.setFocusable(false);
	
	removeall1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});	
	
	
	removeall1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
		
			
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		mbutton5.setForeground(new Color(75, 162, 233));
		mbutton2.setForeground(Color.decode("#00ffff"));
		mbutton3.setForeground(Color.decode("#00ffff"));
		mbutton4.setForeground(Color.decode("#00ffff"));
		mbutton1.setForeground(Color.decode("#00ffff"));
			
		contentpan.removeAll();
		contentpan.add(accountdetails(contentpan));
		contentpan.revalidate();
		
		mbutton1.setEnabled(true);
		mbutton2.setEnabled(true);
		mbutton3.setEnabled(true);
		mbutton4.setEnabled(true);
		mbutton5.setEnabled(false);
		}		
		
	});
	
	
	/////////////////////////////////////////////////////////////////////
	
	acontinue = new RoundedCornerHoverButton("       Submit       ");
	acontinue.setFont(new Font("Comic Sans",Font.PLAIN,18));
	acontinue.setBackground(Color.decode("#20b2aa"));
	acontinue.setForeground(new Color(125,125,125));
	acontinue.setForeground(Color.WHITE);
	acontinue.setCursor(handcursor);
	acontinue.setBorder(submitbttnborder);
	acontinue.setOpaque(false);
	acontinue.setEnabled(false);
    acontinue.setContentAreaFilled(false);
    acontinue.setBorderPainted(true);
	acontinue.setAlignmentX(Component.CENTER_ALIGNMENT);
	acontinue.setFocusable(false);
	
	acontinue.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		}		
		
	});	
	
	
	acontinue.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{	
			MouseClickSound ms=new MouseClickSound();
			ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
			contentpan.removeAll();
			contentpan.add(finishpage(contentpan));
			contentpan.revalidate();
			
			AccountDetails=true;
			
			
			SUBDESCRIPTION = descriparea.getText();
			SUBBANK_ACCOUNT_NUMBER = accnoshowlabel.getText();
			
			
			if (atermsconditions.isSelected())
			{
				SUBATAC="Accepted";
			}
			if (alreadyseller.isSelected())
			{
				SUBHAVE_SELLER="Accepted";
			}
			if (!alreadyseller.isSelected())
			{
				SUBHAVE_SELLER="Deciled";
			}
			
		//System.out.println(SUBDESCRIPTION+"   "+SUBBANK_ACCOUNT_NUMBER+"   "+SUBATAC+"   "+SUBHAVE_SELLER);


	
		String x1="<html> ";
		String x2="<font color =#808080>";
		String x3="</font>";
		String x4="</html>";
		String x5=" </html>";
		String x6=" ";
		
		SUBCOUNTRY_CODE = SUBCOUNTRY_CODE.replace(x1, "");
		SUBCOUNTRY_CODE = SUBCOUNTRY_CODE.replace(x2, "");
		SUBCOUNTRY_CODE = SUBCOUNTRY_CODE.replace(x3, "");
		SUBCOUNTRY_CODE = SUBCOUNTRY_CODE.replace(x4, "");

        SUBGENDER= SUBGENDER.replace(x6, "");
		
		SUBBIRTH_DATE= SUBBIRTH_DATE.replace(x6, "");
		SUBBIRTH_MONTH= SUBBIRTH_MONTH.replace(x6, "");
		SUBBIRTH_YEAR= SUBBIRTH_YEAR.replace(x6, "");
		
        SUBCOUNTRY= SUBCOUNTRY.replace(x1, "");
        SUBCOUNTRY= SUBCOUNTRY.replace(x5, "");
		


 timeraw t=new timeraw();
String fname=SUBFIRST_NAME+" "+SUBLAST_NAME;
/////////////////////////////////
     EMAIL=SUBEMAIL;
	 FULL_NAME= fname;
	 FIRST_NAME= SUBFIRST_NAME;
	 LAST_NAME= SUBLAST_NAME;
	 COUNTRY_CODE= SUBCOUNTRY_CODE;
	 MOBILE_NUMBER= SUBMOBILE_NUMBER;
	 GENDER= SUBGENDER;
	 
//////////////////////////////////////


	 BIRTH_DATE=SUBBIRTH_DATE;
	 
	 if(SUBBIRTH_MONTH.equals("January"))
	 {
		BIRTH_MONTH="1";
	 }
	  if(SUBBIRTH_MONTH.equals("February"))
	 {
		BIRTH_MONTH="2";
	 }
	  if(SUBBIRTH_MONTH.equals("March"))
	 {
		BIRTH_MONTH="3";
	 }
	  if(SUBBIRTH_MONTH.equals("April"))
	 {
		BIRTH_MONTH="4";
	 }
	  if(SUBBIRTH_MONTH.equals("May"))
	 {
		BIRTH_MONTH="5";
	 }
	  if(SUBBIRTH_MONTH.equals("June"))
	 {
		BIRTH_MONTH="6";
	 }
	  if(SUBBIRTH_MONTH.equals("July"))
	 {
		BIRTH_MONTH="7";
	 }
	  if(SUBBIRTH_MONTH.equals("August"))
	 {
		BIRTH_MONTH="8";
	 }
	  if(SUBBIRTH_MONTH.equals("September"))
	 {
		BIRTH_MONTH="9";
	 }
	  if(SUBBIRTH_MONTH.equals("October"))
	 {
		BIRTH_MONTH="10";
	 }
	  if(SUBBIRTH_MONTH.equals("November"))
	 {
		BIRTH_MONTH="11";
	 }
	  if(SUBBIRTH_MONTH.equals("December"))
	 {
		BIRTH_MONTH="12";
	 }
	
	 
String fdob=SUBBIRTH_DATE+"/"+BIRTH_MONTH+"/"+SUBBIRTH_YEAR;	 
DATE_OF_BIRTH=fdob;
	  
	 BIRTH_YEAR=SUBBIRTH_YEAR;
	 
	 AGE=t.agefinder(SUBBIRTH_DATE,SUBBIRTH_MONTH,SUBBIRTH_YEAR);
	 
	 NID_NUMBER=SUBNID_NUMBER;
	 PASSPORT_NUMBER=SUBPASSPORT_NUMBER;
	 COUNTRY=SUBCOUNTRY;
	 NATIONALITY=SUBNATIONALITY;
	 STREET_ADDRESS=SUBSTREET_ADDRESS;
	 ADDRESS_LINE_2=SUBADDRESS_LINE_2;
	 CITY=SUBCITY;
	 STATE=SUBSTATE;
////////////////////////////////////////
	 USER_NAME=SUBUSER_NAME;
	 PASSWORD=SUBPASSWORD;
	 PROFILE_PICTURE=SUBPROFILE_PICTURE;
	 PROMOTIONAL_EMAIL=SUBPROMOTIONAL_EMAIL;
	 STATUS="Active";	
	 STATUS_MESSAGE="N/A";	
	 RAW_POST="Seller";
//////////////////////////////////////////

    BASIC_SKILLS=SUBBASIC_SKILLS;
    OTHER_SKILLS=SUBOTHER_SKILLS;
	EXPERT_ON=SUBEXPERT_ON;
	DEMO_PROJECTS=SUBDEMO_PROJECTS;
	
///////////////////////////////////////////

	 BANK_ACCOUNT_NUMBER=SUBBANK_ACCOUNT_NUMBER;
	 DESCRIPTION=SUBDESCRIPTION;
	 HAVE_SELLER=SUBHAVE_SELLER;
	TOTAL_RATING="0";
	TOTAL_RATED_NUMBER="0";
	
	
	
	 SIGN_UP_TIME=t.intime();	
	 rawip rp = new rawip();
String uip=rp.localhostaddress()+"\n"+rp.publicipaddress();


SIGN_UP_IP=uip;
	/////////////////////////////////////

	
try{	
		String url="jdbc:mysql://127.0.0.1/raw";
		String username="root";
		String password="";
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection=(Connection) DriverManager.getConnection(url,username,password);//url,uname,pass
		
		Statement statement=connection.createStatement();

     try{		

		String insertquery1="INSERT INTO `seller_signup_basic_details` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `FIRST_NAME`, `LAST_NAME`, `COUNTRY_CODE`, `MOBILE_NUMBER`, `GENDER`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+FIRST_NAME+"', '"+LAST_NAME+"', '"+COUNTRY_CODE+"', '"+MOBILE_NUMBER+"', '"+GENDER+"');";
		
		statement.executeUpdate(insertquery1);
	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	
	
     try{		

        String insertquery2="INSERT INTO `seller_signup_personal_details` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `DATE_OF_BIRTH`, `BIRTH_DATE`, `BIRTH_MONTH`, `BIRTH_YEAR`, `AGE`, `NID_NUMBER`, `PASSPORT_NUMBER`, `COUNTRY`, `NATIONALITY`, `STREET_ADDRESS`, `ADDRESS_LINE_2`, `CITY`, `STATE`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+DATE_OF_BIRTH+"', '"+BIRTH_DATE+"', '"+BIRTH_MONTH+"', '"+BIRTH_YEAR+"', '"+AGE+"', '"+NID_NUMBER+"', '"+PASSPORT_NUMBER+"', '"+COUNTRY+"', '"+NATIONALITY+"', '"+STREET_ADDRESS+"', '"+ADDRESS_LINE_2+"', '"+CITY+"', '"+STATE+"');";

		statement.executeUpdate(insertquery2);


		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
				
     try{		

        String insertquery3="INSERT INTO `seller_signup_user_details` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `PASSWORD`, `PROFILE_PICTURE`, `PROMOTIONAL_EMAIL`, `STATUS`, `STATUS_MESSAGE`, `RAW_POST`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+PASSWORD+"', '"+PROFILE_PICTURE+"', '"+PROMOTIONAL_EMAIL+"', '"+STATUS+"', '"+STATUS_MESSAGE+"', '"+RAW_POST+"');";
		
		statement.executeUpdate(insertquery3);

		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}		


     try{		

        String insertquery4="INSERT INTO `seller_signup_user_skills` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `BASIC_SKILLS`, `OTHER_SKILLS`, `EXPERT_ON`, `DEMO_PROJECTS`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+BASIC_SKILLS+"', '"+OTHER_SKILLS+"', '"+EXPERT_ON+"', '"+DEMO_PROJECTS+"');";

		statement.executeUpdate(insertquery4);

		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}
				
				
     try{		
     
	 String insertquery5="INSERT INTO `seller_signup_account_details` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `BANK_ACCOUNT_NUMBER`, `DESCRIPTION`, `HAVE_SELLER`, `SIGN_UP_TIME`, `SIGN_UP_IP`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+BANK_ACCOUNT_NUMBER+"', '"+DESCRIPTION+"', '"+HAVE_SELLER+"', '"+SIGN_UP_TIME+"', '"+SIGN_UP_IP+"');";	

		statement.executeUpdate(insertquery5);

	
		}
				catch(SQLException ae)
				{
					System.out.println(ae);
				}	

	 try{		
     
	 String insertquery5="INSERT INTO `seller_total_rating` (`USER_NAME`, `EMAIL`, `FULL_NAME`, `CURRENT_RATING`, `TOTAL_RATED_BY`) VALUES ('"+USER_NAME+"', '"+EMAIL+"', '"+FULL_NAME+"', '"+TOTAL_RATING+"', '"+TOTAL_RATED_NUMBER+"');";	

		statement.executeUpdate(insertquery5);

	
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
				
				
				

		
	///////////////////////////////////////	
	
		}		
		
	});
////////////////////////////////////////////////////////////////////////////////////////

    //removepanel1.add(Box.createRigidArea(new Dimension(50, 0)));
	removepanel1.add(removeall1);
	nextpanel1.add(acontinue);	
	lastpanel.add(Box.createRigidArea(new Dimension(93, 0)));
	lastpanel.add(Box.createRigidArea(new Dimension(0, 40)));
    lastpanel.add(removepanel1);
	lastpanel.add(Box.createRigidArea(new Dimension(700, 0)));
    lastpanel.add(Box.createRigidArea(new Dimension(0, 40)));
    lastpanel.add(nextpanel1);
	
	
	Afirstpanel.add(Box.createRigidArea(new Dimension(8, 20)));
    Afirstpanel.add(alabel1);
	Afirstpanel.add(Box.createRigidArea(new Dimension(0, 15)));
	
	
	descriptitlepanel.add(Box.createRigidArea(new Dimension(5, 30)));
	descriptitlepanel.add(descriptionlabel);
	descriptitlepanel.add(Box.createRigidArea(new Dimension(0, 00)));
	
	txtareapanel.add(Box.createRigidArea(new Dimension(50, 0)));
	txtareapanel.add(txtareascrollbar);
	txtareapanel.add(Box.createRigidArea(new Dimension(50, 0)));
	
	Asecondpanel.add(descriptitlepanel);
	Asecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	Asecondpanel.add(txtareapanel);
	Asecondpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	
	Asecondthirdpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	Asecondthirdpanel.add(accountlabel);
	Asecondthirdpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	
	Athirdpanel.add(accnolabel);
	Athirdpanel.add(Box.createRigidArea(new Dimension(15, 0)));
	accnoshowpanel.add(accnoshowlabel);
	Athirdpanel.add(accnoshowpanel);
	Athirdpanel.add(Box.createRigidArea(new Dimension(55, 0)));
	
	
	Aforthpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	Aforthpanel.add(alreadyseller);	
	Aforthpanel.add(Box.createRigidArea(new Dimension(0, 10)));
	Aforthpanel.add(atermsconditions);
	Aforthpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	
	Afifthpanel.add(newlabel9);
		Afifthpanel.add(newlabel11);
		Afifthpanel.add(newlabel10);

	

	
	accountpan.add(Box.createRigidArea(new Dimension(0, 0)));
	accountpan.add(Afirstpanel);
	accountpan.add(Box.createRigidArea(new Dimension(10, 20)));
	accountpan.add(Asecondpanel);
	accountpan.add(Box.createRigidArea(new Dimension(30, 40)));
	accountpan.add(Asecondthirdpanel);
	accountpan.add(Box.createRigidArea(new Dimension(20, 40)));
	accountpan.add(Athirdpanel);
	accountpan.add(Box.createRigidArea(new Dimension(8, 0)));
	accountpan.add(Aforthpanel);
	accountpan.add(Box.createRigidArea(new Dimension(8, 10)));
	accountpan.add(Afifthpanel);
	accountpan.add(Box.createRigidArea(new Dimension(0, 00)));
	accountpan.add(lastpanel);
		
		
	return accountpan;	
}

public JPanel finishpage(JPanel p)
{
	//cmnt=false;
	
	screensize = Toolkit.getDefaultToolkit().getScreenSize();
	
	
	JPanel finishpan = new JPanel();
	finishpan.setBackground(new Color(44, 47, 51));
	finishpan.setLayout(new BoxLayout(finishpan, BoxLayout.Y_AXIS));
	finishpan.setAlignmentX(Component.CENTER_ALIGNMENT);
	finishpan.setBorder(new EmptyBorder(50,0,0,0));
	finishpan.setMinimumSize(new Dimension(p.getWidth(), p.getHeight()));
	finishpan.setPreferredSize(new Dimension(p.getWidth(), p.getHeight()));
	finishpan.setMaximumSize(new Dimension(screensize.width, screensize.height));
	
	RoundedPanel roundpanel3 = new RoundedPanel(50, Color.decode("#00f1c5"));
    //roundpanel.setBounds(10,10,650,700);
	//roundpanel.setBackground(Color.decode("#000000"));
	roundpanel3.setLayout(new BoxLayout(roundpanel3, BoxLayout.X_AXIS));
	roundpanel3.setAlignmentX(Component.LEFT_ALIGNMENT);
	roundpanel3.setMinimumSize(new Dimension(850,690));
	roundpanel3.setPreferredSize(new Dimension(850,690));
	roundpanel1.setMaximumSize(new Dimension(880,700));
	roundpanel3.setBorder(new EmptyBorder(15,15,15,15));
    roundpanel3.setOpaque(false);
	
	RoundedPanel roundpanel4 = new RoundedPanel(30, Color.decode("#000000"));
    //roundpanel.setBounds(10,10,650,700);
	//roundpanel2.setBackground(new Color(0,0,0,0));
	roundpanel4.setLayout(new BoxLayout(roundpanel4, BoxLayout.Y_AXIS));
	roundpanel4.setAlignmentX(Component.CENTER_ALIGNMENT);
	roundpanel4.setMinimumSize(new Dimension(825, 665));
	roundpanel4.setPreferredSize(new Dimension(825, 665));
	roundpanel4.setMaximumSize(new Dimension(855,675));
	roundpanel4.setBorder(new EmptyBorder(20,20,20,20));
    roundpanel4.setOpaque(false);
 
	///////////////////////////// image panel //////////////////////////////
	
	ImageIcon imgx2 = new ImageIcon("Resources/Gifs/Buyer _Signup/success_gif.gif");  //400*300
	JLabel finishgif = new JLabel("",imgx2,JLabel.CENTER);
	finishgif.setSize(imgx2.getIconWidth(),imgx2.getIconHeight());
	finishgif.setAlignmentX(Component.CENTER_ALIGNMENT);
	finishgif.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	finishgif.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	finishgif.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	finishgif.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	//finishgif.setAlignmentX(Component.CENTER_ALIGNMENT);
	finishgif.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	/////////////////////////////////////////text panel //////////////////////////////////////
	
	JPanel textpanel = new JPanel();
	textpanel.setBackground(Color.decode("#000000"));
	textpanel.setLayout(new BoxLayout(textpanel, BoxLayout.Y_AXIS));
	textpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	textpanel.setBorder(new EmptyBorder(0,0,0,0));
	//textpanel.setMinimumSize(new Dimension(600,500));
	//textpanel.setPreferredSize(new Dimension(600,200));
	//textpanel.setMaximumSize(new Dimension(screensize.width, screensize.height));
	
	JLabel alabel1 = new JLabel("Your Sign Up is Successfull");
	alabel1.setFont(new Font("Calibri",Font.BOLD,40));
	alabel1.setForeground(Color.decode("#00f1c5"));//82CFFD
	alabel1.setBackground(new Color(0,0,0));
	//label1.setBorder(new EmptyBorder(0,50,0,0));
	alabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	alabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	alabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	alabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	alabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	alabel1.setOpaque(false);
	
	JLabel blabel1 = new JLabel("Thank you for your sign up !");
	blabel1.setFont(new Font("Calibri",Font.PLAIN,20));
	blabel1.setForeground(Color.decode("#00cc99"));
	blabel1.setBackground(new Color(0,0,0));
	blabel1.setBorder(new EmptyBorder(0,90,0,0));
	blabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	blabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	blabel1.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	blabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	blabel1.setAlignmentX(Component.LEFT_ALIGNMENT);
	blabel1.setOpaque(false);
	
	JPanel fnextpanel1 = new JPanel();
	fnextpanel1.setBackground(new Color(0,0,0));
	fnextpanel1.setLayout(new BoxLayout(fnextpanel1, BoxLayout.X_AXIS));
	fnextpanel1.setBorder(new EmptyBorder(0,0,0,0));
	fnextpanel1.setAlignmentX(Component.CENTER_ALIGNMENT);

	//Border fsubmitbttnborder = new LineBorder(Color.RED, 1);

	RoundedCornerHoverButton fnext1 = new RoundedCornerHoverButton("     Back to Home     ");
	fnext1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	fnext1.setBackground(Color.decode("#20b2aa"));
	fnext1.setForeground(Color.WHITE);
	fnext1.setCursor(handcursor);
	//fnext1.setBorder(submitbttnborder);
	fnext1.setOpaque(false);
	//fnext1.setEnabled(false);
    fnext1.setContentAreaFilled(false);
    fnext1.setBorderPainted(true);
	fnext1.setAlignmentX(Component.CENTER_ALIGNMENT);
	fnext1.setFocusable(false);
	
	
	
		fnext1.addMouseListener(new MouseAdapter(){

		public void mouseEntered(MouseEvent e)
		{	
		
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);
		
		}		
		
	});	
	fnext1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		    //mainframe.remove(buyersignup(mainframe));
			mainframe.setJMenuBar(null);
			mainframe.getContentPane().removeAll();
			mainmenu ss2 = new mainmenu(mainframe);
			mainframe.setJMenuBar(ss2.menubar(mainframe));
			mainframe.getContentPane().add(ss2.menu(mainframe));
			mainframe.setVisible(true);
		}		
		
	});	

	
	
	roundpanel4.add(Box.createRigidArea(new Dimension(820, 100)));
	roundpanel4.add(finishgif);
	textpanel.add(Box.createRigidArea(new Dimension(0, 40)));
	textpanel.add(alabel1);
	textpanel.add(Box.createRigidArea(new Dimension(0, 0)));
	textpanel.add(blabel1);
	
	fnextpanel1.add(fnext1);
	
	roundpanel4.add(textpanel);
	roundpanel4.add(Box.createRigidArea(new Dimension(0, 80)));
	roundpanel4.add(fnextpanel1);
	
	roundpanel3.add(roundpanel4);
	finishpan.add(roundpanel3);
	finishpan.add(Box.createRigidArea(new Dimension(200,0)));
	
	return finishpan;
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
	
	
////////////////////////////////////////////////////////////////////////
	
	public void baslimit()
	{
	
	
		if ( fn== true && ln== true && ccode==true && mail== true && cmail== true && phnno== true && gen== true )
		{
			bcontinue.setEnabled(true);
			bcontinue.setForeground(Color.decode("#FFFFFF"));
			bcontinue.setBorder(new LineBorder(Color.decode("#57F287"), 1));
		}
		else 
		{
			bcontinue.setEnabled(false);
			bcontinue.setBorder(new LineBorder(Color.RED, 1));
		}

	}
	public void perlimit()
	{
		{
		if (BasicDetails== true && birda== true && birmo== true && birye== true && (nid== true || ppno== true) && natlity== true && sadd== true && coun==true  && cit== true && prov== true)
		{
			pcontinue.setEnabled(true);
			pcontinue.setForeground(Color.decode("#FFFFFF"));
			pcontinue.setBorder(new LineBorder(Color.decode("#57F287"), 1));
		}
		else 
		{
			pcontinue.setEnabled(false);
			pcontinue.setBorder(new LineBorder(Color.RED, 1));
		}
		}
		
		if(nid== true || ppno== true)
		{
			lastlabel.setText(" ");
		}
		if(nid== false && ppno== false)
		{
			lastlabel.setText("<html>*Please fill up at least one National Document Number between NID and Passport.</html>");
		}

	}
	
	public void uslimit()
	{
	
	{
		if (BasicDetails== true && PersonalDetails==true && tac== true && otp== true && cpassw== true && passw== true && cuna== true && una== true )
		{
			ucontinue.setEnabled(true);
			ucontinue.setForeground(Color.decode("#FFFFFF"));
			ucontinue.setBorder(new LineBorder(Color.decode("#57F287"), 1));
		}
		else 
		{
			ucontinue.setEnabled(false);
			ucontinue.setBorder(new LineBorder(Color.RED, 1));
		}
	}
	
	if(cpassw== true && passw== true && cuna== true && una== true)
	{
		verifybutton.setEnabled(true);
		verifybutton.setForeground(Color.decode("#FFFFFF"));
			verifybutton.setBorder(new LineBorder(Color.decode("#57F287"), 1));
	}
	else{
		verifybutton.setEnabled(false);
		verifybutton.setBorder(new LineBorder(Color.RED, 1));
	}
	
	}	
	
	public void skilllimit()
	{
		
	
		if (BasicDetails== true && PersonalDetails==true && UserDetails==true && bsls== true && osls==true && eort== true && dpts== true )
		{
			ccontinue.setEnabled(true);
			ccontinue.setForeground(Color.decode("#FFFFFF"));
			ccontinue.setBorder(new LineBorder(Color.decode("#57F287"), 1));
		}
		else 
		{
			ccontinue.setEnabled(false);
			ccontinue.setBorder(new LineBorder(Color.RED, 1));
		}

	}	
	
	public void acclimit()
	{
	
	
		if (BasicDetails== true && PersonalDetails==true && UserDetails==true && UserSkills==true && dec== true && atac== true )
		{
			acontinue.setEnabled(true);
			acontinue.setForeground(Color.decode("#FFFFFF"));
			acontinue.setBorder(new LineBorder(Color.decode("#57F287"), 1));
		}
		else 
		{
			acontinue.setEnabled(false);
			acontinue.setBorder(new LineBorder(Color.RED, 1));
		}

	}	
	public String[] removebutton(int index)
		{
			String[] anotherArray = new String[41];
  
        for (int m = 1, n=1; m <=i; m++) 
		{
 
			
            if (m == index) 
			{
				continue;
            }
 
			if(m != index)
			{
            anotherArray[n++] = array[m];
			}
			if(m==i)
			{
				array = anotherArray;
			}
			
        }
  
        return anotherArray;
		}
		
	public String[] removebutton1(int index1)
		{
			String[] anotherArray1 = new String[41];
		
        for (int m = 1, n=1; m <=j; m++) 
		{
  
            if (m == index1) 
			{
				continue;
            }

			if(m != index1)
			{
            anotherArray1[n++] = array1[m];
			}
			if(m==j)
			{
				array1 = anotherArray1;
			}
			
        }

        return anotherArray1;
		}
		
		public String[] removebutton2(int index2)
		{
			String[] anotherArray2 = new String[41];
 
		
        for (int m = 1, n=1; m <=k; m++) 
		{
  
			
            if (m == index2) 
			{
				continue;
            }

			if(m != index2)
			{
            anotherArray2[n++] = array2[m];
			}
			if(m==k)
			{
				array2 = anotherArray2;
			}
			
        }
  

        return anotherArray2;
		}
		
		public String[] removebutton3(int index3)
		{
			String[] anotherArray3 = new String[41];
  
		
        for (int m = 1, n=1; m <=l; m++) 
		{
  
			
            if (m == index3) 
			{
				continue;
            }
  
			if(m != index3)
			{
            anotherArray3[n++] = array3[m];
			}
			if(m==l)
			{
				array3 = anotherArray3;
			}
			
        }
  
        return anotherArray3;
		}


 int seconds=0;

public void verificationtimer()
	{
		Timer timer = new Timer();
    
        TimerTask task;

         task = new TimerTask() {
        private final int MAX_SECONDS = 120;

        @Override
        public void run() { 
            if (seconds < MAX_SECONDS && !otp) 
			{
				
			newlabel8.setText("<html>*Please Check Your Mailbox For OTP (Resend after: "+(120-seconds)+" Seconds)</html>");

                seconds++;
            } 
			
			else {
                 timer.cancel();
			if(!otp)
			{				
			newlabel8.setText("<html>*You Can Re-Send OTP Mail Now.</html>");
			}			
	        verifybutton.setEnabled(true);
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

}