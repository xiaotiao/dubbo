package provider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import provider.HelloWorldService;

/**
 * Created by zhuzhenghuan on 2017/7/8.
 */

@Service(version="1.0.0")
public class HelloWorldServiceImpl implements HelloWorldService {

    public String hello(String name) {

        return "hello "+name;
    }
}
