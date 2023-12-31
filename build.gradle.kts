/*
 * Copyright (c) 2023 Tiago do Couto.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF
 * CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE
 * OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    // Project
    idea
    // Kotlin
    alias(libs.plugins.kotlin.jvm)
    // Quality
    alias(libs.plugins.kotlinx.kover)
    alias(libs.plugins.quality.sonarqube)
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    // Runtime Dependencies
    runtimeOnly(libs.kotlin.reflect)
    // Test
    testImplementation(libs.bundles.test.junit)
}

kover {
    koverReport {
        defaults {
            this.xml { onCheck = true }
            this.html { onCheck = true }
            this.verify { onCheck = true }
        }
    }
}

java { sourceCompatibility = JavaVersion.VERSION_20 }

tasks {
    // Compile
    withType<KotlinCompile> {
        val compilerArgs: String by project
        val sourceCompatibility: String by project
        kotlinOptions {
            freeCompilerArgs += compilerArgs
            jvmTarget = sourceCompatibility
        }
    }
    // Testing
    withType<Test> {
        useJUnitPlatform()
        maxHeapSize = "2g"
    }
}
