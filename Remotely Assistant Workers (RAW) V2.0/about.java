import raw.label.*;
import raw.button.*;
import raw.panel.*;
import raw.textbox.*;
import raw.mouse.*;
import raw.font.*;
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
public class about
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


/////////////////////////////////////////////varriable declare for about(Part-GUI)//////////////////////////////////////////
	
	JLabel ablabelm2,labelmbabx,labelmbab,ablabel1,aboutleftgiflabel,aboutrightgiflabel,ablabel2,ablabel3,ablabel4,ablabel5,ablabel6,ablabel7,ablabel8,ablabel9,ablabel10,ablabel11,ablabel12,ablabel13,ablabel114,ablabel115,ablabel116,ablabel117,ablabel118,ablabel119,ablabel120,ablabel121,ablabelc,ablabelc1,ablabelc2,ablabelc3,ablabelc4,ablabelc5,ablabelc6;
	JButton abmbutton1,abmbutton2,abmbutton3,abmbutton4,abmbutton5,abmbutton6; 
	JPanel abp1,aboutleftpanel,aboutmidpanel,aboutrightpanel;
	JFrame abmainframe;
	JScrollPane aboutsecondpanelscrollbar;
	int x1,y1;
	Dimension abscreensize;
    JMenuBar mbab; 
	float barvolume=-20.0f;
	float barclickvolume=-20.0f;
	float aboutvolume=-20.0f;
	float exitvolume=-20.0f;
	Clip clip;
	public about()
	{
	    abscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        x1 = (int) ((abscreensize.getWidth() - ((abscreensize.width/2)+320)) / 2);
        y1 = (int) ((abscreensize.getHeight() - ((abscreensize.height/2)+220)) / 2);
	}
	
	public about(JFrame frame)
	{
	    abscreensize = Toolkit.getDefaultToolkit().getScreenSize();
        x1 = (int) ((abscreensize.getWidth() - ((abscreensize.width/2)+320)) / 2);
        y1 = (int) ((abscreensize.getHeight() - ((abscreensize.height/2)+220)) / 2);
		this.abmainframe=frame;
	}
	
	
	
public JMenuBar abmenubar(JFrame frame)
{

mbab = new JMenuBar();
mbab.setBackground(Color.BLACK);
mbab.setPreferredSize(new java.awt.Dimension(1000, 55));
mbab.setBorder(BorderFactory.createBevelBorder(1, Color.GRAY, Color.BLACK, Color.BLACK, Color.GRAY));

////////////////////////////////Menubar gif///////////////////////////////////////////////////////////////////	

	ImageIcon imgxab = new ImageIcon("Resources/Gifs/Common/menubar_gif.gif");  //65*65
	labelmbabx = new JLabel("",imgxab,JLabel.CENTER);
	
////////////////////////////////Menubar black label///////////////////////////////////////////////////////////////////	
	
	labelmbab = new JLabel("<html><font color=#008B8B>RAW</font></html>");
	CustomFont cf=new CustomFont();
	labelmbab.setFont(cf.customFont("Resources/Font/Common/Anurati.ttf",Font.BOLD,25.0f));
	labelmbab.setForeground(Color.decode("#00FFFF"));
	labelmbab.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	labelmbab.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	labelmbab.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	labelmbab.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	labelmbab.setAlignmentX(Component.LEFT_ALIGNMENT);


	
	abmbutton1 = new HoverButton(" HOME ");
	abmbutton1.setFont(new Font("Comic Sans",Font.PLAIN,18));
	abmbutton1.setBackground(new Color(125,125,125));
	abmbutton1.setForeground(Color.WHITE);
	abmbutton1.setCursor(handcursor);
    abmbutton1.setBorder(BorderFactory.createEtchedBorder());
	abmbutton1.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	abmbutton1.setOpaque(false);
    abmbutton1.setContentAreaFilled(false);
    abmbutton1.setBorderPainted(true);
	abmbutton1.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton1.setFocusable(false);
		abmbutton1.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	abmbutton1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{ 
		MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		
		clip.stop();
		
		
			mainmenu m1 = new mainmenu(abmainframe);
			abmainframe.setJMenuBar(null);
			abmainframe.getContentPane().removeAll();
			abmainframe.setJMenuBar(m1.menubar(abmainframe));
			//abmainframe.getContentPane().add(m1.menu(abmainframe));
			abmainframe.setContentPane(m1.menu(abmainframe));
			abmainframe.setVisible(true);
		}		
		
	});
	//------------------------------------------------------	
	abmbutton2 = new HoverButton(" ABOUT ");
	abmbutton2.setFont(new Font("Comic Sans",Font.PLAIN,18));
	abmbutton2.setBackground(new Color(125,125,125));
	abmbutton2.setForeground(Color.WHITE);
	abmbutton2.setCursor(handcursor);
    abmbutton2.setBorder(BorderFactory.createEtchedBorder());
	abmbutton2.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.WHITE, Color.WHITE, Color.WHITE));
	abmbutton2.setOpaque(false);
    abmbutton2.setContentAreaFilled(false);
    abmbutton2.setBorderPainted(true);
	abmbutton2.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton2.setFocusable(false);
		abmbutton2.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
		abmbutton2.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		clip.stop();
			
			about ab = new about(abmainframe);
			abmainframe.setJMenuBar(null);
			abmainframe.getContentPane().removeAll();
			
			abmainframe.setJMenuBar(ab.abmenubar(abmainframe));
			//abmainframe.getContentPane().add(ab.aboutus(abmainframe));
			abmainframe.setContentPane(ab.aboutus(abmainframe));
			abmainframe.setVisible(true);	
		}		
		
	});	
	
	
	//------------------------------------------------------	
	abmbutton3 = new HoverButton(" CONTACT ");
	abmbutton3.setFont(new Font("Comic Sans",Font.PLAIN,18));
	abmbutton3.setBackground(new Color(125,125,125));
	abmbutton3.setForeground(Color.WHITE);
	abmbutton3.setCursor(handcursor);
    abmbutton3.setBorder(BorderFactory.createEtchedBorder());
	abmbutton3.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	abmbutton3.setOpaque(false);
    abmbutton3.setContentAreaFilled(false);
    abmbutton3.setBorderPainted(true);
	abmbutton3.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton3.setFocusable(false);	
		abmbutton3.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
			abmbutton3.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		clip.stop();
			
			
			abmainframe.setJMenuBar(null);
			abmainframe.getContentPane().removeAll();
			
			 contact c = new contact(abmainframe);
			
			abmainframe.setJMenuBar(c.contactbar(abmainframe));
			//abmainframe.getContentPane().add(c.contactpage(abmainframe));
			abmainframe.setContentPane(c.contactpage(abmainframe));
			
			abmainframe.setVisible(true);	
		}		
		
	});	
	
	
	//------------------------------------------------------	
	abmbutton4 = new HoverButton(" FEEDBACK ");
	abmbutton4.setFont(new Font("Comic Sans",Font.PLAIN,18));
	abmbutton4.setBackground(new Color(125,125,125));
	abmbutton4.setForeground(Color.WHITE);
	abmbutton4.setCursor(handcursor);
    abmbutton4.setBorder(BorderFactory.createEtchedBorder());
	abmbutton4.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	abmbutton4.setOpaque(false);
    abmbutton4.setContentAreaFilled(false);
    abmbutton4.setBorderPainted(true);
	abmbutton4.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton4.setFocusable(false);
	
		abmbutton4.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
		abmbutton4.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		clip.stop();
			
			
			abmainframe.setJMenuBar(null);
			abmainframe.getContentPane().removeAll();
			
			 feedback f = new feedback(abmainframe);
			
			abmainframe.setJMenuBar(f.feedbackbar(abmainframe));
			abmainframe.setContentPane(f.feedbackpage(abmainframe));
			
			abmainframe.setVisible(true);	
		}		
		
	});	
	
	
	
	//------------------------------------------------------	
	abmbutton5 = new HoverButton(" REPORT ");
	abmbutton5.setFont(new Font("Comic Sans",Font.PLAIN,18));
	abmbutton5.setBackground(new Color(125,125,125));
	abmbutton5.setForeground(Color.decode("#00c700"));
	abmbutton5.setCursor(handcursor);
    abmbutton5.setBorder(BorderFactory.createEtchedBorder());
	abmbutton5.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK, Color.BLACK, Color.BLACK));
	abmbutton5.setOpaque(false);
    abmbutton5.setContentAreaFilled(false);
    abmbutton5.setBorderPainted(true);
	abmbutton5.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton5.setFocusable(false);
		abmbutton5.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
		abmbutton5.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
		clip.stop();
			
			
			abmainframe.setJMenuBar(null);
			abmainframe.getContentPane().removeAll();
			
			 report r = new report(abmainframe);
			
			abmainframe.setJMenuBar(r.reportbar(abmainframe));
			abmainframe.setContentPane(r.reportpage(abmainframe));
			
			abmainframe.setVisible(true);	
		}		
		
	});	
	//------------------------------------------------------	
	abmbutton6 = new HoverButton(" EXIT ");
	abmbutton6.setFont(new Font("Comic Sans",Font.BOLD,18));
	abmbutton6.setBackground(new Color(125,125,125));
	abmbutton6.setForeground(Color.RED);
	abmbutton6.setCursor(handcursor);
    abmbutton6.setBorder(BorderFactory.createEtchedBorder());
	abmbutton6.setBorder(BorderFactory.createBevelBorder(1, Color.RED, Color.BLACK, Color.BLACK, Color.RED));
	abmbutton6.setOpaque(false);
    abmbutton6.setContentAreaFilled(false);
    abmbutton6.setBorderPainted(true);
	abmbutton6.setAlignmentX(Component.CENTER_ALIGNMENT);
	abmbutton6.setFocusable(false);
		abmbutton6.addMouseListener(new MouseAdapter(){
	
		public void mouseEntered(MouseEvent e)
		{	
		
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_enter.wav",barvolume);

		}		
		
	});	
	
     abmbutton6.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			MouseClickSound ms=new MouseClickSound();
		ms.clickSound("Resources/Audio/Common/mouse_click.wav",barclickvolume);
			
		exit ex=new exit(abmainframe);
			ex.confirmexit(abmainframe,exitvolume);
		
		}		
		
	});
	
	//-------------------------------------------------------------------
	
	
/////////////////////////////////Menubar button add on the menubar label///////////////////////////////////////////////////////

	
	mbab.add(Box.createRigidArea(new Dimension(10, 0)));
	mbab.add(labelmbabx);
	
	mbab.add(labelmbab);
	
	mbab.add(abmbutton1);
	mbab.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbab.add(abmbutton2);
	mbab.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbab.add(abmbutton3);
	mbab.add(Box.createRigidArea(new Dimension(25,0)));
	
	mbab.add(abmbutton4);
	mbab.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbab.add(abmbutton5);
	mbab.add(Box.createRigidArea(new Dimension(25, 0)));
	
	mbab.add(abmbutton6);
	mbab.add(Box.createRigidArea(new Dimension(50, 0)));

return mbab;

}
	
	
public JPanel aboutus(JFrame frame)
{
	
	
		try{
	
AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("Resources/Audio/About/about_music.wav"));
clip = AudioSystem.getClip();
clip.open(audioInputStream);
FloatControl gainControl =(FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);

gainControl.setValue(aboutvolume);
clip.start();
clip.loop(1000);	
		}
				catch(MalformedURLException ae)
				{
					System.out.println(ae);
				}
				catch(UnsupportedAudioFileException ae)
				{
					System.out.println(ae);
				}
				catch(LineUnavailableException ae)
				{
					System.out.println(ae);
				}
				catch(IOException ae)
				{
					System.out.println(ae);
				}
	
	
////////////////////////main pannel initialize//////////////
	
	abp1 = new JPanel();
    abp1.setSize((frame.getWidth()), (frame.getHeight()));
	abp1.setBackground(Color.decode("#191919"));
	abp1.setLayout(new BoxLayout(abp1, BoxLayout.X_AXIS));////////////////row<COL<X GAP<Y GAP
	abp1.setBorder(null);////////////////top<Left<bottom<right
	abp1.setOpaque(false);


////////////////////////left, middle and right panel//////////////////////

	aboutleftpanel = new JPanel();
	aboutmidpanel = new JPanel();
	aboutrightpanel = new JPanel();
	
////////////////////////left, middle and right panel initialize//////////////////////

	aboutleftpanel.setBackground(Color.decode("#2C2F33"));
	aboutleftpanel.setLayout(null);
	aboutleftpanel.setLayout(new GridLayout(1,1,0,0));
	aboutleftpanel.setBorder(null);
	aboutleftpanel.setMinimumSize(new Dimension(100, 0));
	aboutleftpanel.setPreferredSize(new Dimension(100, 0));

	aboutmidpanel.setSize(300,1000);
	aboutmidpanel.setBackground(Color.decode("#23272A"));
	aboutmidpanel.setLayout(new BoxLayout(aboutmidpanel, BoxLayout.Y_AXIS));
	aboutmidpanel.setBorder(new EmptyBorder(50,20,50,20));
	aboutmidpanel.setAlignmentX(Component.CENTER_ALIGNMENT);
	aboutmidpanel.setMinimumSize(new Dimension(700, 3000));
	aboutmidpanel.setPreferredSize(new Dimension(700, 3000));
	
	aboutrightpanel.setBackground(Color.decode("#2C2F33"));
	aboutrightpanel.setLayout(null);
	aboutrightpanel.setLayout(new GridLayout(1,1,0,0));
	aboutrightpanel.setBorder(null);
	aboutrightpanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
	aboutrightpanel.setMinimumSize(new Dimension(100, 0));
	aboutrightpanel.setPreferredSize(new Dimension(100, 0));
	
	
////////////////////////////Scroll for second/middle panel//////////////////////////

	aboutsecondpanelscrollbar = new JScrollPane(aboutmidpanel);
	aboutsecondpanelscrollbar.getVerticalScrollBar().setUnitIncrement(10);
    aboutsecondpanelscrollbar.getVerticalScrollBar().setPreferredSize(new Dimension(0,0));
	aboutsecondpanelscrollbar.getHorizontalScrollBar().setPreferredSize(new Dimension(0,0));
	aboutsecondpanelscrollbar.setBorder(null);
	aboutsecondpanelscrollbar.setViewportBorder(null);
	aboutsecondpanelscrollbar.getVerticalScrollBar().setBorder(null);
	aboutsecondpanelscrollbar.getHorizontalScrollBar().setBorder(null);
	aboutsecondpanelscrollbar.setOpaque(true);
	


//////////////////////////////////////About Raw/////////////////////////////////////////////////
	
	ablabel1 = new JLabel("<html><font>About Raw</html>");
	ablabel1.setFont(new Font("Footlight MT Light",Font.PLAIN,45));
	ablabel1.setForeground(Color.decode("#FA441D"));
	ablabel1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel1.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	ablabel1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel1.setCursor(textcursor);
	
	ablabel2 = new JLabel("<html><font color=#fafafa size = 5><b>Raw Definition:</b></font><font size = 5> The RAW stands for Remotely Assistant Worker. This is basically a job site for the buyer and seller. It works like a freelancing site but is different for its functionality from the others.</font></html>");
	ablabel2.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel2.setForeground(Color.decode("#a9a9a9"));
	ablabel2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel2.setCursor(textcursor);
	
	ablabel3 = new JLabel("<html><font color=#fafafa size = 5><b>Acting Actors:</b></font><font size = 5> In the RAW management system there are mainly three actors. They are gradually, Buyer, Seller and Admin.</font></html>");
	ablabel3.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel3.setForeground(Color.decode("#a9a9a9"));
	ablabel3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel3.setCursor(textcursor);
	
	ablabel4 = new JLabel("<html><font color=#fafafa size = 5><b>Post a Job:</b></font><font size = 5> The whole process starts by posting a job by the Buyer. A buyer will post a job and he/she have the full access to make that job updated, to delete that job and so on.</font></html>");
	ablabel4.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel4.setForeground(Color.decode("#a9a9a9"));
	ablabel4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel4.setCursor(textcursor);
	
	ablabel5 = new JLabel("<html><font color=#fafafa size = 5><b>Request, Accept and Submit:</b></font><font size = 5> A seller can see the description of the job and can request to get that. If Buyer accepts his request, then the status of that job will be Pending and after finishing the job Seller has to submit that to the Buyer through a submission link.</font></html>");
	ablabel5.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel5.setForeground(Color.decode("#a9a9a9"));
	ablabel5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel5.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel5.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel5.setCursor(textcursor);

	ablabel6 = new JLabel("<html><font color=#fafafa size = 5><b>Exceptional Cases:</b></font><font size = 5> If any seller rejects a job or any Buyer rejects a Seller after requesting for the job that job will be available for the other Sellers until the Buyer deletes the job.</font></html>");
	ablabel6.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel6.setForeground(Color.decode("#a9a9a9"));
	ablabel6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel6.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel6.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel6.setCursor(textcursor);
	
	ablabel7 = new JLabel("<html><font color=#fafafa size = 5><b>Transaction:</b></font><font size = 5> Admin of the system will get 10% for every job if the Buyer accept the job which is submitted by the Seller. Suppose if the job in worth of 70$ then a Seller will get 63$(without bonus) and admin will get 7$ for the maintenance of the System.</font></html>");
	ablabel7.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel7.setForeground(Color.decode("#a9a9a9"));
	ablabel7.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel7.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel7.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel7.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel7.setCursor(textcursor);
	
	ablabel8 = new JLabel("<html><font color=#fafafa size = 5><b>Message:</b></font><font size = 5> Messaging is one of the best features of this system. A seller and a Buyer will be able to contact with each other directly for their own staffs.</font></html>");
	ablabel8.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel8.setForeground(Color.decode("#a9a9a9"));
	ablabel8.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel8.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel8.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel8.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel8.setCursor(textcursor);
	
	ablabel9 = new JLabel("<html><font color=#fafafa size = 5><b>Mail:</b></font><font size = 5> A seller and a buyer can send a formal mail to each other through this system.</font></html>");
	ablabel9.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel9.setForeground(Color.decode("#a9a9a9"));
	ablabel9.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel9.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel9.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel9.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel9.setCursor(textcursor);
	
	ablabel10 = new JLabel("<html><font color=#fafafa size = 5><b>Review and Bonus:</b></font><font size = 5> There is a review system where a Buyer will give a review to the Seller for his work and can give bonus if he wants to do so. A Seller can also give a review to the Buyer. Here it is notable that admin will not get any commission from the bonus.</font></html>");
	ablabel10.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel10.setForeground(Color.decode("#a9a9a9"));
	ablabel10.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel10.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel10.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel10.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel10.setCursor(textcursor);
	
	ablabel11 = new JLabel("<html><font color=#fafafa size = 5><b>Report:</b></font><font size = 5> Buyer can report a seller for any kind issue and also Seller can do the same. Report will be redirected to the Admin and Admin will make a decision what to do.</font></html>");
	ablabel11.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel11.setForeground(Color.decode("#a9a9a9"));
	ablabel11.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel11.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel11.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel11.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel11.setCursor(textcursor);
	
	ablabel12 = new JLabel("<html><font color=#fafafa size = 5><b>Feedback:</b></font><font size = 5> System update is very necessary thing. So, your feedback is must to make an update of the system. We will obviously give an eye on your feedbacks and will try to make a good one and more appreciative.</font></html>");
	ablabel12.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel12.setForeground(Color.decode("#a9a9a9"));
	ablabel12.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel12.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel12.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel12.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel12.setCursor(textcursor);


//////////////////////////////////////Software Information/////////////////////////////////////////////////
		
	ablabel13 = new JLabel("<html><font>Software Information</html>");
	ablabel13.setFont(new Font("Footlight MT Light",Font.PLAIN,45));
	ablabel13.setForeground(Color.decode("#FA441D"));
	ablabel13.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel13.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	ablabel13.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel13.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel13.setCursor(textcursor);

	ablabel114 = new JLabel("<html><font color=#7289DA size = 6>Minimum Specification:</font></html>");
	ablabel114.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel114.setForeground(Color.RED);
	ablabel114.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel114.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel114.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel114.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel114.setCursor(textcursor);
	
	ablabel115 = new JLabel("<html><font color=#fafafa size = 5>Software Version:</font><font size = 5> 2.0</font></html>");
	ablabel115.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel115.setForeground(Color.decode("#a9a9a9"));
	ablabel115.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel115.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel115.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel115.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel115.setCursor(textcursor);
	
	ablabel116 = new JLabel("<html><font color=#fafafa size = 5>OS:</font><font size = 5> Windows® 7/8/10</font></html>");
	ablabel116.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel116.setForeground(Color.decode("#a9a9a9"));
	ablabel116.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel116.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel116.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel116.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel116.setCursor(textcursor);
	
	ablabel117 = new JLabel("<html><font color=#fafafa size = 5>Processor:</font><font size = 5> Intel Core</font><font size = 3><sup>TM</sup></font> 2 Duo E7500</font></html>");
	ablabel117.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel117.setForeground(Color.decode("#a9a9a9"));
	ablabel117.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel117.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel117.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel117.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel117.setCursor(textcursor);
	
	ablabel118 = new JLabel("<html><font color=#fafafa size = 5>Memory:</font><font size = 5> 2 GB RAM</font></html>");
	ablabel118.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel118.setForeground(Color.decode("#a9a9a9"));
	ablabel118.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel118.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel118.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel118.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel118.setCursor(textcursor);
	
	ablabel119 = new JLabel("<html><font color=#fafafa size = 5>Graphics:</font><font size = 5> Not Required</font></html>");
	ablabel119.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel119.setForeground(Color.decode("#a9a9a9"));
	ablabel119.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel119.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel119.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel119.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel119.setCursor(textcursor);
	
	ablabel120 = new JLabel("<html><font color=#fafafa size = 5>Network:</font><font size = 5> Broadband Internet connection</font></html>");
	ablabel120.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel120.setForeground(Color.decode("#a9a9a9"));
	ablabel120.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel120.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel120.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel120.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel120.setCursor(textcursor);
	
	ablabel121 = new JLabel("<html><font color=#fafafa size = 5>Storage:</font><font size = 5> 1 GB available space</font></html>");
	ablabel121.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabel121.setForeground(Color.decode("#a9a9a9"));
	ablabel121.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabel121.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabel121.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabel121.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabel121.setCursor(textcursor);
	
//////////////////////////////////////////////////// Credits ///////////////////////////////////////////////////////////////////////////////////////	
	
	ablabelc = new JLabel("<html><font>Credits</html>");
	ablabelc.setFont(new Font("Footlight MT Light",Font.PLAIN,45));
	ablabelc.setForeground(Color.decode("#FA441D"));
	ablabelc.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc.setCursor(textcursor);
	
	ablabelc1 = new JLabel("<html><font color=#7289DA size = 6><b>Instructor:</font></html>");
	ablabelc1.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc1.setForeground(Color.RED);
	ablabelc1.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc1.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc1.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc1.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc1.setCursor(textcursor);
	
	ablabelc2 = new JLabel("<html><font color=#faebd7 size = 5><b>Md. Nazmul Hossain</b></font><br><font size = 5>Lecturer, CS<br>American International University-Bangladesh</font></html>");
	ablabelc2.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc2.setForeground(Color.decode("#a9a9a9"));
	ablabelc2.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc2.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc2.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc2.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc2.setCursor(textcursor);
	
	ablabelc3 = new JLabel("<html><font color=#7289DA size = 6><b>Developer:</font></html>");
	ablabelc3.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc3.setForeground(Color.RED);
	ablabelc3.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc3.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc3.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc3.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc3.setCursor(textcursor);
	
	ablabelc4 = new JLabel("<html><font color=#f0f8ff size = 5><b>1. Niloy Kanti Paul</b></font><br><br><font size = 5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BSc in CSE<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;American International University-Bangladesh<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact: 01787700037<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: niloykanti.paul2017@gmail.com<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Facebook: Niloy Kanti Paul</font></html>");
	ablabelc4.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc4.setForeground(Color.decode("#a9a9a9"));
	ablabelc4.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc4.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc4.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc4.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc4.setCursor(textcursor);
	
	ablabelc5 = new JLabel("<html><font color=#f0f8ff size = 5><b>2. Kaushik Biswas</b></font><br><br><font size = 5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BSc in CSE<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;American International University-Bangladesh<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact: 01778385387<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: biswaskaushik2020@gmail.com<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Facebook: Kaushik Biswas</font></html>");
	ablabelc5.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc5.setForeground(Color.decode("#a9a9a9"));
	ablabelc5.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc5.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc5.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc5.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc5.setCursor(textcursor);
	
	ablabelc6 = new JLabel("<html><font color=#f0f8ff size = 5><b>3. Dipanwita Saha</b></font><br><br><font size = 5>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;BSc in CSE<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;American International University-Bangladesh<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Contact: 01720246009<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Email: dipanwitasaha7009@gmail.com<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Facebook: Dipanwita Saha</font></html>");
	ablabelc6.setFont(new Font("Times New Roman",Font.PLAIN,15));
	ablabelc6.setForeground(Color.decode("#a9a9a9"));
	ablabelc6.setVerticalAlignment(JLabel.TOP);/////y axis for all-TOP,CENTER,BOTTOM
	ablabelc6.setHorizontalAlignment(JLabel.LEFT);////x axis for all-LEFT,CENTER,RIGHT
	ablabelc6.setHorizontalTextPosition(JLabel.LEFT);////x axis for text-LEFT,CENTER,RIGHT
	ablabelc6.setVerticalTextPosition(JLabel.TOP);/////y axis for text-TOP,CENTER,BOTTOM
	ablabelc6.setCursor(textcursor);
////////////////////////////////////////Image for credit issue Niloy Kanti Paul/////////////////////////////////////	
   
    Image imgcr1 = null;
	try
	{
		
        imgcr1 = ImageIO.read(new File("Resources/Images/About/niloy_paul_credit_picture.png"));//100*100
	}
	catch (Exception exp)
	{
        exp.printStackTrace();
    }
	
	ImagePanel acrimg1= new ImagePanel(imgcr1);
	acrimg1.setBackground(Color.decode("#00000"));
	acrimg1.setLayout(null);
	acrimg1.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.BLACK, Color.BLACK, Color.WHITE));
	acrimg1.setAlignmentX(Component.LEFT_ALIGNMENT);
	acrimg1.setMinimumSize(new Dimension(130, 150));
	acrimg1.setPreferredSize(new Dimension(130, 150));
	acrimg1.setMaximumSize(new Dimension(130, 150));	
	
////////////////////////////////////////Image for credit issue Kauhsik Biswas/////////////////////////////////////	
	
	Image imgcr2 = null;
	try
	{
		
        imgcr2 = ImageIO.read(new File("Resources/Images/About/kaushik_credit_picture.png"));//100*100
	} 

    catch (Exception exp)
	{
        exp.printStackTrace();
    }
	
	ImagePanel acrimg2= new ImagePanel(imgcr2);
	acrimg2.setBackground(Color.decode("#00000"));
	acrimg2.setLayout(null);
	acrimg2.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.BLACK, Color.BLACK, Color.WHITE));
	acrimg2.setAlignmentX(Component.LEFT_ALIGNMENT);
	acrimg2.setMinimumSize(new Dimension(130, 150));
	acrimg2.setPreferredSize(new Dimension(130, 150));
	acrimg2.setMaximumSize(new Dimension(130, 150));	
	
////////////////////////////////////////Image for credit issue Instructor/////////////////////////////////////	
	
	Image imgcr3 = null;
	try
	{
		imgcr3 = ImageIO.read(new File("Resources/Images/About/instructor_credit_picture.png"));//100*100
	}
	
	catch (Exception exp) 
	{
        exp.printStackTrace();
    }
		
	ImagePanel acrimg3= new ImagePanel(imgcr3);
	acrimg3.setBackground(Color.decode("#00000"));
	acrimg3.setLayout(null);
	acrimg3.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.BLACK, Color.BLACK, Color.WHITE));
	acrimg3.setAlignmentX(Component.LEFT_ALIGNMENT);
	acrimg3.setMinimumSize(new Dimension(130, 150));
	acrimg3.setPreferredSize(new Dimension(130, 150));
	acrimg3.setMaximumSize(new Dimension(130, 150));
	
////////////////////////////////////////Image for credit issue Instructor/////////////////////////////////////	
	
	Image imgcr4 = null;
	try
	{
		imgcr4 = ImageIO.read(new File("Resources/Images/About/dipanwita_saha_credit_picture.png"));//100*100
	}
	
	catch (Exception exp) 
	{
        exp.printStackTrace();
    }
		
	ImagePanel acrimg4= new ImagePanel(imgcr4);
	acrimg4.setBackground(Color.decode("#00000"));
	acrimg4.setLayout(null);
	acrimg4.setBorder(BorderFactory.createBevelBorder(1, Color.WHITE, Color.BLACK, Color.BLACK, Color.WHITE));
	acrimg4.setAlignmentX(Component.LEFT_ALIGNMENT);
	acrimg4.setMinimumSize(new Dimension(130, 150));
	acrimg4.setPreferredSize(new Dimension(130, 150));
	acrimg4.setMaximumSize(new Dimension(130, 150));

///////////////////////////////////////Side panel GIFs///////////////////////////////////////////////////		
		
	ImageIcon imgx0 = new ImageIcon("Resources/Gifs/About/aboutpage_leftside_gif.gif");  //248*248
	aboutleftgiflabel = new JLabel("",imgx0,JLabel.CENTER);
	aboutleftgiflabel.setSize(imgx0.getIconWidth(),imgx0.getIconHeight());
	aboutleftgiflabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	aboutleftgiflabel.setVerticalAlignment(JLabel.CENTER);/////y axis for all-TOP,CENTER,BOTTOM
	aboutleftgiflabel.setHorizontalAlignment(JLabel.CENTER);////x axis for all-LEFT,CENTER,RIGHT
	aboutleftgiflabel.setHorizontalTextPosition(JLabel.CENTER);////x axis for text-LEFT,CENTER,RIGHT
	aboutleftgiflabel.setVerticalTextPosition(JLabel.CENTER);/////y axis for text-TOP,CENTER,BOTTOM
	aboutleftgiflabel.setAlignmentX(Component.CENTER_ALIGNMENT);
	aboutleftgiflabel.setAlignmentY(Component.CENTER_ALIGNMENT);
	
	ImageIcon imgx1 = new ImageIcon("Resources/Gifs/About/aboutpage_rightside_gif.gif");  //248*248
	aboutrightgiflabel = new JLabel("",imgx1,JLabel.CENTER);
	aboutrightgiflabel.setSize(imgx1.getIconWidth(),imgx1.getIconHeight());
	aboutrightgiflabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
//////////////////////////Add component in the main label/////////////////////////////	
		
		aboutleftpanel.add(aboutleftgiflabel);
		aboutrightpanel.add(aboutrightgiflabel);
		
		aboutmidpanel.add(ablabel1);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 40)));
		aboutmidpanel.add(ablabel2);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel3);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel4);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel5);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel6);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel7);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel8);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel9);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel10);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel11);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel12);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 100)));
		aboutmidpanel.add(ablabel13);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 50)));
		aboutmidpanel.add(ablabel114);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel115);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel116);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel117);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel118);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel119);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel120);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabel121);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 100)));
		aboutmidpanel.add(ablabelc);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 50)));
		aboutmidpanel.add(ablabelc1);

		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 30)));
	    aboutmidpanel.add(acrimg3);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabelc2);
		
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 50)));
		aboutmidpanel.add(ablabelc3);

		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 30)));
		aboutmidpanel.add(acrimg1);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabelc4);
		
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 30)));
	    aboutmidpanel.add(acrimg2);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabelc5);
		
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 30)));
	    aboutmidpanel.add(acrimg4);
		aboutmidpanel.add(Box.createRigidArea(new Dimension(0, 15)));
		aboutmidpanel.add(ablabelc6);
		
	abp1.add(aboutleftpanel);
	abp1.add(Box.createRigidArea(new Dimension(0, 0)));
	abp1.add(aboutsecondpanelscrollbar);
	
	abp1.add(Box.createRigidArea(new Dimension(0, 0)));
	abp1.add(aboutrightpanel);

	return abp1;
	
	}
	
}