package com.severgnini.marcelo.buildsrc

object BuildPlugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val androidLibrary = "com.android.library"
    const val androidGradlePlugin = "com.android.tools.build:gradle:_"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:_"
}

object AndroidSdk {
    const val MIN_SDK_VERSION = 23

    @Suppress("MemberVisibilityCanBePrivate")
    const val COMPILE_SDK_VERSION = 30
    const val TARGET_SDK_VERSION = COMPILE_SDK_VERSION

    object Release {
        const val APP_VERSION_NAME = "0.0.1-SNAPSHOT"
        const val APP_VERSION_CODE = 1
    }
}
