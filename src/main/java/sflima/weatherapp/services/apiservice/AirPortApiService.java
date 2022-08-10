package sflima.weatherapp.services.apiservice;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import sflima.weatherapp.dtoapi.airport.AirPortDtoApi;


// zostawić to tuaj czy do pakietu z serwisami? Dopytać się



@Service
public class AirPortApiService {

    private final WebClient webClient;

    public AirPortApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.checkwx.com/metar/").build();
    }

    public AirPortDtoApi getAirport(String uri){
        return webClient.get()
                .uri(uri)
                //co do poprzedniego feedbacku, jeszcze nie patrzyłem jak dodaje się coś do properties i wstrzykuje za pomocą @Value
                .header("X-API-Key","5b2a69d934bd4103968a69a4ee")
                .retrieve()
                .bodyToMono(AirPortDtoApi.class).block();
    }

}
