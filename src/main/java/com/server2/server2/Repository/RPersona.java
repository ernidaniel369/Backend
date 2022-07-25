
package com.server2.server2.Repository;

import com.server2.server2.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RPersona extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
