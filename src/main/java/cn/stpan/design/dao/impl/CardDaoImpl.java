package cn.stpan.design.dao.impl;

import cn.stpan.design.dao.CardDao;
import cn.stpan.design.entity.Card;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/22 15:13
 * 功能：
 */
@Repository
public class CardDaoImpl implements CardDao{

    @Autowired
    private SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public List<Card> getAllCard() {
        return sessionFactory.getCurrentSession().createQuery("from Card ").list();
    }
}
