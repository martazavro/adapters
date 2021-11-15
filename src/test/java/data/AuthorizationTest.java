package data;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorizationTest {

    Авторизація prev_auth;
    Authorization auth;
    DataBase db;

    @BeforeEach
    void setUp() {
        prev_auth = new Авторизація();
        auth = new Authorization();
        db = new DataBase();
    }

    @Test
    void authorise() {
        assertEquals(auth.authorize(db), prev_auth.авторизуватися(db));
    }
}