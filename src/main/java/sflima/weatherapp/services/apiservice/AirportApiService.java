package sflima.weatherapp.services.apiservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import sflima.weatherapp.model.airport.Airport;
import sflima.weatherapp.model.airport.Datum;


// zostawić to tuaj czy do pakietu z serwisami? Dopytać się



@Service
public class AirportApiService {

    @Autowired
     private RestTemplate restTemplate;

    public Datum getData(String url){

        final HttpHeaders headers = new HttpHeaders();
        headers.set("X-API-Key","5b2a69d934bd4103968a69a4ee");

        final HttpEntity<String> entity = new HttpEntity<String>(headers);

        ResponseEntity<Datum> response = restTemplate.exchange(url, HttpMethod.GET,entity,Datum.class);

        return response.getBody();
    }

    //Webclient based call
    private final WebClient webClient;

    public AirportApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.checkwx.com/").build();
    }

    public Airport getDatum(String uri){
        return webClient.get()
                .uri(uri)
                .header("X-API-Key","5b2a69d934bd4103968a69a4ee")
                .retrieve()
                .bodyToMono(Airport.class).block();
    }
    public void test(String uri){


        Datum d1 = webClient.get()
                .uri(uri)
                .header("X-API-Key","5b2a69d934bd4103968a69a4ee")
                .retrieve()
                .bodyToMono(Datum.class).block();

        System.out.println(d1);
    }
}
