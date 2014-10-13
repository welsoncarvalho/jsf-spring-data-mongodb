package br.com.teste.jsdm.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import br.com.teste.jsdm.dao.Dao;
import br.com.teste.jsdm.model.EntidadeBase;

// TODO: Auto-generated Javadoc
/**
 * DOCUMENT ME!.
 *
 * @author Welson
 * @param <T> tipo genérico
 */
public class DaoImpl<T extends EntidadeBase> implements Dao<T> {

	/** A constante serialVersionUID. */
	private static final long serialVersionUID = -7048618566278385967L;

	/** mongo template. */
	@Autowired
	private MongoOperations mongoTemplate;
	
	/** clazz. */
	private Class<T> clazz;
	
	/**
	 * Instancia um novo dao impl.
	 *
	 * @param clazz clazz
	 */
	public DaoImpl(Class<T> clazz) {
		this.clazz = clazz;
	}
	
	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.dao.Dao#save(br.com.teste.jsdm.model.EntidadeBase)
	 */
	@Override
	public void save(T entidade) {
		mongoTemplate.save(entidade);
	}

	/* (non-Javadoc)
	 * @see br.com.teste.jsdm.dao.Dao#update(br.com.teste.jsdm.model.EntidadeBase)
	 */
	@Override
	public void update(T entidade) {
		mongoTemplate.save(entidade);
	}

	/**
	 * Update.
	 *
	 * @param searchQuery search query
	 * @param update update
	 */
	protected void update(Query searchQuery, Update update) {
		mongoTemplate.updateFirst(searchQuery, update, this.clazz);
	}

	/**
	 * Delete.
	 *
	 * @param searchQuery search query
	 */
	protected void delete(Query searchQuery) {
		mongoTemplate.remove(searchQuery, this.clazz);
	}

	/**
	 * Find by criteria.
	 *
	 * @param criteria criteria
	 * @return list
	 */
	protected List<T> findByCriteria(Criteria criteria) {
		Query query = new Query(criteria);
		return mongoTemplate.find(query, clazz);
	}

}
