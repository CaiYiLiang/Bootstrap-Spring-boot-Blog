package demo.controllers;

import demo.models.Message;
import demo.models.MessageDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * A class to test interactions with the MySQL database using the UserDao class.
 *
 * @author cherry
 */
@Controller
public class MessageController {
	
  @Autowired
  private MessageDao messageDao;

  /**
   * /create  --> Create a new user and save it in the database.
   * 
   * @param email User's email
   * @param name User's name
   * @return A string describing if the user is succesfully created or not.
   */
  @RequestMapping("/send-message")
  @ResponseBody
  public void create(String name,String email, String comments){
	  System.out.println("userName:"+name);
	  System.out.println("userEmail:"+email);
	  System.out.println("messageContent:"+comments);
	
	Message message =null;    
    try {
      System.out.println("message saving");
      message = new Message(email,name,comments);
      messageDao.save(message);
    }
    catch (Exception ex) {
       System.out.println("Exception:"+ex.getMessage());
    }
    System.out.println(message.getMessageDate());
    System.out.println("Successdully created");
  }
  
  


  
} // class MessageController
