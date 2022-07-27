
package com.server2.server2.Repository;

import com.server2.server2.Entity.Habilidades;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RHabilidades extends JpaRepository<Habilidades, Integer>{
    public Optional<Habilidades> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
    
}
