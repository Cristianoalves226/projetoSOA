/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author 02376421152
 */
@WebService(serviceName = "ServicoCalculadora")
public class ServicoCalculadora {

    @WebMethod(operationName = "somar")
    public double processaSomar(double termo1, double termo2) {
        return termo1 + termo2;
    }

    @WebMethod(operationName = "subtrair")
    public double processaSubtrair(double termo1, double termo2) {
        return termo1 - termo2;
    }

    @WebMethod(operationName = "multiplicar")
    public double processaMultiplicar(double termo1, double termo2) {
        return termo1 * termo2;
    }

    @WebMethod(operationName = "dividir")
    public double processaDividir(double termo1, double termo2) {
        if (termo2 > 0) {
            return termo1 / termo2;
        }else{
            
            return 0;
        }
    }

}
