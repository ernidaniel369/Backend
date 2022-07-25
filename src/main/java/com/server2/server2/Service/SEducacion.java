
package com.server2.server2.Service;

import com.server2.server2.Entity.Educacion;
import com.server2.server2.Repository.REducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SEducacion {
    @Autowired
    REducacion rEducacion;
    
    public List<Educacion> list(){
        return rEducacion.findAll();
    }
    public Optional<Educacion> getOne (int id){
        return rEducacion.findById(id);
    }
    
    public Optional<Educacion> getByTituloEd (String tituloEd){
        return rEducacion.findByTituloEd(tituloEd);
    }
    
    public void save (Educacion expe){
        rEducacion.save(expe);
    }
    
    
    public void delete (int id){
        rEducacion.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rEducacion.existsById(id);
    }
    
    public boolean existsByTituloEd(String tituloEd){
        return rEducacion.existsByTituloEd(tituloEd);
    }
}
