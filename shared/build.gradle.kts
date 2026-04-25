import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
    alias(libs.plugins.moko.resources)
}

kotlin {
    androidTarget {
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }
    
    listOf(
        iosArm64(),
        iosSimulatorArm64()
    ).forEach { iosTarget ->
        iosTarget.binaries.framework {
            baseName = "Shared"
            isStatic = true
            export(libs.moko.resources)
            export(libs.moko.resources.compose)
        }
    }
    
    sourceSets {
        commonMain.dependencies {
            api(libs.moko.resources)
            api(libs.moko.resources.compose)
        }
        commonTest.dependencies {
            implementation(libs.kotlin.test)
        }
    }
}

multiplatformResources {
    resourcesPackage = "com.example.myfirstkmp.shared"
    resourcesClassName = "MR"
    iosBaseLocalizationRegion = "en"
}

android {
    namespace = "com.example.myfirstkmp.shared"
    compileSdk = libs.versions.android.compileSdk.get().toInt()
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    defaultConfig {
        minSdk = libs.versions.android.minSdk.get().toInt()
    }
}

