/**
 * Never gonna give you up
 * Never gonna let you down
 * Never gonna run around and desert you
 * Never gonna make you cry
 * Never gonna say goodbye
 * Never gonna tell a lie and hurt you
 */

import com.soywiz.korge.gradle.KorgeGradlePlugin
import com.soywiz.korge.gradle.Orientation
import com.soywiz.korge.gradle.korge
import com.soywiz.korge.gradle.korgeVersion

buildscript {
	val korgePluginVersion: String by project

	repositories {
		mavenLocal()
		mavenCentral()
		google()
		maven { url = uri("https://plugins.gradle.org/m2/") }
	}
	dependencies {
		classpath("com.soywiz.korlibs.korge.plugins:korge-gradle-plugin:$korgePluginVersion")
	}
}

apply<KorgeGradlePlugin>()

korge {
	id = "com.soywiz.samplevideo"
	name = "SampleVideo"
	orientation = Orientation.LANDSCAPE
//	jvmMainClassName = "MainKt"

	targetDesktop()
}

repositories {
	mavenCentral()

	maven {
		url = uri("https://oss.sonatype.org/content/repositories/snapshots")
	}
}

dependencies {
	add("commonMainApi", "com.soywiz.korlibs.korvi:korvi:$korgeVersion")
//	add("commonMainApi", "com.diglol.crypto:crypto:0.1.2")
	add("macosX64MainApi", "com.diglol.crypto:crypto-macosx64:0.1.2")
	add("jvmMainApi", "com.diglol.crypto:crypto-jvm:0.1.2")
}
