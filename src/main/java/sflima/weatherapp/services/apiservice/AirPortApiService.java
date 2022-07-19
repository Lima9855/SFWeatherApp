package sflima.weatherapp.services.apiservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import sflima.weatherapp.model.airport.AirPort;
import sflima.weatherapp.model.airport.Datum;


// zostawić to tuaj czy do pakietu z serwisami? Dopytać się



@Service
public class AirPortApiService {

    private final WebClient webClient;

    public AirPortApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.checkwx.com/").build();
    }

    public AirPort getAirport(String uri){
        return webClient.get()
                .uri(uri)
                //co do poprzedniego feedbacku, jeszcze nie patrzyłem jak dodaje się coś do properties i wstrzykuje za pomocą @Value
                .header("X-API-Key","5b2a69d934bd4103968a69a4ee")
                .retrieve()
                .bodyToMono(AirPort.class).block();
    }

}
