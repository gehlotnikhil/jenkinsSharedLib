def call(String DOCKER_USER, String DOCKER_PASS, String Project, String ImageTag){
  sh "docker login -u ${DOCKER_USER} -p ${DOCKER_PASS}"
  sh "docker push ${DOCKER_USER}/${Project}:${ImageTag}"
}
