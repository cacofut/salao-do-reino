/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit.repositories;

import br.com.diagnosticit.model.EnderecoPessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author cristiano
 */
@Repository
public interface EnderecoPessoaRepository extends JpaRepository<EnderecoPessoa, Long>{
    
}
