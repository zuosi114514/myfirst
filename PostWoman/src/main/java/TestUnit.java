import io.IoMan;
import okhttp3.Response;

import java.io.IOException;
import java.time.LocalDateTime;

public class TestUnit {
    String name;
    String url;


    public TestUnit(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String test01() throws IOException {

        int count = new IoMan().fund();

        LocalDateTime now = LocalDateTime.now();
        String name = this.name + now.getMonth() + "_" + now.getDayOfMonth() + "_" + count;
        long id = System.currentTimeMillis() + name.hashCode();
        String stjId = String.valueOf(id);
        String remark = String.format("%d月第%d次测试提交", now.getMonth().getValue(), count);
        String json = String.format("{\n" +
                "  \"id\": %d,\n" +
                "  \"studentJobId\": %s,\n" +
                "  \"username\": \"%s\",\n" +
                "  \"remark\": \"%s\",\n" +
                "  \"resourceType\": 3030,\n" +
                "  \"businessType\": \"GPU_APPLY\",\n" +
                "  \"applyDays\": 14\n" +
                "  \"expectDate\": \"2022-11-23T18:25:43.511Z\"" +
                "\n" +
                "}", id, stjId, name, remark);
        Response response = Main.connector.postRequest(url, json);
        System.out.println(json);
        return response.body().string();
    }


}
