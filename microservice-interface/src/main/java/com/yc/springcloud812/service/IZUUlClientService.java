package com.yc.springcloud812.service;


import com.yc.springcloud812.bean.Book;
import com.yc.springcloud812.bean.User;
import com.yc.springcloud812.config.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

/**
 * feign 访问zuul的接口
 */
@FeignClient(name="MICROSERVICE-ZUUL-GATEWAY",configuration = FeignClientConfig.class,fallbackFactory = IZuulClientServiceCallbackFactory.class)
public interface IZUUlClientService {

    @RequestMapping("/yc-api/product-proxy/book/{id}")
    public Book getBook(@PathVariable("id")long id);

    @RequestMapping("/yc-api/product-proxy/book/findAll")
    public List<Book> findAllBook();


    @RequestMapping("/yc-api/user-proxy/user/get/{name}")
    public User getUser(@PathVariable("name")String name);

    @RequestMapping("/yc-api/user2-proxy/user/get/{name}")
    public User getUser2(@PathVariable("name")String name);
}
