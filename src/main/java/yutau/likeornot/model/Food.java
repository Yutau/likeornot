package yutau.likeornot.model;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;


import javax.persistence.*;

@ApiModel("food 实体类")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder()
@Accessors(chain = true)
@Entity
@Table(name = "food")
public class Food {

    @ApiModelProperty("食物ID")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column
    private int id;

    @ApiModelProperty("食物名称")
    //@Id
    @Column
    private String food_name;

    @ApiModelProperty("是否喜欢食物")
    @Column
    private int like_or_dislike;

    @ApiModelProperty("喜欢或者是讨厌的原因")
    @Column
    private String reason;

    @ApiModelProperty("食物的种类")
    @Column
    private String category;


}
