package facebook;
import adapter.*;

import lombok.AllArgsConstructor;
import java.util.Date;

@AllArgsConstructor
public class MyFacebookUser implements User {
    private facebookUser user;

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