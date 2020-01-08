node {
    stage ('Build') {
        checkout scm
        withEnv(["CLASSPATH=src/"]) {
            sh 'javac src/main/java/calculator/StringCalculator.java'
            sh 'java main.java.calculator.StringCalculator'
        }
    }

    stage ('JUnit tests') {
        checkout scm
        sh 'mvn -D test=StringCalculatorTest test'
    }
}