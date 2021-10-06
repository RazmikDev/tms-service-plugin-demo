package com.jetbrains.examples.tms

import com.jetbrains.connections.*
import com.jetbrains.integrations.core.settings.*
import com.jetbrains.settings.model.*

object SampleTmsIntegrationServiceSettingsFactory : TmsIntegrationServiceSettingsFactory {
    override val connectionSettingsFields: List<FieldDescriptor> = listOf(
        urlDescriptor,
        loginDescriptor,
        passwordDescriptor
    )

    override val importSettingsFields: List<FieldDescriptor> = listOf(
        projectIdDescriptor
    )

    override fun getConnectionSettings(values: Map<FieldDescriptor, Any>): ConnectionSettings =
        SampleTmsConnectionSettings(
            values.getOrDefault(urlDescriptor, urlDescriptor.defaultValue() as String? ?: "") as String,
            values.getOrDefault(loginDescriptor, loginDescriptor.defaultValue() as String? ?: "") as String,
            *(values.getOrDefault(
                passwordDescriptor,
                passwordDescriptor.defaultValue() as String? ?: ""
            ) as String).toCharArray()
        )

    override fun getIntegrationSettings(
        connectionSettings: ConnectionSettings,
        values: Map<FieldDescriptor, Any>
    ): IntegrationSettings {

        val projectIdValue = values.getOrDefault(projectIdDescriptor, -1) as Int
        val projectId = projectIdValue.takeIf { it >= 0 }

        return SampleTmsIntegrationSettings(connectionSettings as SampleTmsConnectionSettings, projectId)
    }
}