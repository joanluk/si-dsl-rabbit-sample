package works.service.domain;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class WorkUnit {

    private String id;
    private String definition;

    //to simulate a case where the service rejects a workunit..
    private boolean throwException;

    public WorkUnit() {
        //For Spring Web layer to bind cleanly..
    }

    @JsonCreator
    public WorkUnit(@JsonProperty("id") String id,
                    @JsonProperty("definition") String definition,
                    @JsonProperty("throw_exception") boolean throwException) {
        this.id = id;
        this.definition = definition;
        this.throwException = throwException;
    }


    @JsonProperty("throw_exception")
    public boolean isThrowException() {
        return throwException;
    }
}
