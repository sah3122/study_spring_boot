package me.study.springbootautowired;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Single {

    @Autowired
    //private Proto proto;
    private ObjectProvider<Proto> proto; //scope 이 prototype일시 코드상에서 해결하는 방법

    public Proto getProto() {
        return proto.getIfAvailable();
    }
}
