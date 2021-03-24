package io.conduit.api


import com.appchef.api.ConduitClient
import com.appchef.api.models.entities.UserCredentials
import com.appchef.api.models.requests.SignUpRequest
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import sun.rmi.runtime.Log
import java.util.logging.Logger
import kotlin.random.Random

class ConduitClientTest {

    private val conduitClient = ConduitClient()

    @Test
    fun `Get articles`() {
        runBlocking {
            val articles = conduitClient.api.getArticles()
            assertNotNull(articles)
        }
    }

    @Test
    fun `POST users - create users`(){ // We can pass the sentence here also
        val userCredentials = UserCredentials(
                email = "testemail${Random.nextInt(999,9999)}@test.com",
                password = "${Random.nextInt(9999,999999999)}",
                username = "random_user_${Random.nextInt(99,999)}"
        )
        runBlocking {
            val resp = conduitClient.api.signUpUsers(SignUpRequest(userCredentials))
            assertEquals(userCredentials.username,resp)
        }
    }
}