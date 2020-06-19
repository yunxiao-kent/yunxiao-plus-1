package com.alibaba.yunxiao.api;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PluginATest {

    @Test
    public void upperCase() {
        String origin = "abc";

        PluginA pluginA = new PluginA();
        pluginA.upperCase(origin);

        assertThat(pluginA.upperCase(origin), is("ABC"));
    }

    @Test
    public void concat_test() {
        String first = "YunXiao";
        String second = "@Alibaba";

        PluginA pluginA = new PluginA();
        String concat = pluginA.concat(first, second);

        assertThat(concat, is("YunXiao@Alibaba"));
    }
}