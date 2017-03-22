package cn.stpan.design.service.impl;

import cn.stpan.design.dao.CardDao;
import cn.stpan.design.entity.Card;
import cn.stpan.design.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/22 15:20
 * 功能：
 */
@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardDao cardDao;

    public List<Card> getAllCard() {
        return cardDao.getAllCard();
    }
}
