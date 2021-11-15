package twitter;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class twitterUser {
    private String email;
    private String country;
    private Date lastDate;

    public twitterUser() {
    }
}