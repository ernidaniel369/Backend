
package com.server2.server2.Service;

import com.server2.server2.Entity.Habilidades;
import com.server2.server2.Repository.RHabilidades;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SHabilidades {
    @Autowired
    RHabilidades rHabilidades;
    
     public List<Habilidades> list(){
        return rHabilidades.findAll();
    }
    public Optional<Habilidades> getOne (int id){
        return rHabilidades.findById(id);
    }
    
    public Optional<Habilidades> getByNombre (String nombre){
        return rHabilidades.findByNombre(nombre);
    }
    
    public void save (Habilidades hab){
        rHabilidades.save(hab);
    }
    
    
    public void delete (int id){
        rHabilidades.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rHabilidades.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rHabilidades.existsByNombre(nombre);
    }
}
