
//    Kotlin
object KotlinDependencies {
    const val KOTLIN_REFLECTION =
        "org.jetbrains.kotlin:kotlin-reflect:${KotlinVersions.STANDARD_LIBRARY}"
    const val KOTLIN_STD_LIB =
        "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${KotlinVersions.STANDARD_LIBRARY}"

    // kotlin coroutine
    const val COROUTINE_CORE =
        "org.jetbrains.kotlinx:kotlinx-coroutines-core:${KotlinVersions.COROUTINE_VERSION}"
    const val COROUTINE_ANDROID =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${KotlinVersions.COROUTINE_VERSION}"
}

//LifeCycle_KTX
object LifeCycleKtxDependencies {
    const val CORE_KTX = "androidx.core:core-ktx:${LifeCycle_KTX.CORE_KTX}"
    const val LIFECYCL_EEXTENSIONS =
        "androidx.lifecycle:lifecycle-extensions:${LifeCycle_KTX.LIFECYCL_EEXTENSIONS}"
    const val Collection_KTX =
        "androidx.collection:collection-ktx:${LifeCycle_KTX.Collection_KTX}"
    const val VIEW_MODEL_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-ktx:${LifeCycle_KTX.LIFECYCLE}"
    const val VIEW_MODEL_SAVE_STATE_KTX =
        "androidx.lifecycle:lifecycle-viewmodel-savedstate:${LifeCycle_KTX.LIFECYCLE}"
    const val LIVEDATA_KTX =
        "androidx.lifecycle:lifecycle-livedata-ktx:${LifeCycle_KTX.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME =
        "androidx.lifecycle:lifecycle-runtime:${LifeCycle_KTX.LIFECYCLE}"
    const val LIFECYCLE_RUNTIME_KTX =
        "androidx.lifecycle:lifecycle-runtime-ktx:${LifeCycle_KTX.LIFECYCLE}"
    const val LIFECYCLE_COMMON_JAVA =
        "androidx.lifecycle:lifecycle-common-java8:${LifeCycle_KTX.LIFECYCLE}"
    const val REACTIVE_STREAMS =
        "androidx.lifecycle:lifecycle-reactivestreams-ktx:${LifeCycle_KTX.LIFECYCLE}"
}

// Androidx Architecture
// Androidx

object AndroidxDependencies {
    const val APPCOMPAT = "androidx.appcompat:appcompat:${AndroidXVersions.APPCOMPAT}"
    const val FRAGMENT_KTX = "androidx.fragment:fragment-ktx:${AndroidXVersions.FRAGMENT_KTX}"
    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:${AndroidXVersions.ACTIVITY_KTX}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${AndroidXVersions.CONSTRAINT_LAYOUT}"
//    const val CONSTRAINT_LAYOUT_SOLVER =
//        "androidx.constraintlayout:constraintlayout-solver:${AndroidXVersions.CONSTRAINT_LAYOUT}"
    const val CARD_VIEW = "androidx.cardview:cardview:${AndroidXVersions.CARD_VIEW}"
    const val RECYCLERVIEW =
        "androidx.recyclerview:recyclerview:${AndroidXVersions.RECYCLERVIEW}"
    const val VECTOR_DRAWABLE =
        "androidx.vectordrawable:vectordrawable:${AndroidXVersions.VECTOR_DRAWABLE}"
    const val VECTOR_DRAWABLE_ANIMATED =
        "androidx.vectordrawable:vectordrawable-animated:${AndroidXVersions.VECTOR_DRAWABLE}"
    const val VIEWPAGER2 = "androidx.viewpager2:viewpager2:${AndroidXVersions.VIEWPAGER2}"
    const val MATERIAL = "com.google.android.material:material:${AndroidXVersions.MATERIAL}"
    const val PAGING_RUNTIME = "androidx.paging:paging-runtime:${AndroidXVersions.PAGING}"
}

object NavigationDependencies {
    //    Navigation KTX
    const val NAVIGATION_RUNTIME =
        "androidx.navigation:navigation-runtime-ktx:${BuildPluginsVersions.NAVIGATION}"
    const val NAVIGATION_FRAGMENT_KTX =
        "androidx.navigation:navigation-fragment-ktx:${BuildPluginsVersions.NAVIGATION}"
    const val NAVIGATION_UI_KTX =
        "androidx.navigation:navigation-ui-ktx:${BuildPluginsVersions.NAVIGATION}"
}

// Retrofit2 & Networking
object NetworkDependencies {

    //Glide Image Loading
    const val GLIDE = "com.github.bumptech.glide:glide:${NetworkVersions.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${NetworkVersions.GLIDE}"

}

//ThirdParty
object ThirdPartyDependencies {
    const val SDP = "com.intuit.sdp:sdp-android:${ThirdPartyVersions.SDP}"
    const val SSP = "com.intuit.ssp:ssp-android:${ThirdPartyVersions.SDP}"
    const val DATE_PICKET =
        "com.wdullaer:materialdatetimepicker:${ThirdPartyVersions.DATE_PICKET}"
    const val LIB_PHONE =
        "com.googlecode.libphonenumber:libphonenumber:${ThirdPartyVersions.LIB_PHONE}"
    const val IMAGE_COMPRESSION = "id.zelory:compressor:${ThirdPartyVersions.IMAGE_COMPRESSION}"
    const val INLINE_ACTIVITY_RESULT =
        "com.github.florent37:inline-activity-result-kotlin:${ThirdPartyVersions.INLINE_ACTIVITY_RESULT}"
    const val NUMBER_FORMATER =
        "io.michaelrocks:libphonenumber-android:${ThirdPartyVersions.MICHAEL_ROCKS}"
    const val IMAGE_CROPPER =
        "com.theartofdev.edmodo:android-image-cropper:${ThirdPartyVersions.IMAGE_CROPPER}"
    const val IMAGE_PICKER = "com.github.Drjacky:ImagePicker:2.1.12"
    const val EXPANDABLE_LAYOUT = "com.github.skydoves:expandablelayout:1.0.7"
    const val TIMBER = "com.jakewharton.timber:timber:4.7.1"
    const val BOTTOM_SHEETS_CORE =
        "com.arthurivanets.bottomsheet:bottomsheets-core:${ThirdPartyVersions.BOTTOM_SHEETS_CORE}"
    const val BOTTOM_SHEETS_KTX =
        "com.arthurivanets.bottomsheet:bottomsheets-ktx:${ThirdPartyVersions.BOTTOM_SHEETS_KTX}"
    const val BOTTOM_SHEETS =
        "com.arthurivanets.bottomsheet:bottomsheets-sheets:${ThirdPartyVersions.BOTTOM_SHEETS}"
}

object HiltDaggerDependencies {
    // Hilt Dagger DI
    const val DAGGER_HILT = "com.google.dagger:hilt-android:${HiltDaggerVersion.HILT_DI}"
    const val DAGGER_COMPILER =
        "com.google.dagger:hilt-android-compiler:${HiltDaggerVersion.HILT_DI}"
    const val HILT_VM = "androidx.hilt:hilt-lifecycle-viewmodel:${HiltDaggerVersion.HILT_VM}"
    const val HILT_FRAGMENT = "androidx.hilt:hilt-navigation-fragment:${HiltDaggerVersion.HILT_VM}"
    const val HILT_COMPILER = "androidx.hilt:hilt-compiler:${HiltDaggerVersion.HILT_VM}"
}

