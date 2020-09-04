app.controller("playerController",function ($scope,$controller,playerService) {
    $controller("baseController",{$scope:$scope});
    $scope.findAll = function () {
        playerService.findAll().success(function (response) {
            $scope.list = response;
        })
    }
    $scope.delete = function () {
        playerService.delete($scope.ids).success(function (response) {
            if (response.flag){
                $scope.findAll();
            }else {
                $scope.findAll();
            }
        })
    }
    $scope.chooseAll = function () {
        var checkbox = $(":checkbox:gt(0)");
        for (var i =0;i<checkbox.length;i++){
            checkbox[i].checked = true;
            alert(checkbox[i].value);
        }
    }
    $scope.findSchool = function () {
        playerService.findSchool().success(function (response) {
            $scope.slist = response;
        })
    }
    $scope.findTeam = function () {
        playerService.findTeam().success(function (response) {
            $scope.tlist = response;
        })
    }
    $scope.save = function () {
        playerService.save($scope.entity).success(function (response) {
            if (response.flag){
                $scope.findAll();
            }else {
                $scope.findAll();
            }
        })
    }
})