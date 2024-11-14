package school.sptech.atv_cicd.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class CalculadoraService {

    public Double dividir(Double a, Double b) {
        if (b == 0) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Não é possível dividir por zero");
        }
        return a / b;
    }
}
