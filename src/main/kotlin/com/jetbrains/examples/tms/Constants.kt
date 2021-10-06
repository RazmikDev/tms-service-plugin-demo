package com.jetbrains.examples.tms

import com.jetbrains.services.*
import com.jetbrains.settings.model.*


val SampleTmsServiceId = ServiceId("CUSTOM_TMS_EXAMPLE")
const val SampleTmsServiceName = "Custom TMS Example"


private const val GROUP = "SampleTMS"

// NOTE: Do not change the `title` parameter
val urlDescriptor = BasicFieldDescriptor(GROUP, "URL", "The URL of your TMS service", FieldDescriptorType.String)


// NOTE: Do not change the `title` parameter
val loginDescriptor = BasicFieldDescriptor(GROUP, "login", "Your TMS user name", FieldDescriptorType.String)

// NOTE: Do not change the `title` parameter
val passwordDescriptor =
    BasicFieldDescriptor(GROUP, "password", "Your TMS password", FieldDescriptorType.String, isMasked = true)

// NOTE: Do not change the `title` parameter
val projectIdDescriptor = BasicFieldDescriptor(GROUP, "Project ID", "", FieldDescriptorType.Integer)