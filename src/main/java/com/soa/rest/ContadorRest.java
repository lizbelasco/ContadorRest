/**
 * 
 */
package com.soa.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 */
@RestController
public class ContadorRest {
    
    @GetMapping("/contar")
    public ResponseEntity<Respuesta> calcular(){
        return null;
    }
}
