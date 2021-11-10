package com.github.chanwit.intellijgitops.services

import com.intellij.openapi.project.Project
import com.github.chanwit.intellijgitops.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
