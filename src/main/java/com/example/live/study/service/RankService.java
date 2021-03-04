package com.example.live.study.service;

import java.util.List;
import com.example.live.study.dao.RankDao;
import com.example.live.study.domain.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankService {
    @Autowired
    private RankDao rankDao;

    public List<RankItem> getRankList() {
        return rankDao.getRankList();
    }
}
