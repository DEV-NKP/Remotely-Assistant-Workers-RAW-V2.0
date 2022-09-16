package raw.combobox;

import java.lang.*; 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.border.AbstractBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import java.net.*;
import java.net.URISyntaxException;
import java.io.*; 
import java.awt.event.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalScrollBarUI;
import javax.imageio.ImageIO;
import javax.swing.plaf.basic.*;
import javax.swing.plaf.*;
 
public class CustomComboBox{
	
	Color cbgcolor,cfgcolor,csbgcolor,csfgcolor;
Color buttonbg,buttonshad,buttondarks,buttonhigh;
JComboBox combo;
		public CustomComboBox(Color bg, Color fg, Color sbg, Color sfg)
		{
			
			this.cbgcolor=bg;
	  this.cfgcolor=fg;
	  this.csbgcolor=sbg;
	  this.csfgcolor=sfg;
		}	
			
	  public void setButtonBG(Color a)
  {
	  this.buttonbg=a;
  }
   public void setButtonS(Color a)
  {
	  this.buttonshad=a;
  }
   public void setButtonDS(Color a)
  {
	  this.buttondarks=a;
  }
  public void setButtonH(Color a)
  {
	  this.buttonhigh=a;
  }		
  public String getname()
  {
	  String n=((ImagesNText)combo.getSelectedItem()).getName();
	  return n;
  }	

public JComboBox customComboBox(DefaultComboBoxModel d)
  {
	 


UIManager.put("ComboBox.background", new ColorUIResource(cbgcolor));
UIManager.put("ComboBox.foreground", new ColorUIResource(cfgcolor));
UIManager.put("ComboBox.selectionBackground", new ColorUIResource(csbgcolor));
UIManager.put("ComboBox.selectionForeground", new ColorUIResource(csfgcolor));
			
			combo =new JComboBox();
			combo.setPreferredSize(new Dimension(200,60));
			//combo.setModel(populate());
			combo.setModel(d);
			combo.setRenderer(new ImagesTextRenderer());
			 combo.setUI(new BasicComboBoxUI(){


        protected JButton createArrowButton()
        {
            BasicArrowButton arrowButton = new BasicArrowButton(BasicArrowButton.SOUTH, buttonbg, buttonshad, buttondarks, buttonhigh);//int direction,Color background,Color shadow,Color darkShadow,Color highlight
            return arrowButton;
        }
    });
			
			
			return combo;
  }
  public DefaultComboBoxModel companytype()
		{
			DefaultComboBoxModel dm = new DefaultComboBoxModel();
			 

dm.addElement(new ImagesNText( "    Select Your Company Type" ));
dm.addElement(new ImagesNText(new ImageIcon("Resources/Images/CompanyType/1.png"), "<html> Individual </html>"	 ));
dm.addElement(new ImagesNText(new ImageIcon("Resources/Images/CompanyType/2.png"),"<html> Company Use </html>" ));
dm.addElement(new ImagesNText(new ImageIcon("Resources/Images/CompanyType/3.png"),	"<html> Dual or Multiple </html>" ));	
			return dm;
		}
		public DefaultComboBoxModel countrycode()
		{
			DefaultComboBoxModel dm = new DefaultComboBoxModel();
dm.addElement(new ImagesNText( "    Select Your Country" ));

 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Afghanistan.png"), "<html> Afghanistan <font color =#808080>(+93)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Aland_Islands.png"), "<html> Aland Islands <font color =#808080>(+358)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Albania.png"), "<html> Albania <font color =#808080>(+355)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Algeria.png"), "<html> Algeria <font color =#808080>(+213)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/American_Samoa.png"), "<html> American Samoa <font color =#808080>(+1-684)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Andorra.png"), "<html> Andorra <font color =#808080>(+376)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Angola.png"), "<html> Angola <font color =#808080>(+244)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Anguilla.png"), "<html> Anguilla <font color =#808080>(+1-264)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Antarctica.png"), "<html> Antarctica <font color =#808080>(+672)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Antigua_and_Barbuda.png"), "<html> Antigua and Barbuda <font color =#808080>(+1-268)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Argentina.png"), "<html> Argentina <font color =#808080>(+54)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Armenia.png"), "<html> Armenia <font color =#808080>(+374)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Aruba.png"), "<html> Aruba <font color =#808080>(+297)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Australia.png"), "<html> Australia <font color =#808080>(+61)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Austria.png"), "<html> Austria <font color =#808080>(+ 43)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Azerbaijan.png"), "<html> Azerbaijan <font color =#808080>(+ 994)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bahamas.png"), "<html> Bahamas <font color =#808080>(+ 1-242)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bahrain.png"), "<html> Bahrain <font color =#808080>(+ 973)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bangladesh.png"), "<html> Bangladesh <font color =#808080>(+ 880)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Barbados.png"), "<html> Barbados <font color =#808080>(+ 1-246)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belarus.png"), "<html> Belarus <font color =#808080>(+ 375)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belgium.png"), "<html> Belgium <font color =#808080>(+ 32)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belize.png"), "<html> Belize <font color =#808080>(+ 501)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Benin.png"), "<html> Benin <font color =#808080>(+ 229)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bermuda.png"), "<html> Bermuda <font color =#808080>(+ 1-441)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bhutan.png"), "<html> Bhutan <font color =#808080>(+ 975)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bolivia.png"), "<html> Bolivia <font color =#808080>(+ 591)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bonaire.png"), "<html> Bonaire <font color =#808080>(+599)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bosnia_and_Herzegovina.png"), "<html> Bosnia and Herzegovina <font color =#808080>(+ 387)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Botswana.png"), "<html> Botswana <font color =#808080>(+ 267)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bouvet_Island.png"), "<html> Bouvet Island <font color =#808080>(+47)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Brazil.png"), "<html> Brazil <font color =#808080>(+ 55)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/British_Indian_Ocean_Territory.png"), "<html> British Indian Ocean Territory <font color =#808080>(+246)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/British_Virgin_Islands.png"), "<html> British Virgin Islands <font color =#808080>(+1-284)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Brunei.png"), "<html> Brunei <font color =#808080>(+673)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bulgaria.png"), "<html> Bulgaria <font color =#808080>(+359)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Burkina_Faso.png"), "<html> Burkina Faso <font color =#808080>(+226)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Burundi.png"), "<html> Burundi <font color =#808080>(+257)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cambodia.png"), "<html> Cambodia <font color =#808080>(+855)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cameroon.png"), "<html> Cameroon <font color =#808080>(+237)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Canada.png"), "<html> Canada <font color =#808080>(+1)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cape_Verde.png"), "<html> Cape Verde <font color =#808080>(+238)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cayman_Islands.png"), "<html> Cayman Islands <font color =#808080>(+1-345)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Central_African_Republic.png"), "<html> Central African Republic <font color =#808080>(+236)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Chad.png"), "<html> Chad <font color =#808080>(+235)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Chile.png"), "<html> Chile <font color =#808080>(+56)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/China.png"), "<html> China <font color =#808080>(+86)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Christmas_Island.png"), "<html> Christmas Island <font color =#808080>(+61)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cocos_Islands.png"), "<html> Cocos Islands <font color =#808080>(+61)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Colombia.png"), "<html> Colombia <font color =#808080>(+57)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Comoros.png"), "<html> Comoros <font color =#808080>(+269)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cook_Islands.png"), "<html> Cook Islands <font color =#808080>(+682)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Costa_Rica.png"), "<html> Costa Rica <font color =#808080>(+506)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Croatia.png"), "<html> Croatia <font color =#808080>(+385)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cuba.png"), "<html> Cuba <font color =#808080>(+53)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Curacao.png"), "<html> Curacao <font color =#808080>(+599)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cyprus.png"), "<html> Cyprus <font color =#808080>(+357)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Czech_Republic.png"), "<html> Czech Republic <font color =#808080>(+420)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Democratic_Republic_of_the_Congo.png"), "<html> Democratic Republic of the Congo <font color =#808080>(+243)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Denmark.png"), "<html> Denmark <font color =#808080>(+45)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Djibouti.png"), "<html> Djibouti <font color =#808080>(+253)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Dominica.png"), "<html> Dominica <font color =#808080>(+1-767)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Dominican_Republic.png"), "<html> Dominican Republic <font color =#808080>(+1-809, 1-829, 1-849)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/East_Timor.png"), "<html> East Timor <font color =#808080>(+670)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ecuador.png"), "<html> Ecuador <font color =#808080>(+593)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Egypt.png"), "<html> Egypt <font color =#808080>(+20)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/El_Salvador.png"), "<html> El Salvador <font color =#808080>(+503)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/England.png"), "<html> England <font color =#808080>(+ 44)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Equatorial_Guinea.png"), "<html> Equatorial Guinea <font color =#808080>(+240)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Eritrea.png"), "<html> Eritrea <font color =#808080>(+291)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Estonia.png"), "<html> Estonia <font color =#808080>(+372)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ethiopia.png"), "<html> Ethiopia <font color =#808080>(+251)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Falkland_Islands.png"), "<html> Falkland Islands <font color =#808080>(+500)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Faroe_Islands.png"), "<html> Faroe Islands <font color =#808080>(+298)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Fiji.png"), "<html> Fiji <font color =#808080>(+679)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Finland.png"), "<html> Finland <font color =#808080>(+358)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/France.png"), "<html> France <font color =#808080>(+33)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Guiana.png"), "<html> French Guiana <font color =#808080>(+594)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Polynesia.png"), "<html> French Polynesia <font color =#808080>(+689)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Southern_Territories.png"), "<html> French Southern Territories <font color =#808080>(+262)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gabon.png"), "<html> Gabon <font color =#808080>(+241)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gambia.png"), "<html> Gambia <font color =#808080>(+220)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Georgia.png"), "<html> Georgia <font color =#808080>(+995)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Germany.png"), "<html> Germany <font color =#808080>(+49)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ghana.png"), "<html> Ghana <font color =#808080>(+233)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gibraltar.png"), "<html> Gibraltar <font color =#808080>(+350)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Greece.png"), "<html> Greece <font color =#808080>(+30)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Greenland.png"), "<html> Greenland <font color =#808080>(+299)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Grenada.png"), "<html> Grenada <font color =#808080>(+1-473)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guadeloupe.png"), "<html> Guadeloupe <font color =#808080>(+590)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guam.png"), "<html> Guam <font color =#808080>(+1-671)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guatemala.png"), "<html> Guatemala <font color =#808080>(+502)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guernsey.png"), "<html> Guernsey <font color =#808080>(+44-1481)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guinea.png"), "<html> Guinea <font color =#808080>(+224)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guinea-Bissau.png"), "<html> Guinea-Bissau <font color =#808080>(+245)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guyana.png"), "<html> Guyana <font color =#808080>(+592)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Haiti.png"), "<html> Haiti <font color =#808080>(+509)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Honduras.png"), "<html> Honduras <font color =#808080>(+504)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Hong_Kong.png"), "<html> Hong Kong <font color =#808080>(+852)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Hungary.png"), "<html> Hungary <font color =#808080>(+36)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iceland.png"), "<html> Iceland <font color =#808080>(+354)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/India.png"), "<html> India <font color =#808080>(+91)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Indonesia.png"), "<html> Indonesia <font color =#808080>(+62)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iran.png"), "<html> Iran <font color =#808080>(+98)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iraq.png"), "<html> Iraq <font color =#808080>(+964)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ireland.png"), "<html> Ireland <font color =#808080>(+353)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Isle_of_Man.png"), "<html> Isle of Man <font color =#808080>(+44-1624)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Israel.png"), "<html> Israel <font color =#808080>(+972)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Italy.png"), "<html> Italy <font color =#808080>(+39)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ivory_Coast.png"), "<html> Ivory Coast <font color =#808080>(+225)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jamaica.png"), "<html> Jamaica <font color =#808080>(+1-876,)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Japan.png"), "<html> Japan <font color =#808080>(+81)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jersey.png"), "<html> Jersey <font color =#808080>(+44-1534)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jordan.png"), "<html> Jordan <font color =#808080>(+962)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kazakhstan.png"), "<html> Kazakhstan <font color =#808080>(+7)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kenya.png"), "<html> Kenya <font color =#808080>(+254)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kiribati.png"), "<html> Kiribati <font color =#808080>(+686)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kosovo.png"), "<html> Kosovo <font color =#808080>(+383)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kuwait.png"), "<html> Kuwait <font color =#808080>(+965)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kyrgyzstan.png"), "<html> Kyrgyzstan <font color =#808080>(+996)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Laos.png"), "<html> Laos <font color =#808080>(+856)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Latvia.png"), "<html> Latvia <font color =#808080>(+371)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lebanon.png"), "<html> Lebanon <font color =#808080>(+961)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lesotho.png"), "<html> Lesotho <font color =#808080>(+266)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Liberia.png"), "<html> Liberia <font color =#808080>(+231)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Libya.png"), "<html> Libya <font color =#808080>(+218)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Liechtenstein.png"), "<html> Liechtenstein <font color =#808080>(+423)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lithuania.png"), "<html> Lithuania <font color =#808080>(+370)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Luxembourg.png"), "<html> Luxembourg <font color =#808080>(+352)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Macau.png"), "<html> Macau <font color =#808080>(+853)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Macedonia.png"), "<html> Macedonia <font color =#808080>(+389)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Madagascar.png"), "<html> Madagascar <font color =#808080>(+261)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malawi.png"), "<html> Malawi <font color =#808080>(+265)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malaysia.png"), "<html> Malaysia <font color =#808080>(+60)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Maldives.png"), "<html> Maldives <font color =#808080>(+960)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mali.png"), "<html> Mali <font color =#808080>(+223)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malta.png"), "<html> Malta <font color =#808080>(+356)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Marshall_Islands.png"), "<html> Marshall Islands <font color =#808080>(+692)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Martinique.png"), "<html> Martinique <font color =#808080>(+596)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mauritania.png"), "<html> Mauritania <font color =#808080>(+222)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mauritius.png"), "<html> Mauritius <font color =#808080>(+230)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mayotte.png"), "<html> Mayotte <font color =#808080>(+262)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mexico.png"), "<html> Mexico <font color =#808080>(+52)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Micronesia.png"), "<html> Micronesia <font color =#808080>(+691)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Moldova.png"), "<html> Moldova <font color =#808080>(+373)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Monaco.png"), "<html> Monaco <font color =#808080>(+377)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mongolia.png"), "<html> Mongolia <font color =#808080>(+976)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Montenegro.png"), "<html> Montenegro <font color =#808080>(+382)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Montserrat.png"), "<html> Montserrat <font color =#808080>(+1-664)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Morocco.png"), "<html> Morocco <font color =#808080>(+212)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mozambique.png"), "<html> Mozambique <font color =#808080>(+258)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Myanmar.png"), "<html> Myanmar <font color =#808080>(+95)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Namibia.png"), "<html> Namibia <font color =#808080>(+264)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nauru.png"), "<html> Nauru <font color =#808080>(+674)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nepal.png"), "<html> Nepal <font color =#808080>(+977)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Netherlands.png"), "<html> Netherlands <font color =#808080>(+31)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Netherlands_Antilles.png"), "<html> Netherlands Antilles <font color =#808080>(+599)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/New_Caledonia.png"), "<html> New Caledonia <font color =#808080>(+687)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/New_Zealand.png"), "<html> New Zealand <font color =#808080>(+64)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nicaragua.png"), "<html> Nicaragua <font color =#808080>(+505)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Niger.png"), "<html> Niger <font color =#808080>(+227)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nigeria.png"), "<html> Nigeria <font color =#808080>(+234)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Niue.png"), "<html> Niue <font color =#808080>(+683)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Norfolk_Island.png"), "<html> Norfolk Island <font color =#808080>(+672)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/North_Korea.png"), "<html> North Korea <font color =#808080>(+850)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Northern_Ireland.png"), "<html> Northern Ireland <font color =#808080>(+44)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Northern_Mariana_Islands.png"), "<html> Northern Mariana Islands <font color =#808080>(+1-670)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Norway.png"), "<html> Norway <font color =#808080>(+47)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Oman.png"), "<html> Oman <font color =#808080>(+968)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Pakistan.png"), "<html> Pakistan <font color =#808080>(+92)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Palau.png"), "<html> Palau <font color =#808080>(+680)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Palestine.png"), "<html> Palestine <font color =#808080>(+970)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Panama.png"), "<html> Panama <font color =#808080>(+507)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Papua_New_Guinea.png"), "<html> Papua New Guinea <font color =#808080>(+675)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Paraguay.png"), "<html> Paraguay <font color =#808080>(+595)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Peru.png"), "<html> Peru <font color =#808080>(+51)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Philippines.png"), "<html> Philippines <font color =#808080>(+63)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Pitcairn.png"), "<html> Pitcairn <font color =#808080>(+64)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Poland.png"), "<html> Poland <font color =#808080>(+48)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Portugal.png"), "<html> Portugal <font color =#808080>(+351)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Puerto_Rico.png"), "<html> Puerto Rico <font color =#808080>(+1-787, 1-939)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Qatar.png"), "<html> Qatar <font color =#808080>(+974)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Republic_of_the_Congo.png"), "<html> Republic of the Congo <font color =#808080>(+242)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Reunion.png"), "<html> Reunion <font color =#808080>(+262)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Romania.png"), "<html> Romania <font color =#808080>(+40)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Russia.png"), "<html> Russia <font color =#808080>(+7)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Rwanda.png"), "<html> Rwanda <font color =#808080>(+250)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Barthelemy.png"), "<html> Saint Barthelemy <font color =#808080>(+590)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Helena.png"), "<html> Saint Helena <font color =#808080>(+290)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Kitts_and_Nevis.png"), "<html> Saint Kitts and Nevis <font color =#808080>(+1-869)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Lucia.png"), "<html> Saint Lucia <font color =#808080>(+1-758)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Martin.png"), "<html> Saint Martin <font color =#808080>(+590)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Pierre_and_Miquelon.png"), "<html> Saint Pierre and Miquelon <font color =#808080>(+508)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Vincent_and_the_Grenadines.png"), "<html> Saint Vincent and the Grenadines <font color =#808080>(+1-784)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Samoa.png"), "<html> Samoa <font color =#808080>(+685)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/San_Marino.png"), "<html> San Marino <font color =#808080>(+378)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sao_Tome_and_Principe.png"), "<html> Sao Tome and Principe <font color =#808080>(+239)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saudi_Arabia.png"), "<html> Saudi Arabia <font color =#808080>(+966)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Scotland.png"), "<html> Scotland <font color =#808080>(+44)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Senegal.png"), "<html> Senegal <font color =#808080>(+221)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Serbia.png"), "<html> Serbia <font color =#808080>(+381)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Seychelles.png"), "<html> Seychelles <font color =#808080>(+248)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sierra_Leone.png"), "<html> Sierra Leone <font color =#808080>(+232)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Singapore.png"), "<html> Singapore <font color =#808080>(+65)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sint_Maarten.png"), "<html> Sint Maarten <font color =#808080>(+1-721)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Slovakia.png"), "<html> Slovakia <font color =#808080>(+421)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Slovenia.png"), "<html> Slovenia <font color =#808080>(+386)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Solomon_Islands.png"), "<html> Solomon Islands <font color =#808080>(+677)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Somalia.png"), "<html> Somalia <font color =#808080>(+252)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Africa.png"), "<html> South Africa <font color =#808080>(+27)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Georgia.png"), "<html> South Georgia<font color =#808080>(+500)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Korea.png"), "<html> South Korea <font color =#808080>(+82)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Sudan.png"), "<html> South Sudan <font color =#808080>(+211)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Spain.png"), "<html> Spain <font color =#808080>(+34)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sri_Lanka.png"), "<html> Sri Lanka <font color =#808080>(+94)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sudan.png"), "<html> Sudan <font color =#808080>(+249)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Suriname.png"), "<html> Suriname <font color =#808080>(+597)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Svalbard_and_Jan_Mayen.png"), "<html> Svalbard and Jan Mayen <font color =#808080>(+47)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Swaziland.png"), "<html> Swaziland <font color =#808080>(+ 268)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sweden.png"), "<html> Sweden <font color =#808080>(+ 46)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Switzerland.png"), "<html> Switzerland <font color =#808080>(+ 41)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Syria.png"), "<html> Syria <font color =#808080>(+ 963)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Taiwan.png"), "<html> Taiwan <font color =#808080>(+ 886)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tajikistan.png"), "<html> Tajikistan <font color =#808080>(+ 992)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tanzania.png"), "<html> Tanzania <font color =#808080>(+ 255)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Thailand.png"), "<html> Thailand <font color =#808080>(+ 66)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Togo.png"), "<html> Togo <font color =#808080>(+ 228)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tokelau.png"), "<html> Tokelau <font color =#808080>(+ 690)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tonga.png"), "<html> Tonga <font color =#808080>(+ 676)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Trinidad_and_Tobago.png"), "<html> Trinidad and Tobago <font color =#808080>(+ 1-868)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tunisia.png"), "<html> Tunisia <font color =#808080>(+ 216)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turkey.png"), "<html> Turkey <font color =#808080>(+ 90)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turkmenistan.png"), "<html> Turkmenistan <font color =#808080>(+ 993)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turks_and_Caicos_Islands.png"), "<html> Turks and Caicos Islands <font color =#808080>(+ 1-649)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tuvalu.png"), "<html> Tuvalu <font color =#808080>(+ 688)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/U.S._Virgin_Islands.png"), "<html> U.S. Virgin Islands <font color =#808080>(+ 1-340)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uganda.png"), "<html> Uganda <font color =#808080>(+ 256)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ukraine.png"), "<html> Ukraine <font color =#808080>(+ 380)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_Arab_Emirates.png"), "<html> United Arab Emirates <font color =#808080>(+ 971)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_Kingdom.png"), "<html> United Kingdom <font color =#808080>(+ 44)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_States.png"), "<html> United States <font color =#808080>(+ 1)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_States_Minor_Outlying_Islands.png"), "<html> United States Minor Outlying Islands <font color =#808080>(+ 246)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uruguay.png"), "<html> Uruguay <font color =#808080>(+ 598)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uzbekistan.png"), "<html> Uzbekistan <font color =#808080>(+ 998)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vanuatu.png"), "<html> Vanuatu <font color =#808080>(+ 678)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vatican.png"), "<html> Vatican <font color =#808080>(+ 379)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Venezuela.png"), "<html> Venezuela <font color =#808080>(+ 58)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vietnam.png"), "<html> Vietnam <font color =#808080>(+ 84)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Wales.png"), "<html> Wales <font color =#808080>(+44)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Wallis_and_Futuna.png"), "<html> Wallis and Futuna <font color =#808080>(+ 681)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Western_Sahara.png"), "<html> Western Sahara <font color =#808080>(+ 212)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Yemen.png"), "<html> Yemen <font color =#808080>(+ 967)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Zambia.png"), "<html> Zambia <font color =#808080>(+ 260)</font></html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Zimbabwe.png"), "<html> Zimbabwe <font color =#808080>(+ 263)</font></html>" ));
	
			return dm;
		}



public DefaultComboBoxModel country()
		{
			DefaultComboBoxModel dm = new DefaultComboBoxModel();
dm.addElement(new ImagesNText( "    Select Your Country" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Afghanistan.png"), "<html> Afghanistan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Aland_Islands.png"), "<html> Aland Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Albania.png"), "<html> Albania </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Algeria.png"), "<html> Algeria </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/American_Samoa.png"), "<html> American Samoa </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Andorra.png"), "<html> Andorra </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Angola.png"), "<html> Angola </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Anguilla.png"), "<html> Anguilla </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Antarctica.png"), "<html> Antarctica </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Antigua_and_Barbuda.png"), "<html> Antigua and Barbuda </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Argentina.png"), "<html> Argentina </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Armenia.png"), "<html> Armenia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Aruba.png"), "<html> Aruba </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Australia.png"), "<html> Australia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Austria.png"), "<html> Austria </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Azerbaijan.png"), "<html> Azerbaijan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bahamas.png"), "<html> Bahamas </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bahrain.png"), "<html> Bahrain </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bangladesh.png"), "<html> Bangladesh </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Barbados.png"), "<html> Barbados </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belarus.png"), "<html> Belarus </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belgium.png"), "<html> Belgium </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Belize.png"), "<html> Belize </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Benin.png"), "<html> Benin </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bermuda.png"), "<html> Bermuda </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bhutan.png"), "<html> Bhutan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bolivia.png"), "<html> Bolivia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bonaire.png"), "<html> Bonaire </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bosnia_and_Herzegovina.png"), "<html> Bosnia and Herzegovina </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Botswana.png"), "<html> Botswana </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bouvet_Island.png"), "<html> Bouvet Island </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Brazil.png"), "<html> Brazil </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/British_Indian_Ocean_Territory.png"), "<html> British Indian Ocean Territory </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/British_Virgin_Islands.png"), "<html> British Virgin Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Brunei.png"), "<html> Brunei </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Bulgaria.png"), "<html> Bulgaria </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Burkina_Faso.png"), "<html> Burkina Faso </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Burundi.png"), "<html> Burundi </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cambodia.png"), "<html> Cambodia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cameroon.png"), "<html> Cameroon </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Canada.png"), "<html> Canada </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cape_Verde.png"), "<html> Cape Verde </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cayman_Islands.png"), "<html> Cayman Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Central_African_Republic.png"), "<html> Central African Republic </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Chad.png"), "<html> Chad </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Chile.png"), "<html> Chile </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/China.png"), "<html> China </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Christmas_Island.png"), "<html> Christmas Island </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cocos_Islands.png"), "<html> Cocos Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Colombia.png"), "<html> Colombia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Comoros.png"), "<html> Comoros </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cook_Islands.png"), "<html> Cook Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Costa_Rica.png"), "<html> Costa Rica </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Croatia.png"), "<html> Croatia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cuba.png"), "<html> Cuba </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Curacao.png"), "<html> Curacao </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Cyprus.png"), "<html> Cyprus </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Czech_Republic.png"), "<html> Czech Republic </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Democratic_Republic_of_the_Congo.png"), "<html> Democratic Republic of the Congo </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Denmark.png"), "<html> Denmark </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Djibouti.png"), "<html> Djibouti </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Dominica.png"), "<html> Dominica </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Dominican_Republic.png"), "<html> Dominican Republic </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/East_Timor.png"), "<html> East Timor </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ecuador.png"), "<html> Ecuador </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Egypt.png"), "<html> Egypt </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/El_Salvador.png"), "<html> El Salvador </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/England.png"), "<html> England </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Equatorial_Guinea.png"), "<html> Equatorial Guinea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Eritrea.png"), "<html> Eritrea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Estonia.png"), "<html> Estonia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ethiopia.png"), "<html> Ethiopia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Falkland_Islands.png"), "<html> Falkland Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Faroe_Islands.png"), "<html> Faroe Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Fiji.png"), "<html> Fiji </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Finland.png"), "<html> Finland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/France.png"), "<html> France </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Guiana.png"), "<html> French Guiana </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Polynesia.png"), "<html> French Polynesia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/French_Southern_Territories.png"), "<html> French Southern Territories </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gabon.png"), "<html> Gabon </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gambia.png"), "<html> Gambia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Georgia.png"), "<html> Georgia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Germany.png"), "<html> Germany </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ghana.png"), "<html> Ghana </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Gibraltar.png"), "<html> Gibraltar </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Greece.png"), "<html> Greece </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Greenland.png"), "<html> Greenland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Grenada.png"), "<html> Grenada </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guadeloupe.png"), "<html> Guadeloupe </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guam.png"), "<html> Guam </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guatemala.png"), "<html> Guatemala </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guernsey.png"), "<html> Guernsey </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guinea.png"), "<html> Guinea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guinea-Bissau.png"), "<html> Guinea-Bissau </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Guyana.png"), "<html> Guyana </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Haiti.png"), "<html> Haiti </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Honduras.png"), "<html> Honduras </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Hong_Kong.png"), "<html> Hong Kong </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Hungary.png"), "<html> Hungary </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iceland.png"), "<html> Iceland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/India.png"), "<html> India </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Indonesia.png"), "<html> Indonesia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iran.png"), "<html> Iran </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Iraq.png"), "<html> Iraq </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ireland.png"), "<html> Ireland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Isle_of_Man.png"), "<html> Isle of Man </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Israel.png"), "<html> Israel </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Italy.png"), "<html> Italy </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ivory_Coast.png"), "<html> Ivory Coast </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jamaica.png"), "<html> Jamaica </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Japan.png"), "<html> Japan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jersey.png"), "<html> Jersey </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Jordan.png"), "<html> Jordan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kazakhstan.png"), "<html> Kazakhstan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kenya.png"), "<html> Kenya </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kiribati.png"), "<html> Kiribati </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kosovo.png"), "<html> Kosovo </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kuwait.png"), "<html> Kuwait </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Kyrgyzstan.png"), "<html> Kyrgyzstan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Laos.png"), "<html> Laos </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Latvia.png"), "<html> Latvia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lebanon.png"), "<html> Lebanon </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lesotho.png"), "<html> Lesotho </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Liberia.png"), "<html> Liberia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Libya.png"), "<html> Libya </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Liechtenstein.png"), "<html> Liechtenstein </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Lithuania.png"), "<html> Lithuania </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Luxembourg.png"), "<html> Luxembourg </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Macau.png"), "<html> Macau </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Macedonia.png"), "<html> Macedonia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Madagascar.png"), "<html> Madagascar </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malawi.png"), "<html> Malawi </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malaysia.png"), "<html> Malaysia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Maldives.png"), "<html> Maldives </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mali.png"), "<html> Mali </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Malta.png"), "<html> Malta </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Marshall_Islands.png"), "<html> Marshall Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Martinique.png"), "<html> Martinique </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mauritania.png"), "<html> Mauritania </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mauritius.png"), "<html> Mauritius </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mayotte.png"), "<html> Mayotte </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mexico.png"), "<html> Mexico </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Micronesia.png"), "<html> Micronesia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Moldova.png"), "<html> Moldova </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Monaco.png"), "<html> Monaco </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mongolia.png"), "<html> Mongolia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Montenegro.png"), "<html> Montenegro </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Montserrat.png"), "<html> Montserrat </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Morocco.png"), "<html> Morocco </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Mozambique.png"), "<html> Mozambique </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Myanmar.png"), "<html> Myanmar </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Namibia.png"), "<html> Namibia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nauru.png"), "<html> Nauru </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nepal.png"), "<html> Nepal </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Netherlands.png"), "<html> Netherlands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Netherlands_Antilles.png"), "<html> Netherlands Antilles </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/New_Caledonia.png"), "<html> New Caledonia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/New_Zealand.png"), "<html> New Zealand </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nicaragua.png"), "<html> Nicaragua </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Niger.png"), "<html> Niger </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Nigeria.png"), "<html> Nigeria </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Niue.png"), "<html> Niue </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Norfolk_Island.png"), "<html> Norfolk Island </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/North_Korea.png"), "<html> North Korea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Northern_Ireland.png"), "<html> Northern Ireland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Northern_Mariana_Islands.png"), "<html> Northern Mariana Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Norway.png"), "<html> Norway </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Oman.png"), "<html> Oman </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Pakistan.png"), "<html> Pakistan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Palau.png"), "<html> Palau </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Palestine.png"), "<html> Palestine </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Panama.png"), "<html> Panama </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Papua_New_Guinea.png"), "<html> Papua New Guinea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Paraguay.png"), "<html> Paraguay </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Peru.png"), "<html> Peru </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Philippines.png"), "<html> Philippines </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Pitcairn.png"), "<html> Pitcairn </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Poland.png"), "<html> Poland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Portugal.png"), "<html> Portugal </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Puerto_Rico.png"), "<html> Puerto Rico </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Qatar.png"), "<html> Qatar </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Republic_of_the_Congo.png"), "<html> Republic of the Congo </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Reunion.png"), "<html> Reunion </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Romania.png"), "<html> Romania </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Russia.png"), "<html> Russia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Rwanda.png"), "<html> Rwanda </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Barthelemy.png"), "<html> Saint Barthelemy </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Helena.png"), "<html> Saint Helena </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Kitts_and_Nevis.png"), "<html> Saint Kitts and Nevis </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Lucia.png"), "<html> Saint Lucia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Martin.png"), "<html> Saint Martin </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Pierre_and_Miquelon.png"), "<html> Saint Pierre and Miquelon </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saint_Vincent_and_the_Grenadines.png"), "<html> Saint Vincent and the Grenadines </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Samoa.png"), "<html> Samoa </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/San_Marino.png"), "<html> San Marino </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sao_Tome_and_Principe.png"), "<html> Sao Tome and Principe </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Saudi_Arabia.png"), "<html> Saudi Arabia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Scotland.png"), "<html> Scotland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Senegal.png"), "<html> Senegal </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Serbia.png"), "<html> Serbia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Seychelles.png"), "<html> Seychelles </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sierra_Leone.png"), "<html> Sierra Leone </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Singapore.png"), "<html> Singapore </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sint_Maarten.png"), "<html> Sint Maarten </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Slovakia.png"), "<html> Slovakia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Slovenia.png"), "<html> Slovenia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Solomon_Islands.png"), "<html> Solomon Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Somalia.png"), "<html> Somalia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Africa.png"), "<html> South Africa </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Georgia.png"), "<html> South Georgia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Korea.png"), "<html> South Korea </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/South_Sudan.png"), "<html> South Sudan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Spain.png"), "<html> Spain </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sri_Lanka.png"), "<html> Sri Lanka </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sudan.png"), "<html> Sudan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Suriname.png"), "<html> Suriname </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Svalbard_and_Jan_Mayen.png"), "<html> Svalbard and Jan Mayen </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Swaziland.png"), "<html> Swaziland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Sweden.png"), "<html> Sweden </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Switzerland.png"), "<html> Switzerland </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Syria.png"), "<html> Syria </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Taiwan.png"), "<html> Taiwan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tajikistan.png"), "<html> Tajikistan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tanzania.png"), "<html> Tanzania </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Thailand.png"), "<html> Thailand </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Togo.png"), "<html> Togo </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tokelau.png"), "<html> Tokelau </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tonga.png"), "<html> Tonga </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Trinidad_and_Tobago.png"), "<html> Trinidad and Tobago </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tunisia.png"), "<html> Tunisia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turkey.png"), "<html> Turkey </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turkmenistan.png"), "<html> Turkmenistan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Turks_and_Caicos_Islands.png"), "<html> Turks and Caicos Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Tuvalu.png"), "<html> Tuvalu </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/U.S._Virgin_Islands.png"), "<html> U.S. Virgin Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uganda.png"), "<html> Uganda </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Ukraine.png"), "<html> Ukraine </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_Arab_Emirates.png"), "<html> United Arab Emirates </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_Kingdom.png"), "<html> United Kingdom </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_States.png"), "<html> United States </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/United_States_Minor_Outlying_Islands.png"), "<html> United States Minor Outlying Islands </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uruguay.png"), "<html> Uruguay </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Uzbekistan.png"), "<html> Uzbekistan </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vanuatu.png"), "<html> Vanuatu </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vatican.png"), "<html> Vatican </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Venezuela.png"), "<html> Venezuela </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Vietnam.png"), "<html> Vietnam </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Wales.png"), "<html> Wales </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Wallis_and_Futuna.png"), "<html> Wallis and Futuna </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Western_Sahara.png"), "<html> Western Sahara </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Yemen.png"), "<html> Yemen </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Zambia.png"), "<html> Zambia </html>" ));
 dm.addElement(new ImagesNText( new ImageIcon("Resources/Images/Country/Zimbabwe.png"), "<html> Zimbabwe </html>" ));
	
			return dm;
		}

public DefaultComboBoxModel bdate()
{
	DefaultComboBoxModel dm = new DefaultComboBoxModel();
dm.addElement(new ImagesNText( " Day" ));
	dm.addElement(new ImagesNText( "    1" ));
	dm.addElement(new ImagesNText( "    2" ));
	dm.addElement(new ImagesNText( "    3" ));
	dm.addElement(new ImagesNText( "    4" ));
	dm.addElement(new ImagesNText( "    5" ));
	dm.addElement(new ImagesNText( "    6" ));
	dm.addElement(new ImagesNText( "    7" ));
	dm.addElement(new ImagesNText( "    8" ));
	dm.addElement(new ImagesNText( "    9" ));
	dm.addElement(new ImagesNText( "   10" ));
	dm.addElement(new ImagesNText( "   11" ));
	dm.addElement(new ImagesNText( "   12" ));
	dm.addElement(new ImagesNText( "   13" ));
	dm.addElement(new ImagesNText( "   14" ));
	dm.addElement(new ImagesNText( "   15" ));
	dm.addElement(new ImagesNText( "   16" ));
	dm.addElement(new ImagesNText( "   17" ));
	dm.addElement(new ImagesNText( "   18" ));
	dm.addElement(new ImagesNText( "   19" ));
	dm.addElement(new ImagesNText( "   20" ));
	dm.addElement(new ImagesNText( "   21" ));
	dm.addElement(new ImagesNText( "   22" ));
	dm.addElement(new ImagesNText( "   23" ));
	dm.addElement(new ImagesNText( "   24" ));
	dm.addElement(new ImagesNText( "   25" ));
	dm.addElement(new ImagesNText( "   26" ));
	dm.addElement(new ImagesNText( "   27" ));
	dm.addElement(new ImagesNText( "   28" ));
	dm.addElement(new ImagesNText( "   29" ));
	dm.addElement(new ImagesNText( "   30" ));
	dm.addElement(new ImagesNText( "   31" ));


	return dm;

}
public DefaultComboBoxModel bmonth()
{
	DefaultComboBoxModel dm = new DefaultComboBoxModel();
	dm.addElement(new ImagesNText( "   Month" ));
	dm.addElement(new ImagesNText( "   January " ));
	dm.addElement(new ImagesNText( "   February " ));
	dm.addElement(new ImagesNText( "   March " ));
	dm.addElement(new ImagesNText( "   April " ));
	dm.addElement(new ImagesNText( "   May " ));
	dm.addElement(new ImagesNText( "   June " ));
	dm.addElement(new ImagesNText( "   July " ));
	dm.addElement(new ImagesNText( "   August " ));
	dm.addElement(new ImagesNText( "   September " ));
	dm.addElement(new ImagesNText( "   October " ));
	dm.addElement(new ImagesNText( "   November " ));
	dm.addElement(new ImagesNText( "   December " ));


	return dm;

}
public DefaultComboBoxModel byear()
{
	
	DefaultComboBoxModel dm = new DefaultComboBoxModel();
	dm.addElement(new ImagesNText( "   Year" ));
dm.addElement(new ImagesNText( "    2022" ));
dm.addElement(new ImagesNText( "    2021" ));
dm.addElement(new ImagesNText( "    2020" ));
dm.addElement(new ImagesNText( "    2019" ));
dm.addElement(new ImagesNText( "    2018" ));
dm.addElement(new ImagesNText( "    2017" ));
dm.addElement(new ImagesNText( "    2016" ));
dm.addElement(new ImagesNText( "    2015" ));
dm.addElement(new ImagesNText( "    2014" ));
dm.addElement(new ImagesNText( "    2013" ));
dm.addElement(new ImagesNText( "    2012" ));
dm.addElement(new ImagesNText( "    2011" ));
dm.addElement(new ImagesNText( "    2010" ));
dm.addElement(new ImagesNText( "    2009" ));
dm.addElement(new ImagesNText( "    2008" ));
dm.addElement(new ImagesNText( "    2007" ));
dm.addElement(new ImagesNText( "    2006" ));
dm.addElement(new ImagesNText( "    2005" ));
dm.addElement(new ImagesNText( "    2004" ));
dm.addElement(new ImagesNText( "    2003" ));
dm.addElement(new ImagesNText( "    2002" ));
dm.addElement(new ImagesNText( "    2001" ));
dm.addElement(new ImagesNText( "    2000" ));
dm.addElement(new ImagesNText( "    1999" ));
dm.addElement(new ImagesNText( "    1998" ));
dm.addElement(new ImagesNText( "    1997" ));
dm.addElement(new ImagesNText( "    1996" ));
dm.addElement(new ImagesNText( "    1995" ));
dm.addElement(new ImagesNText( "    1994" ));
dm.addElement(new ImagesNText( "    1993" ));
dm.addElement(new ImagesNText( "    1992" ));
dm.addElement(new ImagesNText( "    1991" ));
dm.addElement(new ImagesNText( "    1990" ));
dm.addElement(new ImagesNText( "    1989" ));
dm.addElement(new ImagesNText( "    1988" ));
dm.addElement(new ImagesNText( "    1987" ));
dm.addElement(new ImagesNText( "    1986" ));
dm.addElement(new ImagesNText( "    1985" ));
dm.addElement(new ImagesNText( "    1984" ));
dm.addElement(new ImagesNText( "    1983" ));
dm.addElement(new ImagesNText( "    1982" ));
dm.addElement(new ImagesNText( "    1981" ));
dm.addElement(new ImagesNText( "    1980" ));
dm.addElement(new ImagesNText( "    1979" ));
dm.addElement(new ImagesNText( "    1978" ));
dm.addElement(new ImagesNText( "    1977" ));
dm.addElement(new ImagesNText( "    1976" ));
dm.addElement(new ImagesNText( "    1975" ));
dm.addElement(new ImagesNText( "    1974" ));
dm.addElement(new ImagesNText( "    1973" ));
dm.addElement(new ImagesNText( "    1972" ));
dm.addElement(new ImagesNText( "    1971" ));
dm.addElement(new ImagesNText( "    1970" ));
dm.addElement(new ImagesNText( "    1969" ));
dm.addElement(new ImagesNText( "    1968" ));
dm.addElement(new ImagesNText( "    1967" ));
dm.addElement(new ImagesNText( "    1966" ));
dm.addElement(new ImagesNText( "    1965" ));
dm.addElement(new ImagesNText( "    1964" ));
dm.addElement(new ImagesNText( "    1963" ));
dm.addElement(new ImagesNText( "    1962" ));
dm.addElement(new ImagesNText( "    1961" ));
dm.addElement(new ImagesNText( "    1960" ));
dm.addElement(new ImagesNText( "    1959" ));
dm.addElement(new ImagesNText( "    1958" ));
dm.addElement(new ImagesNText( "    1957" ));
dm.addElement(new ImagesNText( "    1956" ));
dm.addElement(new ImagesNText( "    1955" ));
dm.addElement(new ImagesNText( "    1954" ));
dm.addElement(new ImagesNText( "    1953" ));
dm.addElement(new ImagesNText( "    1952" ));
dm.addElement(new ImagesNText( "    1951" ));
dm.addElement(new ImagesNText( "    1950" ));
dm.addElement(new ImagesNText( "    1949" ));
dm.addElement(new ImagesNText( "    1948" ));
dm.addElement(new ImagesNText( "    1947" ));
dm.addElement(new ImagesNText( "    1946" ));
dm.addElement(new ImagesNText( "    1945" ));
dm.addElement(new ImagesNText( "    1944" ));
dm.addElement(new ImagesNText( "    1943" ));
dm.addElement(new ImagesNText( "    1942" ));
dm.addElement(new ImagesNText( "    1941" ));
dm.addElement(new ImagesNText( "    1940" ));
dm.addElement(new ImagesNText( "    1939" ));
dm.addElement(new ImagesNText( "    1938" ));
dm.addElement(new ImagesNText( "    1937" ));
dm.addElement(new ImagesNText( "    1936" ));
dm.addElement(new ImagesNText( "    1935" ));
dm.addElement(new ImagesNText( "    1934" ));
dm.addElement(new ImagesNText( "    1933" ));
dm.addElement(new ImagesNText( "    1932" ));
dm.addElement(new ImagesNText( "    1931" ));
dm.addElement(new ImagesNText( "    1930" ));
dm.addElement(new ImagesNText( "    1929" ));
dm.addElement(new ImagesNText( "    1928" ));
dm.addElement(new ImagesNText( "    1927" ));
dm.addElement(new ImagesNText( "    1926" ));
dm.addElement(new ImagesNText( "    1925" ));
dm.addElement(new ImagesNText( "    1924" ));
dm.addElement(new ImagesNText( "    1923" ));
dm.addElement(new ImagesNText( "    1922" ));
dm.addElement(new ImagesNText( "    1921" ));
dm.addElement(new ImagesNText( "    1920" ));
dm.addElement(new ImagesNText( "    1919" ));
dm.addElement(new ImagesNText( "    1918" ));
dm.addElement(new ImagesNText( "    1917" ));
dm.addElement(new ImagesNText( "    1916" ));
dm.addElement(new ImagesNText( "    1915" ));
dm.addElement(new ImagesNText( "    1914" ));
dm.addElement(new ImagesNText( "    1913" ));
dm.addElement(new ImagesNText( "    1912" ));
dm.addElement(new ImagesNText( "    1911" ));
dm.addElement(new ImagesNText( "    1910" ));
dm.addElement(new ImagesNText( "    1909" ));
dm.addElement(new ImagesNText( "    1908" ));
dm.addElement(new ImagesNText( "    1907" ));
dm.addElement(new ImagesNText( "    1906" ));
dm.addElement(new ImagesNText( "    1905" ));
dm.addElement(new ImagesNText( "    1904" ));
dm.addElement(new ImagesNText( "    1903" ));
dm.addElement(new ImagesNText( "    1902" ));
dm.addElement(new ImagesNText( "    1901" ));
dm.addElement(new ImagesNText( "    1900" ));

	
	return dm;
	
}



}
		

class ImagesTextRenderer extends JLabel implements ListCellRenderer{
	
	public Component getListCellRendererComponent(JList list, Object val,
	int index, boolean selected, boolean focused)
	{
		ImagesNText it=(ImagesNText)val;
		setIcon(it.getImg());
		setText(it.getName());
		
		if(selected)
		{
			setBackground(list.getSelectionBackground());
			setForeground(list.getSelectionForeground());
		}
		else
		{
			setBackground(list.getBackground());
			setForeground(list.getForeground());

		}
		setFont(list.getFont());
		
		
		return this;
	}
	

 

}

class ImagesNText
{
	private Icon img;
	private String name;
	
	public ImagesNText(Icon img, String name)
	{
		this.img=img;
		this.name=name;
	}
	public ImagesNText( String name)
	{
		this.img=img;
		this.name=name;
	}
	
	public Icon getImg()
	{
		return img;
	}
	public void setImg(Icon img)
	{
		this.img = img;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}
