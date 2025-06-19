package com.jesse.continousdeploymentgit

import com.jesse.continousdeploymentgit.data.model.FeedItem
import com.jesse.continousdeploymentgit.data.model.FeedRepository
import org.junit.Test

class FeedRepositoryTest {

    private val repository = FeedRepository()

    @Test
    fun `Feed items returned`() {
        assert(listOf(FeedItem(id = "1", title = "Feed 1", text = "The Feed")) == repository.retrieveFeedItems())
    }
}