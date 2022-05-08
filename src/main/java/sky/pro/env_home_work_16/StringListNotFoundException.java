package sky.pro.env_home_work_16;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class StringListNotFoundException extends RuntimeException {


    public StringListNotFoundException(String s) {
        super(s);
    }
}
