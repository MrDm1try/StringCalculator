node {
    stage ('Build') {
        checkout scm
        withEnv(["CLASSPATH=src/main/java/"]) {
            sh 'javac src/main/java/calculator/StringCalculator.java'
            sh 'java calculator.StringCalculator'
        }
    }

    stage ('JUnit tests') {
        checkout scm
        sh 'mvn -D test=StringCalculatorJUnitTests test'
    }

    stage ('Cucumber tests') {
        checkout scm
        sh 'mvn -D test=CucumberTest test'
    }
}