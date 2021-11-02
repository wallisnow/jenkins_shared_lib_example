package com.wj

class CiStage {
    String stageName
    Closure stageAction

    void runStage() {
        //print "start stage:" + stageName
        stageAction.run()
    }
}
