package com.corenetworks.MadurezRestFull.excepciones;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestController
@ControllerAdvice
public class ControladorExepciones extends ResponseEntityExceptionHandler {
    @ExceptionHandler(ExepcionNoEncontrado.class)
    public ResponseEntity<ExcepcionPretty> atrapaExepcionNoEncontrada(ExepcionNoEncontrado ex, WebRequest peticion){
        ExcepcionPretty e= new ExcepcionPretty(ex.getMessage(),LocalDateTime.now(),peticion.getDescription(false));
        return  new ResponseEntity<>(e, HttpStatus.NOT_FOUND);
    }

}
