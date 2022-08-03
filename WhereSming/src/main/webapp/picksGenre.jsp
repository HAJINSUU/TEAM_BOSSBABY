<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="Template Mo">
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css"
	integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />

<title>Where?Sming</title>

<!-- Bootstrap core CSS -->
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Additional CSS Files -->
<link rel="stylesheet" href="assets/css/fontawesome.css">
<link rel="stylesheet" href="assets/css/templatemo-edu-meeting.css">
<link rel="stylesheet" href="assets/css/owl.css">
<link rel="stylesheet" href="assets/css/lightbox.css">

<style>
@import url('https://fonts.googleapis.com/css?family=Lobster');

.background {
	height: 3000px;
	background-color: #181818;
}

body::-webkit-scrollbar {
	width: 15px; /* 스크롤바의 너비 */
}

body::-webkit-scrollbar-thumb {
	height: 20%; /* 스크롤바의 길이 */
	background: #FFBB00; /* 스크롤바의 색상 */
	border-radius: 10px;
}

body::-webkit-scrollbar-track {
	background: #181818; /*스크롤바 뒷 배경 색상*/
}

/* 장르 드롭다운바 */
.dropbtn {
	padding: 16px;
	border: none;
	cursor: pointer;
	z-index: 2;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	margin-top: 8px;
	margin-left: -55px;
	display: none;
	position: absolute;
	background-color: rgba(122, 123, 116, 0.72);
	min-width: 150px;
	border-radius: 5px;
}

.dropdown-content a {
	color: #fff;
	font-weight: 400;
	font-size: 13px;
	padding: 10px 16px;
	text-decoration: none;
	display: block;
	border-radius: 5px;
}

.dropdown-content a:hover {
	color: #fff;
	font-weight: 600;
	background-color: #FFBB00;
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: #181818;
}

/* 장르별 추천리스트 */
.container {
	width: 1320px;
	margin-left: 370px;
	padding-bottom: 30px;
}

.flex {
	width: 1320px;
	display: flex;
	flex-direction: row;
	flex-wrap: wrap;
	justify-content: flex-start;
	align-items: flex-start;
	align-content: stretch;
}

.sizing {
	border-radius: 8px;
	padding: 5px;
}

.portfolio-bg {
	border-radius: 10px;
}

.portfolio {
	border-radius: 8px;
	transform: scale(1);
	-webkit-transform: scale(1);
	-moz-transform: scale(1);
	-ms-transform: scale(1);
	-o-trandsition: all 0.3s ease-in-out;
}

.portfolio:hover {
	transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-moz-transform: scale(1.1);
	-ms-transform: scale(1.1);
	-o-trandsition: scale(1.1);
}

.b {
	font-weight: 500;
	font-size: 15px;
	color: #FFBB00;
}

#nic {
	font-size: 14px;
}

/* 새슬라이더 */
img {
	width: 130%;
	height: 130%;
	border-radius: 8px;
}

.slider {
	width: 100%;
}

.slider .slick-slide {
	margin: 10px;
}

.slick-prev:before, .slick-next:before {
	color: #444444;
}

.texts {
	color: #FFBB00;
	font-size: 20px;
	font-weight: 900;
}

.top-left {
	position: absolute;
	font-size: 50px;
	font-weight: 300;
	top: 18px;
	left: 16px;
	color: white;
}

.re {
	font-weight: 550;
	color: #fff;
	margin-left: 15px;
	font-size: 25px;
	display: inline;
}

.inline {
	font-weight: 550;
	font-size: 23px;
	color: #fff;
	display: inline;
}

.inline:hover {
	font-weight: 550;
	font-size: 23px;
	color: #fff;
	display: inline;
}
</style>

</head>

<body>
	<!-- 실시간 채팅  -->
	<%@include file="chat.jsp"%>
	<!-- 상단top nav -->
	<%@include file="nav.jsp"%>

	<section class="meetings-page background" id="meetings">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="row">

						<!-- start 인기최신장르 버튼 -->
						<div class="col-lg-12">
							<div class="filters">
								<ul>
									<li data-filter="*"
										onclick="location.href='http://localhost:8083/MavenSample/picks.jsp';">인기</li>
									<li data-filter="*"
										onclick="location.href='http://localhost:8083/MavenSample/picks.jsp';">최신</li>
									<!-- <li data-filter="*">장르 <i class="fa-solid fa-chevron-down"></i></li> -->
									<li data-filter="*" class="active dropdown dropbtn">장르 <i
										class="fa-solid fa-chevron-down"></i>
										<div class="dropdown-content">
											<a href="#kid" id="kid">어린이&가족</a> 
											<a href="#ani" id="ani">애니메이션</a>
											<a href="#ac" id="ac">액션</a> 
											<a href="#co" id="co">코미디</a>
											<a href="#ro" id="ro">로맨스</a> 
											<a href="#th" id="th">스릴러</a>
											<a href="#ho" id="ho">호러</a> 
											<a href="#sf" id="sf">SF</a> 
											<a href="#fa" id="fa">판타지</a> 
											<a href="#cri" id="cri">범죄</a>
											<a href="#dra" id="dra">드라마</a> 
											<a href="#doc" id="doc">다큐멘터리</a>
											<a href="#mus" id="mus">뮤지컬</a>
										</div>
									</li>

								</ul>

							</div>
						</div>
						<!-- end 인기최신장르 버튼 -->

						<!-- start 폴더생성 -->
						<section>

							<!-- 장르1 -->
							<div class="container" style="padding-top: 80px;">
								<div class="row">
									<div class="col-lg-12">

										<jsp:useBean id="SearchingDAO"
											class="com.wheresming.search.SearchingDAO" />
										<c:set var="RecommendList"
											value="${SearchingDAO.recommend(selectPoster.mv_genre) }" />

										<a href="#kid" class="inline">ㅤ어린이&가족</a>
										<div class="slider">

											<%-- <form action="SearchMovie" method="get" id="movie">
												<input id="mv_seq" name="mv_seq" type="hidden">
												<c:forEach items="${RecommendList}" var="r"
													varStatus="status" begin="1" end="10">

													<div class="portfolio-item col-md-7 sizing">
														<div class="portfolio-bg">
															<div class="portfolio" onclick="imgclick('${r.mv_seq}')">
																<a href="http://www.naver.com" target="_blank">
																	<div class="tt-overlay"></div>
																</a> <img src="${r.mv_image }" alt="image">
															</div>
														</div>
													</div>

												</c:forEach>
											</form> --%>
										</div>
										<!-- Slider 끝 -->
									</div>
									<!-- 추천영화 div리스트끝 -->
								</div>
							</div>

							
							
							
					</div>
				</div>
			</div></section>


	<!-- Scripts -->
	<!-- Bootstrap core JavaScript -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<script src="assets/js/isotope.min.js"></script>
	<script src="assets/js/owl-carousel.js"></script>
	<script src="assets/js/lightbox.js"></script>
	<script src="assets/js/tabs.js"></script>
	<script src="assets/js/isotope.js"></script>
	<script src="assets/js/video.js"></script>
	<script src="assets/js/slick-slider.js"></script>
	<script src="assets/js/custom.js"></script>

	<script>

    //according to loftblog tut
    $('.nav li:first').addClass('active');

    var showSection = function showSection(section, isAnimate) {
      var
        direction = section.replace(/#/, ''),
        reqSection = $('.section').filter('[data-section="' + direction + '"]'),
        reqSectionPos = reqSection.offset().top - 0;

      if (isAnimate) {
        $('body, html').animate({
          scrollTop: reqSectionPos
        },
          800);
      } else {
        $('body, html').scrollTop(reqSectionPos);
      }

    };

    var checkSection = function checkSection() {
      $('.section').each(function () {
        var
          $this = $(this),
          topEdge = $this.offset().top - 80,
          bottomEdge = topEdge + $this.height(),
          wScroll = $(window).scrollTop();
        if (topEdge < wScroll && bottomEdge > wScroll) {
          var
            currentId = $this.data('section'),
            reqLink = $('a').filter('[href*=\\#' + currentId + ']');
          reqLink.closest('li').addClass('active').
            siblings().removeClass('active');
        }
      });
    };

    $('.main-menu, .responsive-menu, .scroll-to-section').on('click', 'a', function (e) {
      e.preventDefault();
      showSection($(this).attr('href'), true);
    });

    $(window).scroll(function () {
      checkSection();
    });
  </script>
</body>

</html>