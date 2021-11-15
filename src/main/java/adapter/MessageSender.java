
package adapter;

public class MessageSender {
    public boolean send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            System.out.println("Message: "+ text);
            return true;
        }
        else {
            return false;
        }
    }

}