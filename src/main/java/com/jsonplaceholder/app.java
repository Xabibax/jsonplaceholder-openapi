package com.jsonplaceholder;

import org.openapitools.client.api.PostsApi;

import java.util.stream.Collectors;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        PostsApi l = new PostsApi();
        l.getApiClient().setBasePath("https://jsonplaceholder.typicode.com/");
        System.out.println(l.getPosts().collectList().block().toString());
    }
}