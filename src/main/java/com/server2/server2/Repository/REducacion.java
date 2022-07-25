
package com.server2.server2.Repository;

import com.server2.server2.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface REducacion extends JpaRepository<Educacion, Integer> {
    public Optional<Educacion> findByTituloEd(String tituloEd);
    public boolean existsByTituloEd(String tituloEd);
}
