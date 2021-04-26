package yutau.likeornot.service;

import org.springframework.stereotype.Service;
import yutau.likeornot.model.Food;

@Service
public class GetFoodInfoService extends BaseService{

    public Food getFoodInfoById(int id){
        return foodMapper.selectFoodById(id) == null?null:foodMapper.selectFoodById(id);
    }

    public Food getFoodInfoByFoodName(String food_name){
        return foodMapper.selectFoodByName(food_name) == null?null:foodMapper.selectFoodByName(food_name);
    }
}
