package com.arun.oauth2.demo.albumsms.controller;

import com.arun.oauth2.demo.albumsms.dto.AlbumDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value ="/albums")
public class AlbumsController {

    @GetMapping
    public List<AlbumDetails> getAllAlbums(){
        AlbumDetails albumDetails = new AlbumDetails();
        albumDetails.setAlbumId("1345");
        albumDetails.setUserId("user-1234");
        albumDetails.setTitle("hello");
        albumDetails.setDescription("random desc");
        albumDetails.setAlbumUrl("random url");

        return Collections.singletonList(albumDetails);
    }
}
