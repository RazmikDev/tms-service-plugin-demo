package com.jetbrains.examples.tms

import com.jetbrains.connections.*
import com.jetbrains.integrations.core.*
import com.jetbrains.integrations.core.settings.*
import com.jetbrains.services.*
import com.jetbrains.tests.specification.dynamic.*


class SampleTmsIntegrationService : TmsIntegrationService {
    override val id: ServiceId = SampleTmsServiceId
    override val name: String = SampleTmsServiceName
    override val settingsFactory: TmsIntegrationServiceSettingsFactory = SampleTmsIntegrationServiceSettingsFactory

    override suspend fun export(
        settings: IntegrationSettings,
        elementToExport: TmsElement,
        progressListener: ProgressListener
    ): TmsIntegrationResult {
        TODO("Not supposed to be implemented in this example")
    }

    override suspend fun getMetaDataDescription(connectionSettings: ConnectionSettings): MetadataDescription =
        SampleMetadataDescriptionProvider()

    override suspend fun import(
        settings: IntegrationSettings,
        progressListener: ProgressListener
    ): TmsIntegrationResult {
        require(settings is SampleTmsIntegrationSettings)

        TODO("Not supposed to be implemented in this example")
    }

    override suspend fun import(
        settings: IntegrationSettings,
        elementToImport: TmsElement,
        progressListener: ProgressListener
    ): TmsIntegrationResult {
        require(settings is SampleTmsIntegrationSettings)

        TODO("Not supposed to be implemented in this example")
    }

    override suspend fun loadProjects(settings: ConnectionSettings): TmsIntegrationResult {
        require(settings is SampleTmsConnectionSettings)

        // TODO: Provide the list of available TMS projects - or the default value if no projects are supported by the TMS.

        val defaultProject = SampleTmsProjectWrapper(-1, "The default project")
        return SampleTmsIntegrationResult(true, arrayListOf(defaultProject))
    }

    override suspend fun updateStatuses(settings: IntegrationSettings): AvailableTestExecutionStatusesProvider {
        require(settings is SampleTmsIntegrationSettings)
        TODO("Not supposed to be implemented in this example")
    }
}

