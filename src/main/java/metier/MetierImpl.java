package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired
    private IDao dao;

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = (temp * 9/5) + 32;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
