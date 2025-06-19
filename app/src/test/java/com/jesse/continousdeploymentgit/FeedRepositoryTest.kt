package com.jesse.continousdeploymentgit

import com.jesse.continousdeploymentgit.data.model.FeedItemFactory
import com.jesse.continousdeploymentgit.data.model.FeedRepository
import org.junit.Test

class FeedRepositoryTest {

    private val repository = FeedRepository()

    @Test
    fun `Feed items returned`() {
        assert(FeedItemFactory.makeFeedItems() == repository.retrieveFeedItems())
    }
}