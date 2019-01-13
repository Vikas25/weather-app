'use strict'

var module = angular.module('demo.weatherController', []);
module.controller("WeatherController", [ "$scope", "WeatherService",
    function($scope, WeatherService) {
        $scope.city = null;
        $scope.id = 0;
        $scope.cities = [];
       $scope.searchbycity = function() {
           WeatherService.getWeatherByCity($scope.city).then(function (value) {
               $scope.city = value.data;
               $scope.cities.unshift($scope.city);
               $scope.city= null;
               console.log(value.data);
           }, function (reason) {
               console.log("error occured");
           }, function (value) {
               console.log("no callback");
           });
       }

        $scope.$watch('$viewContentLoaded', function() {
            WeatherService.getAllCities().then(function(value) {
                $scope.allCities= value.data.data;
            }, function(reason) {
                console.log("error occured");
            }, function(value) {
                console.log("no callback");
            });
        });


       $scope.deleteCityById = function (id) {
           console.log(id);
           WeatherService.deleteByCity(id);
           location.reload();
       }

    } ]);
