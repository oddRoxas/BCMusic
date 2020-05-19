package com.music.bcmusic.Service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.music.bcmusic.Service.UserManage;
import com.music.bcmusic.dao.DistributorMapper;
import com.music.bcmusic.dao.EnterpriseMapper;
import com.music.bcmusic.dao.MusicianMapper;
import com.music.bcmusic.dao.UserMapper;
import com.music.bcmusic.entity.Distributor;
import com.music.bcmusic.entity.Enterprise;
import com.music.bcmusic.entity.Musician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserManageImpl implements UserManage {
    @Autowired
    private MusicianMapper musicianMapper;

    @Autowired
    private EnterpriseMapper enterpriseMapper;

    @Autowired
    private DistributorMapper distributorMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public int registerUser(int User_id, String User_name, String User_phone,
                            String Password) {
        // Todo: 密码加密
        return this.userMapper.insert(User_id, User_name, User_phone, Password);
    }

    @Override
    public int applyToBeMusician(int User_id, String Id_number, String card_id,
                                 String User_location, String User_mail) {
        // 获取以前的申请
        List<Musician> previousApplication = this.musicianMapper.selectByUserId(User_id);
        if (!previousApplication.isEmpty()) {
            for (Musician single:
                 previousApplication) {
                // Todo：需要修改为Integer
                // 将不为-1的设置成-1
                if (!single.getValidStatus().equals(-1))
                    this.musicianMapper.updateValidStatus(single.getApplicationId(), -1);
            }
        }

        // 添加新申请
        return this.musicianMapper.insert(User_id, Id_number, card_id, User_location, User_mail, 1);
    }

    @Override
    public int applyToBeEnterprise(int User_id, String Ent_name, String Ent_uscc,
                                   String Card_id, String Ent_manager, String Ent_phone,
                                   String Ent_location, String Ent_mail, int node_number) {
        // 获取以前的申请
        List<Enterprise> previousApplication = this.enterpriseMapper.selectByUserId(User_id);
        if (!previousApplication.isEmpty()) {
            for (Enterprise single:
                 previousApplication) {
                // Todo：需要修改为Integer
                // 将不为-1的设置成-1
                if (!single.getValidStatus().equals(-1))
                    this.enterpriseMapper.updateValidStatus(single.getApplicationId(), -1);
            }
        }

        return this.enterpriseMapper.insert(User_id, Ent_name, Ent_uscc, Card_id, Ent_manager,
                Ent_phone, Ent_location, Ent_mail, node_number);
    }

    @Override
    public int applyToBeDistributor(int User_id, String Distr_name, String Distr_uscc,
                                    String Card_id, String Distr_manager, String Distr_phone,
                                    String Distr_location, String Distr_mail, int node_number) {
        // 获取以前的申请
        List<Distributor> previousApplication = this.distributorMapper.selectByUserId(User_id);
        if (!previousApplication.isEmpty()) {
            for (Distributor single:
                    previousApplication) {
                // Todo：需要修改为Integer
                // 将不为-1的设置成-1
                if (!single.getValidStatus().equals(-1))
                    this.distributorMapper.updateValidStatus(single.getApplicationId(), -1);
            }
        }

        return this.distributorMapper.insert(User_id, Distr_name, Distr_uscc, Card_id, Distr_manager,
                Distr_phone, Distr_location, Distr_mail, node_number);
    }

    @Override
    public JSONArray getIdentityInfo(int User_id, int User_type) {
        List<Map<String, Object>> jsonList = new ArrayList<>();

        switch (User_type) {
            case 1:
                // 独立音乐人
                List<Musician> musicians = this.musicianMapper.selectValidByUserId(User_id);
                for (Musician musician:
                        musicians) {
                    Map<String, Object> json = new HashMap<>();
                    json.put("Id_number", musician.getIdNumber());
                    json.put("card_id", musician.getCardId());
                    json.put("User_location", musician.getUserLocation());
                    json.put("User_mail", musician.getUserMail());
                    json.put("Valid_status", musician.getValidStatus());

                }
                break;
            case 2:
                List<Enterprise> enterprises = this.enterpriseMapper.selectValidByUserId(User_id);
                for (Enterprise enterprise:
                     enterprises) {
                    Map<String, Object> json = new HashMap<>();
                    json.put("Ent_name", enterprise.getEntName());
                    json.put("Ent_uscc", enterprise.getEntUscc());
                    json.put("Card_id", enterprise.getCardId());
                    json.put("Ent_manager", enterprise.getEntManager());
                    json.put("Ent_phone", enterprise.getEntPhone());
                    json.put("Ent_location", enterprise.getEntLocation());
                    json.put("Ent_mail", enterprise.getEntMail());
                    json.put("Node_number", enterprise.getNodeNumber());
                    jsonList.add(json);
                }
                break;
            case 3:
                List<Distributor> distributors = this.distributorMapper.selectValidByUserId(User_id);
                for (Distributor distributor:
                        distributors) {
                    Map<String, Object> json = new HashMap<>();
                    json.put("Distr_name", distributor.getDistrName());
                    json.put("Distr_uscc", distributor.getDistrUscc());
                    json.put("Card_id", distributor.getCardId());
                    json.put("Distr_manager", distributor.getDistrManager());
                    json.put("Distr_phone", distributor.getDistrPhone());
                    json.put("Distr_location", distributor.getDistrLocation());
                    json.put("Distr_mail", distributor.getDistrMail());
                    json.put("Node_number", distributor.getNodeNumber());
                    jsonList.add(json);
                }
                break;
            default:
                break;
        }

        return JSONArray.parseArray(JSON.toJSONString(jsonList));
    }
}
