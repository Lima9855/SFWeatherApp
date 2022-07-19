package sflima.weatherapp.services.apiservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import sflima.weatherapp.model.airstationfindall.AirStationAll;

import java.util.List;


@Service
public class AirStationApiService {

    private final WebClient webClient;

    public AirStationApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.gios.gov.pl/pjp-api/rest/station").build();
    }

    public List<AirStationAll> getAirStaions(){
        Mono<List<AirStationAll>> response = webClient.get()
                .uri("/findAll")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<AirStationAll>>() {
                });
        List<AirStationAll> a1 = response.block();

        return a1;
    }
}
