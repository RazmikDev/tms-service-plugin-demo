package com.github.razmikdev.tmsserviceplugindemo.services

import com.intellij.openapi.project.Project
import com.github.razmikdev.tmsserviceplugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
