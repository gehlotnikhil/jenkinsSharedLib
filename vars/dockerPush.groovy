def call(String Project, String ImageTag, String dockerCredID){
  withCredentials([usernamePassword(credentialsId: ${dockerCredID}, passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
      sh "docker login -u ${dockerhubuser} -p ${dockerhubpass}"
  }
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
