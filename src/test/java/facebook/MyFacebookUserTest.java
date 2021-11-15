package facebook;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.*;

class MyFacebookUserTest {
    facebookUser simpleFacebookUser;
    MyFacebookUser adapted;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        simpleFacebookUser = new facebookUser("martasmile58@gmail.com", "France", new Date());
        adapted = new MyFacebookUser(simpleFacebookUser);
    }

    @org.junit.jupiter.api.Test
    void getUserEmail() {
        assertEquals(adapted.getEmail(), simpleFacebookUser.getEmail());
    }

    @org.junit.jupiter.api.Test
    void getUserCountry() {
        assertEquals(adapted.getCountry(), simpleFacebookUser.getCountry());
    }

    @org.junit.jupiter.api.Test
    void getLastActivity() {
        assertEquals(adapted.getLastDate(),  simpleFacebookUser.getLastDate());
    }
}