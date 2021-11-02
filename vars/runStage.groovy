import com.wj.CiStage
import com.wj.Util

def call() {

    Closure myClosure = {
        node {
            script {
                sh '''
                   echo 'call myClosure ... ...'
                '''
            }
            echo Util.capitalize()
        }
    }

    def stage = new CiStage('stageName': 'stage1', 'stageAction': myClosure)

    stage.runStage()
}