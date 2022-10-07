package connect;

import lombok.Data;

@Data
public class Connector extends ApiConnector{

    String apiKey = "";
    String BaseUrl = "";
    String ApiKeyName = "";

    @Override
    protected String connectionName() {
        return "Portainer";
    }
}
