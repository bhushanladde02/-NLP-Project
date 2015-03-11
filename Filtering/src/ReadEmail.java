
import javax.mail.*;

import java.io.*;



class ReadEmail {
	private Session sessioned = null;
	private Store store = null;
	private Folder folder = null;
	private Message message = null;
	private Message[] messages = null;
	private Object messagecontentObject = null;
	private String sender = null;
	private String subject = null;
	private Multipart multipart = null;
	private Part part = null;
	private String contentType = null;
        int count=0;

	ReadEmail() {
		//Default Constructor
	}

	String processEmail() throws Exception
        {
            String message1="";
              String myhost= "pop.bsnl.co.in";
        String username= "akladde@bsnl.in";
        String pwd= "password";
		sessioned = Session.getDefaultInstance(System.getProperties(),null);
		store = sessioned.getStore("imap");
		store.connect(myhost, username,pwd);

		// Get a handle on the default folder
		folder = store.getDefaultFolder();

		// Retrieve the "Inbox"
		folder = folder.getFolder("inbox");

		//Reading the Email Index in Read / Write Mode
		folder.open(Folder.READ_WRITE);

		// Retrieve the messages
		messages = folder.getMessages();

		if (messages.length == 0) {
			System.out.println("No Message to Read");
		} else {
			System.out.println("Total Messages Found:" + messages.length + "");
		}
                ///to read a coding through
                   /*for (int messageNumber = 0; messageNumber < messages.length; messageNumber++)
                   {
                   message = messages[messageNumber];

			Flags flags = message.getFlags();
                        message.setFlag(Flags.Flag.ANSWERED, true);
                        System.out.println("read email");
                   }*/

		// Loop over all of the messages

		for (int messageNumber = 0; messageNumber < messages.length; messageNumber++)
                {

			// Retrieve the next message to be read
			message = messages[messageNumber];

			Flags Flag = message.getFlags();
			if (!message.isSet(Flags.Flag.SEEN) || !message.isSet(Flags.Flag.ANSWERED))
                        {
				//System.out.println("unread email found");
                            count++;
                             System.out.println(messageNumber+":->"+messages[messageNumber].getFrom()[0]+"\t->"+messages[messageNumber].getSubject());

                             System.out.println(messages[messageNumber].getContent());
                             
                             
                             message1=(String) messages[messageNumber].getContent();
                             
                             message = messages[messageNumber];

                             message.setFlag(Flags.Flag.SEEN , true);
                             message.setFlag(Flags.Flag.ANSWERED , true);
                             break;
			}
		}
                return message1;
	}

	public static void main() throws Exception {
		ReadEmail re = new ReadEmail();
		re.processEmail();
               // System.out.println("The messege is "+message1);
	}
}
