package twitter;
import adapter.*;

import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
public class MyTwitterUser implements User {
    private twitterUser user;

    @Override
    public String getEmail() {
        return user.getEmail();
    }

    @Override
    public Date getLastDate() {
        return user.getLastDate();
    }

    @Override
    public String getCountry() {
        return user.getCountry();
    }
}