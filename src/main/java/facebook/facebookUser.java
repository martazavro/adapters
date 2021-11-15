package facebook;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;

@Getter @AllArgsConstructor
public class facebookUser {
    private String email;
    private String country;
    private Date lastDate;

    public facebookUser() {
    }
}