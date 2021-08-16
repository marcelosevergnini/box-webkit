plugins {
    id(com.severgnini.marcelo.buildsrc.BuildPlugins.androidApplication)
    id(com.severgnini.marcelo.buildsrc.BuildPlugins.kotlinAndroid)
}

android {
    compileSdkVersion(com.severgnini.marcelo.buildsrc.AndroidSdk.COMPILE_SDK_VERSION)

    defaultConfig.apply {
        minSdkVersion(com.severgnini.marcelo.buildsrc.AndroidSdk.MIN_SDK_VERSION)
        targetSdkVersion(com.severgnini.marcelo.buildsrc.AndroidSdk.TARGET_SDK_VERSION)
    }

    compileOptions.apply {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_1_8.toString()
    }

    buildFeatures {
        viewBinding = true
    }

}

dependencies {

//    implementation(Kotlin.stdlib)
    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.1")
    implementation("com.google.android.material:material:1.4.0")
    testImplementation("junit:junit:4.+")

    implementation(project(":webkit"))
}