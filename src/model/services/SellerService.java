package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class SellerService {

	//injetando a dependência dao
	private SellerDao dao = DaoFactory.createSellerDao();
	
	public List<Seller> findAll(){
		return dao.findAll(); //vai no BD e busca os departamentos
	}
	
	//método para inserir ou atualizar a entrada de dados
	public void saveOrUpdate(Seller obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	//remove o vendedor(Seller) do BD
	public void remove(Seller obj) {
		dao.deleteById(obj.getId());
	}
}
