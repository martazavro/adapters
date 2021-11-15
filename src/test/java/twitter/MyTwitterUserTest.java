package twitter;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    twitterUser simpleTwitterUser;
    MyTwitterUser adapted;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        simpleTwitterUser = new twitterUser("martasmile58@gmail.com", "France", new Date());
        adapted = new MyTwitterUser(simpleTwitterUser);
    }

    @org.junit.jupiter.api.Test
    void getUserEmail() {
        assertEquals(adapted.getEmail(), simpleTwitterUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getUserCountry() {
        assertEquals(adapted.getCountry(), simpleTwitterUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActivity() {
        assertEquals(adapted.getLastDate(),  simpleTwitterUser.getLastDate());
    }
}