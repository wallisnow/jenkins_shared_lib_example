package com.wj


import org.apache.commons.lang3.StringUtils

@Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.12.0')
class CiStage {
    String stageName
    Closure stageAction

    void runStage() {
        //print "start stage:" + stageName
        stageAction.run()
        echo capitalize()
    }

    static String capitalize() {
        return StringUtils.capitalize("abc")
    }
}
