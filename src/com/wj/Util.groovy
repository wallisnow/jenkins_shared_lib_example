package com.wj

import org.apache.commons.lang3.StringUtils

@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.12.0')
class Util {
    static String capitalize() {
        return StringUtils.capitalize("abc")
    }
}
