package com.wj

class CiStage {
    String stageName
    Closure stageAction

    void runStage() {
        stageAction.run()
    }
}
