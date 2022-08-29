package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	/* Cria inje��o de dependencia - esconde a implementa��o do SellerDao*/
	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC();
	}
}
