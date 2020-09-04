package com.lening.controller;

import com.lening.entity.PlayerBean;
import com.lening.entity.Result;
import com.lening.entity.SchoolBean;
import com.lening.entity.TeamBean;
import com.lening.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;

    @RequestMapping("getAll")
    public List<PlayerBean> getAll(Model model){
        List<PlayerBean> list = playerService.getAll();
        return list;
    }

    @RequestMapping("save")
    public Result save(@RequestBody PlayerBean playerBean){
        try {
            playerService.save(playerBean);
            return new Result(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "添加失败");
        }
    }

    @RequestMapping("upDid")
    public Result upDid(@RequestBody Long[] ids){
        try {
            playerService.upDid(ids);
            return new Result(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false, "删除失败");
        }
    }

    @RequestMapping("getPlay")
    public List<SchoolBean> getPlay(){
        List<SchoolBean> slist =  playerService.getSch();
        return slist;
    }
    @RequestMapping("getTe")
    public List<TeamBean> getTe(){
        List<TeamBean> tlist =  playerService.getTe();
        return tlist;
    }

}
