package model.services;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentService {

	//injetando a dependência dao
	private DepartmentDao dao = DaoFactory.createDepartmentDao();
	
	public List<Department> findAll(){
		return dao.findAll(); //vai no BD e busca os departamentos
	}
	
	//método para inserir ou atualizar a entrada de dados
	public void saveOrUpdate(Department obj) {
		if(obj.getId() == null) {
			dao.insert(obj);
		}
		else {
			dao.update(obj);
		}
	}
	
	public void remove(Department obj) {
		dao.deleteById(obj.getId());
	}
}
