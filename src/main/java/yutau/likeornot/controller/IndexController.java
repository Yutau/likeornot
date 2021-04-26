package yutau.likeornot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

/**
 * 主页转发静态界面
 */
@Controller(value = "/")
public class IndexController {
    @RequestMapping("/")
    @ApiIgnore
    public String index(Model model){
        model.addAttribute("title", "LikeOrNot");
        return "likeornot.html";
    }
}
