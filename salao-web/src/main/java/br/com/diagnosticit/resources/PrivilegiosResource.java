/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.resources;

import br.com.diagnosticit.model.Privilegio;
import br.com.diagnosticit.services.PrivilegioService;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cristiano
 */
@RestController
@RequestMapping(value = "/privilegios")
public class PrivilegiosResource {
       
    @Autowired
    private PrivilegioService privilegioService;
    
    @GetMapping
    public ResponseEntity<Set<Privilegio>> findAll(){        
        Set<Privilegio> privilegios = privilegioService.findAll();
        return ResponseEntity.ok().body(privilegios);
    }

}
