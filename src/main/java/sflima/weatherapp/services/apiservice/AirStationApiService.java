package sflima.weatherapp.services.apiservice;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;


@Service
public class AirStationApiService {

//Webclient based call
    private final WebClient webClient;

    public AirStationApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.gios.gov.pl/pjp-api/rest/station").build();
    }

    // skorzystać z mappera aby zmapować obiekty do listy ewentualnie uzyc streama ale idk jak
    /*public  AirStation test(){
        return webClient.get()
                .uri("/findAll")
                //.header("X-API-Key","5b2a69d934bd4103968a69a4ee")
                .retrieve()
                .bodyToMono(AirStation.class).block();
    }*/
}
