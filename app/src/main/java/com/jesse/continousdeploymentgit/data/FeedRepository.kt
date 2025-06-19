package com.jesse.continousdeploymentgit.data.model


class FeedRepository {

    fun retrieveFeedItems(): List<FeedItem> {
        return FeedItemFactory.makeFeedItems()
    }

}