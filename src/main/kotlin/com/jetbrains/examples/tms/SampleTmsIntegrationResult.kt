package com.jetbrains.examples.tms

import com.jetbrains.integrations.core.*

class SampleTmsIntegrationResult(
    override val isCanceled: Boolean = false,
    override val syncedTmsElements: List<TmsElement>
) : TmsIntegrationResult
