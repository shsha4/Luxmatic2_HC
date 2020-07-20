<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page session="false" %>
<html>
<head>
<title>DetailPage</title>
<%@include file="/resources/commons/cdn.jsp" %>
<script type="text/javascript" src="resources/js/searchForm.js"></script>
<script type="text/javascript" src="resources/js/listMap.js"></script>
</head>
<body>
<div>
	<div id="navLayout">
		<nav class="navbar navbar-expand" style="background-color: #0d39d0; height: 55px; width: 100%; border-bottom: solid 1px #0d39d0; margin-bottom: 0px;">
			<img src="resources/images/tp_logo.gif" />
		</nav>
	</div>

	<div id="listLayout" style="width:20%;  top:55px; position:absolute; height:94%; border-right: solid 1px #0d39d0; background-color: #f7f7f7;">
		<div class="box-body" style="overflow: auto; height:80%;">
			<table id="lampTable" class="table table-striped text-center" style="font-size:12px; margin-bottom: 0px;">
				<thead style="background-color:#f6f6f6; font-weight: bold; font-size: 14px;">
					<tr><td>관리번호</td><td>면</td><td>리</td></tr>
				</thead>
				<tbody>
					<c:forEach items="${lamp }" var="lamp">
						<tr><td>${lamp.management_num}</td><td>${lamp.dongInfo.dong_name}</td><td>${lamp.dongSubInfo.dong_sub_name }</td></tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="box-footer">
			<div class="text-center" style="font-size:12px;">
				<ul class="pagination">
					<c:if test="${pageMaker.prev }">
						<li><a href="./list${pageMaker.makeSearch(pageMaker.startPage - 1) }">이전</a></li>
					</c:if>
					<c:forEach begin="${pageMaker.startPage }" end="${pageMaker.endPage }" var="idx">
						<li <c:out value="${pageMaker.cri.page == idx ? 'class=active' : '' }"/>>
							<a href="./list${pageMaker.makeSearch(idx) }">${idx }</a>
						</li>
					</c:forEach>
					<c:if test="${pageMaker.next && pageMaker.endPage > 0 }">
						<li><a href="./list${pageMaker.makeSearch(pageMaker.endPage + 1) }">다음</a></li>
					</c:if>
				</ul>
			</div>
			<div class="form-group">
				<select class="form-control" id="searchType" style="width: 36%; left: 5%; position: absolute;">
					<option value="0">전체 조회</option>
					<option value="1">면 조회</option>
					<option value="2">리 조회</option>
					<option value="3">지번 조회</option>
					<option value="4">폴번호 조회</option>
				</select>
				<div class="input-group" id="inputGroup" style="display: none; width:55%; left: 44%;">
					<input type="text" class="form-control" id="address" placeholder="지번">
					<input type="text" class="form-control" id="pole_num" placeholder="폴번호">
					<select class="form-control" id="dongName">
						<c:forEach items="${dongName }" var="dong1">
							<option value= "${dong1 }">${dong1 }</option>
						</c:forEach>
					</select>
					<select class="form-control" id="dongSubName">
						<c:forEach items="${dongSubName }" var="dong2" varStatus="status">
							<option value= "${dong2 }">${dong2 }</option>
						</c:forEach>
					</select>
					<span class="input-group-btn">
						<button type="button" class="btn btn-primary btn-flat" id="searchBtn">
							<i class="fa fa-search"></i> 검색
						</button>
					</span>
				</div>
			</div>
		</div>
	</div>
	<div id="mapLayout" style="position: absolute; left: 20%; width: 60%; height: 94%; background-color: #f7f7f7;">
		<div id="map" style="width: 100%; height: 100%;"></div>
	</div>
	<div id="infoLayout" style="position: absolute; left: 80%; width: 20%; height: 94%; border-left:solid 1px #0d39d0; background-color: #f7f7f7;">
		<div style="height: 300px; margin: 3%; width: 95%; left: 10px; font-size: 12px; border: 1px solid #bfbfbf; overflow: auto;">
  			<div class="container" style="width:100%; text-align: center; font-size:14px; font-weight:bold; color: white; background-color: #0d39d0; border : solid 1px #0d39d0;">설치 정보</div>
  			<table class="table table-bordered text-center" style="margin-top:10px; font-size: 12px; font-weight: bold; margin-bottom: 10px;">
  				<tbody>
  					<tr><td>관리 번호</td><td id="management_num" colspan="3" style="color:#0189F3;"></td></tr>
  					<tr><td>주 소 </td><td id="fullAddr" colspan="3" style="color:#0189F3;"></td></tr>
  					<tr><td>폴 번호</td><td id="tel_pole_num" colspan="3" style="color:#0189F3;"></td></tr>
  					<tr><td>위도</td><td id="lat" style="color:#0189F3;"></td><td>경도</td><td id="lon" style="color:#0189F3;"></td></tr>
  					<tr><td>타입</td><td id="type" style="color:#0189F3;"></td><td>소비 전력</td><td id="watt" style="color:#0189F3;"></td></tr>
  					<tr><td colspan="2">한전주 고유 번호</td><td id="kr_num" colspan="2" style="color:#0189F3;"></td></tr>
  				</tbody>
  			</table>
  			<button id="printBtn" class="btn btn-success" style="width: 100%;">인쇄</button>
  		</div>
		<div style="height: 560px; margin: 3%; width: 95%; left: 10px; font-size: 12px; border: 1px solid #bfbfbf; overflow: auto;">
  			<div style="width:98%; height: 180px; border: solid 1px #0d39d0; margin:1%;">
  				<img id="img1" style="width:100%; height:100%;" onerror="this.src='resources/images/noimage.gif'"/>
  			</div>
  			<div style="width:98%; height: 180px; border: solid 1px #0d39d0; margin:1%;">
  				<img id="img2" style="width:100%; height:100%;" onerror="this.src='resources/images/noimage.gif'"/>
  			</div>
  			<div style="width:98%; height: 180px; border: solid 1px #0d39d0; margin:1%;">
  				<img id="img3" style="width:100%; height:100%;"  onerror="this.src='resources/images/noimage.gif'"/>
  			</div>
  		</div>
	</div>
</div>
<script type="text/javascript">
	var type = "${pageMaker.cri.searchType}";
	var keyword = "${pageMaker.cri.keyword}";
	var lampList = ${lampList};
</script>
</body>
</html>
