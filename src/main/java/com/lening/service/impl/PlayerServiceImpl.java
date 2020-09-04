package com.lening.service.impl;

import com.lening.entity.PlayerBean;
import com.lening.entity.SchoolBean;
import com.lening.entity.TeamBean;
import com.lening.mapper.PlayerMapper;
import com.lening.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    private PlayerMapper playerMapper;
    @Override
    public List<PlayerBean> getAll() {
        return playerMapper.getAll();
    }

    @Override
    public void save(PlayerBean playerBean) {
        playerMapper.save(playerBean);
    }

    @Override
    public List<SchoolBean> getSch() {
        return playerMapper.getSch();
    }

    @Override
    public void upDid(Long[] ids) {
        for (Long id : ids) {
            playerMapper.upDid(id);
        }
    }

    @Override
    public List<TeamBean> getTe() {
        return playerMapper.getTe();
    }
}
