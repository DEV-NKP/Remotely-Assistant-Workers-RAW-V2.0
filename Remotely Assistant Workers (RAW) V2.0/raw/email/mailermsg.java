
package raw.email;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;   



public class mailermsg{  

    public  void sendmsg(String fromt,String passwordt,String tot,String subt,String msgt){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session1 = Session.getInstance(props,    
           new javax.mail.Authenticator() {   
           @Override		   
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(fromt,passwordt);  
           }    
          });    
          
          
          //compose message for text   
          try {    
           MimeMessage message = new MimeMessage(session1);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(tot));    
           message.setSubject(subt);    
           message.setText(msgt);    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
		   
          } catch (MessagingException e) {throw new RuntimeException(e);}    
          
      
    
    }  
	
}