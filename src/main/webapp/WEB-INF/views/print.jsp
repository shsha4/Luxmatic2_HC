<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PrintPage</title>
<%@include file="/resources/commons/cdn.jsp" %>
<link rel="stylesheet" href="resources/css/print.css">
</head>
<body>
	<div class="paper">
		<div class="content">
			<div style="width:100%; height:100%; border:1px solid black">
				<div class="container" style="width:100%; text-align: center; font-size:14px; font-weight:bold; color: white; background-color: #0d39d0; border : solid 1px #0d39d0;">설치 정보</div>
  					<table class="table table-bordered text-center" style="margin-top:10px; font-size: 12px; font-weight: bold; margin-bottom: 10px;">
  						<tbody>
  							<tr><td>관리 번호</td><td colspan="3" style="color:#0189F3;">${lamp.management_num }</td></tr>
  							<tr><td>주 소 </td><td colspan="3" style="color:#0189F3;">${lamp.dongInfo.dong_name} ${lamp.dongSubInfo.dong_sub_name } ${lamp.install_street_address } </td></tr>
  							<tr><td>폴 번호</td><td colspan="3" style="color:#0189F3;">${lamp.telegraph_pole_num }</td></tr>
  							<tr><td>위도</td><td style="color:#0189F3;">${lamp.latitude }</td><td>경도</td><td  style="color:#0189F3;">${lamp.longitude }</td></tr>
  							<tr><td>타입</td><td  style="color:#0189F3;">${lamp.pole_type }</td><td>소비 전력</td><td  style="color:#0189F3;">${lamp.wattage}</td></tr>
  							<tr><td colspan="2">한전주 고유 번호</td><td id="kr_num" colspan="2" style="color:#0189F3;">${lamp.kepco_num}</td></tr>
  						</tbody>
  					</table>
  					
				<div id="imgLayout" style="height: 25%; width: 100%; text-align: center;">
					<img  src="resources/am01/${lamp.thumbnail_photo2 }" onerror="this.remove ? this.remove() : this.removeNode();" style="width: 99%; height: 100%; border: solid 1px #0d39d0;">
					<img  src="resources/am01/${lamp.thumbnail_photo3 }" onerror="this.remove ? this.remove() : this.removeNode();" style="width: 99%; height: 100%; border: solid 1px #0d39d0; margin-top: 5px;">
					<img  src="resources/am01/${lamp.thumbnail_photo4 }" onerror="this.remove ? this.remove() : this.removeNode();" style="width: 99%; height: 100%; border: solid 1px #0d39d0; margin-top: 5px;">
				</div> 
			</div>
		</div>
	</div>
<script type="text/javascript">
	$(document).ready(function() {
		window.print();
	});
</script>
</body>
</html>