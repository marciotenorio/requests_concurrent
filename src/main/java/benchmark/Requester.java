package benchmark;

import com.google.gson.Gson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

public class Requester implements Runnable{

    @Override
    public void run(){
        RestTemplate restTemplate = new RestTemplate();
        String url = "https://api.myip.com";
        ResponseEntity<String> response;
        Gson gson = new Gson();
        Client clientInfo = new Client();

        try{
            response = restTemplate.getForEntity(url, String.class);
            clientInfo = gson.fromJson(response.getBody(), Client.class);

            System.out.println("Your IP is " + clientInfo.getIp() + "/" + clientInfo.getCc());
        }
        catch (RestClientException e){
            System.out.println("Service unavailable.");
        }

    }
}
