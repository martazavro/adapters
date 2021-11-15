package data;
import data.Авторизація;

public class Authorization extends Авторизація {
    public boolean authorize (DataBase db) {
        return авторизуватися(db);
    }
}