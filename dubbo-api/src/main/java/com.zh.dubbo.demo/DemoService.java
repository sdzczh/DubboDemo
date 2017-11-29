package com.zh.dubbo.demo;

import java.util.List;

public interface DemoService {
    List<String> getPermissions(Long id);
}