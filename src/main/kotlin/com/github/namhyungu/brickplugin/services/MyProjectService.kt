package com.github.namhyungu.brickplugin.services

import com.github.namhyungu.brickplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
