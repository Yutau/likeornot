package yutau.likeornot.dao;


import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import yutau.likeornot.model.Food;

@Mapper
@Component
public interface FoodMapper {

    @Select("SELECT * FROM food WHERE food_name = #{food_name}")
    public Food selectFoodByName(@Param("food_name") String food_name);

    @Select("SELECT * FROM food WHERE id = #{id}")
    public Food selectFoodById(@Param("id") int id);
}
