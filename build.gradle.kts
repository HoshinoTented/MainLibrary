import org.gradle.api.internal.HasConvention
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.gradle.plugin.KotlinSourceSet

var kotlinVersion : String by extra
kotlinVersion = "1.2.40"

group = "com.github.HoshinoTented"
version = "1.0.8-04"

plugins {
	kotlin("jvm") version "1.2.40"
}

val SourceSet.kotlin get() = (this as HasConvention).convention.getPlugin(KotlinSourceSet::class.java).kotlin

val sourceSets = java.sourceSets

allprojects {
	tasks.withType<KotlinCompile> {
		kotlinOptions.jvmTarget = "1.8"
	}

	val sourcesJar = task<Jar>("sourcesJar") {
		from(sourceSets.getByName("main").kotlin.srcDirs)
		classifier = "sources"
    }

    artifacts {

	}
}