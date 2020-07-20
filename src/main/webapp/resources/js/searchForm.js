/*******************
 search form 스크립트 
 테이블 동작 및 검색 조건 
*******************/

$(document).ready(function() {
	$('#searchType').val(type);
	
	switch (type) {
	case "0":
		$('#inputGroup').hide();
		break;
	case "1":
		$('#inputGroup').show();
		$('#dongName').show();
		$('#dongName').val(keyword);
		$('#dongSubName').hide();
		$('#address').hide();
		$('#pole_num').hide();
		break;
	case "2":
		$('#inputGroup').show();
		$('#dongName').hide();
		$('#dongSubName').show();
		$('#dongSubName').val(keyword);
		$('#address').hide();
		$('#pole_num').hide();
		break;
	case "3":
		$('#inputGroup').show();
		$('#dongName').hide();
		$('#dongSubName').hide();
		$('#address').show();
		$('#address').val(keyword);
		$('#pole_num').hide();
		break;
	case "4":
		$('#inputGroup').show();
		$('#dongName').hide();
		$('#dongSubName').hide();
		$('#address').hide();
		$('#pole_num').show();
		$('#pole_num').val(keyword);
		break;
	}
	
	$('#searchType').change(function() {
		var key = $('#searchType').val();
		switch (key) {
		case "0":
			$('#inputGroup').hide();
			self.location = "./list";
			break;
		case "1":
			$('#inputGroup').show();
			$('#dongName').show();
			$('#dongSubName').hide();
			$('#address').hide();
			$('#pole_num').hide();
			break;
		case "2":
			$('#inputGroup').show();
			$('#dongName').hide();
			$('#dongSubName').show();
			$('#address').hide();
			$('#pole_num').hide();
			break;
		case "3":
			$('#inputGroup').show();
			$('#dongName').hide();
			$('#dongSubName').hide();
			$('#address').show();
			$('#pole_num').hide();
			break;
		case "4":
			$('#inputGroup').show();
			$('#dongName').hide();
			$('#dongSubName').hide();
			$('#address').hide();
			$('#pole_num').show();
			break;
		}
	});
		
	
	$('#searchBtn').click(function() {
		var key = $('#searchType').val();
		switch (key) {
		case "1":
			console.log($('#dongName').val());
			self.location = "./list?page=1&searchType=" + $('#searchType').val() +"&keyword=" + $('#dongName').val();
			break;
		case "2":
			console.log($('#dongSubName').val());
			self.location = "./list?page=1&searchType=" + $('#searchType').val() +"&keyword=" + $('#dongSubName').val();
			break;
		case "3":
			console.log($('#address').val());
			self.location = "./list?page=1&searchType=" + $('#searchType').val() +"&keyword=" + $('#address').val();
			break;
		case "4":
			console.log($('#pole_num').val());
			self.location = "./list?page=1&searchType=" + $('#searchType').val() +"&keyword=" + $('#pole_num').val();
			break;
		}
		
	});
	
	$('#lampTable tbody tr').hover(function() {
		$(this).css("background-color", "#ededed");
		$(this).css("cursor", "pointer");		
	}, function() {
		$(this).css("background-color", "");
	});
	
});