package com.jetbrains.examples.tms

import com.intellij.openapi.project.*
import com.jetbrains.integrations.core.*
import com.jetbrains.services.*
import com.jetbrains.test.ide.tms.data.*
import javax.swing.*

internal class SampleTmsIntegrationServiceFactory : TmsIntegrationServiceFactory {
    override val description: String? = null
    override val icon: Icon? = null
    override val id: ServiceId = SampleTmsServiceId
    override val name: String = SampleTmsServiceName

    override fun createIntegrationService(project: Project?): TmsIntegrationService =
        SampleTmsIntegrationService()
}