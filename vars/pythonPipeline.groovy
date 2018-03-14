def call(){
	pipeline{
		agent {
			label "LINUX"
		}
		stages{
			stage("Clone"){
				git url: "https://github.com/${githubproject}"
			}
			stage("Compile"){
				steps{
					sh "ls"
				}
			}
		}
	}
}
