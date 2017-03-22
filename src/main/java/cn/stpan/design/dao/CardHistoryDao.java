package cn.stpan.design.dao;

import cn.stpan.design.entity.Card;
import cn.stpan.design.entity.CardHistory;

import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/22 15:12
 * 功能：
 */

public interface CardHistoryDao {
    List<CardHistory> getAllCardHistory();
}
