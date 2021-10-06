package com.jetbrains.examples.tms

import com.jetbrains.*
import com.jetbrains.connections.*
import com.jetbrains.services.*
import java.net.*

class SampleTmsConnectionSettings private constructor(
    override val url: String,
    val user: String,
    private val encodedPassword: String
) : ConnectionSettings {
    override val serviceId: ServiceId = SampleTmsServiceId

    constructor(url: String, user: String, vararg password: Char) : this(
        url, user, String(password).base64Encode()
    )

    val password: String
        get() = encodedPassword.base64Decode()

    /**
     * @return the host part of the URL.
     */
    override fun toString(): String = try {
        val host = URL(url).host
        when {
            host.isEmpty() -> url
            else -> host
        }
    } catch (mfe: MalformedURLException) {
        url
    }
}
