/********************
 list page kakao map api
********************/

$(document).ready(function() {
	
	var markers = [];
	var mapContainer = document.getElementById('map'),
	mapOption = {
		center : new kakao.maps.LatLng(lampList[0].latitude, lampList[0].longitude),
		level: 6
	};
	
	var map = new kakao.maps.Map(mapContainer, mapOption);
	var markerImage = new kakao.maps.MarkerImage('resources/images/ic_ledSet4.png', new kakao.maps.Size(20, 20));
	for(var i = 0; i < lampList.length; i++){
		markers[i] = new kakao.maps.Marker({
			map: map,
			image: markerImage,
			position: new kakao.maps.LatLng(lampList[i].latitude, lampList[i].longitude)
		});
		
		markerEvent(i);
	}
	
	let content = "<img src='resources/images/ic_select.png'  style='margin-top: -30px; margin-left: -8px;'/>"
	let customOverlay = new kakao.maps.CustomOverlay();
	let dong_name;
	let dong_sub_name;
	let management_num;
	

	$('#lampTable tbody tr').click(function() {
		customOverlay.setMap(null);
		$('#lampTable td').css("background-color", "");
		$(this).children().css("background-color", "#fffa90");
		var lampAdd = $(this).children().text();
		for(var i = 0; i < lampList.length; i++){
			if(lampAdd ==  lampList[i].management_num + lampList[i].dongInfo.dong_name + lampList[i].dongSubInfo.dong_sub_name){
				map.setCenter(new kakao.maps.LatLng(lampList[i].latitude, lampList[i].longitude));
				customOverlay = new kakao.maps.CustomOverlay({
					position: new kakao.maps.LatLng(lampList[i].latitude, lampList[i].longitude),
					content: content
				});
				customOverlay.setMap(map);
				
				dong_name = lampList[i].dongInfo.dong_name;
				dong_sub_name = lampList[i].dongSubInfo.dong_sub_name;
				management_num = lampList[i].management_num;
				
				$('#management_num').text(lampList[i].management_num);
				$('#fullAddr').text(lampList[i].dongInfo.dong_name + " " + lampList[i].dongSubInfo.dong_sub_name + " " + lampList[i].install_street_address);
				$('#tel_pole_num').text(lampList[i].telegraph_pole_num);
				$('#lat').text(lampList[i].latitude);
				$('#lon').text(lampList[i].longitude);
				$('#type').text(lampList[i].pole_type);
				$('#watt').text(lampList[i].wattage);
				$('#kr_num').text(lampList[i].kepco_num);
				
				if(lampList[i].thumbnail_photo2) $('#img1').attr('src', '/img/' + lampList[i].thumbnail_photo2);
				if(lampList[i].thumbnail_photo3) $('#img2').attr('src', '/img/' + lampList[i].thumbnail_photo3);
				if(lampList[i].thumbnail_photo4) $('#img3').attr('src', '/img/' + lampList[i].thumbnail_photo4);

				break;
			}
		}
	});
	
	$('#lampTable tbody tr:first').trigger("click");
	
	function markerEvent(i){
		
		var iwContent = '<div style="padding:5px; text-align: center; font-size: 10px;">'+ lampList[i].dongInfo.dong_name + " " + lampList[i].dongSubInfo.dong_sub_name + " " + lampList[i].install_street_address + '</div>';
		var infowindow = new kakao.maps.InfoWindow({
			content: iwContent
		});
		
		kakao.maps.event.addListener(markers[i], 'mouseover', function() {
			infowindow.open(map, markers[i]);
		});
		
		kakao.maps.event.addListener(markers[i], 'mouseout', function() {
			infowindow.close();
		});
		
		kakao.maps.event.addListener(markers[i], 'click', function() {
			$('#lampTable td').css("background-color", "");
			customOverlay.setMap(null);
			map.setCenter(new kakao.maps.LatLng(lampList[i].latitude, lampList[i].longitude));
			customOverlay = new kakao.maps.CustomOverlay({
				position: new kakao.maps.LatLng(lampList[i].latitude, lampList[i].longitude),
				content: content
			});
			customOverlay.setMap(map);
			
			dong_name = lampList[i].dongInfo.dong_name;
			dong_sub_name = lampList[i].dongSubInfo.dong_sub_name;
			management_num = lampList[i].management_num;
			
			$('#management_num').text(lampList[i].management_num);
			$('#fullAddr').text(lampList[i].dongInfo.dong_name + " " + lampList[i].dongSubInfo.dong_sub_name + " " + lampList[i].install_street_address);
			$('#tel_pole_num').text(lampList[i].telegraph_pole_num);
			$('#lat').text(lampList[i].latitude);
			$('#lon').text(lampList[i].longitude);
			$('#type').text(lampList[i].pole_type);
			$('#watt').text(lampList[i].wattage);
			$('#kr_num').text(lampList[i].kepco_num);
			
			if(lampList[i].thumbnail_photo2) $('#img1').attr('src', '/img/' + lampList[i].thumbnail_photo2);
			if(lampList[i].thumbnail_photo3) $('#img2').attr('src', '/img/' + lampList[i].thumbnail_photo3);
			if(lampList[i].thumbnail_photo4) $('#img3').attr('src', '/img/' + lampList[i].thumbnail_photo4);
		
		});
		
	}
	
	
	$('#printBtn').click(function() {
		if($('#kr_num').text() != ""){			
			var win = window.open("./print?management_num=" + management_num + "&dong_name=" + dong_name + "&dong_sub_name=" +dong_sub_name);
		}else{
			alert("램프를 선택하여 주세요.");
		}
	});
});