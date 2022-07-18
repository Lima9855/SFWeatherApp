package sflima.weatherapp.api;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

public class Request {
    public Request() {}
    private final CloseableHttpClient httpClient = HttpClients.createDefault();
    public static Request getRequest(){
        return new Request();
    }


    public String sendGet(String URL,String apiKey) throws Exception {
        HttpGet request = new HttpGet(URL);
        request.addHeader("X-API-Key", apiKey);
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
            return result;
        }

    }


    public String sendGet(String URL) throws Exception {
        HttpGet request = new HttpGet(URL);
        try (CloseableHttpResponse response = httpClient.execute(request)) {
            HttpEntity entity = response.getEntity();
            String result = EntityUtils.toString(entity);
            return result;
        }
    }
}
