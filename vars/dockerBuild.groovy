def call(String DockerHubUser,String ProjectName, String ImageTag,String Location){
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ${Location}"
}
