package com.arun.oauth2.demo.albumsms.dto;

import java.util.Objects;

public class AlbumDetails {
    private String albumId;
    private String userId;
    private String title;
    private String description;
    private String albumUrl;

    public AlbumDetails() {
    }

    public AlbumDetails(String albumId, String userId, String title, String description, String albumUrl) {
        this.albumId = albumId;
        this.userId = userId;
        this.title = title;
        this.description = description;
        this.albumUrl = albumUrl;
    }

    public String getAlbumId() {
        return albumId;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public void setAlbumUrl(String albumUrl) {
        this.albumUrl = albumUrl;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlbumDetails that = (AlbumDetails) o;
        return Objects.equals(albumId, that.albumId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(title, that.title) &&
                Objects.equals(description, that.description) &&
                Objects.equals(albumUrl, that.albumUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, userId, title, description, albumUrl);
    }
}
