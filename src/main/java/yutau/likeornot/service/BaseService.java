package yutau.likeornot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import yutau.likeornot.dao.FoodMapper;

@Component
public class BaseService {

    @Autowired
    public FoodMapper foodMapper;
}
