package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	/* Cria injeção de dependencia - esconde a implementação do SellerDao*/
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
