package com.example.live.study.dao;

import java.util.List;
import com.example.live.study.domain.RankItem;
import org.apache.ibatis.annotations.*;

@Mapper
public interface RankDao {
    @Select("SELECT * FROM `rank`")
    List<RankItem> getRankList();
}
