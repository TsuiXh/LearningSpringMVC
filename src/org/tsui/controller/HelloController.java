package org.tsui.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * HelloController是一个实现Controller接口的控制器，
 * 可以处理一个单一的请求动作
 */

public class HelloController implements Controller {
    private static final Log logger = LogFactory.getLog(HelloController.class);

    /**
     * handleRequest是Controller接口必须实现的方法，
     * 该方法的参数是对应请求的HttpServletRequest和HttpServletResponse，
     * 该方法必须返回一个包含视图名或视图名和模型的ModelAndView对象
     */

    @Override
    public ModelAndView handleRequest(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
        logger.info("HandleRequest被调用");
        //创建准备返回的ModelAndView对象，该对象包含返回的视图名、模型的名称和模型对象
        ModelAndView modelAndView = new ModelAndView();
        //添加数据模型
        modelAndView.addObject("message", "Hello World!");
        //设置逻辑视图名，视图解析器会根据改名字解析道具体的视图页面
        modelAndView.setViewName("/WEB-INF/content/welcome.jsp");
        //返回ModelAndView对象
        return modelAndView;
    }
}
