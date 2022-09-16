package raw.textbox;

 import javax.swing.*;
 import java.awt.*; 
 import java.awt.event.*;  
 import javax.swing.event.*;

 public class HintPassField extends JPasswordField {  
   
  public Font gainFont = new Font("Tahoma", Font.PLAIN, 11);  
 public Font lostFont = new Font("Tahoma", Font.ITALIC, 11);  
  
   public Color activebgColor,inactivebgColor,activefgColor,inactivefgColor,msgColorN,magColorM;
   public HintPassField(final String hint,Color cbordera,Color cborderb,Color cborderc,Color cborderd,Color cbordera1,Color cborderb1,Color cborderc1,Color cborderd1)//bg color active-bg color inactive-fg color-msg color-border color(4)-in border (4)
   {  
   
   
   
   
     setText(hint);  
     //setFont(lostFont);  
     setForeground(msgColorN);  
   
     this.addFocusListener(new FocusAdapter() {  
   
       @Override  
       public void focusGained(FocusEvent e) {  
         if (getText().equals(hint)) {  
          setText(""); 
		  setFont(gainFont);
		  setForeground(activefgColor); 
		   setBackground(activebgColor);
		setBorder(BorderFactory.createBevelBorder(1, cbordera, cborderb, cborderc, cborderd));

            
         } else {  
           setText(getText()); 
		   setFont(gainFont);  
		   setForeground(activefgColor); 
		   setBackground(activebgColor);
					setBorder(BorderFactory.createBevelBorder(1, cbordera, cborderb, cborderc, cborderd));

          
         }  
       }  
   
       @Override  
       public void focusLost(FocusEvent e) {  
         if (getText().equals(hint)|| getText().length()==0) {  
           setText(hint);  
           setFont(lostFont);  
           setForeground(magColorM);  
		   		   setBackground(inactivebgColor);
			setBorder(BorderFactory.createBevelBorder(1, cbordera1, cborderb1, cborderc1, cborderd1));

         } else {  
           setText(getText());  
           setFont(gainFont);  
           setForeground(inactivefgColor); 
		   setBackground(inactivebgColor);
			setBorder(BorderFactory.createBevelBorder(1, cbordera1, cborderb1, cborderc1, cborderd1));
		   
         }  
       }  
     });  
   
   }

     public HintPassField(final String hint)
   {  
   
   
   
   
     setText(hint);  
     //setFont(lostFont);  
     setForeground(msgColorN);  
   
     this.addFocusListener(new FocusAdapter() {  
   
       @Override  
       public void focusGained(FocusEvent e) {  
         if (getText().equals(hint)) {  
          setText(""); 
		  setFont(gainFont);
		  setForeground(activefgColor); 
		   setBackground(activebgColor);
		//setBorder(BorderFactory.createBevelBorder(1, cbordera, cborderb, cborderc, cborderd));

            
         } else {  
           setText(getText()); 
		   setFont(gainFont);  
		   setForeground(activefgColor); 
		   setBackground(activebgColor);
				//	setBorder(BorderFactory.createBevelBorder(1, cbordera, cborderb, cborderc, cborderd));

          
         }  
       }  
   
       @Override  
       public void focusLost(FocusEvent e) {  
         if (getText().equals(hint)|| getText().length()==0) {  
           setText(hint);  
           setFont(lostFont);  
           setForeground(magColorM);  
		   		   setBackground(inactivebgColor);
			//setBorder(BorderFactory.createBevelBorder(1, cbordera1, cborderb1, cborderc1, cborderd1));

         } else {  
           setText(getText());  
           setFont(gainFont);  
           setForeground(inactivefgColor); 
		   setBackground(inactivebgColor);
			//setBorder(BorderFactory.createBevelBorder(1, cbordera1, cborderb1, cborderc1, cborderd1));
		   
         }  
       }  
     });  
   
   }

   
 }  //bg color active-bg color inactive-fg color-msg color-border color(4)-in border (4)