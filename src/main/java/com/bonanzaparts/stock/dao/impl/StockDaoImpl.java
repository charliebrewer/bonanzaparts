package com.bonanzaparts.stock.dao.impl;

import java.util.Collection;

import org.hibernate.SessionFactory;

import com.bonanzaparts.stock.dao.StockDao;
import com.bonanzaparts.stock.model.Stock;

public class StockDaoImpl implements StockDao {

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Collection loadProductsByCategory(String category) {
        return this.sessionFactory.getCurrentSession()
                .createQuery("from test.Product product where product.category=?")
                .setParameter(0, category)
                .list();
    }

	public void save(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	public void update(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Stock stock) {
		// TODO Auto-generated method stub
		
	}

	public Stock findByStockCode(String stockCode) {
		// TODO Auto-generated method stub
		return null;
	}
}