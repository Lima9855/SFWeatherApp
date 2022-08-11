package sflima.weatherapp.services.apiservice;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
import sflima.weatherapp.dto.airstation.airstationall.AirStationAllDto;

import java.util.List;


@Service
public class AirStationApiService {

    private final WebClient webClient;

    public AirStationApiService(WebClient.Builder builder) {
        webClient= builder.baseUrl("https://api.gios.gov.pl/pjp-api/rest/station").build();
    }

    public List<AirStationAllDto> getAirStations(){
        Mono<List<AirStationAllDto>> response = webClient.get()
                .uri("/findAll")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<AirStationAllDto>>() {
                });
        List<AirStationAllDto> a1 = response.block();

        return a1;
    }


}
