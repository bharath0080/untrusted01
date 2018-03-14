/*
def call(String githubproject){
	pipeline{
		agent {
			label "LINUX"
		}
		stages{
			stage("Clone"){
				steps{
					git url: "https://github.com/${githubproject}"
				}
			}
			stage("Compile"){
				steps{
					sh "ls"
				}
			}
		}
	}
}
*/
def call(body){
  def config = [:]
  body.resloveStrategy = Closure.DELEGATE_FIRST
  body.delegate = config
  body()
  pipeline{
  	agent{
		label "LINUX"
	}
	stages{
		stage("Clone"){
			steps{
				git url: "https://github.com/${config.githubproject}"
			}
		}
		stage("Compile"){
			steps{
				sh "ls"
			}
		}
	}
}
}
