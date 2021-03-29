buildscript {
    repositories {
        gradlePluginPortal()
        jcenter()
        google()
        mavenCentral()

        maven(url = "http://oss.jfrog.org/artifactory/oss-snapshot-local") // Add
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.30") // Fix
        classpath("com.android.tools.build:gradle:4.0.1")
        classpath("io.realm.kotlin:plugin-gradle:0.0.1-SNAPSHOT") // Add
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven(url = "http://oss.jfrog.org/artifactory/oss-snapshot-local") // Add
    }
}