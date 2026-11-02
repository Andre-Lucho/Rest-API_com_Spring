package start.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math") // RequestMapping aplicado a todos os métodos da classe
public class MathController {
    //http://localhost:8080/math/sum/3/5...

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    // indicando, através do RequestMapping um subcaminho dentro de '/math/' que recebe variáveis via url
    public Double sum(
    // @PathVariable = indica onde as variáveis recebidas devem ser aplicadas no método 'sum'
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo
    ) throws Exception {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new IllegalArgumentException();
        }
        //return Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
        return convertToDouble(numberOne) + convertToDouble(numberTwo);
    }

    private Double convertToDouble(String number) {
        return 1D;
    }

    private boolean isNumeric(String number){
        return true;
    }

}
