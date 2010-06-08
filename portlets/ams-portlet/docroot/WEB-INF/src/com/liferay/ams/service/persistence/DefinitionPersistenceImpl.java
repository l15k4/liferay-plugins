/**
 * Copyright (c) 2000-2010 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.ams.service.persistence;

import com.liferay.ams.NoSuchDefinitionException;
import com.liferay.ams.model.Definition;
import com.liferay.ams.model.impl.DefinitionImpl;
import com.liferay.ams.model.impl.DefinitionModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.annotation.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistry;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <a href="DefinitionPersistenceImpl.java.html"><b><i>View Source</i></b></a>
 *
 * <p>
 * ServiceBuilder generated this class. Modifications in this class will be
 * overwritten the next time is generated.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       DefinitionPersistence
 * @see       DefinitionUtil
 * @generated
 */
public class DefinitionPersistenceImpl extends BasePersistenceImpl<Definition>
	implements DefinitionPersistence {
	public static final String FINDER_CLASS_NAME_ENTITY = DefinitionImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST = FINDER_CLASS_NAME_ENTITY +
		".List";
	public static final FinderPath FINDER_PATH_FIND_ALL = new FinderPath(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionModelImpl.FINDER_CACHE_ENABLED, FINDER_CLASS_NAME_LIST,
			"countAll", new String[0]);

	public void cacheResult(Definition definition) {
		EntityCacheUtil.putResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionImpl.class, definition.getPrimaryKey(), definition);
	}

	public void cacheResult(List<Definition> definitions) {
		for (Definition definition : definitions) {
			if (EntityCacheUtil.getResult(
						DefinitionModelImpl.ENTITY_CACHE_ENABLED,
						DefinitionImpl.class, definition.getPrimaryKey(), this) == null) {
				cacheResult(definition);
			}
		}
	}

	public void clearCache() {
		CacheRegistry.clear(DefinitionImpl.class.getName());
		EntityCacheUtil.clearCache(DefinitionImpl.class.getName());
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);
	}

	public void clearCache(Definition definition) {
		EntityCacheUtil.removeResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionImpl.class, definition.getPrimaryKey());
	}

	public Definition create(long definitionId) {
		Definition definition = new DefinitionImpl();

		definition.setNew(true);
		definition.setPrimaryKey(definitionId);

		return definition;
	}

	public Definition remove(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return remove(((Long)primaryKey).longValue());
	}

	public Definition remove(long definitionId)
		throws NoSuchDefinitionException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Definition definition = (Definition)session.get(DefinitionImpl.class,
					new Long(definitionId));

			if (definition == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + definitionId);
				}

				throw new NoSuchDefinitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					definitionId);
			}

			return remove(definition);
		}
		catch (NoSuchDefinitionException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	public Definition remove(Definition definition) throws SystemException {
		for (ModelListener<Definition> listener : listeners) {
			listener.onBeforeRemove(definition);
		}

		definition = removeImpl(definition);

		for (ModelListener<Definition> listener : listeners) {
			listener.onAfterRemove(definition);
		}

		return definition;
	}

	protected Definition removeImpl(Definition definition)
		throws SystemException {
		definition = toUnwrappedModel(definition);

		Session session = null;

		try {
			session = openSession();

			if (definition.isCachedModel() || BatchSessionUtil.isEnabled()) {
				Object staleObject = session.get(DefinitionImpl.class,
						definition.getPrimaryKeyObj());

				if (staleObject != null) {
					session.evict(staleObject);
				}
			}

			session.delete(definition);

			session.flush();
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.removeResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionImpl.class, definition.getPrimaryKey());

		return definition;
	}

	public Definition updateImpl(com.liferay.ams.model.Definition definition,
		boolean merge) throws SystemException {
		definition = toUnwrappedModel(definition);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, definition, merge);

			definition.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST);

		EntityCacheUtil.putResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
			DefinitionImpl.class, definition.getPrimaryKey(), definition);

		return definition;
	}

	protected Definition toUnwrappedModel(Definition definition) {
		if (definition instanceof DefinitionImpl) {
			return definition;
		}

		DefinitionImpl definitionImpl = new DefinitionImpl();

		definitionImpl.setNew(definition.isNew());
		definitionImpl.setPrimaryKey(definition.getPrimaryKey());

		definitionImpl.setDefinitionId(definition.getDefinitionId());
		definitionImpl.setGroupId(definition.getGroupId());
		definitionImpl.setCompanyId(definition.getCompanyId());
		definitionImpl.setUserId(definition.getUserId());
		definitionImpl.setUserName(definition.getUserName());
		definitionImpl.setCreateDate(definition.getCreateDate());
		definitionImpl.setModifiedDate(definition.getModifiedDate());
		definitionImpl.setTypeId(definition.getTypeId());
		definitionImpl.setManufacturer(definition.getManufacturer());
		definitionImpl.setModel(definition.getModel());
		definitionImpl.setOrderDate(definition.getOrderDate());
		definitionImpl.setQuantity(definition.getQuantity());
		definitionImpl.setPrice(definition.getPrice());

		return definitionImpl;
	}

	public Definition findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	public Definition findByPrimaryKey(long definitionId)
		throws NoSuchDefinitionException, SystemException {
		Definition definition = fetchByPrimaryKey(definitionId);

		if (definition == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + definitionId);
			}

			throw new NoSuchDefinitionException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				definitionId);
		}

		return definition;
	}

	public Definition fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	public Definition fetchByPrimaryKey(long definitionId)
		throws SystemException {
		Definition definition = (Definition)EntityCacheUtil.getResult(DefinitionModelImpl.ENTITY_CACHE_ENABLED,
				DefinitionImpl.class, definitionId, this);

		if (definition == null) {
			Session session = null;

			try {
				session = openSession();

				definition = (Definition)session.get(DefinitionImpl.class,
						new Long(definitionId));
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (definition != null) {
					cacheResult(definition);
				}

				closeSession(session);
			}
		}

		return definition;
	}

	public List<Definition> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	public List<Definition> findAll(int start, int end)
		throws SystemException {
		return findAll(start, end, null);
	}

	public List<Definition> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		Object[] finderArgs = new Object[] {
				String.valueOf(start), String.valueOf(end),
				String.valueOf(orderByComparator)
			};

		List<Definition> list = (List<Definition>)FinderCacheUtil.getResult(FINDER_PATH_FIND_ALL,
				finderArgs, this);

		if (list == null) {
			Session session = null;

			try {
				session = openSession();

				StringBundler query = null;
				String sql = null;

				if (orderByComparator != null) {
					query = new StringBundler(2 +
							(orderByComparator.getOrderByFields().length * 3));

					query.append(_SQL_SELECT_DEFINITION);

					appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
						orderByComparator);

					sql = query.toString();
				}

				sql = _SQL_SELECT_DEFINITION;

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Definition>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Definition>)QueryUtil.list(q, getDialect(),
							start, end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					list = new ArrayList<Definition>();
				}

				cacheResult(list);

				FinderCacheUtil.putResult(FINDER_PATH_FIND_ALL, finderArgs, list);

				closeSession(session);
			}
		}

		return list;
	}

	public void removeAll() throws SystemException {
		for (Definition definition : findAll()) {
			remove(definition);
		}
	}

	public int countAll() throws SystemException {
		Object[] finderArgs = new Object[0];

		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				finderArgs, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DEFINITION);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL, finderArgs,
					count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.liferay.ams.model.Definition")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Definition>> listenersList = new ArrayList<ModelListener<Definition>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Definition>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	@BeanReference(type = AssetPersistence.class)
	protected AssetPersistence assetPersistence;
	@BeanReference(type = CheckoutPersistence.class)
	protected CheckoutPersistence checkoutPersistence;
	@BeanReference(type = DefinitionPersistence.class)
	protected DefinitionPersistence definitionPersistence;
	@BeanReference(type = TypePersistence.class)
	protected TypePersistence typePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_DEFINITION = "SELECT definition FROM Definition definition";
	private static final String _SQL_COUNT_DEFINITION = "SELECT COUNT(definition) FROM Definition definition";
	private static final String _ORDER_BY_ENTITY_ALIAS = "definition.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Definition exists with the primary key ";
	private static Log _log = LogFactoryUtil.getLog(DefinitionPersistenceImpl.class);
}