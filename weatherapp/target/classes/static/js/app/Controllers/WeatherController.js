'use strict'

var module = angular.module('demo.weatherController', []);
module.controller("WeatherController", [ "$scope", "WeatherService",
    function($scope, WeatherService) {

        $scope.WeatherSummaryDto = {
            city : "London",
            country: "UK",
            weather: {
                "temperature": 282.75,
                "weatherId": 803,
                "weatherIcon": "04d",
                "name": "london",
                "timestamp": "+51002-02-18T01:20:00Z"
            }
        };

        $scope.author= null;
       $scope.searchbyauthor = function() {
           PackageService.getPackgesByAuthor($scope.author).then(function (value) {
               $scope.allPackages=value.data;
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

    } ]);
