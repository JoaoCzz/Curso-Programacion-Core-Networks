package com.corenetworks._Febrero_RepasoExcepciones.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
@RestController
@ControllerAdvice
public class ControladorExcepcion extends ResponseEntityExceptionHandler {
@ExceptionHandler(ExcepcionPersonalizada.class)
    public  ResponseEntity<ExcepcionDetalles> error(ExcepcionPersonalizada ex, WebRequest peticion){
        ExcepcionDetalles e1= new ExcepcionDetalles(ex.getMessage(),LocalDateTime.now(),peticion.getDescription(false));
        return new ResponseEntity<>(e1, HttpStatus.NOT_FOUND);
    }

    public  final ResponseEntity<ExcepcionDetalles> catchTodasLasExcepciones (Exception ex,WebRequest peticion){
        ExcepcionDetalles e1= new ExcepcionDetalles(ex.getMessage(),LocalDateTime.now(),peticion.getDescription(false));
        return new ResponseEntity<>(e1, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
