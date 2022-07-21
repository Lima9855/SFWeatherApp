package sflima.weatherapp.services.apiservice;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import sflima.weatherapp.model.airport.AirPort;


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
