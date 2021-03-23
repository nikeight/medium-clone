package io.conduit.api


import com.appchef.api.ConduitClient
import org.junit.Assert.assertNotNull
import org.junit.Test

class ConduitClientTest {

    private val conduitClient = ConduitClient()

    @Test
    fun `Get articles`() {
        val articles = conduitClient.api.getArticles().execute()
        assertNotNull(articles.body()?.articles)
    }
}