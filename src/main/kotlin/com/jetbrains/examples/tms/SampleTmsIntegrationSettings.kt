package com.jetbrains.examples.tms

import com.jetbrains.integrations.core.settings.*


/**
 * Provides the complete settings needed for the TMS service integration.
 * Includes the [connection] settings (url / login / pass) and additional options that defines the configuration of the integrations (e.g. project to sync, mode, etc.)
 */
class SampleTmsIntegrationSettings(override val connection: SampleTmsConnectionSettings, @Suppress("unused") val projectId: Int?) :
    IntegrationSettings
