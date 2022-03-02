package org.openmbee.mms5

import io.ktor.http.*
import kotlin.test.*
import io.ktor.server.testing.*
import org.openmbee.mms5.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() {
        withTestApplication({ }) {
            handleRequest(HttpMethod.Get, "/").apply {
                assertEquals(HttpStatusCode.OK, response.status())
                assertEquals("Hello World!", response.content)
            }
        }
    }
}
