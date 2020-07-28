package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.CitaMedica;

public class CitaMedicaFacade extends AbstractFacade<CitaMedica>{
	
	@PersistenceContext(unitName = "Examen")
	 private EntityManager em;
	
	public CitaMedicaFacade() {
		super(CitaMedica.class);
	}
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
