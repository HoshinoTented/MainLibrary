plugins {
	kotlin("jvm")
}

dependencies {
	implementation("com.google.code.gson:gson:2.8.2")
	implementation("org.json:json:20180130")
}

//val generatorsPackage = 'top.tented.utils.generators'
//
//sourceSets {
//	main {
//		kotlin {
//			srcDirs += 'src/main/gen'
//		}
//	}
//}
//
//task genShortDiv (type : JavaExec) {
//	classpath = sourceSets.main.runtimeClasspath
//	main "${generatorsPackage}.ShortDivGenerator"
//	println("Generated ShortDivGenerator")
//}
//
//task genAll {
//	dependsOn(genShortDiv)
//}