/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import entity.SoLieuChiPhi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author LENOVO
 */
@Repository

public interface SoLieuChiPhiRepository extends CrudRepository<SoLieuChiPhi, Integer>{
    
}
