'use strict'

angular.module('demo.weatherService', []).factory('WeatherService',
    [ "$http", "CONSTANTS", function($http, CONSTANTS) {
        var service = {};
        service.getAllCities = function() {
            return $http.get(CONSTANTS.getAllCities);
        }
        service.getPackgesByAuthor = function(author) {
            var url = CONSTANTS.getPackgesByAuthor + author;
            return $http.get(url);
        }
        return service;
    } ]);