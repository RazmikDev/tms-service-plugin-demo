package com.jetbrains.examples.tms

import com.jetbrains.integrations.core.*
import com.jetbrains.tests.specification.*
import com.jetbrains.tests.specification.impl.*

class SampleTmsProjectWrapper(override val elementID: Int = -1, override val name: String) : TmsProject {

    // A unique ID within all TMS elements. Not obligated to be based on elementID
    override val id: TsfId = SimpleTsfId(elementID.toString())

    override val issues: Set<String> = emptySet()
    override val metadata: Map<String, String?> = emptyMap()

    override val projectId: Int = elementID

    override val tags: Set<Tag> = emptySet()

    override fun id(id: String): Unit = TODO("Not supposed to be implemented in this example")
    override fun copyFrom(other: MetadataProvider): Unit = TODO("Not supposed to be implemented in this example")
    override fun issue(vararg issues: String): Boolean = TODO("Not supposed to be implemented in this example")
    override fun tag(vararg tags: Tag): Boolean = TODO("Not supposed to be implemented in this example")

    override fun meta(vararg metadata: Pair<String, String?>): Unit =
        TODO("Not supposed to be implemented in this example")

    override fun meta(metadata: Pair<MetadataKey<*>, String?>): Unit =
        TODO("Not supposed to be implemented in this example")

}