package com.jetbrains.examples.services

import com.intellij.openapi.project.Project
import com.jetbrains.examples.*

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
