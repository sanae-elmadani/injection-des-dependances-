package metier;

import dao.IDao;

public class ImpMetier implements IMetier{
    private IDao dao;
    //couplage faible

    @Override
    public double calcule() {
       double tmp= dao.getData();
       double res=tmp*2;
       return res;
    }
// injecter dans la variable dao objet
// d'une classe qui implemente l'interface
    //IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
