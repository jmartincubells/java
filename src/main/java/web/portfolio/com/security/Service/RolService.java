package web.portfolio.com.security.Service;

import jakarta.transaction.Transactional;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.portfolio.com.security.Entity.Rol;
import web.portfolio.com.security.Enums.RolNombre;
import web.portfolio.com.security.Repository.iRolRepository;

@Service 
@Transactional
public class RolService {
    @Autowired
    iRolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre) {
        return irolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol) {
        irolRepository.save(rol);
    }
}
