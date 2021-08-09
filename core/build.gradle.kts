plugins {
    id(BuildPluginsConfig.androidLibrary)
    kotlin(BuildPluginsConfig.kotlinAndroid)
    kotlin(BuildPluginsConfig.kotlinKapt)
}

android {
    compileSdk  = (BuildAndroidConfig.COMPILE_SDK_VERSION)

    defaultConfig {
        minSdk  = BuildAndroidConfig.MIN_SDK_VERSION
        targetSdk  = BuildAndroidConfig.TARGET_SDK_VERSION

        testInstrumentationRunner  = BuildAndroidConfig.androidTestInstrumentation
    }

    buildTypes {
        release {
            isMinifyEnabled  = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    viewBinding {
        android.buildFeatures.viewBinding = true
    }
    buildFeatures {
        this.dataBinding = true
    }

}

dependencies {

    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(DependenciesManager.kotlinImplementation)
    implementation(DependenciesManager.androidxImplementation)


    implementation(ThirdPartyDependencies.SDP)
    implementation(ThirdPartyDependencies.SSP)
    implementation(ThirdPartyDependencies.LIB_PHONE)
    implementation(ThirdPartyDependencies.TIMBER)
    implementation("androidx.navigation:navigation-runtime-ktx:2.3.5")
    implementation("androidx.navigation:navigation-fragment-ktx:2.3.5")
}