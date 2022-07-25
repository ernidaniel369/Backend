
package com.server2.server2.Service;

import com.server2.server2.Entity.Proyecto;
import com.server2.server2.Repository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rProyecto;
    
     public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Optional<Proyecto> getOne (int id){
        return rProyecto.findById(id);
    }
    
    public Optional<Proyecto> getByTitulo (String titulo){
        return rProyecto.findByTitulo(titulo);
    }
    
    public void save (Proyecto proy){
        rProyecto.save(proy);
    }
    
    public void delete (int id){
        rProyecto.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyecto.existsById(id);
    }
    
    public boolean existsByTitulo(String titulo){
        return rProyecto.existsByTitulo(titulo);
    }
}
