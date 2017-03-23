package cn.stpan.design.dao.impl;

import cn.stpan.design.dao.CardHistoryDao;
import cn.stpan.design.entity.Card;
import cn.stpan.design.entity.CardHistory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/22 17:24
 * 功能：
 */
@Repository
public class CardHistoryDaoImpl implements CardHistoryDao {
    @Autowired
    SessionFactory sessionFactory;

    public List<CardHistory> getAllCardHistory() {
        /*CardHistory history1 = new CardHistory();
        CardHistory history2 = new CardHistory();
        CardHistory history3 = new CardHistory();
        history1.setId(30);
        history2.setId(31);
        history3.setId(32);
        Session session = sessionFactory.getCurrentSession();
        session.save(history1);
        session.save(history2);
        session.save(history3);*/
        return null;
    }
}
