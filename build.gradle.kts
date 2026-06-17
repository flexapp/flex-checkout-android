plugins {
    `maven-publish`
}

publishing {
    publications {
        create<MavenPublication>("release") {
            groupId = "com.getflex.checkout"
            artifactId = "flex-checkout-android"
            version = "1.5.0"

            artifact(file("libs/flex-checkout-android-release.aar")) {
                extension = "aar"
            }

            pom {
                packaging = "aar"
                withXml {
                    val deps = asNode().appendNode("dependencies")
                    fun dep(g: String, a: String, v: String) {
                        deps.appendNode("dependency").also {
                            it.appendNode("groupId", g)
                            it.appendNode("artifactId", a)
                            it.appendNode("version", v)
                            it.appendNode("scope", "runtime")
                        }
                    }
                    dep("com.google.android.material", "material", "1.11.0")
                    dep("androidx.appcompat", "appcompat", "1.6.1")
                    dep("androidx.core", "core-ktx", "1.12.0")
                    dep("androidx.lifecycle", "lifecycle-runtime-ktx", "2.7.0")
                    dep("org.jetbrains.kotlinx", "kotlinx-coroutines-core", "1.7.3")
                    dep("org.jetbrains.kotlinx", "kotlinx-coroutines-android", "1.7.3")
                    dep("org.jetbrains.kotlinx", "kotlinx-serialization-json", "1.6.2")
                }
            }
        }
    }
}
