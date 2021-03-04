package com.example.live.study.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.example.live.study.domain.RankItem;
import com.example.live.study.service.RankService;
import com.example.live.study.utils.JsonUtil;
import com.google.gson.Gson;
import com.google.gson.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class RankController {
    @Autowired
    private RankService rankService;
    private Gson g = new Gson();

    @RequestMapping(value = "/rank", method = RequestMethod.GET)
    public void getRankList(HttpServletResponse resp, @RequestParam String type) {

        List<RankItem> items = rankService.getRankList();

        JsonArray jsonArray = new JsonArray();
        for (int i = items.size() - 1; i >= 0; i--) {
            JsonObject obj = new JsonObject();
            RankItem item = items.get(i);
            JsonObject jsonObject = g.toJsonTree(item).getAsJsonObject();
            jsonArray.add(jsonObject);
        }
        
        JsonUtil.writeResult(resp, "获取成功", 200, "rank", jsonArray);
    }
}
