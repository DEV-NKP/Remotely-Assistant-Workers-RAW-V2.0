
package raw.email;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;    
import javax.mail.internet.*;   


public class mailerfile{  
	    public  void sendfile(String fromf,String passwordf,String tof,String subf,String bodyf,String filef){  
          //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session2 = Session.getInstance(props,    
           new javax.mail.Authenticator() {    
          @Override
		  protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication(fromf,passwordf);  
           }    
          });    
          //compose message for file   
         try 
          {
              // MimeMessage object.
              MimeMessage message = new MimeMessage(session2);
        
              // Set From Field: adding senders email to from field.
              message.setFrom(new InternetAddress(fromf));
        
              // Set To Field: adding recipient's email to from field.
              message.addRecipient(Message.RecipientType.TO, new InternetAddress(tof));
        
              // Set Subject: subject of the email
              message.setSubject(subf);
                
              // creating first MimeBodyPart object
              BodyPart messageBodyPart1 = new MimeBodyPart(); 
              messageBodyPart1.setText(bodyf);
                
              // creating second MimeBodyPart object
              BodyPart messageBodyPart2 = new MimeBodyPart(); 
              String filename = filef;
              DataSource source = new FileDataSource(filename);  
              messageBodyPart2.setDataHandler(new DataHandler(source));  
              messageBodyPart2.setFileName(filename);  
                
              // creating MultiPart object
              Multipart multipartObject = new MimeMultipart();  
              multipartObject.addBodyPart(messageBodyPart1);  
              multipartObject.addBodyPart(messageBodyPart2);
        
        
        
              // set body of the email.
              message.setContent(multipartObject);
        
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