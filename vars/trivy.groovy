def call(){
  sh "trivy fs . -o new.json"
}
