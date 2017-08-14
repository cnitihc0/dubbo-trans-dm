package com.trans.webapp.ctrl;


import com.trans.dm.service.api.DemoService;
import com.trans.webapp.ctrl.input.IndexInput;
import org.jboss.netty.handler.codec.http.HttpResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.SysexMessage;

/**
 * @author mashaobo
 * @date 17/2/25
 * @blog http://blog.csdn.net/cnitihc0
 * @email cnitihc0@163.com
 */
@Controller
public class IndexController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/index")
    public String index(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response, IndexInput indexInput) {
        return "login.html";
    }

    @RequestMapping(value = "/index2",produces = "application/json")
    public String index2(ModelMap modelMap, @RequestBody IndexInput indexInput) {
        return "login.html";
    }


}
