import connect.Connector;

import java.io.IOException;
import java.time.LocalDateTime;

public class Main {
    public static Connector connector = new Connector();
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            System.out.println(new TestUnit("", "http://localhost:8081/api/ptr/user/apply").test01());
        }
    }


}

