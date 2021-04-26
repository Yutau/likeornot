package yutau.likeornot.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import yutau.likeornot.model.Food;
import yutau.likeornot.model.Result;
import yutau.likeornot.service.GetFoodInfoService;

@RestController
@Api(tags = "食物提取器")
public class GetFoodInfo extends BaseController{

    @Autowired
    public GetFoodInfoService getFoodInfoService;

    @PostMapping("/food/getFoodInfoById")
    @ApiOperation(value = "得到一个食物喜欢与否的信息",notes = "可以获得食物的信息")
    @ApiImplicitParam(name = "id",value = "食物的id")
    public Result<Food> getFoodInfoById(@RequestParam("id")int id){
        Food food = getFoodInfoService.getFoodInfoById(id);
        if(food == null){
            return Result.error(4444,"找不到该食物");
        }
        Result<Food> r = Result.ok(food);
        return r;
    }

    @PostMapping("/food/getFoodInfoByName")
    @ApiOperation(value = "得到一个食物喜欢与否的信息",notes = "可以获得食物的信息")
    @ApiImplicitParam(name = "food_name",value = "食物的名字")
    public Result<Food> getFoodInfoByName(@RequestParam("food_name")String food_name){
        Food food = getFoodInfoService.getFoodInfoByFoodName(food_name);
        if(food == null){
            return Result.error(4444,"找不到该食物");
        }
        Result<Food> r = Result.ok(food);
        return r;
    }
}
