package com.ycj.webapp.internationalization.api;


import com.ycj.webapp.internationalization.pojo.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Frank
 * @email 1320259466@qq.com
 * @date: 2020/2/22
 * @time: 10:45
 * @fuction: about the role of class.
 */
@RestController
@RequestMapping("/api")
public class UserAPI {
    @Autowired
    private MessageSource messageSource;

    @GetMapping("/test")
    public ResultResponse testInfo() {

        return new ResultResponse(messageSource.getMessage("user.register.err.username.repeat", null, LocaleContextHolder.getLocale()),null,0);
    }
}
