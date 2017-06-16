'use strict';

/**
 * @ngdoc function
 * @name greatApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the greatApp
 */
angular.module('greatApp',[])
  .controller('MainCtrl', function ($scope, $http) {
    $http.get('http://localhost:8080/movie/getAll').then(function(response) {
      $scope.movies = response.data;
    });
  });
