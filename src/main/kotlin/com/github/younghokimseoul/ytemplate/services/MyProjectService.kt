package com.github.younghokimseoul.ytemplate.services

import com.intellij.openapi.project.Project
import com.github.younghokimseoul.ytemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
