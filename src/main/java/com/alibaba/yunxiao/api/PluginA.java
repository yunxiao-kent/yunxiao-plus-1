package com.alibaba.yunxiao.api;

import com.alibaba.yunxiao.common.Utils;

public class PluginA {
    public String upperCase(String origin) {
        return origin.toUpperCase();
    }

    public String concat(String first, String second) {
        Utils utils = new Utils();
        return utils.concat(first, second);
    }
}
