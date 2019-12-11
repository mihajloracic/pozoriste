var app = angular.module('myApp', []);
app.controller('myCtrl', function($scope, $http) {
    console.log('hello');
    $http.get("plays/")
        .then(function(response) {
            // First function handles success
            $scope.plays = []
            $scope.plays = response.data;
            console.log($scope.plays)
        }, function(response) {
            // Second function handles error
            $scope.content = "Something went wrong";
        });
});