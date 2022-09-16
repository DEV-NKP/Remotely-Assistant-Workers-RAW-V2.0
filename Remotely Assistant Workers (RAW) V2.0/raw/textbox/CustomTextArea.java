package raw.textbox;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
 
public class CustomTextArea extends JTextArea {
 
    public Font originalFont;
    public Color originalForeground;
	public Color bgcolorac,bgcolorin,fgcolor,bordera,borderb,borderc,borderd,bordera1,borderb1,borderc1,borderd1;
    public Color placeholderForeground = Color.decode("#FA441D");
    public boolean textWrittenIn;
 

    public CustomTextArea(Color cbgcolorac,Color cbgcolorin,Color cfgcolor,Color cmsgcolor,Color cbordera,Color cborderb,Color cborderc,Color cborderd,Color cbordera1,Color cborderb1,Color cborderc1,Color cborderd1) //bg color active-bg color inactive-fg color-msg color-border color(4)-in border (4)
	{
        super();
		 this.bgcolorac =cbgcolorac;
		 this.bgcolorin =cbgcolorin;
		 this.fgcolor =cfgcolor;
		 this.placeholderForeground =cmsgcolor;
		 this.bordera =cbordera;
		 this.borderb =cborderb;
		 this.borderc =cborderc;
		 this.borderd =cborderd;
		this.bordera1 =cbordera1;
		 this.borderb1 =cborderb1;
		 this.borderc1 =cborderc1;
		 this.borderd1 =cborderd1;	
		
    }
     public CustomTextArea(Color cbgcolorac,Color cbgcolorin,Color cfgcolor,Color cmsgcolor) //bg color active-bg color inactive-fg color-msg color
	{
        super();
		 this.bgcolorac =cbgcolorac;
		 this.bgcolorin =cbgcolorin;
		 this.fgcolor =cfgcolor;
		 this.placeholderForeground =cmsgcolor;
	
	
		
    }
    @Override
    public void setFont(Font f) {
        super.setFont(f);
        if (!isTextWrittenIn()) {
            originalFont = f;
        }
    }
 
    @Override
    public void setForeground(Color fg) {
        super.setForeground(fg);
        if (!isTextWrittenIn()) {
            originalForeground = fg;
        }
    }
 
    public Color getPlaceholderForeground() {
        return placeholderForeground;
    }
 
    public void setPlaceholderForeground(Color placeholderForeground) {
        this.placeholderForeground = placeholderForeground;
    }
 
    public boolean isTextWrittenIn() {
        return textWrittenIn;
    }
 
    public void setTextWrittenIn(boolean textWrittenIn) {
        this.textWrittenIn = textWrittenIn;
    }
 
    public void setPlaceholder(final String text) {
 
        this.customizeText(text);
 
        this.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                warn();
            }
 
            @Override
            public void removeUpdate(DocumentEvent e) {
                warn();
            }
 
            @Override
            public void changedUpdate(DocumentEvent e) {
                warn();
            }
 
            public void warn() {
                if (getText().trim().length() != 0) {
                    setFont(originalFont);
                    setForeground(originalForeground);
					
                    setTextWrittenIn(true);
                }
 
            }
        });
 
        this.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (!isTextWrittenIn()) {
                    setText("");
					setBackground(bgcolorac);
					setBorder(BorderFactory.createBevelBorder(1, bordera, borderb, borderc, borderd));
                }
				setBackground(bgcolorac);
				setBorder(BorderFactory.createBevelBorder(1, bordera, borderb, borderc, borderd));
 
            }
 
            @Override
            public void focusLost(FocusEvent e) {
                if (getText().trim().length() == 0) {
                    customizeText(text);
					setBackground(bgcolorin);
				setBorder(BorderFactory.createBevelBorder(1, bordera1, borderb1, borderc1, borderd1));
                }
				setBackground(bgcolorin);
				setBorder(BorderFactory.createBevelBorder(1, bordera1, borderb1, borderc1, borderd1));
            }
 
        });
 
    }
 
    public void customizeText(String text) {
        setText(text);

        setFont(new Font(getFont().getFamily(), Font.ITALIC, getFont().getSize()));
        setForeground(getPlaceholderForeground());
        setTextWrittenIn(false);
    }
 
}