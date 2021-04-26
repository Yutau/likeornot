$(".toggle").on("click", function () {
  $(".container").stop().addClass("active");
});

$(".close").on("click", function () {
  $(".container").stop().removeClass("active");
});

$("#button").click(function(e){
  e.preventDefault();
  //alert($("#food_name").val());
  let json={
    food_name:$("#food_name").val()
  };
  let jsonString = JSON.stringify(json);
  console.log(jsonString)
  $(".container").stop().addClass("active");
  //contentType: "application/json; charset=utf-8",
  $.ajax({
    url: "/food/getFoodInfoByName",
    
    type: "POST",

    
    data:json,
    
    dataType:'json',
    
    success: function (data) {
      console.log(data);
      //alert("Success!")
      if(data.code == 4444){
        $("#if_like").html("无该食物信息！");
        $("#reason").html("");
      }
      else if(data.code == 200){
        if (data.data.like_or_dislike == 1) {
          $("#if_like").html("喜欢，嘿嘿！");
        }
        else if(data.data.like_or_dislike == 0){
          $("#if_like").html("一般般啦");
        }
        else if(data.data.like_or_dislike == -1){
          $("#if_like").html("不喜欢！哼！");
        }
        var reason = data.data.reason;
        $("#reason").html(reason);
      }
    },
    
    error: function (XMLHttpRequest, textStatus, error) {
    alert(error);
    
    }
    
    });
});