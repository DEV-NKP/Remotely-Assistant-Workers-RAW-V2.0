package raw.email;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;  


	public class mailerhtml{  
	public  void sendhtml(String fromh,String passwordh,String toh,String subh,String msgh1,String msgh2){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session3 = Session.getInstance(props,    
           new javax.mail.Authenticator() {    
           @Override
		   protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(fromh,passwordh);  
           }    
          });    
          
        //compose message for html
          try 
          {
             // MimeMessage object.
             MimeMessage message = new MimeMessage(session3);
      
             // Set From Field: adding senders email to from field.
             message.setFrom(new InternetAddress(fromh));
      
             // Set To Field: adding recipient's email to from field.
             message.addRecipient(Message.RecipientType.TO, new InternetAddress(toh));
      
             // Set Subject: subject of the email
             message.setSubject(subh);
      
             // set body of the email.
             message.setContent(msgh1,msgh2);
      
             // Send email.
             Transport.send(message);
             System.out.println("Mail successfully sent");
          }
          catch (MessagingException mex) 
          {
             mex.printStackTrace();
          }
    
    } 
	
}  