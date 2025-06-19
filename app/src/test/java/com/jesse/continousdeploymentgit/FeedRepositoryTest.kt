package com.jesse.continousdeploymentgit

import com.jesse.continousdeploymentgit.data.model.FeedItemFactory
import com.jesse.continousdeploymentgit.data.model.FeedRepository
import junit.framework.Assert.assertEquals
import org.junit.Test

class FeedRepositoryTest {

    private val repository = FeedRepository()

    @Test
    fun `Feed items returned`() {
        assertEquals(FeedItemFactory.makeFeedItems(), repository.retrieveFeedItems())
    }
}