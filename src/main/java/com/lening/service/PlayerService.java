package com.lening.service;

import com.lening.entity.PlayerBean;
import com.lening.entity.SchoolBean;
import com.lening.entity.TeamBean;

import java.util.List;

public interface PlayerService {
    List<PlayerBean> getAll();

    void save(PlayerBean playerBean);

    List<SchoolBean> getSch();

    void upDid(Long[] ids);

    List<TeamBean> getTe();
}
