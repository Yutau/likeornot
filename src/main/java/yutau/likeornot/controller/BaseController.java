package yutau.likeornot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import yutau.likeornot.model.Result;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class BaseController {

    @Autowired
    public Result result;

    @ModelAttribute
    public void common(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getSession().getId());
        Map<String, String> parameterMap =  new HashMap<>();
        for(String param : Collections.list(request.getParameterNames())) {
            if (request.getParameter(param) != null) {
                parameterMap.put(param, request.getParameter(param));
            }
        }
        //log.info("<" + request.getServletPath() + "> : " + "\tParameters: " + parameterMap.toString());
    }
}