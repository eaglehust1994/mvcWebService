
angular.module('MetronicApp').factory('stockTransServiceRest', ['$http', '$q', 'RestEndpoint', 'Restangular', '$kWindow', function($http, $q, RestEndpoint, Restangular, $kWindow){
	 	var serviceUrl = RestEndpoint.STOCK_TRANS_SERVICE_URL;
	    var factory = {
	    		doSearchExport : doSearchExport,
	    		exportpdf:exportpdf
	    };
	 
	     return factory;
	 
	   
	    function doSearchExport(obj) {
            return Restangular.all(serviceUrl+"/doSearchExport").post(obj); 	 
        }
	    function exportpdf(obj) {
	    	var deferred = $q.defer();
              $http({
            	  url: RestEndpoint.BASE_SERVICE_URL + serviceUrl+"/exportPdf",
                    dataType: 'json',
                    method: 'POST',
                    data: obj,
                    headers: {
                        "Content-Type": "application/json"
                    },
                    responseType : 'arraybuffer',//THIS IS IMPORTANT
                }).success(function(data){
            	  deferred.resolve(data); 
              })
              .error(function(data){
            	  deferred.reject(data);
              });
             return deferred.promise;
        }
	}]);
