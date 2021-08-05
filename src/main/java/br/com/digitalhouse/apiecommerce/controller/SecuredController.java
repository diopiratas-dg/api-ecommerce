package br.com.digitalhouse.apiecommerce.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/secure")
public class SecuredController {

    @ApiOperation(
            value = "Valida autenticação")
    @GetMapping
    public ResponseEntity reachSecureEndpoint(){
        ResponseEntity responseEntity = new ResponseEntity("Você esta autenticado! Parabens", HttpStatus.OK);
        return responseEntity;
    }
}
