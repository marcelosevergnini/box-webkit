// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    val kotlinVersion = "1.5.0"
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath(com.severgnini.marcelo.buildsrc.BuildPlugins.androidGradlePlugin)
        classpath(com.severgnini.marcelo.buildsrc.BuildPlugins.kotlinGradlePlugin)
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()

//        addGithubRepo("WebKit", "marcelosevergnini/boxwebkit")
    }
}


val localProperties = java.util.Properties()
val propertiesFile = rootProject.file("local.properties")
if (propertiesFile.exists()) {
    localProperties.load(java.io.FileInputStream(rootProject.file("local.properties")))
}

fun RepositoryHandler.addGithubRepo(name: String, identifier: String) {
    maven {
        this.name = name
        this.url = uri("https://maven.pkg.github.com/$identifier")
        credentials {
            username = localProperties["github.user"] as String? ?: System.getenv("GH_USER")
            password = localProperties["github.access_token"] as String?
                ?: System.getenv("GH_ACCESS_TOKEN")
        }
    }
}