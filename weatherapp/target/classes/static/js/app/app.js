'use strict'

var demoApp = angular.module('demo', [ 'ui.bootstrap', 'demo.weatherController',
		'demo.weatherService' ]);
demoApp.constant("CONSTANTS", {
	getAllCities : "/summary/allcities",
	getPackgesByAuthor: "/summary/allcities"
});

/*
demoApp.config(function ($stateProvider, $urlRouterProvider) {
	
})*/