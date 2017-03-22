package cn.stpan.design.service.impl;

import cn.stpan.design.dao.CardHistoryDao;
import cn.stpan.design.entity.CardHistory;
import cn.stpan.design.service.CardHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/22 17:28
 * 功能：
 */
@Service
public class CardHistoryServiceImpl implements CardHistoryService {
    @Autowired
    CardHistoryDao cardHistoryDao;

    public List<CardHistory> getAllCardHistory() {
        cardHistoryDao.getAllCardHistory();
        return null;
    }
}
