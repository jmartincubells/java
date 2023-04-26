
package web.portfolio.com.service;
import web.portfolio.com.entity.Experiencia;
import web.portfolio.com.repository.RExperiencia;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SExperiencia {
    @Autowired
 public RExperiencia rExperiencia;
    
    
public List<Experiencia> verExperiencias() { 
     List<Experiencia> listaExperiencias= rExperiencia.findAll();
 return listaExperiencias;
 }
 
 public void crearExperiencia(Experiencia experiencia){
     rExperiencia.save(experiencia); 
 }
 
 public void borrarExperiencia(int id){
     rExperiencia.deleteById(id);
 }

 public Experiencia buscarExperiencia(int id){
     //sino encuentra la persona devuelve nulo o null
     Experiencia experiencia = rExperiencia.findById(id).orElse(null);
     return experiencia;
 }
 public void editarExperiencia(Experiencia experiencia) {
        rExperiencia.save(experiencia);
    }
    
}
