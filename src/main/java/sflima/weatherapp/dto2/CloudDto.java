package sflima.weatherapp.dto2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@AllArgsConstructor
@Getter
public class CloudDto implements Serializable {
    private final String code;
    private final String text;
}
