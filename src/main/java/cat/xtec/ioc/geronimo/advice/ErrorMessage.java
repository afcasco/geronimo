package cat.xtec.ioc.geronimo.advice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@AllArgsConstructor
@Builder
@Getter
public class ErrorMessage {

    private int statusCode;
    private Date timestamp;
    private String message;
    private String description;
}