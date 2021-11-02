package com.wj

class CiStage {
    String stageName
    Closure stageAction

    runStage() {
        print "start stage:" + stageName
        stageAction.run()
    }
}
