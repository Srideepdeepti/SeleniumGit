pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
         }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/Srideepdeepti/SeleniumGit.git'

                
                
                 
                 }
              } 
        stage('Test') {
            steps {
                                
                // To run Maven on a Windows agent, use
                 bat "mvn test"
                 
               }

         
             }
             
             stage('Email') {
            steps {
                                
                //sending Email
                emailext body: 'Build is passed.', subject: 'Build Status', to: 'srideep.deepti@gmail.com'
                 
               }

         
             }
    }
}
