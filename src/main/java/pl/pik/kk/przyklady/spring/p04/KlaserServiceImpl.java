package pl.pik.kk.przyklady.spring.p04;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import pl.pik.kk.przyklady.spring.p06.DrugieDao;

import javax.annotation.Resource;
import javax.inject.Inject;


@Service
public class KlaserServiceImpl {

	@Resource(name="prostaBazaDanych")
//	@Autowired
//	@Inject
//	@DrugieDao
//	@Qualifier("druga")
	private MonetaDao monetaDao;

	public KlaserServiceImpl() {
	}
	public KlaserServiceImpl(MonetaDao monetaDao) {
		this.monetaDao = monetaDao;
	}
	
	public List<Moneta> getDoSprzedania(){
		List<Moneta> all = monetaDao.getAll();
		List<Moneta> tmp = new ArrayList<Moneta>();
		for (Moneta moneta : all) {
			if(moneta.getStatus().equals(Status.DO_SPRZEDANIA)){
				tmp.add(moneta);
			}
		}
		return tmp;
	}

}
