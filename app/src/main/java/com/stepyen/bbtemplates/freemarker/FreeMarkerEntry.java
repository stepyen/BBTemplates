package com.stepyen.bbtemplates.freemarker;

import com.stepyen.bbtemplates.freemarker.manager.APPluginManager;
import com.stepyen.bbtemplates.freemarker.manager.BBPluginManager;

/**
 * date：2020-03-19
 * author：stepyen
 * description：FreeMarker 入口
 *
 * BB：babybus 工程
 * AP：打包 工程
 *
 * 使用步骤：
 * 1、修改 {@link com.stepyen.bbtemplates.freemarker.common.Constant} 下 模板地址 和 文件输出路径
 * 2、修改 FreeMarkerEntry 下 插件名称 pluginName
 * 3、开始执行
 *
 */
public class FreeMarkerEntry {


    public static void main(String[] args) {

        String pluginName = "CharactersFastLogin";

        // 创建 BB module
        new BBPluginManager().create(pluginName);

        // 创建 AP module
        new APPluginManager().create(pluginName);

    }
}
