package cn.stpan.design.controller;

import com.alibaba.fastjson.JSON;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * 作者：stpan
 * 创建时间：2017/3/21 9:38
 * 功能：
 */
@Controller
@RequestMapping("card")
public class CardController {

    @RequestMapping("/cardList")
    @ResponseBody
    public String login(){
        HashMap<String,Object> map = new HashMap<String, Object>();
        map.put("name","stpan");
        map.put("age","28");
        return JSON.toJSONString(map);
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
