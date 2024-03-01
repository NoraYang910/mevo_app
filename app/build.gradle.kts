plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.mevo"
    compileSdk = 34

    buildFeatures {
        buildConfig = true
    }
    defaultConfig {
        applicationId = "com.example.mevo"
        minSdk = 30
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
            buildConfigField("String", "MY_KEY", (project.findProperty("MAPBOX_DOWNLOADS_TOKEN") ?: "\"default_value\"").toString())
        }
        debug {
            buildConfigField("String", "MY_KEY", (project.findProperty("MAPBOX_DOWNLOADS_TOKEN") ?: "\"default_value\"").toString())
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation("com.mapbox.mapboxsdk:mapbox-android-sdk:5.1.3@aar")
}