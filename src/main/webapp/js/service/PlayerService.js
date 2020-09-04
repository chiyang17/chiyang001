app.service("playerService",function ($http) {
    this.findAll = function () {
        return $http.get("../getAll.do");
    }
    this.delete = function (ids) {
        return $http.post("../upDid.do",ids);
    }
    this.findSchool = function () {
        return $http.get("../getPlay.do");
    }
    this.findTeam = function () {
        return $http.get("../getTe.do");
    }
    this.save = function (entity) {
        return $http.post("../save.do",entity);
    }
})