package day04;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class NetworkingConcept {
//    private static HttpURLConnection connection;
    private static FileWriter fileWriter;
    public static void main(String[] args){
        //METHOD 1 -- Java.net.HttpURLConnection
        /*BufferedReader reader;
        String line;
        StringBuffer response = new StringBuffer();
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/albums");
            connection = (HttpURLConnection) url.openConnection();

            //Request
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status =  connection.getResponseCode();
//            System.out.println(status);
            if(status >299){
                reader = new BufferedReader(new InputStreamReader(connection.getErrorStream()));
                while ((line = reader.readLine()) != null){
                    response.append(line);
                }
                reader.close();
            }else {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                while ((line = reader.readLine()) != null){
                    response.append(line);
                }
            }
            System.out.println(response);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            connection.disconnect();
        }*/
        //Method 2(added in java 11) -- java.net.http.HttpClient;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/albums")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(NetworkingConcept::parse)
                .join();

    }
    public static String parse(String responseBody){
        JSONArray albums = new JSONArray(responseBody);
        /*for (int i=0; i<albums.length();i++){
            JSONObject album = albums.getJSONObject(i);
            int ID = album.getInt("id");
            int UserID = album.getInt("userId");
            String Title = album.getString("title");
            System.out.println("ID: " +ID +" UserID: " +UserID+" Title: "+Title);
        }*/
        try {
            fileWriter = new FileWriter("C:\\Users\\yokes\\IdeaProjects\\bootcamp-java\\src\\main\\java\\day04\\response.json");
            fileWriter.write(responseBody);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
