package com.wj

import com.cloudbees.groovy.cps.NonCPS
import org.apache.commons.lang3.StringUtils

@Grab(group='org.apache.commons', module='commons-lang3', version='3.12.0')
class CiStage {
    String stageName
    Closure stageAction

    void runStage() {
        //print "start stage:" + stageName
        stageAction.run()
        capitalize()
    }
    @NonCPS
    void capitalize(){
        println(StringUtils.capitalize("abc"))
    }
}
