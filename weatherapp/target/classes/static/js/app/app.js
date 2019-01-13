'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.weatherController',
		'demo.weatherService' ]);
demoApp.constant("CONSTANTS", {
	getAllCities : "/summary/allcities",
	getWeatherByCity: "/api/weather/now/null/",
	deleteByCity:"/api/weather/city/"
});

/*
demoApp.config(function ($stateProvider, $urlRouterProvider) {
	
})*/