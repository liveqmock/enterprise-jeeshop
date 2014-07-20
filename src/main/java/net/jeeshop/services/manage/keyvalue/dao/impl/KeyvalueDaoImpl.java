package net.jeeshop.services.manage.keyvalue.dao.impl;import java.util.List;import net.jeeshop.core.dao.BaseDao;import net.jeeshop.core.dao.page.PagerModel;import net.jeeshop.services.manage.keyvalue.bean.Keyvalue;import net.jeeshop.services.manage.keyvalue.dao.KeyvalueDao;public class KeyvalueDaoImpl implements KeyvalueDao {	private BaseDao dao;	public void setDao(BaseDao dao) {		this.dao = dao;	}	public PagerModel selectPageList(Keyvalue e) {		return dao.selectPageList("manage.keyvalue.selectPageList",				"manage.keyvalue.selectPageCount", e);	}	@SuppressWarnings({ "unchecked", "rawtypes" })	public List selectList(Keyvalue e) {		return dao.selectList("manage.keyvalue.selectList", e);	}	public Keyvalue selectOne(Keyvalue e) {		return (Keyvalue) dao.selectOne("manage.keyvalue.selectOne", e);	}	public int delete(Keyvalue e) {		return dao.delete("manage.keyvalue.delete", e);	}	public int update(Keyvalue e) {		return dao.update("manage.keyvalue.update", e);	}	public int deletes(String[] ids) {		Keyvalue e = new Keyvalue();		for (int i = 0; i < ids.length; i++) {			e.setId(ids[i]);			delete(e);		}		return 0;	}	public int insert(Keyvalue e) {		return dao.insert("manage.keyvalue.insert", e);	}	public int deleteById(int id) {		return dao.delete("manage.keyvalue.deleteById", id);	}	public Keyvalue selectById(String id) {		return (Keyvalue) dao.selectOne(id);	}}