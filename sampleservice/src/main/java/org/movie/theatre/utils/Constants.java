/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.movie.theatre.utils;

public class Constants {

    public static class Movie {
        public static final String CONTROLLER = "/movie";
        public static final String GET_MOVIES = "/getAll";
        public static final String GET_MOVIE = "/get";
    }

    public static class Theatre{
        public static final String THEATRECONTROLLER = "/theatre";
        public static final String GET_THEATRES = "/getAll";
        public static final String GET_THEATRE = "/get";
    }

    public static class User{
        public static final String USERCONTROLLER = "/user";
        public static final String ADD_USER = "/add";
        public static final String GET_USERS = "/getAll";
        public static final String GET_USER = "/validate";
    }

}
