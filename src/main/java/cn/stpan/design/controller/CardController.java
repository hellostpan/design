package cn.stpan.design.controller;

import cn.stpan.design.entity.Card;
import cn.stpan.design.service.CardHistoryService;
import cn.stpan.design.service.CardService;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

/**
 * 作者：stpan
 * 创建时间：2017/3/21 9:38
 * 功能：
 */
@Controller
@RequestMapping("card")
public class CardController {

    @Autowired
    private CardService cardService;
    @Autowired
    private CardHistoryService cardHistoryService;

    @RequestMapping("/cardList")
    @ResponseBody
    public String login(){
        List<Card> list = cardService.getAllCard();
        cardHistoryService.getAllCardHistory();
        return JSON.toJSONString(list);
    }

    @RequestMapping("/cardList1")
    @ResponseBody
    public HashMap login1(){
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("name","stpan");
        map.put("age","28");
        return map;
    }

    @RequestMapping("/detail/{cardId}")
    @ResponseBody
    public String getUserByUserId(@PathVariable(value = "cardId") String cardId) {
        return cardId;
    }

}
