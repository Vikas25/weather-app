'use strict'

angular.module('demo.weatherService', []).factory('WeatherService',
    [ "$http", "CONSTANTS", function($http, CONSTANTS) {
        var service = {};
        service.getAllCities = function() {
            return $http.get(CONSTANTS.getAllCities);
        }
        service.getWeatherByCity = function(city) {
            var url = CONSTANTS.getWeatherByCity + city;
            return $http.get(url);
        }
        service.deleteByCity = function (id) {
            var url = CONSTANTS.deleteByCity + id;
            return $http.delete(url);
        }
        return service;
    } ]);