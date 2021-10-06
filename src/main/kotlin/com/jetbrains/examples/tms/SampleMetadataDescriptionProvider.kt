package com.jetbrains.examples.tms

import com.jetbrains.integrations.core.*
import com.jetbrains.tests.specification.*

class SampleMetadataDescriptionProvider : MetadataDescription {

    /**
     * Provides a unique numeric ID for the TMS element. This number usually corresponds with the ID in the URL of the tms element.
     */
    override fun getNumericTmsId(metadataProvider: MetadataProvider): Int? {
        TODO("Not yet implemented \"getNumericTmsId\"")
    }

    override fun getPreconditions(metadataProvider: MetadataProvider): String? {
        // TODO: Implement if needed
        return null
    }

    override fun getExpectedResult(metadataProvider: MetadataProvider): String? {
        // TODO: Implement if needed
        return null
    }

    override fun getTmsHiddenMetadataKeys(): Set<String> {
        // TODO: Implement if needed
        return emptySet()
    }

    /**
     * Describes whether the provided [metadataName] corresponds to the custom test case field added on the TMS side.
     */
    override fun isCaseField(metadataName: String): Boolean {
        // TODO: Implement if needed
        return false
    }

    /**
     * Returns a user-friendly name for the metadata key.
     */
    override fun getCaseFieldLabel(metadataName: String): String {
        // TODO: Implement if needed
        return metadataName
    }
}