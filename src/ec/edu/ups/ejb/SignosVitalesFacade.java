package ec.edu.ups.ejb;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.edu.ups.entidad.SignosVitales;

public class SignosVitalesFacade extends AbstractFacade<SignosVitales>{
	@PersistenceContext(unitName = "Examen")
	 private EntityManager em;
	
	public SignosVitalesFacade() {
		super(SignosVitales.class);
	}
	
	@Override
    protected EntityManager getEntityManager() {
        return em;
    }

}
