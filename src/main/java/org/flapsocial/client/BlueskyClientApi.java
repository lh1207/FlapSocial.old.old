package org.flapsocial.client;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.json.simple.JSONObject;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class BlueskyClientApi {

    private static final String BASE_URL = "https://api.blueskyapi.io";

    private CloseableHttpClient httpClient;

    public BlueskyClientApi() {
        httpClient = HttpClients.createDefault();
    }

    public void findTimeline(int limit) {
        String endpoint = "/feeds/findTimeline";
        JSONObject requestData = new JSONObject();
        requestData.put("limit", limit);

        try {
            String response = sendPostRequest(endpoint, requestData);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createPost(String text) {
        String endpoint = "/feeds/createPost";
        JSONObject requestData = new JSONObject();
        requestData.put("text", text);

        try {
            String response = sendPostRequest(endpoint, requestData);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteRecord(String uri) {
        String endpoint = "/repositories/deleteRecord";
        JSONObject requestData = new JSONObject();
        requestData.put("uri", uri);

        try {
            String response = sendDeleteRequest(endpoint, requestData);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to send POST requests
    private String sendPostRequest(String endpoint, JSONObject requestData) throws Exception {
        HttpPost httpPost = new HttpPost(BASE_URL + endpoint);
        httpPost.setHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity(requestData.toJSONString()));

        return executeRequest(httpPost);
    }

    // Helper method to send DELETE requests
    private String sendDeleteRequest(String endpoint, JSONObject requestData) throws Exception {
        HttpDelete httpDelete = new HttpDelete(BASE_URL + endpoint);
        httpDelete.setHeader("Content-Type", "application/json");
        httpDelete.setHeader((Header) new StringEntity(requestData.toJSONString()));

        return executeRequest(httpDelete);
    }

    // Helper method to execute HTTP requests and parse response
    private String executeRequest(HttpUriRequest request) throws Exception {
        HttpResponse response = httpClient.execute(request);
        HttpEntity entity = response.getEntity();

        if (entity != null) {
            try (InputStream inputStream = entity.getContent()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                return reader.lines().collect(Collectors.joining(System.lineSeparator()));
            }
        }

        return null;
    }

    public static void main(String[] args) {
        BlueskyClientApi blueskyClientApi = new BlueskyClientApi();
        int limit = 10;
        blueskyClientApi.findTimeline(limit);

        String postText = "Hello, Bluesky!";
        blueskyClientApi.createPost(postText);

        // Replace 'uriValue' with the actual URI to be deleted
        String uriValue = "example_uri";
        blueskyClientApi.deleteRecord(uriValue);
    }
}
