package com.lening.mapper;

import com.lening.entity.PlayerBean;
import com.lening.entity.SchoolBean;
import com.lening.entity.TeamBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PlayerMapper {
    List<PlayerBean> getAll();

    void save(PlayerBean playerBean);

    List<SchoolBean> getSch();

    void upDid(@Param("id") Long id);

    List<TeamBean> getTe();
}
