import com.wj.CiStage

def call() {

    Closure myClosure = {
        node {
            script {
                sh '''
                   echo 'call myClosure ... ...'
                '''
            }
        }
    }

    def stage = new CiStage('stageName': 'stage1', 'stageAction': myClosure)

    stage.runStage()
}