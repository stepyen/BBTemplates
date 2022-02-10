package com.babybus.plugin.${name_lower_case}

import android.content.Context
import com.babybus.base.AppModule
import com.babybus.base.constants.AppModuleName
import com.babybus.plugins.interfaces.I${name}


/**
 * date：2020-03-09
 * author：stepyen
 * description:
 */
class ${pluginName}(context: Context?) : AppModule<I${name}>(context), I${name} {
   
    override fun getModuleName(): String = AppModuleName.${name}

    override fun desc(): String = AppModuleName.${name}

    override fun getModuleImpl(): I${name} {
        return this
    }

}